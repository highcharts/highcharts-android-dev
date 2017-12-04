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
* description: Under which conditions the rule applies.
*/
public class HICondition implements HIChartsJSONSerializable { 


/**
* description: A callback function to gain complete control on when the responsive
rule applies. Return true if it applies. This opens for checking
against other metrics than the chart size, or example the document
size or other elements.
*/
	public HIGFunction /* Function */ callback;

/**
* description: The responsive rule applies if the chart width is less than this.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/ : Max width is 500
*/
	public Number maxWidth;

/**
* description: The responsive rule applies if the chart height is less than this.
*/
	public Number maxHeight;

/**
* description: The responsive rule applies if the chart width is greater than this.
* default: 0
*/
	public Number minWidth;

/**
* description: The responsive rule applies if the chart height is greater than this.
* default: 0
*/
	public Number minHeight;


	public HICondition() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.callback != null) {
			params.put("callback", this.callback);
		}
		if (this.maxWidth != null) {
			params.put("maxWidth", this.maxWidth);
		}
		if (this.maxHeight != null) {
			params.put("maxHeight", this.maxHeight);
		}
		if (this.minWidth != null) {
			params.put("minWidth", this.minWidth);
		}
		if (this.minHeight != null) {
			params.put("minHeight", this.minHeight);
		}
		return params;
	}

}