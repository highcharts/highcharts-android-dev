/**
* (c) 2009-2017 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/


package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIGFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;


/**
* description: Global options that don't apply to each chart. These options, like
the lang options, must be set using the Highcharts.setOptions
method.
Highcharts.setOptions({
    global: {
        useUTC: false
    }
});
*/
public class HIGlobal implements HIChartsJSONSerializable { 


/**
* description: Requires http://momentjs.com/ : moment.js. If the timezone option
is specified, it creates a default
getTimezoneOffset function that looks
up the specified timezone in moment.js. If moment.js is not included,
this throws a Highcharts error in the console, but does not crash the
chart.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/global/timezone/ : Europe/Oslo
* default: undefined
*/
	public String timezone;

/**
* description: Path to the pattern image required by VML browsers in order to
draw radial gradients.
*/
	public String VMLRadialGradientURL;

/**
* description: The timezone offset in minutes. Positive values are west, negative
values are east of UTC, as in the ECMAScript https://developer.
mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTimezoneOffset : getTimezoneOffset
method. Use this to display UTC based data in a predefined time zone.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/global/timezoneoffset/ : Timezone offset
* default: 0
*/
	public Number timezoneOffset;

/**
* description: A custom Date class for advanced date handling. For example,
https://githubcom/tahajahangir/jdate : JDate can be hooked in to
handle Jalali dates.
*/
	public Object Date;

/**
* description: Canvg rendering for Android 2.x is removed as of Highcharts 5.0.
Use the libURL option to configure exporting.
The URL to the additional file to lazy load for Android 2.x devices.
These devices don't support SVG, so we download a helper file that
contains http://code.google.com/p/canvg/ : canvg, its dependency
rbcolor, and our own CanVG Renderer class. To avoid hotlinking to
our site, you can install canvas-tools.js on your own server and
change this option accordingly.
*/
	public String canvasToolsURL;

/**
* description: A callback to return the time zone offset for a given datetime. It
takes the timestamp in terms of milliseconds since January 1 1970,
and returns the timezone offset in minutes. This provides a hook
for drawing time based charts in specific time zones using their
local DST crossover dates, with the help of external libraries.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/global/gettimezoneoffset/ : Use moment.js to draw Oslo time regardless of browser locale
*/
	public HIGFunction /* Function */ getTimezoneOffset;

/**
* description: Whether to use UTC time for axis scaling, tickmark placement and
time display in Highcharts.dateFormat. Advantages of using UTC
is that the time displays equally regardless of the user agent's
time zone settings. Local time can be used when the data is loaded
in real time or when correct Daylight Saving Time transitions are
required.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/global/useutc-true/ : True by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/global/useutc-false/ : False
* default: true
*/
	public Boolean useUTC;


	public HIGlobal() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.timezone != null) {
			params.put("timezone", this.timezone);
		}
		if (this.VMLRadialGradientURL != null) {
			params.put("VMLRadialGradientURL", this.VMLRadialGradientURL);
		}
		if (this.timezoneOffset != null) {
			params.put("timezoneOffset", this.timezoneOffset);
		}
		if (this.Date != null) {
			params.put("Date", this.Date);
		}
		if (this.canvasToolsURL != null) {
			params.put("canvasToolsURL", this.canvasToolsURL);
		}
		if (this.getTimezoneOffset != null) {
			params.put("getTimezoneOffset", this.getTimezoneOffset);
		}
		if (this.useUTC != null) {
			params.put("useUTC", this.useUTC);
		}
		return params;
	}

}