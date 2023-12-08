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



public class HIFontMetricsObject extends HIFoundation { 

	private Number b;
	/**
 The baseline relative to the top of the box. 
	*/
	public void setB(Number b) {
		this.b = b;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getB(){ return b; }

	private Number f;
	/**
 The font size. 
	*/
	public void setF(Number f) {
		this.f = f;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getF(){ return f; }

	private Number h;
	/**
 The line height. 
	*/
	public void setH(Number h) {
		this.h = h;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getH(){ return h; }



	public HIFontMetricsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.b != null) {
			params.put("b", this.b);
		}
		if (this.f != null) {
			params.put("f", this.f);
		}
		if (this.h != null) {
			params.put("h", this.h);
		}
		return params;
	}

}