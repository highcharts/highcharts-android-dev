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



public class HIActiveWhen extends HIFoundation { 

	private Number crossingDown;
	/**
 Track is only active when `prop` was above, and is now at or below this value. If both `crossingUp` and `crossingDown` are defined, the track is active if either condition is met. 
	*/
	public void setCrossingDown(Number crossingDown) {
		this.crossingDown = crossingDown;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCrossingDown(){ return crossingDown; }

	private Number max;
	/**
 Track is only active when `prop` is below or at this value. 
	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private String prop;
	/**
 The point property to compare, for example `y` or `x`. 
	*/
	public void setProp(String prop) {
		this.prop = prop;
		this.setChanged();
		this.notifyObservers();
	}

	public String getProp(){ return prop; }

	private Number crossingUp;
	/**
 Track is only active when `prop` was below, and is now at or above this value. If both `crossingUp` and `crossingDown` are defined, the track is active if either condition is met. 
	*/
	public void setCrossingUp(Number crossingUp) {
		this.crossingUp = crossingUp;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCrossingUp(){ return crossingUp; }

	private Number min;
	/**
 Track is only active when `prop` is above or at this value. 
	*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }



	public HIActiveWhen() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.crossingDown != null) {
			params.put("crossingDown", this.crossingDown);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.prop != null) {
			params.put("prop", this.prop);
		}
		if (this.crossingUp != null) {
			params.put("crossingUp", this.crossingUp);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		return params;
	}

}