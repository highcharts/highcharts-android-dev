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
* description: A collection of attributes for the button. The object takes SVG
attributes like fill, stroke, stroke-width or r, the border
radius. The theme also supports style, a collection of CSS properties
for the text. Equivalent attributes for the hover state are given
in theme.states.hover.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-theme/ : Theming the button
*/
public class HITheme implements HIChartsJSONSerializable { 

	public Number padding;

/**
* description: The default fill exists only to capture hover events.
* default: #ffffff
*/
	public String fill;
	public String stroke;

/**
* description: The Z index for the reset zoom button.
* default: 20
*/
	public Number zIndex;


	public HITheme() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		return params;
	}

}