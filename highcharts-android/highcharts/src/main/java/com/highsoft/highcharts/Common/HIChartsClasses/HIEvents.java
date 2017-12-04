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


/**
* description: Event listeners for the chart.
*/
public class HIEvents implements HIChartsJSONSerializable { 


/**
* description: Fires when the mouse enters the area close to the point. One parameter,
event, is passed to the function, containing common event information.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/ : Show values in the chart's corner on mouse over
*/
	public HIGFunction /* Function */ mouseOver;

/**
* description: Fires when a point is clicked. One parameter, event, is passed
to the function, containing common event information.
If the series.allowPointSelect option is true, the default action
for the point's click event is to toggle the point's select state.
 Returning false cancels this action.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click/ : Click marker to alert values
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-column/ : Click column
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-url/ : Go to URL
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-point-events-click/ : Click marker to display values
*/
	public HIGFunction /* Function */ click;

/**
* description: Fires when the point is selected either programmatically or following
a click on the point. One parameter, event, is passed to the function.
 Returning false cancels the operation.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-select/ : Report the last selected point
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/ : Report select and unselect
*/
	public HIGFunction /* Function */ select;

/**
* description: Fires when the mouse leaves the area close to the point. One parameter,
event, is passed to the function, containing common event information.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/ : Show values in the chart's corner on mouse over
*/
	public HIGFunction /* Function */ mouseOut;

/**
* description: Fires when the point is unselected either programmatically or following
a click on the point. One parameter, event, is passed to the function.
 Returning false cancels the operation.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/ : Report the last unselected point
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/ : Report select and unselect
*/
	public HIGFunction /* Function */ unselect;

/**
* description: Fires when the point is updated programmatically through the .update()
method. One parameter, event, is passed to the function. The new
point options can be accessed through event.options. Returning
false cancels the operation.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-update/ : Confirm point updating
*/
	public HIGFunction /* Function */ update;

/**
* description: Fires when the point is removed using the .remove() method. One
parameter, event, is passed to the function. Returning false
cancels the operation.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-remove/ : Remove point and confirm
*/
	public HIGFunction /* Function */ remove;

/**
* description: Fires when the series is shown after chart generation time, either
by clicking the legend item or by calling .show().

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-show/ : Alert when the series is shown by clicking the legend item.
*/
	public HIGFunction /* Function */ show;

/**
* description: Fires when the checkbox next to the series' name in the legend is
clicked. One parameter, event, is passed to the function. The state
of the checkbox is found by event.checked. The checked item is
found by event.item. Return false to prevent the default action
which is to toggle the select state of the series.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/ : Alert checkbox status
*/
	public HIGFunction /* Function */ checkboxClick;

/**
* description: Fires when the series is hidden after chart generation time, either
by clicking the legend item or by calling .hide().

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-hide/ : Alert when the series is hidden by clicking the legend item
*/
	public HIGFunction /* Function */ hide;

/**
* description: Fires after the series has finished its initial animation, or in
case animation is disabled, immediately as the series is displayed.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/ : Show label after animate
*/
	public HIGFunction /* Function */ afterAnimate;

/**
* description: Fires when the legend item belonging to the series is clicked. One
parameter, event, is passed to the function. The default action
is to toggle the visibility of the series. This can be prevented
by returning false or calling event.preventDefault().

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-legenditemclick/ : Confirm hiding and showing
*/
	public HIGFunction /* Function */ legendItemClick;

/**
* description: As opposed to the setExtremes event, this event fires after the
final min and max values are computed and corrected for minRange.
Fires when the minimum and maximum is set for the axis, either by
calling the .setExtremes() method or by selecting an area in the
chart. One parameter, event, is passed to the function, containing common event information.
The new user set minimum and maximum values can be found by event.
min and event.max. These reflect the axis minimum and maximum
in axis values. The actual data extremes are found in event.dataMin
and event.dataMax.
*/
	public HIGFunction /* Function */ afterSetExtremes;

/**
* description: An event fired when a point falls inside a break from this axis.
*/
	public HIGFunction /* Function */ pointInBreak;

/**
* description: Fires when the minimum and maximum is set for the axis, either by
calling the .setExtremes() method or by selecting an area in the
chart. One parameter, event, is passed to the function, containing common event information.
The new user set minimum and maximum values can be found by event.
min and event.max. These reflect the axis minimum and maximum
in data values. When an axis is zoomed all the way out from the "Reset
zoom" button, event.min and event.max are null, and the new extremes
are set based on this.dataMin and this.dataMax.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/events-setextremes/ : Log new extremes on x axis
*/
	public HIGFunction /* Function */ setExtremes;

/**
* description: An event fired when a break from this axis occurs on a point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/ : Visualization of a Break
*/
	public HIGFunction /* Function */ pointBreak;

/**
* description: An event fired after the breaks have rendered.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-event// : AfterBreak Event
*/
	public HIGFunction /* Function */ afterBreaks;

/**
* description: Fires when an area of the chart has been selected. Selection is enabled
by setting the chart's zoomType. One parameter, event, is passed
to the function, containing common event information. The default action for the selection event is to
zoom the chart to the selected area. It can be prevented by calling
event.preventDefault().
Information on the selected area can be found through event.xAxis
and event.yAxis, which are arrays containing the axes of each dimension
and each axis' min and max values. The primary axes are event.xAxis[0]
and event.yAxis[0]. Remember the unit of a datetime axis is milliseconds
since 1970-01-01 00:00:00.
selection: function(event) {
    // log the min and max of the primary, datetime x-axis
    console.log(
        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),
        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max)
    );
    // log the min and max of the y axis
    console.log(event.yAxis[0].min, event.yAxis[0].max);
}
* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection/ : Report on selection and reset
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/ : Select a range of points through a drag selection
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/ : Select a range of points through a drag selection (Highcharts)
*/
	public HIGFunction /* Function */ selection;

/**
* description: Fires after initial load of the chart (directly after the load
event), and after each redraw (directly after the redraw event).
*/
	public HIGFunction /* Function */ render;

/**
* description: Fires when the chart is finished loading. Since v4.2.2, it also waits
for images to be loaded, for example from point markers. One parameter,
event, is passed to the function, containing common event information.
There is also a second parameter to the chart constructor where a
callback function can be passed to be executed on chart.load.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-load/ : Alert on chart load
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/events-load/ : Add series on chart load
*/
	public HIGFunction /* Function */ load;

/**
* description: In a chart with multiple drilldown series, this event fires after
all the series have been drilled up.
*/
	public HIGFunction /* Function */ drillupall;

/**
* description: Fires when a series is added to the chart after load time, using
the addSeries method. One parameter, event, is passed to the
function, containing common event information.
Through event.options you can access the series options that was
passed to the addSeries method. Returning false prevents the series
from being added.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-addseries/ : Alert on add series
*/
	public HIGFunction /* Function */ addSeries;

/**
* description: Fires when drilling up from a drilldown series.
*/
	public HIGFunction /* Function */ drillup;

/**
* description: Fires when the chart is redrawn, either after a call to chart.redraw()
or after an axis, series or point is modified with the redraw option
set to true. One parameter, event, is passed to the function, containing common event information.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-redraw/ : Alert on chart redraw
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/events-redraw/ : Alert on chart redraw when adding a series or moving the zoomed range
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/events-redraw/ : Set subtitle on chart redraw
*/
	public HIGFunction /* Function */ redraw;

/**
* description: Fires when a drilldown point is clicked, before the new series is
added. This event is also utilized for async drilldown, where the
seriesOptions are not added by option, but rather loaded async. Note
that when clicking a category label to trigger multiple series drilldown,
one drilldown event is triggered per point in the category.
Event arguments:

category
If a category label was clicked, which index.
point
The originating point.
originalEvent
The original browser event (usually click) that triggered the
drilldown.
points
If a category label was clicked, this array holds all points
corresponing to the category.
seriesOptions
Options for the new series

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/async/ : Async drilldown
*/
	public HIGFunction /* Function */ drilldown;

/**
* description: Fires after a chart is printed through the context menu item or the
Chart.print method. Requires the exporting module.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/ : Rescale the chart to print

*/
	public HIGFunction /* Function */ afterPrint;

/**
* description: Fires before a chart is printed through the context menu item or
the Chart.print method. Requires the exporting module.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/ : Rescale the chart to print

*/
	public HIGFunction /* Function */ beforePrint;


	public HIEvents() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.mouseOver != null) {
			params.put("mouseOver", this.mouseOver);
		}
		if (this.click != null) {
			params.put("click", this.click);
		}
		if (this.select != null) {
			params.put("select", this.select);
		}
		if (this.mouseOut != null) {
			params.put("mouseOut", this.mouseOut);
		}
		if (this.unselect != null) {
			params.put("unselect", this.unselect);
		}
		if (this.update != null) {
			params.put("update", this.update);
		}
		if (this.remove != null) {
			params.put("remove", this.remove);
		}
		if (this.show != null) {
			params.put("show", this.show);
		}
		if (this.checkboxClick != null) {
			params.put("checkboxClick", this.checkboxClick);
		}
		if (this.hide != null) {
			params.put("hide", this.hide);
		}
		if (this.afterAnimate != null) {
			params.put("afterAnimate", this.afterAnimate);
		}
		if (this.legendItemClick != null) {
			params.put("legendItemClick", this.legendItemClick);
		}
		if (this.afterSetExtremes != null) {
			params.put("afterSetExtremes", this.afterSetExtremes);
		}
		if (this.pointInBreak != null) {
			params.put("pointInBreak", this.pointInBreak);
		}
		if (this.setExtremes != null) {
			params.put("setExtremes", this.setExtremes);
		}
		if (this.pointBreak != null) {
			params.put("pointBreak", this.pointBreak);
		}
		if (this.afterBreaks != null) {
			params.put("afterBreaks", this.afterBreaks);
		}
		if (this.selection != null) {
			params.put("selection", this.selection);
		}
		if (this.render != null) {
			params.put("render", this.render);
		}
		if (this.load != null) {
			params.put("load", this.load);
		}
		if (this.drillupall != null) {
			params.put("drillupall", this.drillupall);
		}
		if (this.addSeries != null) {
			params.put("addSeries", this.addSeries);
		}
		if (this.drillup != null) {
			params.put("drillup", this.drillup);
		}
		if (this.redraw != null) {
			params.put("redraw", this.redraw);
		}
		if (this.drilldown != null) {
			params.put("drilldown", this.drilldown);
		}
		if (this.afterPrint != null) {
			params.put("afterPrint", this.afterPrint);
		}
		if (this.beforePrint != null) {
			params.put("beforePrint", this.beforePrint);
		}
		return params;
	}

}