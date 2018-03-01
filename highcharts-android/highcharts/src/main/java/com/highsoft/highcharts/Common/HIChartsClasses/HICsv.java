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



public class HICsv implements HIChartsJSONSerializable { 


/**
Formatter callback for the column headers. Parameters are:
- item - The series or axis object)
- key -  The point key, for example y or z
- keyLength - The amount of value keys for this item, for
  example a range series has the keys low and high so the
  key length is 2.

If useMultiLevelHeaders is
true, columnHeaderFormatter by default returns an object with
columnTitle and topLevelColumnTitle for each key. Columns with
the same topLevelColumnTitle have their titles merged into a
single cell with colspan for table/Excel export.

If useMultiLevelHeaders is false, or for CSV export, it returns
the series name, followed by the key if there is more than one
key.

For the axis it returns the axis title or "Category" or
"DateTime" by default.

Return false to use Highcharts' proposed header.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table : Multiple table headers
*/
	public HIFunction columnHeaderFormatter;

/**
Which decimal point to use for exported CSV. Defaults to the same
as the browser locale, typically . (English) or , (German,
French etc).
*/
	public String decimalPoint;

/**
The line delimiter in the exported data, defaults to a newline.
*/
	public String lineDelimiter;

/**
The item delimiter in the exported data. Use ; for direct
exporting to Excel. Defaults to a best guess based on the browser
locale. If the locale _decimal point_ is ,, the itemDelimiter
defaults to ;, otherwise the itemDelimiter defaults to ,.
*/
	public String itemDelimiter;

/**
Which date format to use for exported dates on a datetime X axis.
See Highcharts.dateFormat.
*/
	public String dateFormat;


	public HICsv() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.columnHeaderFormatter != null) {
			params.put("columnHeaderFormatter", this.columnHeaderFormatter);
		}
		if (this.decimalPoint != null) {
			params.put("decimalPoint", this.decimalPoint);
		}
		if (this.lineDelimiter != null) {
			params.put("lineDelimiter", this.lineDelimiter);
		}
		if (this.itemDelimiter != null) {
			params.put("itemDelimiter", this.itemDelimiter);
		}
		if (this.dateFormat != null) {
			params.put("dateFormat", this.dateFormat);
		}
		return params;
	}

}