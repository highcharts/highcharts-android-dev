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



public class HIAccessibility extends HIFoundation { 

	private String axisRangeDateFormat;
	/**
 Date format to use to describe range of datetime axes. For an overview of the replacement codes, see `dateFormat`. 
	*/
	public void setAxisRangeDateFormat(String axisRangeDateFormat) {
		this.axisRangeDateFormat = axisRangeDateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAxisRangeDateFormat(){ return axisRangeDateFormat; }

	private String pointDateFormat;
	/**
 Date format to use for points on datetime axes when describing them to screen reader users. Defaults to the same format as in tooltip. For an overview of the replacement codes, see `dateFormat`. 
	*/
	public void setPointDateFormat(String pointDateFormat) {
		this.pointDateFormat = pointDateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointDateFormat(){ return pointDateFormat; }

	private Object highContrastTheme;
	/**
 Theme to apply to the chart when Windows High Contrast Mode is detected. 
	*/
	public void setHighContrastTheme(Object highContrastTheme) {
		this.highContrastTheme = highContrastTheme;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getHighContrastTheme(){ return highContrastTheme; }

	private String definition;
	/**
 A text description of the chart. If the Accessibility module is loaded, this is included by defaults as a long description of the chart in the hidden screen reader information region. Note: It is considered a best practice to make the description of the chart visible to all users, so consider if this can be placed in text around the chart instead. 
	*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

	private Boolean addTableShortcut;
	/**
 Whether or not to add a shortcut button in the screen reader information region to show the data table. 
	*/
	public void setAddTableShortcut(Boolean addTableShortcut) {
		this.addTableShortcut = addTableShortcut;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAddTableShortcut(){ return addTableShortcut; }

	private String landmarkVerbosity;
	/**
 Amount of landmarks/regions to create for screen reader users. More landmarks can make navigation with screen readers easier, but can be distracting if there are lots of charts on the page. Three modes are available: - all: Adds regions for all series, legend, menu, information   region. - one: Adds a single landmark per chart. - disabled: No landmarks are added. <br><br><b>accepted values:</b><br><br>&ensp;["all", "one", "disabled"]
	*/
	public void setLandmarkVerbosity(String landmarkVerbosity) {
		this.landmarkVerbosity = landmarkVerbosity;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLandmarkVerbosity(){ return landmarkVerbosity; }

	private HIFunction seriesDescriptionFormatter;
	/**
 Formatter function to use instead of the defaults for series descriptions. Receives one argument, series, referring to the series to describe. Should return a string with the description of the series for a screen reader user. If false is returned, the defaults formatter will be used for that series. 
	*/
	public void setSeriesDescriptionFormatter(HIFunction seriesDescriptionFormatter) {
		this.seriesDescriptionFormatter = seriesDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSeriesDescriptionFormatter(){ return seriesDescriptionFormatter; }

	private Number pointDescriptionThreshold;
	/**
 When a series contains more points than this, we no longer expose information about individual points to screen readers. Set to false to disable. 
	*/
	public void setPointDescriptionThreshold(Number pointDescriptionThreshold) {
		this.pointDescriptionThreshold = pointDescriptionThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointDescriptionThreshold(){ return pointDescriptionThreshold; }

	private HIFunction pointDescriptionFormatter;
	/**
 Formatter function to use instead of the defaults for point descriptions. Receives one argument, point, referring to the point to describe. Should return a string with the description of the point for a screen reader user. If false is returned, the defaults formatter will be used for that point. 
	*/
	public void setPointDescriptionFormatter(HIFunction pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDescriptionFormatter(){ return pointDescriptionFormatter; }

	private HIAnnounceNewData announceNewData;
	/**
 Options for announcing new data to screen reader users. Useful for dynamic data applications and drilldown. Keep in mind that frequent announcements will not be useful to users, as they won't have time to explore the new data. For these applications, consider making snapshots of the data accessible, and do the announcements in batches. 
	*/
	public void setAnnounceNewData(HIAnnounceNewData announceNewData) {
		this.announceNewData = announceNewData;
		this.announceNewData.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnnounceNewData getAnnounceNewData(){ return announceNewData; }

	private Boolean describeSingleSeries;
	/**
 Whether or not to add series descriptions to charts with a single series. 
	*/
	public void setDescribeSingleSeries(Boolean describeSingleSeries) {
		this.describeSingleSeries = describeSingleSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDescribeSingleSeries(){ return describeSingleSeries; }

	private Number pointNavigationThreshold;
	/**
 When a series contains more points than this, we no longer allow keyboard navigation for it. Set to false to disable. 
	*/
	public void setPointNavigationThreshold(Number pointNavigationThreshold) {
		this.pointNavigationThreshold = pointNavigationThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointNavigationThreshold(){ return pointNavigationThreshold; }

	private Object customComponents;
	/**
 A hook for adding custom components to the accessibility module. Should be an object mapping component names to instances of classes inheriting from the Highcharts.AccessibilityComponent base class. Remember to add the component to the keyboardNavigation.order for the keyboard navigation to be usable. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-component">Custom accessibility component</a>
	*/
	public void setCustomComponents(Object customComponents) {
		this.customComponents = customComponents;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getCustomComponents(){ return customComponents; }

	private HIFunction screenReaderSectionFormatter;
	/**
 A formatter function to create the HTML contents of the hidden screen reader information region. Receives one argument, chart, referring to the chart object. Should return a string with the HTML content of the region. By defaults this returns an automatic description of the chart. The button to view the chart as a data table will be added automatically after the custom HTML content if enabled. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setScreenReaderSectionFormatter(HIFunction screenReaderSectionFormatter) {
		this.screenReaderSectionFormatter = screenReaderSectionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getScreenReaderSectionFormatter(){ return screenReaderSectionFormatter; }

	private String pointValueSuffix;
	/**
 Suffix to add to the values in the point descriptions. Uses tooltip.valueSuffix if not defined. 
	*/
	public void setPointValueSuffix(String pointValueSuffix) {
		this.pointValueSuffix = pointValueSuffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointValueSuffix(){ return pointValueSuffix; }

	private String pointValueDecimals;
	/**
 Decimals to use for the values in the point descriptions. Uses tooltip.valueDecimals if not defined. 
	*/
	public void setPointValueDecimals(String pointValueDecimals) {
		this.pointValueDecimals = pointValueDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointValueDecimals(){ return pointValueDecimals; }

	private HIKeyboardNavigation keyboardNavigation;
	/**
 Options for keyboard navigation. 
	*/
	public void setKeyboardNavigation(HIKeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
		this.keyboardNavigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIKeyboardNavigation getKeyboardNavigation(){ return keyboardNavigation; }

	private Boolean enabled;
	/**
 Enable accessibility functionality for the chart. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String pointValuePrefix;
	/**
 Prefix to add to the values in the point descriptions. Uses tooltip.valuePrefix if not defined. 
	*/
	public void setPointValuePrefix(String pointValuePrefix) {
		this.pointValuePrefix = pointValuePrefix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointValuePrefix(){ return pointValuePrefix; }

	private String typeDescription;
	/**
 A text description of the chart type. If the Accessibility module is loaded, this will be included in the description of the chart in the screen reader information region. Highcharts will by defaults attempt to guess the chart type, but for more complex charts it is recommended to specify this property for clarity. 
	*/
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTypeDescription(){ return typeDescription; }

	private HIFunction onTableAnchorClick;
	/**
 Function to run upon clicking the "View as Data Table" link in the screen reader region. By defaults Highcharts will insert and set focus to a data table representation of the chart. 
	*/
	public void setOnTableAnchorClick(HIFunction onTableAnchorClick) {
		this.onTableAnchorClick = onTableAnchorClick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnTableAnchorClick(){ return onTableAnchorClick; }

	private HIFunction pointDateFormatter;
	/**
 Formatter function to determine the date/time format used with points on datetime axes when describing them to screen reader users. Receives one argument, point, referring to the point to describe. Should return a date format string compatible with `dateFormat`. 
	*/
	public void setPointDateFormatter(HIFunction pointDateFormatter) {
		this.pointDateFormatter = pointDateFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDateFormatter(){ return pointDateFormatter; }

	private Boolean exposeAsGroupOnly;
	/**
 Expose only the series element to screen readers, not its points. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setExposeAsGroupOnly(Boolean exposeAsGroupOnly) {
		this.exposeAsGroupOnly = exposeAsGroupOnly;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getExposeAsGroupOnly(){ return exposeAsGroupOnly; }

	private String rangeDescription;
	/**
 Range description for an axis. Overrides the defaults range description. Set to empty to disable range description for this axis. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setRangeDescription(String rangeDescription) {
		this.rangeDescription = rangeDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeDescription(){ return rangeDescription; }

	private String legendLabel;
	public void setLegendLabel(String legendLabel) {
		this.legendLabel = legendLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLegendLabel(){ return legendLabel; }

	private HIChartTypes chartTypes;
	/**
 Chart type description strings. This is added to the chart information region. If there is only a single series type used in the chart, we use the format string for the series type, or defaults if missing. There is one format string for cases where there is only a single series in the chart, and one for multiple series of the same type. 
	*/
	public void setChartTypes(HIChartTypes chartTypes) {
		this.chartTypes = chartTypes;
		this.chartTypes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIChartTypes getChartTypes(){ return chartTypes; }

	private String rangeSelectorMaxInput;
	public void setRangeSelectorMaxInput(String rangeSelectorMaxInput) {
		this.rangeSelectorMaxInput = rangeSelectorMaxInput;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeSelectorMaxInput(){ return rangeSelectorMaxInput; }

	private String drillUpButton;
	public void setDrillUpButton(String drillUpButton) {
		this.drillUpButton = drillUpButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDrillUpButton(){ return drillUpButton; }

	private String chartContainerLabel;
	public void setChartContainerLabel(String chartContainerLabel) {
		this.chartContainerLabel = chartContainerLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getChartContainerLabel(){ return chartContainerLabel; }

	private String mapZoomOut;
	public void setMapZoomOut(String mapZoomOut) {
		this.mapZoomOut = mapZoomOut;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapZoomOut(){ return mapZoomOut; }

	private HISeries series;
	/**
 Lang configuration for different series types. For more dynamic control over the series element descriptions, see accessibility.seriesDescriptionFormatter. 
	*/
	public void setSeries(HISeries series) {
		this.series = series;
		this.series.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private HIAxis axis;
	/**
 Axis description format strings. 
	*/
	public void setAxis(HIAxis axis) {
		this.axis = axis;
		this.axis.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAxis getAxis(){ return axis; }

	private String svgContainerLabel;
	public void setSvgContainerLabel(String svgContainerLabel) {
		this.svgContainerLabel = svgContainerLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSvgContainerLabel(){ return svgContainerLabel; }

	private String rangeSelectorMinInput;
	public void setRangeSelectorMinInput(String rangeSelectorMinInput) {
		this.rangeSelectorMinInput = rangeSelectorMinInput;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeSelectorMinInput(){ return rangeSelectorMinInput; }

	private String rangeSelectorButton;
	public void setRangeSelectorButton(String rangeSelectorButton) {
		this.rangeSelectorButton = rangeSelectorButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeSelectorButton(){ return rangeSelectorButton; }

	private HIExporting exporting;
	/**
 Exporting menu format strings for accessibility module. 
	*/
	public void setExporting(HIExporting exporting) {
		this.exporting = exporting;
		this.exporting.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIExporting getExporting(){ return exporting; }

	private String credits;
	public void setCredits(String credits) {
		this.credits = credits;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCredits(){ return credits; }

	private String legendItem;
	public void setLegendItem(String legendItem) {
		this.legendItem = legendItem;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLegendItem(){ return legendItem; }

	private String tableSummary;
	public void setTableSummary(String tableSummary) {
		this.tableSummary = tableSummary;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTableSummary(){ return tableSummary; }

	private String viewAsDataTable;
	public void setViewAsDataTable(String viewAsDataTable) {
		this.viewAsDataTable = viewAsDataTable;
		this.setChanged();
		this.notifyObservers();
	}

	public String getViewAsDataTable(){ return viewAsDataTable; }

	private String defaultsChartTitle;
	public void setDefaultChartTitle(String defaultsChartTitle) {
		this.defaultsChartTitle = defaultsChartTitle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefaultChartTitle(){ return defaultsChartTitle; }

	private String screenReaderRegionLabel;
	public void setScreenReaderRegionLabel(String screenReaderRegionLabel) {
		this.screenReaderRegionLabel = screenReaderRegionLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getScreenReaderRegionLabel(){ return screenReaderRegionLabel; }

	private String mapZoomIn;
	public void setMapZoomIn(String mapZoomIn) {
		this.mapZoomIn = mapZoomIn;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapZoomIn(){ return mapZoomIn; }

	private String chartHeading;
	public void setChartHeading(String chartHeading) {
		this.chartHeading = chartHeading;
		this.setChanged();
		this.notifyObservers();
	}

	public String getChartHeading(){ return chartHeading; }

	private String resetZoomButton;
	public void setResetZoomButton(String resetZoomButton) {
		this.resetZoomButton = resetZoomButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getResetZoomButton(){ return resetZoomButton; }

	private String svgContainerEnd;
	/**
 Label for the end of the chart. Announced by screen readers. 
	*/
	public void setSvgContainerEnd(String svgContainerEnd) {
		this.svgContainerEnd = svgContainerEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSvgContainerEnd(){ return svgContainerEnd; }

	private String svgContainerTitle;
	/**
 Title element text for the chart SVG element. Leave this empty to disable adding the title element. Browsers will display this content when hovering over elements in the chart. Assistive technology may use this element to label the chart. 
	*/
	public void setSvgContainerTitle(String svgContainerTitle) {
		this.svgContainerTitle = svgContainerTitle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSvgContainerTitle(){ return svgContainerTitle; }

	private HISeriesTypeDescriptions seriesTypeDescriptions;
	/**
 Descriptions of lesser known series types. The relevant description is added to the screen reader information region when these series types are used. 
	*/
	public void setSeriesTypeDescriptions(HISeriesTypeDescriptions seriesTypeDescriptions) {
		this.seriesTypeDescriptions = seriesTypeDescriptions;
		this.seriesTypeDescriptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeriesTypeDescriptions getSeriesTypeDescriptions(){ return seriesTypeDescriptions; }

	private String thousandsSep;
	/**
 Thousands separator to use when formatting numbers for screen readers. Note that many screen readers will not handle space as a thousands separator, and will consider "11 700" as two numbers. Set to null to use the separator defined in `lang.thousandsSep`. 
	*/
	public void setThousandsSep(String thousandsSep) {
		this.thousandsSep = thousandsSep;
		this.setChanged();
		this.notifyObservers();
	}

	public String getThousandsSep(){ return thousandsSep; }



	public HIAccessibility() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.axisRangeDateFormat != null) {
			params.put("axisRangeDateFormat", this.axisRangeDateFormat);
		}
		if (this.pointDateFormat != null) {
			params.put("pointDateFormat", this.pointDateFormat);
		}
		if (this.highContrastTheme != null) {
			params.put("highContrastTheme", this.highContrastTheme);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.addTableShortcut != null) {
			params.put("addTableShortcut", this.addTableShortcut);
		}
		if (this.landmarkVerbosity != null) {
			params.put("landmarkVerbosity", this.landmarkVerbosity);
		}
		if (this.seriesDescriptionFormatter != null) {
			params.put("seriesDescriptionFormatter", this.seriesDescriptionFormatter);
		}
		if (this.pointDescriptionThreshold != null) {
			params.put("pointDescriptionThreshold", this.pointDescriptionThreshold);
		}
		if (this.pointDescriptionFormatter != null) {
			params.put("pointDescriptionFormatter", this.pointDescriptionFormatter);
		}
		if (this.announceNewData != null) {
			params.put("announceNewData", this.announceNewData.getParams());
		}
		if (this.describeSingleSeries != null) {
			params.put("describeSingleSeries", this.describeSingleSeries);
		}
		if (this.pointNavigationThreshold != null) {
			params.put("pointNavigationThreshold", this.pointNavigationThreshold);
		}
		if (this.customComponents != null) {
			params.put("customComponents", this.customComponents);
		}
		if (this.screenReaderSectionFormatter != null) {
			params.put("screenReaderSectionFormatter", this.screenReaderSectionFormatter);
		}
		if (this.pointValueSuffix != null) {
			params.put("pointValueSuffix", this.pointValueSuffix);
		}
		if (this.pointValueDecimals != null) {
			params.put("pointValueDecimals", this.pointValueDecimals);
		}
		if (this.keyboardNavigation != null) {
			params.put("keyboardNavigation", this.keyboardNavigation.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.pointValuePrefix != null) {
			params.put("pointValuePrefix", this.pointValuePrefix);
		}
		if (this.typeDescription != null) {
			params.put("typeDescription", this.typeDescription);
		}
		if (this.onTableAnchorClick != null) {
			params.put("onTableAnchorClick", this.onTableAnchorClick);
		}
		if (this.pointDateFormatter != null) {
			params.put("pointDateFormatter", this.pointDateFormatter);
		}
		if (this.exposeAsGroupOnly != null) {
			params.put("exposeAsGroupOnly", this.exposeAsGroupOnly);
		}
		if (this.rangeDescription != null) {
			params.put("rangeDescription", this.rangeDescription);
		}
		if (this.legendLabel != null) {
			params.put("legendLabel", this.legendLabel);
		}
		if (this.chartTypes != null) {
			params.put("chartTypes", this.chartTypes.getParams());
		}
		if (this.rangeSelectorMaxInput != null) {
			params.put("rangeSelectorMaxInput", this.rangeSelectorMaxInput);
		}
		if (this.drillUpButton != null) {
			params.put("drillUpButton", this.drillUpButton);
		}
		if (this.chartContainerLabel != null) {
			params.put("chartContainerLabel", this.chartContainerLabel);
		}
		if (this.mapZoomOut != null) {
			params.put("mapZoomOut", this.mapZoomOut);
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
		}
		if (this.svgContainerLabel != null) {
			params.put("svgContainerLabel", this.svgContainerLabel);
		}
		if (this.rangeSelectorMinInput != null) {
			params.put("rangeSelectorMinInput", this.rangeSelectorMinInput);
		}
		if (this.rangeSelectorButton != null) {
			params.put("rangeSelectorButton", this.rangeSelectorButton);
		}
		if (this.exporting != null) {
			params.put("exporting", this.exporting.getParams());
		}
		if (this.credits != null) {
			params.put("credits", this.credits);
		}
		if (this.legendItem != null) {
			params.put("legendItem", this.legendItem);
		}
		if (this.tableSummary != null) {
			params.put("tableSummary", this.tableSummary);
		}
		if (this.viewAsDataTable != null) {
			params.put("viewAsDataTable", this.viewAsDataTable);
		}
		if (this.defaultsChartTitle != null) {
			params.put("defaultsChartTitle", this.defaultsChartTitle);
		}
		if (this.screenReaderRegionLabel != null) {
			params.put("screenReaderRegionLabel", this.screenReaderRegionLabel);
		}
		if (this.mapZoomIn != null) {
			params.put("mapZoomIn", this.mapZoomIn);
		}
		if (this.chartHeading != null) {
			params.put("chartHeading", this.chartHeading);
		}
		if (this.resetZoomButton != null) {
			params.put("resetZoomButton", this.resetZoomButton);
		}
		if (this.svgContainerEnd != null) {
			params.put("svgContainerEnd", this.svgContainerEnd);
		}
		if (this.svgContainerTitle != null) {
			params.put("svgContainerTitle", this.svgContainerTitle);
		}
		if (this.seriesTypeDescriptions != null) {
			params.put("seriesTypeDescriptions", this.seriesTypeDescriptions.getParams());
		}
		if (this.thousandsSep != null) {
			params.put("thousandsSep", this.thousandsSep);
		}
		return params;
	}

}