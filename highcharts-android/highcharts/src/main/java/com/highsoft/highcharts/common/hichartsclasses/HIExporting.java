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
import java.util.Map;



public class HIExporting extends HIFoundation { 

	private HIAccessibility accessibility;
	/**
 Accessibility options for the exporting menu. Requires the Accessibility module. 
	*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private Object menuItemDefinitions;
	/**
 An object consisting of definitions for the menu items in the context menu. Each key value pair has a key that is referenced in the menuItems setting, and a value, which is an object with the following properties: - **onclick:** The click handler for the menu item - **text:** The text for the menu item - **textKey:** If internationalization is required, the key to a language  string Custom text for the "exitFullScreen" can be set only in lang options (it is not a separate button). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"viewFullscreen": {}, "printChart": {}, "separator": {}, "downloadPNG": {}, "downloadJPEG": {}, "downloadPDF": {}, "downloadSVG": {}}	*/
	public void setMenuItemDefinitions(Object menuItemDefinitions) {
		this.menuItemDefinitions = menuItemDefinitions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getMenuItemDefinitions(){ return menuItemDefinitions; }

	private Number sourceHeight;
	/**
 Analogous to sourceWidth. 
	*/
	public void setSourceHeight(Number sourceHeight) {
		this.sourceHeight = sourceHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSourceHeight(){ return sourceHeight; }

	private Number sourceWidth;
	/**
 The width of the original chart when exported, unless an explicit chart.width is set, or a pixel width is set on the container. The width exported raster image is then multiplied by scale. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/sourcewidth/">Source size demo</a>
	*/
	public void setSourceWidth(Number sourceWidth) {
		this.sourceWidth = sourceWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSourceWidth(){ return sourceWidth; }

	private Number scale;
	/**
 Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The defaults scale of 2 makes this chart export to a 1200px PNG or JPG. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/scale/">Scale demonstrated</a>
	*/
	public void setScale(Number scale) {
		this.scale = scale;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScale(){ return scale; }

	private Boolean showTable;
	/**
 Show a HTML table below the chart with the chart's current data. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/showtable/">Show the table</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/exporting-table-html">Experiment with putting the table inside the subtitle to allow exporting it.</a>
	*/
	public void setShowTable(Boolean showTable) {
		this.showTable = showTable;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowTable(){ return showTable; }

	private String filename;
	/**
 The filename, without extension, to use for the exported chart. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/filename/">Custom file name</a>
 <br><br><b>defaults:</b><br><br>&ensp;chart	*/
	public void setFilename(String filename) {
		this.filename = filename;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFilename(){ return filename; }

	private HIButtons buttons;
	/**
 Options for the export related buttons, print and export. In addition to the defaults buttons listed here, custom buttons can be added. See navigation.buttonOptions for general options. 
	*/
	public void setButtons(HIButtons buttons) {
		this.buttons = buttons;
		this.buttons.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIButtons getButtons(){ return buttons; }

	private Number width;
	/**
 The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the defaults pixel width is a function of the chart.width or exporting.sourceWidth and the exporting.scale. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/width/">Export to 200px wide images</a>
	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number printMaxWidth;
	/**
 When printing the chart from the menu item in the burger menu, if the on-screen chart exceeds this width, it is resized. After printing or cancelled, it is restored. The defaults width makes the chart fit into typical paper format. Note that this does not affect the chart when printing the web page as a whole. 
	*/
	public void setPrintMaxWidth(Number printMaxWidth) {
		this.printMaxWidth = printMaxWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPrintMaxWidth(){ return printMaxWidth; }

	private HICsv csv;
	/**
 Options for exporting data to CSV or ExCel, or displaying the data in a HTML table or a JavaScript structure. This module adds data export options to the export menu and provides functions like Chart.getCSV, Chart.getTable, Chart.getDataRows and Chart.viewData. The XLS converter is limited and only creates a HTML string that is passed for download, which works but creates a warning before opening. The workaround for this is to use a third party XLSX converter, as demonstrated in the sample below. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/categorized/">Categorized data</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/stock-timeaxis/">Highstock time axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/xlsx/">Using a third party XLSX converter</a>
	*/
	public void setCsv(HICsv csv) {
		this.csv = csv;
		this.csv.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICsv getCsv(){ return csv; }

	private String type;
	/**
 Default MIME type for exporting if chart.exportChart() is called without specifying a type option. Possible values are image/png, image/jpeg, application/pdf and image/svg+xml. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Object /* boolean, String */ tableCaption;
	/**
 Caption for the data table. Same as chart title by defaults. Set to false to disable. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
	*/
	public void setTableCaption(Object /* boolean, String */ tableCaption) {
		this.tableCaption = tableCaption;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* boolean, String */ getTableCaption(){ return tableCaption; }

	private HashMap<String, Object> formAttributes;
	/**
 An object containing additional key value data for the POST form that sends the SVG to the export server. For example, a target can be set to make sure the generated image is received in another frame, or a custom enctype or encoding can be set. 
	*/
	public void setFormAttributes(HashMap<String, Object> formAttributes) {
		this.formAttributes = formAttributes;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap<String, Object> getFormAttributes(){ return formAttributes; }

	private Boolean useMultiLevelHeaders;
	/**
 Use multi level headers in data table. If csv.columnHeaderFormatter is defined, it has to return objects in order for multi level headers to work. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
	*/
	public void setUseMultiLevelHeaders(Boolean useMultiLevelHeaders) {
		this.useMultiLevelHeaders = useMultiLevelHeaders;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseMultiLevelHeaders(){ return useMultiLevelHeaders; }

	private Boolean useRowspanHeaders;
	/**
 If using multi level table headers, use rowspans for headers that have only one level. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/export-data/multilevel-table">Multiple table headers</a>
	*/
	public void setUseRowspanHeaders(Boolean useRowspanHeaders) {
		this.useRowspanHeaders = useRowspanHeaders;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseRowspanHeaders(){ return useRowspanHeaders; }

	private Boolean fallbackToExportServer;
	/**
 Whether or not to fall back to the export server if the offline-exporting module is unable to export the chart on the client side. This happens for certain browsers, and certain features (e.g.allowHTML), depending on the image type exporting to. For very complex charts, it is possible that export can fail in browsers that don't support Blob objects, due to data URL length limits. It is recommended to define the exporting.error handler if disabling fallback, in order to notify users in case export fails. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setFallbackToExportServer(Boolean fallbackToExportServer) {
		this.fallbackToExportServer = fallbackToExportServer;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFallbackToExportServer(){ return fallbackToExportServer; }

	private String url;
	/**
 The URL for the server module converting the SVG string to an image format. By defaults this points to Highchart's free web service. 
	*/
	public void setUrl(String url) {
		this.url = url;
		this.setChanged();
		this.notifyObservers();
	}

	public String getUrl(){ return url; }

	private Boolean enabled;
	/**
 Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/enabled-false/">Exporting module is loaded but disabled</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean allowHTML;
	/**
 Experimental setting to allow HTML inside the chart (added through the useHTML options), directly in the exported image. This allows you to preserve complicated HTML structures like tables or bi-directional text in exported charts. Disclaimer: The HTML is rendered in a foreignObject tag in the generated SVG. The official export server is based on PhantomJS, which supports this, but other SVG clients, like Batik, does not support it. This also applies to downloaded SVG that you want to open in a desktop client. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setAllowHTML(Boolean allowHTML) {
		this.allowHTML = allowHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowHTML(){ return allowHTML; }

	private HashMap chartOptions;
	/**
 Additional chart options to be merged into the chart before exporting to an image format. This does not apply to printing the chart via the export menu. For example, a common use case is to add data labels to improve readability of the exported chart, or to add a printer-friendly color scheme to exported PDFs. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/chartoptions-data-labels/">Added data labels</a>
	*/
	public void setChartOptions(HashMap chartOptions) {
		this.chartOptions = chartOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getChartOptions(){ return chartOptions; }

	private HIFunction error;
	/**
 Function to call if the offline-exporting module fails to export a chart on the client side, and fallbackToExportServer is disabled. If left undefined, an exception is thrown instead. Receives two parameters, the exporting options, and the error from the module. 
	*/
	public void setError(HIFunction error) {
		this.error = error;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getError(){ return error; }

	private String libURL;
	/**
 Path where Highcharts will look for export module dependencies to load on demand if they don't already exist on window. Should currently point to location of [CanVG](https://github.com/canvg/canvg) library, [RGBColor.js](https://github.com/canvg/canvg), [jsPDF](https://github.com/yWorks/jsPDF) and [svg2pdf.js](https://github.com/yWorks/svg2pdf.js), required for client side export in certain browsers. 
	*/
	public void setLibURL(String libURL) {
		this.libURL = libURL;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLibURL(){ return libURL; }

	private String exportRegionLabel;
	public void setExportRegionLabel(String exportRegionLabel) {
		this.exportRegionLabel = exportRegionLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getExportRegionLabel(){ return exportRegionLabel; }

	private String menuButtonLabel;
	public void setMenuButtonLabel(String menuButtonLabel) {
		this.menuButtonLabel = menuButtonLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMenuButtonLabel(){ return menuButtonLabel; }

	private String chartMenuLabel;
	public void setChartMenuLabel(String chartMenuLabel) {
		this.chartMenuLabel = chartMenuLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getChartMenuLabel(){ return chartMenuLabel; }



	public HIExporting() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
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
		if (this.tableCaption != null) {
			params.put("tableCaption", this.tableCaption);
		}
		if(this.formAttributes != null){
			for (Map.Entry<String, Object> entry : formAttributes.entrySet()) {
				params.put(entry.getKey(), entry.getValue());
			}
		}
		if (this.useMultiLevelHeaders != null) {
			params.put("useMultiLevelHeaders", this.useMultiLevelHeaders);
		}
		if (this.useRowspanHeaders != null) {
			params.put("useRowspanHeaders", this.useRowspanHeaders);
		}
		if (this.fallbackToExportServer != null) {
			params.put("fallbackToExportServer", this.fallbackToExportServer);
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
		if (this.chartOptions != null) {
			params.put("chartOptions", this.chartOptions);
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