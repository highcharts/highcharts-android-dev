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
* description: CSS styles for the individual items within the popup menu appearing
by default when the export icon is clicked. The menu items are rendered
in HTML.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemstyle/ : Add a grey stripe to the left

* default: { "padding": "0.5em 1em", "color": "#333333", "background": "none" }
*/
public class HIMenuItemStyle implements HIChartsJSONSerializable { 


/**
* description: Defaults to 14px on touch devices and 11px on desktop.
*/
	public String fontSize;
	public String transition;
	public String color;
	public String padding;
	public String background;


	public HIMenuItemStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.transition != null) {
			params.put("transition", this.transition);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.background != null) {
			params.put("background", this.background);
		}
		return params;
	}

}