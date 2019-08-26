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



public class HIPointStatesOptionsObject extends HIFoundation { 

	private HIPointStatesHoverOptionsObject hover;
	/**
 The hover state for a single point marker. 
	*/
	public void setHover(HIPointStatesHoverOptionsObject hover) {
		this.hover = hover;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointStatesHoverOptionsObject getHover(){ return hover; }

	private HIPointStatesInactiveOptionsObject inactive;
	/**
 The hover state for a single point marker. 
	*/
	public void setInactive(HIPointStatesInactiveOptionsObject inactive) {
		this.inactive = inactive;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointStatesInactiveOptionsObject getInactive(){ return inactive; }

	private HIPointStatesNormalOptionsObject normal;
	/**
 The hover state for a single point marker. 
	*/
	public void setNormal(HIPointStatesNormalOptionsObject normal) {
		this.normal = normal;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointStatesNormalOptionsObject getNormal(){ return normal; }

	private HIPointStatesSelectOptionsObject select;
	/**
 The hover state for a single point marker. 
	*/
	public void setSelect(HIPointStatesSelectOptionsObject select) {
		this.select = select;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointStatesSelectOptionsObject getSelect(){ return select; }



	public HIPointStatesOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.hover != null) {
			params.put("hover", this.hover.getParams());
		}
		if (this.inactive != null) {
			params.put("inactive", this.inactive.getParams());
		}
		if (this.normal != null) {
			params.put("normal", this.normal.getParams());
		}
		if (this.select != null) {
			params.put("select", this.select.getParams());
		}
		return params;
	}

}