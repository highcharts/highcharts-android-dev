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



public class HIPaths extends HIFoundation { 

	private String definition;
	/**
 The definition defines a path to be drawn. It corresponds `d` SVG attribute. 
	*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

	private Number max;
	/**
 The max option determines height of the image. It is the ratio of `yAxis.max` to the `paths.max`. 
 <br><br><b>defaults:</b><br><br>&ensp;yAxis.max	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }



	public HIPaths() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		return params;
	}

}