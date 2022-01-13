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



public class HIMinute extends HIFoundation { 

	private Boolean range;
	public void setRange(Boolean range) {
		this.range = range;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRange(){ return range; }

	private String main;
	public void setMain(String main) {
		this.main = main;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMain(){ return main; }



	public HIMinute() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.range != null) {
			params.put("range", this.range);
		}
		if (this.main != null) {
			params.put("main", this.main);
		}
		return params;
	}

}