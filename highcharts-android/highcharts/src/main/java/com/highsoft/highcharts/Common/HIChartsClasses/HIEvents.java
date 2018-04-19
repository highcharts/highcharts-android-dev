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
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HIEvents extends Observable implements HIChartsJSONSerializable { 

	private HIFunction legendItemClick;
/**
Not applicable to pies, as the legend item is per point. See point.
events.
*/
	public void setLegendItemClick(HIFunction legendItemClick) {
		this.legendItemClick = legendItemClick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLegendItemClick(){ return legendItemClick; }

	private HIFunction checkboxClick;
/**
Fires when the checkbox next to the point name in the legend is clicked.
One parameter, event, is passed to the function. The state of the
checkbox is found by event.checked. The checked item is found by
event.item. Return false to prevent the default action which is to
toggle the select state of the series.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/">Alert checkbox status</a>*/
	public void setCheckboxClick(HIFunction checkboxClick) {
		this.checkboxClick = checkboxClick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getCheckboxClick(){ return checkboxClick; }

	private HIFunction pointInBreak;
/**
An event fired when a point falls inside a break from this axis.
*/
	public void setPointInBreak(HIFunction pointInBreak) {
		this.pointInBreak = pointInBreak;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointInBreak(){ return pointInBreak; }

	private HIFunction afterBreaks;
/**
An event fired after the breaks have rendered.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-event/">AfterBreak Event</a>*/
	public void setAfterBreaks(HIFunction afterBreaks) {
		this.afterBreaks = afterBreaks;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterBreaks(){ return afterBreaks; }

	private HIFunction pointBreak;
/**
An event fired when a break from this axis occurs on a point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/">Visualization of a Break</a>*/
	public void setPointBreak(HIFunction pointBreak) {
		this.pointBreak = pointBreak;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointBreak(){ return pointBreak; }

	private HIFunction setExtremes;
/**
Fires when the minimum and maximum is set for the axis, either by
calling the .setExtremes() method or by selecting an area in the
chart. One parameter, event, is passed to the function,
containing common event information.

The new user set minimum and maximum values can be found by
event.min and event.max. These reflect the axis minimum and
maximum in data values. When an axis is zoomed all the way out from
the "Reset zoom" button, event.min and event.max are null, and
the new extremes are set based on this.dataMin and this.dataMax.
*/
	public void setSetExtremes(HIFunction setExtremes) {
		this.setExtremes = setExtremes;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSetExtremes(){ return setExtremes; }

	private HIFunction afterSetExtremes;
/**
As opposed to the setExtremes event, this event fires after the
final min and max values are computed and corrected for minRange.


Fires when the minimum and maximum is set for the axis, either by
calling the .setExtremes() method or by selecting an area in the
chart. One parameter, event, is passed to the function, containing
common event information.

The new user set minimum and maximum values can be found by
event.min and event.max. These reflect the axis minimum and
maximum in axis values. The actual data extremes are found in
event.dataMin and event.dataMax.
*/
	public void setAfterSetExtremes(HIFunction afterSetExtremes) {
		this.afterSetExtremes = afterSetExtremes;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterSetExtremes(){ return afterSetExtremes; }

	private HIFunction unselect;
/**
Fires when the point is unselected either programmatically or
following a click on the point. One parameter, event, is passed
to the function.
 Returning false cancels the operation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/">Report the last unselected point</a>*/
	public void setUnselect(HIFunction unselect) {
		this.unselect = unselect;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getUnselect(){ return unselect; }

	private HIFunction update;
/**
Fires when the point is updated programmatically through the
.update() method. One parameter, event, is passed to the
function. The new point options can be accessed through
event.options. Returning false cancels the operation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-update/">Confirm point updating</a>*/
	public void setUpdate(HIFunction update) {
		this.update = update;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getUpdate(){ return update; }

	private HIFunction remove;
/**
Fires when the point is removed using the .remove() method. One
parameter, event, is passed to the function. Returning false
cancels the operation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-remove/">Remove point and confirm</a>*/
	public void setRemove(HIFunction remove) {
		this.remove = remove;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getRemove(){ return remove; }

	private HIFunction mouseOut;
/**
Fires when the mouse leaves the area close to the point. One
parameter, event, is passed to the function, containing common
event information.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>*/
	public void setMouseOut(HIFunction mouseOut) {
		this.mouseOut = mouseOut;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMouseOut(){ return mouseOut; }

	private HIFunction mouseOver;
/**
Fires when the mouse enters the area close to the point. One
parameter, event, is passed to the function, containing common
event information.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>*/
	public void setMouseOver(HIFunction mouseOver) {
		this.mouseOver = mouseOver;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMouseOver(){ return mouseOver; }

	private HIFunction click;
/**
Fires when a point is clicked. One parameter, event, is passed
to the function, containing common event information.

If the series.allowPointSelect option is true, the default
action for the point's click event is to toggle the point's
select state. Returning false cancels this action.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click/">Click marker to alert values</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-column/">Click column</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-click-url/">Go to URL</a>*/
	public void setClick(HIFunction click) {
		this.click = click;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getClick(){ return click; }

	private HIFunction select;
/**
Fires when the point is selected either programmatically or
following a click on the point. One parameter, event, is passed
to the function. Returning false cancels the operation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-select/">Report the last selected point</a>*/
	public void setSelect(HIFunction select) {
		this.select = select;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSelect(){ return select; }

	private HIFunction hide;
/**
Fires when the series is hidden after chart generation time, either
by clicking the legend item or by calling .hide().
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-hide/">Alert when the series is hidden by clicking the legend item</a>*/
	public void setHide(HIFunction hide) {
		this.hide = hide;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getHide(){ return hide; }

	private HIFunction show;
/**
Fires when the series is shown after chart generation time, either
by clicking the legend item or by calling .show().
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-show/">Alert when the series is shown by clicking the legend item.</a>*/
	public void setShow(HIFunction show) {
		this.show = show;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getShow(){ return show; }

	private HIFunction afterAnimate;
/**
Fires after the series has finished its initial animation, or in
case animation is disabled, immediately as the series is displayed.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>*/
	public void setAfterAnimate(HIFunction afterAnimate) {
		this.afterAnimate = afterAnimate;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterAnimate(){ return afterAnimate; }

	private HIFunction load;
/**
Fires when the chart is finished loading. Since v4.2.2, it also waits
for images to be loaded, for example from point markers. One parameter,
event, is passed to the function, containing common event information.

There is also a second parameter to the chart constructor where a
callback function can be passed to be executed on chart.load.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-load/">Alert on chart load</a>*/
	public void setLoad(HIFunction load) {
		this.load = load;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLoad(){ return load; }

	private HIFunction selection;
/**
Fires when an area of the chart has been selected. Selection is enabled
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
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection/">Report on selection and reset</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection</a>*/
	public void setSelection(HIFunction selection) {
		this.selection = selection;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSelection(){ return selection; }

	private HIFunction render;
/**
Fires after initial load of the chart (directly after the load
event), and after each redraw (directly after the redraw event).
*/
	public void setRender(HIFunction render) {
		this.render = render;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getRender(){ return render; }

	private HIFunction addSeries;
/**
Fires when a series is added to the chart after load time, using
the addSeries method. One parameter, event, is passed to the
function, containing common event information.
Through event.options you can access the series options that was
passed to the addSeries method. Returning false prevents the series
from being added.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-addseries/">Alert on add series</a>*/
	public void setAddSeries(HIFunction addSeries) {
		this.addSeries = addSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAddSeries(){ return addSeries; }

	private HIFunction drillup;
/**
Fires when drilling up from a drilldown series.
*/
	public void setDrillup(HIFunction drillup) {
		this.drillup = drillup;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDrillup(){ return drillup; }

	private HIFunction beforePrint;
/**
Fires before a chart is printed through the context menu item or
the Chart.print method. Requires the exporting module.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>*/
	public void setBeforePrint(HIFunction beforePrint) {
		this.beforePrint = beforePrint;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getBeforePrint(){ return beforePrint; }

	private HIFunction drillupall;
/**
In a chart with multiple drilldown series, this event fires after
all the series have been drilled up.
*/
	public void setDrillupall(HIFunction drillupall) {
		this.drillupall = drillupall;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDrillupall(){ return drillupall; }

	private HIFunction drilldown;
/**
Fires when a drilldown point is clicked, before the new series is
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

 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/async/">Async drilldown</a>*/
	public void setDrilldown(HIFunction drilldown) {
		this.drilldown = drilldown;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDrilldown(){ return drilldown; }

	private HIFunction redraw;
/**
Fires when the chart is redrawn, either after a call to chart.redraw()
or after an axis, series or point is modified with the redraw option
set to true. One parameter, event, is passed to the function, containing common event information.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-redraw/">Alert on chart redraw</a>*/
	public void setRedraw(HIFunction redraw) {
		this.redraw = redraw;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getRedraw(){ return redraw; }

	private HIFunction afterPrint;
/**
Fires after a chart is printed through the context menu item or the
Chart.print method. Requires the exporting module.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>*/
	public void setAfterPrint(HIFunction afterPrint) {
		this.afterPrint = afterPrint;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterPrint(){ return afterPrint; }



	public HIEvents() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.legendItemClick != null) {
			params.put("legendItemClick", this.legendItemClick);
		}
		if (this.checkboxClick != null) {
			params.put("checkboxClick", this.checkboxClick);
		}
		if (this.pointInBreak != null) {
			params.put("pointInBreak", this.pointInBreak);
		}
		if (this.afterBreaks != null) {
			params.put("afterBreaks", this.afterBreaks);
		}
		if (this.pointBreak != null) {
			params.put("pointBreak", this.pointBreak);
		}
		if (this.setExtremes != null) {
			params.put("setExtremes", this.setExtremes);
		}
		if (this.afterSetExtremes != null) {
			params.put("afterSetExtremes", this.afterSetExtremes);
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
		if (this.mouseOut != null) {
			params.put("mouseOut", this.mouseOut);
		}
		if (this.mouseOver != null) {
			params.put("mouseOver", this.mouseOver);
		}
		if (this.click != null) {
			params.put("click", this.click);
		}
		if (this.select != null) {
			params.put("select", this.select);
		}
		if (this.hide != null) {
			params.put("hide", this.hide);
		}
		if (this.show != null) {
			params.put("show", this.show);
		}
		if (this.afterAnimate != null) {
			params.put("afterAnimate", this.afterAnimate);
		}
		if (this.load != null) {
			params.put("load", this.load);
		}
		if (this.selection != null) {
			params.put("selection", this.selection);
		}
		if (this.render != null) {
			params.put("render", this.render);
		}
		if (this.addSeries != null) {
			params.put("addSeries", this.addSeries);
		}
		if (this.drillup != null) {
			params.put("drillup", this.drillup);
		}
		if (this.beforePrint != null) {
			params.put("beforePrint", this.beforePrint);
		}
		if (this.drillupall != null) {
			params.put("drillupall", this.drillupall);
		}
		if (this.drilldown != null) {
			params.put("drilldown", this.drilldown);
		}
		if (this.redraw != null) {
			params.put("redraw", this.redraw);
		}
		if (this.afterPrint != null) {
			params.put("afterPrint", this.afterPrint);
		}
		return params;
	}

}