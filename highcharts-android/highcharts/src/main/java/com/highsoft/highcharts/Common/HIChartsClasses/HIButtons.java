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



public class HIButtons implements HIChartsJSONSerializable { 


/**
Options for the export button.

In styled mode, export button styles can be applied with the
.highcharts-contextbutton class.
*/
	public HIContextButton contextButton;


	public HIButtons() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.contextButton != null) {
			params.put("contextButton", this.contextButton.getParams());
		}
		return params;
	}

}