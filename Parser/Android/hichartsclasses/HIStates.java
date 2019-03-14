/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIStates extends HIFoundation { 

	private HIHover hover;
	public void setHover(HIHover hover) {
		this.hover = hover;
		this.hover.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHover getHover(){ return hover; }

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
 The normal state of a single point marker. Currently only used for setting animation when returning to normal state from hover. 
	*/
	public void setNormal(HINormal normal) {
		this.normal = normal;
		this.normal.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINormal getNormal(){ return normal; }



	public HIStates() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.hover != null) {
			params.put("hover", this.hover.getParams());
		}
		if (this.select != null) {
			params.put("select", this.select.getParams());
		}
		if (this.normal != null) {
			params.put("normal", this.normal.getParams());
		}
		return params;
	}

}