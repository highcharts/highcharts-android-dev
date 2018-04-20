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



public class HIDial implements HIChartsJSONSerializable { 


/**
The border color or stroke of the gauge's dial. By default, the
borderWidth is 0, so this must be set in addition to a custom border
color.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#cccccc*/
	public HIColor borderColor;

/**
The length of the dial's rear end, the part that extends out on the
other side of the pivot. Relative to the dial's length.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;10%*/
	public String rearLength;

/**
The length of the dial's base part, relative to the total radius
or length of the dial.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;70%*/
	public String baseLength;

/**
The radius or length of the dial, in percentages relative to the
radius of the gauge itself.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;80%*/
	public String radius;

/**
The width of the gauge dial border in pixels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderWidth;

/**
The background or fill color of the gauge's dial.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#000000*/
	public HIColor backgroundColor;

/**
The width of the top of the dial, closest to the perimeter. The pivot
narrows in from the base to the top.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number topWidth;

/**
The pixel width of the base of the gauge dial. The base is the part
closest to the pivot, defined by baseLength.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;3*/
	public Number baseWidth;


	public HIDial() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.rearLength != null) {
			params.put("rearLength", this.rearLength);
		}
		if (this.baseLength != null) {
			params.put("baseLength", this.baseLength);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.topWidth != null) {
			params.put("topWidth", this.topWidth);
		}
		if (this.baseWidth != null) {
			params.put("baseWidth", this.baseWidth);
		}
		return params;
	}

}