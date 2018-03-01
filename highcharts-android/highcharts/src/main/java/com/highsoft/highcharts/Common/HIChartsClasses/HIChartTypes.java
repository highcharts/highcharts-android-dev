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



public class HIChartTypes implements HIChartsJSONSerializable { 

	public String scatterMultiple;
	public String defaultMultiple;
	public String mapTypeDescription;
	public String lineMultiple;
	public String defaultSingle;
	public String emptyChart;
	public String pieMultiple;
	public String columnSingle;
	public String pieSingle;
	public String splineMultiple;
	public String unknownMap;
	public String combinationChart;
	public String columnMultiple;
	public String scatterSingle;
	public String bubbleMultiple;
	public String boxplotMultiple;
	public String barSingle;
	public String barMultiple;
	public String lineSingle;
	public String splineSingle;
	public String bubbleSingle;
	public String boxplotSingle;


	public HIChartTypes() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.scatterMultiple != null) {
			params.put("scatterMultiple", this.scatterMultiple);
		}
		if (this.defaultMultiple != null) {
			params.put("defaultMultiple", this.defaultMultiple);
		}
		if (this.mapTypeDescription != null) {
			params.put("mapTypeDescription", this.mapTypeDescription);
		}
		if (this.lineMultiple != null) {
			params.put("lineMultiple", this.lineMultiple);
		}
		if (this.defaultSingle != null) {
			params.put("defaultSingle", this.defaultSingle);
		}
		if (this.emptyChart != null) {
			params.put("emptyChart", this.emptyChart);
		}
		if (this.pieMultiple != null) {
			params.put("pieMultiple", this.pieMultiple);
		}
		if (this.columnSingle != null) {
			params.put("columnSingle", this.columnSingle);
		}
		if (this.pieSingle != null) {
			params.put("pieSingle", this.pieSingle);
		}
		if (this.splineMultiple != null) {
			params.put("splineMultiple", this.splineMultiple);
		}
		if (this.unknownMap != null) {
			params.put("unknownMap", this.unknownMap);
		}
		if (this.combinationChart != null) {
			params.put("combinationChart", this.combinationChart);
		}
		if (this.columnMultiple != null) {
			params.put("columnMultiple", this.columnMultiple);
		}
		if (this.scatterSingle != null) {
			params.put("scatterSingle", this.scatterSingle);
		}
		if (this.bubbleMultiple != null) {
			params.put("bubbleMultiple", this.bubbleMultiple);
		}
		if (this.boxplotMultiple != null) {
			params.put("boxplotMultiple", this.boxplotMultiple);
		}
		if (this.barSingle != null) {
			params.put("barSingle", this.barSingle);
		}
		if (this.barMultiple != null) {
			params.put("barMultiple", this.barMultiple);
		}
		if (this.lineSingle != null) {
			params.put("lineSingle", this.lineSingle);
		}
		if (this.splineSingle != null) {
			params.put("splineSingle", this.splineSingle);
		}
		if (this.bubbleSingle != null) {
			params.put("bubbleSingle", this.bubbleSingle);
		}
		if (this.boxplotSingle != null) {
			params.put("boxplotSingle", this.boxplotSingle);
		}
		return params;
	}

}