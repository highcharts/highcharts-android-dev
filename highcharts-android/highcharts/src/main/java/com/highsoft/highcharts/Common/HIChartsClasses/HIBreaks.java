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
* description: An array defining breaks in the axis, the sections defined will be
left out and all the points shifted closer to each other.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-simple/ : Simple break
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/ : Advanced with callback
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/intraday-breaks/ : Break on nights and weekends
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/ : Broken Y axis
*/
public class HIBreaks implements HIChartsJSONSerializable { 


/**
* description: A number indicating how much space should be left between the start
and the end of the break. The break size is given in axis units,
so for instance on a datetime axis, a break size of 3600000 would
indicate the equivalent of an hour.
* default: 0
*/
	public Number breakSize;

/**
* description: Defines an interval after which the break appears again. By default
the breaks do not repeat.
* default: 0
*/
	public Number repeat;

/**
* description: The point where the break ends.
*/
	public Number to;

/**
* description: The point where the break starts.
*/
	public Number from;


	public HIBreaks() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.breakSize != null) {
			params.put("breakSize", this.breakSize);
		}
		if (this.repeat != null) {
			params.put("repeat", this.repeat);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		return params;
	}

}