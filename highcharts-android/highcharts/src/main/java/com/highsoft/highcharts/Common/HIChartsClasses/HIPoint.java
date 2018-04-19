/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HIPoint extends Observable implements HIChartsJSONSerializable { 

	private HIEvents events;
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private Number y;
/**
The y position of the point. Units can be either in axis
or chart pixel coordinates.
*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
/**
The x position of the point. Units can be either in axis
or chart pixel coordinates.
*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Object /* Number|String */ xAxis;
/**
This number defines which xAxis the point is connected to. It refers
to either the axis id or the index of the axis in the xAxis array.
If the option is not configured or the axis is not found the point's
x coordinate refers to the chart pixels.
*/
	public void setXAxis(Object /* Number|String */ xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getXAxis(){ return xAxis; }

	private Object /* Number|String */ yAxis;
/**
This number defines which yAxis the point is connected to. It refers
to either the axis id or the index of the axis in the yAxis array.
If the option is not configured or the axis is not found the point's
y coordinate refers to the chart pixels.
*/
	public void setYAxis(Object /* Number|String */ yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getYAxis(){ return yAxis; }



	public HIPoint() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.xAxis != null) {
			params.put("xAxis", this.xAxis);
		}
		if (this.yAxis != null) {
			params.put("yAxis", this.yAxis);
		}
		return params;
	}

}