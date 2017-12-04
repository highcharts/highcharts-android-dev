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
* description: The position of the button.
*/
public class HIPosition implements HIChartsJSONSerializable { 


/**
* description: Vertical alignment of the button.

* accepted values: ["top", "middle", "bottom"]
* default: top
*/
	public String verticalAlign;

/**
* description: Horizontal offset of the button.
* default: -10
*/
	public Number x;

/**
* description: Vertical offset of the button.
* default: 10
*/
	public Number y;

/**
* description: Horizontal alignment of the button.

* accepted values: ["left", "center", "right"]
* default: right
*/
	public String align;


	public HIPosition() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		return params;
	}

}