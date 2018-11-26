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





public class HIGuideBox extends Observable implements HIChartsJSONSerializable { 

	private HIDefault defaults;
/**
/** Style options for the guide box defaults state. 
*/
	public void setDefault(HIDefault defaults) {
		this.defaults = defaults;
		this.defaults.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDefault getDefault(){ return defaults; }



	public HIGuideBox() {

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
		if (this.defaults != null) {
			params.put("default", this.defaults.getParams());
		}
		return params;
	}

}