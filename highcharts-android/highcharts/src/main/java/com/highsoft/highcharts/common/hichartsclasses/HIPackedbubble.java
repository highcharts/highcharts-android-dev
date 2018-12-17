/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





/**
/** A packedbubble series. If the type option is not specified, it is inherited from chart.type. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all packedbubble series are defined in  `plotOptions.packedbubble`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     packedbubble: {       // shared options for all packedbubble series     }   },   series: [{     // specific options for this series instance     type: 'packedbubble'   }] });  
*/

public class HIPackedbubble extends HISeries {
	private Boolean displayNegative;
/**
/** Whether to display negative sized bubbles. The threshold is given by the zThreshold option, and negative bubbles can be visualized by setting negativeColor. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-negative/">Negative bubbles</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setDisplayNegative(Boolean displayNegative) {
		this.displayNegative = displayNegative;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDisplayNegative(){ return displayNegative; }

	private Number zThreshold;
/**
/** When displayNegative is false, bubbles with lower Z values are skipped. When displayNegative is true and a negativeColor is given, points with lower Z is colored. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-negative/">Negative bubbles</a>
*/
	public void setZThreshold(Number zThreshold) {
		this.zThreshold = zThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZThreshold(){ return zThreshold; }



	public HIPackedbubble() {
		super(); 
		this.setType("packedbubble");
	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.displayNegative != null) {
			params.put("displayNegative", this.displayNegative);
		}
		if (this.zThreshold != null) {
			params.put("zThreshold", this.zThreshold);
		}
		return params;
	}

}