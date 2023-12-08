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



public class HIDragDropPositionObject extends HIFoundation { 

	private Number chartX;
	/**
 Chart x position 
	*/
	public void setChartX(Number chartX) {
		this.chartX = chartX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getChartX(){ return chartX; }

	private Number chartY;
	/**
 Chart y position 
	*/
	public void setChartY(Number chartY) {
		this.chartY = chartY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getChartY(){ return chartY; }

	private HIBBoxObject guideBox;
	/**
 Drag and drop guide box. 
	*/
	public void setGuideBox(HIBBoxObject guideBox) {
		this.guideBox = guideBox;
		this.setChanged();
		this.notifyObservers();
	}

	public HIBBoxObject getGuideBox(){ return guideBox; }

	private Object points;
	/**
 Updated point data. 
	*/
	public void setPoints(Object points) {
		this.points = points;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPoints(){ return points; }

	private Number prevdX;
	/**
 Delta of previous x position. 
	*/
	public void setPrevdX(Number prevdX) {
		this.prevdX = prevdX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPrevdX(){ return prevdX; }

	private Number prevdY;
	/**
 Delta of previous y position. 
	*/
	public void setPrevdY(Number prevdY) {
		this.prevdY = prevdY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPrevdY(){ return prevdY; }



	public HIDragDropPositionObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.chartX != null) {
			params.put("chartX", this.chartX);
		}
		if (this.chartY != null) {
			params.put("chartY", this.chartY);
		}
		if (this.guideBox != null) {
			params.put("guideBox", this.guideBox.getParams());
		}
		if (this.points != null) {
			params.put("points", this.points);
		}
		if (this.prevdX != null) {
			params.put("prevdX", this.prevdX);
		}
		if (this.prevdY != null) {
			params.put("prevdY", this.prevdY);
		}
		return params;
	}

}