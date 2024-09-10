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
 A `solidgauge` series. If the `type` option is not specified, it is inherited from `chart.type`. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `solidgauge` series are defined in  `plotOptions.solidgauge`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     solidgauge: {       // shared options for all solidgauge series     }   },   series: `{     // specific options for this series instance     type: 'solidgauge'   }] }); ``` **TypeScript:** - the [type` option must always be set. - when accessing an array of series, the combined set of all series types is  represented by `Highcharts.SeriesOptionsType  `. Narrowing down to the  specific type can be done by checking the `type` property. ``` if (chart.options.series?.[0]?.type === solidgauge) {   // code specific to the solidgauge series } ```       
	*/

public class HISolidgauge extends HISeries {
	private Boolean colorByPoint;
	/**
 Whether to give each point an individual color. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Boolean rounded;
	/**
 Whether to draw rounded edges on the gauge. This options adds the radius of the rounding to the ends of the arc, so it extends past the actual values. When `borderRadius` is set, it takes precedence over `rounded`. A `borderRadius` of 50% behaves like `rounded`, except the shape is not extended past its value. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setRounded(Boolean rounded) {
		this.rounded = rounded;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRounded(){ return rounded; }

	private String innerRadius;
	/**
 The inner radius for points in a solid gauge. Can be given only in percentage, either as a number or a string like `"50%"`. 
 <br><br><b>defaults:</b><br><br>&ensp;"60%"	*/
	public void setInnerRadius(String innerRadius) {
		this.innerRadius = innerRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInnerRadius(){ return innerRadius; }

	private Number overshoot;
	/**
/** * description: Allow the gauge to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis when this option is set to 5. * demo: * [Allow 5 degrees overshoot](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-overshoot/) 
* defaults: 0
*/
	public void setOvershoot(Number overshoot) {
		this.overshoot = overshoot;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOvershoot(){ return overshoot; }

	private String radius;
	/**
 The outer radius for points in a solid gauge. Can be given only in percentage, either as a number or a string like `"100%"`. 
 <br><br><b>defaults:</b><br><br>&ensp;"100%"	*/
	public void setRadius(String radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRadius(){ return radius; }



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