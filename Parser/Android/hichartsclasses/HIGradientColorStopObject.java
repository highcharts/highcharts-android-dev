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



public class HIGradientColorStopObject extends HIFoundation { 

	private Number 0;
	public void set0(Number 0) {
		this.0 = 0;
		this.setChanged();
		this.notifyObservers();
	}

	public Number get0(){ return 0; }

	private String 1;
	public void set1(String 1) {
		this.1 = 1;
		this.setChanged();
		this.notifyObservers();
	}

	public String get1(){ return 1; }



	public HIGradientColorStopObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.0 != null) {
			params.put("0", this.0);
		}
		if (this.1 != null) {
			params.put("1", this.1);
		}
		return params;
	}

}