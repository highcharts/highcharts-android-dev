/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIAnimation extends HIFoundation { 

	private Number duration;
	/**
 The duration of the hover animation in milliseconds. By defaults the hover state animates quickly in, and slowly back to normal. 
	*/
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }



	public HIAnimation() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		return params;
	}

}