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



public class HIGuideBox extends HIFoundation { 

	private HIDefault defaults;
	/**
 Style options for the guide box defaults state. 
	*/
	public void setDefault(HIDefault defaults) {
		this.defaults = defaults;
		this.defaults.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDefault getDefault(){ return defaults; }



	public HIGuideBox() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.defaults != null) {
			params.put("default", this.defaults.getParams());
		}
		return params;
	}

}