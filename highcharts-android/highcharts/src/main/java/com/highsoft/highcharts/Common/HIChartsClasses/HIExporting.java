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
* description: Options for the exporting module. For an overview on the matter, see http://www.highcharts.com/docs/export-module/export-module-overview : the docs.
*/
public class HIExporting implements HIChartsJSONSerializable { 


/**
* description: The pixel width of charts exported to PNG or JPG. As of Highcharts
3.0, the default pixel width is a function of the chart.width or exporting.sourceWidth and the
exporting.scale.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/width/ : Export to 200px wide images
* default: undefined
*/
	public Number width;

/**
* description: Path where Highcharts will look for export module dependencies to
load on demand if they don't already exist on window. Should currently
point to location of https://github.com/canvg/canvg : CanVG library,
https://github.com/canvg/canvg : RGBColor.js, https://github.
com/yWorks/jsPDF : jsPDF and https://github.com/yWorks/svg2pdf.
js : svg2pdf.js, required for client side export in certain browsers.
*/
	public String libURL;

/**
* description: Function to call if the offline-exporting module fails to export
a chart on the client side, and fallbackToExportServer is disabled. If left undefined, an exception
is thrown instead.
* default: undefined
*/
	public HIGFunction /* Function */ error;

/**
* description: Whether or not to fall back to the export server if the offline-exporting
module is unable to export the chart on the client side.
* default: true
*/
	public Boolean fallbackToExportServer;

/**
* description: When printing the chart from the menu item in the burger menu, if
the on-screen chart exceeds this width, it is resized. After printing
or cancelled, it is restored. The default width makes the chart
fit into typical paper format. Note that this does not affect the
chart when printing the web page as a whole.
* default: 780
*/
	public Number printMaxWidth;

/**
* description: Defines the scale or zoom factor for the exported image compared
to the on-screen display. While for instance a 600px wide chart
may look good on a website, it will look bad in print. The default
scale of 2 makes this chart export to a 1200px PNG or JPG.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/scale/ : Scale demonstrated
* default: 2
*/
	public Number scale;

/**
* description: An object containing additional attributes for the POST form that
sends the SVG to the export server. For example, a target can be
set to make sure the generated image is received in another frame,
 or a custom enctype or encoding can be set.
*/
	public Object formAttributes;

/**
* description: The URL for the server module converting the SVG string to an image
format. By default this points to Highchart's free web service.
* default: https://export.highcharts.com/
*/
	public String url;

/**
* description: Options for the export related buttons, print and export. In addition
to the default buttons listed here, custom buttons can be added.
See navigation.buttonOptions for general
options.
*/
	public HIButtons buttons;

/**
* description: Experimental setting to allow HTML inside the chart (added through
the useHTML options), directly in the exported image. This allows
you to preserve complicated HTML structures like tables or bi-directional
text in exported charts.
Disclaimer: The HTML is rendered in a foreignObject tag in the
generated SVG. The official export server is based on PhantomJS,
which supports this, but other SVG clients, like Batik, does not
support it. This also applies to downloaded SVG that you want to
open in a desktop client.
* default: false
*/
	public Boolean allowHTML;

/**
* description: Default MIME type for exporting if chart.exportChart() is called
without specifying a type option. Possible values are image/png,
 image/jpeg, application/pdf and image/svg+xml.

* accepted values: ["image/png", "image/jpeg", "application/pdf", "image/svg+xml"]
* default: image/png
*/
	public String type;

/**
* description: Options for exporting data to CSV or ExCel, or displaying the data
in a HTML table or a JavaScript structure. Requires the
export-data.js module. This module adds data export options to the
export menu and provides functions like Chart.getCSV,
Chart.getTable, Chart.getDataRows and Chart.viewData.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/categorized/ : Categorized data
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/stock-timeaxis/ : Highstock time axis
*/
	public HICsv csv;

/**
* description: The width of the original chart when exported, unless an explicit
chart.width is set. The width exported raster image
is then multiplied by scale.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/sourcewidth/ : Source size demo
*/
	public Number sourceWidth;

/**
* description: An object consisting of definitions for the menu items in the context
menu. Each key value pair has a key that is referenced in the
menuItems setting,
and a value, which is an object with the following properties:

onclick
The click handler for the menu item
text
The text for the menu item
textKey
If internationalization is required, the key to a language string

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/ : Menu item definitions

*/
	public Object menuItemDefinitions;

/**
* description: Additional chart options to be merged into an exported chart. For
example, a common use case is to add data labels to improve readability
of the exported chart, or to add a printer-friendly color scheme.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/chartoptions-data-labels/ : Added data labels
* default: null
*/
	public Object chartOptions;

/**
* description: Export-data module required. Show a HTML table below the chart with 
the chart's current data.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/showtable/ : Show the table
*/
	public Boolean showTable;

/**
* description: Analogous to sourceWidth.
*/
	public Number sourceHeight;

/**
* description: Whether to enable the exporting module. Disabling the module will
hide the context button, but API methods will still be available.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/enabled-false/ : Exporting module is loaded but disabled
* default: true
*/
	public Boolean enabled;

/**
* description: The filename, without extension, to use for the exported chart.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/filename/ : Custom file name
* default: chart
*/
	public String filename;


	public HIExporting() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.libURL != null) {
			params.put("libURL", this.libURL);
		}
		if (this.error != null) {
			params.put("error", this.error);
		}
		if (this.fallbackToExportServer != null) {
			params.put("fallbackToExportServer", this.fallbackToExportServer);
		}
		if (this.printMaxWidth != null) {
			params.put("printMaxWidth", this.printMaxWidth);
		}
		if (this.scale != null) {
			params.put("scale", this.scale);
		}
		if (this.formAttributes != null) {
			params.put("formAttributes", this.formAttributes);
		}
		if (this.url != null) {
			params.put("url", this.url);
		}
		if (this.buttons != null) {
			params.put("buttons", this.buttons.getParams());
		}
		if (this.allowHTML != null) {
			params.put("allowHTML", this.allowHTML);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.csv != null) {
			params.put("csv", this.csv.getParams());
		}
		if (this.sourceWidth != null) {
			params.put("sourceWidth", this.sourceWidth);
		}
		if (this.menuItemDefinitions != null) {
			params.put("menuItemDefinitions", this.menuItemDefinitions);
		}
		if (this.chartOptions != null) {
			params.put("chartOptions", this.chartOptions);
		}
		if (this.showTable != null) {
			params.put("showTable", this.showTable);
		}
		if (this.sourceHeight != null) {
			params.put("sourceHeight", this.sourceHeight);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.filename != null) {
			params.put("filename", this.filename);
		}
		return params;
	}

}