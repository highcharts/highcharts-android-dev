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



public class HILinearGradient extends Observable implements HIChartsJSONSerializable { 

	private Number y1;
	public void setY1(Number y1) {
		this.y1 = y1;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY1(){ return y1; }

	private Number x2;
	public void setX2(Number x2) {
		this.x2 = x2;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX2(){ return x2; }

	private Number x1;
	public void setX1(Number x1) {
		this.x1 = x1;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX1(){ return x1; }

	private Number y2;
	public void setY2(Number y2) {
		this.y2 = y2;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY2(){ return y2; }



	public HILinearGradient() {

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
		if (this.y1 != null) {
			params.put("y1", this.y1);
		}
		if (this.x2 != null) {
			params.put("x2", this.x2);
		}
		if (this.x1 != null) {
			params.put("x1", this.x1);
		}
		if (this.y2 != null) {
			params.put("y2", this.y2);
		}
		return params;
	}

}