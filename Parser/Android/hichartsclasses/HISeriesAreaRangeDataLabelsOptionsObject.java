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



public class HISeriesAreaRangeDataLabelsOptionsObject extends HIFoundation { 

	private Number xHigh;
	/**
 X offset of the higher data labels relative to the point value. 
	*/
	public void setXHigh(Number xHigh) {
		this.xHigh = xHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXHigh(){ return xHigh; }

	private Number xLow;
	/**
 X offset of the lower data labels relative to the point value. 
	*/
	public void setXLow(Number xLow) {
		this.xLow = xLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXLow(){ return xLow; }

	private Number yHigh;
	/**
 Y offset of the higher data labels relative to the point value. 
	*/
	public void setYHigh(Number yHigh) {
		this.yHigh = yHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getYHigh(){ return yHigh; }

	private Number yLow;
	/**
 Y offset of the lower data labels relative to the point value. 
	*/
	public void setYLow(Number yLow) {
		this.yLow = yLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getYLow(){ return yLow; }



	public HISeriesAreaRangeDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.xHigh != null) {
			params.put("xHigh", this.xHigh);
		}
		if (this.xLow != null) {
			params.put("xLow", this.xLow);
		}
		if (this.yHigh != null) {
			params.put("yHigh", this.yHigh);
		}
		if (this.yLow != null) {
			params.put("yLow", this.yLow);
		}
		return params;
	}

}