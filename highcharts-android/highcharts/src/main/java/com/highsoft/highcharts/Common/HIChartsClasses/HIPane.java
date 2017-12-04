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
* description: The pane serves as a container for axes and backgrounds for circular 
gauges and polar charts.
*/
public class HIPane implements HIChartsJSONSerializable { 


/**
* description: An array of background items for the pane.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/ : Speedometer gauge with multiple backgrounds
*/
	public ArrayList <HIBackground> background;

/**
* description: The size of the pane, either as a number defining pixels, or a
percentage defining a percentage of the plot are.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/ : Smaller size
* default: 85%
*/
	public Object /* String, Double */ size;

/**
* description: The end angle of the polar X axis or gauge value axis, given in degrees
where 0 is north. Defaults to startAngle + 360.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/ : VU-meter with custom start and end angle
*/
	public Number endAngle;

/**
* description: The center of a polar chart or angular gauge, given as an array
of [x, y] positions. Positions can be given as integers that transform
to pixels, or as percentages of the plot area size.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/ : Two gauges with different center
* default: ["50%", "50%"]
*/
	public ArrayList /* <String, Double> */ center;

/**
* description: The start angle of the polar X axis or gauge axis, given in degrees
where 0 is north. Defaults to 0.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/ : VU-meter with custom start and end angle
*/
	public Number startAngle;


	public HIPane() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
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
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
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
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		return params;
	}

}