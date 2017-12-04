/**
* (c) 2009-2017 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/


package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIGFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;


/**
* description: Options for configuring annotations, for example labels, arrows or 
shapes. Annotations can be tied to points, axis coordinates or chart
pixel coordinates.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/basic/ : Basic annotations
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/annotations/fibonacci-retracements : Custom annotation, Fibonacci retracement
*/
public class HIAnnotations implements HIChartsJSONSerializable { 


/**
* description: Whether the annotation is visible.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/visible/ : Set annotation visibility
* default: True
*/
	public Boolean visible;

/**
* description: An array of labels for the annotation. For options that apply to multiple
labels, they can be added to the annotations.labelOptions.html : labelOptions.
*/
	public ArrayList <HILabels> labels;

/**
* description: The Z index of the annotation.
* default: 6
*/
	public Number zIndex;

/**
* description: Options for annotation's shapes. Each shape inherits options
from the shapeOptions object. An option from the shapeOptions can be
overwritten by config for a specific shape.
*/
	public HIShapeOptions shapeOptions;

/**
* description: An array of shapes for the annotation. For options that apply to multiple
shapes, then can be added to the annotations.shapeOptions.html : shapeOptions.
*/
	public ArrayList <HIShapes> shapes;

/**
* description: Options for annotation's labels. Each label inherits options
from the labelOptions object. An option from the labelOptions can be
overwritten by config for a specific label.
*/
	public HILabelOptions labelOptions;


	public HIAnnotations() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.visible != null) {
			params.put("visible", this.visible);
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
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.shapeOptions != null) {
			params.put("shapeOptions", this.shapeOptions.getParams());
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
		if (this.labelOptions != null) {
			params.put("labelOptions", this.labelOptions.getParams());
		}
		return params;
	}

}