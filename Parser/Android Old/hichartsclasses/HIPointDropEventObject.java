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



public class HIPointDropEventObject extends HIFoundation { 

	private HIPointDragDropObject newPoint;
	/**
 New point after drag if only a single one. 
	*/
	public void setNewPoint(HIPointDragDropObject newPoint) {
		this.newPoint = newPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointDragDropObject getNewPoint(){ return newPoint; }

	private String newPointId;
	/**
 New point id after drag if only a single one. 
	*/
	public void setNewPointId(String newPointId) {
		this.newPointId = newPointId;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNewPointId(){ return newPointId; }

	private Object newPoints;
	/**
 New points after drop. 
	*/
	public void setNewPoints(Object newPoints) {
		this.newPoints = newPoints;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getNewPoints(){ return newPoints; }

	private Number numNewPoints;
	/**
 Number of new points. 
	*/
	public void setNumNewPoints(Number numNewPoints) {
		this.numNewPoints = numNewPoints;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNumNewPoints(){ return numNewPoints; }

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
 Prevent defaults drop action. 
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



	public HIPointDropEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.newPoint != null) {
			params.put("newPoint", this.newPoint.getParams());
		}
		if (this.newPointId != null) {
			params.put("newPointId", this.newPointId);
		}
		if (this.newPoints != null) {
			params.put("newPoints", this.newPoints);
		}
		if (this.numNewPoints != null) {
			params.put("numNewPoints", this.numNewPoints);
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