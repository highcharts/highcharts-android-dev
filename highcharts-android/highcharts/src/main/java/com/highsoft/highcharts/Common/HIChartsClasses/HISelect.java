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



public class HISelect implements HIChartsJSONSerializable { 


/**
Enable or disable visible feedback for selection.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-enabled/ : Disabled select state
* default: true
*/
	public Boolean enabled;

/**
The width of the point marker's outline.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linewidth/ : 3px line width for selected points
*/
	public Number lineWidth;

/**
The radius of the point marker. In hover state, it defaults
to the normal state's radius + 2.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-radius/ : 10px radius for selected points
*/
	public Number radius;

/**
The fill color of the point marker.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-fillcolor/ : Solid red discs for selected points
* default: #cccccc
*/
	public HIColor fillColor;

/**
The color of the point marker's outline. When null, the
series' or point's color is used.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linecolor/ : Red line color for selected points
* default: #000000
*/
	public HIColor lineColor;

/**
A specific color for the selected point.
* default: #cccccc
*/
	public HIColor color;

/**
A specific border color for the selected point.
* default: #000000
*/
	public HIColor borderColor;


	public HISelect() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		return params;
	}

}