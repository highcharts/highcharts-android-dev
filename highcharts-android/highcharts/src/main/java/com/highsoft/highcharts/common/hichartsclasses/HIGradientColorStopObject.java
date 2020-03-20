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

	private Number _0;
	public void set_0(Number _0) {
		this._0 = _0;
		this.setChanged();
		this.notifyObservers();
	}

	public Number get_0(){ return _0; }

	private String _1;
	public void set1(String _1) {
		this._1 = _1;
		this.setChanged();
		this.notifyObservers();
	}

	public String get1(){ return _1; }



	public HIGradientColorStopObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this._0 != null) {
			params.put("0", this._0);
		}
		if (this._1 != null) {
			params.put("1", this._1);
		}
		return params;
	}

}