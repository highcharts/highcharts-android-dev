/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.HashMap;



public class HITime extends HIFoundation { 

	private Object Date;
	/**
 A custom `Date` class for advanced date handling. For example, [JDate](https://github.com/tahajahangir/jdate) can be hooked in to handle Jalali dates. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setDate(Object Date) {
		this.Date = Date;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDate(){ return Date; }

	private String timezone;
	/**
 A named time zone. Supported time zone names rely on the browser implementations, as described in the [mdn docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DateTimeFormat/DateTimeFormat#timezone). If the given time zone is not recognized by the browser, Highcharts provides a warning and falls back to returning a 0 offset, corresponding to the UCT time zone. Until v11.2.0, this option depended on moment.js. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setTimezone(String timezone) {
		this.timezone = timezone;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimezone(){ return timezone; }

	private HIFunction getTimezoneOffset;
	/**
 A callback to return the time zone offset for a given datetime. It takes the timestamp in terms of milliseconds since January 1 1970, and returns the timezone offset in minutes. This provides a hook for drawing time based charts in specific time zones using their local DST crossover dates, with the help of external libraries. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setGetTimezoneOffset(HIFunction getTimezoneOffset) {
		this.getTimezoneOffset = getTimezoneOffset;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getGetTimezoneOffset(){ return getTimezoneOffset; }

	private Number timezoneOffset;
	/**
 The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript [getTimezoneOffset](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset) method. Use this to display UTC based data in a predefined time zone. 
	*/
	public void setTimezoneOffset(Number timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTimezoneOffset(){ return timezoneOffset; }

	private Boolean useUTC;
	/**
 Whether to use UTC time for axis scaling, tickmark placement and time display in `Highcharts.dateFormat`. Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings. Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setUseUTC(Boolean useUTC) {
		this.useUTC = useUTC;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseUTC(){ return useUTC; }

	private String mapFunction;
	/**
 How to perform the mapping. 
	*/
	public void setMapFunction(String mapFunction) {
		this.mapFunction = mapFunction;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapFunction(){ return mapFunction; }

	private Number min;
	/**
 The minimum value for the audio parameter. This is the lowest value the audio parameter will be mapped to. 
	*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }

	private Number max;
	/**
 The maximum value for the audio parameter. This is the highest value the audio parameter will be mapped to. 
	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private String within;
	/**
 What data values to map the parameter within. Mapping within `"series"` will make the lowest value point in the series map to the min audio parameter value, and the highest value will map to the max audio parameter. Mapping within `"chart"` will make the lowest value point in the whole chart map to the min audio parameter value, and the highest value in the whole chart will map to the max audio parameter. You can also map within the X or Y axis of each series. 
	*/
	public void setWithin(String within) {
		this.within = within;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWithin(){ return within; }

	private Number value;
	/**
 A fixed value to use for the prop when mapping. For example, if mapping to `y`, setting value to `4` will map as if all points had a y value of 4. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private String mapTo;
	/**
 A point property to map the mapping parameter to. A negative sign `-` can be placed before the property name to make mapping inverted. 
	*/
	public void setMapTo(String mapTo) {
		this.mapTo = mapTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapTo(){ return mapTo; }



	public HITime() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.Date != null) {
			params.put("Date", this.Date);
		}
		if (this.timezone != null) {
			params.put("timezone", this.timezone);
		}
		if (this.getTimezoneOffset != null) {
			params.put("getTimezoneOffset", this.getTimezoneOffset);
		}
		if (this.timezoneOffset != null) {
			params.put("timezoneOffset", this.timezoneOffset);
		}
		if (this.useUTC != null) {
			params.put("useUTC", this.useUTC);
		}
		if (this.mapFunction != null) {
			params.put("mapFunction", this.mapFunction);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.within != null) {
			params.put("within", this.within);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.mapTo != null) {
			params.put("mapTo", this.mapTo);
		}
		return params;
	}

}