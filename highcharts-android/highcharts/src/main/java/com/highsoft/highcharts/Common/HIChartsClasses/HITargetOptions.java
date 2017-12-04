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
* description: Individual target options for each point.
*/
public class HITargetOptions implements HIChartsJSONSerializable { 


/**
* description: The color of the rectangle representing the target. When not set,
point's color (if set in point's options -
color) or zone of the target value
(if zones or
negativeColor are set)
or the same color as the point has is used.
In styled mode, use class highcharts-bullet-target instead.
*/
	public HIColor color;

/**
* description: The border width of the rectangle representing the target.
In styled mode, use class highcharts-bullet-target instead.
*/
	public Number borderWidth;

/**
* description: The border color of the rectangle representing the target. When
not set, the  point's border color is used.
In styled mode, use class highcharts-bullet-target instead.
*/
	public HIColor borderColor;

/**
* description: The width of the rectangle representing the target. Could be set as
a pixel value or as a percentage of a column width.
* default: 140%
*/
	public Object /* String, Double */ width;

/**
* description: The height of the rectangle representing the target.
* default: 3
*/
	public Number height;


	public HITargetOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		return params;
	}

}