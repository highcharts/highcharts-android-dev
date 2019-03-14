/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIAccessibility extends HIFoundation { 

	private HIFunction screenReaderSectionFormatter;
	/**
 A formatter function to create the HTML contents of the hidden screen reader information region. Receives one argument, chart, referring to the chart object. Should return a String with the HTML content of the region. The link to view the chart as a data table will be added automatically after the custom HTML content. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setScreenReaderSectionFormatter(HIFunction screenReaderSectionFormatter) {
		this.screenReaderSectionFormatter = screenReaderSectionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getScreenReaderSectionFormatter(){ return screenReaderSectionFormatter; }

	private Boolean describeSingleSeries;
	/**
 Whether or not to add series descriptions to charts with a single series. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setDescribeSingleSeries(Boolean describeSingleSeries) {
		this.describeSingleSeries = describeSingleSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDescribeSingleSeries(){ return describeSingleSeries; }

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
 Enable accessibility features for the chart. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

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
 Formatter function to use instead of the defaults for point descriptions. Receives one argument, point, referring to the point to describe. Should return a String with the description of the point for a screen reader user. 
	*/
	public void setPointDescriptionFormatter(HIFunction pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDescriptionFormatter(){ return pointDescriptionFormatter; }

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

	private HIFunction seriesDescriptionFormatter;
	/**
 Formatter function to use instead of the defaults for series descriptions. Receives one argument, series, referring to the series to describe. Should return a String with the description of the series for a screen reader user. 
	*/
	public void setSeriesDescriptionFormatter(HIFunction seriesDescriptionFormatter) {
		this.seriesDescriptionFormatter = seriesDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSeriesDescriptionFormatter(){ return seriesDescriptionFormatter; }

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



	public HIAccessibility() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
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
		return params;
	}

}