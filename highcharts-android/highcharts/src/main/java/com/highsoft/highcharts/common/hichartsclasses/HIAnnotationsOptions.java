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



public class HIAnnotationsOptions extends HIFoundation { 

	private HIControlPointOptions controlPointOptions;
	/**
 Options for annotation's control points. Each control point inherits options from controlPointOptions object. Options from the controlPointOptions can be overwritten by options in a specific control point. 
	*/
	public void setControlPointOptions(HIControlPointOptions controlPointOptions) {
		this.controlPointOptions = controlPointOptions;
		this.controlPointOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIControlPointOptions getControlPointOptions(){ return controlPointOptions; }

	private ArrayList <HIShapes> shapes;
	/**
 An array of shapes for the annotation. For options that apply to multiple shapes, then can be added to the `shapeOptions`. 
	*/
	public void setShapes(ArrayList shapes) {
		this.shapes = shapes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getShapes(){ return shapes; }

	private HIShapeOptions shapeOptions;
	/**
 Options for annotation's shapes. Each shape inherits options from the shapeOptions object. An option from the shapeOptions can be overwritten by config for a specific shape. 
	*/
	public void setShapeOptions(HIShapeOptions shapeOptions) {
		this.shapeOptions = shapeOptions;
		this.shapeOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIShapeOptions getShapeOptions(){ return shapeOptions; }

	private Number zIndex;
	/**
 The Z index of the annotation. 
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private Boolean visible;
	/**
 Whether the annotation is visible. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/visible/">Set annotation visibility</a>
	*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private ArrayList <HILabels> labels;
	/**
 An array of labels for the annotation. For options that apply to multiple labels, they can be added to the `labelOptions`. 
	*/
	public void setLabels(ArrayList labels) {
		this.labels = labels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLabels(){ return labels; }

	private HILabelOptions labelOptions;
	/**
 Options for annotation's labels. Each label inherits options from the labelOptions object. An option from the labelOptions can be overwritten by config for a specific label. 
	*/
	public void setLabelOptions(HILabelOptions labelOptions) {
		this.labelOptions = labelOptions;
		this.labelOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabelOptions getLabelOptions(){ return labelOptions; }

	private Object /* String, Number */ id;
	/**
 Sets an ID for an annotation. Can be user later when removing an annotation in `Chart#removeAnnotation(id)` method. 
	*/
	public void setId(Object /* String, Number */ id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* String, Number */ getId(){ return id; }

	private String draggable;
	/**
 Allow an annotation to be draggable by a user. Possible values are "x", "xy", "y" and "" (disabled). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/draggable/">Annotations draggable: 'xy'</a> <br><br><b>accepted values:</b><br><br>&ensp;["x", "xy", "y", ""]
	*/
	public void setDraggable(String draggable) {
		this.draggable = draggable;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDraggable(){ return draggable; }

	private HIEvents events;
	/**
 Events available in annotations. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }



	public HIAnnotationsOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.controlPointOptions != null) {
			params.put("controlPointOptions", this.controlPointOptions.getParams());
		}
		if (this.shapes != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.shapes) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("shapes", array);
		}
		if (this.shapeOptions != null) {
			params.put("shapeOptions", this.shapeOptions.getParams());
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.labels != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.labels) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
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
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.draggable != null) {
			params.put("draggable", this.draggable);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		return params;
	}

}