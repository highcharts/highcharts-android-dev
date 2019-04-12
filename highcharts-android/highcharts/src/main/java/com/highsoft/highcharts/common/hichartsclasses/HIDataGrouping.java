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



public class HIDataGrouping extends HIFoundation { 

	private String approximation;
	/**
 Approximation function for the data grouping. The defaults returns an average of wind speed and a vector average direction weighted by wind speed. 
	*/
	public void setApproximation(String approximation) {
		this.approximation = approximation;
		this.setChanged();
		this.notifyObservers();
	}

	public String getApproximation(){ return approximation; }

	private Boolean enabled;
	/**
 Whether to enable data grouping. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number groupPixelWidth;
	/**
 The approximate data group width. 
	*/
	public void setGroupPixelWidth(Number groupPixelWidth) {
		this.groupPixelWidth = groupPixelWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupPixelWidth(){ return groupPixelWidth; }



	public HIDataGrouping() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.approximation != null) {
			params.put("approximation", this.approximation);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.groupPixelWidth != null) {
			params.put("groupPixelWidth", this.groupPixelWidth);
		}
		return params;
	}

}