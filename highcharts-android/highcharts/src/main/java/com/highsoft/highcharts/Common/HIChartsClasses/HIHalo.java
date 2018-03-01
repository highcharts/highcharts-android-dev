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



public class HIHalo implements HIChartsJSONSerializable { 

	public Number opacity;
	public HIAttributes attributes;
	public Boolean enabled;
	public Number size;


	public HIHalo() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.attributes != null) {
			params.put("attributes", this.attributes.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}