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



public class HIRules implements HIChartsJSONSerializable { 


/**
Under which conditions the rule applies.
*/
	public HICondition condition;

/**
A full set of chart options to apply as overrides to the general
chart options. The chart options are applied when the given rule
is active.

A special case is configuration objects that take arrays, for example
xAxis, yAxis or series. For these
collections, an id option is used to map the new option set to
an existing object. If an existing object of the same id is not found,
the item of the same indexupdated. So for example, setting chartOptions
with two series items without an id, will cause the existing chart's
two series to be updated with respective options.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/">Legend</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/">Class name</a>*/
	public Object chartOptions;


	public HIRules() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.condition != null) {
			params.put("condition", this.condition.getParams());
		}
		if (this.chartOptions != null) {
			params.put("chartOptions", this.chartOptions);
		}
		return params;
	}

}