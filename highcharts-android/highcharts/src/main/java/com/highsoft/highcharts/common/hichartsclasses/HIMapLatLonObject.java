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



public class HIMapLatLonObject extends HIFoundation { 

	private Number lat;
	/**
 The latitude. 
	*/
	public void setLat(Number lat) {
		this.lat = lat;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLat(){ return lat; }

	private Number lon;
	/**
 The longitude. 
	*/
	public void setLon(Number lon) {
		this.lon = lon;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLon(){ return lon; }



	public HIMapLatLonObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.lat != null) {
			params.put("lat", this.lat);
		}
		if (this.lon != null) {
			params.put("lon", this.lon);
		}
		return params;
	}

}