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



public class HIPointDragDropObject extends HIFoundation { 

	private HashMap newValues;
	/**
 New values. 
	*/
	public void setNewValues(HashMap newValues) {
		this.newValues = newValues;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getNewValues(){ return newValues; }

	private HIPoint point;
	/**
 Updated point. 
	*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }



	public HIPointDragDropObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.newValues != null) {
			params.put("newValues", this.newValues);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		return params;
	}

}