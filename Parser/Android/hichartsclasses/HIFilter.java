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



public class HIFilter extends HIFoundation { 

	private String operator;
	/**
 The operator to compare by. Can be one of >, <, >=, <=, ==, and ===. <br><br><b>accepted values:</b><br><br>&ensp;[">", "<", ">=", "<=", "==", "==="]
	*/
	public void setOperator(String operator) {
		this.operator = operator;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOperator(){ return operator; }

	private String property;
	/**
 The point property to filter by. Point options are passed directly to properties, additionally there are y value, percentage and others listed under [Point](https://api.highcharts.com/class-reference/Highcharts.Point) members. 
	*/
	public void setProperty(String property) {
		this.property = property;
		this.setChanged();
		this.notifyObservers();
	}

	public String getProperty(){ return property; }

	private Object value;
	/**
 The value to compare against. 
	*/
	public void setValue(Object value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getValue(){ return value; }



	public HIFilter() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.operator != null) {
			params.put("operator", this.operator);
		}
		if (this.property != null) {
			params.put("property", this.property);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}