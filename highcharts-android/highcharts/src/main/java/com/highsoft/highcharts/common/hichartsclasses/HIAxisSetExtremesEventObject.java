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



public class HIAxisSetExtremesEventObject extends HIFoundation { 

	private HIFunction preventDefault;
	public void setPreventDefault(HIFunction preventDefault) {
		this.preventDefault = preventDefault;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPreventDefault(){ return preventDefault; }

	private HISVGElement target;
	public void setTarget(HISVGElement target) {
		this.target = target;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getTarget(){ return target; }

	private String trigger;
	public void setTrigger(String trigger) {
		this.trigger = trigger;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTrigger(){ return trigger; }

	private String type;
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HIAxisSetExtremesEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.preventDefault != null) {
			params.put("preventDefault", this.preventDefault);
		}
		if (this.target != null) {
			params.put("target", this.target.getParams());
		}
		if (this.trigger != null) {
			params.put("trigger", this.trigger);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}