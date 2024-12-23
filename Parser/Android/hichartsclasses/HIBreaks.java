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



public class HIBreaks extends HIFoundation { 

	private Object /* Number, String */ to;
	/**
 The axis value where the break ends. On datetime axes, this may be a date string. 
	*/
	public void setTo(Object /* Number, String */ to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getTo(){ return to; }

	private Number breakSize;
	/**
 A number indicating how much space should be left between the start and the end of the break. The break size is given in axis units, so for instance on a `datetime` axis, a break size of 3600000 would indicate the equivalent of an hour. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBreakSize(Number breakSize) {
		this.breakSize = breakSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBreakSize(){ return breakSize; }

	private Object /* Number, String */ from;
	/**
 The axis value where the break starts. On datetime axes, this may be a date string. 
	*/
	public void setFrom(Object /* Number, String */ from) {
		this.from = from;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getFrom(){ return from; }

	private Number repeat;
	/**
 Defines an interval after which the break appears again. By defaults the breaks do not repeat. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setRepeat(Number repeat) {
		this.repeat = repeat;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRepeat(){ return repeat; }



	public HIBreaks() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.breakSize != null) {
			params.put("breakSize", this.breakSize);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.repeat != null) {
			params.put("repeat", this.repeat);
		}
		return params;
	}

}