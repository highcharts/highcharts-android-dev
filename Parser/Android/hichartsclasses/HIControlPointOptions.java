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



public class HIControlPointOptions extends HIFoundation { 

	private HISVGAttributes style;
	public void setStyle(HISVGAttributes style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getStyle(){ return style; }

	private Number width;
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private String symbol;
	public void setSymbol(String symbol) {
		this.symbol = symbol;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSymbol(){ return symbol; }

	private Number height;
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Boolean visible;
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private HIFunction positioner;
	public void setPositioner(HIFunction positioner) {
		this.positioner = positioner;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPositioner(){ return positioner; }

	private HashMap events;
	public void setEvents(HashMap events) {
		this.events = events;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getEvents(){ return events; }



	public HIControlPointOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.symbol != null) {
			params.put("symbol", this.symbol);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.positioner != null) {
			params.put("positioner", this.positioner);
		}
		if (this.events != null) {
			params.put("events", this.events);
		}
		return params;
	}

}