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



public class HIGradientColorStopObject extends HIFoundation { 

	private Number stop0;
	public void setStop0(Number stop0) {
		this.stop0 = stop0;
		this.setChanged();
		this.notifyObservers();
	}

	public Number get0(){ return stop0; }

	private String stop1;
	public void setStop1(String stop1) {
		this.stop1 = stop1;
		this.setChanged();
		this.notifyObservers();
	}

	public String get1(){ return stop1; }



	public HIGradientColorStopObject() {

	}

	@Override
	public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.stop0 != null) {
			params.put("0", this.stop0);
		}
		if (this.stop1 != null) {
			params.put("1", this.stop1);
		}
		return params;
	}

}