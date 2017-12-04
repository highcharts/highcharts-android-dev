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
* description: A partial fill for each point, typically used to visualize how much of
a task is performed. The partial fill object can be set either on series
or point level.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range : X-range with partial fill
*/
public class HIPartialFill implements HIChartsJSONSerializable { 


/**
* description: The fill color to be used for partial fills. Defaults to a darker shade
of the point color.
*/
	public HIColor fill;


	public HIPartialFill() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		return params;
	}

}