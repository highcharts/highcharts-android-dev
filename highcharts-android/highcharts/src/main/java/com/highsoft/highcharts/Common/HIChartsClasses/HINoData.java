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
* description: Options for displaying a message like "No data to display". 
This feature requires the file no-data-to-display.js to be loaded in the page. 
The actual text to display is set in the lang.noData option.
*/
public class HINoData implements HIChartsJSONSerializable { 


/**
* description: Whether to insert the label as HTML, or as pseudo-HTML rendered with
SVG.
* default: false
*/
	public Boolean useHTML;

/**
* description: The position of the no-data label, relative to the plot area.
* default: { "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }
*/
	public HIPosition position;

/**
* description: An object of additional SVG attributes for the no-data label.
*/
	public Object attr;

/**
* description: CSS styles for the no-data label.
*/
	public HIStyle style;


	public HINoData() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.attr != null) {
			params.put("attr", this.attr);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		return params;
	}

}