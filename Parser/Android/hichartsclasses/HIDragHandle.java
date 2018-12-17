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
import com.highsoft.highcharts.common.HIColor;





public class HIDragHandle extends Observable implements HIChartsJSONSerializable { 

	private String cursor;
/**
/** The mouse cursor to use for the drag handles. By defaults this is intelligently switching between ew-resize and ns-resize depending on the direction the point is being dragged. 
*/
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private Number zIndex;
/**
/** The z index for the drag handles. 
*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HIColor color;
/**
/** The fill color of the drag handles. 
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private String className;
/**
/** The class name of the drag handles. Defaults to highcharts-drag-handle. 
*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIFunction pathFormatter;
/**
/** Function to define the SVG path to use for the drag handles. Takes the point as argument. Should return an SVG path in array format. The SVG path is automatically positioned on the point. 
*/
	public void setPathFormatter(HIFunction pathFormatter) {
		this.pathFormatter = pathFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPathFormatter(){ return pathFormatter; }

	private HIColor lineColor;
/**
/** The line color of the drag handles. 
*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number lineWidth;
/**
/** The line width for the drag handles. 
*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }



	public HIDragHandle() {

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
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.pathFormatter != null) {
			params.put("pathFormatter", this.pathFormatter);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		return params;
	}

}