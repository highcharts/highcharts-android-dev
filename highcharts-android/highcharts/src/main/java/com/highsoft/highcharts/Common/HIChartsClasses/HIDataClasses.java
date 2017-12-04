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
* description: An array of data classes or ranges for the choropleth map. If none
given, the color axis is scalar and values are distributed as a gradient
between the minimum and maximum colors.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-ranges/ : Multiple ranges
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-two-ranges/ : Two ranges
*/
public class HIDataClasses implements HIChartsJSONSerializable { 


/**
* description: The name of the data class as it appears in the legend. If no name
is given, it is automatically created based on the from and to
values. For full programmatic control, legend.labelFormatter can be used. In the formatter, this.from and this.
to can be accessed.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasses-name/ : Named data classes
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/coloraxis/dataclasses-labelformatter/ : Formatted data classes
*/
	public String name;

/**
* description: The end of the value range that the data class represents, relating
to the point value.
*/
	public Number to;

/**
* description: The color of each data class. If not set, the color is pulled from
the global or chart-specific colors array. In 
styled mode, this option is ignored. Instead, use colors defined in
CSS.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/data-class-two-ranges/ : Explicit colors
*/
	public HIColor color;

/**
* description: The start of the value range that the data class represents, relating
to the point value.
*/
	public Number from;


	public HIDataClasses() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		return params;
	}

}