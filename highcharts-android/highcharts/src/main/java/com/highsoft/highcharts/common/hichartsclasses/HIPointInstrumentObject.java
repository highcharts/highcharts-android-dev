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



public class HIPointInstrumentObject extends HIFoundation {

	private HIPointInstrumentMappingObject instrumentMapping;
	/**
 Mapping of instrument parameters for this instrument. 
	*/
	public void setInstrumentMapping(HIPointInstrumentMappingObject instrumentMapping) {
		this.instrumentMapping = instrumentMapping;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointInstrumentMappingObject getInstrumentMapping(){ return instrumentMapping; }

	private HIPointInstrumentOptionsObject instrumentOptions;
	/**
 Options for this instrument. 
	*/
	public void setInstrumentOptions(HIPointInstrumentOptionsObject instrumentOptions) {
		this.instrumentOptions = instrumentOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointInstrumentOptionsObject getInstrumentOptions(){ return instrumentOptions; }

	private HIFunction onEnd;
	/**
 Callback to call when the instrument has stopped playing. 
	*/
	public void setOnEnd(HIFunction onEnd) {
		this.onEnd = onEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnEnd(){ return onEnd; }



	public HIPointInstrumentObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.instrumentMapping != null) {
			params.put("instrumentMapping", this.instrumentMapping.getParams());
		}
		if (this.instrumentOptions != null) {
			params.put("instrumentOptions", this.instrumentOptions.getParams());
		}
		if (this.onEnd != null) {
			params.put("onEnd", this.onEnd);
		}
		return params;
	}

}