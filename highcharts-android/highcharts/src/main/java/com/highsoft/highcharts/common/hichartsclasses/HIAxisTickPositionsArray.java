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



public class HIAxisTickPositionsArray extends HIFoundation { 

	private HITimeTicksInfoObject info;
	public void setInfo(HITimeTicksInfoObject info) {
		this.info = info;
		this.setChanged();
		this.notifyObservers();
	}

	public HITimeTicksInfoObject getInfo(){ return info; }



	public HIAxisTickPositionsArray() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.info != null) {
			params.put("info", this.info.getParams());
		}
		return params;
	}

}