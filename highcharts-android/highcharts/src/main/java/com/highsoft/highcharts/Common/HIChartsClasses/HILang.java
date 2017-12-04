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
* description: Language object. The language object is global and it can't be set
on each chart initiation. Instead, use Highcharts.setOptions to
set it before any chart is initialized.
Highcharts.setOptions({
    lang: {
        months: [
            'Janvier', 'Février', 'Mars', 'Avril',
            'Mai', 'Juin', 'Juillet', 'Août',
            'Septembre', 'Octobre', 'Novembre', 'Décembre'
        ],
        weekdays: [
            'Dimanche', 'Lundi', 'Mardi', 'Mercredi',
            'Jeudi', 'Vendredi', 'Samedi'
        ]
    }
});
*/
public class HILang implements HIChartsJSONSerializable { 


/**
* description: The text for the label appearing when a chart is zoomed.
* default: Reset zoom
*/
	public String resetZoom;

/**
* description: An array containing the months names in abbreviated form. Corresponds
to the %b format in Highcharts.dateFormat().
* default: [ "Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" ,
         "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"]
*/
	public ArrayList<String> shortMonths;

/**
* description: The magnitude of numericSymbols replacements.
Use 10000 for Japanese, Korean and various Chinese locales, which
use symbols for 10^4, 10^8 and 10^12.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbolmagnitude/ : 10000 magnitude for Japanese
* default: 1000
*/
	public Number numericSymbolMagnitude;

/**
* description: The text for the button that appears when drilling down, linking
back to the parent series. The parent series' name is inserted for
{series.name}.
* default: Back to {series.name}
*/
	public String drillUpText;

/**
* description: The text to display when the chart contains no data. Requires the
no-data module, see noData.
* default: No data to display
*/
	public String noData;

/**
* description: Exporting module only. The text for the PDF download menu item.
* default: Download PDF document
*/
	public String downloadPDF;

/**
* description: Exporting module menu. The tooltip title for the context menu holding
print and export menu items.
* default: Chart context menu
*/
	public String contextButtonTitle;

/**
* description: Short week days, starting Sunday. If not specified, Highcharts uses
the first three letters of the lang.weekdays option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/shortweekdays/ : Finnish two-letter abbreviations
*/
	public ArrayList<String> shortWeekdays;

/**
* description: The tooltip title for the label appearing when a chart is zoomed.
* default: Reset zoom level 1:1
*/
	public String resetZoomTitle;

/**
* description: Exporting module only. The text for the menu item to print the chart.
* default: Print chart
*/
	public String printChart;

/**
* description: An array containing the months names. Corresponds to the %B format
in Highcharts.dateFormat().
* default: [ "January" , "February" , "March" , "April" , "May" ,
         "June" , "July" , "August" , "September" , "October" ,
         "November" , "December"]
*/
	public ArrayList<String> months;

/**
* description: Exporting module only. The text for the SVG download menu item.
* default: Download SVG vector image
*/
	public String downloadSVG;

/**
* description: What to show in a date field for invalid dates. Defaults to an empty
string.
*/
	public String invalidDate;

/**
* description: Export-data module only. The text for the menu item.
* default: Download XLS
*/
	public String downloadXLS;

/**
* description: Exporting module only. The text for the JPEG download menu item.
* default: Download JPEG image
*/
	public String downloadJPEG;

/**
* description: Exporting module only. The text for the PNG download menu item.
* default: Download PNG image
*/
	public String downloadPNG;

/**
* description: http://en.wikipedia.org/wiki/Metric_prefix : Metric prefixes used
to shorten high numbers in axis labels. Replacing any of the positions
with null causes the full number to be written. Setting numericSymbols
to null disables shortening altogether.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/ : Replacing the symbols with text
* default: [ "k" , "M" , "G" , "T" , "P" , "E"]
*/
	public ArrayList<String> numericSymbols;

/**
* description: Export-data module only. The text for the menu item.
* default: Download CSV
*/
	public String downloadCSV;

/**
* description: An array containing the weekday names.
* default: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
         "Friday", "Saturday"]
*/
	public ArrayList<String> weekdays;

/**
* description: Export-data module only. The text for the menu item.
* default: View data table
*/
	public String viewData;

/**
* description: The loading text that appears when the chart is set into the loading
state following a call to chart.showLoading.
* default: Loading...
*/
	public String loading;

/**
* description: The default decimal point used in the Highcharts.numberFormat
method unless otherwise specified in the function arguments.
* default: .
*/
	public String decimalPoint;

/**
* description: The default thousands separator used in the Highcharts.numberFormat
method unless otherwise specified in the function arguments. Since
Highcharts 4.1 it defaults to a single space character, which is
compatible with ISO and works across Anglo-American and continental
European languages.
The default is a single space.
* default:  
*/
	public String thousandsSep;


	public HILang() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.resetZoom != null) {
			params.put("resetZoom", this.resetZoom);
		}
		if (this.shortMonths != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.shortMonths) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("shortMonths", array);
		}
		if (this.numericSymbolMagnitude != null) {
			params.put("numericSymbolMagnitude", this.numericSymbolMagnitude);
		}
		if (this.drillUpText != null) {
			params.put("drillUpText", this.drillUpText);
		}
		if (this.noData != null) {
			params.put("noData", this.noData);
		}
		if (this.downloadPDF != null) {
			params.put("downloadPDF", this.downloadPDF);
		}
		if (this.contextButtonTitle != null) {
			params.put("contextButtonTitle", this.contextButtonTitle);
		}
		if (this.shortWeekdays != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.shortWeekdays) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("shortWeekdays", array);
		}
		if (this.resetZoomTitle != null) {
			params.put("resetZoomTitle", this.resetZoomTitle);
		}
		if (this.printChart != null) {
			params.put("printChart", this.printChart);
		}
		if (this.months != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.months) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("months", array);
		}
		if (this.downloadSVG != null) {
			params.put("downloadSVG", this.downloadSVG);
		}
		if (this.invalidDate != null) {
			params.put("invalidDate", this.invalidDate);
		}
		if (this.downloadXLS != null) {
			params.put("downloadXLS", this.downloadXLS);
		}
		if (this.downloadJPEG != null) {
			params.put("downloadJPEG", this.downloadJPEG);
		}
		if (this.downloadPNG != null) {
			params.put("downloadPNG", this.downloadPNG);
		}
		if (this.numericSymbols != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.numericSymbols) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("numericSymbols", array);
		}
		if (this.downloadCSV != null) {
			params.put("downloadCSV", this.downloadCSV);
		}
		if (this.weekdays != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.weekdays) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("weekdays", array);
		}
		if (this.viewData != null) {
			params.put("viewData", this.viewData);
		}
		if (this.loading != null) {
			params.put("loading", this.loading);
		}
		if (this.decimalPoint != null) {
			params.put("decimalPoint", this.decimalPoint);
		}
		if (this.thousandsSep != null) {
			params.put("thousandsSep", this.thousandsSep);
		}
		return params;
	}

}