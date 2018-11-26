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





public class HIAnimation extends Observable implements HIChartsJSONSerializable { 

	private Number duration;
/**
/** The duration of the hover animation in milliseconds. By defaults the hover state animates quickly in, and slowly back to normal. 
*/
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }



	public HIAnimation() {

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
		return params;
	}

}