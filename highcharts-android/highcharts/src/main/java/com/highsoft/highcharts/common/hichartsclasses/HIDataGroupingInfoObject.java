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



public class HIDataGroupingInfoObject extends HIFoundation { 

	private Number length;
	public void setLength(Number length) {
		this.length = length;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLength(){ return length; }

	private Object options;
	public void setOptions(Object options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOptions(){ return options; }

	private Number start;
	public void setStart(Number start) {
		this.start = start;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStart(){ return start; }



	public HIDataGroupingInfoObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.length != null) {
			params.put("length", this.length);
		}
		if (this.options != null) {
			params.put("options", this.options);
		}
		if (this.start != null) {
			params.put("start", this.start);
		}
		return params;
	}

}