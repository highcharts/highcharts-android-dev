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



public class HIReverseArrow extends HIFoundation { 

	private HIAttributes attributes;
	public void setAttributes(HIAttributes attributes) {
		this.attributes = attributes;
		this.attributes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAttributes getAttributes(){ return attributes; }

	private String tagName;
	public void setTagName(String tagName) {
		this.tagName = tagName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTagName(){ return tagName; }



	public HIReverseArrow() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.attributes != null) {
			params.put("attributes", this.attributes.getParams());
		}
		if (this.tagName != null) {
			params.put("tagName", this.tagName);
		}
		return params;
	}

}