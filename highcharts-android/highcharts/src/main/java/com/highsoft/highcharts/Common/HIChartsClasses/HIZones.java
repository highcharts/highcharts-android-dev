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
* description: An array defining zones within a series. Zones can be applied to
the X axis, Y axis or Z axis for bubbles, according to the zoneAxis
option.
In styled mode, the color zones are styled with the .highcharts-
zone-{n} class, or custom classed from the className option (http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-
zones/ : view
live demo).

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/ : Color zones
*/
public class HIZones implements HIChartsJSONSerializable { 


/**
* description: Styled mode only. A custom class name for the zone.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/ : Zones styled by class name

*/
	public String className;

/**
* description: A name for the dash style to use for the graph.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-dashstyle-dot/ : Dashed line indicates prognosis
*/
	public String dashStyle;

/**
* description: Defines the color of the series.
*/
	public HIColor color;

/**
* description: The value up to where the zone extends, if undefined the zones stretches
to the last value in the series.
* default: undefined
*/
	public Number value;

/**
* description: Defines the fill color for the series (in area type series)
*/
	public HIColor fillColor;


	public HIZones() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.className != null) {
			params.put("className", this.className);
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
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		return params;
	}

}