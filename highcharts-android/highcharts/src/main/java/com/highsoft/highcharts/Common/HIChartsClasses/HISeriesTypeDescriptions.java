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



public class HISeriesTypeDescriptions implements HIChartsJSONSerializable { 

	public String funnel;
	public String pyramid;
	public String columnrange;
	public String errorbar;
	public String areasplinerange;
	public String waterfall;
	public String arearange;
	public String bubble;
	public String boxplot;


	public HISeriesTypeDescriptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.funnel != null) {
			params.put("funnel", this.funnel);
		}
		if (this.pyramid != null) {
			params.put("pyramid", this.pyramid);
		}
		if (this.columnrange != null) {
			params.put("columnrange", this.columnrange);
		}
		if (this.errorbar != null) {
			params.put("errorbar", this.errorbar);
		}
		if (this.areasplinerange != null) {
			params.put("areasplinerange", this.areasplinerange);
		}
		if (this.waterfall != null) {
			params.put("waterfall", this.waterfall);
		}
		if (this.arearange != null) {
			params.put("arearange", this.arearange);
		}
		if (this.bubble != null) {
			params.put("bubble", this.bubble);
		}
		if (this.boxplot != null) {
			params.put("boxplot", this.boxplot);
		}
		return params;
	}

}