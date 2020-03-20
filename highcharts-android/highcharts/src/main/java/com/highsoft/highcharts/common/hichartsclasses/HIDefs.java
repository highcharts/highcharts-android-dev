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



public class HIDefs extends HIFoundation { 

	private HISVGDefinitionObject reverseArrow;
	public void setReverseArrow(HISVGDefinitionObject reverseArrow) {
		this.reverseArrow = reverseArrow;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGDefinitionObject getReverseArrow(){ return reverseArrow; }

	private HISVGDefinitionObject arrow;
	public void setArrow(HISVGDefinitionObject arrow) {
		this.arrow = arrow;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGDefinitionObject getArrow(){ return arrow; }



	public HIDefs() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.reverseArrow != null) {
			params.put("reverse-arrow", this.reverseArrow.getParams());
		}
		if (this.arrow != null) {
			params.put("arrow", this.arrow.getParams());
		}
		return params;
	}

}