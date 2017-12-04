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
* description: CSS styles for the hover state of the individual items within the
popup menu appearing by default when the export icon is clicked.
 The menu items are rendered in HTML.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemhoverstyle/ : Bold text on hover

* default: { "background": "#335cad", "color": "#ffffff" }
*/
public class HIMenuItemHoverStyle implements HIChartsJSONSerializable { 

	public String background;
	public String color;


	public HIMenuItemHoverStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.background != null) {
			params.put("background", this.background);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		return params;
	}

}