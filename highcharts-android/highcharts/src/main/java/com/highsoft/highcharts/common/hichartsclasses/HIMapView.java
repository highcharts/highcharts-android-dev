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



public class HIMapView extends HIFoundation { 

	private Object center;
	/**
 The current center of the view in terms of `[longitude, latitude]`. 
	*/
	public void setCenter(Object center) {
		this.center = center;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getCenter(){ return center; }

	private Number zoom;
	/**
 The current zoom level of the view. 
	*/
	public void setZoom(Number zoom) {
		this.zoom = zoom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZoom(){ return zoom; }



	public HIMapView() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.center != null) {
			params.put("center", this.center);
		}
		if (this.zoom != null) {
			params.put("zoom", this.zoom);
		}
		return params;
	}

}