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



public class HISeriesCheckboxClickEventObject extends HIFoundation { 

	private Boolean checked;
	/**
 Whether the box has been checked. 
	*/
	public void setChecked(Boolean checked) {
		this.checked = checked;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getChecked(){ return checked; }

	private HISeries item;
	/**
 Related series. 
	*/
	public void setItem(HISeries item) {
		this.item = item;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getItem(){ return item; }

	private HISeries target;
	/**
 Related series. 
	*/
	public void setTarget(HISeries target) {
		this.target = target;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getTarget(){ return target; }

	private String type;
	/**
 Event type. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HISeriesCheckboxClickEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.checked != null) {
			params.put("checked", this.checked);
		}
		if (this.item != null) {
			params.put("item", this.item.getParams());
		}
		if (this.target != null) {
			params.put("target", this.target.getParams());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}