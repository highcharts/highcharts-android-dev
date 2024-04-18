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



public class HIAnimation extends HIFoundation { 

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

	private Number duration;
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }



	public HIAnimation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.defer != null) {
			params.put("defer", this.defer);
		}
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		return params;
	}

}