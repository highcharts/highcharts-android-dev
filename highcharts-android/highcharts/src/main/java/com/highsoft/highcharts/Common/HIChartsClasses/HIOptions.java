
package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;

public class HIOptions extends Observable {



	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};

	private HISubtitle subtitle;

/**
The chart's subtitle. This can be used both to display a subtitle below
the main title, and to display random text anywhere in the chart. The
subtitle can be updated after chart initialization through the
Chart.setTitle method.
*/
	public void setSubtitle(HISubtitle subtitle) {
		this.subtitle = subtitle;
		this.subtitle.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISubtitle getSubtitle(){ return subtitle; }

	private ArrayList<HIYAxis> yAxis;

/**
The Y axis or value axis. Normally this is the vertical axis,
though if the chart is inverted this is the horizontal axis.
In case of multiple axes, the yAxis node is an array of
configuration objects.

See the Axis object for programmatic access to the axis.
*/
	public void setYAxis(ArrayList<HIYAxis> yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIYAxis> getYAxis(){ return yAxis; }

	private ArrayList<HISeries> series;

	public void setSeries(ArrayList<HISeries> series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HISeries> getSeries(){ return series; }

	private HIAccessibility accessibility;

/**
Options for configuring accessibility for the chart. Requires the
[accessibility module](//code.highcharts.com/modules/accessibility.
js) to be loaded. For a description of the module and information
on its features, see [Highcharts Accessibility](http://www.highcharts.
com/docs/chart-concepts/accessibility).
*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private ArrayList<HIColor> colors;

/**
An array containing the default colors for the chart's series. When
all colors are used, new colors are pulled from the start again.

Default colors can also be set on a series or series.type basis,
see column.colors,
pie.colors.

In styled mode, the colors option doesn't exist. Instead, colors
are defined in CSS and applied either through series or point class
names, or through the chart.colorCount option.


### Legacy

In Highcharts 3.x, the default colors were:

colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce',
    '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a']

In Highcharts 2.x, the default colors were:

colors: ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE',
   '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92']
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/colors/">Assign a global color theme</a> <br><br><b>default:</b><br><br>&ensp;["#7cb5ec", "#434348", "#90ed7d", "#f7a35c", "#8085e9",
         "#f15c80", "#e4d354", "#2b908f", "#f45b5b", "#91e8e1"]*/
	public void setColors(ArrayList<HIColor> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIColor> getColors(){ return colors; }

	private HIPane pane;

/**
The pane serves as a container for axes and backgrounds for circular
gauges and polar charts.
*/
	public void setPane(HIPane pane) {
		this.pane = pane;
		this.pane.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPane getPane(){ return pane; }

	private HIResponsive responsive;

/**
Allows setting a set of rules to apply for different screen or chart
sizes. Each rule specifies additional chart options.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/">Legend</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/">Class name</a>*/
	public void setResponsive(HIResponsive responsive) {
		this.responsive = responsive;
		this.responsive.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIResponsive getResponsive(){ return responsive; }

	private HINoData noData;

/**
Options for displaying a message like "No data to display".
This feature requires the file no-data-to-display.js to be loaded in the
page. The actual text to display is set in the lang.noData option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Line chart with no-data module</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-pie">Pie chart with no-data module</a>*/
	public void setNoData(HINoData noData) {
		this.noData = noData;
		this.noData.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINoData getNoData(){ return noData; }

	private HILoading loading;

/**
The loading options control the appearance of the loading screen
that covers the plot area on chart operations. This screen only
appears after an explicit call to chart.showLoading(). It is a
utility for developers to communicate to the end user that something
is going on, for example while retrieving new data via an XHR connection.
The "Loading..." text itself is not part of this configuration
object, but part of the lang object.
*/
	public void setLoading(HILoading loading) {
		this.loading = loading;
		this.loading.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILoading getLoading(){ return loading; }

	private HITitle title;

/**
The chart's main title.
*/
	public void setTitle(HITitle title) {
		this.title = title;
		this.title.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITitle getTitle(){ return title; }

	private HITooltip tooltip;

/**
Options for the tooltip that appears when the user hovers over a
series or point.
*/
	public void setTooltip(HITooltip tooltip) {
		this.tooltip = tooltip;
		this.tooltip.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITooltip getTooltip(){ return tooltip; }

	private HIPlotOptions plotOptions;

/**
The plotOptions is a wrapper object for config objects for each series
type. The config objects for each series can also be overridden for
each series item as given in the series array.

Configuration options for the series are given in three levels. Options
for all series in a chart are given in the [plotOptions.series](
#plotOptions.series) object. Then options for all series of a specific
type are given in the plotOptions of that type, for example
plotOptions.line. Next, options for one single series are given in
the series array.
*/
	public void setPlotOptions(HIPlotOptions plotOptions) {
		this.plotOptions = plotOptions;
		this.plotOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPlotOptions getPlotOptions(){ return plotOptions; }

	private HIExporting exporting;

/**
Options for the exporting module. For an overview on the matter, see
[the docs](http://www.highcharts.com/docs/export-module/export-module-overview).
*/
	public void setExporting(HIExporting exporting) {
		this.exporting = exporting;
		this.exporting.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIExporting getExporting(){ return exporting; }

	private HIBoost boost;

/**
Options for the Boost module. The Boost module allows certain series types
to be rendered by WebGL instead of the default SVG. This allows hundreds of
thousands of data points to be rendered in milliseconds. In addition to the
WebGL rendering it saves time by skipping processing and inspection of the
data wherever possible. This introduces some limitations to what features are
available in Boost mode. See [the docs](
https://www.highcharts.com/docs/advanced-chart-features/boost-module) for
details.

In addition to the global boost option, each series has a
boostThreshold that defines when the
boost should kick in.

Requires the modules/boost.js module.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line">Line chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy">Line chart with hundreds of series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/scatter">Scatter chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/area">Area chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/arearange">Area range chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/column">Column chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/columnrange">Column range chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/bubble">Bubble chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/heatmap">Heat map</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/treemap">Tree map</a>*/
	public void setBoost(HIBoost boost) {
		this.boost = boost;
		this.boost.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBoost getBoost(){ return boost; }

	private ArrayList<HIAnnotations> annotations;

/**
Options for configuring annotations, for example labels, arrows or
shapes. Annotations can be tied to points, axis coordinates or chart
pixel coordinates.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/basic/">Basic annotations</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/annotations/">Advanced annotations</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations">Styled mode</a>*/
	public void setAnnotations(ArrayList<HIAnnotations> annotations) {
		this.annotations = annotations;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIAnnotations> getAnnotations(){ return annotations; }

	private Object defs;

/**
Styled mode only. Configuration object for adding SVG definitions for
reusable elements. See [gradients, shadows and patterns](http://www.
highcharts.com/docs/chart-design-and-style/gradients-shadows-and-
patterns) for more information and code examples.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations-markers/">Define markers in a styled mode</a>*/
	public void setDefs(Object defs) {
		this.defs = defs;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDefs(){ return defs; }

	private HILabels labels;

/**
HTML labels that can be positioned anywhere in the chart area.
*/
	public void setLabels(HILabels labels) {
		this.labels = labels;
		this.labels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabels getLabels(){ return labels; }

	private HIChart chart;

	public void setChart(HIChart chart) {
		this.chart = chart;
		this.chart.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIChart getChart(){ return chart; }

	private HICredits credits;

/**
Highchart by default puts a credits label in the lower right corner
of the chart. This can be changed using these options.
*/
	public void setCredits(HICredits credits) {
		this.credits = credits;
		this.credits.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICredits getCredits(){ return credits; }

	private ArrayList<HIZAxis> zAxis;

/**
The Z axis or depth axis for 3D plots.

See the Axis object for programmatic access to the axis.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-categories/">Z-Axis with Categories</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-zaxis-grid/">Z-Axis with styling</a>*/
	public void setZAxis(ArrayList<HIZAxis> zAxis) {
		this.zAxis = zAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIZAxis> getZAxis(){ return zAxis; }

	private ArrayList<HIXAxis> xAxis;

/**
The X axis or category axis. Normally this is the horizontal axis,
though if the chart is inverted this is the vertical axis. In case of
multiple axes, the xAxis node is an array of configuration objects.

See the Axis object for programmatic access to the axis.
*/
	public void setXAxis(ArrayList<HIXAxis> xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIXAxis> getXAxis(){ return xAxis; }

	private HIDrilldown drilldown;

/**
Options for drill down, the concept of inspecting increasingly high
resolution data through clicking on chart items like columns or pie slices.

The drilldown feature requires the drilldown.js file to be loaded,
found in the modules directory of the download package, or online at
(code.highcharts.com/modules/drilldown.js)[code.highcharts.com/modules/
drilldown.js].
*/
	public void setDrilldown(HIDrilldown drilldown) {
		this.drilldown = drilldown;
		this.drilldown.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDrilldown getDrilldown(){ return drilldown; }

	private HIData data;

/**
The Data module provides a simplified interface for adding data to
a chart from sources like CVS, HTML tables or grid views. See also
the [tutorial article on the Data module](http://www.highcharts.com/docs/working-
with-data/data-module).

It requires the modules/data.js file to be loaded.

Please note that the default way of adding data in Highcharts, without
the need of a module, is through the series.data
option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/">HTML table</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/csv/">CSV</a>*/
	public void setData(HIData data) {
		this.data = data;
		this.data.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIData getData(){ return data; }

	private HILegend legend;

/**
The legend is a box containing a symbol and name for each series
item or point item in the chart. Each series (or points in case
of pie charts) is represented by a symbol and its name in the legend.

It is possible to override the symbol creator function and
create [custom legend symbols](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-
custom-symbol/).
*/
	public void setLegend(HILegend legend) {
		this.legend = legend;
		this.legend.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILegend getLegend(){ return legend; }

	private HIColorAxis colorAxis;

/**
A color axis for choropleth maps and heat maps. Visually, the color
axis will appear as a gradient or as separate items inside the
legend, depending on whether the axis is scalar or based on data
classes.

For supported color formats, see the
[docs article about colors](http://www.highcharts.com/docs/chart-design-and-style/colors).

A scalar color axis is represented by a gradient. The colors either
range between the minColor and the
maxColor, or for more fine grained control the
colors can be defined in stops. Often times, the
color axis needs to be adjusted to get the right color spread for the
data. In addition to stops, consider using a logarithmic
axis type, or setting min and
max to avoid the colors being determined by
outliers.

When dataClasses are used, the ranges are
subdivided into separate classes like categories based on their
values. This can be used for ranges between two values, but also for
a true category. However, when your data is categorized, it may be as
convenient to add each category to a separate series.

See the Axis object for programmatic access to the axis.
*/
	public void setColorAxis(HIColorAxis colorAxis) {
		this.colorAxis = colorAxis;
		this.colorAxis.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIColorAxis getColorAxis(){ return colorAxis; }

	private HITime time;

/**
Time options that can apply globally or to individual charts. These
settings affect how datetime axes are laid out, how tooltips are
formatted, how series
pointIntervalUnit works and how
the Highstock range selector handles time.

The common use case is that all charts in the same Highcharts object
share the same time settings, in which case the global settings are set
using setOptions.

`js
// Apply time settings globally
Highcharts.setOptions({
    time: {
        timezone: 'Europe/London'
    }
});
// Apply time settings by instance
var chart = Highcharts.chart('container', {
    time: {
        timezone: 'America/New_York'
    },
    series: [{
        data: [1, 4, 3, 5]
    }]
});

// Use the Time object
console.log(
       'Current time in New York',
       chart.time.dateFormat('%Y-%m-%d %H:%M:%S', Date.now())
);
Since v6.0.5, the time options were moved from theglobalobect to thetime` object, and time options can be set on each individual chart.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/timezone/">Set the timezone globally</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/time/individual/">Set the timezone per chart instance</a>*/
	public void setTime(HITime time) {
		this.time = time;
		this.time.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITime getTime(){ return time; }

	private HINavigation navigation;

/**
A collection of options for buttons and menus appearing in the exporting
module.
*/
	public void setNavigation(HINavigation navigation) {
		this.navigation = navigation;
		this.navigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigation getNavigation(){ return navigation; }

/**
* Additional options that are not listed above but are accepted by API
*/
public Map<String, Object> additionalOptions;

public Map<String, Object> getParams() {

	Map<String, Object> params = new HashMap<>();
		if (this.subtitle != null) {
			params.put("subtitle", this.subtitle.getParams());
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
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add(hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.pane != null) {
			params.put("pane", this.pane.getParams());
		}
		if (this.responsive != null) {
			params.put("responsive", this.responsive.getParams());
		}
		if (this.noData != null) {
			params.put("noData", this.noData.getParams());
		}
		if (this.loading != null) {
			params.put("loading", this.loading.getParams());
		}
		if (this.title != null) {
			params.put("title", this.title.getParams());
		}
		if (this.tooltip != null) {
			params.put("tooltip", this.tooltip.getParams());
		}
		if (this.plotOptions != null) {
			params.put("plotOptions", this.plotOptions.getParams());
		}
		if (this.exporting != null) {
			params.put("exporting", this.exporting.getParams());
		}
		if (this.boost != null) {
			params.put("boost", this.boost.getParams());
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
		if (this.defs != null) {
			params.put("defs", this.defs);
		}
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
		}
		if (this.chart != null) {
			params.put("chart", this.chart.getParams());
		}
		if (this.credits != null) {
			params.put("credits", this.credits.getParams());
		}
		if (this.zAxis != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.zAxis) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("zAxis", array);
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
		if (this.drilldown != null) {
			params.put("drilldown", this.drilldown.getParams());
		}
		if (this.data != null) {
			params.put("data", this.data.getParams());
		}
		if (this.legend != null) {
			params.put("legend", this.legend.getParams());
		}
		if (this.colorAxis != null) {
			params.put("colorAxis", this.colorAxis.getParams());
		}
		if (this.time != null) {
			params.put("time", this.time.getParams());
		}
		if (this.navigation != null) {
			params.put("navigation", this.navigation.getParams());
		}
		if (this.additionalOptions != null) {
			params.putAll(additionalOptions);
		}

		return params;
		
}
}