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



public class HIPointInstrumentOptionsObject extends HIFoundation { 

	private Number maxDuration;
	/**
 The maximum duration for a note when using a data property for duration. Can be overridden by using either a fixed number or a function for instrumentMapping.duration. Defaults to 2000. 
	*/
	public void setMaxDuration(Number maxDuration) {
		this.maxDuration = maxDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxDuration(){ return maxDuration; }

	private Number maxFrequency;
	/**
 The maximum frequency for a note when using a data property for frequency. Can be overridden by using either a fixed number or a function for instrumentMapping.frequency. Defaults to 2200. 
	*/
	public void setMaxFrequency(Number maxFrequency) {
		this.maxFrequency = maxFrequency;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxFrequency(){ return maxFrequency; }

	private Number maxPan;
	/**
 The maximum pan value for a note when using a data property for panning. Can be overridden by using either a fixed number or a function for instrumentMapping.pan. Defaults to 1 (fully right). 
	*/
	public void setMaxPan(Number maxPan) {
		this.maxPan = maxPan;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPan(){ return maxPan; }

	private Number maxVolume;
	/**
 The maximum volume for a note when using a data property for volume. Can be overridden by using either a fixed number or a function for instrumentMapping.volume. Defaults to 1. 
	*/
	public void setMaxVolume(Number maxVolume) {
		this.maxVolume = maxVolume;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxVolume(){ return maxVolume; }

	private Number minDuration;
	/**
 The minimum duration for a note when using a data property for duration. Can be overridden by using either a fixed number or a function for instrumentMapping.duration. Defaults to 20. 
	*/
	public void setMinDuration(Number minDuration) {
		this.minDuration = minDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinDuration(){ return minDuration; }

	private Number minFrequency;
	/**
 The minimum frequency for a note when using a data property for frequency. Can be overridden by using either a fixed number or a function for instrumentMapping.frequency. Defaults to 220. 
	*/
	public void setMinFrequency(Number minFrequency) {
		this.minFrequency = minFrequency;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinFrequency(){ return minFrequency; }

	private Number minPan;
	/**
 The minimum pan value for a note when using a data property for panning. Can be overridden by using either a fixed number or a function for instrumentMapping.pan. Defaults to -1 (fully left). 
	*/
	public void setMinPan(Number minPan) {
		this.minPan = minPan;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPan(){ return minPan; }

	private Number minVolume;
	/**
 The minimum volume for a note when using a data property for volume. Can be overridden by using either a fixed number or a function for instrumentMapping.volume. Defaults to 0.1. 
	*/
	public void setMinVolume(Number minVolume) {
		this.minVolume = minVolume;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinVolume(){ return minVolume; }



	public HIPointInstrumentOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.maxDuration != null) {
			params.put("maxDuration", this.maxDuration);
		}
		if (this.maxFrequency != null) {
			params.put("maxFrequency", this.maxFrequency);
		}
		if (this.maxPan != null) {
			params.put("maxPan", this.maxPan);
		}
		if (this.maxVolume != null) {
			params.put("maxVolume", this.maxVolume);
		}
		if (this.minDuration != null) {
			params.put("minDuration", this.minDuration);
		}
		if (this.minFrequency != null) {
			params.put("minFrequency", this.minFrequency);
		}
		if (this.minPan != null) {
			params.put("minPan", this.minPan);
		}
		if (this.minVolume != null) {
			params.put("minVolume", this.minVolume);
		}
		return params;
	}

}