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



public class HIDragHandle extends HIFoundation { 

	private String className;
	/**
 The class name of the drag handles. Defaults to `highcharts-drag-handle`. 
 <br><br><b>defaults:</b><br><br>&ensp;highcharts-drag-handle	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIColor color;
	/**
 The fill color of the drag handles. 
 <br><br><b>defaults:</b><br><br>&ensp;#fff	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number lineWidth;
	/**
 The line width for the drag handles. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number zIndex;
	/**
 The z index for the drag handles. 
 <br><br><b>defaults:</b><br><br>&ensp;901	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HIColor lineColor;
	/**
 The line color of the drag handles. 
 <br><br><b>defaults:</b><br><br>&ensp;rgba(0, 0, 0, 0.6)	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private String cursor;
	/**
 The mouse cursor to use for the drag handles. By defaults this is intelligently switching between `ew-resize` and `ns-resize` depending on the direction the point is being dragged. 
	*/
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private HIFunction pathFormatter;
	/**
 Function to define the SVG path to use for the drag handles. Takes the point as argument. Should return an SVG path in array format. The SVG path is automatically positioned on the point. 
	*/
	public void setPathFormatter(HIFunction pathFormatter) {
		this.pathFormatter = pathFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPathFormatter(){ return pathFormatter; }



	public HIDragHandle() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.pathFormatter != null) {
			params.put("pathFormatter", this.pathFormatter);
		}
		return params;
	}

}