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
import com.highsoft.highcharts.Common.HIColor;


/**
* description: An array of shapes for the annotation. For options that apply to multiple
shapes, then can be added to the annotations.shapeOptions.html : shapeOptions.
*/
public class HIShapes implements HIChartsJSONSerializable { 


/**
* description: The color of the shape's stroke.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: rgba(0, 0, 0, 0.75)
*/
	public HIColor stroke;

/**
* description: The height of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
*/
	public Number height;

/**
* description: The pixel stroke width of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: 1
*/
	public Number strokeWidth;

/**
* description: The color of the shape's fill.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: rgba(0, 0, 0, 0.75)
*/
	public HIColor fill;

/**
* description: This option defines the point to which the shape will be connected.
It can be either the point which exists in the series - it is referenced
by the point's id - or a new point with defined x, y properties
and optionally axes.
*/
	public HIPoint point;

/**
* description: The width of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
*/
	public Number width;

/**
* description: The type of the shape, e.g. circle or rectangle.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: 'rect'
*/
	public String type;

/**
* description: Id of the marker which will be drawn at the final vertex of the path.
Custom markers can be defined in defs property.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/ : Define a custom marker for annotations
*/
	public String markerEnd;

/**
* description: An array of points for the shape. This option is available for shapes
which can use multiple points such as path. A point can be either 
a point object or a point's id.
*/
	public ArrayList points;

/**
* description: Id of the marker which will be drawn at the first vertex of the path.
Custom markers can be defined in defs property.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/ : Define a custom marker for annotations
*/
	public String markerStart;

/**
* description: The radius of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
*/
	public Number r;


	public HIShapes() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.stroke != null) {
			params.put("stroke", this.stroke.getData());
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.strokeWidth != null) {
			params.put("strokeWidth", this.strokeWidth);
		}
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.markerEnd != null) {
			params.put("markerEnd", this.markerEnd);
		}
		if (this.points != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.points) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("points", array);
		}
		if (this.markerStart != null) {
			params.put("markerStart", this.markerStart);
		}
		if (this.r != null) {
			params.put("r", this.r);
		}
		return params;
	}

}