
package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;

public class HIOptions {

/**
* description: Highchart by default puts a credits label in the lower right corner
of the chart. This can be changed using these options.
*/
public HICredits credits;

public ArrayList<HISeries> series;

/**
* description: Options for the Boost module. The Boost module allows certain series types
to be rendered by WebGL instead of the default SVG. This allows hundreds of
thousands of data points to be rendered in milliseconds. In addition to the
WebGL rendering it saves time by skipping processing and inspection of the
data wherever possible.
In addition to the global boost option, each series has a
boostThreshold that defines when the
boost should kick in.
Requires the modules/boost.js module.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy-stock : Stock chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy-dynamic : Dynamic stock chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line : Line chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy : Line chart with hundreds of series
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/scatter : Scatter chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/area : Area chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/arearange : Arearange chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/column : Column chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/bubble : Bubble chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/heatmap : Heat map
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/treemap : Tree map
*/
public HIBoost boost;

/**
* description: The Data module provides a simplified interface for adding data to
a chart from sources like CVS, HTML tables or grid views. See also
the http://www.highcharts.com/docs/working-
with-data/data-module : tutorial article on the Data module.
It requires the modules/data.js file to be loaded.
Please note that the default way of adding data in Highcharts, without
the need of a module, is through the series.data
option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/ : HTML table
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/csv/ : CSV
*/
public HIData data;

/**
* description: Styled mode only. Configuration object for adding SVG definitions for
reusable elements. See http://www.
highcharts.com/docs/chart-design-and-style/gradients-shadows-and-
patterns : gradients, shadows and patterns for more information and code examples.
*/
public HIDefs defs;

/**
* description: The Y axis or value axis. Normally this is the vertical axis,
though if the chart is inverted this is the horizontal axis.
In case of multiple axes, the yAxis node is an array of
configuration objects.
See the Axis object for programmatic access to the axis.
*/
public ArrayList<HIYAxis> yAxis;

/**
* description: The legend is a box containing a symbol and name for each series
item or point item in the chart. Each series (or points in case
of pie charts) is represented by a symbol and its name in the legend.
It is possible to override the symbol creator function and
create http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-
custom-symbol/ : custom legend symbols.
*/
public HILegend legend;

/**
* description: The pane serves as a container for axes and backgrounds for circular 
gauges and polar charts.
*/
public HIPane pane;

/**
* description: The chart's main title.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/title/ : Title options demonstrated
*/
public HITitle title;

/**
* description: Options for configuring accessibility for the chart. Requires the
//code.highcharts.com/modules/accessibility.
js : accessibility module to be loaded. For a description of the module and information
on its features, see http://www.highcharts.
com/docs/chart-concepts/accessibility : Highcharts Accessibility.
*/
public HIAccessibility accessibility;

/**
* description: Options for displaying a message like "No data to display". 
This feature requires the file no-data-to-display.js to be loaded in the page. 
The actual text to display is set in the lang.noData option.
*/
public HINoData noData;

/**
* description: The plotOptions is a wrapper object for config objects for each series
type. The config objects for each series can also be overridden for
each series item as given in the series array.
Configuration options for the series are given in three levels. Options
for all series in a chart are given in the plotOptions.series object. Then options for all series of a specific type are
given in the plotOptions of that type, for example plotOptions.line.
Next, options for one single series are given in the series array.
*/
public HIPlotOptions plotOptions;

/**
* description: The chart's subtitle. This can be used both to display a subtitle below
the main title, and to display random text anywhere in the chart. The
subtitle can be updated after chart initialization through the 
Chart.setTitle method.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/subtitle/ : Subtitle options demonstrated
*/
public HISubtitle subtitle;

/**
* description: Options for the tooltip that appears when the user hovers over a
series or point.
*/
public HITooltip tooltip;

/**
* description: Allows setting a set of rules to apply for different screen or chart
sizes. Each rule specifies additional chart options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/responsive/ : Stock chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/ : Axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/ : Legend
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/ : Class name
*/
public HIResponsive responsive;

/**
* description: The X axis or category axis. Normally this is the horizontal axis,
though if the chart is inverted this is the vertical axis. In case of
multiple axes, the xAxis node is an array of configuration objects.
See the Axis object for programmatic access to the axis.
*/
public ArrayList<HIXAxis> xAxis;

/**
* description: Options regarding the chart area and plot area as well as general
chart options.
*/
public HIChart chart;

/**
* description: Options for configuring annotations, for example labels, arrows or 
shapes. Annotations can be tied to points, axis coordinates or chart
pixel coordinates.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/basic/ : Basic annotations
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/annotations/fibonacci-retracements : Custom annotation, Fibonacci retracement
*/
public ArrayList<HIAnnotations> annotations;

/**
* description: The Z axis or depth axis for 3D plots.
See the Axis object for programmatic access to the axis.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-categories/ : Z-Axis with Categories
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-grid/ : Z-Axis with styling
*/
public HIZAxis zAxis;

/**
* description: HTML labels that can be positioned anywhere in the chart area.
*/
public HILabels labels;

/**
* description: An array containing the default colors for the chart's series. When
all colors are used, new colors are pulled from the start again.
Default colors can also be set on a series or series.type basis,
see column.colors, pie.colors.
In styled mode, the colors option doesn't exist. Instead, colors
are defined in CSS and applied either through series or point class
names, or through the chart.colorCount option.
Legacy
In Highcharts 3.x, the default colors were:
colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', 
    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']
In Highcharts 2.x, the default colors were:
colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', 
   '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']
* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/colors/ : Assign a global color theme
* default: ["#7cb5ec", "#434348", "#90ed7d", "#f7a35c", "#8085e9",
         "#f15c80", "#e4d354", "#2b908f", "#f45b5b", "#91e8e1"]
*/
public ArrayList<HIColor> colors;

/**
* description: A collection of options for buttons and menus appearing in the exporting module.
*/
public HINavigation navigation;

/**
* description: The loading options control the appearance of the loading screen
that covers the plot area on chart operations. This screen only
appears after an explicit call to chart.showLoading(). It is a
utility for developers to communicate to the end user that something
is going on, for example while retrieving new data via an XHR connection.
The "Loading..." text itself is not part of this configuration
object, but part of the lang object.
*/
public HILoading loading;

/**
* description: A color axis for choropleth maps and heat maps. Visually, the color axis
will appear as a gradient or as separate items inside the legend,
depending on whether the axis is scalar or based on data classes.
For supported color formats, see the 
http://www.highcharts.com/docs/chart-design-and-style/colors : docs article about colors.
A scalar color axis is represented by a gradient. The colors either range
between the minColor and the maxColor,
or for more fine grained control the colors can be
defined in stops. Often times, the color axis needs
to be adjusted to get the right color spread for the data. In addition to
stops, consider using a logarithmic axis type, or
setting min and max to avoid the
colors being determined by outliers.
When dataClasses are used, the ranges are
subdivided into separate classes like categories based on their values.
This can be used for ranges between two values, but also for a true
category. However, when your data is categorized, it may be as convenient
to add each category to a separate series.
See the Axis object for programmatic access to the axis.
*/
public HIColorAxis colorAxis;

/**
* description: Options for drill down, the concept of inspecting increasingly high 
resolution data through clicking on chart items like columns or pie slices.
The drilldown feature requires the drilldown.js file to be loaded, 
found in the modules directory of the download package, or online at 
(code.highcharts.com/modules/drilldown.js)[code.highcharts.com/modules/drilldown.js].
*/
public HIDrilldown drilldown;

/**
* description: Options for the exporting module. For an overview on the matter, see http://www.highcharts.com/docs/export-module/export-module-overview : the docs.
*/
public HIExporting exporting;

/**
* Additional options that are not listed above but are accepted by API
*/
public Map<String, Object> additionalOptions;

public Map<String, Object> getParams() {

	Map<String, Object> params = new HashMap<>();
		if (this.credits != null) {
			params.put("credits", this.credits.getParams());
		}
		if (this.series != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.series) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
				array.add(obj);
				}
			}
			params.put("series", array);
		}
		if (this.boost != null) {
			params.put("boost", this.boost.getParams());
		}
		if (this.data != null) {
			params.put("data", this.data.getParams());
		}
		if (this.defs != null) {
			params.put("defs", this.defs.getParams());
		}
		if (this.yAxis != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.yAxis) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
				array.add(obj);
				}
			}
			params.put("yAxis", array);
		}
		if (this.legend != null) {
			params.put("legend", this.legend.getParams());
		}
		if (this.pane != null) {
			params.put("pane", this.pane.getParams());
		}
		if (this.title != null) {
			params.put("title", this.title.getParams());
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.noData != null) {
			params.put("noData", this.noData.getParams());
		}
		if (this.plotOptions != null) {
			params.put("plotOptions", this.plotOptions.getParams());
		}
		if (this.subtitle != null) {
			params.put("subtitle", this.subtitle.getParams());
		}
		if (this.tooltip != null) {
			params.put("tooltip", this.tooltip.getParams());
		}
		if (this.responsive != null) {
			params.put("responsive", this.responsive.getParams());
		}
		if (this.xAxis != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.xAxis) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
				array.add(obj);
				}
			}
			params.put("xAxis", array);
		}
		if (this.chart != null) {
			params.put("chart", this.chart.getParams());
		}
		if (this.annotations != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.annotations) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
				array.add(obj);
				}
			}
			params.put("annotations", array);
		}
		if (this.zAxis != null) {
			params.put("zAxis", this.zAxis.getParams());
		}
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add(hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.navigation != null) {
			params.put("navigation", this.navigation.getParams());
		}
		if (this.loading != null) {
			params.put("loading", this.loading.getParams());
		}
		if (this.colorAxis != null) {
			params.put("colorAxis", this.colorAxis.getParams());
		}
		if (this.drilldown != null) {
			params.put("drilldown", this.drilldown.getParams());
		}
		if (this.exporting != null) {
			params.put("exporting", this.exporting.getParams());
		}
		if (this.additionalOptions != null) {
			params.putAll(additionalOptions);
		}

		return params;
		
}
}