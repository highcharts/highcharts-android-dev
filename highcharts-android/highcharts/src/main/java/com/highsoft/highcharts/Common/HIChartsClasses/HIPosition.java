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



public class HIPosition implements HIChartsJSONSerializable { 


/**
Vertical offset of the button.
*/
	public Number y;

/**
Horizontal offset of the button.
 <br><br><b>default:</b><br><br>&ensp;-10*/
	public Number x;

/**
Horizontal alignment of the button.
 <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"]*/
	public String align;

/**
Vertical alignment of the button.
 <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"] <br><br><b>default:</b><br><br>&ensp;top*/
	public String verticalAlign;


	public HIPosition() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		return params;
	}

}