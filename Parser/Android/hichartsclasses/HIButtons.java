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





public class HIButtons extends Observable implements HIChartsJSONSerializable { 

	private HIContextButton contextButton;
/**
/** Options for the export button. In styled mode, export button styles can be applied with the .highcharts-contextbutton class. 
*/
	public void setContextButton(HIContextButton contextButton) {
		this.contextButton = contextButton;
		this.contextButton.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIContextButton getContextButton(){ return contextButton; }



	public HIButtons() {

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
		if (this.contextButton != null) {
			params.put("contextButton", this.contextButton.getParams());
		}
		return params;
	}

}