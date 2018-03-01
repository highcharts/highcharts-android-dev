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
import com.highsoft.highcharts.Common.HIColor;



public class HILevels implements HIChartsJSONSerializable { 


/**
Can set a borderColor on all points which lies on the same level.
*/
	public HIColor borderColor;

/**
Can set a colorVariation on all points which lies on the same level.
*/
	public HIColorVariation colorVariation;

/**
Can set a levelSize on all points which lies on the same level.
*/
	public Object levelSize;

/**
Can set a borderDashStyle on all points which lies on the same level.
*/
	public String borderDashStyle;

/**
Can set a color on all points which lies on the same level.
*/
	public HIColor color;

/**
Can set a dataLabels on all points which lies on the same level.
*/
	public Object dataLabels;

/**
Can set a rotationMode on all points which lies on the same level.
*/
	public String rotationMode;

/**
Can set a borderWidth on all points which lies on the same level.
*/
	public Number borderWidth;

/**
Can set a rotation on all points which lies on the same level.
*/
	public Number rotation;

/**
Decides which level takes effect from the options set in the levels
object.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/ : Styling of both levels
*/
	public Number level;

/**
Can set the layoutAlgorithm option on a specific level.
* accepted values: ["sliceAndDice", "stripes", "squarified", "strip"]
*/
	public String layoutAlgorithm;

/**
Can set the layoutStartingDirection option on a specific level.
* accepted values: ["vertical", "horizontal"]
*/
	public String layoutStartingDirection;


	public HILevels() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.colorVariation != null) {
			params.put("colorVariation", this.colorVariation.getParams());
		}
		if (this.levelSize != null) {
			params.put("levelSize", this.levelSize);
		}
		if (this.borderDashStyle != null) {
			params.put("borderDashStyle", this.borderDashStyle);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.dataLabels != null) {
			params.put("dataLabels", this.dataLabels);
		}
		if (this.rotationMode != null) {
			params.put("rotationMode", this.rotationMode);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.level != null) {
			params.put("level", this.level);
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm);
		}
		if (this.layoutStartingDirection != null) {
			params.put("layoutStartingDirection", this.layoutStartingDirection);
		}
		return params;
	}

}