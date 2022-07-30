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



public class HIExportingMenuObject extends HIFoundation { 

	private Object onclick;
	/**
 The click handler for the menu item. 
	*/
	public void setOnclick(Object onclick) {
		this.onclick = onclick;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOnclick(){ return onclick; }

	private Boolean separator;
	/**
 Indicates a separator line instead of an item. 
	*/
	public void setSeparator(Boolean separator) {
		this.separator = separator;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSeparator(){ return separator; }

	private String text;
	/**
 The text for the menu item. 
	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String textKey;
	/**
 If internationalization is required, the key to a language string. 
	*/
	public void setTextKey(String textKey) {
		this.textKey = textKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextKey(){ return textKey; }



	public HIExportingMenuObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.onclick != null) {
			params.put("onclick", this.onclick);
		}
		if (this.separator != null) {
			params.put("separator", this.separator);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.textKey != null) {
			params.put("textKey", this.textKey);
		}
		return params;
	}

}