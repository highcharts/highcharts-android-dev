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
* description: CSS styles for each legend item. Only a subset of CSS is supported,
notably those options related to text. The default textOverflow
property makes long texts truncate. Set it to null to wrap text
instead. A width property can be added to control the text width.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemstyle/ : Bold black text
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/itemstyle/ : Item text styles
* default: { "color": "#333333", "cursor": "pointer", "fontSize": "12px", "fontWeight": "bold", "textOverflow": "ellipsis" }
*/
public class HIItemStyle implements HIChartsJSONSerializable { 

	public String fontWeight;
	public String textOverflow;
	public String fontSize;
	public String color;


	public HIItemStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.textOverflow != null) {
			params.put("textOverflow", this.textOverflow);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		return params;
	}

}