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
* description: CSS styles for the tooltip. The tooltip can also be styled through
the CSS class .highcharts-tooltip.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/style/ : Greater padding, bold text
* default: { "color": "#333333", "cursor": "default", "fontSize": "12px", "pointerEvents": "none", "whiteSpace": "nowrap" }
*/
public class HIStyle implements HIChartsJSONSerializable { 

	public String fontSize;
	public String textOutline;
	public String color;
	public String fontWeight;
	public String cursor;
	public String backgroundColor;
	public String textAlign;
	public Number opacity;
	public String position;
	public String textOverflow;

/**
* description: The font family to use for the word cloud.
* default: Impact, sans-serif
*/
	public String fontFamily;
	public String pointerEvents;
	public String whiteSpace;


	public HIStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.textOutline != null) {
			params.put("textOutline", this.textOutline);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		if (this.textOverflow != null) {
			params.put("textOverflow", this.textOverflow);
		}
		if (this.fontFamily != null) {
			params.put("fontFamily", this.fontFamily);
		}
		if (this.pointerEvents != null) {
			params.put("pointerEvents", this.pointerEvents);
		}
		if (this.whiteSpace != null) {
			params.put("whiteSpace", this.whiteSpace);
		}
		return params;
	}

}