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
* description: States for a single point marker.
*/
public class HIStates implements HIChartsJSONSerializable { 


/**
* description: The appearance of the point marker when selected. In order to
allow a point to be selected, set the series.allowPointSelect
option to true.
*/
	public HISelect select;

/**
* description: The hover state for a single point marker.
*/
	public HIHover hover;


	public HIStates() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.select != null) {
			params.put("select", this.select.getParams());
		}
		if (this.hover != null) {
			params.put("hover", this.hover.getParams());
		}
		return params;
	}

}