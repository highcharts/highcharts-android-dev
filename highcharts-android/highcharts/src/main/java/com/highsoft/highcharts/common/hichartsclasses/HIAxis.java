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





public class HIAxis extends Observable implements HIChartsJSONSerializable { 

	private String xAxisDescriptionSingular;
	public void setXAxisDescriptionSingular(String xAxisDescriptionSingular) {
		this.xAxisDescriptionSingular = xAxisDescriptionSingular;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisDescriptionSingular(){ return xAxisDescriptionSingular; }

	private String xAxisDescriptionPlural;
	public void setXAxisDescriptionPlural(String xAxisDescriptionPlural) {
		this.xAxisDescriptionPlural = xAxisDescriptionPlural;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisDescriptionPlural(){ return xAxisDescriptionPlural; }

	private String yAxisDescriptionPlural;
	public void setYAxisDescriptionPlural(String yAxisDescriptionPlural) {
		this.yAxisDescriptionPlural = yAxisDescriptionPlural;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYAxisDescriptionPlural(){ return yAxisDescriptionPlural; }

	private String yAxisDescriptionSingular;
	public void setYAxisDescriptionSingular(String yAxisDescriptionSingular) {
		this.yAxisDescriptionSingular = yAxisDescriptionSingular;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYAxisDescriptionSingular(){ return yAxisDescriptionSingular; }



	public HIAxis() {

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
		if (this.xAxisDescriptionSingular != null) {
			params.put("xAxisDescriptionSingular", this.xAxisDescriptionSingular);
		}
		if (this.xAxisDescriptionPlural != null) {
			params.put("xAxisDescriptionPlural", this.xAxisDescriptionPlural);
		}
		if (this.yAxisDescriptionPlural != null) {
			params.put("yAxisDescriptionPlural", this.yAxisDescriptionPlural);
		}
		if (this.yAxisDescriptionSingular != null) {
			params.put("yAxisDescriptionSingular", this.yAxisDescriptionSingular);
		}
		return params;
	}

}