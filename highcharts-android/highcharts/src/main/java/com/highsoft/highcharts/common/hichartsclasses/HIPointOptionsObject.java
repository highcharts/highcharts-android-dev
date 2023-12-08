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



public class HIPointOptionsObject extends HIFoundation { 

	private HIPointAccessibilityOptionsObject accessibility;
	public void setAccessibility(HIPointAccessibilityOptionsObject accessibility) {
		this.accessibility = accessibility;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointAccessibilityOptionsObject getAccessibility(){ return accessibility; }

	private Number pointPadding;
	/**
 Heatmap series only. Point padding for a single point. 
	*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number value;
	/**
 Heatmap series only. The value of the point, resulting in a color controled by options as set in the colorAxis configuration. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private Number x2;
	/**
 The ending X value of the range point. 
	*/
	public void setX2(Number x2) {
		this.x2 = x2;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX2(){ return x2; }



	public HIPointOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.x2 != null) {
			params.put("x2", this.x2);
		}
		return params;
	}

}