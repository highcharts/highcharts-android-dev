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
* description: Options for the dial or arrow pointer of the gauge.
In styled mode, the dial is styled with the .highcharts-gauge-
series .highcharts-dial rule.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/gauge/ : Styled mode
*/
public class HIDial implements HIChartsJSONSerializable { 


/**
* description: The length of the dial's rear end, the part that extends out on the
other side of the pivot. Relative to the dial's length.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: 10%
*/
	public String rearLength;

/**
* description: The border color or stroke of the gauge's dial. By default, the borderWidth
is 0, so this must be set in addition to a custom border color.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: #cccccc
*/
	public HIColor borderColor;

/**
* description: The radius or length of the dial, in percentages relative to the
radius of the gauge itself.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: 80%
*/
	public String radius;

/**
* description: The width of the top of the dial, closest to the perimeter. The pivot
narrows in from the base to the top.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: 1
*/
	public Number topWidth;

/**
* description: The length of the dial's base part, relative to the total radius
or length of the dial.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: 70%
*/
	public String baseLength;

/**
* description: The pixel width of the base of the gauge dial. The base is the part
closest to the pivot, defined by baseLength.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: 3
*/
	public Number baseWidth;

/**
* description: The width of the gauge dial border in pixels.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: 0
*/
	public Number borderWidth;

/**
* description: The background or fill color of the gauge's dial.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/ : Dial options demonstrated
* default: #000000
*/
	public HIColor backgroundColor;


	public HIDial() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.rearLength != null) {
			params.put("rearLength", this.rearLength);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.topWidth != null) {
			params.put("topWidth", this.topWidth);
		}
		if (this.baseLength != null) {
			params.put("baseLength", this.baseLength);
		}
		if (this.baseWidth != null) {
			params.put("baseWidth", this.baseWidth);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		return params;
	}

}