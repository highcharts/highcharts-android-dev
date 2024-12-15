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



public class HIStates extends HIFoundation { 

	private HIHover hover;
	public void setHover(HIHover hover) {
		this.hover = hover;
		this.hover.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHover getHover(){ return hover; }

	private HIInactive inactive;
	/**
 The opposite state of a hover for a single point node/link. 
	*/
	public void setInactive(HIInactive inactive) {
		this.inactive = inactive;
		this.inactive.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIInactive getInactive(){ return inactive; }

	private HISelect select;
	public void setSelect(HISelect select) {
		this.select = select;
		this.select.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISelect getSelect(){ return select; }

	private HINormal normal;
	/**
 The normal state of a series, or for point items in column, pie and similar series. Currently only used for setting animation when returning to normal state from hover. 
	*/
	public void setNormal(HINormal normal) {
		this.normal = normal;
		this.normal.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINormal getNormal(){ return normal; }

	private HIDisabled disabled;
	/**
 Disabled state overrides for the buttons are applied in addition to the normal state options 
	*/
	public void setDisabled(HIDisabled disabled) {
		this.disabled = disabled;
		this.disabled.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDisabled getDisabled(){ return disabled; }



	public HIStates() {

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
		if (this.select != null) {
			params.put("select", this.select.getParams());
		}
		if (this.normal != null) {
			params.put("normal", this.normal.getParams());
		}
		if (this.disabled != null) {
			params.put("disabled", this.disabled.getParams());
		}
		return params;
	}

}