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
* description: A pyramid series. If the type option is
not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
pyramid.
*/

public class HIPyramid extends HISeries {

/**
* description: The pyramid neck width is zero by default, as opposed to the funnel, 
which shares the same layout logic.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/ : Funnel demo
* default: 0%
*/
	public String neckWidth;

/**
* description: The minimum size for a pie in response to auto margins. The pie will
try to shrink to make room for data labels in side the plot area,
 but only to this size.
* default: 80
*/
	public Number minSize;

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
* description: The width of the funnel compared to the width of the plot area,
or the pixel width if it is a number.
* default: 90%
*/
	public Object /* String, Double */ width;

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
* description: The pyramid neck width is zero by default, as opposed to the funnel, 
which shares the same layout logic.
* default: 0%
*/
	public String neckHeight;

/**
* description: The thickness of a 3D pie. Requires highcharts-3d.js
* default: 0
*/
	public Number depth;
	public Boolean clip;

/**
* description: The pyramid is reversed by default, as opposed to the funnel, which
shares the layout engine, and is not reversed.
* default: true
*/
	public Boolean reversed;

/**
* description: The end angle of the pie in degrees where 0 is top and 90 is right.
Defaults to startAngle plus 360.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-semi-circle/ : Semi-circle donut
* default: null
*/
	public Number endAngle;

/**
* description: The start angle of the pie slices in degrees where 0 is top and 90
right.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/ : Start from right
* default: 0
*/
	public Number startAngle;

/**
* description: The height of the funnel or pyramid. If it is a number it defines
the pixel height, if it is a percentage string it is the percentage
of the plot area height.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/ : Funnel demo
* default: 100%
*/
	public Object /* String, Double */ height;

/**
* description: The center of the series. By default, it is centered in the middle
of the plot area, so it fills the plot area height.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-center/ : Centered at 100, 100
* default: ["50%", "50%"]
*/
	public ArrayList /* <String, Double> */ center;

/**
* description: If a point is sliced, moved out from the center, how many pixels
should it be moved?.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-slicedoffset-20/ : 20px offset
* default: 10
*/
	public Number slicedOffset;

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
* description: A series specific or series type specific color set to use instead
of the global colors.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/ : Set default colors for all pies
*/
	public ArrayList<HIColor> colors;


	public HIPyramid() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.neckWidth != null) {
			params.put("neckWidth", this.neckWidth);
		}
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.innerSize != null) {
			params.put("innerSize", this.innerSize);
		}
		if (this.neckHeight != null) {
			params.put("neckHeight", this.neckHeight);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.clip != null) {
			params.put("clip", this.clip);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.height != null) {
			params.put("height", this.height);
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
		if (this.slicedOffset != null) {
			params.put("slicedOffset", this.slicedOffset);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		return params;
	}

}