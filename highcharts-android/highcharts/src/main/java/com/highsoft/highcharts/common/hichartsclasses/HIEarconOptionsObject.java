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



public class HIEarconOptionsObject extends HIFoundation { 

	private String id;
	/**
 The unique ID of the Earcon. Generated if not supplied. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private ArrayList instruments;
	/**
 The instruments and their options defining this earcon. 
	*/
	public void setInstruments(ArrayList instruments) {
		this.instruments = instruments;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getInstruments(){ return instruments; }

	private HIFunction onEnd;
	/**
 Callback function to call when earcon has finished playing. 
	*/
	public void setOnEnd(HIFunction onEnd) {
		this.onEnd = onEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnEnd(){ return onEnd; }

	private Number pan;
	/**
 Global panning of all instruments. Overrides all panning on individual instruments. Can be a number between -1 and 1. 
	*/
	public void setPan(Number pan) {
		this.pan = pan;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPan(){ return pan; }

	private Number volume;
	/**
 Master volume for all instruments. Volume settings on individual instruments can still be used for relative volume between the instruments. This setting does not affect volumes set by functions in individual instruments. Can be a number between 0 and 1. Defaults to 1. 
	*/
	public void setVolume(Number volume) {
		this.volume = volume;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getVolume(){ return volume; }



	public HIEarconOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.id != null) {
			params.put("id", this.id);
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
		if (this.pan != null) {
			params.put("pan", this.pan);
		}
		if (this.volume != null) {
			params.put("volume", this.volume);
		}
		return params;
	}

}