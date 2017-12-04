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
* description: Options for the export related buttons, print and export. In addition
to the default buttons listed here, custom buttons can be added.
See navigation.buttonOptions for general
options.
*/
public class HIButtons implements HIChartsJSONSerializable { 


/**
* description: Options for the export button.
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