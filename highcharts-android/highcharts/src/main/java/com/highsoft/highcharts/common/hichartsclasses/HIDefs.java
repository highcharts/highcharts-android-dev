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

	private HIASTNode reverseArrow;
	public void setReverseArrow(HIASTNode reverseArrow) {
		this.reverseArrow = reverseArrow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIASTNode getReverseArrow(){ return reverseArrow; }

	private HIASTNode arrow;
	public void setArrow(HIASTNode arrow) {
		this.arrow = arrow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIASTNode getArrow(){ return arrow; }



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