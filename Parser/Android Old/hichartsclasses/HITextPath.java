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



public class HITextPath extends HIFoundation { 

	private HIAttributes attributes;
	public void setAttributes(HIAttributes attributes) {
		this.attributes = attributes;
		this.attributes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAttributes getAttributes(){ return attributes; }

	private Boolean enabled;
	/**
 Enable or disable `textPath` option for link's or marker's data labels. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }



	public HITextPath() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.attributes != null) {
			params.put("attributes", this.attributes.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		return params;
	}

}