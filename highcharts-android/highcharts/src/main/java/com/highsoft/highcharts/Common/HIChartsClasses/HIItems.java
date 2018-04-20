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



public class HIItems implements HIChartsJSONSerializable { 


/**
CSS styles for each label. To position the label, use left and top
like this:

style: {
    left: '100px',
    top: '100px'
}
*/
	public HashMap<String,String> style;

/**
Inner HTML or text for the label.
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