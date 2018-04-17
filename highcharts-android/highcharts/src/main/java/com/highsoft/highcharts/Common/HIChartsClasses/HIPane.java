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



public class HIPane implements HIChartsJSONSerializable { 


/**
The end angle of the polar X axis or gauge value axis, given in
degrees where 0 is north. Defaults to startAngle
+ 360.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>*/
	public Number endAngle;

/**
The start angle of the polar X axis or gauge axis, given in degrees
where 0 is north. Defaults to 0.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>*/
	public Number startAngle;

/**
The center of a polar chart or angular gauge, given as an array
of [x, y] positions. Positions can be given as integers that
transform to pixels, or as percentages of the plot area size.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Two gauges with different center</a> <br><br><b>default:</b><br><br>&ensp;["50%", "50%"]*/
	public ArrayList /* <String|Number> */ center;

/**
An array of background items for the pane.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Speedometer gauge with multiple backgrounds</a>*/
	public ArrayList <HIBackground> background;

/**
The size of the pane, either as a number defining pixels, or a
percentage defining a percentage of the plot are.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Smaller size</a> <br><br><b>default:</b><br><br>&ensp;85%*/
	public Object /* Number|String */ size;


	public HIPane() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.center != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.center) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("center", array);
		}
		if (this.background != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.background) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("background", array);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}