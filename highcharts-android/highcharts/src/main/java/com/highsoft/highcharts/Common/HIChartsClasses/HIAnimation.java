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
* description: Animation setting for hovering the graph in line-type series.
* default: { "duration": 50 }
*/
public class HIAnimation implements HIChartsJSONSerializable { 


/**
* description: The duration of the hover animation in milliseconds. By
default the hover state animates quickly in, and slowly back
to normal.
* default: 50
*/
	public Number duration;


	public HIAnimation() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		return params;
	}

}