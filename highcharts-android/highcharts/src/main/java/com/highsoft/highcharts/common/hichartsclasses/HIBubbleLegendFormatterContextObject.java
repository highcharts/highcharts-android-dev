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



public class HIBubbleLegendFormatterContextObject extends HIFoundation { 

	private Number center;
	/**
 The center y position of the range. 
	*/
	public void setCenter(Number center) {
		this.center = center;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCenter(){ return center; }

	private Number radius;
	/**
 The radius of the bubble range. 
	*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private Number value;
	/**
 The bubble value. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }



	public HIBubbleLegendFormatterContextObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.center != null) {
			params.put("center", this.center);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}