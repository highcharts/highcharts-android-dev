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





public class HIColorVariation extends Observable implements HIChartsJSONSerializable { 

	private Number to;
/**
/** The ending value of a color variation. The last sibling will receive this value. 
*/
	public void setTo(Number to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTo(){ return to; }

	private String key;
/**
/** The key of a color variation. Currently supports brightness only. <br><br><b>accepted values:</b><br><br>&ensp;["brightness"]
*/
	public void setKey(String key) {
		this.key = key;
		this.setChanged();
		this.notifyObservers();
	}

	public String getKey(){ return key; }



	public HIColorVariation() {

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
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.key != null) {
			params.put("key", this.key);
		}
		return params;
	}

}