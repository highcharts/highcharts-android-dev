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



public class HIBreaks implements HIChartsJSONSerializable { 


/**
The point where the break ends.
*/
	public Number to;

/**
A number indicating how much space should be left between the start
and the end of the break. The break size is given in axis units,
so for instance on a datetime axis, a break size of 3600000 would
indicate the equivalent of an hour.
* default: 0
*/
	public Number breakSize;

/**
The point where the break starts.
*/
	public Number from;

/**
Defines an interval after which the break appears again. By default
the breaks do not repeat.
* default: 0
*/
	public Number repeat;


	public HIBreaks() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.breakSize != null) {
			params.put("breakSize", this.breakSize);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.repeat != null) {
			params.put("repeat", this.repeat);
		}
		return params;
	}

}