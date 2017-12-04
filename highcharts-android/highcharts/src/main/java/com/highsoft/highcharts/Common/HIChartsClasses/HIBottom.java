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
* description: The bottom of the frame around a 3D chart.
*/
public class HIBottom implements HIChartsJSONSerializable { 


/**
* description: The thickness of the panel.
* default: 1
*/
	public Number size;

/**
* description: Whether to display the frame. Possible values are true, false,
"auto" to display only the frames behind the data, and "default"
to display faces behind the data based on the axis layout, ignoring
the point of view.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-frame/ : Auto frames
* accepted values: ["default", "auto", true, false]
* default: default
*/
	public Object /* Bool, String */ visible;

/**
* description: The color of the panel.
* default: transparent
*/
	public HIColor color;


	public HIBottom() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		return params;
	}

}