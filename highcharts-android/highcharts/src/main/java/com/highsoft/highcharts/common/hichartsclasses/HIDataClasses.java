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



public class HIDataClasses extends HIFoundation { 

	private HIColor color;
	/**
 The color of each data class. If not set, the color is pulled from the global or chart-specific colors array. In styled mode, this option is ignored. Instead, use colors defined in CSS. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number to;
	/**
 The end of the value range that the data class represents, relating to the point value. The range of each dataClass is closed in both ends, but can be overridden by the next dataClass. 
	*/
	public void setTo(Number to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTo(){ return to; }

	private Number from;
	/**
 The start of the value range that the data class represents, relating to the point value. The range of each dataClass is closed in both ends, but can be overridden by the next dataClass. 
	*/
	public void setFrom(Number from) {
		this.from = from;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFrom(){ return from; }

	private String name;
	/**
 The name of the data class as it appears in the legend. If no name is given, it is automatically created based on the from and to values. For full programmatic control, legend.labelFormatter can be used. In the formatter, this.from and this.to can be accessed. 
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }



	public HIDataClasses() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		return params;
	}

}