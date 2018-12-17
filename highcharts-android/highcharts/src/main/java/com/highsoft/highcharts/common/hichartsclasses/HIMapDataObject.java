/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HIMapDataObject extends Observable implements HIChartsJSONSerializable { 

	private String name;
/**
/** The name of the data. 
*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private ArrayList /* <Number, String> */ path;
/**
/** The SVG path. 
*/
	public void setPath(ArrayList /* <Number, String> */ path) {
		this.path = path;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList /* <Number, String> */ getPath(){ return path; }

	private Object properties;
/**
/** The GeoJSON meta data. 
*/
	public void setProperties(Object properties) {
		this.properties = properties;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getProperties(){ return properties; }



	public HIMapDataObject() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.path != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.path) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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