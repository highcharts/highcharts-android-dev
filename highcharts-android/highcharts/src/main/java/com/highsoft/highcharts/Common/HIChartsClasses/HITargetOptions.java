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



public class HITargetOptions implements HIChartsJSONSerializable { 


/**
The border color of the rectangle representing the target. When
not set, the  point's border color is used.

In styled mode, use class highcharts-bullet-target instead.
*/
	public HIColor borderColor;

/**
The width of the rectangle representing the target. Could be set
as a pixel value or as a percentage of a column width.
*/
	public Object /* Number|String */ width;

/**
The border width of the rectangle representing the target.

In styled mode, use class highcharts-bullet-target instead.
*/
	public Number borderWidth;

/**
The color of the rectangle representing the target. When not set,
point's color (if set in point's options -
color) or zone of the target value
(if zones or
negativeColor are set)
or the same color as the point has is used.

In styled mode, use class highcharts-bullet-target instead.
*/
	public HIColor color;

/**
The height of the rectangle representing the target.
*/
	public Number height;


	public HITargetOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		return params;
	}

}