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
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;





public class HIAnimationOptionsObject extends Observable implements HIChartsJSONSerializable { 

	private Number duration;
/**
/** The animation duration in milliseconds. 
*/
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }

	private String easing;
/**
/** The name of an easing function as defined on the `Math` object. 
*/
	public void setEasing(String easing) {
		this.easing = easing;
		this.setChanged();
		this.notifyObservers();
	}

	public String getEasing(){ return easing; }

	private HIFunction complete;
/**
/** A callback function to exectute when the animation finishes. 
*/
	public void setComplete(HIFunction complete) {
		this.complete = complete;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getComplete(){ return complete; }

	private HIFunction step;
/**
/** A callback function to execute on each step of each attribute or CSS property that's being animated. The first argument contains information about the animation and progress. 
*/
	public void setStep(HIFunction step) {
		this.step = step;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getStep(){ return step; }



	public HIAnimationOptionsObject() {

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
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		if (this.easing != null) {
			params.put("easing", this.easing);
		}
		if (this.complete != null) {
			params.put("complete", this.complete);
		}
		if (this.step != null) {
			params.put("step", this.step);
		}
		return params;
	}

}