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



public class HIFilter implements HIChartsJSONSerializable { 


/**
The operator to compare by. Can be one of >, <, >=, <=, ==,
and ===.
* accepted values: [">", "<", ">=", "<=", "==", "===""]
*/
	public String operator;

/**
The point property to filter by. Point options are passed directly to
properties, additionally there are y value, percentage and others
listed under [Point](https://api.highcharts.com/class-reference/Highcharts.Point)
members.
*/
	public String property;

/**
The value to compare against.
*/
	public Object value;


	public HIFilter() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.operator != null) {
			params.put("operator", this.operator);
		}
		if (this.property != null) {
			params.put("property", this.property);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}