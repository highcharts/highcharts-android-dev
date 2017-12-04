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
* description: The appearance of the point marker when selected. In order to
allow a point to be selected, set the series.allowPointSelect
option to true.
*/
public class HISelect implements HIChartsJSONSerializable { 


/**
* description: Enable or disable visible feedback for selection.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-enabled/ : Disabled select state
* default: true
*/
	public Boolean enabled;

/**
* description: The color of the point marker's outline. When null, the series'
or point's color is used.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linecolor/ : Red line color for selected points
* default: #000000
*/
	public HIColor lineColor;

/**
* description: The width of the point marker's outline.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linewidth/ : 3px line width for selected points
* default: 0
*/
	public Number lineWidth;

/**
* description: The fill color of the point marker.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-fillcolor/ : Solid red discs for selected points
* default: null
*/
	public HIColor fillColor;

/**
* description: The radius of the point marker. In hover state, it defaults to the
normal state's radius + 2.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-radius/ : 10px radius for selected points
*/
	public Number radius;


	public HISelect() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		return params;
	}

}