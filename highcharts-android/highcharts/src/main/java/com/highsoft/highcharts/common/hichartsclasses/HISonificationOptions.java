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



public class HISonificationOptions extends HIFoundation { 

	private Number afterSeriesWait;
	/**
 Milliseconds of silent waiting to add between series. Note that waiting time is considered part of the sonify duration. 
	*/
	public void setAfterSeriesWait(Number afterSeriesWait) {
		this.afterSeriesWait = afterSeriesWait;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAfterSeriesWait(){ return afterSeriesWait; }

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
 Duration for sonifying the entire chart. The duration is distributed across the different series intelligently, but does not take earcons into account. It is also possible to set the duration explicitly per series, using `seriesOptions`. Note that points may continue to play after the duration has passed, but no new points will start playing. 
	*/
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }

	private ArrayList earcons;
	/**
 Earcons to add to the chart. Note that earcons can also be added per series using `seriesOptions`. 
	*/
	public void setEarcons(ArrayList earcons) {
		this.earcons = earcons;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getEarcons(){ return earcons; }

	private ArrayList instruments;
	/**
 The instrument definitions for the points in this chart. 
	*/
	public void setInstruments(ArrayList instruments) {
		this.instruments = instruments;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getInstruments(){ return instruments; }

	private HIFunction onEnd;
	/**
 Callback after the chart has played. 
	*/
	public void setOnEnd(HIFunction onEnd) {
		this.onEnd = onEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnEnd(){ return onEnd; }

	private HIFunction onSeriesEnd;
	/**
 Callback after a series has finished playing. 
	*/
	public void setOnSeriesEnd(HIFunction onSeriesEnd) {
		this.onSeriesEnd = onSeriesEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnSeriesEnd(){ return onSeriesEnd; }

	private HIFunction onSeriesStart;
	/**
 Callback before a series is played. 
	*/
	public void setOnSeriesStart(HIFunction onSeriesStart) {
		this.onSeriesStart = onSeriesStart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnSeriesStart(){ return onSeriesStart; }

	private Object order;
	/**
 Define the order to play the series in. This can be given as a string, or an array specifying a custom ordering. If given as a string, valid values are `sequential` - where each series is played in order - or `simultaneous`, where all series are played at once. For custom ordering, supply an array as the order. Each element in the array can be either a string with a series ID, an Earcon object, or an object with a numeric `silentWait` property designating a number of milliseconds to wait before continuing. Each element of the array will be played in order. To play elements simultaneously, group the elements in an array. 
	*/
	public void setOrder(Object order) {
		this.order = order;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOrder(){ return order; }

	private String pointPlayTime;
	/**
 The axis to use for when to play the points. Can be a string with a data property (e.g. `x`), or a function. If it is a function, this function receives the point as argument, and should return a numeric value. The points with the lowest numeric values are then played first, and the time between points will be proportional to the distance between the numeric values. This option can not be overridden per series. 
	*/
	public void setPointPlayTime(String pointPlayTime) {
		this.pointPlayTime = pointPlayTime;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointPlayTime(){ return pointPlayTime; }

	private Object seriesOptions;
	/**
 Options as given to `series.sonify` to override options per series. If the option is supplied as an array of options objects, the `id` property of the object should correspond to the series' id. If the option is supplied as a single object, the options apply to all series. 
	*/
	public void setSeriesOptions(Object seriesOptions) {
		this.seriesOptions = seriesOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getSeriesOptions(){ return seriesOptions; }



	public HISonificationOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.afterSeriesWait != null) {
			params.put("afterSeriesWait", this.afterSeriesWait);
		}
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
		if (this.onSeriesEnd != null) {
			params.put("onSeriesEnd", this.onSeriesEnd);
		}
		if (this.onSeriesStart != null) {
			params.put("onSeriesStart", this.onSeriesStart);
		}
		if (this.order != null) {
			params.put("order", this.order);
		}
		if (this.pointPlayTime != null) {
			params.put("pointPlayTime", this.pointPlayTime);
		}
		if (this.seriesOptions != null) {
			params.put("seriesOptions", this.seriesOptions);
		}
		return params;
	}

}