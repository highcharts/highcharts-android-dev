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



public class HIDefs extends HIFoundation { 

	private HISVGDefinitionObject reverse-arrow;
	public void setReverse-arrow(HISVGDefinitionObject reverse-arrow) {
		this.reverse-arrow = reverse-arrow;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGDefinitionObject getReverse-arrow(){ return reverse-arrow; }

	private HISVGDefinitionObject arrow;
	public void setArrow(HISVGDefinitionObject arrow) {
		this.arrow = arrow;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGDefinitionObject getArrow(){ return arrow; }



	public HIDefs() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.reverse-arrow != null) {
			params.put("reverse-arrow", this.reverse-arrow.getParams());
		}
		if (this.arrow != null) {
			params.put("arrow", this.arrow.getParams());
		}
		return params;
	}

}