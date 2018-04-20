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



public class HITooltip implements HIChartsJSONSerializable { 


/**
Whether the tooltip should follow the finger as it moves on a touch
device. If this is true and chart.panning is
set,followTouchMove will take over one-finger touches, so the user
needs to use two fingers for zooming and panning.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean followTouchMove;

/**
The radius of the rounded border corners.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">5px by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderradius-0/">Square borders</a> <br><br><b>default:</b><br><br>&ensp;3*/
	public Number borderRadius;

/**
The HTML of the tooltip header line. Variables are enclosed by
curly brackets. Available variables are point.key, series.name,
series.color and other members from the point and series
objects. The point.key variable contains the category name, x
value or datetime string depending on the type of axis. For datetime
axes, the point.key date format can be set using tooltip.xDateFormat.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A HTML table in the tooltip</a>*/
	public String headerFormat;

/**
A string to append to each series' y value. Overridable in each series'
tooltip options object.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>*/
	public String valueSuffix;

/**
A string to prepend to each series' y value. Overridable in each
series' tooltip options object.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>*/
	public String valuePrefix;

/**
For series on a datetime axes, the date format in the tooltip's
header will by default be guessed based on the closest data points.
This member gives the default string representations used for
each unit. For an overview of the replacement codes, see
dateFormat.

Defaults to:

{
    millisecond:"%A, %b %e, %H:%M:%S.%L",
    second:"%A, %b %e, %H:%M:%S",
    minute:"%A, %b %e, %H:%M",
    hour:"%A, %b %e, %H:%M",
    day:"%A, %b %e, %Y",
    week:"Week from %A, %b %e, %Y",
    month:"%B %Y",
    year:"%Y"
}
*/
	public HIDateTimeLabelFormats dateTimeLabelFormats;

/**
The name of a symbol to use for the border around the tooltip.
 <br><br><b>accepted values:</b><br><br>&ensp;["callout", "square"] <br><br><b>default:</b><br><br>&ensp;callout*/
	public String shape;

/**
A callback function to place the tooltip in a default position. The
callback receives three parameters: labelWidth, labelHeight and
point, where point contains values for plotX and plotY telling
where the reference point is in the plot area. Add chart.plotLeft
and chart.plotTop to get the full coordinates.

The return should be an object containing x and y values, for example
{ x: 100, y: 100 }.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/positioner/">A fixed tooltip position</a>*/
	public HIFunction positioner;

/**
Use HTML to render the contents of the tooltip instead of SVG. Using
HTML allows advanced formatting like tables and images in the tooltip.
It is also recommended for rtl languages as it works around rtl
bugs in early Firefox.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/fullhtml/">Full HTML tooltip</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean useHTML;

/**
The color of the tooltip border. When null, the border takes the
color of the corresponding series or point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">Follow series by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-black/">Black border</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor borderColor;

/**
CSS styles for the tooltip. The tooltip can also be styled through
the CSS class .highcharts-tooltip.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/style/">Greater padding, bold text</a> <br><br><b>default:</b><br><br>&ensp;{ "color": "#333333", "cursor": "default", "fontSize": "12px", "pointerEvents": "none", "whiteSpace": "nowrap" }*/
	public HIStyle style;

/**
A string to append to the tooltip format.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a>*/
	public String footerFormat;

/**
Enable or disable animation of the tooltip. In slow legacy IE browsers
the animation is disabled by default.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean animation;

/**
Split the tooltip into one label per series, with the header close
to the axis. This is recommended over shared tooltips
for charts with multiple line series, generally making them easier
to read. This option takes precedence over tooltip.shared.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/">Split tooltip</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean split;

/**
The background color or gradient for the tooltip.

In styled mode, the stroke width is set in the .highcharts-tooltip-box class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-solid/">Yellowish background</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-gradient/">Gradient</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a> <br><br><b>default:</b><br><br>&ensp;rgba(247,247,247,0.85)*/
	public HIColor backgroundColor;

/**
Proximity snap for graphs or single points. It defaults to 10 for
mouse-powered devices and 25 for touch devices.

Note that in most cases the whole plot area captures the mouse
movement, and in these cases tooltip.snap doesn't make sense.
This applies when stickyTracking
is true (default) and when the tooltip is shared
or split.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">10 px by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/snap-50/">50 px on graph</a> <br><br><b>default:</b><br><br>&ensp;10/25*/
	public Number snap;

/**
When the tooltip is shared, the entire plot area will capture mouse
movement or touch events. Tooltip texts for series types with ordered
data (not pie, scatter, flags etc) will be shown in a single bubble.
This is recommended for single series charts and for tablet/mobile
optimized charts.

See also tooltip.split, that is better suited for
charts with many series, especially line-type series. The
tooltip.split option takes precedence over tooltip.shared.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-false/">False by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true/">True</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-x-crosshair/">True with x axis crosshair</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true-mixed-types/">True with mixed series types</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean shared;

/**
Callback function to format the text of the tooltip from scratch. Return
false to disable tooltip for a specific point on series.

A subset of HTML is supported. Unless useHTML is true, the HTML of the
tooltip is parsed and converted to SVG, therefore this isn't a complete HTML
renderer. The following tags are supported: , , , ,
, . Spans can be styled with a style attribute,
but only text-related CSS that is shared with SVG is handled.

Since version 2.1 the tooltip can be shared between multiple series
through the shared option. The available data in the formatter
differ a bit depending on whether the tooltip is shared or not. In
a shared tooltip, all properties except x, which is common for
all points, are kept in an array, this.points.

Available data are:


this.percentage (not shared) / this.points[i].percentage (shared)
Stacked series and pies only. The point's percentage of the total.

this.point (not shared) / this.points[i].point (shared)
The point object. The point name, if defined, is available through
this.point.name.
this.points
In a shared tooltip, this is an array containing all other properties
for each point.
this.series (not shared) / this.points[i].series (shared)
The series object. The series name is available through
this.series.name.
this.total (not shared) / this.points[i].total (shared)
Stacked series only. The total value at this point's x value.

this.x
The x value. This property is the same regardless of the tooltip
being shared or not.
this.y (not shared) / this.points[i].y (shared)
The y value.

 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-simple/">Simple string formatting</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-shared/">Formatting with shared tooltip</a>*/
	public HIFunction formatter;

/**
The HTML of the point's line in the tooltip. Variables are enclosed
by curly brackets. Available variables are point.x, point.y, series.
name and series.color and other properties on the same form. Furthermore,
point.y can be extended by the tooltip.valuePrefix and
tooltip.valueSuffix variables. This can also be overridden for each
series, which makes it a good hook for displaying units.

In styled mode, the dot is colored by a class name rather
than the point color.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/pointformat/">A different point format with value suffix</a> <br><br><b>default:</b><br><br>&ensp;<span style="color:{point.color}">\u25CF</span> {series.name}: <b>{point.y}</b><br/>*/
	public String pointFormat;

/**
The format for the date in the tooltip header if the X axis is a
datetime axis. The default is a best guess based on the smallest
distance between points in the chart.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/xdateformat/">A different format</a>*/
	public String xDateFormat;

/**
Padding inside the tooltip, in pixels.
 <br><br><b>default:</b><br><br>&ensp;8*/
	public Number padding;

/**
Whether to apply a drop shadow to the tooltip.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">True by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shadow/">False</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean shadow;

/**
Enable or disable the tooltip.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/enabled/">Disabled</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Disable tooltip and show values on chart instead</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
A callback function for formatting the HTML output for a single point
in the tooltip. Like the pointFormat string, but with more flexibility.
*/
	public HIFunction pointFormatter;

/**
The pixel width of the tooltip border.

In styled mode, the stroke width is set in the .highcharts-tooltip-box class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-default/">2px by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderwidth/">No border (shadow only)</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number borderWidth;

/**
Whether the tooltip should follow the mouse as it moves across columns,
pie slices and other point types with an extent. By default it behaves
this way for scatter, bubble and pie series by override in the plotOptions
for those series types.

For touch moves to behave the same way, [followTouchMove](
#tooltip.followTouchMove) must be true also.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean followPointer;

/**
The number of milliseconds to wait until the tooltip is hidden when
mouse out from a point or chart.
 <br><br><b>default:</b><br><br>&ensp;500*/
	public Number hideDelay;

/**
How many decimals to show in each series' y value. This is overridable
in each series' tooltip options object. The default is to preserve
all decimals.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>*/
	public Number valueDecimals;

/**
A callback for defining the format for _nodes_ in the sankey chart's
tooltip, as opposed to links.
*/
	public HIFunction nodeFormatter;

/**
The [format string](http://www.highcharts.com/docs/chart-
concepts/labels-and-string-formatting) specifying what to
show for _nodes_ in tooltip
of a sankey diagram series, as opposed to links.
*/
	public String nodeFormat;
	public Number distance;


	public HITooltip() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.followTouchMove != null) {
			params.put("followTouchMove", this.followTouchMove);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.headerFormat != null) {
			params.put("headerFormat", this.headerFormat);
		}
		if (this.valueSuffix != null) {
			params.put("valueSuffix", this.valueSuffix);
		}
		if (this.valuePrefix != null) {
			params.put("valuePrefix", this.valuePrefix);
		}
		if (this.dateTimeLabelFormats != null) {
			params.put("dateTimeLabelFormats", this.dateTimeLabelFormats.getParams());
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.positioner != null) {
			params.put("positioner", this.positioner);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.footerFormat != null) {
			params.put("footerFormat", this.footerFormat);
		}
		if (this.animation != null) {
			params.put("animation", this.animation);
		}
		if (this.split != null) {
			params.put("split", this.split);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.snap != null) {
			params.put("snap", this.snap);
		}
		if (this.shared != null) {
			params.put("shared", this.shared);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.pointFormat != null) {
			params.put("pointFormat", this.pointFormat);
		}
		if (this.xDateFormat != null) {
			params.put("xDateFormat", this.xDateFormat);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.pointFormatter != null) {
			params.put("pointFormatter", this.pointFormatter);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.followPointer != null) {
			params.put("followPointer", this.followPointer);
		}
		if (this.hideDelay != null) {
			params.put("hideDelay", this.hideDelay);
		}
		if (this.valueDecimals != null) {
			params.put("valueDecimals", this.valueDecimals);
		}
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		return params;
	}

}