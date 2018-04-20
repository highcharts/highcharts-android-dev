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



public class HIAxis implements HIChartsJSONSerializable { 

	public String xAxisDescriptionSingular;
	public String xAxisDescriptionPlural;
	public String yAxisDescriptionPlural;
	public String yAxisDescriptionSingular;


	public HIAxis() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.xAxisDescriptionSingular != null) {
			params.put("xAxisDescriptionSingular", this.xAxisDescriptionSingular);
		}
		if (this.xAxisDescriptionPlural != null) {
			params.put("xAxisDescriptionPlural", this.xAxisDescriptionPlural);
		}
		if (this.yAxisDescriptionPlural != null) {
			params.put("yAxisDescriptionPlural", this.yAxisDescriptionPlural);
		}
		if (this.yAxisDescriptionSingular != null) {
			params.put("yAxisDescriptionSingular", this.yAxisDescriptionSingular);
		}
		return params;
	}

}