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
* description: An array of background items for the pane.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/ : Speedometer gauge with multiple backgrounds
*/
public class HIBackground implements HIChartsJSONSerializable { 


/**
* description: The class name for this background.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/ : Panes styled by CSS

*/
	public String className;

/**
* description: Tha shape of the pane background. When solid, the background
is circular. When arc, the background extends only from the min
to the max of the value axis.

* accepted values: ["solid", "arc"]
* default: solid
*/
	public String shape;

/**
* description: The background color or gradient for the pane.
*/
	public HIColor backgroundColor;

/**
* description: The outer radius of the circular pane background. Can be either
numeric (pixels) or a percentage string.
* default: 105%
*/
	public Object /* String, Double */ outerRadius;

/**
* description: The pane background border color.
* default: #cccccc
*/
	public HIColor borderColor;

/**
* description: The pixel border width of the pane background.
* default: 1
*/
	public Number borderWidth;

/**
* description: The inner radius of the pane background. Can be either numeric
(pixels) or a percentage string.
* default: 0
*/
	public Object /* String, Double */ innerRadius;


	public HIBackground() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.outerRadius != null) {
			params.put("outerRadius", this.outerRadius);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		return params;
	}

}