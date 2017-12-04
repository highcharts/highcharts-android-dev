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
* description: A solidgauge series. If the type option
is not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
solidgauge.
*/

public class HISolidgauge extends HISeries {

/**
* description: When this option is true, the dial will wrap around the axes. For
instance, in a full-range gauge going from 0 to 360, a value of 400
will point to 40. When wrap is false, the dial stops at 360.
* default: true
*/
	public Boolean wrap;

/**
* description: Allow the dial to overshoot the end of the perimeter axis by this
many degrees. Say if the gauge axis goes from 0 to 60, a value of
100, or 1000, will show 5 degrees beyond the end of the axis.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-overshoot/ : Allow 5 degrees overshoot
* default: 0
*/
	public Number overshoot;

/**
* description: Wether to draw rounded edges on the gauge.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-activity/ : Activity Gauge
* default: false
*/
	public Boolean rounded;

/**
* description: Whether to give each point an individual color.
* default: True
*/
	public Boolean colorByPoint;


	public HISolidgauge() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.wrap != null) {
			params.put("wrap", this.wrap);
		}
		if (this.overshoot != null) {
			params.put("overshoot", this.overshoot);
		}
		if (this.rounded != null) {
			params.put("rounded", this.rounded);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		return params;
	}

}