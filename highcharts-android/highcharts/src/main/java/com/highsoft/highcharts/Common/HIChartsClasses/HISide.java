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
* description: Note: As of v5.0.12, frame.left or frame.right should be used
instead.
The side for the frame around a 3D chart.
*/
public class HISide implements HIChartsJSONSerializable { 


/**
* description: The color of the panel.
* default: transparent
*/
	public HIColor color;

/**
* description: The thickness of the panel.
* default: 1
*/
	public Number size;


	public HISide() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}