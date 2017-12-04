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
* description: An array of objects representing plot lines on the X axis
*/
public class HIPlotLines implements HIChartsJSONSerializable { 


/**
* description: The z index of the plot line within the chart.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/ : Behind plot lines by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/ : Above plot lines
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/ : Above plot lines and series
* default: null
*/
	public Number zIndex;

/**
* description: A custom class name, in addition to the default highcharts-plot-
line, to apply to each individual line.
*/
	public String className;

/**
* description: The width or thickness of the plot line.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/ : 2px wide line from X axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/ : Plot line on Y axis
* default: null
*/
	public Number width;

/**
* description: The dashing or dot style for the plot line. For possible values see
http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-
dashstyle-all/ : this overview.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/ : Dash and dot pattern
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/ : Plot line on Y axis
* accepted values: ["Solid", "ShortDash", "ShortDot", "ShortDashDot", "ShortDashDotDot", "Dot", "Dash" ,"LongDash", "DashDot", "LongDashDot", "LongDashDotDot"]
* default: Solid
*/
	public String dashStyle;

/**
* description: Text labels for the plot bands
*/
	public HILabel label;

/**
* description: An id used for identifying the plot line in Axis.removePlotLine.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-id/ : Remove plot line by id
* default: null
*/
	public String id;

/**
* description: An object defining mouse events for the plot line. Supported properties
are click, mouseover, mouseout, mousemove.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-events/ : Mouse events demonstrated
*/
	public Object events;

/**
* description: The color of the line.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/ : A red line from X axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/ : Plot line on Y axis
* default: null
*/
	public HIColor color;

/**
* description: The position of the line in axis units.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/ : Between two categories on X axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/ : Plot line on Y axis
* default: null
*/
	public Number value;


	public HIPlotLines() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.events != null) {
			params.put("events", this.events);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}