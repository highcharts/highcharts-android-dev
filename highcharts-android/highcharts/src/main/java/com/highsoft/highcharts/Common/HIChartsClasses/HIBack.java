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



public class HIBack implements HIChartsJSONSerializable { 


/**
The color of the panel.
 <br><br><b>default:</b><br><br>&ensp;transparent*/
	public HIColor color;

/**
Whether to display the frame. Possible values are true, false,
"auto" to display only the frames behind the data, and "default"
to display faces behind the data based on the axis layout, ignoring
the point of view.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-frame/">Auto frames</a> <br><br><b>accepted values:</b><br><br>&ensp;["default", "auto", true, false] <br><br><b>default:</b><br><br>&ensp;default*/
	public Object /* Boolean|String */ visible;

/**
The thickness of the panel.
 <br><br><b>default:</b><br><br>&ensp;1*/
	public Number size;


	public HIBack() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}