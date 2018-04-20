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



public class HILabelStyle implements HIChartsJSONSerializable { 

	public String fontWeight;
	public String top;
	public String position;


	public HILabelStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.top != null) {
			params.put("top", this.top);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		return params;
	}

}