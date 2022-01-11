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



public class HIDrilldownEventObject extends HIFoundation { 

	private Number category;
	/**
 If a category label was clicked, which index. 
	*/
	public void setCategory(Number category) {
		this.category = category;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCategory(){ return category; }

	private Object originalEvent;
	/**
 The original browser event (usually click) that triggered the drilldown. 
	*/
	public void setOriginalEvent(Object originalEvent) {
		this.originalEvent = originalEvent;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOriginalEvent(){ return originalEvent; }

	private HIPoint point;
	/**
 The originating point. 
	*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private Object points;
	/**
 If a category label was clicked, this array holds all points corresponding to the category. Otherwise it is set to false. 
	*/
	public void setPoints(Object points) {
		this.points = points;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPoints(){ return points; }

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
 Options for the new series. If the event is utilized for async drilldown, the seriesOptions are not added, but rather loaded async. 
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



	public HIDrilldownEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.category != null) {
			params.put("category", this.category);
		}
		if (this.originalEvent != null) {
			params.put("originalEvent", this.originalEvent);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.points != null) {
			params.put("points", this.points);
		}
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