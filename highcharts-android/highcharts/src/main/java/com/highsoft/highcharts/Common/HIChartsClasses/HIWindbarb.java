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
* description: A windbarb series. If the type option is not
specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
windbarb.
*/

public class HIWindbarb extends HISeries {

/**
* description: Whether to group non-stacked columns or to let them render independent
of each other. Non-grouped columns will be laid out individually
and overlap each other.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/ : Grouping disabled
* default: true
*/
	public Boolean grouping;

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
* description: A pixel value specifying a fixed width for each column or bar. When
null, the width is calculated from the pointPadding and
groupPadding.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointwidth-20/ : 20px wide columns regardless of chart width or the amount of data points
* default: null
*/
	public Number pointWidth;

/**
* description: A series specific or series type specific color set to apply instead
of the global colors when colorByPoint is true.
*/
	public ArrayList<HIColor> colors;

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
* description: The corner radius of the border surrounding each column or bar.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/ : Rounded columns
* default: 0
*/
	public Number borderRadius;

/**
* description: The maximum allowed pixel width for a column, translated to the height
of a bar in a bar chart. This prevents the columns from becoming
too wide when there is a small number of points in the chart.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/ : Limited to 50
* default: null
*/
	public Number maxPointWidth;

/**
* description: 3D columns only. The width of the colored edges.
* default: 1
*/
	public Number edgeWidth;

/**
* description: Vertical offset from the cartesian position, in pixels. The default value
makes sure the symbols don't overlap the X axis when onSeries is
null, and that they don't overlap the linked series when onSeries is
given.
* default: -20
*/
	public Number yOffset;

/**
* description: Padding between each value groups, in x axis units.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-default/ : 0.2 by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-none/ : No group padding - all columns are evenly spaced
* default: 0.2
*/
	public Number groupPadding;

/**
* description: Pixel length of the stems.
* default: 20
*/
	public Number vectorLength;

/**
* description: The spacing between columns on the Z Axis in a 3D chart. Requires
highcharts-3d.js.
* default: 1
*/
	public Number groupZPadding;

/**
* description: 3D columns only. The color of the edges. Similar to borderColor,
 except it defaults to the same color as the column.
*/
	public HIColor edgeColor;

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
* description: The color of the border surrounding each column or bar.
In styled mode, the border stroke can be set with the .highcharts-point
rule.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/ : Dark gray border
* default: #ffffff
*/
	public HIColor borderColor;

/**
* description: Depth of the columns in a 3D column chart. Requires highcharts-3d.
js.
* default: 25
*/
	public Number depth;

/**
* description: The id of another series in the chart that the wind barbs are projected
on. When null, the wind symbols are drawn on the X axis, but offset
up or down by the yOffset setting.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/windbarb-onseries : Projected on area series
*/
	public String onSeries;

/**
* description: Padding between each column or bar, in x axis units.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-default/ : 0.1 by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-025/ : 0.25
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-none/ : 0 for tightly packed columns
* default: 0.1
*/
	public Number pointPadding;


	public HIWindbarb() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		if (this.pointRange != null) {
			params.put("pointRange", this.pointRange);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
		}
		if (this.pointWidth != null) {
			params.put("pointWidth", this.pointWidth);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.maxPointWidth != null) {
			params.put("maxPointWidth", this.maxPointWidth);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		if (this.yOffset != null) {
			params.put("yOffset", this.yOffset);
		}
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.vectorLength != null) {
			params.put("vectorLength", this.vectorLength);
		}
		if (this.groupZPadding != null) {
			params.put("groupZPadding", this.groupZPadding);
		}
		if (this.edgeColor != null) {
			params.put("edgeColor", this.edgeColor.getData());
		}
		if (this.crisp != null) {
			params.put("crisp", this.crisp);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.onSeries != null) {
			params.put("onSeries", this.onSeries);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		return params;
	}

}