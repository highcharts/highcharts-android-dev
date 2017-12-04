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
* description: A HTML label that can be positioned anywhere in the chart area.
*/
public class HIItems implements HIChartsJSONSerializable { 


/**
* description: CSS styles for each label. To position the label, use left and top
like this:
style: {
    left: '100px',
    top: '100px'
}
*/
	public HashMap<String,String> style;

/**
* description: Inner HTML or text for the label.
*/
	public String html;


	public HIItems() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.html != null) {
			params.put("html", this.html);
		}
		return params;
	}

}