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
* description: Options for annotation's shapes. Each shape inherits options
from the shapeOptions object. An option from the shapeOptions can be
overwritten by config for a specific shape.
*/
public class HIShapeOptions implements HIChartsJSONSerializable { 


/**
* description: The height of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
*/
	public Number height;

/**
* description: The type of the shape, e.g. circle or rectangle.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: 'rect'
*/
	public String type;

/**
* description: The width of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
*/
	public Number width;

/**
* description: The pixel stroke width of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: 1
*/
	public Number strokeWidth;

/**
* description: The color of the shape's stroke.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: rgba(0, 0, 0, 0.75)
*/
	public HIColor stroke;

/**
* description: The radius of the shape.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
*/
	public Number r;

/**
* description: The color of the shape's fill.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/ : Basic shape annotation
* default: rgba(0, 0, 0, 0.75)
*/
	public HIColor fill;


	public HIShapeOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.strokeWidth != null) {
			params.put("strokeWidth", this.strokeWidth);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke.getData());
		}
		if (this.r != null) {
			params.put("r", this.r);
		}
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		return params;
	}

}