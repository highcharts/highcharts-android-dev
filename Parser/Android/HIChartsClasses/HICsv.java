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





public class HICsv extends Observable implements HIChartsJSONSerializable { 

	private HIFunction columnHeaderFormatter;
/**
/** Formatter callback for the column headers. Parameters are: - item - The series or axis object) - key - The point key, for example y or z - keyLength - The amount of value keys for this item, for  example a range series has the keys low and high so the  key length is 2. If useMultiLevelHeaders is true, columnHeaderFormatter by defaults returns an object with columnTitle and topLevelColumnTitle for each key. Columns with the same topLevelColumnTitle have their titles merged into a single cell with colspan for table/Excel export. If useMultiLevelHeaders is false, or for CSV export, it returns the series name, followed by the key if there is more than one key. For the axis it returns the axis title or "Category" or "DateTime" by defaults. Return false to use Highcharts' proposed header. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
*/
	public void setColumnHeaderFormatter(HIFunction columnHeaderFormatter) {
		this.columnHeaderFormatter = columnHeaderFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getColumnHeaderFormatter(){ return columnHeaderFormatter; }

	private String decimalPoint;
/**
/** Which decimal point to use for exported CSV. Defaults to the same as the browser locale, typically . (English) or , (German, French etc). 
*/
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDecimalPoint(){ return decimalPoint; }

	private String lineDelimiter;
/**
/** The line delimiter in the exported data, defaultss to a newline. 
*/
	public void setLineDelimiter(String lineDelimiter) {
		this.lineDelimiter = lineDelimiter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLineDelimiter(){ return lineDelimiter; }

	private String itemDelimiter;
/**
/** The item delimiter in the exported data. Use ; for direct exporting to Excel. Defaults to a best guess based on the browser locale. If the locale _decimal point_ is ,, the itemDelimiter defaultss to ;, otherwise the itemDelimiter defaultss to ,. 
*/
	public void setItemDelimiter(String itemDelimiter) {
		this.itemDelimiter = itemDelimiter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getItemDelimiter(){ return itemDelimiter; }

	private String dateFormat;
/**
/** Which date format to use for exported dates on a datetime X axis. See Highcharts.dateFormat. 
*/
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDateFormat(){ return dateFormat; }



	public HICsv() {

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