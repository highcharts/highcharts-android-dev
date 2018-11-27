/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HIDateTimeLabelFormats extends Observable implements HIChartsJSONSerializable { 

	private HIMillisecond millisecond;
	public void setMillisecond(HIMillisecond millisecond) {
		this.millisecond = millisecond;
		this.millisecond.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMillisecond getMillisecond(){ return millisecond; }

	private HIWeek week;
	public void setWeek(HIWeek week) {
		this.week = week;
		this.week.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIWeek getWeek(){ return week; }

	private HIHour hour;
	public void setHour(HIHour hour) {
		this.hour = hour;
		this.hour.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHour getHour(){ return hour; }

	private HIMonth month;
	public void setMonth(HIMonth month) {
		this.month = month;
		this.month.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMonth getMonth(){ return month; }

	private HISecond second;
	public void setSecond(HISecond second) {
		this.second = second;
		this.second.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISecond getSecond(){ return second; }

	private HIYear year;
	public void setYear(HIYear year) {
		this.year = year;
		this.year.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIYear getYear(){ return year; }

	private HIDay day;
	public void setDay(HIDay day) {
		this.day = day;
		this.day.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDay getDay(){ return day; }

	private HIMinute minute;
	public void setMinute(HIMinute minute) {
		this.minute = minute;
		this.minute.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMinute getMinute(){ return minute; }



	public HIDateTimeLabelFormats() {

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
		if (this.millisecond != null) {
			params.put("millisecond", this.millisecond.getParams());
		}
		if (this.week != null) {
			params.put("week", this.week.getParams());
		}
		if (this.hour != null) {
			params.put("hour", this.hour.getParams());
		}
		if (this.month != null) {
			params.put("month", this.month.getParams());
		}
		if (this.second != null) {
			params.put("second", this.second.getParams());
		}
		if (this.year != null) {
			params.put("year", this.year.getParams());
		}
		if (this.day != null) {
			params.put("day", this.day.getParams());
		}
		if (this.minute != null) {
			params.put("minute", this.minute.getParams());
		}
		return params;
	}

}