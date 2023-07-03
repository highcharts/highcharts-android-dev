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



public class HISeriesSankeyDataLabelsFormatterContextObject extends HIFoundation { 

	private HISankeyNodeObject point;
	/**
 The node object. The node name, if defined, is available through `this.point.name`. 
	*/
	public void setPoint(HISankeyNodeObject point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HISankeyNodeObject getPoint(){ return point; }



	public HISeriesSankeyDataLabelsFormatterContextObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		return params;
	}

}