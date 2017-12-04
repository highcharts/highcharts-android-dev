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
* description: Configure a crosshair that follows either the mouse pointer or the
hovered point.
In styled mode, the crosshairs are styled in the .highcharts-crosshair, .highcharts-crosshair-thin or .highcharts-xaxis-category
classes.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/ : Crosshair on both axes
* default: false
*/
public class HICrosshair implements HIChartsJSONSerializable { 


/**
* description: The pixel width of the crosshair. Defaults to 1 for numeric or datetime
axes, and for one category width for category axes.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/ : Customized crosshairs

* default: 1
*/
	public Number width;

/**
* description: A class name for the crosshair, especially as a hook for styling.
*/
	public String className;

/**
* description: The Z index of the crosshair. Higher Z indices allow drawing the
crosshair on top of the series or behind the grid lines.
* default: 2
*/
	public Number zIndex;

/**
* description: Whether the crosshair should snap to the point or follow the pointer
independent of points.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-snap-false/ : True by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/latlon-advanced/ : Snap is false
* default: true
*/
	public Boolean snap;

/**
* description: The dash style for the crosshair. See series.dashStyle for possible values.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-dotted/ : Dotted crosshair
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshair-dashed/ : Dashed X axis crosshair
* accepted values: ["Solid", "ShortDash", "ShortDot", "ShortDashDot", "ShortDashDotDot", "Dot", "Dash" ,"LongDash", "DashDot", "LongDashDot", "LongDashDotDot"]
* default: Solid
*/
	public String dashStyle;

/**
* description: The color of the crosshair. Defaults to #cccccc for numeric and
datetime axes, and rgba(204,214,235,0.25) for category axes, where
the crosshair by default highlights the whole category.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/ : Customized crosshairs

* default: #cccccc
*/
	public HIColor color;


	public HICrosshair() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.snap != null) {
			params.put("snap", this.snap);
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		return params;
	}

}