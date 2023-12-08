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



public class HIEventOptionsObject extends HIFoundation { 

	private Number order;
	/**
 The order the event handler should be called. This opens for having one handler be called before another, independent of in which order they were added. 
	*/
	public void setOrder(Number order) {
		this.order = order;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOrder(){ return order; }

	private Boolean passive;
	/**
 Whether an event should be passive or not. When set to `true`, the function specified by listener will never call `preventDefault()`. 
	*/
	public void setPassive(Boolean passive) {
		this.passive = passive;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getPassive(){ return passive; }



	public HIEventOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.order != null) {
			params.put("order", this.order);
		}
		if (this.passive != null) {
			params.put("passive", this.passive);
		}
		return params;
	}

}