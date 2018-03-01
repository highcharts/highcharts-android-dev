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



public class HICondition implements HIChartsJSONSerializable { 


/**
The responsive rule applies if the chart width is greater than this.
* default: 0
*/
	public Number minWidth;

/**
A callback function to gain complete control on when the responsive
rule applies. Return true if it applies. This opens for checking
against other metrics than the chart size, or example the document
size or other elements.
*/
	public HIFunction callback;

/**
The responsive rule applies if the chart height is greater than this.
* default: 0
*/
	public Number minHeight;

/**
The responsive rule applies if the chart width is less than this.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/ : Max width is 500
*/
	public Number maxWidth;

/**
The responsive rule applies if the chart height is less than this.
*/
	public Number maxHeight;


	public HICondition() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.minWidth != null) {
			params.put("minWidth", this.minWidth);
		}
		if (this.callback != null) {
			params.put("callback", this.callback);
		}
		if (this.minHeight != null) {
			params.put("minHeight", this.minHeight);
		}
		if (this.maxWidth != null) {
			params.put("maxWidth", this.maxWidth);
		}
		if (this.maxHeight != null) {
			params.put("maxHeight", this.maxHeight);
		}
		return params;
	}

}