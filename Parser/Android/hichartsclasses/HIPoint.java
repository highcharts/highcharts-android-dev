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



public class HIPoint extends HIFoundation { 

	private HIEvents events;
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private String valueDescriptionFormat;
	/**
 Format to use for describing the values of data points to assistive technology - including screen readers. The point context is available as {point}. Additionally, the series name, annotation info, and description added in point.accessibility.description is added by defaults if relevant. To override this, use the accessibility.point.descriptionFormatter option. 
	*/
	public void setValueDescriptionFormat(String valueDescriptionFormat) {
		this.valueDescriptionFormat = valueDescriptionFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueDescriptionFormat(){ return valueDescriptionFormat; }

	private String valueSuffix;
	/**
 Suffix to add to the values in the point descriptions. Uses tooltip.valueSuffix if not defined. 
	*/
	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueSuffix(){ return valueSuffix; }

	private String dateFormat;
	/**
 Date format to use for points on datetime axes when describing them to screen reader users. Defaults to the same format as in tooltip. For an overview of the replacement codes, see `dateFormat`. 
	*/
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDateFormat(){ return dateFormat; }

	private HIFunction dateFormatter;
	/**
 Formatter function to determine the date/time format used with points on datetime axes when describing them to screen reader users. Receives one argument, point, referring to the point to describe. Should return a date format string compatible with `dateFormat`. 
	*/
	public void setDateFormatter(HIFunction dateFormatter) {
		this.dateFormatter = dateFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDateFormatter(){ return dateFormatter; }

	private String valuePrefix;
	/**
 Prefix to add to the values in the point descriptions. Uses tooltip.valuePrefix if not defined. 
	*/
	public void setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValuePrefix(){ return valuePrefix; }

	private HIFunction descriptionFormatter;
	/**
 Formatter function to use instead of the defaults for point descriptions. Receives one argument, point, referring to the point to describe. Should return a string with the description of the point for a screen reader user. If false is returned, the defaults formatter will be used for that point. Note: Prefer using accessibility.point.valueDescriptionFormat instead if possible, as defaults functionality such as describing annotations will be preserved. 
	*/
	public void setDescriptionFormatter(HIFunction descriptionFormatter) {
		this.descriptionFormatter = descriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDescriptionFormatter(){ return descriptionFormatter; }

	private Number valueDecimals;
	/**
 Decimals to use for the values in the point descriptions. Uses tooltip.valueDecimals if not defined. 
	*/
	public void setValueDecimals(Number valueDecimals) {
		this.valueDecimals = valueDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValueDecimals(){ return valueDecimals; }



	public HIPoint() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.valueDescriptionFormat != null) {
			params.put("valueDescriptionFormat", this.valueDescriptionFormat);
		}
		if (this.valueSuffix != null) {
			params.put("valueSuffix", this.valueSuffix);
		}
		if (this.dateFormat != null) {
			params.put("dateFormat", this.dateFormat);
		}
		if (this.dateFormatter != null) {
			params.put("dateFormatter", this.dateFormatter);
		}
		if (this.valuePrefix != null) {
			params.put("valuePrefix", this.valuePrefix);
		}
		if (this.descriptionFormatter != null) {
			params.put("descriptionFormatter", this.descriptionFormatter);
		}
		if (this.valueDecimals != null) {
			params.put("valueDecimals", this.valueDecimals);
		}
		return params;
	}

}