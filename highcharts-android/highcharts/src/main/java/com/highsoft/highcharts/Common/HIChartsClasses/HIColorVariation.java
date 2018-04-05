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



public class HIColorVariation implements HIChartsJSONSerializable { 


/**
The ending value of a color variation. The last sibling will receive this
value.
*/
	public Number to;

/**
The key of a color variation. Currently supports brightness only.
 <br><br><b>accepted values:</b><br><br>&ensp;["brightness"]*/
	public String key;


	public HIColorVariation() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.key != null) {
			params.put("key", this.key);
		}
		return params;
	}

}