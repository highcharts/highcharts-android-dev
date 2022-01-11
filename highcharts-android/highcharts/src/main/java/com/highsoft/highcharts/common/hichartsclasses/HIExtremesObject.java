/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIExtremesObject extends HIFoundation { 

	private Number dataMax;
	/**
 The maximum value of the axis' associated series. 
	*/
	public void setDataMax(Number dataMax) {
		this.dataMax = dataMax;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDataMax(){ return dataMax; }

	private Number dataMin;
	/**
 The minimum value of the axis' associated series. 
	*/
	public void setDataMin(Number dataMin) {
		this.dataMin = dataMin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDataMin(){ return dataMin; }

	private Number max;
	/**
 The maximum axis value, either automatic or set manually. If the `max` option is not set, `maxPadding` is 0 and `endOnTick` is false, this value will be the same as `dataMax`. 
	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private Number min;
	/**
 The minimum axis value, either automatic or set manually. If the `min` option is not set, `minPadding` is 0 and `startOnTick` is false, this value will be the same as `dataMin`. 
	*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }

	private Number userMax;
	/**
 The user defined maximum, either from the `max` option or from a zoom or `setExtremes` action. 
	*/
	public void setUserMax(Number userMax) {
		this.userMax = userMax;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getUserMax(){ return userMax; }

	private Number userMin;
	/**
 The user defined minimum, either from the `min` option or from a zoom or `setExtremes` action. 
	*/
	public void setUserMin(Number userMin) {
		this.userMin = userMin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getUserMin(){ return userMin; }



	public HIExtremesObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.dataMax != null) {
			params.put("dataMax", this.dataMax);
		}
		if (this.dataMin != null) {
			params.put("dataMin", this.dataMin);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.userMax != null) {
			params.put("userMax", this.userMax);
		}
		if (this.userMin != null) {
			params.put("userMin", this.userMin);
		}
		return params;
	}

}