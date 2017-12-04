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
* description: Additional styles to apply to the X axis label for a point that
has drilldown data. By default it is underlined and blue to invite
to interaction.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/ : Label styles
* default: { "cursor": "pointer", "color": "#003399", "fontWeight": "bold", "textDecoration": "underline" }
*/
public class HIActiveAxisLabelStyle implements HIChartsJSONSerializable { 

	public String color;
	public String fontWeight;
	public String cursor;
	public String textDecoration;


	public HIActiveAxisLabelStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.textDecoration != null) {
			params.put("textDecoration", this.textDecoration);
		}
		return params;
	}

}