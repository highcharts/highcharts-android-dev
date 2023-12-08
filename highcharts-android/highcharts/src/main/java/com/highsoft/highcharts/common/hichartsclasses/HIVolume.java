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



public class HIVolume extends HIFoundation { 

	private String mapFunction;
	/**
 How to perform the mapping. 
	*/
	public void setMapFunction(String mapFunction) {
		this.mapFunction = mapFunction;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapFunction(){ return mapFunction; }

	private Number min;
	/**
 The minimum value for the audio parameter. This is the lowest value the audio parameter will be mapped to. 
	*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }

	private Number max;
	/**
 The maximum value for the audio parameter. This is the highest value the audio parameter will be mapped to. 
	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private String within;
	/**
 What data values to map the parameter within. Mapping within `"series"` will make the lowest value point in the series map to the min audio parameter value, and the highest value will map to the max audio parameter. Mapping within `"chart"` will make the lowest value point in the whole chart map to the min audio parameter value, and the highest value in the whole chart will map to the max audio parameter. You can also map within the X or Y axis of each series. 
	*/
	public void setWithin(String within) {
		this.within = within;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWithin(){ return within; }

	private Number value;
	/**
 A fixed value to use for the prop when mapping. For example, if mapping to `y`, setting value to `4` will map as if all points had a y value of 4. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private String mapTo;
	/**
 A point property to map the mapping parameter to. A negative sign `-` can be placed before the property name to make mapping inverted. 
	*/
	public void setMapTo(String mapTo) {
		this.mapTo = mapTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapTo(){ return mapTo; }



	public HIVolume() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.mapFunction != null) {
			params.put("mapFunction", this.mapFunction);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.within != null) {
			params.put("within", this.within);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.mapTo != null) {
			params.put("mapTo", this.mapTo);
		}
		return params;
	}

}