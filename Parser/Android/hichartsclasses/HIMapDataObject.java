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



public class HIMapDataObject extends HIFoundation { 

	private String name;
	/**
 The name of the data. 
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private List /* <Number, String> */ path;
	/**
 The SVG path. 
	*/
	public void setPath(List /* <Number, String> */ path) {
		this.path = path;
		this.setChanged();
		this.notifyObservers();
	}

	public List /* <Number, String> */ getPath(){ return path; }

	private Object properties;
	/**
 The GeoJSON meta data. 
	*/
	public void setProperties(Object properties) {
		this.properties = properties;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getProperties(){ return properties; }



	public HIMapDataObject() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.path != null) {
			List<Object> array = new List<>();
			for (Object obj : this.path) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("path", array);
		}
		if (this.properties != null) {
			params.put("properties", this.properties);
		}
		return params;
	}

}