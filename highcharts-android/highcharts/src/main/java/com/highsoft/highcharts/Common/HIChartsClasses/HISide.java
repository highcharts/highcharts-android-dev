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



public class HISide implements HIChartsJSONSerializable { 


/**
The color of the panel.
 <br><br><b>default:</b><br><br>&ensp;transparent*/
	public HIColor color;

/**
The thickness of the panel.
 <br><br><b>default:</b><br><br>&ensp;1*/
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