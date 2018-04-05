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



public class HIAccessibility implements HIChartsJSONSerializable { 


/**
A formatter function to create the HTML contents of the hidden screen
reader information region. Receives one argument, chart, referring
to the chart object. Should return a String with the HTML content
of the region.

The link to view the chart as a data table will be added
automatically after the custom HTML content.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public HIFunction screenReaderSectionFormatter;

/**
Whether or not to add series descriptions to charts with a single
series.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean describeSingleSeries;

/**
Options for keyboard navigation.
*/
	public HIKeyboardNavigation keyboardNavigation;

/**
Enable accessibility features for the chart.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
When a series contains more points than this, we no longer expose
information about individual points to screen readers.

Set to false to disable.
*/
	public Object /* Boolean|String */ pointDescriptionThreshold;

/**
Formatter function to use instead of the default for point
descriptions.
Receives one argument, point, referring to the point to describe.
Should return a String with the description of the point for a screen
reader user.
*/
	public HIFunction pointDescriptionFormatter;

/**
Date format to use for points on datetime axes when describing them
to screen reader users.

Defaults to the same format as in tooltip.

For an overview of the replacement codes, see
dateFormat.
*/
	public String pointDateFormat;

/**
Formatter function to use instead of the default for series
descriptions. Receives one argument, series, referring to the
series to describe. Should return a String with the description of
the series for a screen reader user.
*/
	public HIFunction seriesDescriptionFormatter;

/**
Function to run upon clicking the "View as Data Table" link in the
screen reader region.

By default Highcharts will insert and set focus to a data table
representation of the chart.
*/
	public HIFunction onTableAnchorClick;

/**
Formatter function to determine the date/time format used with
points on datetime axes when describing them to screen reader users.
Receives one argument, point, referring to the point to describe.
Should return a date format string compatible with
dateFormat.
*/
	public HIFunction pointDateFormatter;
	public String defaultChartTitle;
	public String screenReaderRegionLabel;
	public String mapZoomIn;

/**
Axis description format strings.
*/
	public HIAxis axis;
	public String rangeSelectorMinInput;

/**
Chart type description strings. This is added to the chart 
information region.

If there is only a single series type used in the chart, we use
the format string for the series type, or default if missing.
There is one format string for cases where there is only a single
series in the chart, and one for multiple series of the same
type.
*/
	public HIChartTypes chartTypes;
	public String rangeSelectorButton;
	public String longDescriptionHeading;

/**
Exporting menu format strings for accessibility module.
*/
	public HIExporting exporting;
	public String chartHeading;
	public String rangeSelectorMaxInput;

/**
Lang configuration for different series types. For more dynamic
control over the series element descriptions, see
[accessibility.seriesDescriptionFormatter](accessibility.
seriesDescriptionFormatter).
*/
	public HISeries series;

/**
Descriptions of lesser known series types. The relevant
description is added to the screen reader information region
when these series types are used.
*/
	public HISeriesTypeDescriptions seriesTypeDescriptions;
	public String legendItem;
	public String chartContainerLabel;
	public String structureHeading;
	public String tableSummary;
	public String navigationHint;
	public String noDescription;
	public String viewAsDataTable;
	public String mapZoomOut;


	public HIAccessibility() {

	}

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
		if (this.defaultChartTitle != null) {
			params.put("defaultChartTitle", this.defaultChartTitle);
		}
		if (this.screenReaderRegionLabel != null) {
			params.put("screenReaderRegionLabel", this.screenReaderRegionLabel);
		}
		if (this.mapZoomIn != null) {
			params.put("mapZoomIn", this.mapZoomIn);
		}
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
		}
		if (this.rangeSelectorMinInput != null) {
			params.put("rangeSelectorMinInput", this.rangeSelectorMinInput);
		}
		if (this.chartTypes != null) {
			params.put("chartTypes", this.chartTypes.getParams());
		}
		if (this.rangeSelectorButton != null) {
			params.put("rangeSelectorButton", this.rangeSelectorButton);
		}
		if (this.longDescriptionHeading != null) {
			params.put("longDescriptionHeading", this.longDescriptionHeading);
		}
		if (this.exporting != null) {
			params.put("exporting", this.exporting.getParams());
		}
		if (this.chartHeading != null) {
			params.put("chartHeading", this.chartHeading);
		}
		if (this.rangeSelectorMaxInput != null) {
			params.put("rangeSelectorMaxInput", this.rangeSelectorMaxInput);
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.seriesTypeDescriptions != null) {
			params.put("seriesTypeDescriptions", this.seriesTypeDescriptions.getParams());
		}
		if (this.legendItem != null) {
			params.put("legendItem", this.legendItem);
		}
		if (this.chartContainerLabel != null) {
			params.put("chartContainerLabel", this.chartContainerLabel);
		}
		if (this.structureHeading != null) {
			params.put("structureHeading", this.structureHeading);
		}
		if (this.tableSummary != null) {
			params.put("tableSummary", this.tableSummary);
		}
		if (this.navigationHint != null) {
			params.put("navigationHint", this.navigationHint);
		}
		if (this.noDescription != null) {
			params.put("noDescription", this.noDescription);
		}
		if (this.viewAsDataTable != null) {
			params.put("viewAsDataTable", this.viewAsDataTable);
		}
		if (this.mapZoomOut != null) {
			params.put("mapZoomOut", this.mapZoomOut);
		}
		return params;
	}

}