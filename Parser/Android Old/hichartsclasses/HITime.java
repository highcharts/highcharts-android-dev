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



public class HITime extends HIFoundation { 

	private Boolean useUTC;
	/**
 Whether to use UTC time for axis scaling, tickmark placement and time display in Highcharts.dateFormat. Advantages of using UTC is that the time displays equally regardless of the user agent's time zone settings. Local time can be used when the data is loaded in real time or when correct Daylight Saving Time transitions are required. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/useutc-true/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/useutc-false/">False</a>
	*/
	public void setUseUTC(Boolean useUTC) {
		this.useUTC = useUTC;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseUTC(){ return useUTC; }

	private HIFunction getTimezoneOffset;
	/**
 A callback to return the time zone offset for a given datetime. It takes the timestamp in terms of milliseconds since January 1 1970, and returns the timezone offset in minutes. This provides a hook for drawing time based charts in specific time zones using their local DST crossover dates, with the help of external libraries. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/gettimezoneoffset/">Use moment.js to draw Oslo time regardless of browser locale</a>
	*/
	public void setGetTimezoneOffset(HIFunction getTimezoneOffset) {
		this.getTimezoneOffset = getTimezoneOffset;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getGetTimezoneOffset(){ return getTimezoneOffset; }

	private HIFunction moment;
	/**
 Allows to manually load the moment.js library from Highcharts options instead of the window. In case of loading the library from a script tag, this option is not needed, it will be loaded from there by defaults. 
	*/
	public void setMoment(HIFunction moment) {
		this.moment = moment;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMoment(){ return moment; }

	private Object Date;
	/**
 A custom Date class for advanced date handling. For example, [JDate](https://github.com/tahajahangir/jdate) can be hooked in to handle Jalali dates. 
	*/
	public void setDate(Object Date) {
		this.Date = Date;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDate(){ return Date; }

	private String timezone;
	/**
 Requires [moment.js](https://momentjs.com/). If the timezone option is specified, it creates a defaults getTimezoneOffset function that looks up the specified timezone in moment.js. If moment.js is not included, this throws a Highcharts error in the console, but does not crash the chart. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezone/">Europe/Oslo</a>
	*/
	public void setTimezone(String timezone) {
		this.timezone = timezone;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimezone(){ return timezone; }

	private Number timezoneOffset;
	/**
 The timezone offset in minutes. Positive values are west, negative values are east of UTC, as in the ECMAScript [getTimezoneOffset](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset) method. Use this to display UTC based data in a predefined time zone. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezoneoffset/">Timezone offset</a>
	*/
	public void setTimezoneOffset(Number timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTimezoneOffset(){ return timezoneOffset; }



	public HITime() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.useUTC != null) {
			params.put("useUTC", this.useUTC);
		}
		if (this.getTimezoneOffset != null) {
			params.put("getTimezoneOffset", this.getTimezoneOffset);
		}
		if (this.moment != null) {
			params.put("moment", this.moment);
		}
		if (this.Date != null) {
			params.put("Date", this.Date);
		}
		if (this.timezone != null) {
			params.put("timezone", this.timezone);
		}
		if (this.timezoneOffset != null) {
			params.put("timezoneOffset", this.timezoneOffset);
		}
		return params;
	}

}