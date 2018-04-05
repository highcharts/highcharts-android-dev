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



public class HIColorAxis implements HIChartsJSONSerializable { 


/**
An array of data classes or ranges for the choropleth map. If none
given, the color axis is scalar and values are distributed as a gradient
between the minimum and maximum colors.
*/
	public ArrayList <HIDataClasses> dataClasses;

/**
* description: Padding of the min value relative to the length of the axis. A
padding of 0.05 will make a 100px axis 5px longer.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/ : Min padding of 0.2* default: 0.01
*/
	public Number minPadding;

/**
* description: The axis labels show the number for each tick.

For more live examples on label options, see [xAxis.labels in the
Highcharts API.](/highcharts#xAxis.labels)
*/
	public HILabels labels;

/**
The color to represent the maximum of the color axis. Unless [dataClasses](#colorAxis.
dataClasses) or stops are set, the gradient
ends at this value.

If dataClasses are set, the color is based on minColor and maxColor
unless a color is set for each data class, or the [dataClassColor](#colorAxis.
dataClassColor) is set.
 <br><br><b>default:</b><br><br>&ensp;#003399*/
	public HIColor maxColor;

/**
The triangular marker on a scalar color axis that points to the
value of the hovered area. To disable the marker, set
marker: null.
*/
	public HIMarker marker;

/**
* description: The minimum value of the axis in terms of map point values. If null,
the min value is automatically calculated. If the startOnTick
option is true, the min value might be rounded down.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-false/ : -50 with startOnTick to false •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-true/ : -50 with startOnTick true by default*/
	public Number min;

/**
Color stops for the gradient of a scalar color axis. Use this in
cases where a linear gradient between a minColor and maxColor
is not sufficient. The stops is an array of tuples, where the first
item is a float between 0 and 1 assigning the relative position in
the gradient, and the second item is the color.
*/
	public ArrayList<ArrayList> stops;

/**
Determines how to set each data class' color if no individual color
is set. The default value, tween, computes intermediate colors
between minColor and maxColor. The other possible value, category,
pulls colors from the global or chart specific colors
array.
 <br><br><b>accepted values:</b><br><br>&ensp;["tween", "category"] <br><br><b>default:</b><br><br>&ensp;tween*/
	public String dataClassColor;

/**
* description: Whether to force the axis to end on a tick. Use this option with
the maxPadding option to control the axis
end.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/ : True by default •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/ : False* default: true
*/
	public Boolean endOnTick;

/**
* description: The type of interpolation to use for the color axis. Can be linear
or logarithmic.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-linear/ : Linear •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log/ : Logarithmic •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-minorgrid/ : Logarithmic with minor grid lines •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/type-log-both/ : Logarithmic on two axes •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-negative/ : Logarithmic with extension to emulate negative values* accepted values: ["linear", "logarithmic"]
* default: linear
*/
	public String type;

/**
* description: Event handlers for the axis.
*/
	public HIEvents events;

/**
* description: If tickInterval is null this option
sets the approximate pixel interval of the tick marks.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/ : 50 px on X axis* default: 72
*/
	public Number tickPixelInterval;

/**
* description: The maximum value of the axis in terms of map point values. If null,
the max value is automatically calculated. If the endOnTick option
is true, the max value might be rounded up.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-200/ : Y axis max of 200 •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-logarithmic/ : Y axis max on logarithmic axis*/
	public Number max;

/**
* description: Whether to reverse the axis so that the highest number is closest
to the origin. Defaults to false in a horizontal legend and true
in a vertical legend, where the smallest value starts on top.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/ : Reversed Y axis* default: false
*/
	public Boolean reversed;

/**
* description: The width of the grid lines extending from the axis across the
gradient of a scalar color axis.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinewidth/ : 2px lines •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/ : Styled mode* default: 1
*/
	public Number gridLineWidth;

/**
* description: The interval of the tick marks in axis units. When null, the tick
interval is computed to approximately follow the tickPixelInterval.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickinterval-5/ : Tick interval of 5 on a linear axis* default: null
*/
	public Number tickInterval;

/**
* description: Color of the grid lines extending from the axis across the gradient.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinecolor/ : Green lines •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/ : Styled mode* default: #e6e6e6
*/
	public HIColor gridLineColor;

/**
The color to represent the minimum of the color axis. Unless [dataClasses](#colorAxis.
dataClasses) or stops are set, the gradient
starts at this value.

If dataClasses are set, the color is based on minColor and maxColor
unless a color is set for each data class, or the [dataClassColor](#colorAxis.
dataClassColor) is set.
 <br><br><b>default:</b><br><br>&ensp;#e6ebf5*/
	public HIColor minColor;

/**
* description: Whether to force the axis to start on a tick. Use this option with
the maxPadding option to control the axis start.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/ : False by default •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/ : True* default: true
*/
	public Boolean startOnTick;

/**
* description: Padding of the max value relative to the length of the axis. A
padding of 0.05 will make a 100px axis 5px longer.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding/ : Max padding of 0.25 on y axis* default: 0.01
*/
	public Number maxPadding;

/**
* description: The pixel length of the main tick marks on the color axis.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/ : 20 px tick length on the X axis*/
	public Number tickLength;

/**
Whether to display the colorAxis in the legend.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean showInLegend;

/**
The Z index of the grid lines.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/">A Z index of 4 renders the grid above the graph</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number gridZIndex;

/**
Whether axis, including axis title, line, ticks and labels, should
be visible.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean visible;

/**
A soft maximum for the axis. If the series data maximum is less than
this, the axis will stay at this maximum, but if the series data
maximum is higher, the axis will flex to show all data.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/">Soft min and max</a>*/
	public Number softMax;

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
For categorized axes only. If on the tick mark is placed in the
center of the category, if between the tick mark is placed between
categories. The default is between if the tickInterval is 1,
 else on.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/">"between" by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/">"on"</a> <br><br><b>accepted values:</b><br><br>&ensp;[null, "on", "between"]*/
	public String tickmarkPlacement;

/**
Color of the minor, secondary grid lines.

In styled mode, the stroke width is given in the
.highcharts-minor-grid-line class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinecolor/">Bright grey lines from Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;#f2f2f2*/
	public HIColor minorGridLineColor;

/**
A callback function returning array defining where the ticks are
laid out on the axis. This overrides the default behaviour of [tickPixelInterval](#xAxis.
tickPixelInterval) and tickInterval. The automatic
tick positions are accessible through this.tickPositions and can
be modified by the callback.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>*/
	public HIFunction tickPositioner;

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
The highest allowed value for automatically computed axis extremes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>*/
	public Number ceiling;

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
The position of the minor tick marks relative to the axis line.
 Can be one of inside and outside.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-outside/">Outside by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-inside/">Inside</a> <br><br><b>accepted values:</b><br><br>&ensp;["inside", "outside"]*/
	public String minorTickPosition;

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
Color for the main tick marks.

In styled mode, the stroke is given in the .highcharts-tick
class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickcolor/">Red ticks on X axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;#ccd6eb*/
	public HIColor tickColor;

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
The color of the line marking the axis itself.

In styled mode, the line stroke is given in the
.highcharts-axis-line or .highcharts-xaxis-line class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/">A red line on Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Axes in styled mode</a> <br><br><b>default:</b><br><br>&ensp;#ccd6eb*/
	public HIColor lineColor;

/**
The position of the major tick marks relative to the axis line.
Can be one of inside and outside.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-outside/">"outside" by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-inside/">"inside"</a> <br><br><b>accepted values:</b><br><br>&ensp;["inside", "outside"]*/
	public String tickPosition;


	public HIColorAxis() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.dataClasses != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.dataClasses) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("dataClasses", array);
		}
		if (this.minPadding != null) {
			params.put("minPadding", this.minPadding);
		}
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
		}
		if (this.maxColor != null) {
			params.put("maxColor", this.maxColor.getData());
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.stops != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.stops) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("stops", array);
		}
		if (this.dataClassColor != null) {
			params.put("dataClassColor", this.dataClassColor);
		}
		if (this.endOnTick != null) {
			params.put("endOnTick", this.endOnTick);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.tickPixelInterval != null) {
			params.put("tickPixelInterval", this.tickPixelInterval);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.gridLineWidth != null) {
			params.put("gridLineWidth", this.gridLineWidth);
		}
		if (this.tickInterval != null) {
			params.put("tickInterval", this.tickInterval);
		}
		if (this.gridLineColor != null) {
			params.put("gridLineColor", this.gridLineColor.getData());
		}
		if (this.minColor != null) {
			params.put("minColor", this.minColor.getData());
		}
		if (this.startOnTick != null) {
			params.put("startOnTick", this.startOnTick);
		}
		if (this.maxPadding != null) {
			params.put("maxPadding", this.maxPadding);
		}
		if (this.tickLength != null) {
			params.put("tickLength", this.tickLength);
		}
		if (this.showInLegend != null) {
			params.put("showInLegend", this.showInLegend);
		}
		if (this.gridZIndex != null) {
			params.put("gridZIndex", this.gridZIndex);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.softMax != null) {
			params.put("softMax", this.softMax);
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
		if (this.tickmarkPlacement != null) {
			params.put("tickmarkPlacement", this.tickmarkPlacement);
		}
		if (this.minorGridLineColor != null) {
			params.put("minorGridLineColor", this.minorGridLineColor.getData());
		}
		if (this.tickPositioner != null) {
			params.put("tickPositioner", this.tickPositioner);
		}
		if (this.minorGridLineDashStyle != null) {
			params.put("minorGridLineDashStyle", this.minorGridLineDashStyle);
		}
		if (this.minorTickLength != null) {
			params.put("minorTickLength", this.minorTickLength);
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
		if (this.ceiling != null) {
			params.put("ceiling", this.ceiling);
		}
		if (this.gridLineDashStyle != null) {
			params.put("gridLineDashStyle", this.gridLineDashStyle);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.minorTickPosition != null) {
			params.put("minorTickPosition", this.minorTickPosition);
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
		if (this.tickColor != null) {
			params.put("tickColor", this.tickColor.getData());
		}
		if (this.minorTickInterval != null) {
			params.put("minorTickInterval", this.minorTickInterval);
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
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.tickAmount != null) {
			params.put("tickAmount", this.tickAmount);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.tickPosition != null) {
			params.put("tickPosition", this.tickPosition);
		}
		return params;
	}

}