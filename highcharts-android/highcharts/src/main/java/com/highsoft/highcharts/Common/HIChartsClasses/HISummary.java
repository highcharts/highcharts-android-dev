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



public class HISummary implements HIChartsJSONSerializable { 

	public String pieCombination;
	public String pie;
	public String lineCombination;
	public String mapbubble;
	public String spline;
	public String barCombination;
	public String boxplotCombination;
	public String splineCombination;
	public String scatterCombination;
	public String maplineCombination;
	public String bubble;
	public String boxplot;
	public String columnCombination;
	public String map;
	public String line;
	public String mapline;
	public String bar;
	public String mapCombination;
	public String defaults;
	public String mapbubbleCombination;
	public String defaultCombination;
	public String column;
	public String bubbleCombination;
	public String scatter;


	public HISummary() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.pieCombination != null) {
			params.put("pieCombination", this.pieCombination);
		}
		if (this.pie != null) {
			params.put("pie", this.pie);
		}
		if (this.lineCombination != null) {
			params.put("lineCombination", this.lineCombination);
		}
		if (this.mapbubble != null) {
			params.put("mapbubble", this.mapbubble);
		}
		if (this.spline != null) {
			params.put("spline", this.spline);
		}
		if (this.barCombination != null) {
			params.put("barCombination", this.barCombination);
		}
		if (this.boxplotCombination != null) {
			params.put("boxplotCombination", this.boxplotCombination);
		}
		if (this.splineCombination != null) {
			params.put("splineCombination", this.splineCombination);
		}
		if (this.scatterCombination != null) {
			params.put("scatterCombination", this.scatterCombination);
		}
		if (this.maplineCombination != null) {
			params.put("maplineCombination", this.maplineCombination);
		}
		if (this.bubble != null) {
			params.put("bubble", this.bubble);
		}
		if (this.boxplot != null) {
			params.put("boxplot", this.boxplot);
		}
		if (this.columnCombination != null) {
			params.put("columnCombination", this.columnCombination);
		}
		if (this.map != null) {
			params.put("map", this.map);
		}
		if (this.line != null) {
			params.put("line", this.line);
		}
		if (this.mapline != null) {
			params.put("mapline", this.mapline);
		}
		if (this.bar != null) {
			params.put("bar", this.bar);
		}
		if (this.mapCombination != null) {
			params.put("mapCombination", this.mapCombination);
		}
		if (this.defaults != null) {
			params.put("default", this.defaults);
		}
		if (this.mapbubbleCombination != null) {
			params.put("mapbubbleCombination", this.mapbubbleCombination);
		}
		if (this.defaultCombination != null) {
			params.put("defaultCombination", this.defaultCombination);
		}
		if (this.column != null) {
			params.put("column", this.column);
		}
		if (this.bubbleCombination != null) {
			params.put("bubbleCombination", this.bubbleCombination);
		}
		if (this.scatter != null) {
			params.put("scatter", this.scatter);
		}
		return params;
	}

}