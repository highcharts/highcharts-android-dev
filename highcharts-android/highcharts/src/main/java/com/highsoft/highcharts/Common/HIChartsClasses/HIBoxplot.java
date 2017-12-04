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
* description: A boxplot series. If the type option is
not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
boxplot.
*/

public class HIBoxplot extends HISeries {

/**
* description: The dash style of the stem, the vertical line extending from the
box to the whiskers.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/ : Box plot in styled mode
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/ : Error bar styling
* accepted values: ["Solid", "ShortDash", "ShortDot", "ShortDashDot",
        "ShortDashDotDot", "Dot", "Dash" ,"LongDash", "DashDot",
        "LongDashDot", "LongDashDotDot"]
* default: Solid
*/
	public String stemDashStyle;

/**
* description: The minimal height for a column or width for a bar. By default,
0 values are not shown. To visualize a 0 (or close to zero) point,
set the minimal point length to a pixel value like 3. In stacked
column charts, minPointLength might not be respected for tightly
packed values.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/ : Zero base value
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/ : Positive and negative close to zero values
* default: 0
*/
	public Number minPointLength;

/**
* description: The color of the border surrounding each column or bar.
In styled mode, the border stroke can be set with the .highcharts-point
rule.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/ : Dark gray border
* default: #ffffff
*/
	public HIColor borderColor;

/**
* description: The corner radius of the border surrounding each column or bar.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/ : Rounded columns
* default: 0
*/
	public Number borderRadius;

/**
* description: When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/ : False by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/ : True
* default: false
*/
	public Boolean colorByPoint;

/**
* description: The color of the stem, the vertical line extending from the box to
the whiskers. If null, the series color is used.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/ : Box plot in styled mode
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/ : Error bar styling
* default: null
*/
	public HIColor stemColor;

/**
* description: Depth of the columns in a 3D column chart. Requires highcharts-3d.
js.
* default: 25
*/
	public Number depth;

/**
* description: The width of the stem, the vertical line extending from the box to
the whiskers. If null, the width is inherited from the lineWidth option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/ : Box plot in styled mode
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/ : Error bar styling
* default: null
*/
	public Number stemWidth;

/**
* description: A pixel value specifying a fixed width for each column or bar. When
null, the width is calculated from the pointPadding and
groupPadding.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointwidth-20/ : 20px wide columns regardless of chart width or the amount of data points
* default: null
*/
	public Number pointWidth;

/**
* description: When true, each column edge is rounded to its nearest pixel in order
to render sharp on screen. In some cases, when there are a lot of
densely packed columns, this leads to visible difference in column
widths or distance between columns. In these cases, setting crisp
to false may look better, even though each column is rendered
blurry.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-crisp-false/ : Crisp is false
* default: true
*/
	public Boolean crisp;

/**
* description: The color of the median line. If null, the general series color
applies.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/ : Box plot in styled mode
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/ : Error bar styling
* default: null
*/
	public HIColor medianColor;

/**
* description: The maximum allowed pixel width for a column, translated to the height
of a bar in a bar chart. This prevents the columns from becoming
too wide when there is a small number of points in the chart.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/ : Limited to 50
* default: null
*/
	public Number maxPointWidth;

/**
* description: The length of the whiskers, the horizontal lines marking low and
high values. It can be a numerical pixel value, or a percentage
value of the box width. Set 0 to disable whiskers.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : True by default
* default: 50%
*/
	public Object /* String, Double */ whiskerLength;

/**
* description: Padding between each value groups, in x axis units.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-default/ : 0.2 by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-none/ : No group padding - all columns are evenly spaced
* default: 0.2
*/
	public Number groupPadding;

/**
* description: The spacing between columns on the Z Axis in a 3D chart. Requires
highcharts-3d.js.
* default: 1
*/
	public Number groupZPadding;

/**
* description: The fill color of the box.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
* default: #ffffff
*/
	public HIColor fillColor;

/**
* description: The color of the whiskers, the horizontal lines marking low and high
values. When null, the general series color is used.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/ : Box plot in styled mode
* default: null
*/
	public HIColor whiskerColor;

/**
* description: The line width of the whiskers, the horizontal lines marking low
and high values. When null, the general lineWidth applies.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/ : Box plot in styled mode
* default: 2
*/
	public Number whiskerWidth;

/**
* description: A series specific or series type specific color set to apply instead
of the global colors when colorByPoint is true.
*/
	public ArrayList<HIColor> colors;

/**
* description: 3D columns only. The color of the edges. Similar to borderColor,
 except it defaults to the same color as the column.
*/
	public HIColor edgeColor;

/**
* description: Whether to group non-stacked columns or to let them render independent
of each other. Non-grouped columns will be laid out individually
and overlap each other.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/ : Grouping disabled
* default: true
*/
	public Boolean grouping;

/**
* description: Padding between each column or bar, in x axis units.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-default/ : 0.1 by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-025/ : 0.25
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-none/ : 0 for tightly packed columns
* default: 0.1
*/
	public Number pointPadding;

/**
* description: The pixel width of the median line. If null, the lineWidth is used.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/ : Box plot styling
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/ : Box plot in styled mode
* default: 2
*/
	public Number medianWidth;

/**
* description: The X axis range that each point is valid for. This determines the
width of the column. On a categorized axis, the range will be 1
by default (one category unit). On linear and datetime axes, the
range will be computed as the distance between the two closest data
points.
The default null means it is computed automatically, but this option
can be used to override the automatic value.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointrange/ : Set the point range to one day on a data set with one week between the points
* default: null
*/
	public Number pointRange;

/**
* description: 3D columns only. The width of the colored edges.
* default: 1
*/
	public Number edgeWidth;


	public HIBoxplot() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.stemDashStyle != null) {
			params.put("stemDashStyle", this.stemDashStyle);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.stemColor != null) {
			params.put("stemColor", this.stemColor.getData());
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.stemWidth != null) {
			params.put("stemWidth", this.stemWidth);
		}
		if (this.pointWidth != null) {
			params.put("pointWidth", this.pointWidth);
		}
		if (this.crisp != null) {
			params.put("crisp", this.crisp);
		}
		if (this.medianColor != null) {
			params.put("medianColor", this.medianColor.getData());
		}
		if (this.maxPointWidth != null) {
			params.put("maxPointWidth", this.maxPointWidth);
		}
		if (this.whiskerLength != null) {
			params.put("whiskerLength", this.whiskerLength);
		}
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.groupZPadding != null) {
			params.put("groupZPadding", this.groupZPadding);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.whiskerColor != null) {
			params.put("whiskerColor", this.whiskerColor.getData());
		}
		if (this.whiskerWidth != null) {
			params.put("whiskerWidth", this.whiskerWidth);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.edgeColor != null) {
			params.put("edgeColor", this.edgeColor.getData());
		}
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.medianWidth != null) {
			params.put("medianWidth", this.medianWidth);
		}
		if (this.pointRange != null) {
			params.put("pointRange", this.pointRange);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		return params;
	}

}