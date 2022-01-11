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



public class HIPointerCoordinatesObject extends HIFoundation { 

	private Number chartX;
	public void setChartX(Number chartX) {
		this.chartX = chartX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getChartX(){ return chartX; }

	private Number chartY;
	public void setChartY(Number chartY) {
		this.chartY = chartY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getChartY(){ return chartY; }



	public HIPointerCoordinatesObject() {

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
		return params;
	}

}