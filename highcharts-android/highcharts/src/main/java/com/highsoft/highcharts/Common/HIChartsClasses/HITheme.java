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



public class HITheme implements HIChartsJSONSerializable { 


/**
The Z index for the reset zoom button. The default value
places it below the tooltip that has Z index 7.
*/
	public Number zIndex;
	public Number padding;
	public String stroke;

/**
The default fill exists only to capture hover events.
*/
	public String fill;


	public HITheme() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		return params;
	}

}