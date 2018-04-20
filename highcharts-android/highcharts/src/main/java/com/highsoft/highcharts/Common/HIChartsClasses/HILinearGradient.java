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



public class HILinearGradient implements HIChartsJSONSerializable { 

	public Number y1;
	public Number x2;
	public Number x1;
	public Number y2;


	public HILinearGradient() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.y1 != null) {
			params.put("y1", this.y1);
		}
		if (this.x2 != null) {
			params.put("x2", this.x2);
		}
		if (this.x1 != null) {
			params.put("x1", this.x1);
		}
		if (this.y2 != null) {
			params.put("y2", this.y2);
		}
		return params;
	}

}