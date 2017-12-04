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
* description: Options for configuring accessibility for the chart. Requires the
//code.highcharts.com/modules/accessibility.
js : accessibility module to be loaded. For a description of the module and information
on its features, see http://www.highcharts.
com/docs/chart-concepts/accessibility : Highcharts Accessibility.
*/
public class HIAccessibility implements HIChartsJSONSerializable { 


/**
* description: A formatter function to create the HTML contents of the hidden screen
reader information region. Receives one argument, chart, referring
to the chart object. Should return a String with the HTML content
of the region.
The link to view the chart as a data table will be added
automatically after the custom HTML content.
* default: undefined
*/
	public HIGFunction /* Function */ screenReaderSectionFormatter;

/**
* description: When a series contains more points than this, we no longer expose
information about individual points to screen readers.
Set to false to disable.
* default: 30
*/
	public Double /* Double, Boolean */ pointDescriptionThreshold;

/**
* description: Date format to use for points on datetime axes when describing them
to screen reader users.
Defaults to the same format as in tooltip.
For an overview of the replacement codes, see
dateFormat.
*/
	public String pointDateFormat;

/**
* description: Options for keyboard navigation.
*/
	public HIKeyboardNavigation keyboardNavigation;

/**
* description: Formatter function to determine the date/time format used with
points on datetime axes when describing them to screen reader users.
Receives one argument, point, referring to the point to describe.
Should return a date format string compatible with
dateFormat.
*/
	public HIGFunction /* Function */ pointDateFormatter;

/**
* description: Formatter function to use instead of the default for point
descriptions.
Receives one argument, point, referring to the point to describe.
Should return a String with the description of the point for a screen
reader user.
*/
	public HIGFunction /* Function */ pointDescriptionFormatter;

/**
* description: Enable accessibility features for the chart.
* default: true
*/
	public Boolean enabled;

/**
* description: Formatter function to use instead of the default for series
descriptions. Receives one argument, series, referring to the
series to describe. Should return a String with the description of
the series for a screen reader user.
*/
	public HIGFunction /* Function */ seriesDescriptionFormatter;

/**
* description: Whether or not to add series descriptions to charts with a single
series.
* default: false
*/
	public Boolean describeSingleSeries;

/**
* description: Function to run upon clicking the "View as Data Table" link in the
screen reader region.
By default Highcharts will insert and set focus to a data table
representation of the chart.
*/
	public HIGFunction /* Function */ onTableAnchorClick;


	public HIAccessibility() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.screenReaderSectionFormatter != null) {
			params.put("screenReaderSectionFormatter", this.screenReaderSectionFormatter);
		}
		if (this.pointDescriptionThreshold != null) {
			params.put("pointDescriptionThreshold", this.pointDescriptionThreshold);
		}
		if (this.pointDateFormat != null) {
			params.put("pointDateFormat", this.pointDateFormat);
		}
		if (this.keyboardNavigation != null) {
			params.put("keyboardNavigation", this.keyboardNavigation.getParams());
		}
		if (this.pointDateFormatter != null) {
			params.put("pointDateFormatter", this.pointDateFormatter);
		}
		if (this.pointDescriptionFormatter != null) {
			params.put("pointDescriptionFormatter", this.pointDescriptionFormatter);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.seriesDescriptionFormatter != null) {
			params.put("seriesDescriptionFormatter", this.seriesDescriptionFormatter);
		}
		if (this.describeSingleSeries != null) {
			params.put("describeSingleSeries", this.describeSingleSeries);
		}
		if (this.onTableAnchorClick != null) {
			params.put("onTableAnchorClick", this.onTableAnchorClick);
		}
		return params;
	}

}