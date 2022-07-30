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



public class HIOscillatorOptionsObject extends HIFoundation { 

	private String waveformShape;
	/**
 The waveform shape to use for oscillator instruments. Defaults to `sine`. 
	*/
	public void setWaveformShape(String waveformShape) {
		this.waveformShape = waveformShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWaveformShape(){ return waveformShape; }



	public HIOscillatorOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.waveformShape != null) {
			params.put("waveformShape", this.waveformShape);
		}
		return params;
	}

}