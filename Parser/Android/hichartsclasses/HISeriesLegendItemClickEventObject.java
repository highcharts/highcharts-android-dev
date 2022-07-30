/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HISeriesLegendItemClickEventObject extends HIFoundation { 

	private Object browserEvent;
	/**
 Related browser event. 
	*/
	public void setBrowserEvent(Object browserEvent) {
		this.browserEvent = browserEvent;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getBrowserEvent(){ return browserEvent; }

	private HIFunction preventDefault;
	/**
 Prevent the defaults action of toggle the visibility of the series. 
	*/
	public void setPreventDefault(HIFunction preventDefault) {
		this.preventDefault = preventDefault;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPreventDefault(){ return preventDefault; }

	private HISeries target;
	/**
 Related series. 
	*/
	public void setTarget(HISeries target) {
		this.target = target;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getTarget(){ return target; }

	private String type;
	/**
 Event type. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HISeriesLegendItemClickEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.browserEvent != null) {
			params.put("browserEvent", this.browserEvent);
		}
		if (this.preventDefault != null) {
			params.put("preventDefault", this.preventDefault);
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