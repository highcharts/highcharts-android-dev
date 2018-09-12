/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HIBreaks extends Observable implements HIChartsJSONSerializable { 

	private Number to;
/**
The point where the break ends.
*/
	public void setTo(Number to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTo(){ return to; }

	private Number breakSize;
/**
A number indicating how much space should be left between the start
and the end of the break. The break size is given in axis units,
so for instance on a datetime axis, a break size of 3600000 would
indicate the equivalent of an hour.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public void setBreakSize(Number breakSize) {
		this.breakSize = breakSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBreakSize(){ return breakSize; }

	private Number from;
/**
The point where the break starts.
*/
	public void setFrom(Number from) {
		this.from = from;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFrom(){ return from; }

	private Number repeat;
/**
Defines an interval after which the break appears again. By default
the breaks do not repeat.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public void setRepeat(Number repeat) {
		this.repeat = repeat;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRepeat(){ return repeat; }



	public HIBreaks() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
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