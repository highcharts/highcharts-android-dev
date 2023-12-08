/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIChartSelectionAxisContextObject extends HIFoundation { 

	private HIAxis axis;
	/**
 The selected Axis. 
	*/
	public void setAxis(HIAxis axis) {
		this.axis = axis;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAxis getAxis(){ return axis; }

	private Number max;
	/**
 The maximum axis value, either automatic or set manually. 
	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private Number min;
	/**
 The minimum axis value, either automatic or set manually. 
	*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }



	public HIChartSelectionAxisContextObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		return params;
	}

}