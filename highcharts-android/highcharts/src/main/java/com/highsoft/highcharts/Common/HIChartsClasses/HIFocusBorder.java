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



public class HIFocusBorder implements HIChartsJSONSerializable { 


/**
Focus border margin around the elements.
* default: 2
*/
	public Number margin;

/**
Style options for the focus border drawn around elements 
while navigating through them. Note that some browsers in 
addition draw their own borders for focused elements. These
automatic borders can not be styled by Highcharts.

In styled mode, the border is given the 
.highcharts-focus-border class.
*/
	public HIStyle style;

/**
Enable/disable focus border for chart.
* default: true
*/
	public Boolean enabled;

/**
Hide the browser's default focus indicator.
* default: true
*/
	public Boolean hideBrowserFocusOutline;


	public HIFocusBorder() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.hideBrowserFocusOutline != null) {
			params.put("hideBrowserFocusOutline", this.hideBrowserFocusOutline);
		}
		return params;
	}

}