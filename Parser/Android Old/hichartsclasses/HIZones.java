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
import com.highsoft.highcharts.common.HIColor;



public class HIZones extends HIFoundation { 

	private String className;
	/**
 Styled mode only. A custom class name for the zone. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIMarker marker;
	/**
 Settings for the cluster marker belonging to the zone. 
	*/
	public void setMarker(HIMarker marker) {
		this.marker = marker;
		this.marker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMarker getMarker(){ return marker; }

	private Number from;
	/**
 The value where the zone starts. 
	*/
	public void setFrom(Number from) {
		this.from = from;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFrom(){ return from; }

	private Number to;
	/**
 The value where the zone ends. 
	*/
	public void setTo(Number to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTo(){ return to; }

	private HIColor color;
	/**
 Defines the color of the series. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private String dashStyle;
	/**
 A name for the dash style to use for the graph. 
	*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private HIColor fillColor;
	/**
 Defines the fill color for the series (in area type series) 
	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private Number value;
	/**
 The value up to where the zone extends, if undefined the zones stretches to the last value in the series. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }



	public HIZones() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}