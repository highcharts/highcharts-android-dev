/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIShadowOptionsObject extends HIFoundation { 

	private String color;
	/**
 The shadow color. 
	*/
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private Number offsetX;
	/**
 The horizontal offset from the element. 
	*/
	public void setOffsetX(Number offsetX) {
		this.offsetX = offsetX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffsetX(){ return offsetX; }

	private Number offsetY;
	/**
 The vertical offset from the element. 
	*/
	public void setOffsetY(Number offsetY) {
		this.offsetY = offsetY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffsetY(){ return offsetY; }

	private Number opacity;
	/**
 The shadow opacity. 
	*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private Number width;
	/**
 The shadow width or distance from the element. 
	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }



	public HIShadowOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.offsetX != null) {
			params.put("offsetX", this.offsetX);
		}
		if (this.offsetY != null) {
			params.put("offsetY", this.offsetY);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		return params;
	}

}