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



public class HIEarconInstrument extends HIFoundation {

	private HIInstrumentPlayOptionsObject playOptions;
	/**
 The options to pass to Instrument.play. 
	*/
	public void setPlayOptions(HIInstrumentPlayOptionsObject playOptions) {
		this.playOptions = playOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public HIInstrumentPlayOptionsObject getPlayOptions(){ return playOptions; }



	public HIEarconInstrument() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.playOptions != null) {
			params.put("playOptions", this.playOptions.getParams());
		}
		return params;
	}

}