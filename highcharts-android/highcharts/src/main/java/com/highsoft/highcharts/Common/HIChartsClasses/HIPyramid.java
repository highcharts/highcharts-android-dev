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



/**
A pyramid series. If the type option is
not specified, it is inherited from chart.type.

For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to
plotOptions.pyramid.
*/

public class HIPyramid extends HISeries {

/**
* description: The pyramid is reversed by default, as opposed to the funnel, which
shares the layout engine, and is not reversed.
*/
	public Boolean reversed;

/**
* description: The pyramid neck width is zero by default, as opposed to the funnel, 
which shares the same layout logic.
*/
	public String neckHeight;

/**
* description: The pyramid neck width is zero by default, as opposed to the funnel, 
which shares the same layout logic.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/ : Funnel demo*/
	public String neckWidth;

/**
* description: The center of the series. By default, it is centered in the middle
of the plot area, so it fills the plot area height.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-center/ : Centered at 100, 100* default: ["50%", "50%"]
*/
	public ArrayList /* <String|Number> */ center;

/**
The height of the funnel or pyramid. If it is a number it defines
the pixel height, if it is a percentage string it is the percentage
of the plot area height.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/">Funnel demo</a>*/
	public Object /* Number|String */ height;

/**
The width of the funnel compared to the width of the plot area,
or the pixel width if it is a number.
*/
	public Object /* Number|String */ width;

/**
The color of the border surrounding each slice. When null, the
border takes the same color as the slice fill. This can be used
together with a borderWidth to fill drawing gaps created by antialiazing
artefacts in borderless pies.

In styled mode, the border stroke is given in the .highcharts-point class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/">Black border</a> <br><br><b>default:</b><br><br>&ensp;#ffffff*/
	public HIColor borderColor;

/**
The end angle of the pie in degrees where 0 is top and 90 is right.
Defaults to startAngle plus 360.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-semi-circle/">Semi-circle donut</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number endAngle;

/**
The size of the inner diameter for the pie. A size greater than 0
renders a donut chart. Can be a percentage or pixel value. Percentages
are relative to the pie size. Pixel values are given as integers.


Note: in Highcharts < 4.1.2, the percentage was relative to the plot
area, not the pie size.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-innersize-80px/">80px inner size</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-innersize-50percent/">50% of the plot area</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-pie-donut/">3D donut</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Object /* String|Number */ innerSize;
	public Boolean clip;

/**
If a point is sliced, moved out from the center, how many pixels
should it be moved?.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-slicedoffset-20/">20px offset</a> <br><br><b>default:</b><br><br>&ensp;10*/
	public Number slicedOffset;

/**
The thickness of a 3D pie. Requires highcharts-3d.js
 <br><br><b>default:</b><br><br>&ensp;0*/
	public Number depth;

/**
A series specific or series type specific color set to use instead
of the global colors.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/">Set default colors for all pies</a>*/
	public ArrayList<HIColor> colors;

/**
The minimum size for a pie in response to auto margins. The pie will
try to shrink to make room for data labels in side the plot area,
 but only to this size.
 <br><br><b>default:</b><br><br>&ensp;80*/
	public Number minSize;

/**
The width of the border surrounding each slice.

When setting the border width to 0, there may be small gaps between
the slices due to SVG antialiasing artefacts. To work around this,
keep the border width at 0.5 or 1, but set the borderColor to
null instead.

In styled mode, the border stroke width is given in the .highcharts-point class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-borderwidth/">3px border</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number borderWidth;
	public String legendType;

/**
The start angle of the pie slices in degrees where 0 is top and 90
right.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/">Start from right</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number startAngle;

/**
Equivalent to chart.ignoreHiddenSeries,
this option tells whether the series shall be redrawn as if the
hidden point were null.

The default value changed from false to true with Highcharts
3.0.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-ignorehiddenpoint/">True, the hiddden point is ignored</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean ignoreHiddenPoint;


	public HIPyramid() {
		super(); 
		this.type = "pyramid";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.neckHeight != null) {
			params.put("neckHeight", this.neckHeight);
		}
		if (this.neckWidth != null) {
			params.put("neckWidth", this.neckWidth);
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
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
		}
		if (this.innerSize != null) {
			params.put("innerSize", this.innerSize);
		}
		if (this.clip != null) {
			params.put("clip", this.clip);
		}
		if (this.slicedOffset != null) {
			params.put("slicedOffset", this.slicedOffset);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.legendType != null) {
			params.put("legendType", this.legendType);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		return params;
	}

}