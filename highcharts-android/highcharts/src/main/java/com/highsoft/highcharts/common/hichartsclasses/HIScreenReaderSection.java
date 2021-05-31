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



public class HIScreenReaderSection extends HIFoundation { 

	private HIFunction beforeChartFormatter;
	/**
 A formatter function to create the HTML contents of the hidden screen reader information region before the chart. Receives one argument, chart, referring to the chart object. Should return a string with the HTML content of the region. By defaults this returns an automatic description of the chart based on beforeChartFormat. 
	*/
	public void setBeforeChartFormatter(HIFunction beforeChartFormatter) {
		this.beforeChartFormatter = beforeChartFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getBeforeChartFormatter(){ return beforeChartFormatter; }

	private HIFunction onViewDataTableClick;
	/**
 Function to run upon clicking the "View as Data Table" link in the screen reader region. By defaults Highcharts will insert and set focus to a data table representation of the chart. 
	*/
	public void setOnViewDataTableClick(HIFunction onViewDataTableClick) {
		this.onViewDataTableClick = onViewDataTableClick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnViewDataTableClick(){ return onViewDataTableClick; }

	private HIFunction onPlayAsSoundClick;
	/**
 Function to run upon clicking the "Play as sound" button in the screen reader region. By defaults Highcharts will call the chart.sonify function. 
	*/
	public void setOnPlayAsSoundClick(HIFunction onPlayAsSoundClick) {
		this.onPlayAsSoundClick = onPlayAsSoundClick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnPlayAsSoundClick(){ return onPlayAsSoundClick; }

	private String afterChartFormat;
	/**
 Format for the screen reader information region after the chart. Analogous to beforeChartFormat. 
	*/
	public void setAfterChartFormat(String afterChartFormat) {
		this.afterChartFormat = afterChartFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAfterChartFormat(){ return afterChartFormat; }

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

	private String beforeChartFormat;
	/**
 Format for the screen reader information region before the chart. Supported HTML tags are , , , , , , , and . Attributes are not supported, except for id on , , and . Id is required on  and  in the format . Numbers, lower- and uppercase letters, "-" and "#" are valid characters in IDs. The headingTagName is an auto-detected heading (h1-h6) that corresponds to the heading level below the previous heading in the DOM. 
	*/
	public void setBeforeChartFormat(String beforeChartFormat) {
		this.beforeChartFormat = beforeChartFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBeforeChartFormat(){ return beforeChartFormat; }

	private HIFunction afterChartFormatter;
	/**
 A formatter function to create the HTML contents of the hidden screen reader information region after the chart. Analogous to beforeChartFormatter. 
	*/
	public void setAfterChartFormatter(HIFunction afterChartFormatter) {
		this.afterChartFormatter = afterChartFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterChartFormatter(){ return afterChartFormatter; }

	private String beforeRegionLabel;
	public void setBeforeRegionLabel(String beforeRegionLabel) {
		this.beforeRegionLabel = beforeRegionLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBeforeRegionLabel(){ return beforeRegionLabel; }

	private String afterRegionLabel;
	public void setAfterRegionLabel(String afterRegionLabel) {
		this.afterRegionLabel = afterRegionLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAfterRegionLabel(){ return afterRegionLabel; }

	private HIAnnotations annotations;
	/**
 Language options for annotation descriptions. 
	*/
	public void setAnnotations(HIAnnotations annotations) {
		this.annotations = annotations;
		this.annotations.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnnotations getAnnotations(){ return annotations; }

	private String endOfChartMarker;
	/**
 Label for the end of the chart. Announced by screen readers. 
	*/
	public void setEndOfChartMarker(String endOfChartMarker) {
		this.endOfChartMarker = endOfChartMarker;
		this.setChanged();
		this.notifyObservers();
	}

	public String getEndOfChartMarker(){ return endOfChartMarker; }



	public HIScreenReaderSection() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.beforeChartFormatter != null) {
			params.put("beforeChartFormatter", this.beforeChartFormatter);
		}
		if (this.onViewDataTableClick != null) {
			params.put("onViewDataTableClick", this.onViewDataTableClick);
		}
		if (this.onPlayAsSoundClick != null) {
			params.put("onPlayAsSoundClick", this.onPlayAsSoundClick);
		}
		if (this.afterChartFormat != null) {
			params.put("afterChartFormat", this.afterChartFormat);
		}
		if (this.axisRangeDateFormat != null) {
			params.put("axisRangeDateFormat", this.axisRangeDateFormat);
		}
		if (this.beforeChartFormat != null) {
			params.put("beforeChartFormat", this.beforeChartFormat);
		}
		if (this.afterChartFormatter != null) {
			params.put("afterChartFormatter", this.afterChartFormatter);
		}
		if (this.beforeRegionLabel != null) {
			params.put("beforeRegionLabel", this.beforeRegionLabel);
		}
		if (this.afterRegionLabel != null) {
			params.put("afterRegionLabel", this.afterRegionLabel);
		}
		if (this.annotations != null) {
			params.put("annotations", this.annotations.getParams());
		}
		if (this.endOfChartMarker != null) {
			params.put("endOfChartMarker", this.endOfChartMarker);
		}
		return params;
	}

}