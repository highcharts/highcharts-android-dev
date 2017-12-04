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
* description: Options for keyboard navigation.
*/
public class HIKeyboardNavigation implements HIChartsJSONSerializable { 


/**
* description: Enable keyboard navigation for the chart.
* default: true
*/
	public Boolean enabled;

/**
* description: Skip null points when navigating through points with the
keyboard.
* default: false
*/
	public Boolean skipNullPoints;


	public HIKeyboardNavigation() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.skipNullPoints != null) {
			params.put("skipNullPoints", this.skipNullPoints);
		}
		return params;
	}

}