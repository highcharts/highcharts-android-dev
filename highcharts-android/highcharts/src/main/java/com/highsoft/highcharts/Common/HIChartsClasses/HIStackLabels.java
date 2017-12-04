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


/**
* description: The stack labels show the total value for each bar in a stacked
column or bar chart. The label will be placed on top of positive
columns and below negative columns. In case of an inverted column
chart or a bar chart the label is placed to the right of positive
bars and to the left of negative bars.
*/
public class HIStackLabels implements HIChartsJSONSerializable { 


/**
* description: The text alignment for the label. While align determines where
the texts anchor point is placed with regards to the stack, textAlign
determines how the text is aligned against its anchor point. Possible
values are "left", "center" and "right". The default value
is calculated at runtime and depends on orientation and whether the
stack is positive or negative.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-textalign-left/ : Label in center position but text-aligned left
* accepted values: ["left", "center", "right"]
*/
	public String textAlign;

/**
* description: Callback JavaScript function to format the label. The value is
given by this.total. Defaults to:
function() {
    return this.total;
}
* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-formatter/ : Added units to stack total value
*/
	public HIGFunction /* Function */ formatter;

/**
* description: Defines the horizontal alignment of the stack total label. Can be
one of "left", "center" or "right". The default value is calculated
at runtime and depends on orientation and whether the stack is positive
or negative.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-left/ : Aligned to the left
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-center/ : Aligned in center
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-right/ : Aligned to the right
* accepted values: ["left", "center", "right"]
*/
	public String align;

/**
* description: The y position offset of the label relative to the tick position
on the axis. The default value is calculated at runtime and depends
on orientation and whether the stack is positive or negative.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-y/ : Stack total labels with y offset
*/
	public Number y;

/**
* description: Defines the vertical alignment of the stack total label. Can be one
of "top", "middle" or "bottom". The default value is calculated
at runtime and depends on orientation and whether the stack is positive
or negative.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-top/ : "Vertically aligned top"
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-middle/ : "Vertically aligned middle"
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-bottom/ : "Vertically aligned bottom"
* accepted values: ["top", "middle", "bottom"]
*/
	public String verticalAlign;

/**
* description: Rotation of the labels in degrees.

* demo: Labels rotated 45Â°
* default: 0
*/
	public Number rotation;

/**
* description: CSS styles for the label.
In styled mode, the styles are set in the
.highcharts-stack-label class.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-style/ : Red stack total labels
*/
	public HIStyle style;

/**
* description: The x position offset of the label relative to the left of the stacked
bar. The default value is calculated at runtime and depends on orientation
and whether the stack is positive or negative.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-x/ : Stack total labels with x offset
*/
	public Number x;

/**
* description: Enable or disable the stack total labels.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-enabled/ : Enabled stack total labels
*/
	public Boolean enabled;

/**
* description: Allow the stack labels to overlap.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-allowoverlap-false/ : Default false
*/
	public Boolean allowOverlap;

/**
* description: A http://docs.highcharts.com/#formatting : format string for the
data label. Available variables are the same as for formatter.
* default: {total}
*/
	public String format;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html : use HTML
to render the labels.
* default: false
*/
	public Boolean useHTML;


	public HIStackLabels() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		return params;
	}

}