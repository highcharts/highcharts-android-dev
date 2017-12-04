/**
* (c) 2009-2017 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/


package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIGFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;


/**
* description: Options for annotation's labels. Each label inherits options
from the labelOptions object. An option from the labelOptions can be
overwritten by config for a specific label.
*/
public class HILabelOptions implements HIChartsJSONSerializable { 


/**
* description: The background color or gradient for the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: rgba(0, 0, 0, 0.75)
*/
	public HIColor backgroundColor;

/**
* description: How to handle the annotation's label that flow outside the plot
area. The justify option aligns the label inside the plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/ : Crop or justify labels
* accepted values: ["none", "justify"]
* default: justify
*/
	public String overflow;

/**
* description: The border width in pixels for the annotation's label

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: 1
*/
	public Number borderWidth;

/**
* description: The border color for the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: black
*/
	public HIColor borderColor;

/**
* description: The label's pixel distance from the point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* default: undefined
*/
	public Number distance;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html : use HTML to render the annotation's label.
* default: false
*/
	public Boolean useHTML;

/**
* description: Whether to hide the annotation's label that is outside the plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/ : Crop or justify labels
*/
	public Boolean crop;

/**
* description: The shadow of the box. The shadow can be an object configuration
containing color, offsetX, offsetY, opacity and width.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
*/
	public Object /* Boolean, Object */ shadow;

/**
* description: The vertical alignment of the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* accepted values: ["top", "middle", "bottom"]
* default: bottom
*/
	public String verticalAlign;

/**
* description: The alignment of the annotation's label. If right,
the right side of the label should be touching the point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* accepted values: ["left", "center", "right"]
* default: center
*/
	public String align;

/**
* description: Styles for the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
*/
	public HIStyle style;

/**
* description: Whether to allow the annotation's labels to overlap.
To make the labels less sensitive for overlapping, 
the can be set to 0.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/tooltip-like/ : Hide overlapping labels
*/
	public Boolean allowOverlap;

/**
* description: When either the borderWidth or the backgroundColor is set,
this    is the padding within the box.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: 5
*/
	public Number padding;

/**
* description: The x position offset of the label relative to the point.
Note that if a distance is defined, the distance takes
precedence over x and y options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
*/
	public Number x;

/**
* description: The y position offset of the label relative to the point.
Note that if a distance is defined, the distance takes
precedence over x and y options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* default: -16
*/
	public Number y;

/**
* description: The border radius in pixels for the annotaiton's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: 1
*/
	public Number borderRadius;

/**
* description: Alias for the format option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/ : Set labels text
* default: undefined
*/
	public String text;

/**
* description: Callback JavaScript function to format the annotation's label. Note that
if a format or text are defined, the format or text take precedence
and the formatter is ignored. This refers to a point object.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/ : Set labels text
* default: function () {
	return defined(this.y) ? this.y : 'Annotation label';
}
*/
	public HIGFunction /* Function */ formatter;

/**
* description: The name of a symbol to use for the border around the label.
Symbols are predefined functions on the Renderer object.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shapes/ : Available shapes for labels
* default: callout
*/
	public String shape;

/**
* description: A https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting : format string for the data label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/ : Set labels text
* default: undefined
*/
	public String format;


	public HILabelOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		return params;
	}

}