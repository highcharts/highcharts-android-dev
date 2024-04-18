/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.ArrayList;
import java.util.HashMap;



public class HIGeoJSON extends HIFoundation { 

	private String copyright;
	/**
 Full copyright note of the geographic data. 
	*/
	public void setCopyright(String copyright) {
		this.copyright = copyright;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCopyright(){ return copyright; }

	private String copyrightShort;
	/**
 Short copyright note of the geographic data suitable for watermarks. 
	*/
	public void setCopyrightShort(String copyrightShort) {
		this.copyrightShort = copyrightShort;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCopyrightShort(){ return copyrightShort; }

	private Object crs;
	/**
 Additional meta information based on the coordinate reference system. 
	*/
	public void setCrs(Object crs) {
		this.crs = crs;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getCrs(){ return crs; }

	private ArrayList features;
	/**
 Data sets of geographic features. 
	*/
	public void setFeatures(ArrayList features) {
		this.features = features;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getFeatures(){ return features; }

	private Object hcTransform;
	/**
 Map projections and transformations to be used when calculating between lat/lon and chart values. Required for lat/lon support on maps. Allows resizing, rotating, and moving portions of a map within its projected coordinate system while still retaining lat/lon support. If using lat/lon on a portion of the map that does not match a `hitZone`, the definition with the key `defaults` is used. 
	*/
	public void setHcTransform(Object hcTransform) {
		this.hcTransform = hcTransform;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getHcTransform(){ return hcTransform; }

	private String title;
	/**
 Title of the geographic data. 
	*/
	public void setTitle(String title) {
		this.title = title;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTitle(){ return title; }

	private String type;
	/**
 Type of the geographic data. Type of an optimized map collection is `FeatureCollection`. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private String version;
	/**
 Version of the geographic data. 
	*/
	public void setVersion(String version) {
		this.version = version;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVersion(){ return version; }



	public HIGeoJSON() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.copyright != null) {
			params.put("copyright", this.copyright);
		}
		if (this.copyrightShort != null) {
			params.put("copyrightShort", this.copyrightShort);
		}
		if (this.crs != null) {
			params.put("crs", this.crs);
		}
		if (this.features != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.features) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("features", array);
		}
		if (this.hcTransform != null) {
			params.put("hc-transform", this.hcTransform);
		}
		if (this.title != null) {
			params.put("title", this.title);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.version != null) {
			params.put("version", this.version);
		}
		return params;
	}

}