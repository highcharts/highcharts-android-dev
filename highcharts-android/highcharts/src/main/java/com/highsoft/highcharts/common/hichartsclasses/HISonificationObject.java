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



public class HISonificationObject extends HIFoundation { 

	private HIFunction Earcon;
	/**
 The Earcon class. 
	*/
	public void setEarcon(HIFunction Earcon) {
		this.Earcon = Earcon;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getEarcon(){ return Earcon; }

	private HIFunction Instrument;
	/**
 The Instrument class. 
	*/
	public void setInstrument(HIFunction Instrument) {
		this.Instrument = Instrument;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getInstrument(){ return Instrument; }

	private Number fadeOutDuration;
	/**
 Note fade-out-time in milliseconds. Most notes are faded out quickly by defaults if there is time. This is to avoid abrupt stops which will cause perceived clicks. 
	*/
	public void setFadeOutDuration(Number fadeOutDuration) {
		this.fadeOutDuration = fadeOutDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFadeOutDuration(){ return fadeOutDuration; }

	private Object instruments;
	/**
 Predefined instruments, given as an object with a map between the instrument name and the Highcharts.Instrument object. 
	*/
	public void setInstruments(Object instruments) {
		this.instruments = instruments;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getInstruments(){ return instruments; }



	public HISonificationObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.Earcon != null) {
			params.put("Earcon", this.Earcon);
		}
		if (this.Instrument != null) {
			params.put("Instrument", this.Instrument);
		}
		if (this.fadeOutDuration != null) {
			params.put("fadeOutDuration", this.fadeOutDuration);
		}
		if (this.instruments != null) {
			params.put("instruments", this.instruments);
		}
		return params;
	}

}