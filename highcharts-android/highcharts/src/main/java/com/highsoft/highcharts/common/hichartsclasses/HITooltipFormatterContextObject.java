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

import java.util.ArrayList;
import java.util.HashMap;



public class HITooltipFormatterContextObject extends HIFoundation { 

	private HIColor color;
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number colorIndex;
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorIndex(){ return colorIndex; }

	private Number key;
	public void setKey(Number key) {
		this.key = key;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getKey(){ return key; }

	private Number percentage;
	public void setPercentage(Number percentage) {
		this.percentage = percentage;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPercentage(){ return percentage; }

	private HIPoint point;
	public void setPoint(HIPoint point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private ArrayList points;
	public void setPoints(ArrayList points) {
		this.points = points;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPoints(){ return points; }

	private HISeries series;
	public void setSeries(HISeries series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private Number total;
	public void setTotal(Number total) {
		this.total = total;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTotal(){ return total; }

	private Number x;
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number y;
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }



	public HITooltipFormatterContextObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color.getData());
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
		if (this.points != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.points) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("points", array);
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