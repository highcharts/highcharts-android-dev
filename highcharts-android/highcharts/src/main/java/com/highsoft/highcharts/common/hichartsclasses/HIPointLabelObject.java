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



public class HIPointLabelObject extends HIFoundation { 

	private Object color;
	/**
 The point's current color. 
	*/
	public void setColor(Object color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getColor(){ return color; }

	private Number colorIndex;
	/**
 The point's current color index, used in styled mode instead of `color`. The color index is inserted in class names used for styling. 
	*/
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorIndex(){ return colorIndex; }

	private String key;
	/**
 The name of the related point. 
	*/
	public void setKey(String key) {
		this.key = key;
		this.setChanged();
		this.notifyObservers();
	}

	public String getKey(){ return key; }

	private Number percentage;
	/**
 The percentage for related points in a stacked series or pies. 
	*/
	public void setPercentage(Number percentage) {
		this.percentage = percentage;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPercentage(){ return percentage; }

	private HIPoint point;
	/**
 The related point. The point name, if defined, is available through `this.point.name`. 
	*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private HISeries series;
	/**
 The related series. The series name is available through `this.series.name`. 
	*/
	public void setSeries(HISeries series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private Number total;
	/**
 The total of values in either a stack for stacked series, or a pie in a pie series. 
	*/
	public void setTotal(Number total) {
		this.total = total;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTotal(){ return total; }

	private Object x;
	/**
 For categorized axes this property holds the category name for the point. For other axes it holds the X value. 
	*/
	public void setX(Object x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getX(){ return x; }

	private Number y;
	/**
 The y value of the point. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }



	public HIPointLabelObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.key != null) {
			params.put("key", this.key);
		}
		if (this.percentage != null) {
			params.put("percentage", this.percentage);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.total != null) {
			params.put("total", this.total);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		return params;
	}

}