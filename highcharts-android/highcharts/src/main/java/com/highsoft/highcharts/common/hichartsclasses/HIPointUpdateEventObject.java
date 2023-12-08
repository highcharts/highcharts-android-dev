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



public class HIPointUpdateEventObject extends HIFoundation { 

	private Object options;
	/**
 Options data of the update event. 
	*/
	public void setOptions(Object options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOptions(){ return options; }



	public HIPointUpdateEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.options != null) {
			params.put("options", this.options);
		}
		return params;
	}

}