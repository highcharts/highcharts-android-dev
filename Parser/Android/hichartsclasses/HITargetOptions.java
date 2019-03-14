/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.common.HIColor;



public class HITargetOptions extends HIFoundation { 

	private HIColor borderColor;
	/**
 The border color of the rectangle representing the target. When not set, the point's border color is used. In styled mode, use class highcharts-bullet-target instead. 
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIColor color;
	/**
 The color of the rectangle representing the target. When not set, point's color (if set in point's options - color) or zone of the target value (if zones or negativeColor are set) or the same color as the point has is used. In styled mode, use class highcharts-bullet-target instead. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Object /* Number, String */ width;
	/**
 The width of the rectangle representing the target. Could be set as a pixel value or as a percentage of a column width. 
	*/
	public void setWidth(Object /* Number, String */ width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWidth(){ return width; }

	private Number borderWidth;
	/**
 The border width of the rectangle representing the target. In styled mode, use class highcharts-bullet-target instead. 
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Number height;
	/**
 The height of the rectangle representing the target. 
	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }



	public HITargetOptions() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		return params;
	}

}