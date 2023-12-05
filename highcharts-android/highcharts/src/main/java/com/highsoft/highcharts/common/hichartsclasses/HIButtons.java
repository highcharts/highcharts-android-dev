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



public class HIButtons extends HIFoundation { 

	private HIContextButton contextButton;
	/**
 Options for the export button. In styled mode, export button styles can be applied with the `.highcharts-contextbutton` class. 
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

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.contextButton != null) {
			params.put("contextButton", this.contextButton.getParams());
		}
		return params;
	}

}