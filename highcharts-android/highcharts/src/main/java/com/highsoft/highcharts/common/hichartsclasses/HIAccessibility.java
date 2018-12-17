/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HIAccessibility extends Observable implements HIChartsJSONSerializable { 

	private HIFunction screenReaderSectionFormatter;
/**
/** A formatter function to create the HTML contents of the hidden screen reader information region. Receives one argument, chart, referring to the chart object. Should return a String with the HTML content of the region. The link to view the chart as a data table will be added automatically after the custom HTML content. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined*/
	public void setScreenReaderSectionFormatter(HIFunction screenReaderSectionFormatter) {
		this.screenReaderSectionFormatter = screenReaderSectionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getScreenReaderSectionFormatter(){ return screenReaderSectionFormatter; }

	private Boolean describeSingleSeries;
/**
/** Whether or not to add series descriptions to charts with a single series. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setDescribeSingleSeries(Boolean describeSingleSeries) {
		this.describeSingleSeries = describeSingleSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDescribeSingleSeries(){ return describeSingleSeries; }

	private HIKeyboardNavigation keyboardNavigation;
/**
/** Options for keyboard navigation. 
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
/** Enable accessibility features for the chart. 
*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number pointDescriptionThreshold;
/**
/** When a series contains more points than this, we no longer expose information about individual points to screen readers. Set to false to disable. 
*/
	public void setPointDescriptionThreshold(Number pointDescriptionThreshold) {
		this.pointDescriptionThreshold = pointDescriptionThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointDescriptionThreshold(){ return pointDescriptionThreshold; }

	private HIFunction pointDescriptionFormatter;
/**
/** Formatter function to use instead of the defaults for point descriptions. Receives one argument, point, referring to the point to describe. Should return a String with the description of the point for a screen reader user. 
*/
	public void setPointDescriptionFormatter(HIFunction pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDescriptionFormatter(){ return pointDescriptionFormatter; }

	private String pointDateFormat;
/**
/** Date format to use for points on datetime axes when describing them to screen reader users. Defaults to the same format as in tooltip. For an overview of the replacement codes, see `dateFormat`. 
*/
	public void setPointDateFormat(String pointDateFormat) {
		this.pointDateFormat = pointDateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointDateFormat(){ return pointDateFormat; }

	private HIFunction seriesDescriptionFormatter;
/**
/** Formatter function to use instead of the defaults for series descriptions. Receives one argument, series, referring to the series to describe. Should return a String with the description of the series for a screen reader user. 
*/
	public void setSeriesDescriptionFormatter(HIFunction seriesDescriptionFormatter) {
		this.seriesDescriptionFormatter = seriesDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSeriesDescriptionFormatter(){ return seriesDescriptionFormatter; }

	private HIFunction onTableAnchorClick;
/**
/** Function to run upon clicking the "View as Data Table" link in the screen reader region. By defaults Highcharts will insert and set focus to a data table representation of the chart. 
*/
	public void setOnTableAnchorClick(HIFunction onTableAnchorClick) {
		this.onTableAnchorClick = onTableAnchorClick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnTableAnchorClick(){ return onTableAnchorClick; }

	private HIFunction pointDateFormatter;
/**
/** Formatter function to determine the date/time format used with points on datetime axes when describing them to screen reader users. Receives one argument, point, referring to the point to describe. Should return a date format string compatible with `dateFormat`. 
*/
	public void setPointDateFormatter(HIFunction pointDateFormatter) {
		this.pointDateFormatter = pointDateFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDateFormatter(){ return pointDateFormatter; }

	private HISeries series;
/**
/** Lang configuration for different series types. For more dynamic control over the series element descriptions, see `accessibility.seriesDescriptionFormatter`. 
*/
	public void setSeries(HISeries series) {
		this.series = series;
		this.series.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private String longDescriptionHeading;
	public void setLongDescriptionHeading(String longDescriptionHeading) {
		this.longDescriptionHeading = longDescriptionHeading;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLongDescriptionHeading(){ return longDescriptionHeading; }

	private String rangeSelectorMaxInput;
	public void setRangeSelectorMaxInput(String rangeSelectorMaxInput) {
		this.rangeSelectorMaxInput = rangeSelectorMaxInput;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeSelectorMaxInput(){ return rangeSelectorMaxInput; }

	private String structureHeading;
	public void setStructureHeading(String structureHeading) {
		this.structureHeading = structureHeading;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStructureHeading(){ return structureHeading; }

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

	private HIChartTypes chartTypes;
/**
/** Chart type description strings. This is added to the chart information region. If there is only a single series type used in the chart, we use the format string for the series type, or defaults if missing. There is one format string for cases where there is only a single series in the chart, and one for multiple series of the same type. 
*/
	public void setChartTypes(HIChartTypes chartTypes) {
		this.chartTypes = chartTypes;
		this.chartTypes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIChartTypes getChartTypes(){ return chartTypes; }

	private HIAxis axis;
/**
/** Axis description format strings. 
*/
	public void setAxis(HIAxis axis) {
		this.axis = axis;
		this.axis.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAxis getAxis(){ return axis; }

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
/** Exporting menu format strings for accessibility module. 
*/
	public void setExporting(HIExporting exporting) {
		this.exporting = exporting;
		this.exporting.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIExporting getExporting(){ return exporting; }

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

	private String noDescription;
	public void setNoDescription(String noDescription) {
		this.noDescription = noDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNoDescription(){ return noDescription; }

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

	private String svgContainerTitle;
/**
/** Title element text for the chart SVG element. Leave this empty to disable adding the title element. Browsers will display this content when hovering over elements in the chart. Assistive technology may use this element to label the chart. 
*/
	public void setSvgContainerTitle(String svgContainerTitle) {
		this.svgContainerTitle = svgContainerTitle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSvgContainerTitle(){ return svgContainerTitle; }

	private String navigationHint;
	public void setNavigationHint(String navigationHint) {
		this.navigationHint = navigationHint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNavigationHint(){ return navigationHint; }

	private HISeriesTypeDescriptions seriesTypeDescriptions;
/**
/** Descriptions of lesser known series types. The relevant description is added to the screen reader information region when these series types are used. 
*/
	public void setSeriesTypeDescriptions(HISeriesTypeDescriptions seriesTypeDescriptions) {
		this.seriesTypeDescriptions = seriesTypeDescriptions;
		this.seriesTypeDescriptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeriesTypeDescriptions getSeriesTypeDescriptions(){ return seriesTypeDescriptions; }



	public HIAccessibility() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.screenReaderSectionFormatter != null) {
			params.put("screenReaderSectionFormatter", this.screenReaderSectionFormatter);
		}
		if (this.describeSingleSeries != null) {
			params.put("describeSingleSeries", this.describeSingleSeries);
		}
		if (this.keyboardNavigation != null) {
			params.put("keyboardNavigation", this.keyboardNavigation.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.pointDescriptionThreshold != null) {
			params.put("pointDescriptionThreshold", this.pointDescriptionThreshold);
		}
		if (this.pointDescriptionFormatter != null) {
			params.put("pointDescriptionFormatter", this.pointDescriptionFormatter);
		}
		if (this.pointDateFormat != null) {
			params.put("pointDateFormat", this.pointDateFormat);
		}
		if (this.seriesDescriptionFormatter != null) {
			params.put("seriesDescriptionFormatter", this.seriesDescriptionFormatter);
		}
		if (this.onTableAnchorClick != null) {
			params.put("onTableAnchorClick", this.onTableAnchorClick);
		}
		if (this.pointDateFormatter != null) {
			params.put("pointDateFormatter", this.pointDateFormatter);
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.longDescriptionHeading != null) {
			params.put("longDescriptionHeading", this.longDescriptionHeading);
		}
		if (this.rangeSelectorMaxInput != null) {
			params.put("rangeSelectorMaxInput", this.rangeSelectorMaxInput);
		}
		if (this.structureHeading != null) {
			params.put("structureHeading", this.structureHeading);
		}
		if (this.chartContainerLabel != null) {
			params.put("chartContainerLabel", this.chartContainerLabel);
		}
		if (this.mapZoomOut != null) {
			params.put("mapZoomOut", this.mapZoomOut);
		}
		if (this.chartTypes != null) {
			params.put("chartTypes", this.chartTypes.getParams());
		}
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
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
		if (this.legendItem != null) {
			params.put("legendItem", this.legendItem);
		}
		if (this.tableSummary != null) {
			params.put("tableSummary", this.tableSummary);
		}
		if (this.noDescription != null) {
			params.put("noDescription", this.noDescription);
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
		if (this.svgContainerTitle != null) {
			params.put("svgContainerTitle", this.svgContainerTitle);
		}
		if (this.navigationHint != null) {
			params.put("navigationHint", this.navigationHint);
		}
		if (this.seriesTypeDescriptions != null) {
			params.put("seriesTypeDescriptions", this.seriesTypeDescriptions.getParams());
		}
		return params;
	}

}