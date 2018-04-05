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



public class HIPlotLines implements HIChartsJSONSerializable { 


/**
The z index of the plot line within the chart.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/">Behind plot lines by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/">Above plot lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/">Above plot lines and series</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number zIndex;

/**
The dashing or dot style for the plot line. For possible values see
[this overview](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-
dashstyle-all/).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/">Dash and dot pattern</a> <br><br><b>accepted values:</b><br><br>&ensp;["Solid", "ShortDash", "ShortDot", "ShortDashDot", "ShortDashDotDot", "Dot", "Dash" ,"LongDash", "DashDot", "LongDashDot", "LongDashDotDot"] <br><br><b>default:</b><br><br>&ensp;Solid*/
	public String dashStyle;

/**
The color of the line.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">A red line from X axis</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor color;

/**
The position of the line in axis units.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">Between two categories on X axis</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number value;

/**
An id used for identifying the plot line in Axis.removePlotLine.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-id/">Remove plot line by id</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public String id;

/**
A custom class name, in addition to the default highcharts-plot-line, to
apply to each individual line.
*/
	public String className;

/**
The width or thickness of the plot line.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">2px wide line from X axis</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number width;

/**
Text labels for the plot bands
*/
	public HILabel label;

/**
An object defining mouse events for the plot line. Supported properties
are click, mouseover, mouseout, mousemove.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-events/">Mouse events demonstrated</a>*/
	public Object events;


	public HIPlotLines() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.events != null) {
			params.put("events", this.events);
		}
		return params;
	}

}