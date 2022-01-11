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



public class HIAST extends HIFoundation { 

	private Object allowedAttributes;
	/**
 The list of allowed SVG or HTML attributes, used for sanitizing potentially harmful content from the chart configuration before adding to the DOM. 
	*/
	public void setAllowedAttributes(Object allowedAttributes) {
		this.allowedAttributes = allowedAttributes;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAllowedAttributes(){ return allowedAttributes; }

	private Object allowedReferences;
	/**
 The list of allowed references for referring attributes like `href` and `src`. Attribute values will only be allowed if they start with one of these strings. 
	*/
	public void setAllowedReferences(Object allowedReferences) {
		this.allowedReferences = allowedReferences;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAllowedReferences(){ return allowedReferences; }

	private Object allowedTags;
	/**
 The list of allowed SVG or HTML tags, used for sanitizing potentially harmful content from the chart configuration before adding to the DOM. 
	*/
	public void setAllowedTags(Object allowedTags) {
		this.allowedTags = allowedTags;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAllowedTags(){ return allowedTags; }



	public HIAST() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.allowedAttributes != null) {
			params.put("allowedAttributes", this.allowedAttributes);
		}
		if (this.allowedReferences != null) {
			params.put("allowedReferences", this.allowedReferences);
		}
		if (this.allowedTags != null) {
			params.put("allowedTags", this.allowedTags);
		}
		return params;
	}

}