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



public class HIFrame implements HIChartsJSONSerializable { 


/**
The right of the frame around a 3D chart.
*/
	public HIRight right;

/**
The bottom of the frame around a 3D chart.
*/
	public HIBottom bottom;

/**
The top of the frame around a 3D chart.
*/
	public HITop top;

/**
The back side of the frame around a 3D chart.
*/
	public HIBack back;

/**
Whether the frames are visible.
*/
	public String visible;

/**
The front of the frame around a 3D chart.
*/
	public HIFront front;

/**
General pixel thickness for the frame faces.
*/
	public Number size;

/**
Note: As of v5.0.12, frame.left or frame.right should be used
instead.

The side for the frame around a 3D chart.
*/
	public HISide side;

/**
The left side of the frame around a 3D chart.
*/
	public HILeft left;


	public HIFrame() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.right != null) {
			params.put("right", this.right.getParams());
		}
		if (this.bottom != null) {
			params.put("bottom", this.bottom.getParams());
		}
		if (this.top != null) {
			params.put("top", this.top.getParams());
		}
		if (this.back != null) {
			params.put("back", this.back.getParams());
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.front != null) {
			params.put("front", this.front.getParams());
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.side != null) {
			params.put("side", this.side.getParams());
		}
		if (this.left != null) {
			params.put("left", this.left.getParams());
		}
		return params;
	}

}