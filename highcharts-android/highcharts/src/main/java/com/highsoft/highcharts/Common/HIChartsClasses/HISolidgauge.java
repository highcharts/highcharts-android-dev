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
A solidgauge series. If the type option
is not specified, it is inherited from chart.type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all solidgauge series are defined in [plotOptions.solidgauge](plotOptions.solidgauge).
3. Options for one single series are given in
[the series instance array](series.solidgauge).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        solidgauge: {
            // shared options for all solidgauge series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'solidgauge'
    }]
});

*/

public class HISolidgauge extends HISeries {

/**
Whether to give each point an individual color.
*/
	public Boolean colorByPoint;

/**
* description: Allow the gauge to overshoot the end of the perimeter axis by this
many degrees. Say if the gauge axis goes from 0 to 60, a value of
100, or 1000, will show 5 degrees beyond the end of the axis when this
option is set to 5.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-overshoot/ : Allow 5 degrees overshoot* default: 0
*/
	public Number overshoot;

/**
Wether to draw rounded edges on the gauge.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-activity/">Activity Gauge</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean rounded;


	public HISolidgauge() {
		super(); 
		this.type = "solidgauge";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.overshoot != null) {
			params.put("overshoot", this.overshoot);
		}
		if (this.rounded != null) {
			params.put("rounded", this.rounded);
		}
		return params;
	}

}