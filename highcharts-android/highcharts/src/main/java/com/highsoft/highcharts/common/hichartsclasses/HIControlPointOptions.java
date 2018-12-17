/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HIControlPointOptions extends Observable implements HIChartsJSONSerializable { 

	private HIStyle style;
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

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

	private Object positioner;
	public void setPositioner(Object positioner) {
		this.positioner = positioner;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPositioner(){ return positioner; }

	private Object events;
	public void setEvents(Object events) {
		this.events = events;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getEvents(){ return events; }



	public HIControlPointOptions() {

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
		}
		if (this.events != null) {
		}
		return params;
	}

}