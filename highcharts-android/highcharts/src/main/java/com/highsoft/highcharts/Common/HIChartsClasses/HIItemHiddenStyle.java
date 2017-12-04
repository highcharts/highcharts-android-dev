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
* description: CSS styles for each legend item when the corresponding series or
point is hidden. Only a subset of CSS is supported, notably those
options related to text. Properties are inherited from style
unless overridden here.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhiddenstyle/ : Darker gray color
* default: { "color": "#cccccc" }
*/
public class HIItemHiddenStyle implements HIChartsJSONSerializable { 

	public String color;


	public HIItemHiddenStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color);
		}
		return params;
	}

}