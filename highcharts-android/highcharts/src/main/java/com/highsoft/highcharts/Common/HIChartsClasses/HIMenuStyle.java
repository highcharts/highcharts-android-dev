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
* description: CSS styles for the popup menu appearing by default when the export
icon is clicked. This menu is rendered in HTML.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menustyle/ : Light gray menu background

* default: { "border": "1px solid #999999", "background": "#ffffff", "padding": "5px 0" }
*/
public class HIMenuStyle implements HIChartsJSONSerializable { 

	public String padding;
	public String background;
	public String border;


	public HIMenuStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.background != null) {
			params.put("background", this.background);
		}
		if (this.border != null) {
			params.put("border", this.border);
		}
		return params;
	}

}