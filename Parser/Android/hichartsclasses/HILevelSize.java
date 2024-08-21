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



public class HILevelSize extends HIFoundation { 

	private Number value;
	/**
 The value used for calculating the width of the ring. Its' affect is determined by `levelSize.unit`. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	public enum Unit {
		PERCENTAGE("percentage"),
		PIXELS("pixels"),
		WEIGHT("weight");

		private final String value;

		Unit(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setUnit(Unit unit) {
		this.unit = unit.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String unit;
	/**
 How to interpret `levelSize.value`. - `percentage` gives a width relative to result of outer radius  minus inner radius. - `pixels` gives the ring a fixed width in pixels. - `weight` takes the remaining width after percentage and pixels,  and distributes it across all "weighted" levels. The value  relative to the sum of all weights determines the width. 
 <br><br><b>defaults:</b><br><br>&ensp;weight	*/
	public void setUnit(String unit) {
		this.unit = unit;
		this.setChanged();
		this.notifyObservers();
	}

	public String getUnit(){ return unit; }



	public HILevelSize() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.unit != null) {
			params.put("unit", this.unit);
		}
		return params;
	}

}