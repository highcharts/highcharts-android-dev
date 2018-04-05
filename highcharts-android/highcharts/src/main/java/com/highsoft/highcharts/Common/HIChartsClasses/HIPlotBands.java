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



public class HIPlotBands implements HIChartsJSONSerializable { 


/**
In a gauge chart, this option determines the outer radius of the
plot band that stretches along the perimeter. It can be given as
a percentage string, like "100%", or as a pixel number, like 100.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-gauge">Gauge plot band</a> <br><br><b>default:</b><br><br>&ensp;100%*/
	public Object /* Number|String */ outerRadius;

/**
In a gauge chart, this option determines the inner radius of the
plot band that stretches along the perimeter. It can be given as
a percentage string, like "100%", or as a pixel number, like 100.
By default, the inner radius is controlled by the [thickness](#yAxis.
plotBands.thickness) option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-gauge">Gauge plot band</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Object /* Number|String */ innerRadius;

/**
In a gauge chart, this option sets the width of the plot band stretching
along the perimeter. It can be given as a percentage string, like
"10%", or as a pixel number, like 10. The default value 10 is
the same as the default tickLength, thus making
the plot band act as a background for the tick markers.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-gauge">Gauge plot band</a> <br><br><b>default:</b><br><br>&ensp;10*/
	public Object /* Number|String */ thickness;

/**
Border color for the plot band. Also requires borderWidth to be
set.
 <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor borderColor;

/**
The z index of the plot band within the chart, relative to other
elements. Using the same z index as another element may give unpredictable
results, as the last rendered element will be on top. Values from
0 to 20 make sense.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Behind plot lines by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex/">Above plot lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-zindex-above-series/">Above plot lines and series</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number zIndex;

/**
The start position of the plot band in axis units.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Datetime axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/">Categorized axis</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number from;

/**
The color of the plot band.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Color band</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor color;

/**
An id used for identifying the plot band in Axis.removePlotBand.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-id/">Remove plot band by id</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public String id;

/**
A custom class name, in addition to the default highcharts-plot-band, to
apply to each individual band.
*/
	public String className;

/**
The end position of the plot band in axis units.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-color/">Datetime axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-from/">Categorized axis</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number to;

/**
Border width for the plot band. Also requires borderColor to be
set.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderWidth;

/**
Text labels for the plot bands
*/
	public HILabel label;

/**
An object defining mouse events for the plot band. Supported properties
are click, mouseover, mouseout, mousemove.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-events/">Mouse events demonstrated</a>*/
	public Object events;


	public HIPlotBands() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.outerRadius != null) {
			params.put("outerRadius", this.outerRadius);
		}
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		if (this.thickness != null) {
			params.put("thickness", this.thickness);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
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