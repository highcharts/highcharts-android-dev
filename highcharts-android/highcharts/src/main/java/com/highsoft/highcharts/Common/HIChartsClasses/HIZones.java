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



public class HIZones implements HIChartsJSONSerializable { 


/**
Styled mode only. A custom class name for the zone.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/">Zones styled by class name</a>*/
	public String className;

/**
Defines the color of the series.
*/
	public HIColor color;

/**
A name for the dash style to use for the graph.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-dashstyle-dot/">Dashed line indicates prognosis</a>*/
	public String dashStyle;

/**
Defines the fill color for the series (in area type series)
*/
	public HIColor fillColor;

/**
The value up to where the zone extends, if undefined the zones stretches
to the last value in the series.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Number value;


	public HIZones() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}