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
* description: Options for the pivot or the center point of the gauge.
In styled mode, the pivot is styled with the .highcharts-gauge-
series .highcharts-pivot rule.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/gauge/ : Styled mode
*/
public class HIPivot implements HIChartsJSONSerializable { 


/**
* description: The pixel radius of the pivot.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/ : Pivot options demonstrated
* default: 5
*/
	public Number radius;

/**
* description: The border or stroke color of the pivot. In able to change this,
the borderWidth must also be set to something other than the default
0.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/ : Pivot options demonstrated
* default: #cccccc
*/
	public HIColor borderColor;

/**
* description: The background color or fill of the pivot.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/ : Pivot options demonstrated
* default: #000000
*/
	public HIColor backgroundColor;

/**
* description: The border or stroke width of the pivot.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-pivot/ : Pivot options demonstrated
* default: 0
*/
	public Number borderWidth;


	public HIPivot() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		return params;
	}

}