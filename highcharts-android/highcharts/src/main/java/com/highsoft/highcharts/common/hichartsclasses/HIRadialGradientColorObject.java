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



public class HIRadialGradientColorObject extends HIFoundation { 

	private Number cx;
	/**
 Center horizontal position relative to the shape. Float ranges 0-1. 
	*/
	public void setCx(Number cx) {
		this.cx = cx;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCx(){ return cx; }

	private Number cy;
	/**
 Center vertical position relative to the shape. Float ranges 0-1. 
	*/
	public void setCy(Number cy) {
		this.cy = cy;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCy(){ return cy; }

	private Number r;
	/**
 Radius relative to the shape. Float ranges 0-1. 
	*/
	public void setR(Number r) {
		this.r = r;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getR(){ return r; }



	public HIRadialGradientColorObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.cx != null) {
			params.put("cx", this.cx);
		}
		if (this.cy != null) {
			params.put("cy", this.cy);
		}
		if (this.r != null) {
			params.put("r", this.r);
		}
		return params;
	}

}