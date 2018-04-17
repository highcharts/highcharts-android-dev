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



public class HILang implements HIChartsJSONSerializable { 


/**
Export-data module only. The text for the menu item.
*/
	public String downloadCSV;

/**
Export-data module only. The text for the menu item.
*/
	public String downloadXLS;

/**
Exporting module only. The text for the PNG download menu item.
 <br><br><b>default:</b><br><br>&ensp;Download PNG image*/
	public String downloadPNG;

/**
Configure the accessibility strings in the chart. Requires the
[accessibility module](//code.highcharts.com/modules/accessibility.
js) to be loaded. For a description of the module and information
on its features, see [Highcharts Accessibility](http://www.highcharts.
com/docs/chart-concepts/accessibility).

For more dynamic control over the accessibility functionality, see
[accessibility.pointDescriptionFormatter](
accessibility.pointDescriptionFormatter),
[accessibility.seriesDescriptionFormatter](
accessibility.seriesDescriptionFormatter), and
[accessibility.screenReaderSectionFormatter](
accessibility.screenReaderSectionFormatter).
*/
	public HIAccessibility accessibility;

/**
Short week days, starting Sunday. If not specified, Highcharts uses
the first three letters of the lang.weekdays option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/shortweekdays/">Finnish two-letter abbreviations</a>*/
	public ArrayList<String> shortWeekdays;

/**
The text to display when the chart contains no data. Requires the
no-data module, see noData.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">No-data text</a> <br><br><b>default:</b><br><br>&ensp;No data to display*/
	public String noData;

/**
The loading text that appears when the chart is set into the loading
state following a call to chart.showLoading.
 <br><br><b>default:</b><br><br>&ensp;Loading...*/
	public String loading;

/**
[Metric prefixes](http://en.wikipedia.org/wiki/Metric_prefix) used
to shorten high numbers in axis labels. Replacing any of the positions
with null causes the full number to be written. Setting numericSymbols
to null disables shortening altogether.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/">Replacing the symbols with text</a> <br><br><b>default:</b><br><br>&ensp;[ "k" , "M" , "G" , "T" , "P" , "E"]*/
	public ArrayList<String> numericSymbols;

/**
Exporting module only. The text for the SVG download menu item.
 <br><br><b>default:</b><br><br>&ensp;Download SVG vector image*/
	public String downloadSVG;

/**
The magnitude of numericSymbols replacements.
Use 10000 for Japanese, Korean and various Chinese locales, which
use symbols for 10^4, 10^8 and 10^12.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbolmagnitude/">10000 magnitude for Japanese</a> <br><br><b>default:</b><br><br>&ensp;1000*/
	public Number numericSymbolMagnitude;

/**
An array containing the weekday names.
 <br><br><b>default:</b><br><br>&ensp;["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
         "Friday", "Saturday"]*/
	public ArrayList<String> weekdays;

/**
Exporting module only. The text for the menu item to print the chart.
 <br><br><b>default:</b><br><br>&ensp;Print chart*/
	public String printChart;

/**
The text for the button that appears when drilling down, linking
back to the parent series. The parent series' name is inserted for
{series.name}.
 <br><br><b>default:</b><br><br>&ensp;Back to {series.name}*/
	public String drillUpText;

/**
Export-data module only. The text for the menu item.
*/
	public String viewData;

/**
Exporting module menu. The tooltip title for the context menu holding
print and export menu items.
 <br><br><b>default:</b><br><br>&ensp;Chart context menu*/
	public String contextButtonTitle;

/**
What to show in a date field for invalid dates. Defaults to an empty
string.
*/
	public String invalidDate;

/**
The text for the label appearing when a chart is zoomed.
 <br><br><b>default:</b><br><br>&ensp;Reset zoom*/
	public String resetZoom;

/**
Exporting module only. The text for the PDF download menu item.
 <br><br><b>default:</b><br><br>&ensp;Download PDF document*/
	public String downloadPDF;

/**
Export-data module only. The text for the menu item.
*/
	public String openInCloud;

/**
An array containing the months names. Corresponds to the %B format
in Highcharts.dateFormat().
 <br><br><b>default:</b><br><br>&ensp;[ "January" , "February" , "March" , "April" , "May" ,
         "June" , "July" , "August" , "September" , "October" ,
         "November" , "December"]*/
	public ArrayList<String> months;

/**
An array containing the months names in abbreviated form. Corresponds
to the %b format in Highcharts.dateFormat().
 <br><br><b>default:</b><br><br>&ensp;[ "Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" ,
         "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"]*/
	public ArrayList<String> shortMonths;

/**
Exporting module only. The text for the JPEG download menu item.
 <br><br><b>default:</b><br><br>&ensp;Download JPEG image*/
	public String downloadJPEG;

/**
The default decimal point used in the Highcharts.numberFormat
method unless otherwise specified in the function arguments.
 <br><br><b>default:</b><br><br>&ensp;.*/
	public String decimalPoint;

/**
The tooltip title for the label appearing when a chart is zoomed.
 <br><br><b>default:</b><br><br>&ensp;Reset zoom level 1:1*/
	public String resetZoomTitle;

/**
The default thousands separator used in the Highcharts.numberFormat
method unless otherwise specified in the function arguments. Since
Highcharts 4.1 it defaults to a single space character, which is
compatible with ISO and works across Anglo-American and continental
European languages.

The default is a single space.
*/
	public String thousandsSep;


	public HILang() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.downloadCSV != null) {
			params.put("downloadCSV", this.downloadCSV);
		}
		if (this.downloadXLS != null) {
			params.put("downloadXLS", this.downloadXLS);
		}
		if (this.downloadPNG != null) {
			params.put("downloadPNG", this.downloadPNG);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
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
		if (this.noData != null) {
			params.put("noData", this.noData);
		}
		if (this.loading != null) {
			params.put("loading", this.loading);
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
		if (this.downloadSVG != null) {
			params.put("downloadSVG", this.downloadSVG);
		}
		if (this.numericSymbolMagnitude != null) {
			params.put("numericSymbolMagnitude", this.numericSymbolMagnitude);
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
		if (this.printChart != null) {
			params.put("printChart", this.printChart);
		}
		if (this.drillUpText != null) {
			params.put("drillUpText", this.drillUpText);
		}
		if (this.viewData != null) {
			params.put("viewData", this.viewData);
		}
		if (this.contextButtonTitle != null) {
			params.put("contextButtonTitle", this.contextButtonTitle);
		}
		if (this.invalidDate != null) {
			params.put("invalidDate", this.invalidDate);
		}
		if (this.resetZoom != null) {
			params.put("resetZoom", this.resetZoom);
		}
		if (this.downloadPDF != null) {
			params.put("downloadPDF", this.downloadPDF);
		}
		if (this.openInCloud != null) {
			params.put("openInCloud", this.openInCloud);
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
		if (this.downloadJPEG != null) {
			params.put("downloadJPEG", this.downloadJPEG);
		}
		if (this.decimalPoint != null) {
			params.put("decimalPoint", this.decimalPoint);
		}
		if (this.resetZoomTitle != null) {
			params.put("resetZoomTitle", this.resetZoomTitle);
		}
		if (this.thousandsSep != null) {
			params.put("thousandsSep", this.thousandsSep);
		}
		return params;
	}

}