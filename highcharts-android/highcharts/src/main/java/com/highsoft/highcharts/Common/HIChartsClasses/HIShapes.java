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
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



public class HIShapes implements HIChartsJSONSerializable { 


/**
An array of points for the shape. This option is available for shapes
which can use multiple points such as path. A point can be either 
a point object or a point's id.
*/
	public ArrayList points;

/**
Id of the marker which will be drawn at the final vertex of the path.
Custom markers can be defined in defs property.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>*/
	public String markerEnd;

/**
Id of the marker which will be drawn at the first vertex of the path.
Custom markers can be defined in defs property.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>*/
	public String markerStart;

/**
This option defines the point to which the shape will be connected.
It can be either the point which exists in the series - it is
referenced by the point's id - or a new point with defined x, y
properties and optionally axes.
*/
	public HIPoint point;

/**
The pixel stroke width of the shape.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation
*</a>*/
	public Number strokeWidth;

/**
The height of the shape.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>*/
	public Number height;

/**
The width of the shape.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>*/
	public Number width;

/**
The color of the shape's stroke.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation
*</a>*/
	public HIColor stroke;

/**
The radius of the shape.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation
*</a>*/
	public Number r;

/**
The type of the shape, e.g. circle or rectangle.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a> <br><br><b>default:</b><br><br>&ensp;'rect'*/
	public String type;

/**
The color of the shape's fill.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation
*</a>*/
	public HIColor fill;


	public HIShapes() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
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
		if (this.markerEnd != null) {
			params.put("markerEnd", this.markerEnd);
		}
		if (this.markerStart != null) {
			params.put("markerStart", this.markerStart);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.strokeWidth != null) {
			params.put("strokeWidth", this.strokeWidth);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke.getData());
		}
		if (this.r != null) {
			params.put("r", this.r);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		return params;
	}

}