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



public class HIRangeSelector extends HIFoundation { 

	private String buttonText;
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
		this.setChanged();
		this.notifyObservers();
	}

	public String getButtonText(){ return buttonText; }

	private String maxInputLabel;
	public void setMaxInputLabel(String maxInputLabel) {
		this.maxInputLabel = maxInputLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMaxInputLabel(){ return maxInputLabel; }

	private String minInputLabel;
	public void setMinInputLabel(String minInputLabel) {
		this.minInputLabel = minInputLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMinInputLabel(){ return minInputLabel; }



	public HIRangeSelector() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.buttonText != null) {
			params.put("buttonText", this.buttonText);
		}
		if (this.maxInputLabel != null) {
			params.put("maxInputLabel", this.maxInputLabel);
		}
		if (this.minInputLabel != null) {
			params.put("minInputLabel", this.minInputLabel);
		}
		return params;
	}

}