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



public class HICsv extends HIFoundation { 

	private HIFunction columnHeaderFormatter;
	/**
 Formatter callback for the column headers. Parameters are: - `item` - The series or axis object) - `key` - The point key, for example y or z - `keyLength` - The amount of value keys for this item, for  example a range series has the keys `low` and `high` so the  key length is 2. If `useMultiLevelHeaders` is true, columnHeaderFormatter by defaults returns an object with columnTitle and topLevelColumnTitle for each key. Columns with the same topLevelColumnTitle have their titles merged into a single cell with colspan for table/Excel export. If `useMultiLevelHeaders` is false, or for CSV export, it returns the series name, followed by the key if there is more than one key. For the axis it returns the axis title or "Category" or "DateTime" by defaults. Return `false` to use Highcharts' proposed header. 
	*/
	public void setColumnHeaderFormatter(HIFunction columnHeaderFormatter) {
		this.columnHeaderFormatter = columnHeaderFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getColumnHeaderFormatter(){ return columnHeaderFormatter; }

	private String itemDelimiter;
	/**
 The item delimiter in the exported data. Use `;` for direct exporting to Excel. Defaults to a best guess based on the browser locale. If the locale _decimal point_ is `,`, the `itemDelimiter` defaultss to `;`, otherwise the `itemDelimiter` defaultss to `,`. 
	*/
	public void setItemDelimiter(String itemDelimiter) {
		this.itemDelimiter = itemDelimiter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getItemDelimiter(){ return itemDelimiter; }

	private String dateFormat;
	/**
 Which date format to use for exported dates on a datetime X axis. See `Highcharts.dateFormat`. 
 <br><br><b>defaults:</b><br><br>&ensp;%Y-%m-%d %H:%M:%S	*/
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDateFormat(){ return dateFormat; }

	private String lineDelimiter;
	/**
 The line delimiter in the exported data, defaultss to a newline. 
 <br><br><b>defaults:</b><br><br>&ensp;
	*/
	public void setLineDelimiter(String lineDelimiter) {
		this.lineDelimiter = lineDelimiter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLineDelimiter(){ return lineDelimiter; }

	private String decimalPoint;
	/**
 Which decimal point to use for exported CSV. Defaults to the same as the browser locale, typically `.` (English) or `,` (German, French etc). 
	*/
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDecimalPoint(){ return decimalPoint; }

	private HIAnnotations annotations;
	/**
 Options for annotations in the export-data table. 
	*/
	public void setAnnotations(HIAnnotations annotations) {
		this.annotations = annotations;
		this.annotations.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnnotations getAnnotations(){ return annotations; }



	public HICsv() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.columnHeaderFormatter != null) {
			params.put("columnHeaderFormatter", this.columnHeaderFormatter);
		}
		if (this.itemDelimiter != null) {
			params.put("itemDelimiter", this.itemDelimiter);
		}
		if (this.dateFormat != null) {
			params.put("dateFormat", this.dateFormat);
		}
		if (this.lineDelimiter != null) {
			params.put("lineDelimiter", this.lineDelimiter);
		}
		if (this.decimalPoint != null) {
			params.put("decimalPoint", this.decimalPoint);
		}
		if (this.annotations != null) {
			params.put("annotations", this.annotations.getParams());
		}
		return params;
	}

}