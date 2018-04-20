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
import java.util.Observable;

import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



public class HIChart extends Observable implements HIChartsJSONSerializable {


/**
When true, cartesian charts like line, spline, area and column are
transformed into the polar coordinate system. Requires
highcharts-more.js.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean polar;

/**
The corner radius of the outer chart border.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderradius/">20px radius</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderRadius;

/**
The space between the bottom edge of the chart and the content (plot
area, axis title and labels, title, subtitle or legend in top position).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingbottom/">Spacing bottom set to 100</a> <br><br><b>default:</b><br><br>&ensp;15*/
	public Number spacingBottom;

/**
An explicit height for the chart. If a _number_, the height is
given in pixels. If given a _percentage string_ (for example '56%'),
the height is given as the percentage of the actual chart width.
This allows for preserving the aspect ratio across responsive
sizes.

By default (when null) the height is calculated from the offset
height of the containing element, or 400 pixels if the containing
element's height is 0.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/height/">500px height</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/height-percent/">Highcharts with percentage height</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Object /* Number|String */ height;

/**
When using multiple axis, the ticks of two or more opposite axes
will automatically be aligned by adding ticks to the axis or axes
with the least ticks, as if tickAmount were specified.

This can be prevented by setting alignTicks to false. If the grid
lines look messy, it's a good idea to hide them for the secondary
axis by setting gridLineWidth to 0.

If startOnTick or endOnTick in an Axis options are set to false,
then the alignTicks will be disabled for the Axis.

Disabled for logarithmic axes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-true/">True by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-false/">False</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean alignTicks;

/**
Common options for all yAxes rendered in a parallel coordinates plot.
This feature requires modules/parallel-coordinates.js.

The default options are:

parallelAxes: {
   lineWidth: 1,       // classic mode only
   gridlinesWidth: 0,  // classic mode only
   title: {
       text: '',
       reserveSpace: false
   },
   labels: {
       x: 0,
       y: 0,
       align: 'center',
       reserveSpace: false
   },
   offset: 0
}
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/parallelaxes/">Set the same tickAmount for all yAxes</a>*/
	public HIParallelAxes parallelAxes;

/**
The margin between the right outer edge of the chart and the plot
area. Use this to set a fixed pixel value for the margin as opposed
to the default dynamic margin. See also spacingRight.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginright/">100px right margin</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number marginRight;

/**
The color of the inner chart or plot area border.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbordercolor/">Blue border</a> <br><br><b>default:</b><br><br>&ensp;#cccccc*/
	public HIColor plotBorderColor;

/**
The space between the right edge of the chart and the content (plot
area, axis title and labels, title, subtitle or legend in top
position).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-100/">Spacing set to 100</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-legend/">Legend in right position with default spacing</a> <br><br><b>default:</b><br><br>&ensp;10*/
	public Number spacingRight;

/**
The color of the outer chart border.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/bordercolor/">Brown border</a> <br><br><b>default:</b><br><br>&ensp;#335cad*/
	public HIColor borderColor;

/**
In styled mode, this sets how many colors the class names
should rotate between. With ten colors, series (or points) are
given class names like highcharts-color-0, highcharts-color-0
[...] highcharts-color-9. The equivalent in non-styled mode
is to set colors using the colors setting.
 <br><br><b>default:</b><br><br>&ensp;10*/
	public Number colorCount;

/**
Additional CSS styles to apply inline to the container div. Note
that since the default font styles are applied in the renderer, it
is ignorant of the individual chart options and must be set globally.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/style-serif-font/">Using a serif type font</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/em/">Styled mode with relative font sizes</a> <br><br><b>default:</b><br><br>&ensp;{"fontFamily":"\"Lucida Grande\", \"Lucida Sans Unicode\", Verdana, Arial, Helvetica, sans-serif","fontSize":"12px"}*/
	public HashMap<String,String> style;

/**
The HTML element where the chart will be rendered. If it is a string,
the element by that id is used. The HTML element can also be passed
by direct reference, or as the first argument of the chart constructor,
 in which case the option is not needed.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">String</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/renderto-object/">Object reference</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/renderto-jquery/">Object reference through jQuery</a>*/
	public Object /* String|Object */ renderTo;

/**
Whether to reflow the chart to fit the width of the container div
on resizing the window.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">True by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-false/">False</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean reflow;

/**
Whether to apply a drop shadow to the plot area. Requires that
plotBackgroundColor be set. The shadow can be an object configuration
containing color, offsetX, offsetY, opacity and width.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotshadow/">Plot shadow</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Object /* Boolean|Object */ plotShadow;

/**
Decides in what dimensions the user can zoom by dragging the mouse.
Can be one of x, y or xy.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/">None by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-x/">X</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-y/">Y</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-xy/">Xy</a> <br><br><b>accepted values:</b><br><br>&ensp;[null, "x", "y", "xy"]*/
	public String zoomType;

/**
The space between the top edge of the chart and the content (plot
area, axis title and labels, title, subtitle or legend in top
position).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-100/">A top spacing of 100</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-10/">Floating chart title makes the plot area align to the default spacingTop of 10.</a> <br><br><b>default:</b><br><br>&ensp;10*/
	public Number spacingTop;

/**
The margin between the bottom outer edge of the chart and the plot
area. Use this to set a fixed pixel value for the margin as opposed
to the default dynamic margin. See also spacingBottom.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginbottom/">100px bottom margin</a>*/
	public Number marginBottom;

/**
An explicit width for the chart. By default (when null) the width
is calculated from the offset width of the containing element.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/width/">800px wide</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number width;

/**
Set the overall animation for all chart updating. Animation can be
disabled throughout the chart by setting it to false here. It can
be overridden for each individual API method as a function parameter.
The only animation not affected by this option is the initial series
animation, see [plotOptions.series.animation](
#plotOptions.series.animation).

The animation can either be set as a boolean or a configuration
object. If true, it will use the 'swing' jQuery easing and a
duration of 500 ms. If used as a configuration object, the following
properties are supported:


duration
The duration of the animation in milliseconds.
easing
A string reference to an easing function set on the Math object.
See [the easing demo](http://jsfiddle.net/gh/get/library/pure/
highcharts/highcharts/tree/master/samples/highcharts/plotoptions/
series-animation-easing/).

 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-none/">Updating with no animation</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-duration/">With a longer duration</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-easing/">With a jQuery UI easing</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Object /* Boolean|Object */ animation;

/**
The background color or gradient for the plot area.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-color/">Color</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-gradient/">Gradient</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor plotBackgroundColor;

/**
The background color or gradient for the outer chart area.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-color/">Color</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-gradient/">Gradient</a> <br><br><b>default:</b><br><br>&ensp;#FFFFFF*/
	public HIColor backgroundColor;

/**
Allow panning in a chart. Best used with panKey
to combine zooming and panning.

On touch devices, when the tooltip.followTouchMove
option is true (default), panning requires two fingers. To allow
panning with one finger, set followTouchMove to false.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/pankey/">Zooming and panning</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean panning;

/**
Options to render charts in 3 dimensions. This feature requires
highcharts-3d.js, found in the download package or online at
[code.highcharts.com/highcharts-3d.js](http://code.highcharts.com/highcharts-
3d.js).
*/
	public HIOptions3d options3d;

/**
The default series type for the chart. Can be any of the chart types
listed under plotOptions.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/type-bar/">Bar</a> <br><br><b>accepted values:</b><br><br>&ensp;["line", "spline", "column", "bar", "area", "areaspline", "pie", "arearange", "areasplinerange", "boxplot", "bubble", "columnrange", "errorbar", "funnel", "gauge", "heatmap", "polygon", "pyramid", "scatter", "solidgauge", "treemap", "waterfall"] <br><br><b>default:</b><br><br>&ensp;line*/
	public String type;

/**
Event listeners for the chart.
*/
	public HIEvents events;

/**
The space between the left edge of the chart and the content (plot
area, axis title and labels, title, subtitle or legend in top position).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingleft/">Spacing left set to 100</a> <br><br><b>default:</b><br><br>&ensp;10*/
	public Number spacingLeft;

/**
A text description of the chart.

If the Accessibility module is loaded, this is included by default
as a long description of the chart and its contents in the hidden
screen reader information region.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public String definition;

/**
Allows setting a key to switch between zooming and panning. Can be
one of alt, ctrl, meta (the command key on Mac and Windows
key on Windows) or shift. The keys are mapped directly to the key
properties of the click event argument (event.altKey, event.ctrlKey,
event.metaKey and event.shiftKey).
 <br><br><b>accepted values:</b><br><br>&ensp;[null, "alt", "ctrl", "meta", "shift"]*/
	public String panKey;

/**
The distance between the outer edge of the chart and the content,
like title or legend, or axis title and labels if present. The
numbers in the array designate top, right, bottom and left respectively.
Use the options spacingTop, spacingRight, spacingBottom and spacingLeft
options for shorthand setting of one option.
 <br><br><b>default:</b><br><br>&ensp;[10, 10, 15, 10]*/
	public ArrayList<Number> spacing;

/**
The margin between the left outer edge of the chart and the plot
area. Use this to set a fixed pixel value for the margin as opposed
to the default dynamic margin. See also spacingLeft.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginleft/">150px left margin</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number marginLeft;

/**
Options for a scrollable plot area. This feature provides a minimum width for
the plot area of the chart. If the width gets smaller than this, typically
on mobile devices, a native browser scrollbar is presented below the chart.
This scrollbar provides smooth scrolling for the contents of the plot area,
whereas the title, legend and axes are fixed.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea">Scrollable plot area</a>*/
	public HIScrollablePlotArea scrollablePlotArea;

/**
Whether to apply a drop shadow to the outer chart area. Requires
that backgroundColor be set. The shadow can be an object configuration
containing color, offsetX, offsetY, opacity and width.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/shadow/">Shadow</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Object /* Boolean|Object */ shadow;

/**
Whether to invert the axes so that the x axis is vertical and y axis
is horizontal. When true, the x axis is reversed
by default.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted/">Inverted line</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean inverted;

/**
The pixel width of the plot area border.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotborderwidth/">1px border</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number plotBorderWidth;

/**
If true, the axes will scale to the remaining visible series once
one series is hidden. If false, hiding and showing a series will
not affect the axes or the other series. For stacks, once one series
within the stack is hidden, the rest of the stack will close in
around it even if the axis is not affected.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-true/">True by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-false/">False</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-true-stacked/">True with stack</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean ignoreHiddenSeries;

/**
The background color of the marker square when selecting (zooming
in on) an area of the chart.
 <br><br><b>default:</b><br><br>&ensp;rgba(51,92,173,0.25)*/
	public HIColor selectionMarkerFill;

/**
The URL for an image to use as the plot background. To set an image
as the background for the entire chart, set a CSS background image
to the container element. Note that for the image to be applied to
exported charts, its URL needs to be accessible by the export server.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundimage/">Skies</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public String plotBackgroundImage;

/**
Equivalent to zoomType, but for multitouch gestures
only. By default, the pinchType is the same as the zoomType setting.
However, pinching can be enabled separately in some cases, for example
in stock charts where a mouse drag pans the chart, while pinching
is enabled. When tooltip.followTouchMove
is true, pinchType only applies to two-finger touches.
 <br><br><b>accepted values:</b><br><br>&ensp;["x", "y", "xy"] <br><br><b>default:</b><br><br>&ensp;null*/
	public String pinchType;

/**
A CSS class name to apply to the charts container div, allowing
unique CSS styling for each chart.
*/
	public String className;

/**
Flag to render charts as a parallel coordinates plot. In a parallel
coordinates plot (||-coords) by default all required yAxes are generated
and the legend is disabled. This feature requires
modules/parallel-coordinates.js.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples//highcharts/demo/parallel-coordinates/">Parallel coordinates demo</a>*/
	public Boolean parallelCoordinates;

/**
The button that appears after a selection zoom, allowing the user
to reset zoom.
*/
	public HIResetZoomButton resetZoomButton;

/**
Whether to show the axes initially. This only applies to empty charts
where series are added dynamically, as axes are automatically added
to cartesian series.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-false/">False by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-true/">True</a>*/
	public Boolean showAxes;

/**
The pixel width of the outer chart border.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderwidth/">5px border</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderWidth;

/**
A text description of the chart type.

If the Accessibility module is loaded, this will be included in the
description of the chart in the screen reader information region.


Highcharts will by default attempt to guess the chart type, but for
more complex charts it is recommended to specify this property for
clarity.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public String typeDescription;

/**
The margin between the top outer edge of the chart and the plot area.
Use this to set a fixed pixel value for the margin as opposed to
the default dynamic margin. See also spacingTop.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/margintop/">100px top margin</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number marginTop;

/**
The margin between the outer edge of the chart and the plot area.
The numbers in the array designate top, right, bottom and left
respectively. Use the options marginTop, marginRight,
marginBottom and marginLeft for shorthand setting of one option.

By default there is no margin. The actual space is dynamically calculated
from the offset of axis labels, axis title, title, subtitle and legend
in addition to the spacingTop, spacingRight, spacingBottom
and spacingLeft options.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/margins-zero/">Zero margins</a>*/
	public ArrayList margin;


	public HIChart() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.polar != null) {
			params.put("polar", this.polar);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.spacingBottom != null) {
			params.put("spacingBottom", this.spacingBottom);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.alignTicks != null) {
			params.put("alignTicks", this.alignTicks);
		}
		if (this.parallelAxes != null) {
			params.put("parallelAxes", this.parallelAxes.getParams());
		}
		if (this.marginRight != null) {
			params.put("marginRight", this.marginRight);
		}
		if (this.plotBorderColor != null) {
			params.put("plotBorderColor", this.plotBorderColor.getData());
		}
		if (this.spacingRight != null) {
			params.put("spacingRight", this.spacingRight);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.colorCount != null) {
			params.put("colorCount", this.colorCount);
		}
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.renderTo != null) {
			params.put("renderTo", this.renderTo);
		}
		if (this.reflow != null) {
			params.put("reflow", this.reflow);
		}
		if (this.plotShadow != null) {
			params.put("plotShadow", this.plotShadow);
		}
		if (this.zoomType != null) {
			params.put("zoomType", this.zoomType);
		}
		if (this.spacingTop != null) {
			params.put("spacingTop", this.spacingTop);
		}
		if (this.marginBottom != null) {
			params.put("marginBottom", this.marginBottom);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.animation != null) {
			params.put("animation", this.animation);
		}
		if (this.plotBackgroundColor != null) {
			params.put("plotBackgroundColor", this.plotBackgroundColor.getData());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.panning != null) {
			params.put("panning", this.panning);
		}
		if (this.options3d != null) {
			params.put("options3d", this.options3d.getParams());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.spacingLeft != null) {
			params.put("spacingLeft", this.spacingLeft);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.panKey != null) {
			params.put("panKey", this.panKey);
		}
		if (this.spacing != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.spacing) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("spacing", array);
		}
		if (this.marginLeft != null) {
			params.put("marginLeft", this.marginLeft);
		}
		if (this.scrollablePlotArea != null) {
			params.put("scrollablePlotArea", this.scrollablePlotArea.getParams());
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.inverted != null) {
			params.put("inverted", this.inverted);
		}
		if (this.plotBorderWidth != null) {
			params.put("plotBorderWidth", this.plotBorderWidth);
		}
		if (this.ignoreHiddenSeries != null) {
			params.put("ignoreHiddenSeries", this.ignoreHiddenSeries);
		}
		if (this.selectionMarkerFill != null) {
			params.put("selectionMarkerFill", this.selectionMarkerFill.getData());
		}
		if (this.plotBackgroundImage != null) {
			params.put("plotBackgroundImage", this.plotBackgroundImage);
		}
		if (this.pinchType != null) {
			params.put("pinchType", this.pinchType);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.parallelCoordinates != null) {
			params.put("parallelCoordinates", this.parallelCoordinates);
		}
		if (this.resetZoomButton != null) {
			params.put("resetZoomButton", this.resetZoomButton.getParams());
		}
		if (this.showAxes != null) {
			params.put("showAxes", this.showAxes);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.typeDescription != null) {
			params.put("typeDescription", this.typeDescription);
		}
		if (this.marginTop != null) {
			params.put("marginTop", this.marginTop);
		}
		if (this.margin != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.margin) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("margin", array);
		}
		return params;
	}


//	public Number getBorderWidth() {
//		return borderWidth;
//	}
//
//	public void setBorderWidth(Number borderWidth) {
//		this.borderWidth = borderWidth;
//		this.setChanged();
//		this.notifyObservers();
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//		this.setChanged();
//		this.notifyObservers();
//	}
//
//	public HIColor getBackgroundColor() {
//		return backgroundColor;
//	}
//
//	public void setBackgroundColor(HIColor backgroundColor) {
//		this.backgroundColor = backgroundColor;
//		this.setChanged();
//		this.notifyObservers();
//	}
//
//	public ArrayList<Number> getSpacing() {
//		return spacing;
//	}
//
//	public void setSpacing(ArrayList<Number> spacing) {
//		this.spacing = spacing;
//		this.setChanged();
//		this.notifyObservers();
//	}
}