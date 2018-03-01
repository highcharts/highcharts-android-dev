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



public class HIGlobal implements HIChartsJSONSerializable { 


/**
Path to the pattern image required by VML browsers in order to
draw radial gradients.
*/
	public String VMLRadialGradientURL;


	public HIGlobal() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.VMLRadialGradientURL != null) {
			params.put("VMLRadialGradientURL", this.VMLRadialGradientURL);
		}
		return params;
	}

}