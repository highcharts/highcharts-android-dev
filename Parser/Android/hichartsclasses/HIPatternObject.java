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





public class HIPatternObject extends Observable implements HIChartsJSONSerializable { 

	private Boolean animation;
/**
/** Animation options for the image pattern loading. 
*/
	public void setAnimation(Boolean animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAnimation(){ return animation; }

	private Object pattern;
/**
/** Pattern options 
*/
	public void setPattern(Object pattern) {
		this.pattern = pattern;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPattern(){ return pattern; }



	public HIPatternObject() {

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
		if (this.pattern != null) {
			params.put("pattern", this.pattern);
		}
		return params;
	}

}