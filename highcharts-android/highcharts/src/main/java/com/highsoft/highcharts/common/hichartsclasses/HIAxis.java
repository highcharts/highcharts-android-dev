/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import java.util.HashMap;



public class HIAxis extends HIFoundation { 

	private String xAxisDescriptionSingular;
	public void setXAxisDescriptionSingular(String xAxisDescriptionSingular) {
		this.xAxisDescriptionSingular = xAxisDescriptionSingular;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisDescriptionSingular(){ return xAxisDescriptionSingular; }

	private String timeRangeMinutes;
	public void setTimeRangeMinutes(String timeRangeMinutes) {
		this.timeRangeMinutes = timeRangeMinutes;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeMinutes(){ return timeRangeMinutes; }

	private String timeRangeHours;
	public void setTimeRangeHours(String timeRangeHours) {
		this.timeRangeHours = timeRangeHours;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeHours(){ return timeRangeHours; }

	private String rangeCategories;
	public void setRangeCategories(String rangeCategories) {
		this.rangeCategories = rangeCategories;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeCategories(){ return rangeCategories; }

	private String timeRangeSeconds;
	public void setTimeRangeSeconds(String timeRangeSeconds) {
		this.timeRangeSeconds = timeRangeSeconds;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeSeconds(){ return timeRangeSeconds; }

	private String yAxisDescriptionPlural;
	public void setYAxisDescriptionPlural(String yAxisDescriptionPlural) {
		this.yAxisDescriptionPlural = yAxisDescriptionPlural;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYAxisDescriptionPlural(){ return yAxisDescriptionPlural; }

	private String rangeFromTo;
	public void setRangeFromTo(String rangeFromTo) {
		this.rangeFromTo = rangeFromTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeFromTo(){ return rangeFromTo; }

	private String timeRangeDays;
	public void setTimeRangeDays(String timeRangeDays) {
		this.timeRangeDays = timeRangeDays;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeDays(){ return timeRangeDays; }

	private String xAxisDescriptionPlural;
	public void setXAxisDescriptionPlural(String xAxisDescriptionPlural) {
		this.xAxisDescriptionPlural = xAxisDescriptionPlural;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisDescriptionPlural(){ return xAxisDescriptionPlural; }

	private String yAxisDescriptionSingular;
	public void setYAxisDescriptionSingular(String yAxisDescriptionSingular) {
		this.yAxisDescriptionSingular = yAxisDescriptionSingular;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYAxisDescriptionSingular(){ return yAxisDescriptionSingular; }



	public HIAxis() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.xAxisDescriptionSingular != null) {
			params.put("xAxisDescriptionSingular", this.xAxisDescriptionSingular);
		}
		if (this.timeRangeMinutes != null) {
			params.put("timeRangeMinutes", this.timeRangeMinutes);
		}
		if (this.timeRangeHours != null) {
			params.put("timeRangeHours", this.timeRangeHours);
		}
		if (this.rangeCategories != null) {
			params.put("rangeCategories", this.rangeCategories);
		}
		if (this.timeRangeSeconds != null) {
			params.put("timeRangeSeconds", this.timeRangeSeconds);
		}
		if (this.yAxisDescriptionPlural != null) {
			params.put("yAxisDescriptionPlural", this.yAxisDescriptionPlural);
		}
		if (this.rangeFromTo != null) {
			params.put("rangeFromTo", this.rangeFromTo);
		}
		if (this.timeRangeDays != null) {
			params.put("timeRangeDays", this.timeRangeDays);
		}
		if (this.xAxisDescriptionPlural != null) {
			params.put("xAxisDescriptionPlural", this.xAxisDescriptionPlural);
		}
		if (this.yAxisDescriptionSingular != null) {
			params.put("yAxisDescriptionSingular", this.yAxisDescriptionSingular);
		}
		return params;
	}

}