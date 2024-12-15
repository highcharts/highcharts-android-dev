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



public class HIDateTimeFormatOptions extends HIFoundation { 

	private String day;
	/**
 The representation of the day. 
	*/
	public void setDay(String day) {
		this.day = day;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDay(){ return day; }

	private String era;
	/**
 The representation of the era. 
	*/
	public void setEra(String era) {
		this.era = era;
		this.setChanged();
		this.notifyObservers();
	}

	public String getEra(){ return era; }

	private String formatMatcher;
	/**
 The format matching algorithm to use. 
	*/
	public void setFormatMatcher(String formatMatcher) {
		this.formatMatcher = formatMatcher;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormatMatcher(){ return formatMatcher; }

	private Number fractionalSecondDigits;
	/**
 The number of fractional digits to use. 3 means milliseconds. 
	*/
	public void setFractionalSecondDigits(Number fractionalSecondDigits) {
		this.fractionalSecondDigits = fractionalSecondDigits;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFractionalSecondDigits(){ return fractionalSecondDigits; }

	private String hour;
	/**
 The representation of the hour. 
	*/
	public void setHour(String hour) {
		this.hour = hour;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHour(){ return hour; }

	private String hour12;
	/**
 Whether to use 12-hour time (as opposed to 24-hour time). 
	*/
	public void setHour12(String hour12) {
		this.hour12 = hour12;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHour12(){ return hour12; }

	private String localeMatcher;
	/**
 The locale matching algorithm to use. 
	*/
	public void setLocaleMatcher(String localeMatcher) {
		this.localeMatcher = localeMatcher;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLocaleMatcher(){ return localeMatcher; }

	private String minute;
	/**
 The representation of the minute. 
	*/
	public void setMinute(String minute) {
		this.minute = minute;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMinute(){ return minute; }

	private String month;
	/**
 The representation of the month. "narrow", "short", "long". 
	*/
	public void setMonth(String month) {
		this.month = month;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMonth(){ return month; }

	private String prefix;
	/**
 A prefix for the time string. Custom Highcharts option. 
	*/
	public void setPrefix(String prefix) {
		this.prefix = prefix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPrefix(){ return prefix; }

	private String second;
	/**
 The representation of the second. 
	*/
	public void setSecond(String second) {
		this.second = second;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSecond(){ return second; }

	private String suffix;
	/**
 A suffix for the time string. Custom Highcharts option. 
	*/
	public void setSuffix(String suffix) {
		this.suffix = suffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSuffix(){ return suffix; }

	private String timeZone;
	/**
 The time zone to use. The defaults is the browser's defaults time zone. 
	*/
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeZone(){ return timeZone; }

	private String timeZoneName;
	/**
 The representation of the time zone name. 
	*/
	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeZoneName(){ return timeZoneName; }

	private String weekday;
	/**
 The representation of the weekday. 
	*/
	public void setWeekday(String weekday) {
		this.weekday = weekday;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWeekday(){ return weekday; }

	private String year;
	/**
 The representation of the year. 
	*/
	public void setYear(String year) {
		this.year = year;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYear(){ return year; }



	public HIDateTimeFormatOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.day != null) {
			params.put("day", this.day);
		}
		if (this.era != null) {
			params.put("era", this.era);
		}
		if (this.formatMatcher != null) {
			params.put("formatMatcher", this.formatMatcher);
		}
		if (this.fractionalSecondDigits != null) {
			params.put("fractionalSecondDigits", this.fractionalSecondDigits);
		}
		if (this.hour != null) {
			params.put("hour", this.hour);
		}
		if (this.hour12 != null) {
			params.put("hour12", this.hour12);
		}
		if (this.localeMatcher != null) {
			params.put("localeMatcher", this.localeMatcher);
		}
		if (this.minute != null) {
			params.put("minute", this.minute);
		}
		if (this.month != null) {
			params.put("month", this.month);
		}
		if (this.prefix != null) {
			params.put("prefix", this.prefix);
		}
		if (this.second != null) {
			params.put("second", this.second);
		}
		if (this.suffix != null) {
			params.put("suffix", this.suffix);
		}
		if (this.timeZone != null) {
			params.put("timeZone", this.timeZone);
		}
		if (this.timeZoneName != null) {
			params.put("timeZoneName", this.timeZoneName);
		}
		if (this.weekday != null) {
			params.put("weekday", this.weekday);
		}
		if (this.year != null) {
			params.put("year", this.year);
		}
		return params;
	}

}