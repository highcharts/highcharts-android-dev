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



public class HIAxisLabelsFormatterContextObject extends HIFoundation { 

	private HIAxis axis;
	/**
 The axis item of the label 
	*/
	public void setAxis(HIAxis axis) {
		this.axis = axis;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAxis getAxis(){ return axis; }

	private HIChart chart;
	/**
 The chart instance. 
	*/
	public void setChart(HIChart chart) {
		this.chart = chart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIChart getChart(){ return chart; }

	private Boolean isFirst;
	/**
 Whether the label belongs to the first tick on the axis. 
	*/
	public void setIsFirst(Boolean isFirst) {
		this.isFirst = isFirst;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsFirst(){ return isFirst; }

	private Boolean isLast;
	/**
 Whether the label belongs to the last tick on the axis. 
	*/
	public void setIsLast(Boolean isLast) {
		this.isLast = isLast;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsLast(){ return isLast; }

	private Number pos;
	/**
 The position on the axis in terms of axis values. For category axes, a zero-based index. For datetime axes, the JavaScript time in milliseconds since 1970. 
	*/
	public void setPos(Number pos) {
		this.pos = pos;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPos(){ return pos; }

	private String text;
	/**
 The preformatted text as the result of the defaults formatting. For example dates will be formatted as strings, and numbers with language-specific comma separators, thousands separators and numeric symbols like `k` or `M`. 
	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private HITick tick;
	/**
 The Tick instance. 
	*/
	public void setTick(HITick tick) {
		this.tick = tick;
		this.setChanged();
		this.notifyObservers();
	}

	public HITick getTick(){ return tick; }

	private Object /* Number, String */ value;
	/**
 This can be either a numeric value or a category string. 
	*/
	public void setValue(Object /* Number, String */ value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getValue(){ return value; }



	public HIAxisLabelsFormatterContextObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
		}
		if (this.chart != null) {
			params.put("chart", this.chart.getParams());
		}
		if (this.isFirst != null) {
			params.put("isFirst", this.isFirst);
		}
		if (this.isLast != null) {
			params.put("isLast", this.isLast);
		}
		if (this.pos != null) {
			params.put("pos", this.pos);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.tick != null) {
			params.put("tick", this.tick.getParams());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}