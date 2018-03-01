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



public class HIStates implements HIChartsJSONSerializable { 

	public HIHover hover;
	public HISelect select;

/**
The normal state of a single point marker. Currently only used
for setting animation when returning to normal state from hover.
*/
	public HINormal normal;


	public HIStates() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.hover != null) {
			params.put("hover", this.hover.getParams());
		}
		if (this.select != null) {
			params.put("select", this.select.getParams());
		}
		if (this.normal != null) {
			params.put("normal", this.normal.getParams());
		}
		return params;
	}

}