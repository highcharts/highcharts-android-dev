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



public class HIDateTimeLabelFormats extends Observable implements HIChartsJSONSerializable { 

	private String millisecond;
	public void setMillisecond(String millisecond) {
		this.millisecond = millisecond;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMillisecond(){ return millisecond; }

	private String week;
	public void setWeek(String week) {
		this.week = week;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWeek(){ return week; }

	private String hour;
	public void setHour(String hour) {
		this.hour = hour;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHour(){ return hour; }

	private String month;
	public void setMonth(String month) {
		this.month = month;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMonth(){ return month; }

	private String second;
	public void setSecond(String second) {
		this.second = second;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSecond(){ return second; }

	private String year;
	public void setYear(String year) {
		this.year = year;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYear(){ return year; }

	private String day;
	public void setDay(String day) {
		this.day = day;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDay(){ return day; }

	private String minute;
	public void setMinute(String minute) {
		this.minute = minute;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMinute(){ return minute; }



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
			params.put("millisecond", this.millisecond);
		}
		if (this.week != null) {
			params.put("week", this.week);
		}
		if (this.hour != null) {
			params.put("hour", this.hour);
		}
		if (this.month != null) {
			params.put("month", this.month);
		}
		if (this.second != null) {
			params.put("second", this.second);
		}
		if (this.year != null) {
			params.put("year", this.year);
		}
		if (this.day != null) {
			params.put("day", this.day);
		}
		if (this.minute != null) {
			params.put("minute", this.minute);
		}
		return params;
	}

}