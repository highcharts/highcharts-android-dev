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



public class HILinearGradientColorObject extends HIFoundation { 

	private Number x1;
	/**
 Start horizontal position of the gradient. Float ranges 0-1. 
	*/
	public void setX1(Number x1) {
		this.x1 = x1;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX1(){ return x1; }

	private Number x2;
	/**
 End horizontal position of the gradient. Float ranges 0-1. 
	*/
	public void setX2(Number x2) {
		this.x2 = x2;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX2(){ return x2; }

	private Number y1;
	/**
 Start vertical position of the gradient. Float ranges 0-1. 
	*/
	public void setY1(Number y1) {
		this.y1 = y1;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY1(){ return y1; }

	private Number y2;
	/**
 End vertical position of the gradient. Float ranges 0-1. 
	*/
	public void setY2(Number y2) {
		this.y2 = y2;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY2(){ return y2; }



	public HILinearGradientColorObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.x1 != null) {
			params.put("x1", this.x1);
		}
		if (this.x2 != null) {
			params.put("x2", this.x2);
		}
		if (this.y1 != null) {
			params.put("y1", this.y1);
		}
		if (this.y2 != null) {
			params.put("y2", this.y2);
		}
		return params;
	}

}