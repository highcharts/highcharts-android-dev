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



public class HIInstrumentOptionsObject extends HIFoundation { 

	private ArrayList<Number> allowedFrequencies;
	/**
 A list of allowed frequencies for this instrument. If trying to play a frequency not on this list, the closest frequency will be used. Set to `null` to allow all frequencies to be used. Defaults to `null`. 
	*/
	public void setAllowedFrequencies(ArrayList<Number> allowedFrequencies) {
		this.allowedFrequencies = allowedFrequencies;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getAllowedFrequencies(){ return allowedFrequencies; }

	private String id;
	/**
 The unique ID of the instrument. Generated if not supplied. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private HIOscillatorOptionsObject oscillator;
	/**
 Options specific to oscillator instruments. 
	*/
	public void setOscillator(HIOscillatorOptionsObject oscillator) {
		this.oscillator = oscillator;
		this.setChanged();
		this.notifyObservers();
	}

	public HIOscillatorOptionsObject getOscillator(){ return oscillator; }

	private Number playCallbackInterval;
	/**
 When using functions to determine frequency or other parameters during playback, this options specifies how often to call the callback functions. Number given in milliseconds. Defaults to 20. 
	*/
	public void setPlayCallbackInterval(Number playCallbackInterval) {
		this.playCallbackInterval = playCallbackInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPlayCallbackInterval(){ return playCallbackInterval; }

	private String type;
	/**
 The type of instrument. Currently only `oscillator` is supported. Defaults to `oscillator`. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HIInstrumentOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.allowedFrequencies != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.allowedFrequencies) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("allowedFrequencies", array);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.oscillator != null) {
			params.put("oscillator", this.oscillator.getParams());
		}
		if (this.playCallbackInterval != null) {
			params.put("playCallbackInterval", this.playCallbackInterval);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}