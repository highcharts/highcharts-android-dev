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



public class HIExporting implements HIChartsJSONSerializable { 


/**
An object consisting of definitions for the menu items in the context
menu. Each key value pair has a key that is referenced in the
menuItems setting,
and a value, which is an object with the following properties:


onclick
The click handler for the menu item
text
The text for the menu item
textKey
If internationalization is required, the key to a language string

 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>*/
	public Object menuItemDefinitions;

/**
Analogous to sourceWidth.
*/
	public Number sourceHeight;

/**
The width of the original chart when exported, unless an explicit
chart.width is set. The width exported raster image
is then multiplied by scale.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/sourcewidth/">Source size demo</a>*/
	public Number sourceWidth;

/**
Defines the scale or zoom factor for the exported image compared
to the on-screen display. While for instance a 600px wide chart
may look good on a website, it will look bad in print. The default
scale of 2 makes this chart export to a 1200px PNG or JPG.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/scale/">Scale demonstrated</a>*/
	public Number scale;

/**
Export-data module required. Show a HTML table below the chart with
the chart's current data.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/showtable/">Show the table</a>*/
	public Boolean showTable;

/**
The filename, without extension, to use for the exported chart.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/filename/">Custom file name</a> <br><br><b>default:</b><br><br>&ensp;chart*/
	public String filename;

/**
Options for the export related buttons, print and export. In addition
to the default buttons listed here, custom buttons can be added.
See navigation.buttonOptions for general
options.
*/
	public HIButtons buttons;

/**
The pixel width of charts exported to PNG or JPG. As of Highcharts
3.0, the default pixel width is a function of the [chart.width](#chart.
width) or exporting.sourceWidth and the
exporting.scale.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/width/">Export to 200px wide images</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Number width;

/**
When printing the chart from the menu item in the burger menu, if
the on-screen chart exceeds this width, it is resized. After printing
or cancelled, it is restored. The default width makes the chart
fit into typical paper format. Note that this does not affect the
chart when printing the web page as a whole.
 <br><br><b>default:</b><br><br>&ensp;780*/
	public Number printMaxWidth;

/**
Options for exporting data to CSV or ExCel, or displaying the data
in a HTML table or a JavaScript structure. Requires the
export-data.js module. This module adds data export options to the
export menu and provides functions like Chart.getCSV,
Chart.getTable, Chart.getDataRows and Chart.viewData.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/categorized/">Categorized data</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/stock-timeaxis/">Highstock time axis</a>*/
	public HICsv csv;

/**
Default MIME type for exporting if chart.exportChart() is called
without specifying a type option. Possible values are image/png,
 image/jpeg, application/pdf and image/svg+xml.
 <br><br><b>accepted values:</b><br><br>&ensp;["image/png", "image/jpeg", "application/pdf", "image/svg+xml"]*/
	public String type;

/**
Additional chart options to be merged into an exported chart. For
example, a common use case is to add data labels to improve readability
of the exported chart, or to add a printer-friendly color scheme.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/chartoptions-data-labels/">Added data labels</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Object chartOptions;

/**
An object containing additional attributes for the POST form that
sends the SVG to the export server. For example, a target can be
set to make sure the generated image is received in another frame,
 or a custom enctype or encoding can be set.
*/
	public Object formAttributes;

/**
Whether or not to fall back to the export server if the offline-exporting
module is unable to export the chart on the client side.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean fallbackToExportServer;

/**
Export-data module required. If using multi level table headers, use
rowspans for headers that have only one level.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>*/
	public Boolean useRowspanHeaders;

/**
Export-data module required. Use multi level headers in data table.
If csv.columnHeaderFormatter
is defined, it has to return objects in order for multi level headers
to work.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>*/
	public Boolean useMultiLevelHeaders;

/**
The URL for the server module converting the SVG string to an image
format. By default this points to Highchart's free web service.
*/
	public String url;

/**
Whether to enable the exporting module. Disabling the module will
hide the context button, but API methods will still be available.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/enabled-false/">Exporting module is loaded but disabled</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
Experimental setting to allow HTML inside the chart (added through
the useHTML options), directly in the exported image. This allows
you to preserve complicated HTML structures like tables or bi-directional
text in exported charts.

Disclaimer: The HTML is rendered in a foreignObject tag in the
generated SVG. The official export server is based on PhantomJS,
which supports this, but other SVG clients, like Batik, does not
support it. This also applies to downloaded SVG that you want to
open in a desktop client.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean allowHTML;

/**
Export-data module required. Caption for the data table. Same as
chart title by default. Set to false to disable.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Object /* Boolean|String */ tableCaption;

/**
Function to call if the offline-exporting module fails to export
a chart on the client side, and [fallbackToExportServer](#exporting.
fallbackToExportServer) is disabled. If left undefined, an exception
is thrown instead.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public HIFunction error;

/**
Path where Highcharts will look for export module dependencies to
load on demand if they don't already exist on window. Should currently
point to location of [CanVG](https://github.com/canvg/canvg) library,
[RGBColor.js](https://github.com/canvg/canvg), [jsPDF](https://github.
com/yWorks/jsPDF) and [svg2pdf.js](https://github.com/yWorks/svg2pdf.
js), required for client side export in certain browsers.
*/
	public String libURL;
	public String exportRegionLabel;
	public String menuButtonLabel;
	public String chartMenuLabel;


	public HIExporting() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.menuItemDefinitions != null) {
			params.put("menuItemDefinitions", this.menuItemDefinitions);
		}
		if (this.sourceHeight != null) {
			params.put("sourceHeight", this.sourceHeight);
		}
		if (this.sourceWidth != null) {
			params.put("sourceWidth", this.sourceWidth);
		}
		if (this.scale != null) {
			params.put("scale", this.scale);
		}
		if (this.showTable != null) {
			params.put("showTable", this.showTable);
		}
		if (this.filename != null) {
			params.put("filename", this.filename);
		}
		if (this.buttons != null) {
			params.put("buttons", this.buttons.getParams());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.printMaxWidth != null) {
			params.put("printMaxWidth", this.printMaxWidth);
		}
		if (this.csv != null) {
			params.put("csv", this.csv.getParams());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.chartOptions != null) {
			params.put("chartOptions", this.chartOptions);
		}
		if (this.formAttributes != null) {
			params.put("formAttributes", this.formAttributes);
		}
		if (this.fallbackToExportServer != null) {
			params.put("fallbackToExportServer", this.fallbackToExportServer);
		}
		if (this.useRowspanHeaders != null) {
			params.put("useRowspanHeaders", this.useRowspanHeaders);
		}
		if (this.useMultiLevelHeaders != null) {
			params.put("useMultiLevelHeaders", this.useMultiLevelHeaders);
		}
		if (this.url != null) {
			params.put("url", this.url);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.allowHTML != null) {
			params.put("allowHTML", this.allowHTML);
		}
		if (this.tableCaption != null) {
			params.put("tableCaption", this.tableCaption);
		}
		if (this.error != null) {
			params.put("error", this.error);
		}
		if (this.libURL != null) {
			params.put("libURL", this.libURL);
		}
		if (this.exportRegionLabel != null) {
			params.put("exportRegionLabel", this.exportRegionLabel);
		}
		if (this.menuButtonLabel != null) {
			params.put("menuButtonLabel", this.menuButtonLabel);
		}
		if (this.chartMenuLabel != null) {
			params.put("chartMenuLabel", this.chartMenuLabel);
		}
		return params;
	}

}