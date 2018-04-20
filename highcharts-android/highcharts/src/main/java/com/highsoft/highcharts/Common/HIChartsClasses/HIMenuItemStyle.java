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



public class HIMenuItemStyle implements HIChartsJSONSerializable { 

	public String padding;
	public String color;
	public String transition;

/**
Defaults to 14px on touch devices and 11px on desktop.
*/
	public String fontSize;
	public String background;


	public HIMenuItemStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.transition != null) {
			params.put("transition", this.transition);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.background != null) {
			params.put("background", this.background);
		}
		return params;
	}

}