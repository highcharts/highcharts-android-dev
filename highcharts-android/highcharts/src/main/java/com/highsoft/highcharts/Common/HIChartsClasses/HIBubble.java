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
* description: A bubble series. If the type option is
not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
bubble.
*/

public class HIBubble extends HISeries {

/**
* description: Minimum bubble size. Bubbles will automatically size between the
minSize and maxSize to reflect the z value of each bubble.
Can be either pixels (when no unit is given), or a percentage of
the smallest one of the plot width and height.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-size/ : Bubble size
* default: 8
*/
	public String minSize;

/**
* description: Maximum bubble size. Bubbles will automatically size between the
minSize and maxSize to reflect the z value of each bubble.
Can be either pixels (when no unit is given), or a percentage of
the smallest one of the plot width and height.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-size/ : Bubble size
* default: 20%
*/
	public String maxSize;

/**
* description: The minimum for the Z value range. Defaults to the highest Z value
in the data.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-zmin-zmax/ : Z has a possible range of 0-100
* default: null
*/
	public Number zMax;

/**
* description: The minimum for the Z value range. Defaults to the lowest Z value
in the data.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-zmin-zmax/ : Z has a possible range of 0-100
* default: null
*/
	public Number zMin;

/**
* description: Whether to display negative sized bubbles. The threshold is given
by the zThreshold option, and negative
bubbles can be visualized by setting negativeColor.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-negative/ : Negative bubbles
* default: true
*/
	public Boolean displayNegative;

/**
* description: When displayNegative is false,
bubbles with lower Z values are skipped. When displayNegative
is true and a negativeColor
is given, points with lower Z is colored.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-negative/ : Negative bubbles
* default: 0
*/
	public Number zThreshold;

/**
* description: When this is true, the absolute value of z determines the size of
the bubble. This means that with the default zThreshold of 0, a
bubble of value -1 will have the same size as a bubble of value 1,
while a bubble of value 0 will have a smaller size according to
minSize.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-sizebyabsolutevalue/ : Size by absolute value, various thresholds
* default: false
*/
	public Boolean sizeByAbsoluteValue;

/**
* description: Whether the bubble's value should be represented by the area or the
width of the bubble. The default, area, corresponds best to the
human perception of the size of each bubble.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-sizeby/ : Comparison of area and size
* accepted values: ["area", "width"]
* default: area
*/
	public String sizeBy;


	public HIBubble() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.maxSize != null) {
			params.put("maxSize", this.maxSize);
		}
		if (this.zMax != null) {
			params.put("zMax", this.zMax);
		}
		if (this.zMin != null) {
			params.put("zMin", this.zMin);
		}
		if (this.displayNegative != null) {
			params.put("displayNegative", this.displayNegative);
		}
		if (this.zThreshold != null) {
			params.put("zThreshold", this.zThreshold);
		}
		if (this.sizeByAbsoluteValue != null) {
			params.put("sizeByAbsoluteValue", this.sizeByAbsoluteValue);
		}
		if (this.sizeBy != null) {
			params.put("sizeBy", this.sizeBy);
		}
		return params;
	}

}