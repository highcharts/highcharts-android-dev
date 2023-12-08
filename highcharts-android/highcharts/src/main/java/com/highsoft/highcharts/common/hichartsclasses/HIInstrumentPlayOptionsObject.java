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

import java.util.HashMap;



public class HIInstrumentPlayOptionsObject extends HIFoundation { 

	private Number duration;
	/**
 The duration of the note in milliseconds. 
	*/
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }

	private Object frequency;
	/**
 The frequency of the note to play. Can be a fixed number, or a function. The function receives one argument: the relative time of the note playing (0 being the start, and 1 being the end of the note). It should return the frequency number for each point in time. The poll interval of this function is specified by the Instrument.playCallbackInterval option. 
	*/
	public void setFrequency(Object frequency) {
		this.frequency = frequency;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getFrequency(){ return frequency; }

	private Number masterVolume;
	/**
 The master volume multiplier to apply to the instrument, regardless of other volume changes. Defaults to 1. 
	*/
	public void setMasterVolume(Number masterVolume) {
		this.masterVolume = masterVolume;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMasterVolume(){ return masterVolume; }

	private Number maxFrequency;
	/**
 The maximum frequency to allow. If the instrument has a set of allowed frequencies, the closest frequency is used by defaults. Use this option to stop too high frequencies from being used. 
	*/
	public void setMaxFrequency(Number maxFrequency) {
		this.maxFrequency = maxFrequency;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxFrequency(){ return maxFrequency; }

	private Number minFrequency;
	/**
 The minimum frequency to allow. If the instrument has a set of allowed frequencies, the closest frequency is used by defaults. Use this option to stop too low frequencies from being used. 
	*/
	public void setMinFrequency(Number minFrequency) {
		this.minFrequency = minFrequency;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinFrequency(){ return minFrequency; }

	private HIFunction onEnd;
	/**
 Callback function to be called when the play is completed. 
	*/
	public void setOnEnd(HIFunction onEnd) {
		this.onEnd = onEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnEnd(){ return onEnd; }

	private Object pan;
	/**
 The panning of the instrument. Can be a fixed number between -1 and 1, or a function. The function receives one argument: the relative time of the note playing (0 being the start, and 1 being the end of the note). It should return the panning value for each point in time. The poll interval of this function is specified by the Instrument.playCallbackInterval option. Defaults to 0. 
	*/
	public void setPan(Object pan) {
		this.pan = pan;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPan(){ return pan; }

	private Object volume;
	/**
 The volume of the instrument. Can be a fixed number between 0 and 1, or a function. The function receives one argument: the relative time of the note playing (0 being the start, and 1 being the end of the note). It should return the volume for each point in time. The poll interval of this function is specified by the Instrument.playCallbackInterval option. Defaults to 1. 
	*/
	public void setVolume(Object volume) {
		this.volume = volume;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getVolume(){ return volume; }



	public HIInstrumentPlayOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		if (this.frequency != null) {
			params.put("frequency", this.frequency);
		}
		if (this.masterVolume != null) {
			params.put("masterVolume", this.masterVolume);
		}
		if (this.maxFrequency != null) {
			params.put("maxFrequency", this.maxFrequency);
		}
		if (this.minFrequency != null) {
			params.put("minFrequency", this.minFrequency);
		}
		if (this.onEnd != null) {
			params.put("onEnd", this.onEnd);
		}
		if (this.pan != null) {
			params.put("pan", this.pan);
		}
		if (this.volume != null) {
			params.put("volume", this.volume);
		}
		return params;
	}

}