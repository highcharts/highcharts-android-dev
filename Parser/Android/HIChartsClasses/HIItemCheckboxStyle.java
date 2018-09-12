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



public class HIItemCheckboxStyle extends Observable implements HIChartsJSONSerializable { 

	private String position;
	public void setPosition(String position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition(){ return position; }

	private String width;
	public void setWidth(String width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWidth(){ return width; }

	private String height;
	public void setHeight(String height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHeight(){ return height; }



	public HIItemCheckboxStyle() {

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
		if (this.position != null) {
			params.put("position", this.position);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		return params;
	}

}