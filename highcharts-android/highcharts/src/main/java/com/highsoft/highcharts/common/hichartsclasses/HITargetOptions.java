/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HITargetOptions extends HIFoundation { 

	private HIColor borderColor;
	/**
 The border color of the rectangle representing the target. When not set, the point's border color is used. In styled mode, use class `highcharts-bullet-target` instead. 
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Number borderRadius;
	/**
 The border radius of the rectangle representing the target. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Number height;
	/**
 The height of the rectangle representing the target. 
 <br><br><b>defaults:</b><br><br>&ensp;3	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Object /* Number, String */ width;
	/**
 The width of the rectangle representing the target. Could be set as a pixel value or as a percentage of a column width. 
 <br><br><b>defaults:</b><br><br>&ensp;140%	*/
	public void setWidth(Object /* Number, String */ width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWidth(){ return width; }

	private Number borderWidth;
	/**
 The border width of the rectangle representing the target. In styled mode, use class `highcharts-bullet-target` instead. 
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private HIColor color;
	/**
 The color of the rectangle representing the target. When not set, point's color (if set in point's options - ``color``) or zone of the target value (if ``zones`` or ``negativeColor`` are set) or the same color as the point has is used. In styled mode, use class `highcharts-bullet-target` instead. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }



	public HITargetOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		return params;
	}

}