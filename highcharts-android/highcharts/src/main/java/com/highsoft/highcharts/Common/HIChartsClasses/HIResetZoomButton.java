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
* description: The button that appears after a selection zoom, allowing the user
to reset zoom.
*/
public class HIResetZoomButton implements HIChartsJSONSerializable { 


/**
* description: What frame the button should be placed related to. Can be either
plot or chart

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-relativeto/ : Relative to the chart
* accepted values: ["plot", "chart"]
* default: plot
*/
	public String relativeTo;

/**
* description: The position of the button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/ : Above the plot area

*/
	public HIPosition position;

/**
* description: A collection of attributes for the button. The object takes SVG
attributes like fill, stroke, stroke-width or r, the border
radius. The theme also supports style, a collection of CSS properties
for the text. Equivalent attributes for the hover state are given
in theme.states.hover.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-theme/ : Theming the button
*/
	public HITheme theme;


	public HIResetZoomButton() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.relativeTo != null) {
			params.put("relativeTo", this.relativeTo);
		}
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.theme != null) {
			params.put("theme", this.theme.getParams());
		}
		return params;
	}

}