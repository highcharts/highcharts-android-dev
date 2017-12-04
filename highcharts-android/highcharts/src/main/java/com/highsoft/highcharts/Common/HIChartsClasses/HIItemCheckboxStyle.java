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
* description: Default styling for the checkbox next to a legend item when
showCheckbox is true.
*/
public class HIItemCheckboxStyle implements HIChartsJSONSerializable { 

	public String width;
	public String position;
	public String height;


	public HIItemCheckboxStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		return params;
	}

}