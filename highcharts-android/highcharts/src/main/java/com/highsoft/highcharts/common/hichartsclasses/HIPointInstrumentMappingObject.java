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



public class HIPointInstrumentMappingObject extends HIFoundation { 

	private Object duration;
	/**
 Define the duration of the notes for this instrument. This can be a string with a data property name, e.g. `'y'`, in which case this data property is used to define the duration relative to the `y`-values of the other points. A higher `y` value would then result in a longer duration. Alternatively, `'-y'` can be used, in which case the polarity is inverted, and a higher `y` value would result in a shorter duration. This option can also be a fixed number or a function. If it is a function, this function is called once before the note starts playing, and should return the duration in milliseconds. It receives two arguments: The point, and the dataExtremes. 
	*/
	public void setDuration(Object duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDuration(){ return duration; }

	private Object frequency;
	/**
 Define the frequency of the instrument. This can be a string with a data property name, e.g. `'y'`, in which case this data property is used to define the frequency relative to the `y`-values of the other points. A higher `y` value would then result in a higher frequency. Alternatively, `'-y'` can be used, in which case the polarity is inverted, and a higher `y` value would result in a lower frequency. This option can also be a fixed number or a function. If it is a function, this function is called in regular intervals while the note is playing. It receives three arguments: The point, the dataExtremes, and the current relative time - where 0 is the beginning of the note and 1 is the end. The function should return the frequency of the note as a number (in Hz). 
	*/
	public void setFrequency(Object frequency) {
		this.frequency = frequency;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getFrequency(){ return frequency; }

	private Object pan;
	/**
 Define the panning of the instrument. This can be a string with a data property name, e.g. `'x'`, in which case this data property is used to define the panning relative to the `x`-values of the other points. A higher `x` value would then result in a higher panning value (panned further to the right). Alternatively, `'-x'` can be used, in which case the polarity is inverted, and a higher `x` value would result in a lower panning value (panned further to the left). This option can also be a fixed number or a function. If it is a function, this function is called in regular intervals while the note is playing. It receives three arguments: The point, the dataExtremes, and the current relative time - where 0 is the beginning of the note and 1 is the end. The function should return the panning of the note as a number between -1 and 1. 
	*/
	public void setPan(Object pan) {
		this.pan = pan;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPan(){ return pan; }

	private Object volume;
	/**
 Define the volume of the instrument. This can be a string with a data property name, e.g. `'y'`, in which case this data property is used to define the volume relative to the `y`-values of the other points. A higher `y` value would then result in a higher volume. Alternatively, `'-y'` can be used, which inverts the polarity, so that a higher `y` value results in a lower volume. This option can also be a fixed number or a function. If it is a function, this function is called in regular intervals while the note is playing. It receives three arguments: The point, the dataExtremes, and the current relative time - where 0 is the beginning of the note and 1 is the end. The function should return the volume of the note as a number between 0 and 1. 
	*/
	public void setVolume(Object volume) {
		this.volume = volume;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getVolume(){ return volume; }



	public HIPointInstrumentMappingObject() {

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
		if (this.pan != null) {
			params.put("pan", this.pan);
		}
		if (this.volume != null) {
			params.put("volume", this.volume);
		}
		return params;
	}

}