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



public class HISeriesPlotBoxObject extends HIFoundation { 

	private Number scaleX;
	public void setScaleX(Number scaleX) {
		this.scaleX = scaleX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScaleX(){ return scaleX; }

	private Number scaleY;
	public void setScaleY(Number scaleY) {
		this.scaleY = scaleY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScaleY(){ return scaleY; }

	private Number translateX;
	public void setTranslateX(Number translateX) {
		this.translateX = translateX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTranslateX(){ return translateX; }

	private Number translateY;
	public void setTranslateY(Number translateY) {
		this.translateY = translateY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTranslateY(){ return translateY; }



	public HISeriesPlotBoxObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.scaleX != null) {
			params.put("scaleX", this.scaleX);
		}
		if (this.scaleY != null) {
			params.put("scaleY", this.scaleY);
		}
		if (this.translateX != null) {
			params.put("translateX", this.translateX);
		}
		if (this.translateY != null) {
			params.put("translateY", this.translateY);
		}
		return params;
	}

}