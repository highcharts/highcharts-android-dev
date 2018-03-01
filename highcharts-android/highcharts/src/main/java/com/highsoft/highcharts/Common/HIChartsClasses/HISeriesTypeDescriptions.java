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

	public Object funnel;
	public Object pyramid;
	public Object columnrange;
	public Object errorbar;
	public Object areasplinerange;
	public Object waterfall;
	public Object arearange;
	public Object bubble;
	public Object boxplot;


	public HISeriesTypeDescriptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.funnel != null) {
		}
		if (this.pyramid != null) {
		}
		if (this.columnrange != null) {
		}
		if (this.errorbar != null) {
		}
		if (this.areasplinerange != null) {
		}
		if (this.waterfall != null) {
		}
		if (this.arearange != null) {
		}
		if (this.bubble != null) {
		}
		if (this.boxplot != null) {
		}
		return params;
	}

}