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
A histogram series. If the type option is not
specified, it is inherited from chart.type.

For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to 
plotOptions.histogram.
*/

public class HIHistogram extends HISeries {

/**
An integer identifying the index to use for the base series, or a string
representing the id of the series.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Object /* Number|String */ baseSeries;

/**
* description: Padding between each column or bar, in x axis units.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-default/ : 0.1 by default •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-025/ : 0.25 •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-none/ : 0 for tightly packed columns*/
	public Number pointPadding;

/**
Width of each bin. By default the bin's width is calculated as
(max - min) / number of bins. This option takes precedence over
binsNumber.
*/
	public Number binWidth;

/**
A preferable number of bins. It is a suggestion, so a histogram may have
a different number of bins. By default it is set to the square root
of the base series' data length. Available options are: square-root,
sturges, rice. You can also define a function which takes a
baseSeries as a parameter and should return a positive integer.
 <br><br><b>accepted values:</b><br><br>&ensp;["square-root", "sturges", "rice"]*/
	public Object /* String|Number|HIFunction */ binsNumber;

/**
* description: Padding between each value groups, in x axis units.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-default/ : 0.2 by default •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-none/ : No group padding - all columns are evenly spaced*/
	public Number groupPadding;

/**
* description: Whether to group non-stacked columns or to let them render independent
of each other. Non-grouped columns will be laid out individually
and overlap each other.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/ : Grouping disabled* default: true
*/
	public Boolean grouping;

/**
The corner radius of the border surrounding each column or bar.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/">Rounded columns</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderRadius;

/**
The X axis range that each point is valid for. This determines the
width of the column. On a categorized axis, the range will be 1
by default (one category unit). On linear and datetime axes, the
range will be computed as the distance between the two closest data
points.

The default null means it is computed automatically, but this option
can be used to override the automatic value.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointrange/">Set the point range to one day on a data set with one week between the points</a>*/
	public Number pointRange;

/**
The minimal height for a column or width for a bar. By default,
0 values are not shown. To visualize a 0 (or close to zero) point,
set the minimal point length to a pixel value like 3\. In stacked
column charts, minPointLength might not be respected for tightly
packed values.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/">Zero base value</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/">Positive and negative close to zero values</a>*/
	public Number minPointLength;

/**
The spacing between columns on the Z Axis in a 3D chart. Requires
highcharts-3d.js.
 <br><br><b>default:</b><br><br>&ensp;1*/
	public Number groupZPadding;

/**
A series specific or series type specific color set to apply instead
of the global colors when [colorByPoint](#plotOptions.
column.colorByPoint) is true.
*/
	public ArrayList<HIColor> colors;
	public Boolean startFromThreshold;

/**
The color of the border surrounding each column or bar.

In styled mode, the border stroke can be set with the .highcharts-point
rule.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/">Dark gray border</a> <br><br><b>default:</b><br><br>&ensp;#ffffff*/
	public HIColor borderColor;

/**
3D columns only. The color of the edges. Similar to borderColor,
 except it defaults to the same color as the column.
*/
	public HIColor edgeColor;

/**
When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/">False by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/">True</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean colorByPoint;

/**
The maximum allowed pixel width for a column, translated to the height
of a bar in a bar chart. This prevents the columns from becoming
too wide when there is a small number of points in the chart.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/">Limited to 50</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number maxPointWidth;

/**
A pixel value specifying a fixed width for each column or bar. When
null, the width is calculated from the pointPadding and
groupPadding.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointwidth-20/">20px wide columns regardless of chart width or the amount of data points</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number pointWidth;

/**
3D columns only. The width of the colored edges.
 <br><br><b>default:</b><br><br>&ensp;1*/
	public Number edgeWidth;

/**
When true, each column edge is rounded to its nearest pixel in order
to render sharp on screen. In some cases, when there are a lot of
densely packed columns, this leads to visible difference in column
widths or distance between columns. In these cases, setting crisp
to false may look better, even though each column is rendered
blurry.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-crisp-false/">Crisp is false</a>*/
	public Boolean crisp;

/**
Depth of the columns in a 3D column chart. Requires highcharts-3d.js.
 <br><br><b>default:</b><br><br>&ensp;25*/
	public Number depth;

/**
The width of the border surrounding each column or bar.

In styled mode, the stroke width can be set with the .highcharts-point
rule.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderwidth/">2px black border</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number borderWidth;


	public HIHistogram() {
		super(); 
		this.type = "histogram";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.baseSeries != null) {
			params.put("baseSeries", this.baseSeries);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.binWidth != null) {
			params.put("binWidth", this.binWidth);
		}
		if (this.binsNumber != null) {
			params.put("binsNumber", this.binsNumber);
		}
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.pointRange != null) {
			params.put("pointRange", this.pointRange);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
		}
		if (this.groupZPadding != null) {
			params.put("groupZPadding", this.groupZPadding);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.startFromThreshold != null) {
			params.put("startFromThreshold", this.startFromThreshold);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.edgeColor != null) {
			params.put("edgeColor", this.edgeColor.getData());
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.maxPointWidth != null) {
			params.put("maxPointWidth", this.maxPointWidth);
		}
		if (this.pointWidth != null) {
			params.put("pointWidth", this.pointWidth);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		if (this.crisp != null) {
			params.put("crisp", this.crisp);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		return params;
	}

}