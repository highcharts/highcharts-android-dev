/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;



	/**
 A gauge series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all gauge series are defined in  `plotOptions.gauge`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     gauge: {       // shared options for all gauge series     }   },   series: [{     // specific options for this series instance     type: 'gauge'   }] }); `       
	*/

public class HIGauge extends HISeries {
	private HIDial dial;
	/**
 Options for the dial or arrow pointer of the gauge. In styled mode, the dial is styled with the .highcharts-gauge-series .highcharts-dial rule. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/gauge/">Styled mode</a>
	*/
	public void setDial(HIDial dial) {
		this.dial = dial;
		this.dial.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDial getDial(){ return dial; }

	private Number overshoot;
	/**
 Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis when this option is set to 5. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-overshoot/">Allow 5 degrees overshoot</a>
	*/
	public void setOvershoot(Number overshoot) {
		this.overshoot = overshoot;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOvershoot(){ return overshoot; }

	private Boolean wrap;
	/**
 When this option is true, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to 360, a value of 400 will point to 40\. When wrap is false, the dial stops at 360. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setWrap(Boolean wrap) {
		this.wrap = wrap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getWrap(){ return wrap; }

	private HIPivot pivot;
	/**
 Options for the pivot or the center point of the gauge. In styled mode, the pivot is styled with the .highcharts-gauge-series .highcharts-pivot rule. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/gauge/">Styled mode</a>
	*/
	public void setPivot(HIPivot pivot) {
		this.pivot = pivot;
		this.pivot.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPivot getPivot(){ return pivot; }



	public HIGauge() {
		super(); 
		this.setType("gauge");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
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