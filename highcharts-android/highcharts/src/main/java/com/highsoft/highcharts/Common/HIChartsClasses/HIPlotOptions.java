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



public class HIPlotOptions implements HIChartsJSONSerializable { 


/**
A tilemap series is a type of heatmap where the tile shapes are configurable.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/honeycomb-usa/ : Honeycomb tilemap, USA
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-brazil/ : Honeycomb tilemap, Brazil
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-china/ : Honeycomb tilemap, China
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-europe/ : Honeycomb tilemap, Europe
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa/ : Circlemap tilemap, Africa
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap : Diamondmap tilemap
*/
	public HITilemap tilemap;

/**
A bell curve is an areaspline series which represents the probability density
function of the normal distribution. It calculates mean and standard
deviation of the base series data and plots the curve according to the
calculated parameters.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bellcurve/ : Bell curve
*/
	public HIBellcurve bellcurve;

/**
A pyramid series is a special type of funnel, without neck and reversed by
default.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pyramid/ : Pyramid chart
*/
	public HIPyramid pyramid;

/**
The column range is a cartesian series type with higher and lower
Y values along an X axis. Requires highcharts-more.js. To display
horizontal bars, set chart.inverted to true.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/columnrange/ : Inverted column range
*/
	public HIColumnrange columnrange;

/**
A bubble series is a three dimensional series type where each point renders
an X, Y and Z value. Each points is drawn as a bubble where the position
along the X and Y axes mark the X and Y values, and the size of the bubble
relates to the Z value. Requires highcharts-more.js.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bubble/ : Bubble chart
*/
	public HIBubble bubble;

/**
Error bars are a graphical representation of the variability of data and are
used on graphs to indicate the error, or uncertainty in a reported
measurement.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/error-bar/ : Error bars
*/
	public HIErrorbar errorbar;

/**
A pie chart is a circular graphic which is divided into slices to illustrate
numerical proportion.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-basic/ : Pie chart
*/
	public HIPie pie;

/**
Gauges are circular plots displaying one or more values with a dial pointing
to values along the perimeter.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/ : Gauge chart
*/
	public HIGauge gauge;

/**
A pareto diagram is a type of chart that contains both bars and a line graph,
where individual values are represented in descending order by bars, 
and the cumulative total is represented by the line.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pareto/ : Pareto diagram
*/
	public HIPareto pareto;

/**
A spline series is a special type of line series, where the segments between
the data points are smoothed.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/spline-irregular-time/ : Spline chart
*/
	public HISpline spline;

/**
The area spline series is an area series where the graph between the points
is smoothed into a spline.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/areaspline/ : Area spline chart
*/
	public HIAreaspline areaspline;

/**
A polygon series can be used to draw any freeform shape in the cartesian
coordinate system. A fill is applied with the color option, and
stroke is applied through lineWidth and lineColor options. Requires
the highcharts-more.js file.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/ : Polygon
*/
	public HIPolygon polygon;

/**
A streamgraph is a type of stacked area graph which is displaced around a
central axis, resulting in a flowing, organic shape.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph/ : Streamgraph
*/
	public HIStreamgraph streamgraph;

/**
The X-range series displays ranges on the X axis, typically time intervals
with a start and end date.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range/ : X-range
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/x-range/ : Styled mode X-range
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted-xrange/ : Inverted X-range
*/
	public HIXrange xrange;

/**
A vector plot is a type of cartesian chart where each point has an X and Y
position, a length and a direction. Vectors are drawn as arrows.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/vector-plot/ : Vector pot
*/
	public HIVector vector;

/**
General options for all series types.
*/
	public HISeries series;

/**
A Sunburst displays hierarchical data, where a level in the hierarchy is represented by a circle.
The center represents the root node of the tree.
The visualization bears a resemblance to both treemap and pie charts.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst : Sunburst chart
*/
	public HISunburst sunburst;

/**
A box plot is a convenient way of depicting groups of data through their
five-number summaries: the smallest observation (sample minimum), lower
quartile (Q1), median (Q2), upper quartile (Q3), and largest observation
(sample maximum).
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/box-plot/ : Box plot
*/
	public HIBoxplot boxplot;

/**
A 3D scatter plot uses x, y and z coordinates to display values for three
variables for a set of data.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter/ : Simple 3D scatter
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-scatter-draggable : Draggable 3d scatter
*/
	public HIScatter3d scatter3d;

/**
A heatmap is a graphical representation of data where the individual values
contained in a matrix are represented as colors.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap/ : Simple heatmap
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap-canvas/ : Heavy heatmap
*/
	public HIHeatmap heatmap;

/**
A solid gauge is a circular gauge where the value is indicated by a filled
arc, and the color of the arc may variate with the value.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/ : Solid gauges
*/
	public HISolidgauge solidgauge;

/**
Funnel charts are a type of chart often used to visualize stages in a sales 
project, where the top are the initial stages with the most clients. 
It requires that the modules/funnel.js file is loaded.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/ : Funnel demo
*/
	public HIFunnel funnel;

/**
A histogram is a column series which represents the distribution of the data
set in the base series. Histogram splits data into bins and shows their
frequencies.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/histogram/ : Histogram
*/
	public HIHistogram histogram;

/**
A waterfall chart displays sequentially introduced positive or negative
values in cumulative columns.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/ : Waterfall chart
*/
	public HIWaterfall waterfall;

/**
A bar series is a special type of column series where the columns are
horizontal.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bar-basic/ : Bar chart
*/
	public HIBar bar;

/**
A line series displays information as a series of data points connected by
straight line segments.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-basic/ : Line chart
*/
	public HILine line;

/**
Wind barbs are a convenient way to represent wind speed and direction in one
graphical form. Wind direction is given by the stem direction, and wind speed
by the number and shape of barbs.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/windbarb-series/ : Wind barb series
*/
	public HIWindbarb windbarb;

/**
A variwide chart (related to marimekko chart) is a column chart with a
variable width expressing a third dimension.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variwide/ : Variwide chart
*/
	public HIVariwide variwide;

/**
A bullet graph is a variation of a bar graph. The bullet graph features
a single measure, compares it to a target, and displays it in the context
of qualitative ranges of performance that could be set using
plotBands on yAxis.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bullet-graph/ : Bullet graph
*/
	public HIBullet bullet;

/**
Column series display one column per value along an X axis.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-basic/ : Column chart
*/
	public HIColumn column;

/**
The area series type.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/area-basic/ : Area chart
*/
	public HIArea area;

/**
A treemap displays hierarchical data using nested rectangles. The data can be
laid out in varying ways depending on options.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-large-dataset/ : Treemap
*/
	public HITreemap treemap;

/**
The area spline range is a cartesian series type with higher and
lower Y values along an X axis. The area inside the range is colored, and
the graph outlining the area is a smoothed spline. Requires
highcharts-more.js.
*/
	public HIAreasplinerange areasplinerange;

/**
A word cloud is a visualization of a set of words, where the size and
placement of a word is determined by how it is weighted.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/wordcloud : Word Cloud chart
*/
	public HIWordcloud wordcloud;

/**
The area range series is a carteseian series with higher and lower values
for each point along an X axis, where the area between the values is shaded.
Requires highcharts-more.js.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange/ : Area range chart
*/
	public HIArearange arearange;

/**
A variable pie series is a two dimensional series type, where each point
renders an Y and Z value.  Each point is drawn as a pie slice where the
size (arc) of the slice relates to the Y value and the radius of pie
slice relates to the Z value. Requires highcharts-more.js.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variable-radius-pie/ : Variable-radius pie chart
*/
	public HIVariablepie variablepie;

/**
A scatter plot uses cartesian coordinates to display values for two variables
for a set of data.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/scatter/ : Scatter plot
*/
	public HIScatter scatter;

/**
A sankey diagram is a type of flow diagram, in which the width of the 
link between two nodes is shown proportionally to the flow quantity.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sankey-diagram/ : Sankey diagram
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-inverted/ : Inverted sankey diagram
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-outgoing : Sankey diagram with outgoing links
*/
	public HISankey sankey;


	public HIPlotOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.tilemap != null) {
			params.put("tilemap", this.tilemap.getParams());
		}
		if (this.bellcurve != null) {
			params.put("bellcurve", this.bellcurve.getParams());
		}
		if (this.pyramid != null) {
			params.put("pyramid", this.pyramid.getParams());
		}
		if (this.columnrange != null) {
			params.put("columnrange", this.columnrange.getParams());
		}
		if (this.bubble != null) {
			params.put("bubble", this.bubble.getParams());
		}
		if (this.errorbar != null) {
			params.put("errorbar", this.errorbar.getParams());
		}
		if (this.pie != null) {
			params.put("pie", this.pie.getParams());
		}
		if (this.gauge != null) {
			params.put("gauge", this.gauge.getParams());
		}
		if (this.pareto != null) {
			params.put("pareto", this.pareto.getParams());
		}
		if (this.spline != null) {
			params.put("spline", this.spline.getParams());
		}
		if (this.areaspline != null) {
			params.put("areaspline", this.areaspline.getParams());
		}
		if (this.polygon != null) {
			params.put("polygon", this.polygon.getParams());
		}
		if (this.streamgraph != null) {
			params.put("streamgraph", this.streamgraph.getParams());
		}
		if (this.xrange != null) {
			params.put("xrange", this.xrange.getParams());
		}
		if (this.vector != null) {
			params.put("vector", this.vector.getParams());
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.sunburst != null) {
			params.put("sunburst", this.sunburst.getParams());
		}
		if (this.boxplot != null) {
			params.put("boxplot", this.boxplot.getParams());
		}
		if (this.scatter3d != null) {
			params.put("scatter3d", this.scatter3d.getParams());
		}
		if (this.heatmap != null) {
			params.put("heatmap", this.heatmap.getParams());
		}
		if (this.solidgauge != null) {
			params.put("solidgauge", this.solidgauge.getParams());
		}
		if (this.funnel != null) {
			params.put("funnel", this.funnel.getParams());
		}
		if (this.histogram != null) {
			params.put("histogram", this.histogram.getParams());
		}
		if (this.waterfall != null) {
			params.put("waterfall", this.waterfall.getParams());
		}
		if (this.bar != null) {
			params.put("bar", this.bar.getParams());
		}
		if (this.line != null) {
			params.put("line", this.line.getParams());
		}
		if (this.windbarb != null) {
			params.put("windbarb", this.windbarb.getParams());
		}
		if (this.variwide != null) {
			params.put("variwide", this.variwide.getParams());
		}
		if (this.bullet != null) {
			params.put("bullet", this.bullet.getParams());
		}
		if (this.column != null) {
			params.put("column", this.column.getParams());
		}
		if (this.area != null) {
			params.put("area", this.area.getParams());
		}
		if (this.treemap != null) {
			params.put("treemap", this.treemap.getParams());
		}
		if (this.areasplinerange != null) {
			params.put("areasplinerange", this.areasplinerange.getParams());
		}
		if (this.wordcloud != null) {
			params.put("wordcloud", this.wordcloud.getParams());
		}
		if (this.arearange != null) {
			params.put("arearange", this.arearange.getParams());
		}
		if (this.variablepie != null) {
			params.put("variablepie", this.variablepie.getParams());
		}
		if (this.scatter != null) {
			params.put("scatter", this.scatter.getParams());
		}
		if (this.sankey != null) {
			params.put("sankey", this.sankey.getParams());
		}
		return params;
	}

}