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



public class HISonifySeriesOptionsObject extends HIFoundation { 

	private Object dataExtremes;
	/**
 Optionally provide the minimum/maximum data values for the points. If this is not supplied, it is calculated from all points in the chart on demand. This option is supplied in the following format, as a map of point data properties to objects with min/max values: ```js dataExtremes: { y: { min: 0, max: 100 }, z: { min: -10, max: 10 } // Properties used and not provided are calculated on demand } ``` 
	*/
	public void setDataExtremes(Object dataExtremes) {
		this.dataExtremes = dataExtremes;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDataExtremes(){ return dataExtremes; }

	private Number duration;
	/**
 The duration for playing the points. Note that points might continue to play after the duration has passed, but no new points will start playing. 
	*/
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }

	private ArrayList earcons;
	/**
 Earcons to add to the series. 
	*/
	public void setEarcons(ArrayList earcons) {
		this.earcons = earcons;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getEarcons(){ return earcons; }

	private ArrayList instruments;
	/**
 The instrument definitions for the points in this series. 
	*/
	public void setInstruments(ArrayList instruments) {
		this.instruments = instruments;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getInstruments(){ return instruments; }

	private HIFunction onEnd;
	/**
 Callback after the series has played. 
	*/
	public void setOnEnd(HIFunction onEnd) {
		this.onEnd = onEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnEnd(){ return onEnd; }

	private HIFunction onPointEnd;
	/**
 Callback after a point has finished playing. 
	*/
	public void setOnPointEnd(HIFunction onPointEnd) {
		this.onPointEnd = onPointEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnPointEnd(){ return onPointEnd; }

	private HIFunction onPointStart;
	/**
 Callback before a point is played. 
	*/
	public void setOnPointStart(HIFunction onPointStart) {
		this.onPointStart = onPointStart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnPointStart(){ return onPointStart; }

	private String pointPlayTime;
	/**
 The axis to use for when to play the points. Can be a string with a data property (e.g. `x`), or a function. If it is a function, this function receives the point as argument, and should return a numeric value. The points with the lowest numeric values are then played first, and the time between points will be proportional to the distance between the numeric values. 
	*/
	public void setPointPlayTime(String pointPlayTime) {
		this.pointPlayTime = pointPlayTime;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointPlayTime(){ return pointPlayTime; }



	public HISonifySeriesOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.dataExtremes != null) {
			params.put("dataExtremes", this.dataExtremes);
		}
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		if (this.earcons != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.earcons) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("earcons", array);
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
		if (this.onPointEnd != null) {
			params.put("onPointEnd", this.onPointEnd);
		}
		if (this.onPointStart != null) {
			params.put("onPointStart", this.onPointStart);
		}
		if (this.pointPlayTime != null) {
			params.put("pointPlayTime", this.pointPlayTime);
		}
		return params;
	}

}