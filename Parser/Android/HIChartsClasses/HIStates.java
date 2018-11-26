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





public class HIStates extends Observable implements HIChartsJSONSerializable { 

	private HIHover hover;
	public void setHover(HIHover hover) {
		this.hover = hover;
		this.hover.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHover getHover(){ return hover; }

	private HISelect select;
	public void setSelect(HISelect select) {
		this.select = select;
		this.select.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISelect getSelect(){ return select; }

	private HINormal normal;
/**
/** The normal state of a single point marker. Currently only used for setting animation when returning to normal state from hover. 
*/
	public void setNormal(HINormal normal) {
		this.normal = normal;
		this.normal.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINormal getNormal(){ return normal; }



	public HIStates() {

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
		if (this.hover != null) {
			params.put("hover", this.hover.getParams());
		}
		if (this.select != null) {
			params.put("select", this.select.getParams());
		}
		if (this.normal != null) {
			params.put("normal", this.normal.getParams());
		}
		return params;
	}

}