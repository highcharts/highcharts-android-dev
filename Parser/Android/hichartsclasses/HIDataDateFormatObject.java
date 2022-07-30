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



public class HIDataDateFormatObject extends HIFoundation { 

	private String alternative;
	public void setAlternative(String alternative) {
		this.alternative = alternative;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlternative(){ return alternative; }

	private HIFunction parser;
	public void setParser(HIFunction parser) {
		this.parser = parser;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getParser(){ return parser; }

	private Object regex;
	public void setRegex(Object regex) {
		this.regex = regex;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getRegex(){ return regex; }



	public HIDataDateFormatObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.alternative != null) {
			params.put("alternative", this.alternative);
		}
		if (this.parser != null) {
			params.put("parser", this.parser);
		}
		if (this.regex != null) {
			params.put("regex", this.regex);
		}
		return params;
	}

}