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
* description: Options for exporting data to CSV or ExCel, or displaying the data
in a HTML table or a JavaScript structure. Requires the
export-data.js module. This module adds data export options to the
export menu and provides functions like Chart.getCSV,
Chart.getTable, Chart.getDataRows and Chart.viewData.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/categorized/ : Categorized data
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/stock-timeaxis/ : Highstock time axis
*/
public class HICsv implements HIChartsJSONSerializable { 


/**
* description: The line delimiter in the exported data, defaults to a newline.
* default: 

*/
	public String lineDelimiter;

/**
* description: Formatter callback for the column headers. Parameters are:

item - The series or axis object)
key -  The point key, for example y or z
keyLength - The amount of value keys for this item, for
example a range series has the keys low and high so the
key length is 2.

By default it returns the series name, followed by the key if
there is more than one key. For the axis it returns the axis
title or "Category" or "DateTime" by default.
Return false to use Highcharts' proposed header.
*/
	public HIGFunction columnHeaderFormatter;

/**
* description: Which date format to use for exported dates on a datetime X axis.
See Highcharts.dateFormat.
* default: %Y-%m-%d %H:%M:%S
*/
	public String dateFormat;

/**
* description: The item delimiter in the exported data. Use ; for direct
exporting to Excel.
* default: ,
*/
	public String itemDelimiter;


	public HICsv() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.lineDelimiter != null) {
			params.put("lineDelimiter", this.lineDelimiter);
		}
		if (this.columnHeaderFormatter != null) {
			params.put("columnHeaderFormatter", this.columnHeaderFormatter);
		}
		if (this.dateFormat != null) {
			params.put("dateFormat", this.dateFormat);
		}
		if (this.itemDelimiter != null) {
			params.put("itemDelimiter", this.itemDelimiter);
		}
		return params;
	}

}