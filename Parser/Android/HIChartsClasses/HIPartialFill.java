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
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;





public class HIPartialFill extends Observable implements HIChartsJSONSerializable { 

	private Number amount;
/**
/** The amount of the X-range point to be filled. Values can be 0-1 and are converted to percentages in the defaults data label formatter. 
*/
	public void setAmount(Number amount) {
		this.amount = amount;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAmount(){ return amount; }

	private HIColor fill;
/**
/** * description: The fill color to be used for partial fills. Defaults to a darker shade of the point color. 
*/
	public void setFill(HIColor fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFill(){ return fill; }



	public HIPartialFill() {

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
		if (this.amount != null) {
			params.put("amount", this.amount);
		}
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		return params;
	}

}