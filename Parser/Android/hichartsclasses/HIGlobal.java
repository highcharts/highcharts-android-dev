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



public class HIGlobal extends HIFoundation { 

	private HIButtonTheme buttonTheme;
	/**
 General theme for buttons. This applies to the zoom button, exporting context menu, map navigation, range selector buttons and custom buttons generated using the `SVGRenderer.button` function. However, each of these may be overridden with more specific options. 
	*/
	public void setButtonTheme(HIButtonTheme buttonTheme) {
		this.buttonTheme = buttonTheme;
		this.buttonTheme.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIButtonTheme getButtonTheme(){ return buttonTheme; }



	public HIGlobal() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.buttonTheme != null) {
			params.put("buttonTheme", this.buttonTheme.getParams());
		}
		return params;
	}

}