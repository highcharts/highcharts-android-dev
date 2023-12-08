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



public class HITimeNormalizedObject extends HIFoundation { 

	private Number count;
	/**
 The count. 
	*/
	public void setCount(Number count) {
		this.count = count;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCount(){ return count; }

	private Number unitRange;
	/**
 The interval in axis values (ms). 
	*/
	public void setUnitRange(Number unitRange) {
		this.unitRange = unitRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getUnitRange(){ return unitRange; }



	public HITimeNormalizedObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.count != null) {
			params.put("count", this.count);
		}
		if (this.unitRange != null) {
			params.put("unitRange", this.unitRange);
		}
		return params;
	}

}