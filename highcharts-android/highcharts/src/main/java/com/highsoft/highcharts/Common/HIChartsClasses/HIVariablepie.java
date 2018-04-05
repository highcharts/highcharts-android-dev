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
A variablepie series. If the type option is not
specified, it is inherited from chart.type.

For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to [plotOptions.
variablepie](#plotOptions.variablepie).
*/

public class HIVariablepie extends HISeries {

/**
The maximum possible z value for the point's radius calculation. If
the point's Z value is bigger than zMax, the slice will be drawn
according to the zMax value
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/variable-radius-pie/zmin-zmax/">Series limited by both zMin and zMax</a>*/
	public Number zMax;

/**
The minimum size of the points' radius related to chart's plotArea.
If a number is set, it applies in pixels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/variable-radius-pie/min-max-point-size/">Example of minPointSize and maxPointSize</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/variable-radius-pie/min-point-size-100/">minPointSize set to 100</a>*/
	public Object /* String|Number */ minPointSize;

/**
Whether the pie slice's value should be represented by the area 
or the radius of the slice. Can be either area or radius. The
default, area, corresponds best to the human perception of the size
of each pie slice.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/variable-radius-pie/sizeby/">Difference between area and radius sizeBy</a> <br><br><b>accepted values:</b><br><br>&ensp;["area", "radius"]*/
	public String sizeBy;

/**
The minimum possible z value for the point's radius calculation. 
If the point's Z value is smaller than zMin, the slice will be drawn
according to the zMin value.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/variable-radius-pie/zmin-5/">zMin set to 5, smaller z values are treated as 5</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/variable-radius-pie/zmin-zmax/">Series limited by both zMin and zMax</a>*/
	public Number zMin;

/**
The maximum size of the points' radius related to chart's plotArea.
If a number is set, it applies in pixels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/variable-radius-pie/min-max-point-size/">Example of minPointSize and maxPointSize</a>*/
	public Object /* String|Number */ maxPointSize;

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

/**
The center of the pie chart relative to the plot area. Can be percentages
or pixel values. The default behaviour (as of 3.0) is to center
the pie so that all slices and data labels are within the plot area.
As a consequence, the pie may actually jump around in a chart with
dynamic values, as the data labels move. In that case, the center
should be explicitly set, for example to ["50%", "50%"].
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-center/">Centered at 100, 100</a> <br><br><b>default:</b><br><br>&ensp;[null, null]*/
	public ArrayList /* <String|Number> */ center;
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
The diameter of the pie relative to the plot area. Can be a percentage
or pixel value. Pixel values are given as integers. The default
behaviour (as of 3.0) is to scale to the plot area and give room
for data labels within the plot area.
slicedOffset is also included 
in the default size calculation. As a consequence, the size
of the pie may vary when points are updated and data labels more
around. In that case it is best to set a fixed value, for example
"75%".
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-size/">Smaller pie</a>*/
	public Object /* String|Number */ size;

/**
Equivalent to chart.ignoreHiddenSeries,
this option tells whether the series shall be redrawn as if the
hidden point were null.

The default value changed from false to true with Highcharts
3.0.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-ignorehiddenpoint/">True, the hiddden point is ignored</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean ignoreHiddenPoint;


	public HIVariablepie() {
		super(); 
		this.type = "variablepie";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.zMax != null) {
			params.put("zMax", this.zMax);
		}
		if (this.minPointSize != null) {
			params.put("minPointSize", this.minPointSize);
		}
		if (this.sizeBy != null) {
			params.put("sizeBy", this.sizeBy);
		}
		if (this.zMin != null) {
			params.put("zMin", this.zMin);
		}
		if (this.maxPointSize != null) {
			params.put("maxPointSize", this.maxPointSize);
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
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		return params;
	}

}