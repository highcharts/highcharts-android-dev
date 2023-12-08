/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.HashMap;



public class HIDrillupEventObject extends HIFoundation { 

	private HIFunction preventDefault;
	/**
 Prevents the defaults behaviour of the event. 
	*/
	public void setPreventDefault(HIFunction preventDefault) {
		this.preventDefault = preventDefault;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPreventDefault(){ return preventDefault; }

	private Object seriesOptions;
	/**
 Options for the new series. 
	*/
	public void setSeriesOptions(Object seriesOptions) {
		this.seriesOptions = seriesOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getSeriesOptions(){ return seriesOptions; }

	private HIChart target;
	/**
 The event target. 
	*/
	public void setTarget(HIChart target) {
		this.target = target;
		this.setChanged();
		this.notifyObservers();
	}

	public HIChart getTarget(){ return target; }

	private String type;
	/**
 The event type. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HIDrillupEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.preventDefault != null) {
			params.put("preventDefault", this.preventDefault);
		}
		if (this.seriesOptions != null) {
			params.put("seriesOptions", this.seriesOptions);
		}
		if (this.target != null) {
			params.put("target", this.target.getParams());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}