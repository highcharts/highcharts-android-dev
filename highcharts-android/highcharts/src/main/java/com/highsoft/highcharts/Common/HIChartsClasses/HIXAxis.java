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



public class HIXAxis extends Observable implements HIChartsJSONSerializable {


/**
Padding of the min value relative to the length of the axis. A
padding of 0.05 will make a 100px axis 5px longer. This is useful
when you don't want the lowest data value to appear on the edge
of the plot area. When the axis' min option is set or a min extreme
is set using axis.setExtremes(), the minPadding will be ignored.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/">Min padding of 0.2</a> <br><br><b>default:</b><br><br>&ensp;0.01*/
	public Number minPadding;

/**
If tickInterval is null this option sets the approximate pixel
interval of the tick marks. Not applicable to categorized axis.

The tick interval is also influenced by the [minTickInterval](
#xAxis.minTickInterval) option, that, by default prevents ticks from
being denser than the data points.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/">50 px on X axis</a>*/
	public Number tickPixelInterval;

/**
The Z index of the grid lines.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/">A Z index of 4 renders the grid above the graph</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number gridZIndex;

/**
For a datetime axis, the scale will automatically adjust to the
appropriate unit. This member gives the default string
representations used for each unit. For intermediate values,
different units may be used, for example the day unit can be used
on midnight and hour unit be used for intermediate values on the
same axis. For an overview of the replacement codes, see
dateFormat. Defaults to:

{
    millisecond: '%H:%M:%S.%L',
    second: '%H:%M:%S',
    minute: '%H:%M',
    hour: '%H:%M',
    day: '%e. %b',
    week: '%e. %b',
    month: '%b \'%y',
    year: '%Y'
}
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/datetimelabelformats/">Different day format on X axis</a>*/
	public HIDateTimeLabelFormats dateTimeLabelFormats;

/**
Whether axis, including axis title, line, ticks and labels, should
be visible.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean visible;

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
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean alignTicks;

/**
Refers to the index in the panes array. Used for circular
gauges and polar charts. When the option is not set then first pane
will be used.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter">Two gauges with different center</a>*/
	public Number pane;

/**
The pixel width of the major tick marks.

In styled mode, the stroke width is given in the .highcharts-tick class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickwidth/">10 px width</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number tickWidth;

/**
Whether to show the first tick label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showfirstlabel-false/">Set to false on X axis</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean showFirstLabel;

/**
Whether to reverse the axis so that the highest number is closest
to the origin. If the chart is inverted, the x axis is reversed by
default.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/">Reversed Y axis</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean reversed;

/**
For datetime axes, this decides where to put the tick between weeks.
 0 = Sunday, 1 = Monday.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-monday/">Monday by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-sunday/">Sunday</a>*/
	public Number startOfWeek;

/**
An id for the axis. This can be used after render time to get
a pointer to the axis object through chart.get().
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/id/">Get the object</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public String id;

/**
An array defining where the ticks are laid out on the axis. This
overrides the default behaviour of tickPixelInterval
and tickInterval.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>*/
	public ArrayList<Number> tickPositions;

/**
The minimum value of the axis. If null the min value is
automatically calculated.

If the startOnTick option is true (default), the min value might
be rounded down.

The automatically calculated minimum value is also affected by
floor, softMin,
minPadding, minRange
as well as series.threshold
and series.softThreshold.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-false/">-50 with startOnTick to false</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-true/">-50 with startOnTick true by default</a>*/
	public Number min;

/**
The minimum range to display on this axis. The entire axis will not
be allowed to span over a smaller interval than this. For example,
for a datetime axis the main unit is milliseconds. If minRange is
set to 3600000, you can't zoom in more than to one hour.

The default minRange for the x axis is five times the smallest
interval between any of the data points.

On a logarithmic axis, the unit for the minimum range is the power.
So a minRange of 1 means that the axis can be zoomed to 10-100,
100-1000, 1000-10000 etc.

Note that the minPadding, maxPadding, startOnTick and
endOnTick settings also affect how the extremes of the axis
are computed.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/minrange/">Minimum range of 5</a>*/
	public Number minRange;

/**
For categorized axes only. If on the tick mark is placed in the
center of the category, if between the tick mark is placed between
categories. The default is between if the tickInterval is 1,
 else on.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/">"between" by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/">"on"</a> <br><br><b>accepted values:</b><br><br>&ensp;[null, "on", "between"]*/
	public String tickmarkPlacement;

/**
Whether to allow decimals in this axis' ticks. When counting
integers, like persons or hits on a web page, decimals should
be avoided in the labels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-true/">True by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-false/">False</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean allowDecimals;

/**
Whether to force the axis to start on a tick. Use this option with
the minPadding option to control the axis start.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/">False by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/">True</a>*/
	public Boolean startOnTick;

/**
Color of the minor, secondary grid lines.

In styled mode, the stroke width is given in the
.highcharts-minor-grid-line class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinecolor/">Bright grey lines from Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;#f2f2f2*/
	public HIColor minorGridLineColor;

/**
A callback function returning array defining where the ticks are
laid out on the axis. This overrides the default behaviour of
tickPixelInterval and
tickInterval. The automatic tick positions are
accessible through this.tickPositions and can be modified by the callback.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>*/
	public HIFunction tickPositioner;

/**
An array of colored bands stretching across the plot area marking
an interval on the axis.

In styled mode, the plot bands are styled by the .highcharts-plot-band class in addition to the className option.
*/
	public ArrayList <HIPlotBands> plotBands;

/**
The dash or dot style of the minor grid lines. For possible values,
see [this demonstration](http://jsfiddle.net/gh/get/library/pure/
highcharts/highcharts/tree/master/samples/highcharts/plotoptions/
series-dashstyle-all/).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinedashstyle/">Long dashes on minor grid lines</a> <br><br><b>accepted values:</b><br><br>&ensp;["Solid", "ShortDash", "ShortDot", "ShortDashDot",
             "ShortDashDotDot", "Dot", "Dash" ,"LongDash",
             "DashDot", "LongDashDot", "LongDashDotDot"] <br><br><b>default:</b><br><br>&ensp;Solid*/
	public String minorGridLineDashStyle;

/**
The pixel length of the minor tick marks.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticklength/">10px on Y axis</a>*/
	public Number minorTickLength;

/**
Whether to force the axis to end on a tick. Use this option with
the maxPadding option to control the axis end.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">True by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/">False</a>*/
	public Boolean endOnTick;

/**
An array of lines stretching across the plot area, marking a specific
value on one of the axes.

In styled mode, the plot lines are styled by the .highcharts-plot-line class in addition to the className option.
*/
	public ArrayList <HIPlotLines> plotLines;

/**
Datetime axis only. An array determining what time intervals the
ticks are allowed to fall on. Each array item is an array where the
first value is the time unit and the second value another array of
allowed multiples. Defaults to:

units: [[
    'millisecond', // unit name
    [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
], [
    'second',
    [1, 2, 5, 10, 15, 30]
], [
    'minute',
    [1, 2, 5, 10, 15, 30]
], [
    'hour',
    [1, 2, 3, 4, 6, 8, 12]
], [
    'day',
    [1]
], [
    'week',
    [1]
], [
    'month',
    [1, 3, 6]
], [
    'year',
    null
]]
*/
	public ArrayList units;

/**
A soft minimum for the axis. If the series data minimum is greater
than this, the axis will stay at this minimum, but if the series
data minimum is lower, the axis will flex to show all data.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>*/
	public Number softMin;

/**
The type of axis. Can be one of linear, logarithmic, datetime
or category. In a datetime axis, the numbers are given in
milliseconds, and tick marks are placed on appropriate values like
full hours or days. In a category axis, the
point names of the chart's series are used
for categories, if not a categories array is
defined.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-linear/">Linear</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log/">Logarithmic</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-minorgrid/">Logarithmic with minor grid lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-log-both/">Logarithmic on two axes</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-negative/">Logarithmic with extension to emulate negative values</a> <br><br><b>accepted values:</b><br><br>&ensp;["linear", "logarithmic", "datetime", "category"]*/
	public String type;

/**
Event handlers for the axis.
*/
	public HIEvents events;

/**
Configure a crosshair that follows either the mouse pointer or the
hovered point.

In styled mode, the crosshairs are styled in the
.highcharts-crosshair, .highcharts-crosshair-thin or
.highcharts-xaxis-category classes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/">Crosshair on both axes</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public HICrosshair crosshair;

/**
The highest allowed value for automatically computed axis extremes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>*/
	public Number ceiling;

/**
The axis labels show the number or category for each tick.
*/
	public HILabels labels;

/**
The dash or dot style of the grid lines. For possible values, see
[this demonstration](http://jsfiddle.net/gh/get/library/pure/
highcharts/highcharts/tree/master/samples/highcharts/plotoptions/
series-dashstyle-all/).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinedashstyle/">Long dashes</a> <br><br><b>accepted values:</b><br><br>&ensp;["Solid", "ShortDash", "ShortDot", "ShortDashDot",
             "ShortDashDotDot", "Dot", "Dash" ,"LongDash",
             "DashDot", "LongDashDot", "LongDashDotDot"] <br><br><b>default:</b><br><br>&ensp;Solid*/
	public String gridLineDashStyle;

/**
_Requires Accessibility module_

Description of the axis to screen reader users.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public String definition;

/**
Whether to display the axis on the opposite side of the normal. The
normal is on the left side for vertical axes and bottom for
horizontal, so the opposite sides will be right and top respectively.
This is typically used with dual or multiple axes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/opposite/">Secondary Y axis opposite</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean opposite;

/**
The position of the minor tick marks relative to the axis line.
 Can be one of inside and outside.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-outside/">Outside by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-inside/">Inside</a> <br><br><b>accepted values:</b><br><br>&ensp;["inside", "outside"]*/
	public String minorTickPosition;

/**
The maximum value of the axis. If null, the max value is
automatically calculated.

If the endOnTick option is true, the max value might
be rounded up.

If a tickAmount is set, the axis may be extended
beyond the set max in order to reach the given number of ticks. The
same may happen in a chart with multiple axes, determined by [chart.
alignTicks](#chart), where a tickAmount is applied internally.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-200/">Y axis max of 200</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-logarithmic/">Y axis max on logarithmic axis</a>*/
	public Number max;

/**
An array defining breaks in the axis, the sections defined will be
left out and all the points shifted closer to each other.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-simple/">Simple break</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/">Advanced with callback</a>*/
	public ArrayList <HIBreaks> breaks;

/**
Whether to show the axis line and title when the axis has no data.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/showempty/">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean showEmpty;

/**
The width of the grid lines extending the ticks across the plot area.

In styled mode, the stroke width is given in the
.highcharts-grid-line class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinewidth/">2px lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number gridLineWidth;

/**
Enable or disable minor ticks. Unless
minorTickInterval is set, the tick
interval is calculated as a fifth of the tickInterval.

On a logarithmic axis, minor ticks are laid out based on a best
guess, attempting to enter approximately 5 minor ticks between
each major tick.

Prior to v6.0.0, ticks were unabled in auto layout by setting
minorTickInterval to "auto".
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticks-true/">Enabled on linear Y axis</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean minorTicks;

/**
The pixel width of the minor tick mark.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickwidth/">3px width</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number minorTickWidth;

/**
The lowest allowed value for automatically computed axis extremes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number floor;

/**
The distance in pixels from the plot area to the axis line.
A positive offset moves the axis with it's line, labels and ticks
away from the plot area. This is typically used when two or more
axes are displayed on the same side of the plot. With multiple
axes the offset is dynamically adjusted to avoid collision, this
can be overridden by setting offset explicitly.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset/">Y axis offset of 70</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset-centered/">Axes positioned in the center of the plot</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number offset;

/**
Color for the main tick marks.

In styled mode, the stroke is given in the .highcharts-tick
class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickcolor/">Red ticks on X axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;#ccd6eb*/
	public HIColor tickColor;

/**
The minimum tick interval allowed in axis values. For example on
zooming in on an axis with daily data, this can be used to prevent
the axis from showing hours. Defaults to the closest distance between
two points on the axis.
*/
	public Number minTickInterval;

/**
The interval of the tick marks in axis units. When null, the tick
interval is computed to approximately follow the [tickPixelInterval](
#xAxis.tickPixelInterval) on linear and datetime axes. On categorized axes,
a null tickInterval will default to 1, one category. Note that
datetime axes are based on milliseconds, so for example an interval
of one day is expressed as 24 * 3600 * 1000.

On logarithmic axes, the tickInterval is based on powers, so a tickInterval
of 1 means one tick on each of 0.1, 1, 10, 100 etc. A tickInterval
of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of 0.2 puts
a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc.


If the tickInterval is too dense for labels to be drawn, Highcharts
may remove ticks.

If the chart has multiple axes, the alignTicks
option may interfere with the tickInterval setting.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickinterval-5/">Tick interval of 5 on a linear axis</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number tickInterval;

/**
Specific tick interval in axis units for the minor ticks.
On a linear axis, if "auto", the minor tick interval is
calculated as a fifth of the tickInterval. If null, minor
ticks are not shown.

On logarithmic axes, the unit is the power of the value. For example,
setting the minorTickInterval to 1 puts one tick on each of 0.1,
1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9
ticks between 1 and 10, 10 and 100 etc.

If user settings dictate minor ticks to become too dense, they don't
make sense, and will be ignored to prevent performance problems.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-null/">Null by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-5/">5 units</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-log-auto/">"auto"</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-log/">0.1</a>*/
	public Object /* Number|String */ minorTickInterval;

/**
If categories are present for the xAxis, names are used instead of
numbers for that axis. Since Highcharts 3.0, categories can also
be extracted by giving each point a name and setting
axis type to category. However, if you have multiple
series, best practice remains defining the categories array.

Example:

categories: ['Apples', 'Bananas', 'Oranges']
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">With</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/categories/">Without</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public ArrayList<String> categories;

/**
Color of the grid lines extending the ticks across the plot area.

In styled mode, the stroke is given in the .highcharts-grid-line
class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinecolor/">Green lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;#e6e6e6*/
	public HIColor gridLineColor;

/**
Index of another axis that this axis is linked to. When an axis is
linked to a master axis, it will take the same extremes as
the master, but as assigned by min or max or by setExtremes.
It can be used to show additional info, or to ease reading the
chart by duplicating the scales.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/linkedto/">Different string formats of the same date</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linkedto/">Y values on both sides</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number linkedTo;

/**
Width of the minor, secondary grid lines.

In styled mode, the stroke width is given in the
.highcharts-grid-line class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinewidth/">2px lines from Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>*/
	public Number minorGridLineWidth;

/**
Whether to show the last tick label. Defaults to true on cartesian
charts, and false on polar charts.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showlastlabel-true/">Set to true on X axis</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean showLastLabel;

/**
Color for the minor tick marks.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickcolor/">Black tick marks on Y axis</a> <br><br><b>default:</b><br><br>&ensp;#999999*/
	public HIColor minorTickColor;

/**
Applies only when the axis type is category. When uniqueNames
is true, points are placed on the X axis according to their names.
If the same point name is repeated in the same or another series,
the point is placed on the same X position as other points of the
same name. When uniqueNames is false, the points are laid out in
increasing X positions regardless of their names, and the X axis
category will take the name of the last point in each position.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/uniquenames-true/">True by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/uniquenames-false/">False</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean uniqueNames;

/**
Padding of the max value relative to the length of the axis. A
padding of 0.05 will make a 100px axis 5px longer. This is useful
when you don't want the highest data value to appear on the edge
of the plot area. When the axis' max option is set or a max extreme
is set using axis.setExtremes(), the maxPadding will be ignored.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding/">Max padding of 0.25 on y axis</a> <br><br><b>default:</b><br><br>&ensp;0.01*/
	public Number maxPadding;

/**
A class name that opens for styling the axis by CSS, especially in
Highcharts styled mode. The class name is applied to group elements
for the grid, axis elements and labels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Multiple axes with separate styling</a>*/
	public String className;

/**
The amount of ticks to draw on the axis. This opens up for aligning
the ticks of multiple charts or panes within a chart. This option
overrides the tickPixelInterval option.

This option only has an effect on linear axes. Datetime, logarithmic
or category axes are not affected.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/tickamount/">8 ticks on Y axis</a>*/
	public Number tickAmount;

/**
The pixel length of the main tick marks.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/">20 px tick length on the X axis</a>*/
	public Number tickLength;

/**
The color of the line marking the axis itself.

In styled mode, the line stroke is given in the
.highcharts-axis-line or .highcharts-xaxis-line class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A red line on Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a> <br><br><b>default:</b><br><br>&ensp;#ccd6eb*/
	public HIColor lineColor;

/**
When using an alternate grid color, a band is painted across the
plot area between every other grid line.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/alternategridcolor/">Alternate grid color on the Y axis</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor alternateGridColor;

/**
The axis title, showing next to the axis line.
*/
	public HITitle title;

/**
The position of the major tick marks relative to the axis line.
Can be one of inside and outside.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-outside/">"outside" by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-inside/">"inside"</a> <br><br><b>accepted values:</b><br><br>&ensp;["inside", "outside"]*/
	public String tickPosition;

/**
The width of the line marking the axis itself.

In styled mode, the stroke width is given in the
.highcharts-axis-line or .highcharts-xaxis-line class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A 1px line on Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number lineWidth;

/**
A soft maximum for the axis. If the series data maximum is less than
this, the axis will stay at this maximum, but if the series data
maximum is higher, the axis will flex to show all data.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>*/
	public Number softMax;


	public HIXAxis() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.minPadding != null) {
			params.put("minPadding", this.minPadding);
		}
		if (this.tickPixelInterval != null) {
			params.put("tickPixelInterval", this.tickPixelInterval);
		}
		if (this.gridZIndex != null) {
			params.put("gridZIndex", this.gridZIndex);
		}
		if (this.dateTimeLabelFormats != null) {
			params.put("dateTimeLabelFormats", this.dateTimeLabelFormats.getParams());
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.alignTicks != null) {
			params.put("alignTicks", this.alignTicks);
		}
		if (this.pane != null) {
			params.put("pane", this.pane);
		}
		if (this.tickWidth != null) {
			params.put("tickWidth", this.tickWidth);
		}
		if (this.showFirstLabel != null) {
			params.put("showFirstLabel", this.showFirstLabel);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.startOfWeek != null) {
			params.put("startOfWeek", this.startOfWeek);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.tickPositions != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.tickPositions) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("tickPositions", array);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.minRange != null) {
			params.put("minRange", this.minRange);
		}
		if (this.tickmarkPlacement != null) {
			params.put("tickmarkPlacement", this.tickmarkPlacement);
		}
		if (this.allowDecimals != null) {
			params.put("allowDecimals", this.allowDecimals);
		}
		if (this.startOnTick != null) {
			params.put("startOnTick", this.startOnTick);
		}
		if (this.minorGridLineColor != null) {
			params.put("minorGridLineColor", this.minorGridLineColor.getData());
		}
		if (this.tickPositioner != null) {
			params.put("tickPositioner", this.tickPositioner);
		}
		if (this.plotBands != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.plotBands) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("plotBands", array);
		}
		if (this.minorGridLineDashStyle != null) {
			params.put("minorGridLineDashStyle", this.minorGridLineDashStyle);
		}
		if (this.minorTickLength != null) {
			params.put("minorTickLength", this.minorTickLength);
		}
		if (this.endOnTick != null) {
			params.put("endOnTick", this.endOnTick);
		}
		if (this.plotLines != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.plotLines) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("plotLines", array);
		}
		if (this.units != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.units) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("units", array);
		}
		if (this.softMin != null) {
			params.put("softMin", this.softMin);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.crosshair != null) {
			params.put("crosshair", this.crosshair.getParams());
		}
		if (this.ceiling != null) {
			params.put("ceiling", this.ceiling);
		}
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
		}
		if (this.gridLineDashStyle != null) {
			params.put("gridLineDashStyle", this.gridLineDashStyle);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.opposite != null) {
			params.put("opposite", this.opposite);
		}
		if (this.minorTickPosition != null) {
			params.put("minorTickPosition", this.minorTickPosition);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.breaks != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.breaks) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("breaks", array);
		}
		if (this.showEmpty != null) {
			params.put("showEmpty", this.showEmpty);
		}
		if (this.gridLineWidth != null) {
			params.put("gridLineWidth", this.gridLineWidth);
		}
		if (this.minorTicks != null) {
			params.put("minorTicks", this.minorTicks);
		}
		if (this.minorTickWidth != null) {
			params.put("minorTickWidth", this.minorTickWidth);
		}
		if (this.floor != null) {
			params.put("floor", this.floor);
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.tickColor != null) {
			params.put("tickColor", this.tickColor.getData());
		}
		if (this.minTickInterval != null) {
			params.put("minTickInterval", this.minTickInterval);
		}
		if (this.tickInterval != null) {
			params.put("tickInterval", this.tickInterval);
		}
		if (this.minorTickInterval != null) {
			params.put("minorTickInterval", this.minorTickInterval);
		}
		if (this.categories != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.categories) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("categories", array);
		}
		if (this.gridLineColor != null) {
			params.put("gridLineColor", this.gridLineColor.getData());
		}
		if (this.linkedTo != null) {
			params.put("linkedTo", this.linkedTo);
		}
		if (this.minorGridLineWidth != null) {
			params.put("minorGridLineWidth", this.minorGridLineWidth);
		}
		if (this.showLastLabel != null) {
			params.put("showLastLabel", this.showLastLabel);
		}
		if (this.minorTickColor != null) {
			params.put("minorTickColor", this.minorTickColor.getData());
		}
		if (this.uniqueNames != null) {
			params.put("uniqueNames", this.uniqueNames);
		}
		if (this.maxPadding != null) {
			params.put("maxPadding", this.maxPadding);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.tickAmount != null) {
			params.put("tickAmount", this.tickAmount);
		}
		if (this.tickLength != null) {
			params.put("tickLength", this.tickLength);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.alternateGridColor != null) {
			params.put("alternateGridColor", this.alternateGridColor.getData());
		}
		if (this.title != null) {
			params.put("title", this.title.getParams());
		}
		if (this.tickPosition != null) {
			params.put("tickPosition", this.tickPosition);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.softMax != null) {
			params.put("softMax", this.softMax);
		}
		return params;
	}

//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//		this.setChanged();
//		this.notifyObservers();
//	}
}