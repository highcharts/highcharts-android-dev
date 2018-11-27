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
import com.highsoft.highcharts.common.HIColor;





public class HISide extends Observable implements HIChartsJSONSerializable { 

	private HIColor color;
/**
/** The color of the panel. 
 <br><br><b>defaults:</b><br><br>&ensp;transparent*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number size;
/**
/** The thickness of the panel. 
 <br><br><b>defaults:</b><br><br>&ensp;1*/
	public void setSize(Number size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSize(){ return size; }



	public HISide() {

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
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}