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



public class HIHighpass extends HIFoundation { 

	private HIResonance resonance;
	/**
 Map to filter resonance in dB. Can be negative to cause a dip, or positive to cause a bump. 
	*/
	public void setResonance(HIResonance resonance) {
		this.resonance = resonance;
		this.resonance.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIResonance getResonance(){ return resonance; }

	private HIFrequency frequency;
	/**
 Map to filter frequency in Hertz from 1 to 20,000Hz. 
	*/
	public void setFrequency(HIFrequency frequency) {
		this.frequency = frequency;
		this.frequency.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFrequency getFrequency(){ return frequency; }



	public HIHighpass() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.resonance != null) {
			params.put("resonance", this.resonance.getParams());
		}
		if (this.frequency != null) {
			params.put("frequency", this.frequency.getParams());
		}
		return params;
	}

}