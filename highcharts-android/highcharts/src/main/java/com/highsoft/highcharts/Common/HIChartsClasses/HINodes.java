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
* description: A collection of options for the individual nodes. The nodes in a sankey 
diagram are auto-generated instances of Highcharts.Point, but options can
be applied here and linked by the id.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/sankey/ : Sankey diagram with node options
*/
public class HINodes implements HIChartsJSONSerializable { 


/**
* description: The color index of the auto generated node, especially for use in styled
mode.
*/
	public Number colorIndex;

/**
* description: The id of the auto-generated node, refering to the from or to setting of
the link.
*/
	public String id;

/**
* description: The color of the auto generated node.
*/
	public HIColor color;


	public HINodes() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		return params;
	}

}