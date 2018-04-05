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



/**
A gauge series. If the type option is not
specified, it is inherited from chart.type.

For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to
plotOptions.gauge.
*/

public class HIGauge extends HISeries {

/**
Options for the dial or arrow pointer of the gauge.

In styled mode, the dial is styled with the
.highcharts-gauge-series .highcharts-dial rule.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/gauge/">Styled mode</a>*/
	public HIDial dial;

/**
Allow the dial to overshoot the end of the perimeter axis by this
many degrees. Say if the gauge axis goes from 0 to 60, a value of
100, or 1000, will show 5 degrees beyond the end of the axis when this
option is set to 5.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-overshoot/">Allow 5 degrees overshoot</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number overshoot;

/**
When this option is true, the dial will wrap around the axes. For
instance, in a full-range gauge going from 0 to 360, a value of 400
will point to 40\. When wrap is false, the dial stops at 360.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean wrap;

/**
Options for the pivot or the center point of the gauge.

In styled mode, the pivot is styled with the
.highcharts-gauge-series .highcharts-pivot rule.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/gauge/">Styled mode</a>*/
	public HIPivot pivot;


	public HIGauge() {
		super(); 
		this.type = "gauge";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.dial != null) {
			params.put("dial", this.dial.getParams());
		}
		if (this.overshoot != null) {
			params.put("overshoot", this.overshoot);
		}
		if (this.wrap != null) {
			params.put("wrap", this.wrap);
		}
		if (this.pivot != null) {
			params.put("pivot", this.pivot.getParams());
		}
		return params;
	}

}