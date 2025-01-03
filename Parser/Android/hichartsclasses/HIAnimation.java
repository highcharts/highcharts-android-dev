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



public class HIAnimation extends HIFoundation { 

	private Number duration;
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }

	private Number defer;
	/**
 The animation delay time in milliseconds. Set to `0` renders annotation immediately. As `undefined` inherits defer time from the `series.animation.defer`. 
	*/
	public void setDefer(Number defer) {
		this.defer = defer;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDefer(){ return defer; }



	public HIAnimation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		if (this.defer != null) {
			params.put("defer", this.defer);
		}
		return params;
	}

}