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
* description: A funnel series. If the type option is
not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
funnel.
*/

public class HIFunnel extends HISeries {

/**
* description: The color of the border surrounding each slice. When null, the
border takes the same color as the slice fill. This can be used
together with a borderWidth to fill drawing gaps created by antialiazing
artefacts in borderless pies.
In styled mode, the border stroke is given in the .highcharts-point class.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/ : Black border
* default: #ffffff
*/
	public HIColor borderColor;

/**
* description: The thickness of a 3D pie. Requires highcharts-3d.js
* default: 0
*/
	public Number depth;

/**
* description: The width of the funnel compared to the width of the plot area,
or the pixel width if it is a number.
* default: 90%
*/
	public Object /* String, Double */ width;

/**
* description: If a point is sliced, moved out from the center, how many pixels
should it be moved?.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-slicedoffset-20/ : 20px offset
* default: 10
*/
	public Number slicedOffset;

/**
* description: The center of the series. By default, it is centered in the middle
of the plot area, so it fills the plot area height.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-center/ : Centered at 100, 100
* default: ["50%", "50%"]
*/
	public ArrayList /* <String, Double> */ center;

/**
* description: The minimum size for a pie in response to auto margins. The pie will
try to shrink to make room for data labels in side the plot area,
 but only to this size.
* default: 80
*/
	public Number minSize;

/**
* description: The end angle of the pie in degrees where 0 is top and 90 is right.
Defaults to startAngle plus 360.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-semi-circle/ : Semi-circle donut
* default: null
*/
	public Number endAngle;

/**
* description: The width of the neck, the lower part of the funnel. A number defines
pixel width, a percentage string defines a percentage of the plot
area width.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/ : Funnel demo
* default: 30%
*/
	public Object /* String, Double */ neckWidth;

/**
* description: The start angle of the pie slices in degrees where 0 is top and 90
right.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/ : Start from right
* default: 0
*/
	public Number startAngle;

/**
* description: Equivalent to chart.ignoreHiddenSeries,
this option tells whether the series shall be redrawn as if the
hidden point were null.
The default value changed from false to true with Highcharts
3.0.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-ignorehiddenpoint/ : True, the hiddden point is ignored
* default: true
*/
	public Boolean ignoreHiddenPoint;

/**
* description: The size of the inner diameter for the pie. A size greater than 0
renders a donut chart. Can be a percentage or pixel value. Percentages
are relative to the pie size. Pixel values are given as integers.
Note: in Highcharts < 4.1.2, the percentage was relative to the plot
area, not the pie size.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-innersize-80px/ : 80px inner size
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-innersize-50percent/ : 50% of the plot area
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-pie-donut/ : 3D donut
* default: 0
*/
	public Object /* String, Double */ innerSize;

/**
* description: A reversed funnel has the widest area down. A reversed funnel with
no neck width and neck height is a pyramid.
* default: false
*/
	public Boolean reversed;

/**
* description: The height of the funnel or pyramid. If it is a number it defines
the pixel height, if it is a percentage string it is the percentage
of the plot area height.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/ : Funnel demo
* default: 100%
*/
	public Object /* String, Double */ height;

/**
* description: A series specific or series type specific color set to use instead
of the global colors.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/ : Set default colors for all pies
*/
	public ArrayList<HIColor> colors;

/**
* description: The height of the neck, the lower part of the funnel. A number defines
pixel width, a percentage string defines a percentage of the plot
area height.
* default: 25%
*/
	public Object /* String, Double */ neckHeight;
	public Boolean clip;


	public HIFunnel() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.slicedOffset != null) {
			params.put("slicedOffset", this.slicedOffset);
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
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
		}
		if (this.neckWidth != null) {
			params.put("neckWidth", this.neckWidth);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		if (this.innerSize != null) {
			params.put("innerSize", this.innerSize);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.neckHeight != null) {
			params.put("neckHeight", this.neckHeight);
		}
		if (this.clip != null) {
			params.put("clip", this.clip);
		}
		return params;
	}

}