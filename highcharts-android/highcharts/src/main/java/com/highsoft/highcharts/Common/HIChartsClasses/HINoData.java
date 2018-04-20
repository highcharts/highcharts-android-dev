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



public class HINoData implements HIChartsJSONSerializable { 


/**
The position of the no-data label, relative to the plot area.
 <br><br><b>default:</b><br><br>&ensp;{ "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }*/
	public HIPosition position;

/**
CSS styles for the no-data label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Styled no-data text</a>*/
	public HIStyle style;

/**
An object of additional SVG attributes for the no-data label.
*/
	public Object attr;

/**
Whether to insert the label as HTML, or as pseudo-HTML rendered with
SVG.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean useHTML;


	public HINoData() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.attr != null) {
			params.put("attr", this.attr);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		return params;
	}

}