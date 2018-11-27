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





public class HINormal extends Observable implements HIChartsJSONSerializable { 

	private HIAnimationOptionsObject animation;
/**
/** Animation when returning to normal state after hovering. 
*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }



	public HINormal() {

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
		if (this.animation != null) {
			params.put("animation", this.animation);
		}
		return params;
	}

}