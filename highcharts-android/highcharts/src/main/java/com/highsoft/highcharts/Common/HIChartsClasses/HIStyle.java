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



public class HIStyle implements HIChartsJSONSerializable { 

	public String fontWeight;
	public String color;
	public String fontSize;
	public Number opacity;
	public String position;
	public String textAlign;
	public String backgroundColor;
	public String fontFamily;
	public String textOutline;

/**
Border radius of the focus border.
 <br><br><b>default:</b><br><br>&ensp;3*/
	public Number borderRadius;

/**
Line width of the focus border.
 <br><br><b>default:</b><br><br>&ensp;2*/
	public Number lineWidth;
	public String textOverflow;
	public String cursor;
	public String pointerEvents;
	public String whiteSpace;


	public HIStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor);
		}
		if (this.fontFamily != null) {
			params.put("fontFamily", this.fontFamily);
		}
		if (this.textOutline != null) {
			params.put("textOutline", this.textOutline);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.textOverflow != null) {
			params.put("textOverflow", this.textOverflow);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
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