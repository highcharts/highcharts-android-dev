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


/**
* description: Provides the option to draw a frame around the charts by defining
a bottom, front and back panel.
*/
public class HIFrame implements HIChartsJSONSerializable { 


/**
* description: Whether the frames are visible.
* default: default
*/
	public String visible;

/**
* description: General pixel thickness for the frame faces.
* default: 1
*/
	public Number size;

/**
* description: The right of the frame around a 3D chart.
*/
	public HIRight right;

/**
* description: The top of the frame around a 3D chart.
*/
	public HITop top;

/**
* description: The back side of the frame around a 3D chart.
*/
	public HIBack back;

/**
* description: Note: As of v5.0.12, frame.left or frame.right should be used
instead.
The side for the frame around a 3D chart.
*/
	public HISide side;

/**
* description: The front of the frame around a 3D chart.
*/
	public HIFront front;

/**
* description: The left side of the frame around a 3D chart.
*/
	public HILeft left;

/**
* description: The bottom of the frame around a 3D chart.
*/
	public HIBottom bottom;


	public HIFrame() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.right != null) {
			params.put("right", this.right.getParams());
		}
		if (this.top != null) {
			params.put("top", this.top.getParams());
		}
		if (this.back != null) {
			params.put("back", this.back.getParams());
		}
		if (this.side != null) {
			params.put("side", this.side.getParams());
		}
		if (this.front != null) {
			params.put("front", this.front.getParams());
		}
		if (this.left != null) {
			params.put("left", this.left.getParams());
		}
		if (this.bottom != null) {
			params.put("bottom", this.bottom.getParams());
		}
		return params;
	}

}