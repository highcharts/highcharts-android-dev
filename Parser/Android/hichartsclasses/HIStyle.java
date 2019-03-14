/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIStyle extends HIFoundation { 

	private String textOverflow;
	public void setTextOverflow(String textOverflow) {
		this.textOverflow = textOverflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextOverflow(){ return textOverflow; }



	public HIStyle() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.textOverflow != null) {
			params.put("textOverflow", this.textOverflow);
		}
		return params;
	}

}