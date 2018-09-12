/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HIAnnotations extends Observable implements HIChartsJSONSerializable { 

	private Number zIndex;
/**
The Z index of the annotation.
 <br><br><b>default:</b><br><br>&ensp;6*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private ArrayList <HILabels> labels;
/**
An array of labels for the annotation. For options that apply to
multiple labels, they can be added to the
[labelOptions](annotations.labelOptions.html).
*/
	public void setLabels(ArrayList labels) {
		this.labels = labels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLabels(){ return labels; }

	private HILabelOptions labelOptions;
/**
Options for annotation's labels. Each label inherits options
from the labelOptions object. An option from the labelOptions can be
overwritten by config for a specific label.
*/
	public void setLabelOptions(HILabelOptions labelOptions) {
		this.labelOptions = labelOptions;
		this.labelOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabelOptions getLabelOptions(){ return labelOptions; }

	private ArrayList <HIShapes> shapes;
/**
An array of shapes for the annotation. For options that apply to
multiple shapes, then can be added to the
[shapeOptions](annotations.shapeOptions.html).
*/
	public void setShapes(ArrayList shapes) {
		this.shapes = shapes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getShapes(){ return shapes; }

	private Boolean visible;
/**
Whether the annotation is visible.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/visible/">Set annotation visibility</a>*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private HIShapeOptions shapeOptions;
/**
Options for annotation's shapes. Each shape inherits options
from the shapeOptions object. An option from the shapeOptions can be
overwritten by config for a specific shape.
*/
	public void setShapeOptions(HIShapeOptions shapeOptions) {
		this.shapeOptions = shapeOptions;
		this.shapeOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIShapeOptions getShapeOptions(){ return shapeOptions; }



	public HIAnnotations() {

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
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.labels != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.labels) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("labels", array);
		}
		if (this.labelOptions != null) {
			params.put("labelOptions", this.labelOptions.getParams());
		}
		if (this.shapes != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.shapes) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("shapes", array);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.shapeOptions != null) {
			params.put("shapeOptions", this.shapeOptions.getParams());
		}
		return params;
	}

}