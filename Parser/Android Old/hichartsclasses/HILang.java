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
	*/
	public void setDownloadCSV(String downloadCSV) {
		this.downloadCSV = downloadCSV;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadCSV(){ return downloadCSV; }

	private String downloadXLS;
	/**
 The text for the menu item. 
	*/
	public void setDownloadXLS(String downloadXLS) {
		this.downloadXLS = downloadXLS;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadXLS(){ return downloadXLS; }

	private String downloadPNG;
	/**
 Exporting module only. The text for the PNG download menu item. 
	*/
	public void setDownloadPNG(String downloadPNG) {
		this.downloadPNG = downloadPNG;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadPNG(){ return downloadPNG; }

	private HIAccessibility accessibility;
	/**
 Configure the accessibility strings in the chart. Requires the [accessibility module](https://code.highcharts.com/modules/accessibility.js) to be loaded. For a description of the module and information on its features, see [Highcharts Accessibility](https://www.highcharts.com/docs/chart-concepts/accessibility). For more dynamic control over the accessibility functionality, see accessibility.point.descriptionFormatter, accessibility.series.descriptionFormatter, and accessibility.screenReaderSection.beforeChartFormatter. 
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
	*/
	public void setHideData(String hideData) {
		this.hideData = hideData;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHideData(){ return hideData; }

	private ArrayList<String> shortWeekdays;
	/**
 Short week days, starting Sunday. If not specified, Highcharts uses the first three letters of the lang.weekdays option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/shortweekdays/">Finnish two-letter abbreviations</a>
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
	*/
	public void setViewFullscreen(String viewFullscreen) {
		this.viewFullscreen = viewFullscreen;
		this.setChanged();
		this.notifyObservers();
	}

	public String getViewFullscreen(){ return viewFullscreen; }

	private String noData;
	/**
 The text to display when the chart contains no data. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">No-data text</a>
	*/
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
 The loading text that appears when the chart is set into the loading state following a call to chart.showLoading. 
	*/
	public void setLoading(String loading) {
		this.loading = loading;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLoading(){ return loading; }

	private ArrayList<String> numericSymbols;
	/**
 [Metric prefixes](https://en.wikipedia.org/wiki/Metric_prefix) used to shorten high numbers in axis labels. Replacing any of the positions with null causes the full number to be written. Setting numericSymbols to null disables shortening altogether. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbols/">Replacing the symbols with text</a>
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
	*/
	public void setPrintChart(String printChart) {
		this.printChart = printChart;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPrintChart(){ return printChart; }

	private Number numericSymbolMagnitude;
	/**
 The magnitude of numericSymbols replacements. Use 10000 for Japanese, Korean and various Chinese locales, which use symbols for 10^4, 10^8 and 10^12. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/lang/numericsymbolmagnitude/">10000 magnitude for Japanese</a>
 <br><br><b>defaults:</b><br><br>&ensp;1000	*/
	public void setNumericSymbolMagnitude(Number numericSymbolMagnitude) {
		this.numericSymbolMagnitude = numericSymbolMagnitude;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNumericSymbolMagnitude(){ return numericSymbolMagnitude; }

	private ArrayList<String> weekdays;
	/**
 An array containing the weekday names. 
 <br><br><b>defaults:</b><br><br>&ensp;["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
         "Friday", "Saturday"]	*/
	public void setWeekdays(ArrayList<String> weekdays) {
		this.weekdays = weekdays;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getWeekdays(){ return weekdays; }

	private String downloadSVG;
	/**
 Exporting module only. The text for the SVG download menu item. 
	*/
	public void setDownloadSVG(String downloadSVG) {
		this.downloadSVG = downloadSVG;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadSVG(){ return downloadSVG; }

	private Object drillUpText;
	/**
 The text for the button that appears when drilling down, linking back to the parent series. The parent series' name is inserted for {series.name}. 
	*/
	public void setDrillUpText(Object drillUpText) {
		this.drillUpText = drillUpText;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDrillUpText(){ return drillUpText; }

	private String viewData;
	/**
 The text for the menu item. 
	*/
	public void setViewData(String viewData) {
		this.viewData = viewData;
		this.setChanged();
		this.notifyObservers();
	}

	public String getViewData(){ return viewData; }

	private String contextButtonTitle;
	/**
 Exporting module menu. The tooltip title for the context menu holding print and export menu items. 
	*/
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

	private String exitFullscreen;
	/**
 Exporting module only. The text for the menu item to exit the chart from full screen. 
	*/
	public void setExitFullscreen(String exitFullscreen) {
		this.exitFullscreen = exitFullscreen;
		this.setChanged();
		this.notifyObservers();
	}

	public String getExitFullscreen(){ return exitFullscreen; }

	private String resetZoom;
	/**
 The text for the label appearing when a chart is zoomed. 
	*/
	public void setResetZoom(String resetZoom) {
		this.resetZoom = resetZoom;
		this.setChanged();
		this.notifyObservers();
	}

	public String getResetZoom(){ return resetZoom; }

	private String downloadPDF;
	/**
 Exporting module only. The text for the PDF download menu item. 
	*/
	public void setDownloadPDF(String downloadPDF) {
		this.downloadPDF = downloadPDF;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadPDF(){ return downloadPDF; }

	private String resetZoomTitle;
	/**
 The tooltip title for the label appearing when a chart is zoomed. 
	*/
	public void setResetZoomTitle(String resetZoomTitle) {
		this.resetZoomTitle = resetZoomTitle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getResetZoomTitle(){ return resetZoomTitle; }

	private ArrayList<String> months;
	/**
 An array containing the months names. Corresponds to the %B format in Highcharts.dateFormat(). 
 <br><br><b>defaults:</b><br><br>&ensp;["January", "February", "March", "April", "May", "June",
         "July", "August", "September", "October", "November",
         "December"]	*/
	public void setMonths(ArrayList<String> months) {
		this.months = months;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getMonths(){ return months; }

	private ArrayList<String> shortMonths;
	/**
 An array containing the months names in abbreviated form. Corresponds to the %b format in Highcharts.dateFormat(). 
 <br><br><b>defaults:</b><br><br>&ensp;["Jan", "Feb", "Mar", "Apr", "May", "Jun",
         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]	*/
	public void setShortMonths(ArrayList<String> shortMonths) {
		this.shortMonths = shortMonths;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getShortMonths(){ return shortMonths; }

	private String downloadJPEG;
	/**
 Exporting module only. The text for the JPEG download menu item. 
	*/
	public void setDownloadJPEG(String downloadJPEG) {
		this.downloadJPEG = downloadJPEG;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDownloadJPEG(){ return downloadJPEG; }

	private String decimalPoint;
	/**
 The defaults decimal point used in the Highcharts.numberFormat method unless otherwise specified in the function arguments. 
	*/
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDecimalPoint(){ return decimalPoint; }

	private HINavigation navigation;
	/**
 Configure the Popup strings in the chart. Requires the annotations.js or annotations-advanced.src.js module to be loaded. 
	*/
	public void setNavigation(HINavigation navigation) {
		this.navigation = navigation;
		this.navigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigation getNavigation(){ return navigation; }

	private String thousandsSep;
	/**
 The defaults thousands separator used in the Highcharts.numberFormat method unless otherwise specified in the function arguments. Defaults to a single space character, which is recommended in [ISO 31-0](https://en.wikipedia.org/wiki/ISO_31-0#Numbers) and works across Anglo-American and continental European languages. 
 <br><br><b>defaults:</b><br><br>&ensp;\u0020	*/
	public void setThousandsSep(String thousandsSep) {
		this.thousandsSep = thousandsSep;
		this.setChanged();
		this.notifyObservers();
	}

	public String getThousandsSep(){ return thousandsSep; }



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
		if (this.downloadPNG != null) {
			params.put("downloadPNG", this.downloadPNG);
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
		if (this.drillUpText != null) {
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
		if (this.navigation != null) {
			params.put("navigation", this.navigation.getParams());
		}
		if (this.thousandsSep != null) {
			params.put("thousandsSep", this.thousandsSep);
		}
		return params;
	}

}