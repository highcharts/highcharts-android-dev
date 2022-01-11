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



public class HIAnnotationControllable extends HIFoundation { 

	private HIAnnotation annotation;
	public void setAnnotation(HIAnnotation annotation) {
		this.annotation = annotation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnnotation getAnnotation(){ return annotation; }

	private HIChart chart;
	public void setChart(HIChart chart) {
		this.chart = chart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIChart getChart(){ return chart; }

	private String collection;
	public void setCollection(String collection) {
		this.collection = collection;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCollection(){ return collection; }

	private ArrayList points;
	public void setPoints(ArrayList points) {
		this.points = points;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPoints(){ return points; }



	public HIAnnotationControllable() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.annotation != null) {
			params.put("annotation", this.annotation.getParams());
		}
		if (this.chart != null) {
			params.put("chart", this.chart.getParams());
		}
		if (this.collection != null) {
			params.put("collection", this.collection);
		}
		if (this.points != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.points) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("points", array);
		}
		return params;
	}

}