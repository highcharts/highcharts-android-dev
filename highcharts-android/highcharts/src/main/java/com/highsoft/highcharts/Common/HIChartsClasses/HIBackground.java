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



public class HIBackground implements HIChartsJSONSerializable { 


/**
The pane background border color.
* default: #cccccc
*/
	public HIColor borderColor;

/**
The outer radius of the circular pane background. Can be either
numeric (pixels) or a percentage string.
* default: 105%
*/
	public Object /* Number|String */ outerRadius;
	public Object from;

/**
The inner radius of the pane background. Can be either numeric
(pixels) or a percentage string.
* default: 0
*/
	public Object /* Number|String */ innerRadius;

/**
The class name for this background.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pane/ : Panes styled by CSS
*/
	public String className;

/**
Tha shape of the pane background. When solid, the background
is circular. When arc, the background extends only from the min
to the max of the value axis.
* accepted values: ["solid", "arc"]
* default: solid
*/
	public String shape;

/**
The pixel border width of the pane background.
* default: 1
*/
	public Number borderWidth;

/**
The background color or gradient for the pane.
*/
	public HIBackgroundColor backgroundColor;


	public HIBackground() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.outerRadius != null) {
			params.put("outerRadius", this.outerRadius);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getParams());
		}
		return params;
	}

}