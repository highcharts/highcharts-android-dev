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
* description: Options for the drill up button that appears when drilling down
on a series. The text for the button is defined in lang.drillUpText.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/ : Drill up button
*/
public class HIDrillUpButton implements HIChartsJSONSerializable { 


/**
* description: The position of the button.
*/
	public HIPosition position;

/**
* description: A collection of attributes for the button. The object takes SVG attributes
like fill, stroke, stroke-width or r, the border radius.
The theme also supports style, a collection of CSS properties for
the text. Equivalent attributes for the hover state are given in
theme.states.hover.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/ : Button theming
*/
	public Object theme;

/**
* description: What box to align the button to. Can be either plotBox or
`spacingBox.

* accepted values: ["plotBox", "spacingBox"]
* default: plotBox
*/
	public String relativeTo;


	public HIDrillUpButton() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.theme != null) {
			params.put("theme", this.theme);
		}
		if (this.relativeTo != null) {
			params.put("relativeTo", this.relativeTo);
		}
		return params;
	}

}