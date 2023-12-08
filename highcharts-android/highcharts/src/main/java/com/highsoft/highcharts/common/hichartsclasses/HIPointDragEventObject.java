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



public class HIPointDragEventObject extends HIFoundation { 

	private Object newPoints;
	/**
 New points during drag. 
	*/
	public void setNewPoints(Object newPoints) {
		this.newPoints = newPoints;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getNewPoints(){ return newPoints; }

	private HIDragDropPositionObject origin;
	/**
 Original data. 
	*/
	public void setOrigin(HIDragDropPositionObject origin) {
		this.origin = origin;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDragDropPositionObject getOrigin(){ return origin; }

	private HIFunction preventDefault;
	/**
 Prevent defaults drag action. 
	*/
	public void setPreventDefault(HIFunction preventDefault) {
		this.preventDefault = preventDefault;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPreventDefault(){ return preventDefault; }

	private HIPoint target;
	/**
 Target point that caused the event. 
	*/
	public void setTarget(HIPoint target) {
		this.target = target;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getTarget(){ return target; }

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



	public HIPointDragEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.newPoints != null) {
			params.put("newPoints", this.newPoints);
		}
		if (this.origin != null) {
			params.put("origin", this.origin.getParams());
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