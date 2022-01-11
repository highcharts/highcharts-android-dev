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



public class HIFullscreen extends HIFoundation { 

	private HIChart chart;
	/**
 Chart managed by the fullscreen controller. 
	*/
	public void setChart(HIChart chart) {
		this.chart = chart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIChart getChart(){ return chart; }

	private Boolean isOpen;
	/**
 The flag is set to `true` when the chart is displayed in the fullscreen mode. 
	*/
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsOpen(){ return isOpen; }



	public HIFullscreen() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.chart != null) {
			params.put("chart", this.chart.getParams());
		}
		if (this.isOpen != null) {
			params.put("isOpen", this.isOpen);
		}
		return params;
	}

}