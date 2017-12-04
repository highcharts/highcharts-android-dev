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
import com.highsoft.highcharts.Common.HIColor;


/**
* description: Set options on specific levels. Takes precedence over series options,
but not point options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst : Sunburst chart
*/
public class HILevels implements HIChartsJSONSerializable { 


/**
* description: Can set the borderWidth on all points which lies on the same level.
*/
	public Number borderWidth;

/**
* description: Can set the layoutStartingDirection option on a specific level.

* accepted values: ["vertical", "horizontal"]
*/
	public String layoutStartingDirection;

/**
* description: Can set a color on all points which lies on the same level.
*/
	public HIColor color;

/**
* description: Can set the options of dataLabels on each point which lies on the
level. plotOptions.treemap.dataLabels
for possible values.
* default: undefined
*/
	public Object dataLabels;

/**
* description: Set the dash style of the border of all the point which lies on the
level. See 
plotOptions.scatter.dashStyle for possible options.
*/
	public String borderDashStyle;

/**
* description: A configuration object to define how the color of a child varies from the
parent's color. The variation is distributed among the children of node.
For example when setting brightness, the brightness change will range
from the parent's original brightness on the first child, to the amount
set in the to setting on the last node. This allows a gradient-like
color scheme that sets children out from each other while highlighting
the grouping on treemaps and sectors on sunburst charts.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst/ : Sunburst with color variation
*/
	public HIColorVariation colorVariation;

/**
* description: Decides which level takes effect from the options set in the levels
object.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/ : Styling of both levels
*/
	public Number level;

/**
* description: Can set the layoutAlgorithm option on a specific level.

* accepted values: ["sliceAndDice", "stripes", "squarified", "strip"]
*/
	public String layoutAlgorithm;

/**
* description: Can set a borderColor on all points which lies on the same level.
*/
	public HIColor borderColor;

/**
* description: Can set a rotationMode on all points which lies on the same level.
*/
	public String rotationMode;

/**
* description: Can set a rotation on all points which lies on the same level.
*/
	public Number rotation;


	public HILevels() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.layoutStartingDirection != null) {
			params.put("layoutStartingDirection", this.layoutStartingDirection);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.dataLabels != null) {
			params.put("dataLabels", this.dataLabels);
		}
		if (this.borderDashStyle != null) {
			params.put("borderDashStyle", this.borderDashStyle);
		}
		if (this.colorVariation != null) {
			params.put("colorVariation", this.colorVariation.getParams());
		}
		if (this.level != null) {
			params.put("level", this.level);
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.rotationMode != null) {
			params.put("rotationMode", this.rotationMode);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		return params;
	}

}