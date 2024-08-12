#!/usr/bin/python

# *********************************************
# Created by Krzysztof Fryzlewicz, Marek Lipert
#            Ihnat Moisieiev, Bartosz Gnacek
#                   of Spinney
#                 www.spinney.io
#
# All commercial rights to this software belong to
#                  Highsoft AS
#              www.highcharts.com

import json
import os
import re
import sys
from ast import literal_eval

from bs4 import BeautifulSoup

# from HTMLParser import HTMLParser

reload(sys)
sys.setdefaultencoding('utf-8')

structure = dict()
files = list()
bridge = set()
options = list()
classes = dict()
comments = dict()
types = dict()
unknown_types_tree = set()

fileLicense = "/**\n* (c) 2009-2018 Highsoft AS\n*\n* License: www.highcharts.com/license\n" \
              "* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/\n" \
              "* In case of questions, please contact sales@highsoft.com\n*/\n\n"


class HIChartsClass:
    def __init__(self, name, data_type, description, demo, values, defaults, products, extends, exclude, info, parent):
        self.name = name
        self.data_type = data_type
        self.description = description
        self.demo = demo
        self.values = values
        self.defaults = defaults
        self.products = products
        self.extends = extends
        self.exclude = exclude
        self.properties = list()
        self.not_highcharts_properties = list()
        self.comment = None
        self.checkedExtends = False
        self.info = info
        self.parent = parent
        self.kind = ""

        if self.description:
            self.comment = "\n{0}\n".format(self.description)
            self.comment = clean_comment(self.comment)
            if self.defaults:
                self.comment += " <br><br><b>default:</b><br><br>&ensp;{0}".format(self.defaults)
            self.comment += "\t*/\n"

    def update(self, data_type, description, demo, values, defaults, products, extends, exclude):
        if self.data_type is None:
            self.data_type = data_type

        if self.description is None:
            self.description = description

        if self.demo is None:
            self.demo = demo

        if self.values is None:
            self.values = values

        if self.defaults is None:
            self.defaults = defaults

        if self.products is None:
            self.products = products

        if self.extends is None:
            self.extends = extends

        if self.exclude is None:
            self.exclude = exclude

        if self.description:
            self.comment = "/**\n* description: {0}\n".format(self.description)
            if self.demo:
                self.comment += "* demo: {0}".format(self.demo)
            if self.values:
                self.comment += "* accepted values: {0}\n".format(self.values)
            self.comment = clean_comment(self.comment)
            if self.defaults:
                self.comment += "* default: {0}\n".format(self.defaults)
            self.comment += "*/\n"

    def add_property(self, variable):
        self.properties.append(variable)

    def remove_property(self, variable):
        self.properties.remove(variable)

    def add_not_highcharts_property(self, variable):
        self.not_highcharts_properties.append(get_last(variable))


def clean_comment(comment):
    comment = comment.replace('\n', ' ').replace('  ', ' ').replace('.  ', '. ').replace(
        '(//code.highcharts.com/',
        '(https://code.highcharts.com/').replace(
        '[code.highcharts.com/', '[https://code.highcharts.com/')
    comment = re.sub('(\(|\[)[\w\.*/ *: *\-*]+[\.\-/_]\s+[\w\.*/ *: *\- *]+(\)|\])',
                     lambda s: s.group(0).replace(' ', ''), comment)
    comment = re.sub('\[(.+?)\]\((.+?)\)',
                     lambda s: s.group(0) if s.group(2).startswith("http") else s.group(0).replace(
                         s.group(0),
                         '`{}`'.format(
                             s.group(1))),
                     comment)
    comment = re.sub('\((.+?)\)\[(.+?)\]', r'[\1](\2)', comment)
    comment = comment.replace('`<', '__x__').replace('>`', '__y__')
    soup = BeautifulSoup(comment, 'html.parser')
    comment = soup.get_text().replace('__x__', '`<').replace('__y__', '>`')
    comment = "\t/**\n{0}\n".format(comment)
    return comment


class Node:
    def __init__(self, name, parent, info):
        self.name = name
        self.info = info
        self.children = list()
        self.parent = parent

    def add_child(self, child):
        self.children.append(child)

    def update(self, parent, info):
        self.parent = parent
        self.info = info


hc_types = {
    "Number": 'Number',
    "Boolean": 'Boolean',
    "Color": 'HIColor',
    "String": 'String',
    "Object": 'Object',
    "Function": 'HIFunction',
    "Array<Number>": 'ArrayList<Number>',
    "Array<Object>": 'ArrayList',
    "Array": 'ArrayList',
    "Array<String>": 'ArrayList<String>',
    "Boolean|Object": 'Object /* Boolean|Object */',
    "String|Number": 'Object /* String|Number */',
    "Array<Array>": 'ArrayList<ArrayList>',
    "CSSObject": 'HashMap<String,String>',
    "Array<Color>": 'ArrayList<HIColor>',
    "Array<Object|Array|Number>": 'ArrayList /* <Data|Number|ArrayList> */',
    "Array<String|Number>": 'ArrayList /* <String|Number> */',
    "Array<Object|Number>": 'ArrayList /* <Object|Number> */',
    "Array<Object|Array>": 'ArrayList /* <Object|ArrayList> */',
    "Number|String": 'Object /* Number|String */',
    "String|HTMLElement": 'Object',
    "Array<Array<Mixed>>": 'ArrayList<ArrayList>',
    "String|Object": 'Object /* String|Object */',
    "Mixed": 'Object',
    "Number|Boolean": 'Object /* Boolean|String */',
    "": 'Object',
    "plotOptions.series.states": 'Object',
    "Boolean|String": 'Object /* Boolean|String */',
    # nowe typy
    "Object|Boolean": 'Object /* Boolean|Object */',
    "String|Array.<String>": 'Object',
    "Array.<String>": 'ArrayList<String>',
    "function": 'HIFunction',
    "String|function": 'String',
    "Array.<Object>": 'ArrayList',
    "Array.<Number>": 'ArrayList<Number>',
    "Array.<Array>": 'ArrayList<ArrayList>',
    "Array.<Color>": 'ArrayList<HIColor>',
    "Array.<Object|Array|Number>": 'ArrayList /* <Object|Number|ArrayList> */',
    "Array.<String|Number>": 'ArrayList /* <String|Number> */',
    "Array.<Object|Number>": 'ArrayList',
    "Array.<Object|Array>": 'ArrayList',
    "Array.<Array<Mixed>>": 'ArrayList<ArrayList>',
    "Array.<(Object|Number)>": 'ArrayList',
    "Array.<(String|Number)>": 'ArrayList /* <String|Number> */',
    "Array.<(Object|Array)>": 'ArrayList',
    "String|Array.<Object>": 'String',
    "String|undefined": 'String',
    "Array.<String>|Array.<Object>": 'ArrayList',
    "String|Number|function": 'Object',
    "Array.<(Object|Array|Number)>": 'ArrayList /* <Object|Number|ArrayList> */',
    "String|null": 'String',
    "Array.<Array<Mixed>>": 'ArrayList<ArrayList>',
    "Array.<Array.<Mixed>>": 'ArrayList<ArrayList>',
    "Object|Number": 'Object /* Object|Number */',
    "umber": 'Number',
    "function|null": 'HIFunction',
    # 6.0.7
    "Undefined|Number": 'Number',
    # 6.1
    "Bool": 'Boolean',
    # 6.1.1
    "AnimationOptions|Boolean": 'Object',
    "Boolean|AnimationOptions": 'Object',
    "Array.<number>": 'ArrayList<Number>',
    # 6.1.2
    "number": 'Number',
    "string": 'String',
    "boolean": 'Boolean',
    "*": 'Object',
    "Array.<*>": 'ArrayList',
    "Array.<Array.<(string|Array.<number>)>>": 'ArrayList<ArrayList>',
    "Array.<string>": 'ArrayList<String>',
    "null|number|string": 'Object /* Number, String */',
    "object": 'Object',
    "Number|String|function": 'Object',
    "Array.<Object>|Array.<String>": 'ArrayList /* <Object, String> */',
    "null|number": 'Number',
    "Array.<number>|number": 'ArrayList<Number>',
    "Boolean|Number": 'Number',
    "number|string": 'Object /* Number, String */',
    # 6.1.4
    "boolean|*": 'Object /* boolean, Object */',
    "number|string|null": 'Object /* Number, String */',
    "boolean|string": 'Object /* boolean, String */',
    "number|null": 'Number',
    "number|Array.<number>": 'ArrayList<Number>',
    "string|number": 'Object /* String, Number */',
    # 6.2.0
    "Array.<(number|string|null)>": 'ArrayList /* <Number, String> */',
    "string|null": 'String',
    "Array.<Array.<number, string>>": 'ArrayList<ArrayList> /* <Number, String> */',
    # tree_namespace
    "number|undefined": 'Number',
    "Array.<(number|string)>": 'ArrayList /* <Number, String> */',
    "false": 'Boolean /* boolean */',
    "undefined": 'Object',
    "null": 'Object',
    "Object|undefined": 'Object',
    "false|Highcharts.XAxisCrosshairOptions|Highcharts.YAxisCrosshairOptions": 'Object',
    "Array.<Point>": 'ArrayList',
    "string|Array.<(number|string)>": 'ArrayList /* <Number, String> */',
    "Highcharts.Dictionary.<function()>": 'HashMap',
    "Highcharts.Dictionary.<(boolean|number|string)>": 'HashMap',
    "Highcharts.Dictionary.<string>": 'HashMap /* <String, String> */',
    # tree
    "Highcharts.PlotSeriesDataLabelsOptions": 'Object',
    "Highcharts.Options": 'HashMap',
    "boolean|Highcharts.ShadowOptionsObject": 'HIShadowOptionsObject /* boolean */',
    "string|Highcharts.SVGDOMElement": 'String',
    "boolean|Highcharts.CSSObject": 'HICSSObject /* boolean */',
    # color fixes
    "Highcharts.ColorString": 'HIColor',
    "Highcharts.ColorString|null": 'HIColor',
    # 7.0.0
    "string|global.HTMLElement": 'String',
    "Array.<Highcharts.Dictionary.<number>>": 'ArrayList',
    "Array.<Array.<*>>": 'ArrayList<ArrayList>',
    "string|Highcharts.GradientColorObject|Highcharts.PatternObject": 'HIColor',
    "Highcharts.FormatterCallbackFunction.<Highcharts.TooltipFormatterContextObject>": 'HIFunction',
    "Highcharts.Dictionary.<*>": 'HashMap',
    "Array.<Array.<string, (Array.<number>|null)>>": 'ArrayList<ArrayList>',
    "string|Highcharts.GradientColorObject": 'HIColor',
    "string|MockPointOptions": 'String',
    "Array.<(string|number)>": 'ArrayList /* <String, Number> */',
    "Highcharts.FormatterCallbackFunction.<Highcharts.SeriesDataLabelsFormatterContextObject>": 'HIFunction',
    "Annotation.ControlPoint.Options": 'Object',
    "Highcharts.FormatterCallbackFunction.<object>": 'HIFunction',
    "boolean|null": 'Boolean',
    "false|number": 'Number',
    "String|function": 'String',
    "*|Array.<*>": 'ArrayList',
    "function|undefined": 'HIFunction',
    "string|undefined": 'String',
    "Highcharts.GradientColorObject": 'HIColor',
    # tree-namespace
    "Array.<Array.<number, string>>|undefined": 'ArrayList<ArrayList>',
    "string|*": 'String',
    "Array.<*>|undefined": 'ArrayList',
    "boolean|undefined": 'Boolean',
    "Array.<number>|undefined": 'ArrayList<Number>',
    "object|undefined": 'Object',
    "boolean|*|undefined": 'Boolean',
    "string|Array.<(number|string)>|undefined": 'ArrayList /* <Number, String> */',
    "Array<number>": 'ArrayList<Number>',
    "boolean|Array.<*>|undefined": 'Object',
    "Array.<function()>|undefined": 'ArrayList<HIFunction>',
    "*|undefined": 'Object',
    "Highcharts.Dictionary.<number>": 'HashMap',
    "Object|*": 'Object',
    # 7.0.1
    "Highcharts.FormatterCallbackFunction.<Highcharts.AxisLabelsFormatterContextObject>": 'HIFunction',
    "Highcharts.FormatterCallbackFunction.<Highcharts.Point>": 'HIFunction',
    "string|Highcharts.HTMLDOMElement": 'String',
    # 7.0.2
    "Array.<(string|Highcharts.GradientColorObject|Highcharts.PatternObject)>": 'ArrayList<String>',
    "string|function": 'String',
    # 7.1.1
    "undefined|number": 'Number',
    "Highcharts.ScreenReaderFormatterCallbackFunction.<Highcharts.Chart>": 'HIFunction',
    "Highcharts.ScreenReaderFormatterCallbackFunction.<Highcharts.Series>": 'HIFunction',
    "Highcharts.ScreenReaderFormatterCallbackFunction.<Highcharts.Point>": 'HIFunction',
    "boolean|number": 'Number',
    "Array.<number>|false": 'ArrayList<Number>',
    "Highcharts.AnnotationsOptions": 'Object',
    "Highcharts.FormatterCallbackFunction.<Highcharts.SankeyNodeObject>": 'HIFunction',
    "Highcharts.FormatterCallbackFunction.<Highcharts.StackItemObject>": 'HIFunction',
    "null|*": 'Object',
    # 7.1.2
    "string|number|function": 'Object',
    "Highcharts.EventCallbackFunction.<Highcharts.Annotation>": 'HIFunction',
    "Highcharts.FormatterCallbackFunction.<Highcharts.BubbleLegendFormatterContextObject>": 'HIFunction',
    # namespace
    "string|function|undefined": 'String',
    "Highcharts.FormatterCallbackFunction.<Highcharts.SankeyNodeObject>|undefined": 'HIFunction',
    "string|boolean|undefined": 'String',
    "string|Highcharts.CSSObject|undefined": 'HICSSObject',
    "string|Highcharts.GradientColorObject|Highcharts.PatternObject|undefined": 'HIColor',
    "boolean|Highcharts.ShadowOptionsObject|undefined": 'HIShadowOptionsObject',
    "boolean|Highcharts.AnimationOptionsObject|undefined": 'HIAnimationOptionsObject',
    "string|Highcharts.SVGAttributes": 'HISVGAttributes',
    # 7.1.3
    "Array.<Array.<number|string|null>>": 'ArrayList<ArrayList>',
    "Highcharts.FormatterCallbackFunction.<(Point|Series)>": 'HIFunction',
    "Array.<(number|string|null), (number|string|null)>": 'ArrayList /* <Number, String> */',
    "Highcharts.EventCallbackFunction.<Highcharts.PlotLineOrBand>": 'HIFunction',
    "Highcharts.FormatterCallbackFunction.<Highcharts.PlotLineOrBand>": 'HIFunction',
    "string|null|undefined": 'String',
    # 7.2.0
    "number|string|boolean": 'Object /* Number, String */',
    # 8.0
    "Array.<(*)>": 'ArrayList',
    # 8.0.4
    "Array.<(string|*)>": 'ArrayList',
    # 8.1.1
    "Array.<Array.<Highcharts.SVGPathCommand, number?, number?, number?, number?, number?, number?, number?>>": 'ArrayList',
    "string|Array.<Array.<string, number?, number?, number?, number?, number?, number?, number?>>|undefined": 'ArrayList',
    "Highcharts.FormatterCallbackFunction.<Series>": 'HIFunction',
    # 8.2.0
    "string|Array.<(Array.<string>|Array.<string, number>|Array.<string, number, number>|Array.<string, number, number, number, number>|Array.<string, number, number, number, number, number, number>|Array.<string, number, number, number, number, number, number, number>)>|undefined": 'ArrayList /* <String, Number> */',
    "Array.<Array.<number, string|Highcharts.GradientColorObject|Highcharts.PatternObject>>": 'ArrayList',
    #11.1.0
    "'default'|'curved'|'straight'": 'String',
    "Highcharts.SeriesPieDataLabelsOptionsObject": 'Object',
    "function|object": 'Object',
    "number|string|Highcharts.BorderRadiusOptionsObject": 'HIBorderRadiusOptionsObject',
    "string|Highcharts.SynthPatchOptionsObject": 'HISynthPatchOptionsObject',
    "DataLabelTextPathOptions": 'HIDataLabelTextPathOptions',
    "OrganizationDataLabelsFormatterCallbackFunction": 'HIFunction',
    "Array.<string|Highcharts.AnnotationMockPointOptionsObject|function>": 'ArrayList<HIAnnotationMockPointOptionsObject *>',
    "string|Highcharts.AnnotationMockPointOptionsObject|function": 'HIAnnotationMockPointOptionsObject',
    "Highcharts.AnnotationsOptions": 'HIAnnotationsOptions',
    "boolean|object": 'Object',
    "Array.<string>|undefined": 'ArrayList<String>',
    "string|number|function|object": 'Object',
    "string|Highcharts.SVGAttributes|undefined": 'HISVGAttributes',
    "Highcharts.DataLabelsOptions": 'HIDataLabelsOptions',
    "Highcharts.PointMarkerOptionsObject": 'HIPointMarkerOptionsObject',
    "Array.<(Array.<string>|Array.<string, number>|Array.<string, number, number>|Array.<string, number, number, number, number>|Array.<string, number, number, number, number, number, number>|Array.<string, number, number, number, number, number, number, number>)>": 'ArrayList',
    # 11.2.0
    "'from'|'gradient'|'to'": 'String',
    "'top'|'center'|'bottom'": 'String',
    "Array.<(Array.<(number|string), number>|Array.<(number|string), number, number>|*)>": 'ArrayList',
    # 11.3.0
    "Array.<('string'|'number'|'float'|'date')>": 'ArrayList',
    "number|'auto'": 'Number',
    # 11.4.0
    "'left'|'right'": 'String',
    # 11.4.3
    "function|*": 'HIFunction',
    "string|number|function|*": 'Object'
}


def get_java_type(x):
    return hc_types[str(x)]


def upper_first(x):
    r = x[:1].upper() + x[1:]
    return r


def get_last(x):
    n = x.split(".")
    last = n[len(n) - 1]
    if last == 'description':
        last = 'definition'
    return last


def remove_duplicates(list_of_elements):
    unique_list = []

    for elem in list_of_elements:
        if elem not in unique_list:
            unique_list.append(elem)

    return unique_list


def create_name(source):
    name = source.split(".")[-1]
    return name


def create_java_file(name):
    if "<T>" in name:
        return
    source = structure[name]
    if source.properties:
        java = format_to_java(name, source)
        if java:
            filename = "Android/hichartsclasses/HI{0}.java".format(upper_first(create_name(name)))
            files.append(upper_first(create_name(name)))
            with open(filename, "w") as java_file:
                java_file.write(java)


def added_new_properties(class_name, source):
    isUpdated = False
    isFirstMatch = True

    if class_name in classes:
        isFirstMatch = False
        class_properties = classes[class_name]
        for property in source.properties:
            isExists = False
            for class_property in class_properties:
                if get_last(property.name) == get_last(class_property.name):
                    isExists = True
                    if not class_property.properties and property.properties:
                        class_property.properties = property.properties
                        isUpdated = True
                    if class_property.data_type is None and property.data_type is not None:
                        class_property.data_type = property.data_type
                        isUpdated = True
            if not isExists:
                class_properties.append(property)
                isUpdated = True
        classes[class_name] = class_properties
    else:
        classes[class_name] = source.properties

    if not isUpdated and not isFirstMatch:
        return False

    return True


def field_in_parent(field, source):
    in_parent = False
    if source.extends:
        if source.extends == "series":
            extends_name = "plotOptions.series"
            for i in structure[extends_name].properties:
                if get_last(field.name) == get_last(i.name):
                    in_parent = True

        for i in structure[source.extends].properties:
            if get_last(field.name) == get_last(i.name):
                in_parent = True
    return in_parent


def format_to_java(name, source):
    class_name = "HI" + upper_first(create_name(name))

    imports = ""
    declaration = "\n"
    fields = ""
    constructor = ""
    methods = ""
    javatext = ""
    colorAdded = False
    import_hi_set = set()
    import_hi_string = ""

    imports += "package com.highsoft.highcharts.common.hichartsclasses;\n"
    imports += "\nimport java.util.HashMap;"
    imports += "\nimport java.util.HashMap;"
    imports += "\nimport java.util.ArrayList;"
    # imports += "\nimport java.util.Observable;"
    # imports += "\nimport java.util.Observer;"
    imports += "\nimport com.highsoft.highcharts.core.HIFunction;"
    imports += "\nimport com.highsoft.highcharts.core.HIFoundation;"

    if source.extends:
        if class_name in comments:
            declaration += comments[class_name]
        elif source.comment:
            declaration += source.comment
            x = name.split(".")
            if len(x) == 2 and x[0] == "plotOptions":
                pass
            else:
                comments[class_name] = source.comment

    if not added_new_properties(class_name, source):
        return None

    # SETTERS changed constructor for series type
    if source.extends is not None:
        declaration += "\npublic class {0}".format(class_name)
        declaration += " extends {0}".format("HI" + upper_first(source.extends)) + " {\n"
        constructor += "\n\n\tpublic {0}".format(class_name) + "() {\n"
        constructor += "\t\tsuper(); \n"
        # constructor += "\t\tthis.type = \"{0}\";".format(create_name(name))
        constructor += "\t\tthis.setType(\"{0}\");".format(create_name(name))
        constructor += "\n\t}\n"
    else:
        declaration += "public class {0}".format(class_name)
        constructor += "\n\n\tpublic {0}".format(class_name) + "() {\n\n\t}\n"  # remove closing bracket
        # declaration += " extends Observable implements HIChartsJSONSerializable { \n\n"
        declaration += " extends HIFoundation { \n\n"
        # declaration += " implements HIChartsJSONSerializable { \n\n"

    # SETTERS observer implementation

    # constructor += "\n\n\t private Observer updateObserver = new Observer() {" \
    #                "\n\t\t@Override" \
    #                "\n\t\tpublic void update(Observable observable, Object o) {" \
    #                "\n\t\t\tsetChanged();" \
    #                "\n\t\t\tnotifyObservers();" \
    #                "\n\t\t}" \
    #                "\n\t};\n\n"

    setter_start = "\tpublic void set{0}({1} {2}) {{" \
                   "\n\t\tthis.{3} = {4};"
    setter_mid = "\n\t\tthis.{0}.addObserver(updateObserver);"
    setter_end = "\n\t\tthis.setChanged();" \
                 "\n\t\tthis.notifyObservers();" \
                 "\n\t}"
    getter = "\n\n\tpublic {0} get{1}(){{ return {2}; }}\n\n"

    # SETTERS all fields changed to private, added setters and getters
    for field in classes[class_name]:
        # print(class_name + " " + get_last(field.name))
        if field_in_parent(field, source):
            continue

        # if field.comment:
        #     fields += "\n{0}".format(field.comment)

        enum_code = generate_enum_java_from_values(field)
        if enum_code:
            enum_setter = generate_enum_setter(field)
            fields += enum_code
            fields += enum_setter

        if field.data_type:
            if "Object" in str(get_java_type(field.data_type)) and "List" not in str(
                    get_java_type(field.data_type)) and not \
                    structure[field.name].properties:
                fields += "\tprivate {0} {1};\n".format(get_java_type(field.data_type),
                                                        get_last(field.name))

                if field.comment:
                    fields += "{0}".format(field.comment)
                fields += setter_start.format(
                    upper_first(get_last(field.name)),
                    get_java_type(field.data_type),
                    get_last(field.name),
                    get_last(field.name),
                    get_last(field.name)
                )
                # fields += setter_mid.format(get_last(field.name))
                fields += setter_end
                fields += getter.format(
                    get_java_type(field.data_type),
                    upper_first(get_last(field.name)),
                    get_last(field.name)
                )
            # pointless? no >.data in tree.json
            elif "List" in str(get_java_type(field.data_type)) and field.name.endswith(">.data"):
                fields += "\tprivate {0} {1};\n".format(get_java_type(field.data_type),
                                                        get_last(field.name))

            elif "List" in str(get_java_type(field.data_type)) and structure[
                field.name].properties and 'HI' not in get_java_type(field.data_type):
                fields += "\tprivate {0} <{1}> {2};\n".format(
                    get_java_type(field.data_type),
                    "HI" + upper_first(create_name(field.name)),
                    get_last(field.name))
                if field.comment:
                    fields += "{0}".format(field.comment)
                fields += setter_start.format(
                    upper_first(get_last(field.name)),
                    get_java_type(field.data_type),
                    get_last(field.name),
                    get_last(field.name),
                    get_last(field.name)
                )
                # fields += setter_mid.format(get_last(field.name))
                fields += setter_end
                fields += getter.format(
                    get_java_type(field.data_type),
                    upper_first(get_last(field.name)),
                    get_last(field.name)
                )
                # imports += "\nimport com.highsoft.highcharts.Common.{0};\n".format("HI" + upper_first(create_name(field.name)))  # check
            elif "List" in str(get_java_type(field.data_type)):
                fields += "\tprivate {0} {1};\n".format(get_java_type(field.data_type),
                                                        get_last(field.name))
                if field.comment:
                    fields += "{0}".format(field.comment)
                fields += setter_start.format(
                    upper_first(get_last(field.name)),
                    get_java_type(field.data_type),
                    get_last(field.name),
                    get_last(field.name),
                    get_last(field.name)
                )
                # fields += setter_mid.format(get_last(field.name))
                fields += setter_end
                fields += getter.format(
                    get_java_type(field.data_type),
                    upper_first(get_last(field.name)),
                    get_last(field.name)
                )
                hi_match = re.search(r'<(HI[A-Z]{1}[a-zA-Z]+) \*>',
                                     get_java_type(field.data_type))  # dodane
                if hi_match:
                    import_hi_set.add(hi_match.group(1))
            elif field.data_type == "Object" or field.data_type == "object":
                if structure[field.name].properties:
                    fields += "\tprivate {0} {1};\n".format(
                        "HI" + upper_first(create_name(field.name)),
                        get_last(field.name))
                    if field.comment:
                        fields += "{0}".format(field.comment)
                    fields += setter_start.format(
                        upper_first(get_last(field.name)),
                        "HI" + upper_first(create_name(field.name)),
                        get_last(field.name),
                        get_last(field.name),
                        get_last(field.name)
                    )
                    fields += setter_mid.format(get_last(field.name))
                    fields += setter_end
                    fields += getter.format(
                        "HI" + upper_first(create_name(field.name)),
                        upper_first(get_last(field.name)),
                        get_last(field.name)
                    )
                else:
                    fields += "\tprivate Object {0};\n".format(get_last(field.name))
                    if field.comment:
                        fields += "{0}".format(field.comment)
                    fields += setter_start.format(
                        upper_first(get_last(field.name)),
                        get_java_type(field.data_type),
                        get_last(field.name),
                        get_last(field.name),
                        get_last(field.name)
                    )
                    # fields += setter_mid.format(get_last(field.name))
                    fields += setter_end
                    fields += getter.format(
                        get_java_type(field.data_type),
                        upper_first(get_last(field.name)),
                        get_last(field.name)
                    )

            else:
                if get_java_type(field.data_type) == "HIColor" and not colorAdded:
                    colorAdded = True
                if structure[field.name].properties and 'HI' not in get_java_type(
                        field.data_type):  # added no array
                    fields += "\tprivate {0} {1};\n".format(
                        "HI" + upper_first(create_name(field.name)),
                        get_last(field.name))
                    if field.comment:
                        fields += "{0}".format(field.comment)
                    fields += setter_start.format(
                        upper_first(get_last(field.name)),
                        "HI" + upper_first(create_name(field.name)),
                        get_last(field.name),
                        get_last(field.name),
                        get_last(field.name)
                    )
                    fields += setter_mid.format(get_last(field.name))
                    fields += setter_end
                    fields += getter.format(
                        "HI" + upper_first(create_name(field.name)),
                        upper_first(get_last(field.name)),
                        get_last(field.name)
                    )
                else:
                    fields += "\tprivate {0} {1};\n".format(get_java_type(field.data_type),
                                                            get_last(field.name))
                    if field.comment:
                        fields += "{0}".format(field.comment)
                    fields += setter_start.format(
                        upper_first(get_last(field.name)),
                        get_java_type(field.data_type),
                        get_last(field.name),
                        get_last(field.name),
                        get_last(field.name)
                    )
                    # fields += setter_mid.format(get_last(field.name))
                    fields += setter_end
                    fields += getter.format(
                        get_java_type(field.data_type),
                        upper_first(get_last(field.name)),
                        get_last(field.name)
                    )
                    if 'HI' in field.data_type:  # to samo co wyzej
                        import_hi_set.add(get_java_type(field.data_type))
        else:
            if not field.data_type and not structure[field.name].properties:
                fields += "\tprivate Object {0};\n".format(get_last(field.name))
                if field.comment:
                    fields += "{0}".format(field.comment)
                fields += setter_start.format(
                    upper_first(get_last(field.name)),
                    "Object",
                    get_last(field.name),
                    get_last(field.name),
                    get_last(field.name)
                )
                # fields += setter_mid.format(get_last(field.name))
                fields += setter_end
                fields += getter.format(
                    "Object",
                    upper_first(get_last(field.name)),
                    get_last(field.name)
                )
            elif structure[field.name].properties or 'HI' in get_java_type(field.data_type):
                name = create_name(field.name)
                fields += "\tprivate {0} {1};\n".format("HI" + upper_first(name), get_last(field.name))
                if field.comment:
                    fields += "{0}".format(field.comment)
                fields += setter_start.format(
                    upper_first(get_last(field.name)),
                    "HI" + upper_first(name),
                    get_last(field.name),
                    get_last(field.name),
                    get_last(field.name)
                )
                fields += setter_mid.format(get_last(field.name))
                fields += setter_end
                fields += getter.format(
                    "HI" + upper_first(name),
                    upper_first(get_last(field.name)),
                    get_last(field.name)
                )
    if colorAdded:
        imports += "\nimport com.highsoft.highcharts.common.HIColor;"
    imports += "\n"

    if class_name in ["HIData", "HISeries"]:
        methods += "\n\tprivate HashMap<String, Object> jsProperties;\n" \
                   "\t/**\n" \
                   "\t * Add a custom property to your chart. Those can be accessible later by HIFunction callbacks.\n" \
                   "\t * @param name the name by which you can access property\n" \
                   "\t * @param value the actual value which can be accessed\n" \
                   "\t */\n" \
                   "\t public void setProperty(String name, Object value) {\n" \
                   "\t\t if(jsProperties == null) jsProperties = new HashMap<>();\n" \
                   "\t\t jsProperties.put(name, value);\n" \
                   "\t}\n"

    methods += "\n\t@Override\npublic HashMap<String, Object> getParams() {\n\n\t\tHashMap<String, Object> params =" \
               " new HashMap<>();\n"
    if source.extends:
        methods += "\t\tparams = super.getParams();\n"
    else:
        methods += "\t\tparams.put(\"_wrapperID\", this.uuid);\n"

    if class_name in ["HIData", "HISeries"]:
        methods += "\n\t\tif (this.jsProperties != null) {\n" \
                   "\t\t\tfor (Map.Entry<String, Object> entry : jsProperties.entrySet()) {\n" \
                   "\t\t\t\tparams.put(entry.getKey(), entry.getValue());\n" \
                   "\t\t\t}\n" \
                   "\t\t}\n"

    for field in classes[class_name]:
        if field_in_parent(field, source):
            pass
        else:
            methods += "\t\tif (this.{0} != null)".format(get_last(field.name)) + " {\n"
            if structure[field.name].data_type:
                if get_java_type(structure[field.name].data_type) == 'HIColor':
                    methods += "\t\t\tparams.put(\"{0}\", this.{1}.getData());\n".format(
                        get_last(field.name),
                        get_last(field.name))
                elif get_java_type(structure[field.name].data_type) == 'ArrayList<HIColor>':
                    imports += "\nimport com.highsoft.highcharts.common.HIColor;"
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"
                    methods += "\t\t\tfor (HIColor hiColor : this.{0})".format(
                        get_last(field.name)) + " {\n"
                    methods += "\t\t\t\tarray.add(hiColor.getData());\n".format(
                        get_last(field.name))
                    methods += "\t\t\t}\n"
                    methods += "\t\t\tparams.put(\"{0}\", array);\n".format(get_last(field.name))
                elif 'List' in str(get_java_type(structure[field.name].data_type)):
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"

                    methods += "\t\t\tfor (Object obj : this.{0})".format(
                        get_last(field.name)) + " {\n"
                    methods += "\t\t\t\tif (obj instanceof HIFoundation)".format(
                        get_last(field.name)) + " {\n"
                    methods += "\t\t\t\t\tarray.add(((HIFoundation) obj).getParams());\n".format(
                        get_last(field.name))
                    methods += "\t\t\t\t}\n"
                    methods += "\t\t\t\telse {\n\t\t\t\t\tarray.add(obj);\n"
                    methods += "\t\t\t\t}\n"
                    methods += "\t\t\t}\n"
                    methods += "\t\t\tparams.put(\"{0}\", array);\n".format(get_last(field.name))
                elif get_java_type(structure[field.name].data_type) == 'HIFunction':
                    methods += "\t\t\tparams.put(\"{0}\", this.{1});\n".format(get_last(field.name),
                                                                               get_last(field.name))
                elif structure[field.name].properties or 'HI' in get_java_type(field.data_type):
                    methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(
                        get_last(field.name),
                        get_last(field.name))
                else:
                    methods += "\t\t\tparams.put(\"{0}\", this.{1});\n".format(get_last(field.name),
                                                                               get_last(field.name))
            elif structure[field.name].properties:
                methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(
                    get_last(field.name),
                    get_last(field.name))
            methods += "\t\t}\n"
    methods += "\t\treturn params;\n"
    methods += "\t}\n"
    imports += "\n\n"

    javatext += fileLicense + imports + declaration + fields + constructor + methods + "\n}"
    javatext = javatext.replace("default", "defaults")
    javatext = javatext.replace("\"defaults\"", "\"default\"")

    return javatext


def generate_enum_setter(field):
    enum_name = get_last(field.name)
    setter_code = (
        "\tpublic void set{0}({1} {2}) {{\n"
        "\t\tthis.{3} = {4}.getValue();\n"
        "\t\tthis.setChanged();\n"
        "\t\tthis.notifyObservers();\n"
        "\t}}\n\n"
    ).format(
        upper_first(enum_name),
        upper_first(enum_name),
        enum_name,
        enum_name,
        enum_name
    )
    return setter_code


def generate_enum_java_from_values(field):
    """
    Generates Java enum code from string values in a field, only if the field's data type is String.

    Args:
        field: An object with class properties.

    Returns: str or None: The generated Java enum code as a string, or None if the field values are
    invalid or if the data type is not String.
    """

    def to_enum_element_name(enum_element_name):
        return re.sub(r'([a-z])([A-Z])', r'\1_\2', enum_element_name).upper()

    if not field.values or get_java_type(field.data_type) != "String":
        return None

    enum_name = upper_first(get_last(field.name))

    unicode_replacements = {
        'null': 'None',
        'true': 'True',
        'false': 'False'
    }

    try:
        string_unicode = field.values
        for old, new in unicode_replacements.items():
            string_unicode = string_unicode.replace(old, new)

        values_list = literal_eval(string_unicode)
        if not isinstance(values_list, list):
            print("Value is not a list for enum: {}".format(enum_name))
            return None

        string_values_list = [value for value in values_list if isinstance(value, str)]
        if not string_values_list:
            print("No valid string values found for enum: {}".format(enum_name))
            return None

        enum_code = "\tpublic enum {} {{\n".format(enum_name)
        for value in string_values_list:
            enum_constant = to_enum_element_name(value)
            enum_code += "\t\t{}(\"{}\"),\n".format(enum_constant, value)

        enum_code = enum_code.rstrip(',\n') + ";\n\n"

        enum_code += "\t\tprivate final String value;\n\n"
        enum_code += "\t\t{}(String value) {{\n".format(enum_name)
        enum_code += "\t\t\tthis.value = value;\n"
        enum_code += "\t\t}\n\n"

        enum_code += "\t\tpublic String getValue() {\n"
        enum_code += "\t\t\treturn this.value;\n"
        enum_code += "\t\t}\n"
        enum_code += "\t}\n\n"

        return enum_code
    except (SyntaxError, ValueError) as e:
        print("Error processing values for enum {}: {}".format(enum_name, e))
        return None


def create_java_options_file():
    imports = ""
    declaration = ""
    fields = ""
    constructor = ""
    methods = ""
    javaText = ""

    imports += "\npackage com.highsoft.highcharts.common.hichartsclasses;\n"

    imports += "\nimport java.util.HashMap;"
    imports += "\nimport java.util.HashMap;"
    imports += "\nimport java.util.ArrayList;"
    # imports += "\nimport java.util.Observable;"
    # imports += "\nimport java.util.Observer;"
    imports += "\nimport com.highsoft.highcharts.core.HIFoundation;"
    imports += "\nimport com.highsoft.highcharts.common.HIColor;"

    # SETTERS observer implementation
    # fields += "\n\n\t private Observer updateObserver = new Observer() {" \
    #           "\n\t\t@Override" \
    #           "\n\t\tpublic void update(Observable observable, Object o) {" \
    #           "\n\t\t\tsetChanged();" \
    #           "\n\t\t\tnotifyObservers();" \
    #           "\n\t\t}" \
    #           "\n\t};\n\n"

    setter_start = "\tpublic void set{0}({1} {2}) {{" \
                   "\n\t\tthis.{3} = {4};"
    setter_mid = "\n\t\tthis.{0}.addObserver(updateObserver);"
    setter_loop = "\n\t\tfor(Object listElement : {0}){{" \
                  "\n\t\t\tif(listElement instanceof HIFoundation)" \
                  "\n\t\t\t\t((HIFoundation)listElement).addObserver(updateObserver);\n\t\t}}"

    setter_end = "\n\t\tthis.setChanged();" \
                 "\n\t\tthis.notifyObservers();" \
                 "\n\t}"
    getter = "\n\n\tpublic {0} get{1}(){{ return {2}; }}\n\n"

    # declaration += "public class HIOptions extends Observable {\n\n"
    declaration += "public class HIOptions extends HIFoundation {\n\n"
    constructor += "public HIOptions {\n" \
                   "\t\tHICredits credits = new HICredits();\n" \
                   "\t\tcredits.enabled = true;\n" \
                   "\t\tcredits.text = \"Highcharts Android\";\n" \
                   "\t\tcredits.href = \"http://www.highcharts.com/blog/mobile/\";\n" \
                   "\t\tthis.credits = credits;\n" \
                   "\t\treturn this;\n" \
                   "\t}\n" \
                   "}\n\n"
    methods += "@Override\npublic HashMap<String, Object> getParams() {\n\n\tHashMap<String, Object> params = new HashMap<>();\n"
    for field in options:
        if field.name != 'global' and field.name != 'lang':
            # if field.comment:
            #     fields += "{0}".format(field.comment)
            if structure[field.name].data_type:
                if "Object" in str(get_java_type(field.data_type)) and "List" not in str(
                        get_java_type(field.data_type)):
                    if structure[field.name].properties:
                        fields += "\tprivate {0} {1};\n\n".format(
                            "HI" + upper_first(create_name(field.name)), get_last(field.name))
                        if field.comment:
                            fields += "{0}".format(field.comment)
                        fields += setter_start.format(
                            upper_first(get_last(field.name)),
                            "HI" + upper_first(field.name),
                            get_last(field.name),
                            get_last(field.name),
                            get_last(field.name)
                        )
                        fields += setter_mid.format(get_last(field.name))
                        fields += setter_end
                        fields += getter.format(
                            "HI" + upper_first(field.name),
                            upper_first(get_last(field.name)),
                            get_last(field.name)
                        )
                    else:
                        fields += "\tprivate {0} {1};\n\n".format(get_java_type(field.data_type),
                                                                  get_last(field.name))
                        if field.comment:
                            fields += "{0}".format(field.comment)
                        fields += setter_start.format(
                            upper_first(get_last(field.name)),
                            get_java_type(field.data_type),
                            get_last(field.name),
                            get_last(field.name),
                            get_last(field.name)
                        )
                        # fields += setter_mid.format(get_last(field.name))
                        fields += setter_end
                        fields += getter.format(
                            get_java_type(field.data_type),
                            upper_first(get_last(field.name)),
                            get_last(field.name)
                        )
                elif "List" in str(get_java_type(field.data_type)) and field.properties:
                    fields += "\tprivate {0}<{1}> {2};\n\n".format(get_java_type(field.data_type),
                                                                   "HI" + upper_first(
                                                                       create_name(field.name)),
                                                                   get_last(field.name))
                    if field.comment:
                        fields += "{0}".format(field.comment)
                    fields += setter_start.format(
                        upper_first(get_last(field.name)),
                        get_java_type(field.data_type) + "<" + "HI" + upper_first(
                            create_name(field.name)) + ">",
                        get_last(field.name),
                        get_last(field.name),
                        get_last(field.name)
                    )
                    # fields += setter_mid.format(get_last(field.name))
                    fields += setter_loop.format(get_last(field.name))
                    fields += setter_end
                    fields += getter.format(
                        get_java_type(field.data_type) + "<" + "HI" + upper_first(
                            create_name(field.name)) + ">",
                        upper_first(get_last(field.name)),
                        get_last(field.name)
                    )
                else:
                    fields += "\tprivate {0} {1};\n\n".format(get_java_type(field.data_type),
                                                              get_last(field.name))
                    if field.comment:
                        fields += "{0}".format(field.comment)
                    fields += setter_start.format(
                        upper_first(get_last(field.name)),
                        get_java_type(field.data_type),
                        get_last(field.name),
                        get_last(field.name),
                        get_last(field.name)
                    )
                    # fields += setter_mid.format(get_last(field.name))
                    fields += setter_end
                    fields += getter.format(
                        get_java_type(field.data_type),
                        upper_first(get_last(field.name)),
                        get_last(field.name)
                    )
            else:
                fields += "\tprivate {0} {1};\n\n".format(
                    "HI" + upper_first(create_name(field.name)),
                    get_last(field.name))
                if field.comment:
                    fields += "{0}".format(field.comment)
                # fields += setter_start.format(
                #     upper_first(get_last(field.name)),
                #     "HI" + upper_first(field.name),
                #     get_last(field.name),
                #     get_last(field.name),
                #     get_last(field.name)
                # )
                # fields += setter_mid.format(get_last(field.name))
                # fields += setter_end
                fields += getter.format(
                    "HI" + upper_first(field.name),
                    upper_first(get_last(field.name)),
                    get_last(field.name)
                )
    fields += "/**\n* Additional options that are not listed above but are accepted by API\n*/\n"
    fields += "public HashMap<String, Object> additionalOptions;\n\n"
    for field in options:
        if field.name != 'global' and field.name != "lang":
            methods += "\t\tif (this.{0} != null)".format(get_last(field.name)) + " {\n"

            if field.data_type:
                if get_java_type(field.data_type) == 'HIColor':
                    methods += "\t\t\tparamas.put(\"{0}\", this.{1}.getData());\n".format(
                        get_last(field.name),
                        get_last(field.name))
                elif get_java_type(field.data_type) == 'ArrayList<HIColor>':
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"
                    methods += "\t\t\tfor (HIColor hiColor : this.{0})".format(
                        get_last(field.name)) + " {\n"
                    methods += "\t\t\t\tarray.add(hiColor.getData());\n".format(
                        get_last(field.name))
                    methods += "\t\t\t}\n"
                    methods += "\t\t\tparams.put(\"{0}\", array);\n".format(get_last(field.name))
                elif "List" in str(get_java_type(field.data_type)):
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"
                    methods += "\t\t\tfor (Object obj : this.{0})".format(
                        get_last(field.name)) + " {\n"
                    methods += "\t\t\t\tif (obj instanceof HIFoundation)".format(
                        get_last(field.name)) + " {\n"
                    methods += "\t\t\t\t\tarray.add(((HIFoundation) obj).getParams());\n".format(
                        get_last(field.name))
                    methods += "\t\t\t\t}\n"
                    methods += "\t\t\t\telse {\n\t\t\t\tarray.add(obj);\n"
                    methods += "\t\t\t\t}\n"
                    methods += "\t\t\t}\n"
                    methods += "\t\t\tparams.put(\"{0}\", array);\n".format(get_last(field.name))
                elif structure[field.name].properties:
                    methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(
                        get_last(field.name),
                        get_last(field.name))
                else:
                    methods += "\t\t\tparams.put(\"{0}\", this.{1});\n".format(get_last(field.name),
                                                                               get_last(field.name))
            elif structure[field.name].properties:
                methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(
                    get_last(field.name),
                    get_last(field.name))
            methods += "\t\t}\n"
    methods += "\t\tif (this.additionalOptions != null) {\n\t\t\tparams.putAll(additionalOptions);\n\t\t}\n\n"
    methods += "\t\treturn params;\n\t\t\n}"
    imports += "\n\n"

    javaText += imports + declaration + fields + methods + "\n}"

    with open("Android/hichartsclasses/HIOptions.java", "w") as j:
        j.write(javaText)


def create_android_files_for_main_class(field):
    main = create_name(field)
    class_name = "HI" + upper_first(main)
    if main in structure and class_name not in classes:
        create_java_file(main)


def create_android_files():
    if not os.path.exists("Android/hichartsclasses"):
        os.makedirs("Android/hichartsclasses")
    for field in structure:
        create_android_files_for_main_class(field)
        create_java_file(field)
    create_java_options_file()


def print_structure():
    print("^^^^^^^^^ STRUCTURE ^^^^^^^^^^^")
    for c in structure:
        # text = "name: {0}, type: {1}, group: {3}, extends: {2}, props: ".format(c, structure[c].data_type, structure[c].extends, structure[c].group)
        text = "name: {0}, type: {1}, props: ".format(c, structure[c].data_type)
        for p in structure[c].properties:
            text += "{0} | ".format(p.name)
        print(text)


def get_documentation_name(name, isProperties, doubleLast=True):
    ret = str(name)
    ret = ret.replace("description", "definition")
    x = ret.split(".")
    if len(x) > 1:
        ret = x[0]
        if len(x) > 2:
            for i in range(1, len(x) - 1):
                ret += "-{0}".format(x[i])
        if doubleLast:
            if isProperties:
                ret += "-{0}".format(x[len(x) - 1])
            else:
                ret += "--{0}".format(x[len(x) - 1])
        else:
            ret += "-{0}".format(x[len(x) - 1])
    else:
        ret = x[0]
    return ret


def add_entry_to_documentation(documentation, field, source):
    entry = dict()
    name = get_last(field)
    returnType = ""
    isParent = False
    isProperties = False
    doclet = None

    if "doclet" in source.info:
        doclet = source.info["doclet"]

    if source.properties:
        isParent = True
        returnType = "HI" + upper_first(create_name(field))
    elif source.data_type:
        returnType = get_java_type(source.data_type)

    parent = None
    if source.parent:
        parent = source.parent

    if source.properties:
        isProperties = source.properties

    entry["_id"] = get_documentation_name(field, isProperties)
    entry["fullname"] = field.replace("description", "definition")
    entry["title"] = name.replace("description", "definition")
    if source.description and source.description != "":
        entry["description"] = source.description
    if source.demo:
        demo = ""
        lines = source.demo.splitlines()
        for line in lines:
            items = line.split(" : ")
            for item in items:
                if "https://" in item:
                    demo += "{}{}{}".format("<a href=\"", item, "\">")
                else:
                    demo += "{}{}".format(item.rstrip(), "</a>\n")
        entry["demo"] = demo
    if source.defaults:
        entry["defaults"] = source.defaults
    if source.values:
        entry["values"] = source.values
    if doclet and "since" in doclet:
        entry["since"] = doclet["since"]
    entry["deprecated"] = doclet["deprecated"] if doclet and "deprecated" in doclet else False
    if doclet and "see" in doclet:
        seeAlso = ""
        for see in doclet["see"]:
            m = re.search('\[(.+)\]\((.+)\)', see)
            if m:
                if seeAlso != "":
                    seeAlso += ", <a href=\"{}\">{}</a>".format(m.group(2), m.group(1))
                else:
                    seeAlso += "<p><a href=\"{}\">{}</a>".format(m.group(2), m.group(1))
            else:
                seeAlso += "<p>{}".format(see)
        if seeAlso != "":
            seeAlso += "</p>\n"
        entry["seeAlso"] = seeAlso
    if returnType != "":
        entry["returnType"] = returnType
    entry["isParent"] = isParent
    if parent:
        entry["parent"] = parent
    documentation.append(entry)


def merge_extended_properties(field):
    class_name = structure[field].name
    if structure[field].extends and not structure[field].checkedExtends:
        for extends in structure[field].extends.split(","):
            parent = structure[extends]
            structure[field].not_highcharts_properties += parent.not_highcharts_properties
            if parent.extends:
                merge_extended_properties(parent.name)
            for parent_property in parent.properties:
                property_name = "{0}.{1}".format(class_name, get_last(parent_property.name))
                isExist = False
                for property in structure[field].properties:
                    if property.name == property_name:
                        isExist = True
                        property.update(parent_property.data_type, parent_property.description,
                                        parent_property.demo,
                                        parent_property.values, parent_property.defaults,
                                        parent_property.products,
                                        parent_property.extends, parent_property.exclude)

                    if get_last(property.name) in parent.not_highcharts_properties:
                        if property.products:
                            if 'highcharts' not in property.products:
                                structure[field].remove_property(property)
                        else:
                            structure[field].remove_property(property)

                if structure[field].exclude:
                    if get_last(parent_property.name) not in structure[field].exclude and not isExist:
                        structure[field].add_property(parent_property)
                elif not isExist:
                    structure[field].add_property(parent_property)

    structure[field].checkedExtends = True
    structure[field].extends = None
    x = class_name.split(".")
    if len(x) == 2:
        if x[0] == "series" or x[0] == "plotOptions" and x[1] != "series":
            structure[field].extends = "series"


new_types_from_namespace = set()


def create_class(node):
    source = node.info
    parent = node.parent
    data_type = None
    description = None
    demo = None
    values = None
    defaults = None
    products = None
    extends = None
    exclude = None
    if source:
        if "doclet" in source:
            doclet = source["doclet"]

            if "description" in doclet:
                description = doclet["description"] if node.name != 'series' else "General options for all series types."

                # description = re.sub(r'`\s*(.*?)\s*`', r'\1', description)
                # description = re.sub(r'(\[(.*?)\]\(#.*?\))', r'\2', description)
                # description = description.replace("\r", "\n")

            if "values" in doclet and len(doclet["values"]) > 0:
                values = doclet["values"]

            if "defaultByProduct" in doclet:
                defaultByProduct = doclet["defaultByProduct"]
                if "highcharts" in defaultByProduct:
                    defaults = defaultByProduct["highcharts"]

            if "defaultvalue" in doclet:
                defaults = doclet["defaultvalue"]

            if "samples" in doclet:
                samples = doclet["samples"]
                demo = ""
                for sample in samples:
                    name = ""
                    value = ""
                    attr_products = None
                    for attr_sample in sample:
                        if attr_sample == "name":
                            name = sample[attr_sample]
                        elif attr_sample == "value":
                            value = sample[attr_sample]
                        elif attr_sample == "products":
                            attr_products = sample[attr_sample]
                    if attr_products is None or "highcharts" in attr_products:
                        demo += "* [{0}](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/{1})\n".format(name, value)
                if demo == "":
                    demo = None

            if "type" in doclet:
                type = doclet["type"]

                if "names" in type:
                    types = type["names"]

                    for ind, curr_type in enumerate(types):
                        if '\"' in curr_type:
                            types[ind] = 'string'
                        elif 'Highcharts.Dictionary.<Highcharts.' in curr_type:
                            types[ind] = "Object"

                    types = remove_duplicates(types)

                    data_type = '|'.join(types)

                    if len(types) == 2 and types[1] == 'Array.<' + types[0] + '>':
                        data_type = types[1]

                    if 'Highcharts.' in data_type:
                        if data_type not in hc_types:
                            new_types_from_namespace.add(data_type)
                            data_type = type_from_namespace(data_type)
                        else:
                            find_namespace_type(data_type)

            if "products" in doclet:
                products = doclet["products"]
                if 'highcharts' not in products:
                    if node.parent:
                        structure[node.parent].add_not_highcharts_property(node.name)
                    return None

            if "extends" in doclet:
                extends = doclet["extends"].replace("{", "").replace("}", "")

            if "exclude" in doclet:
                exclude = doclet["exclude"]

            if "deprecated" in doclet:
                if doclet["deprecated"]:
                    return None

        name = node.name
        if name == "id":
            name = "ID"
        elif name == "point":
            name = "HIPoint"
        elif name == "description":
            name = "definition"

        c = HIChartsClass(name, data_type, description, demo, values, defaults, products, extends,
                          exclude, source, parent)
        return c


def add_to_structure(name, source, parent):
    if parent == None:
        if name != None and name != "" and name != "_meta":
            fullname = name
        else:
            return
    else:
        fullname = "{0}.{1}".format(parent, name)
        if structure[parent].exclude and name in structure[parent].exclude:
            return

    node = Node(fullname, parent, source)

    hi_class = create_class(node)

    if hi_class:
        structure[node.name] = hi_class

        if parent:
            if parent != "series":
                structure[parent].add_property(hi_class)
        else:
            options.append(hi_class)

        if "children" in source:
            childrens = source["children"]
            for children in childrens:
                add_to_structure(children, childrens[children], fullname)


def add_additional_fields_to_point():
    fields = [
        ("category", "string", "For categorized axes this property holds the category name for the point. For other axes it holds the X value."),
        ("color", "Highcharts.ColorString", "The point's current color."),
        ("colorIndex", "number", "The point's current color index, used in styled mode instead of `color`. The color index is inserted in class names used for styling."),
        ("name", "string", "The name of the point. The name can be given as the first position of the point configuration array, or as a `name` property in the configuration:"),
        ("percentage", "number", "The percentage for points in a stacked series or pies."),
        ("plotX", "number", "The translated X value for the point in terms of pixels. Relative to the X axis position if the series has one, otherwise relative to the plot area. Depending on the series type this value might not be defined."),
        ("plotY", "number", "The translated Y value for the point in terms of pixels. Relative to the Y axis position if the series has one, otherwise relative to the plot area. Depending on the series type this value might not be defined."),
        ("selected", "boolean", "Whether the point is selected or not."),
        ("sliced", "boolean", "Pie series only. Whether to display a slice offset from the center."),
        ("total", "number", "The total of values in either a stack for stacked series, or a pie in a pie series."),
        ("visible", "boolean", "For certain series types, like pie charts, where individual points can be shown or hidden."),
        ("x", "number", "The x value of the point."),
        ("y", "number", "The y value of the point.")
    ]

    acc_point = "accessibility.point"

    if acc_point in structure:
        parent = structure[acc_point]

        for field in fields:
            name = acc_point + "." + field[0]
            hi_class = HIChartsClass(name, field[1], field[2], None, None, None, None, None, None,
                                     None, acc_point)
            structure[name] = hi_class
            parent.add_property(hi_class)


def add_additions_to_series():
    with open('addition_to_series.js') as data_file:
        data = json.load(data_file)

    if "series" not in structure:
        structure["series"] = HIChartsClass("series", "Array.<Object>",
                                            "General options for all series types.", None,
                                            None, None, ["highcharts"], None, None)

    for field in data:
        name = None
        data_type = None
        description = None
        demo = None
        values = None
        defaults = None
        products = None

        if "fullname" in field:
            name = field["fullname"]

        if "description" in field:
            description = field["description"]

        if "values" in field and len(field["values"]) > 0:
            values = field["values"]

        if "defaults" in field:
            defaults = field["defaults"]

        if "demo" in field:
            demo = field["demo"]

        if "returnType" in field:
            data_type = field["returnType"]

        if "products" in field:
            products = field["products"]

        if "parent" in field:
            parent = field["parent"]

        hi_class = HIChartsClass(name, data_type, description, demo, values, defaults, products,
                                 None, None, field,
                                 parent)

        if hi_class:
            structure[name] = hi_class

            if parent == "series":
                structure[parent].add_property(hi_class)


def create_structure():
    with open('tree.json') as data_file:
        data = json.load(data_file)

    for field in data:
        # print "Field name: " +field
        add_to_structure(field, data[field], None)

    add_additions_to_series()
    add_additional_fields_to_point()

    for field in structure:
        merge_extended_properties(field)


#-----------------------------------------------------------------------------------------------------
# --------------NAMESPACE PARSER----------------------------------------------------------------------
#-----------------------------------------------------------------------------------------------------


namespace_structure = dict()
namespace_types = dict()
default_type = "*"
unknown_type_namespace = set()


def print_namespace_structure():
    for c in namespace_structure:
        text = "name: {0}, type: {1}, kind: {2}, props: ".format(c, namespace_structure[c].data_type, namespace_structure[c].kind)
        for p in namespace_structure[c].properties:
            text += "{0} | ".format(p.name)


def create_namespace_class(node):
    source = node.info
    parent = node.parent
    data_type = None
    description = None
    demo = None
    values = None
    defaults = None
    products = None
    extends = None
    exclude = None
    kind = ""

    if ".[key:string]" in node.name:
        return None

    if source:
        if "doclet" in source:
            doclet = source["doclet"]

            if "description" in doclet:
                description = doclet["description"]

            if "kind" in doclet:
                kind = doclet["kind"]

            if "values" in doclet and len(doclet["values"]) > 0:
                values = doclet["values"]

            if "defaultvalue" in doclet:
                defaults = doclet["defaultvalue"].replace("\r", "\n")

            if "types" in doclet:
                types = doclet["types"]

                for ind, type in enumerate(types):
                    if '\"' in type or '\'' in type:
                        types[ind] = 'string'
                    elif 'Highcharts.Dictionary.<Highcharts.' in type:
                        types[ind] = "Object"

                types = remove_duplicates(types)

                data_type = '|'.join(types)

                if len(types) == 2 and types[1] == 'Array.<' + types[0] + '>':
                    data_type = types[1]

                namespace_types[node.name] = data_type
            else:
                namespace_types[node.name] = "*"

            if "products" in doclet:
                products = doclet["products"]

            if "isDeprecated" in doclet:
                if doclet["isDeprecated"]:
                    return None

        c = HIChartsClass(node.name, data_type, description, demo, values, defaults, products,
                          extends, exclude, source, parent)
        c.kind = kind
        return c


def create_namespace_structure():
    with open('tree-namespace.json') as data_file:
        data = json.load(data_file)

    for field in data:
        if field == "children":
            for child in data[field]:
                if child["doclet"]["name"] == "Highcharts":
                    add_to_namespace_structure("Highcharts", child, None)

    for field in namespace_structure:
        change_namespace_types(field)


def add_to_namespace_structure(name, source, parent):
    if parent:
        fullname = "{0}.{1}".format(parent, name)
    else:
        fullname = name

    node = Node(fullname, parent, source)

    hi_class = create_namespace_class(node)

    if hi_class:
        namespace_structure[node.name] = hi_class

        if parent:
            namespace_structure[parent].add_property(hi_class)

        if "children" in source:
            childrens = source["children"]
            for children in childrens:
                if children["doclet"]["name"]:
                    add_to_namespace_structure(get_last(children["doclet"]["name"]), children, fullname)


def change_namespace_types(name):
    field = namespace_structure[name]
    new_type = get_namespace_type(name)
    if new_type:
        field.data_type = new_type

    for child in field.properties:
        change_namespace_types(child.name)


def rec_copy_from_namespace(name):
    if name not in structure and name in namespace_structure:
        field = namespace_structure[name]
        structure[field.name] = field
        for prop in field.properties:
            rec_copy_from_namespace(prop.name)
            if prop.data_type:
                types = prop.data_type.split("|")
                for type in types:
                    rec_copy_from_namespace(type)


def get_namespace_array_type(type):
    hc_match = re.search(r'Array.*(Highcharts\.[a-zA-Z]+)', type)
    while hc_match:
        temp = hc_match.group(1)
        while temp in namespace_types:
            temp = namespace_types[temp]

        if temp.startswith('Array'):
            temp = get_namespace_array_type(temp)
        elif temp in namespace_structure:
            field = namespace_structure[temp]
            if field.kind == 'class':
                temp = 'Object'
            else:
                unknown_type_namespace.add('A: ' + temp)
                temp = default_type
        elif temp not in hc_types:
            unknown_type_namespace.add('A: ' + temp)
            temp = default_type
        type = type.replace(hc_match.group(1), temp)
        hc_match = re.search(r'Array.*(Highcharts\.[a-zA-Z]+)', type)

    same_match = re.search(r'Array.*\((.*?)\|(.*?)(\)|\|)', type)
    while same_match:
        if same_match.group(1) == same_match.group(2):
            type = type.replace(same_match.group(1) + '|' + same_match.group(2), same_match.group(1))
            same_match = re.search(r'Array.*\((.*?)\|(.*?)(\)|\|)', type)
        else:
            break

    type = re.sub(r'Array\.<(\(((\w+|\*)\.*\w*)\))>',
                  lambda s: s.group(0).replace('(', '').replace(')', ''), type)
    return type


def get_namespace_type(name):
    if name in namespace_types:
        if '<(' in namespace_types[name] and ')>' in namespace_types[name]:
            types = [namespace_types[name]]
        else:
            types = namespace_types[name].split('|')

        for index, type in enumerate(types):
            type = get_namespace_array_type(type)

            ori_type = type

            while type in namespace_types:
                type = namespace_types[type]

            if type.startswith('Array'):
                type = get_namespace_array_type(type)
            elif '<(' not in type and ')>' not in type and len(type.split('|')) > 1:
                splitted = type.split('|')
                for ind, sp in enumerate(splitted):
                    new = get_namespace_type(sp)
                    if new:
                        sp = new
                    splitted[ind] = sp
                type = '|'.join(splitted)
            elif type == default_type and 'Highcharts.' in ori_type:
                if ori_type in namespace_structure and \
                        (namespace_structure[ori_type].kind == 'class' or namespace_structure[
                            ori_type].kind == 'interface'):
                    type = ori_type
                    hc_types[type] = ori_type.replace('Highcharts.', 'HI')
                else:
                    unknown_type_namespace.add(type)
            elif type in namespace_structure:
                if namespace_structure[type].kind == "class":
                    type = 'Object'
                else:
                    unknown_type_namespace.add(type)
                    type = default_type
            elif not type in hc_types:
                unknown_type_namespace.add(type)
                type = default_type

            types[index] = type

        types = remove_duplicates(types)

        new_type = '|'.join(types)

        if new_type.startswith('Highcharts.') and new_type.endswith('|undefined'):
            new_type = types[0]

        return new_type
    else:
        return None


def find_namespace_array_type(type):
    hc_match = re.search(r'Array.*(Highcharts\.[a-zA-Z]+)', type)
    while hc_match:
        temp = hc_match.group(1)

        if temp in namespace_structure:
            rec_copy_from_namespace(temp)
            if namespace_structure[temp].data_type != "*":
                temp = namespace_structure[temp].data_type
            else:
                temp = 'HI.' + get_last(temp)
        else:
            print temp + " not in namespace structure!"
            temp = "*"

        if temp.startswith('Array'):
            temp = find_namespace_array_type(temp)

        type = type.replace(hc_match.group(1), temp)
        hc_match = re.search(r'Array.*(Highcharts\.[a-zA-Z]+)', type)

    same_match = re.search(r'Array.*\((.*?)\|(.*?)(\)|\|)', type)
    while same_match:
        if same_match.group(1) == same_match.group(2):
            type = type.replace(same_match.group(1) + "|" + same_match.group(2), same_match.group(1))
            same_match = re.search(r'Array.*\((.*?)\|(.*?)(\)|\|)', type)
        else:
            break

    type = re.sub(r'Array\.<(\(((\w+|\*)\.*\w*)\))>',
                  lambda s: s.group(0).replace('(', '').replace(')', ''), type)
    return type


def find_namespace_type(name):
    if '<(' in name and ')>' in name:
        types = [name]
    else:
        types = name.split('|')

    for index, type in enumerate(types):
        type = find_namespace_array_type(type)

        if type in namespace_structure:
            rec_copy_from_namespace(type)
            if namespace_structure[type].data_type != "*":
                type = namespace_structure[type].data_type
            else:
                type = 'HI.' + get_last(type)

        if type.startswith('Array'):
            type = find_namespace_array_type(type)
        elif '<(' not in type and ')>' not in type and len(type.split('|')) > 1:
            splitted = type.split('|')
            for ind, sp in enumerate(splitted):
                splitted[ind] = find_namespace_type(sp)
            type = '|'.join(splitted)

        types[index] = type

    types = remove_duplicates(types)

    new_type = '|'.join(types)

    return new_type


def type_from_namespace(type):
    new_type = find_namespace_type(type).replace('HI.', 'Highcharts.')

    if new_type not in hc_types:
        if new_type.startswith('Array.'):
            hc_match = re.search(r'Array\.<(Highcharts\.[a-zA-Z]+)>', new_type)
            if hc_match:
                temp = hc_match.group(1)
                if temp in namespace_structure:
                    hc_types[new_type] = 'NSArray<{} *>'.format('HI' + get_last(temp))

        elif new_type in namespace_structure:
            hc_types[new_type] = 'HI' + get_last(new_type)
        elif 'Highcharts.AnimationOptionsObject' in new_type or 'Highcharts.AnimationObject' in new_type:
            hc_types[new_type] = 'HIAnimationOptionsObject'

    if new_type not in hc_types:
        unknown_type = type
        if unknown_type != new_type:
            unknown_type = new_type + ' (original type: ' + type + ')'
        unknown_types_tree.add(unknown_type)

    return new_type


def print_unknown_namespace_types():
    print("\n\n*************************\nUnknown namespace types:\n*************************\n")
    for type in unknown_type_namespace:
        print(type)
    print("- - - - - - - - - - - - - - - - - - - - - - - - - - -  \n\n")


def print_unknown_tree_types():
    print("Unknown tree types:")
    for type in unknown_types_tree:
        print(type)
    print("- - - - - - - - - - - - - - - - - - - - - - - - - - -  \n\n")


def copy_native_methods():
    source_folder = 'Native JS methods'
    target_folder = 'Android/hichartsclasses/'

    source_files = [f for f in os.listdir(source_folder) if f.endswith('.java')]

    for file_name in source_files:
        source_file_path = os.path.join(source_folder, file_name)
        target_file_path = os.path.join(target_folder, file_name)

        if os.path.exists(target_file_path):
            with open(source_file_path, 'r') as source_file:
                source_content = source_file.read()

            with open(target_file_path, 'r') as target_file:
                target_content = target_file.readlines()

            # Find the position of the last closing brace in the target file
            brace_pos = len(target_content) - 1
            while brace_pos >= 0 and '}' not in target_content[brace_pos]:
                brace_pos -= 1

            if brace_pos < 0:
                print 'Error: No closing brace found in ' + target_file_path + '. Cannot copy native methods.'
                continue

            # Insert the source content before the last closing brace
            target_content.insert(brace_pos, source_content + '\n')

            # Write the modified content back to the target file
            with open(target_file_path, 'w') as target_file:
                target_file.writelines(target_content)

            print 'Copied native methods from ' + source_file_path + ' to ' + target_file_path
        else:
            print 'Cannot copy native methods from ' + source_file_path + ' to ' + target_file_path + '. Target file is missing.'


def main():
    create_namespace_structure()
    # print_namespace_structure()
    # print_unknown_namespace_types()
    create_structure()
    # print_structure()
    # print_unknown_tree_types()
    create_android_files()
    copy_native_methods()


if __name__ == "__main__":
    main()
