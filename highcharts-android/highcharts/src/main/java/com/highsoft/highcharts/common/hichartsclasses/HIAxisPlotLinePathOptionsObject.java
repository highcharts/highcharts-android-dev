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



public class HIAxisPlotLinePathOptionsObject extends HIFoundation { 

	private Boolean acrossPanes;
	/**
 Used in Highcharts Stock. When `true`, plot paths (crosshair, plotLines, gridLines) will be rendered on all axes when defined on the first axis. 
	*/
	public void setAcrossPanes(Boolean acrossPanes) {
		this.acrossPanes = acrossPanes;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAcrossPanes(){ return acrossPanes; }

	private String force;
	/**
 If `false`, the function will return null when it falls outside the axis bounds. If `true`, the function will return a path aligned to the plot area sides if it falls outside. If `pass`, it will return a path outside. 
	*/
	public void setForce(String force) {
		this.force = force;
		this.setChanged();
		this.notifyObservers();
	}

	public String getForce(){ return force; }

	private Number lineWidth;
	/**
 Line width used for calculation crisp line coordinates. Defaults to 1. 
	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Boolean old;
	/**
 Use old coordinates (for resizing and rescaling). If not set, defaultss to `false`. 
	*/
	public void setOld(Boolean old) {
		this.old = old;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOld(){ return old; }

	private Boolean reverse;
	/**
 Used in Polar axes. Reverse the positions for concatenation of polygonal plot bands 
	*/
	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReverse(){ return reverse; }

	private Number translatedValue;
	/**
 If given, return the plot line path of a pixel position on the axis. 
	*/
	public void setTranslatedValue(Number translatedValue) {
		this.translatedValue = translatedValue;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTranslatedValue(){ return translatedValue; }

	private Number value;
	/**
 Axis value. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }



	public HIAxisPlotLinePathOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.acrossPanes != null) {
			params.put("acrossPanes", this.acrossPanes);
		}
		if (this.force != null) {
			params.put("force", this.force);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.old != null) {
			params.put("old", this.old);
		}
		if (this.reverse != null) {
			params.put("reverse", this.reverse);
		}
		if (this.translatedValue != null) {
			params.put("translatedValue", this.translatedValue);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}