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



public class HIPoint implements HIChartsJSONSerializable { 

	public HIEvents events;

/**
The y position of the point. Units can be either in axis
or chart pixel coordinates.
*/
	public Number y;

/**
The x position of the point. Units can be either in axis 
or chart pixel coordinates.
*/
	public Number x;

/**
This number defines which xAxis the point is connected to. It refers
to either the axis id or the index of the axis in the xAxis array.
If the option is not configured or the axis is not found the point's
x coordinate refers to the chart pixels.
*/
	public Object /* Number|String */ xAxis;

/**
This number defines which yAxis the point is connected to. It refers
to either the axis id or the index of the axis in the yAxis array.
If the option is not configured or the axis is not found the point's
y coordinate refers to the chart pixels.
*/
	public Object /* Number|String */ yAxis;


	public HIPoint() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.xAxis != null) {
			params.put("xAxis", this.xAxis);
		}
		if (this.yAxis != null) {
			params.put("yAxis", this.yAxis);
		}
		return params;
	}

}