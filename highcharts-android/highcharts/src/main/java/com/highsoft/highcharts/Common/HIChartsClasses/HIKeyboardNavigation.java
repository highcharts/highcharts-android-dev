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



public class HIKeyboardNavigation implements HIChartsJSONSerializable { 


/**
Enable/disable keyboard navigation for the legend. Requires the Accessibility
module.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
Options for the focus border drawn around elements while
navigating through them.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-focus">Custom focus ring</a>*/
	public HIFocusBorder focusBorder;

/**
Set the keyboard navigation mode for the chart. Can be "normal"
or "serialize". In normal mode, left/right arrow keys move
between points in a series, while up/down arrow keys move between
series. Up/down navigation acts intelligently to figure out which
series makes sense to move to from any given point.

In "serialize" mode, points are instead navigated as a single 
list. Left/right behaves as in "normal" mode. Up/down arrow keys
will behave like left/right. This is useful for unifying 
navigation behavior with/without screen readers enabled.
 <br><br><b>default:</b><br><br>&ensp;normal*/
	public String mode;

/**
Skip null points when navigating through points with the
keyboard.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean skipNullPoints;


	public HIKeyboardNavigation() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.focusBorder != null) {
			params.put("focusBorder", this.focusBorder.getParams());
		}
		if (this.mode != null) {
			params.put("mode", this.mode);
		}
		if (this.skipNullPoints != null) {
			params.put("skipNullPoints", this.skipNullPoints);
		}
		return params;
	}

}