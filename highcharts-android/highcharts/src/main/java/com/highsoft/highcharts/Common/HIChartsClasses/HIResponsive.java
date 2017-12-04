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
* description: Allows setting a set of rules to apply for different screen or chart
sizes. Each rule specifies additional chart options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/responsive/ : Stock chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/ : Axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/ : Legend
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/ : Class name
*/
public class HIResponsive implements HIChartsJSONSerializable { 


/**
* description: A set of rules for responsive settings. The rules are executed from
the top down.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/ : Axis changes

*/
	public ArrayList <HIRules> rules;


	public HIResponsive() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.rules != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.rules) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("rules", array);
		}
		return params;
	}

}