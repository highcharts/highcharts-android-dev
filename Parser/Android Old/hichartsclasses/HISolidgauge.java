/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



	/**
 A solid gauge is a circular gauge where the value is indicated by a filled arc, and the color of the arc may variate with the value. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all solidgauge series are defined in  `plotOptions.solidgauge`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     solidgauge: {       // shared options for all solidgauge series     }   },   series: [{     // specific options for this series instance     type: 'solidgauge'   }] }); `        <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/">Solid gauges</a>
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

	private Object /* Number, String */ innerRadius;
	/**
 The inner radius for points in a solid gauge. Can be given as a number (pixels) or percentage string. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/solidgauge-radius/">Individual radius and innerRadius</a>
 <br><br><b>defaults:</b><br><br>&ensp;60	*/
	public void setInnerRadius(Object /* Number, String */ innerRadius) {
		this.innerRadius = innerRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getInnerRadius(){ return innerRadius; }

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

	private Object /* Number, String */ radius;
	/**
 The outer radius for points in a solid gauge. Can be given as a number (pixels) or percentage string. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/solidgauge-radius/">Individual radius and innerRadius</a>
 <br><br><b>defaults:</b><br><br>&ensp;100	*/
	public void setRadius(Object /* Number, String */ radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getRadius(){ return radius; }



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
		if (this.rounded != null) {
			params.put("rounded", this.rounded);
		}
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		if (this.overshoot != null) {
			params.put("overshoot", this.overshoot);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		return params;
	}

}