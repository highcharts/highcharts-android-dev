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



public class HIPointerAxisCoordinateObject extends HIFoundation { 

	private HIAxis axis;
	/**
 Related axis. 
	*/
	public void setAxis(HIAxis axis) {
		this.axis = axis;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAxis getAxis(){ return axis; }

	private Number value;
	/**
 Axis value. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }



	public HIPointerAxisCoordinateObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}