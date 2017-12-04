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
* description: For series on a datetime axes, the date format in the tooltip's
header will by default be guessed based on the closest data points.
This member gives the default string representations used for
each unit. For an overview of the replacement codes, see dateFormat.
Defaults to:
{
    millisecond:"%A, %b %e, %H:%M:%S.%L",
    second:"%A, %b %e, %H:%M:%S",
    minute:"%A, %b %e, %H:%M",
    hour:"%A, %b %e, %H:%M",
    day:"%A, %b %e, %Y",
    week:"Week from %A, %b %e, %Y",
    month:"%B %Y",
    year:"%Y"
}
*/
public class HIDateTimeLabelFormats implements HIChartsJSONSerializable { 

	public String hour;
	public String month;
	public String year;
	public String second;
	public String week;
	public String millisecond;
	public String minute;
	public String day;


	public HIDateTimeLabelFormats() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.hour != null) {
			params.put("hour", this.hour);
		}
		if (this.month != null) {
			params.put("month", this.month);
		}
		if (this.year != null) {
			params.put("year", this.year);
		}
		if (this.second != null) {
			params.put("second", this.second);
		}
		if (this.week != null) {
			params.put("week", this.week);
		}
		if (this.millisecond != null) {
			params.put("millisecond", this.millisecond);
		}
		if (this.minute != null) {
			params.put("minute", this.minute);
		}
		if (this.day != null) {
			params.put("day", this.day);
		}
		return params;
	}

}