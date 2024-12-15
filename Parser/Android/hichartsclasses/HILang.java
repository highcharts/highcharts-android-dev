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



public class HILang extends HIFoundation { 

	private String downloadCSV;
	/**
 The text for the menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;Download CSV	*/
	public void setDownloadCSV(String downloadCSV) {
		this.downloadCSV = downloadCSV;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadCSV(){ return downloadCSV; }

	private String downloadXLS;
	/**
 The text for the menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;Download XLS	*/
	public void setDownloadXLS(String downloadXLS) {
		this.downloadXLS = downloadXLS;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadXLS(){ return downloadXLS; }

	private String exportInProgress;
	/**
 Text to show when export is in progress. 
 <br><br><b>defaults:</b><br><br>&ensp;Exporting...	*/
	public void setExportInProgress(String exportInProgress) {
		this.exportInProgress = exportInProgress;
		this.setChanged();
		this.notifyObservers();
	}

	public String getExportInProgress(){ return exportInProgress; }

	private ArrayList<String> locale;
	/**
 The browser locale to use for date and number formatting. The actual locale used for each chart is determined in three steps: 1. If this `lang.locale` option is specified, it is used. 2. Else, look for the closest ancestor HTML element with a `lang`  attribute, typically the `<html>` element. 3. If no 'lang' attribute is found, use the defaults browser locale. Use `en-GB`, British English, for approximate consistency with Highcharts v < 12. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setLocale(ArrayList<String> locale) {
		this.locale = locale;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getLocale(){ return locale; }

	private HIAccessibility accessibility;
	/**
 Configure the accessibility strings in the chart. Requires the [accessibility module](https://code.highcharts.com/modules/accessibility.js) to be loaded. For a description of the module and information on its features, see [Highcharts Accessibility](https://www.highcharts.com/docs/chart-concepts/accessibility). The lang options use [Format Strings](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#format-strings) with variables that are replaced at run time. These variables should be used when available, to avoid duplicating text that is defined elsewhere. For more dynamic control over the accessibility functionality, see `accessibility.point.descriptionFormatter`, `accessibility.series.descriptionFormatter`, and `accessibility.screenReaderSection.beforeChartFormatter`. 
	*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private String hideData;
	/**
 The text for the menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;Hide data table	*/
	public void setHideData(String hideData) {
		this.hideData = hideData;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHideData(){ return hideData; }

	private ArrayList<String> shortWeekdays;
	/**
 Short week days, starting Sunday. Defaults to 'undefined', meaning the defaults short weekday names are used according to the `lang.locale` setting. 
	*/
	public void setShortWeekdays(ArrayList<String> shortWeekdays) {
		this.shortWeekdays = shortWeekdays;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getShortWeekdays(){ return shortWeekdays; }

	private HIExportData exportData;
	/**
 The text for exported table. 
	*/
	public void setExportData(HIExportData exportData) {
		this.exportData = exportData;
		this.exportData.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIExportData getExportData(){ return exportData; }

	private String viewFullscreen;
	/**
 Exporting module only. The text for the menu item to view the chart in full screen. 
 <br><br><b>defaults:</b><br><br>&ensp;View in full screen	*/
	public void setViewFullscreen(String viewFullscreen) {
		this.viewFullscreen = viewFullscreen;
		this.setChanged();
		this.notifyObservers();
	}

	public String getViewFullscreen(){ return viewFullscreen; }

	private String noData;
	/**
 The text to display when the chart contains no data. 
 <br><br><b>defaults:</b><br><br>&ensp;No data to display	*/
	public void setNoData(String noData) {
		this.noData = noData;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNoData(){ return noData; }

	private String mainBreadcrumb;
	public void setMainBreadcrumb(String mainBreadcrumb) {
		this.mainBreadcrumb = mainBreadcrumb;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMainBreadcrumb(){ return mainBreadcrumb; }

	private String loading;
	/**
 The loading text that appears when the chart is set into the loading state following a call to `chart.showLoading`. 
 <br><br><b>defaults:</b><br><br>&ensp;Loading...	*/
	public void setLoading(String loading) {
		this.loading = loading;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLoading(){ return loading; }

	private String downloadPNG;
	/**
 Exporting module only. The text for the PNG download menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;Download PNG image	*/
	public void setDownloadPNG(String downloadPNG) {
		this.downloadPNG = downloadPNG;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadPNG(){ return downloadPNG; }

	private ArrayList<String> numericSymbols;
	/**
 [Metric prefixes](https://en.wikipedia.org/wiki/Metric_prefix) used to shorten high numbers in axis labels. Replacing any of the positions with `null` causes the full number to be written. Setting `numericSymbols` to `undefined` disables shortening altogether. 
 <br><br><b>defaults:</b><br><br>&ensp;["k", "M", "G", "T", "P", "E"]	*/
	public void setNumericSymbols(ArrayList<String> numericSymbols) {
		this.numericSymbols = numericSymbols;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getNumericSymbols(){ return numericSymbols; }

	private String printChart;
	/**
 Exporting module only. The text for the menu item to print the chart. 
 <br><br><b>defaults:</b><br><br>&ensp;Print chart	*/
	public void setPrintChart(String printChart) {
		this.printChart = printChart;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPrintChart(){ return printChart; }

	private Number numericSymbolMagnitude;
	/**
 The magnitude of `numericSymbols` replacements. Use 10000 for Japanese, Korean and various Chinese locales, which use symbols for 10^4, 10^8 and 10^12. 
 <br><br><b>defaults:</b><br><br>&ensp;1000	*/
	public void setNumericSymbolMagnitude(Number numericSymbolMagnitude) {
		this.numericSymbolMagnitude = numericSymbolMagnitude;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNumericSymbolMagnitude(){ return numericSymbolMagnitude; }

	private ArrayList<String> weekdays;
	/**
 An array containing the weekday names. Defaults to 'undefined', meaning the defaults weekday names are used according to the `lang.locale` setting. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setWeekdays(ArrayList<String> weekdays) {
		this.weekdays = weekdays;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getWeekdays(){ return weekdays; }

	private String downloadSVG;
	/**
 Exporting module only. The text for the SVG download menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;Download SVG vector image	*/
	public void setDownloadSVG(String downloadSVG) {
		this.downloadSVG = downloadSVG;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadSVG(){ return downloadSVG; }

	private String viewData;
	/**
 The text for the menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;View data table	*/
	public void setViewData(String viewData) {
		this.viewData = viewData;
		this.setChanged();
		this.notifyObservers();
	}

	public String getViewData(){ return viewData; }

	private String contextButtonTitle;
	/**
 Exporting module menu. The tooltip title for the context menu holding print and export menu items. 
 <br><br><b>defaults:</b><br><br>&ensp;Chart context menu	*/
	public void setContextButtonTitle(String contextButtonTitle) {
		this.contextButtonTitle = contextButtonTitle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getContextButtonTitle(){ return contextButtonTitle; }

	private String invalidDate;
	/**
 What to show in a date field for invalid dates. Defaults to an empty string. 
	*/
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInvalidDate(){ return invalidDate; }

	private String playAsSound;
	/**
 The text for the Play as sound menu item in the export menu. 
 <br><br><b>defaults:</b><br><br>&ensp;Play as sound	*/
	public void setPlayAsSound(String playAsSound) {
		this.playAsSound = playAsSound;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPlayAsSound(){ return playAsSound; }

	private String exitFullscreen;
	/**
 Exporting module only. The text for the menu item to exit the chart from full screen. 
 <br><br><b>defaults:</b><br><br>&ensp;Exit from full screen	*/
	public void setExitFullscreen(String exitFullscreen) {
		this.exitFullscreen = exitFullscreen;
		this.setChanged();
		this.notifyObservers();
	}

	public String getExitFullscreen(){ return exitFullscreen; }

	private String resetZoom;
	/**
 The text for the label appearing when a chart is zoomed. 
 <br><br><b>defaults:</b><br><br>&ensp;Reset zoom	*/
	public void setResetZoom(String resetZoom) {
		this.resetZoom = resetZoom;
		this.setChanged();
		this.notifyObservers();
	}

	public String getResetZoom(){ return resetZoom; }

	private String downloadPDF;
	/**
 Exporting module only. The text for the PDF download menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;Download PDF document	*/
	public void setDownloadPDF(String downloadPDF) {
		this.downloadPDF = downloadPDF;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadPDF(){ return downloadPDF; }

	private String resetZoomTitle;
	/**
 The tooltip title for the label appearing when a chart is zoomed. 
 <br><br><b>defaults:</b><br><br>&ensp;Reset zoom level 1:1	*/
	public void setResetZoomTitle(String resetZoomTitle) {
		this.resetZoomTitle = resetZoomTitle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getResetZoomTitle(){ return resetZoomTitle; }

	private ArrayList<String> months;
	/**
 An array containing the months names. Corresponds to the `%B` format in `Highcharts.dateFormat()`. Defaults to 'undefined', meaning the defaults month names are used according to the `lang.locale` setting. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setMonths(ArrayList<String> months) {
		this.months = months;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getMonths(){ return months; }

	private ArrayList<String> shortMonths;
	/**
 An array containing the months names in abbreviated form. Corresponds to the `%b` format in `Highcharts.dateFormat()`. Defaults to 'undefined', meaning the defaults short month names are used according to the `lang.locale` setting. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setShortMonths(ArrayList<String> shortMonths) {
		this.shortMonths = shortMonths;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getShortMonths(){ return shortMonths; }

	private String downloadJPEG;
	/**
 Exporting module only. The text for the JPEG download menu item. 
 <br><br><b>defaults:</b><br><br>&ensp;Download JPEG image	*/
	public void setDownloadJPEG(String downloadJPEG) {
		this.downloadJPEG = downloadJPEG;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadJPEG(){ return downloadJPEG; }

	private String decimalPoint;
	/**
 The defaults decimal point used in the `Highcharts.numberFormat` method unless otherwise specified in the function arguments. Defaults to the locale decimal point as determined by `lang.locale`. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDecimalPoint(){ return decimalPoint; }

	private String thousandsSep;
	/**
 The defaults thousands separator used in the `Highcharts.numberFormat` method unless otherwise specified in the function arguments. Defaults to the locale thousands separator as determined by `lang.locale`. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setThousandsSep(String thousandsSep) {
		this.thousandsSep = thousandsSep;
		this.setChanged();
		this.notifyObservers();
	}

	public String getThousandsSep(){ return thousandsSep; }

	private HINavigation navigation;
	/**
 Configure the Popup strings in the chart. Requires the `annotations.js` or `annotations-advanced.src.js` module to be loaded. 
	*/
	public void setNavigation(HINavigation navigation) {
		this.navigation = navigation;
		this.navigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigation getNavigation(){ return navigation; }

	private String downloadMIDI;
	/**
 The text for the MIDI download menu item in the export menu. 
 <br><br><b>defaults:</b><br><br>&ensp;Download MIDI	*/
	public void setDownloadMIDI(String downloadMIDI) {
		this.downloadMIDI = downloadMIDI;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadMIDI(){ return downloadMIDI; }



	public HILang() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.downloadCSV != null) {
			params.put("downloadCSV", this.downloadCSV);
		}
		if (this.downloadXLS != null) {
			params.put("downloadXLS", this.downloadXLS);
		}
		if (this.exportInProgress != null) {
			params.put("exportInProgress", this.exportInProgress);
		}
		if (this.locale != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.locale) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("locale", array);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.hideData != null) {
			params.put("hideData", this.hideData);
		}
		if (this.shortWeekdays != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.shortWeekdays) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("shortWeekdays", array);
		}
		if (this.exportData != null) {
			params.put("exportData", this.exportData.getParams());
		}
		if (this.viewFullscreen != null) {
			params.put("viewFullscreen", this.viewFullscreen);
		}
		if (this.noData != null) {
			params.put("noData", this.noData);
		}
		if (this.mainBreadcrumb != null) {
			params.put("mainBreadcrumb", this.mainBreadcrumb);
		}
		if (this.loading != null) {
			params.put("loading", this.loading);
		}
		if (this.downloadPNG != null) {
			params.put("downloadPNG", this.downloadPNG);
		}
		if (this.numericSymbols != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.numericSymbols) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("numericSymbols", array);
		}
		if (this.printChart != null) {
			params.put("printChart", this.printChart);
		}
		if (this.numericSymbolMagnitude != null) {
			params.put("numericSymbolMagnitude", this.numericSymbolMagnitude);
		}
		if (this.weekdays != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.weekdays) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("weekdays", array);
		}
		if (this.downloadSVG != null) {
			params.put("downloadSVG", this.downloadSVG);
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
		if (this.playAsSound != null) {
			params.put("playAsSound", this.playAsSound);
		}
		if (this.exitFullscreen != null) {
			params.put("exitFullscreen", this.exitFullscreen);
		}
		if (this.resetZoom != null) {
			params.put("resetZoom", this.resetZoom);
		}
		if (this.downloadPDF != null) {
			params.put("downloadPDF", this.downloadPDF);
		}
		if (this.resetZoomTitle != null) {
			params.put("resetZoomTitle", this.resetZoomTitle);
		}
		if (this.months != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.months) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
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
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
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
		if (this.thousandsSep != null) {
			params.put("thousandsSep", this.thousandsSep);
		}
		if (this.navigation != null) {
			params.put("navigation", this.navigation.getParams());
		}
		if (this.downloadMIDI != null) {
			params.put("downloadMIDI", this.downloadMIDI);
		}
		return params;
	}

}