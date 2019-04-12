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
 A solidgauge series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all solidgauge series are defined in  `plotOptions.solidgauge`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     solidgauge: {       // shared options for all solidgauge series     }   },   series: [{     // specific options for this series instance     type: 'solidgauge'   }] }); `       
	*/

public class HISolidgauge extends HISeries {
	private Boolean colorByPoint;
	/**
 Whether to give each point an individual color. 
	*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number overshoot;
	/**
/** * description: Allow the gauge to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis when this option is set to 5. * demo:  •  Allow 5 degrees overshoot
* defaults: 0
*/
	public void setOvershoot(Number overshoot) {
		this.overshoot = overshoot;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOvershoot(){ return overshoot; }

	private Boolean rounded;
	/**
 Wether to draw rounded edges on the gauge. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-activity/">Activity Gauge</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setRounded(Boolean rounded) {
		this.rounded = rounded;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRounded(){ return rounded; }



	public HISolidgauge() {
		super(); 
		this.setType("solidgauge");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
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