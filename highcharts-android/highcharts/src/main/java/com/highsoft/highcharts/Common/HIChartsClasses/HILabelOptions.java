/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



public class HILabelOptions implements HIChartsJSONSerializable { 


/**
Whether to allow the annotation's labels to overlap.
To make the labels less sensitive for overlapping, 
the can be set to 0.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/tooltip-like/">Hide overlapping labels</a>*/
	public Boolean allowOverlap;

/**
The border color for the annotation's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public HIColor borderColor;

/**
Styles for the annotation's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public HIStyle style;

/**
When either the borderWidth or the backgroundColor is set,
this	is the padding within the box.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public Number padding;

/**
The vertical alignment of the annotation's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position
*</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]*/
	public String verticalAlign;

/**
The label's pixel distance from the point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Number distance;

/**
The border radius in pixels for the annotaiton's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public Number borderRadius;

/**
Alias for the format option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public String text;

/**
The alignment of the annotation's label. If right,
the right side of the label should be touching the point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"]*/
	public String align;

/**
A [format](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) string for the data label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public String format;

/**
Whether to hide the annotation's label that is outside the plot
area.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels</a>*/
	public Boolean crop;

/**
Whether to [use HTML](http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
to render the annotation's label.
 <br><br><b>default:</b><br><br>&ensp;false
**/
	public Boolean useHTML;

/**
A class name for styling by CSS.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations">Styled mode annotations</a>*/
	public String className;

/**
The name of a symbol to use for the border around the label.
Symbols are predefined functions on the Renderer object.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shapes/">Available shapes for labels
*</a>*/
	public String shape;

/**
The border width in pixels for the annotation's label
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public Number borderWidth;

/**
The background color or gradient for the annotation's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public HIColor backgroundColor;

/**
The y position offset of the label relative to the point.
Note that if a distance is defined, the distance takes
precedence over x and y options.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position
*</a>*/
	public Number y;

/**
The x position offset of the label relative to the point.
Note that if a distance is defined, the distance takes
precedence over x and y options.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position
*</a>*/
	public Number x;

/**
How to handle the annotation's label that flow outside the plot
area. The justify option aligns the label inside the plot area.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels
*</a> <br><br><b>accepted values:</b><br><br>&ensp;["none", "justify"]*/
	public String overflow;

/**
Callback JavaScript function to format the annotation's label.
Note that if a format or text are defined, the format or text
take precedence and the formatter is ignored. This refers to a
point object.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a> <br><br><b>default:</b><br><br>&ensp;function () {
	return defined(this.y) ? this.y : 'Annotation label';
}
**/
	public HIFunction formatter;

/**
The shadow of the box. The shadow can be an object configuration
containing color, offsetX, offsetY, opacity and width.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public Object /* Boolean|Object */ shadow;


	public HILabelOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		return params;
	}

}