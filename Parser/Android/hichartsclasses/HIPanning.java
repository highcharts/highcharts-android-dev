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



public class HIPanning extends HIFoundation { 

	private String type;
	/**
 Decides in what dimensions the user can pan the chart. Can be one of x, y, or xy. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/panning-type">Zooming and xy panning</a> <br><br><b>accepted values:</b><br><br>&ensp;["x", "y", "xy"]
 <br><br><b>defaults:</b><br><br>&ensp;x	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Boolean enabled;
	/**
 Enable or disable chart panning. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }



	public HIPanning() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		return params;
	}

}