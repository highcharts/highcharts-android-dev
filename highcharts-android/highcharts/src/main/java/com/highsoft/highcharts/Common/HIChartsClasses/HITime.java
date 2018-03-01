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
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HITime implements HIChartsJSONSerializable { 


/**
A custom Date class for advanced date handling. For example,
[JDate](https://githubcom/tahajahangir/jdate) can be hooked in to
handle Jalali dates.
*/
	public Object Date;

/**
Requires [moment.js](http://momentjs.com/). If the timezone option
is specified, it creates a default
getTimezoneOffset function that looks
up the specified timezone in moment.js. If moment.js is not included,
this throws a Highcharts error in the console, but does not crash the
chart.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezone/ : Europe/Oslo
* default: undefined
*/
	public String timezone;

/**
A callback to return the time zone offset for a given datetime. It
takes the timestamp in terms of milliseconds since January 1 1970,
and returns the timezone offset in minutes. This provides a hook
for drawing time based charts in specific time zones using their
local DST crossover dates, with the help of external libraries.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/gettimezoneoffset/ : Use moment.js to draw Oslo time regardless of browser locale
*/
	public HIFunction getTimezoneOffset;

/**
The timezone offset in minutes. Positive values are west, negative
values are east of UTC, as in the ECMAScript
[getTimezoneOffset](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset)
method. Use this to display UTC based data in a predefined time zone.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezoneoffset/ : Timezone offset
* default: 0
*/
	public Number timezoneOffset;

/**
Whether to use UTC time for axis scaling, tickmark placement and
time display in Highcharts.dateFormat. Advantages of using UTC
is that the time displays equally regardless of the user agent's
time zone settings. Local time can be used when the data is loaded
in real time or when correct Daylight Saving Time transitions are
required.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/useutc-true/ : True by default
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/useutc-false/ : False
*/
	public Boolean useUTC;


	public HITime() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
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
		return params;
	}

}