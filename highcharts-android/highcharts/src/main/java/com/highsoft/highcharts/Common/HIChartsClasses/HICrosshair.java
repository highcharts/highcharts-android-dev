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



public class HICrosshair implements HIChartsJSONSerializable { 


/**
The Z index of the crosshair. Higher Z indices allow drawing the
crosshair on top of the series or behind the grid lines.
 <br><br><b>default:</b><br><br>&ensp;2*/
	public Number zIndex;

/**
The dash style for the crosshair. See
series.dashStyle
for possible values.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-dotted/">Dotted crosshair</a> <br><br><b>accepted values:</b><br><br>&ensp;["Solid", "ShortDash", "ShortDot", "ShortDashDot",
             "ShortDashDotDot", "Dot", "Dash" ,"LongDash",
             "DashDot", "LongDashDot", "LongDashDotDot"] <br><br><b>default:</b><br><br>&ensp;Solid*/
	public String dashStyle;

/**
The color of the crosshair. Defaults to #cccccc for numeric and
datetime axes, and rgba(204,214,235,0.25) for category axes, where
the crosshair by default highlights the whole category.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a> <br><br><b>default:</b><br><br>&ensp;#cccccc*/
	public HIColor color;

/**
A class name for the crosshair, especially as a hook for styling.
*/
	public String className;

/**
The pixel width of the crosshair. Defaults to 1 for numeric or
datetime axes, and for one category width for category axes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number width;

/**
Whether the crosshair should snap to the point or follow the pointer
independent of points.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-snap-false/">True by default</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean snap;


	public HICrosshair() {

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
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.snap != null) {
			params.put("snap", this.snap);
		}
		return params;
	}

}