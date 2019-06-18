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
import sys
import os
import re
from bs4 import BeautifulSoup, SoupStrainer
from HTMLParser import HTMLParser
import cgi

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
series_description = ""
series_data_description = ""
filelicense = "/**\n* (c) 2009-2018 Highsoft AS\n*\n* License: www.highcharts.com/license\n" \
              "* For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/\n" \
              "* In case of questions, please contact sales@highsoft.com\n*/\n\n"

fileAndroidlicense = "/**\n* (c) 2009-2018 Highsoft AS\n*\n* License: www.highcharts.com/license\n" \
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

        if self.description:
            self.comment = "\n{0}\n".format(self.description)
            if self.demo:
                self.comment += cgi.escape(" <br><br><b><i>Try it:</b></i><br>{0}".format(self.demo))
            if self.values:
                self.comment += cgi.escape(" <br><br><b>accepted values:</b><br><br>&ensp;{0}".format(self.values))
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


# def clean_comment(comment):
#     soup = BeautifulSoup(comment, 'html.parser')
#     demos = list()
#     for m in soup.find_all('a'):
#         a = str(m)
#         if a in comment:
#             if 'href' in a:
#                 demo_link = m['href']
#                 demo_text = m.__dict__['next_element']
#                 if not demo_link.startswith("#"):
#                     if demo_text in demos:
#                         comment = comment.replace(a, "")
#                         replaced_text = demos[-1] + "\n"
#                         comment = comment.replace(replaced_text, demos[-1])
#                     else:
#                         demos.append(demo_text)
#                         comment = comment.replace(a, demo_link + " : " + demo_text, 1)
#
#     soup = BeautifulSoup(comment, 'html.parser')
#     comment = soup.get_text()
#     return comment


def clean_comment(comment):
    comment = comment.replace('\n', ' ').replace('  ', ' ').replace('.  ', '. ').replace('(//code.highcharts.com/', '(https://code.highcharts.com/').replace('[code.highcharts.com/', '[https://code.highcharts.com/')
    comment = re.sub('(\(|\[)[\w\.*/ *: *\-*]+[\.\-/_]\s+[\w\.*/ *: *\- *]+(\)|\])', lambda s: s.group(0).replace(' ', ''), comment)
    comment = re.sub('\[(.+?)\]\((.+?)\)', lambda s: s.group(0) if s.group(2).startswith("http") else s.group(0).replace(s.group(0), '`{}`'.format(s.group(1))), comment)
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
    "boolean|Highcharts.ShadowOptionsObject": 'Boolean /* boolean */',
    "string|Highcharts.SVGDOMElement": 'String',
    "boolean|Highcharts.CSSObject": 'Boolean /* boolean */',
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
    #7.0.1
    "Highcharts.FormatterCallbackFunction.<Highcharts.AxisLabelsFormatterContextObject>": 'HIFunction',
    "Highcharts.FormatterCallbackFunction.<Highcharts.Point>": 'HIFunction',
    "string|Highcharts.HTMLDOMElement": 'String',
    # 7.0.2
    "Array.<(string|Highcharts.GradientColorObject|Highcharts.PatternObject)>": 'ArrayList<String>',
    "string|function": 'String',
    #7.1.1
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
        #7.1.2
        "string|number|function": 'Object',
        "Highcharts.EventCallbackFunction.<Highcharts.Annotation>": 'HIFunction',
        "Highcharts.FormatterCallbackFunction.<Highcharts.BubbleLegendFormatterContextObject>": 'HIFunction',
        #namespace
        "string|function|undefined": 'String',
        "Highcharts.FormatterCallbackFunction.<Highcharts.SankeyNodeObject>|undefined": 'HIFunction',
        "string|boolean|undefined": 'NSString',
        "string|Highcharts.CSSObject|undefined": 'HICSSObject',
        "string|Highcharts.GradientColorObject|Highcharts.PatternObject|undefined": 'HIColor',
        "boolean|Highcharts.ShadowOptionsObject|undefined": 'HIShadowOptionsObject',
        "boolean|Highcharts.AnimationOptionsObject|undefined": 'HIAnimationOptionsObject',
        "string|Highcharts.SVGAttributes": 'HISVGAttributes'
}


# def get_java_type(x):
#     return {
#         # tu byl slownik
#     }[str(x)]


def get_java_type(x):
    return hc_types[str(x)]

def upper_first(x):
    r = x[0].upper() + x[1:]
    return r


def get_last(x):
    last = ''
    n = x.split(".")
    last = n[len(n) - 1]
    if last == 'description':
        last = 'definition'
    return last


def removeDuplicates(listofElements):
    uniqueList = []

    for elem in listofElements:
        if elem not in uniqueList:
            uniqueList.append(elem)

    return uniqueList


def create_name(source):
    name = source.split(".")[-1]
    return name


def create_java_file(name):
    source = structure[name]
    java = None
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

        if field_in_parent(field, source):
            continue

        # if field.comment:
        #     fields += "\n{0}".format(field.comment)
        if field.data_type:
            if "Object" in str(get_java_type(field.data_type)) and "List" not in str(
                    get_java_type(field.data_type)) and not \
                    structure[field.name].properties:
                fields += "\tprivate {0} {1};\n".format(get_java_type(field.data_type), get_last(field.name))

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

            elif "List" in str(get_java_type(field.data_type)) and structure[field.name].properties and 'HI' not in get_java_type(field.data_type):
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
                fields += "\tprivate {0} {1};\n".format(get_java_type(field.data_type), get_last(field.name))
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
                hi_match = re.search(r'<(HI[A-Z]{1}[a-zA-Z]+) \*>', get_java_type(field.data_type)) # dodane
                if hi_match:
                    import_hi_set.add(hi_match.group(1))
            elif field.data_type == "Object" or field.data_type == "object":
                if structure[field.name].properties:
                    fields += "\tprivate {0} {1};\n".format("HI" + upper_first(create_name(field.name)),
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
                if structure[field.name].properties and 'HI' not in get_java_type(field.data_type):  # added no array
                    fields += "\tprivate {0} {1};\n".format("HI" + upper_first(create_name(field.name)),
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
                    fields += "\tprivate {0} {1};\n".format(get_java_type(field.data_type), get_last(field.name))
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
                    if 'HI' in field.data_type: # to samo co wyzej
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

    # for mathch in import_hi_set: # set
    #     import_hi_string += "#import \"" + mathch + ".h\"\n"
    #
    # if 'HIColor' in import_hi_set:
    #     import_hi_set.remove('HIColor')
    # if 'HIFunction' in import_hi_set:
    #     import_hi_set.remove('HIFunction')
    #
    # if imports == "" and len(import_hi_set) == 0:
    #     imports += "#import \"HIChartsJSONSerializable.h\"\n"
    # imports += import_hi_string
    #
    # imports += "\n\n"  # koniec set

    methods += "\n\t@Override\npublic HashMap<String, Object> getParams() {\n\n\t\tHashMap<String, Object> params =" \
               " new HashMap<>();\n"
    if source.extends:
        methods += "\t\tparams = super.getParams();\n"
    else: methods += "\t\tparams.put(\"_wrapperID\", this.uuid);\n"

    for field in classes[class_name]:
        if field_in_parent(field, source):
            pass
        else:
            methods += "\t\tif (this.{0} != null)".format(get_last(field.name)) + " {\n"
            if structure[field.name].data_type:
                if get_java_type(structure[field.name].data_type) == 'HIColor':
                    methods += "\t\t\tparams.put(\"{0}\", this.{1}.getData());\n".format(get_last(field.name),
                                                                                         get_last(field.name))
                elif get_java_type(structure[field.name].data_type) == 'ArrayList<HIColor>':
                    imports += "\nimport com.highsoft.highcharts.common.HIColor;"
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"
                    methods += "\t\t\tfor (HIColor hiColor : this.{0})".format(get_last(field.name)) + " {\n"
                    methods += "\t\t\t\tarray.add(hiColor.getData());\n".format(
                        get_last(field.name))
                    methods += "\t\t\t}\n"
                    methods += "\t\t\tparams.put(\"{0}\", array);\n".format(get_last(field.name))
                elif 'List' in str(get_java_type(structure[field.name].data_type)):
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"

                    methods += "\t\t\tfor (Object obj : this.{0})".format(get_last(field.name)) + " {\n"
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
                    methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(get_last(field.name),
                                                                                           get_last(field.name))
                else:
                    methods += "\t\t\tparams.put(\"{0}\", this.{1});\n".format(get_last(field.name),
                                                                               get_last(field.name))
            elif structure[field.name].properties:
                methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(get_last(field.name),
                                                                                       get_last(field.name))
            methods += "\t\t}\n"
    methods += "\t\treturn params;\n"
    methods += "\t}\n"
    imports += "\n\n"

    javatext += fileAndroidlicense + imports + declaration + fields + constructor + methods + "\n}"
    javatext = javatext.replace("default", "defaults")
    javatext = javatext.replace("\"defaults\"", "\"default\"")

    return javatext


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
                    methods += "\t\t\tparamas.put(\"{0}\", this.{1}.getData());\n".format(get_last(field.name),
                                                                                          get_last(field.name))
                elif get_java_type(field.data_type) == 'ArrayList<HIColor>':
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"
                    methods += "\t\t\tfor (HIColor hiColor : this.{0})".format(get_last(field.name)) + " {\n"
                    methods += "\t\t\t\tarray.add(hiColor.getData());\n".format(
                        get_last(field.name))
                    methods += "\t\t\t}\n"
                    methods += "\t\t\tparams.put(\"{0}\", array);\n".format(get_last(field.name))
                elif "List" in str(get_java_type(field.data_type)):
                    methods += "\t\t\tArrayList<Object> array = new ArrayList<>();\n"
                    methods += "\t\t\tfor (Object obj : this.{0})".format(get_last(field.name)) + " {\n"
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
                    methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(get_last(field.name),
                                                                                           get_last(field.name))
                else:
                    methods += "\t\t\tparams.put(\"{0}\", this.{1});\n".format(get_last(field.name),
                                                                               get_last(field.name))
            elif structure[field.name].properties:
                methods += "\t\t\tparams.put(\"{0}\", this.{1}.getParams());\n".format(get_last(field.name),
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
    for c in structure:
        text = "name: {0}, type: {1}, group: {3}, extends: {2}, props: ".format(c, structure[c].data_type,
                                                                                structure[c].extends,
                                                                                structure[c].group)
        for p in structure[c].properties:
            text += "{0} | ".format(p.name)
        print text


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


def add_to_documentation(documentation, field, parent):
    add_entry_to_documentation(documentation, field, structure[parent])
    if structure[parent].properties:
        for property in structure[parent].properties:
            if field != "series":
                children = "{0}.{1}".format(field, get_last(property.name))
                add_to_documentation(documentation, children, property.name)


def generate_documentation():
    documentation = list()

    for field in structure:
        add_to_documentation(documentation, field, field)

    entry = dict()
    entry["_id"] = "options--additionalOptions"
    entry["fullname"] = "options.additionalOptions"
    entry["title"] = "additionalOptions"
    entry["description"] = "Additional options that are not listed but are accepted by API"
    entry["returnType"] = "NSDictionary"
    entry["isParent"] = False
    documentation.append(entry)
    with open('APIDocs.json', 'w') as json_file:
        json.dump(documentation, json_file)


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
                        property.update(parent_property.data_type, parent_property.description, parent_property.demo,
                                        parent_property.values, parent_property.defaults, parent_property.products,
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
                description = doclet["description"]
                description = re.sub(r'`\s*(.*?)\s*`', r'\1', description)
                description = re.sub(r'(\[(.*?)\]\(#.*?\))', r'\2', description)
                description = description.replace("\r", "\n")

            if "values" in doclet and len(doclet["values"]) > 0:
                values = doclet["values"]

            if "defaultByProduct" in doclet:
                defaultByProduct = doclet["defaultByProduct"]
                if "highcharts" in defaultByProduct:
                    defaults = defaultByProduct["highcharts"]

            if "defaultvalue" in doclet:
                defaults = doclet["defaultvalue"].replace("\r", "\n")

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
                        demo += "<br>&ensp;&bull;&ensp; <a href=\"https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/{0}\">{1}</a>".format(
                            value, name)
                        # demo += cgi.escape("\n&bull;<a href=\"https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/{0}\">{1}</a>".format(value, name))
                        # demo += "https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/{0} : {1}\n".format(value, name)
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

                    types = removeDuplicates(types)

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

        c = HIChartsClass(name, data_type, description, demo, values, defaults, products, extends, exclude, source,
                          parent)
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

        # if hi_class.name == "series":
        #     hi_class.data_type = "Array.<Object>"

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


def add_additions_to_series():
    with open('addition_to_series.js') as data_file:
        data = json.load(data_file)

    if "series" not in structure:
        structure["series"] = HIChartsClass("series", "Array.<Object>", "General options for all series types.", None,
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

        hi_class = HIChartsClass(name, data_type, description, demo, values, defaults, products, None, None, field,
                                 parent)

        if hi_class:
            structure[name] = hi_class

            if parent == "series":
                structure[parent].add_property(hi_class)


def create_structure():
    with open('tree.json') as data_file:
        data = json.load(data_file)

    for field in data:
        add_to_structure(field, data[field], None)

    add_additions_to_series()

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
        print text


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

                types = removeDuplicates(types)

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

        c = HIChartsClass(node.name, data_type, description, demo, values, defaults, products, extends, exclude, source, parent)
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

    type = re.sub(r'Array\.<(\(((\w+|\*)\.*\w*)\))>', lambda s: s.group(0).replace('(', '').replace(')', ''), type)
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
                    (namespace_structure[ori_type].kind == 'class' or namespace_structure[ori_type].kind == 'interface'):
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

        types = removeDuplicates(types)

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

    type = re.sub(r'Array\.<(\(((\w+|\*)\.*\w*)\))>', lambda s: s.group(0).replace('(', '').replace(')', ''), type)
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

    types = removeDuplicates(types)

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
                    print "Added type from namespace : " + new_type + ", value: " + 'ArrayList<{}>'.format('HI' + get_last(temp))
                    hc_types[new_type] = 'ArrayList<{}>'.format('HI' + get_last(temp))

        elif new_type in namespace_structure:
            print "Added type from namespace : " + new_type + ", value: " + "HI" + get_last(new_type)
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
    print "Unknown namespace types:"
    for type in unknown_type_namespace:
        print type
    print "- - - - - - - - - - - - - - - - - - - - - - - - - - -  \n\n"


def print_unknown_tree_types():
    print "Unknown tree types:"
    for type in unknown_types_tree:
        print type
    print "- - - - - - - - - - - - - - - - - - - - - - - - - - -  \n\n"

def main():
    create_namespace_structure()

    print_unknown_namespace_types()

    create_structure()

    print_unknown_tree_types()
    # create_files()
    # generate_documentation()
    create_android_files()


if __name__ == "__main__":
    main()
