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
import com.highsoft.highcharts.Common.HIColor;



public class HIDataClasses implements HIChartsJSONSerializable { 


/**
The color of each data class. If not set, the color is pulled
from the global or chart-specific colors array. In
styled mode, this option is ignored. Instead, use colors defined
in CSS.
*/
	public HIColor color;

/**
The end of the value range that the data class represents,
relating to the point value.

The range of each dataClass is closed in both ends, but can be
overridden by the next dataClass.
*/
	public Number to;

/**
The start of the value range that the data class represents,
relating to the point value.

The range of each dataClass is closed in both ends, but can be
overridden by the next dataClass.
*/
	public Number from;

/**
The name of the data class as it appears in the legend.
If no name is given, it is automatically created based on the
from and to values. For full programmatic control,
legend.labelFormatter can be used.
In the formatter, this.from and this.to can be accessed.
*/
	public String name;


	public HIDataClasses() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		return params;
	}

}