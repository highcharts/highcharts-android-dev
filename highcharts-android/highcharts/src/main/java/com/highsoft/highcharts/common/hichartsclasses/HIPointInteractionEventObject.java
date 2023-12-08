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



public class HIPointInteractionEventObject extends HIFoundation { 

	private Boolean accumulate;
	public void setAccumulate(Boolean accumulate) {
		this.accumulate = accumulate;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAccumulate(){ return accumulate; }



	public HIPointInteractionEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.accumulate != null) {
			params.put("accumulate", this.accumulate);
		}
		return params;
	}

}