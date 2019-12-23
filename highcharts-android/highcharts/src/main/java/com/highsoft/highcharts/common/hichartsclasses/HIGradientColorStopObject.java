/**
* (c) 2009-20one8 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIGradientColorStopObject extends HIFoundation { 

	private Number zero;
	public void setZero(Number zero) {
		this.zero = zero;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZero(){ return zero; }

	private String one;
	public void setOne(String one) {
		this.one = one;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOne(){ return one; }



	public HIGradientColorStopObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.zero != null) {
			params.put("0", this.zero);
		}
		if (this.one != null) {
			params.put("1", this.one);
		}
		return params;
	}

}