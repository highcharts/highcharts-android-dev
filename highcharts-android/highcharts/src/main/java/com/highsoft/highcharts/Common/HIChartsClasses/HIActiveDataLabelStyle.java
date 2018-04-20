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



public class HIActiveDataLabelStyle implements HIChartsJSONSerializable { 

	public String cursor;
	public String color;
	public String textDecoration;
	public String fontWeight;


	public HIActiveDataLabelStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.textDecoration != null) {
			params.put("textDecoration", this.textDecoration);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		return params;
	}

}