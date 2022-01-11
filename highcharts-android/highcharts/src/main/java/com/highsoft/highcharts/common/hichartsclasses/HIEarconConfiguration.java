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



public class HIEarconConfiguration extends HIFoundation { 

	private HIFunction condition;
	/**
 A function to determine whether or not to play this earcon on a point. The function is called for every point, receiving that point as parameter. It should return either a boolean indicating whether or not to play the earcon, or a new Earcon instance - in which case the new Earcon will be played. 
	*/
	public void setCondition(HIFunction condition) {
		this.condition = condition;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getCondition(){ return condition; }

	private String onPoint;
	/**
 The ID of the point to play the Earcon on. 
	*/
	public void setOnPoint(String onPoint) {
		this.onPoint = onPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOnPoint(){ return onPoint; }



	public HIEarconConfiguration() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.condition != null) {
			params.put("condition", this.condition);
		}
		if (this.onPoint != null) {
			params.put("onPoint", this.onPoint);
		}
		return params;
	}

}