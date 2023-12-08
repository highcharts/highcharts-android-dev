/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.HashMap;



public class HIPointSonifyOptionsObject extends HIFoundation { 

	private Object dataExtremes;
	/**
 Optionally provide the minimum/maximum values for the points. If this is not supplied, it is calculated from the points in the chart on demand. This option is supplied in the following format, as a map of point data properties to objects with min/max values: ```js dataExtremes: { y: { min: 0, max: 100 }, z: { min: -10, max: 10 } // Properties used and not provided are calculated on demand } ``` 
	*/
	public void setDataExtremes(Object dataExtremes) {
		this.dataExtremes = dataExtremes;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDataExtremes(){ return dataExtremes; }

	private ArrayList instruments;
	/**
 The instrument definitions for this point. 
	*/
	public void setInstruments(ArrayList instruments) {
		this.instruments = instruments;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getInstruments(){ return instruments; }

	private HIFunction onEnd;
	/**
 Callback called when the sonification has finished. 
	*/
	public void setOnEnd(HIFunction onEnd) {
		this.onEnd = onEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnEnd(){ return onEnd; }



	public HIPointSonifyOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.dataExtremes != null) {
			params.put("dataExtremes", this.dataExtremes);
		}
		if (this.instruments != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.instruments) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("instruments", array);
		}
		if (this.onEnd != null) {
			params.put("onEnd", this.onEnd);
		}
		return params;
	}

}