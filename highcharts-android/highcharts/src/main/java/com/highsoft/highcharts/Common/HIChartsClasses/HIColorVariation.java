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


/**
* description: A configuration object to define how the color of a child varies from the
parent's color. The variation is distributed among the children of node.
For example when setting brightness, the brightness change will range
from the parent's original brightness on the first child, to the amount
set in the to setting on the last node. This allows a gradient-like
color scheme that sets children out from each other while highlighting
the grouping on treemaps and sectors on sunburst charts.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst/ : Sunburst with color variation
*/
public class HIColorVariation implements HIChartsJSONSerializable { 


/**
* description: The key of a color variation. Currently supports brightness only.

* accepted values: ["brightness"]
*/
	public String key;

/**
* description: The ending value of a color variation. The last sibling will receive this
value.
*/
	public Number to;


	public HIColorVariation() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.key != null) {
			params.put("key", this.key);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		return params;
	}

}