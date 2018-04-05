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



public class HIStackLabels implements HIChartsJSONSerializable { 


/**
Allow the stack labels to overlap.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-allowoverlap-false/">Default false</a>*/
	public Boolean allowOverlap;

/**
CSS styles for the label.

In styled mode, the styles are set in the
.highcharts-stack-label class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-style/">Red stack total labels</a>*/
	public HIStyle style;

/**
Defines the vertical alignment of the stack total label. Can be one
of "top", "middle" or "bottom". The default value is calculated
at runtime and depends on orientation and whether the stack is positive
or negative.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-top/">"Vertically aligned top"</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-middle/">"Vertically aligned middle"</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-bottom/">"Vertically aligned bottom"</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]*/
	public String verticalAlign;

/**
A [format string](http://docs.highcharts.com/#formatting) for the
data label. Available variables are the same as for formatter.
 <br><br><b>default:</b><br><br>&ensp;{total}*/
	public String format;

/**
Defines the horizontal alignment of the stack total label. Can be
one of "left", "center" or "right". The default value is calculated
at runtime and depends on orientation and whether the stack is positive
or negative.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-left/">Aligned to the left</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-center/">Aligned in center</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-right/">Aligned to the right</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"]*/
	public String align;

/**
Enable or disable the stack total labels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-enabled/">Enabled stack total labels</a>*/
	public Boolean enabled;

/**
Whether to [use HTML](http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
to render the labels.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean useHTML;

/**
The y position offset of the label relative to the tick position
on the axis. The default value is calculated at runtime and depends
on orientation and whether the stack is positive or negative.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-y/">Stack total labels with y offset</a>*/
	public Number y;

/**
The x position offset of the label relative to the left of the stacked
bar. The default value is calculated at runtime and depends on orientation
and whether the stack is positive or negative.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-x/">Stack total labels with x offset</a>*/
	public Number x;

/**
Rotation of the labels in degrees.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-rotation/">Labels rotated 45ĂÂ°</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number rotation;

/**
Callback JavaScript function to format the label. The value is
given by this.total.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-formatter/">Added units to stack total value</a> <br><br><b>default:</b><br><br>&ensp;function() { return this.total; }*/
	public HIFunction formatter;

/**
The text alignment for the label. While align determines where
the texts anchor point is placed with regards to the stack, textAlign
determines how the text is aligned against its anchor point. Possible
values are "left", "center" and "right". The default value
is calculated at runtime and depends on orientation and whether the
stack is positive or negative.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-textalign-left/">Label in center position but text-aligned left</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"]*/
	public String textAlign;


	public HIStackLabels() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		return params;
	}

}