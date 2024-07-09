/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



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
 An object consisting of definitions for the menu items in the context menu. Each key value pair has a `key` that is referenced in the `menuItems` setting, and a `value`, which is an object with the following properties: - **onclick:** The click handler for the menu item - **text:** The text for the menu item - **textKey:** If internationalization is required, the key to a language  string Custom text for the "exitFullScreen" can be set only in lang options (it is not a separate button). 
 <br><br><b>defaults:</b><br><br>&ensp;{"viewFullscreen": {}, "printChart": {}, "separator": {}, "downloadPNG": {}, "downloadJPEG": {}, "downloadPDF": {}, "downloadSVG": {}}	*/
	public void setMenuItemDefinitions(Object menuItemDefinitions) {
		this.menuItemDefinitions = menuItemDefinitions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getMenuItemDefinitions(){ return menuItemDefinitions; }

	private HashMap chartOptions;
	/**
 Additional chart options to be merged into the chart before exporting to an image format. This does not apply to printing the chart via the export menu. For example, a common use case is to add data labels to improve readability of the exported chart, or to add a printer-friendly color scheme to exported PDFs. 
	*/
	public void setChartOptions(HashMap chartOptions) {
		this.chartOptions = chartOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getChartOptions(){ return chartOptions; }

	private Number sourceHeight;
	/**
 Analogous to `sourceWidth`. 
	*/
	public void setSourceHeight(Number sourceHeight) {
		this.sourceHeight = sourceHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSourceHeight(){ return sourceHeight; }

	private Number sourceWidth;
	/**
 The width of the original chart when exported, unless an explicit `chart.width` is set, or a pixel width is set on the container. The width exported raster image is then multiplied by `scale`. 
	*/
	public void setSourceWidth(Number sourceWidth) {
		this.sourceWidth = sourceWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSourceWidth(){ return sourceWidth; }

	private Number scale;
	/**
 Defines the scale or zoom factor for the exported image compared to the on-screen display. While for instance a 600px wide chart may look good on a website, it will look bad in print. The defaults scale of 2 makes this chart export to a 1200px PNG or JPG. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setScale(Number scale) {
		this.scale = scale;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScale(){ return scale; }

	private Boolean showTable;
	/**
 Show a HTML table below the chart with the chart's current data. 
	*/
	public void setShowTable(Boolean showTable) {
		this.showTable = showTable;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowTable(){ return showTable; }

	private String filename;
	/**
 The filename, without extension, to use for the exported chart. 
 <br><br><b>defaults:</b><br><br>&ensp;chart	*/
	public void setFilename(String filename) {
		this.filename = filename;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFilename(){ return filename; }

	private HIButtons buttons;
	/**
 Options for the export related buttons, print and export. In addition to the defaults buttons listed here, custom buttons can be added. See `navigation.buttonOptions` for general options. 
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
 The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0, the defaults pixel width is a function of the `chart.width` or `exporting.sourceWidth` and the `exporting.scale`. 
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
 <br><br><b>defaults:</b><br><br>&ensp;780	*/
	public void setPrintMaxWidth(Number printMaxWidth) {
		this.printMaxWidth = printMaxWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPrintMaxWidth(){ return printMaxWidth; }

	private HICsv csv;
	/**
 Options for exporting data to CSV or ExCel, or displaying the data in a HTML table or a JavaScript structure. This module adds data export options to the export menu and provides functions like `Chart.getCSV`, `Chart.getTable`, `Chart.getDataRows` and `Chart.viewData`. The XLS converter is limited and only creates a HTML string that is passed for download, which works but creates a warning before opening. The workaround for this is to use a third party XLSX converter, as demonstrated in the sample below. 
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
 Default MIME type for exporting if `chart.exportChart()` is called without specifying a `type` option. Possible values are `image/png`, `image/jpeg`, `application/pdf` and `image/svg+xml`. 
 <br><br><b>defaults:</b><br><br>&ensp;image/png	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Object /* boolean, String */ tableCaption;
	/**
 Caption for the data table. Same as chart title by defaults. Set to `false` to disable. 
	*/
	public void setTableCaption(Object /* boolean, String */ tableCaption) {
		this.tableCaption = tableCaption;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* boolean, String */ getTableCaption(){ return tableCaption; }

	private Boolean useMultiLevelHeaders;
	/**
 Use multi level headers in data table. If `csv.columnHeaderFormatter` is defined, it has to return objects in order for multi level headers to work. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setUseMultiLevelHeaders(Boolean useMultiLevelHeaders) {
		this.useMultiLevelHeaders = useMultiLevelHeaders;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseMultiLevelHeaders(){ return useMultiLevelHeaders; }

	private Boolean useRowspanHeaders;
	/**
 If using multi level table headers, use rowspans for headers that have only one level. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setUseRowspanHeaders(Boolean useRowspanHeaders) {
		this.useRowspanHeaders = useRowspanHeaders;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseRowspanHeaders(){ return useRowspanHeaders; }

	private Boolean fallbackToExportServer;
	/**
 Whether or not to fall back to the export server if the offline-exporting module is unable to export the chart on the client side. This happens for certain browsers, and certain features (e.g. `allowHTML`), depending on the image type exporting to. For very complex charts, it is possible that export can fail in browsers that don't support Blob objects, due to data URL length limits. It is recommended to define the `exporting.error` handler if disabling fallback, in order to notify users in case export fails. 
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
 <br><br><b>defaults:</b><br><br>&ensp;https://export.highcharts.com/	*/
	public void setUrl(String url) {
		this.url = url;
		this.setChanged();
		this.notifyObservers();
	}

	public String getUrl(){ return url; }

	private Boolean enabled;
	/**
 Whether to enable the exporting module. Disabling the module will hide the context button, but API methods will still be available. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean allowHTML;
	/**
 Experimental setting to allow HTML inside the chart (added through the `useHTML` options), directly in the exported image. This allows you to preserve complicated HTML structures like tables or bi-directional text in exported charts. Disclaimer: The HTML is rendered in a `foreignObject` tag in the generated SVG. The official export server is based on PhantomJS, which supports this, but other SVG clients, like Batik, does not support it. This also applies to downloaded SVG that you want to open in a desktop client. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setAllowHTML(Boolean allowHTML) {
		this.allowHTML = allowHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowHTML(){ return allowHTML; }

	private Object fetchOptions;
	/**
 Options for the fetch request used when sending the SVG to the export server. See [MDN](https://developer.mozilla.org/en-US/docs/Web/API/fetch) for more information 
	*/
	public void setFetchOptions(Object fetchOptions) {
		this.fetchOptions = fetchOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getFetchOptions(){ return fetchOptions; }

	private Boolean showExportInProgress;
	/**
 Display a message when export is in progress. Uses `Chart.setLoading()` The message can be altered by changing [](#lang.exporting.exportInProgress) 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setShowExportInProgress(Boolean showExportInProgress) {
		this.showExportInProgress = showExportInProgress;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowExportInProgress(){ return showExportInProgress; }

	private HIPdfFont pdfFont;
	/**
 Settings for a custom font for the exported PDF, when using the `offline-exporting` module. This is used for languages containing non-ASCII characters, like Chinese, Russian, Japanese etc. As described in the [jsPDF docs](https://github.com/parallax/jsPDF#use-of-unicode-characters--utf-8), the 14 standard fonts in PDF are limited to the ASCII-codepage. Therefore, in order to support other text in the exported PDF, one or more TTF font files have to be passed on to the exporting module. See more in [the docs](https://www.highcharts.com/docs/export-module/client-side-export). 
	*/
	public void setPdfFont(HIPdfFont pdfFont) {
		this.pdfFont = pdfFont;
		this.pdfFont.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPdfFont getPdfFont(){ return pdfFont; }

	private Boolean allowTableSorting;
	/**
 Allows the end user to sort the data table by clicking on column headers. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setAllowTableSorting(Boolean allowTableSorting) {
		this.allowTableSorting = allowTableSorting;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowTableSorting(){ return allowTableSorting; }

	private HIFunction error;
	/**
 Function to call if the offline-exporting module fails to export a chart on the client side, and `fallbackToExportServer` is disabled. If left undefined, an exception is thrown instead. Receives two parameters, the exporting options, and the error from the module. 
	*/
	public void setError(HIFunction error) {
		this.error = error;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getError(){ return error; }

	private String libURL;
	/**
 Path where Highcharts will look for export module dependencies to load on demand if they don't already exist on `window`. Should currently point to location of [CanVG](https://github.com/canvg/canvg) library, [jsPDF](https://github.com/parallax/jsPDF) and [svg2pdf.js](https://github.com/yWorks/svg2pdf.js), required for client side export in certain browsers. 
	*/
	public void setLibURL(String libURL) {
		this.libURL = libURL;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLibURL(){ return libURL; }

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
		if (this.chartOptions != null) {
			params.put("chartOptions", this.chartOptions);
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
		if (this.fetchOptions != null) {
			params.put("fetchOptions", this.fetchOptions);
		}
		if (this.showExportInProgress != null) {
			params.put("showExportInProgress", this.showExportInProgress);
		}
		if (this.pdfFont != null) {
			params.put("pdfFont", this.pdfFont.getParams());
		}
		if (this.allowTableSorting != null) {
			params.put("allowTableSorting", this.allowTableSorting);
		}
		if (this.error != null) {
			params.put("error", this.error);
		}
		if (this.libURL != null) {
			params.put("libURL", this.libURL);
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