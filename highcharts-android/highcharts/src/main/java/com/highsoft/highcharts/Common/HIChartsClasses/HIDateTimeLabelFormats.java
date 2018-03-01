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



public class HIDateTimeLabelFormats implements HIChartsJSONSerializable { 

	public String millisecond;
	public String week;
	public String hour;
	public String month;
	public String second;
	public String year;
	public String day;
	public String minute;


	public HIDateTimeLabelFormats() {

	}

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