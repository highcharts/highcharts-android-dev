/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.HashMap;



public class HIEvents extends HIFoundation { 

	private HIFunction checkboxClick;
	/**
 Fires when the checkbox next to the point name in the legend is clicked. One parameter, event, is passed to the function. The state of the checkbox is found by event.checked. The checked item is found by event.item. Return false to prevent the defaults action which is to toggle the select state of the series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-checkboxclick/">Alert checkbox status</a>
	*/
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
 An event fired after the breaks have rendered. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-event/">AfterBreak Event</a>
	*/
	public void setAfterBreaks(HIFunction afterBreaks) {
		this.afterBreaks = afterBreaks;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterBreaks(){ return afterBreaks; }

	private HIFunction pointBreak;
	/**
 An event fired when a break from this axis occurs on a point. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/">Visualization of a Break</a>
	*/
	public void setPointBreak(HIFunction pointBreak) {
		this.pointBreak = pointBreak;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointBreak(){ return pointBreak; }

	private HIFunction setExtremes;
	/**
 Fires when the minimum and maximum is set for the axis, either by calling the .setExtremes() method or by selecting an area in the chart. One parameter, event, is passed to the function, containing common event information. The new user set minimum and maximum values can be found by event.min and event.max. These reflect the axis minimum and maximum in data values. When an axis is zoomed all the way out from the "Reset zoom" button, event.min and event.max are null, and the new extremes are set based on this.dataMin and this.dataMax. 
	*/
	public void setSetExtremes(HIFunction setExtremes) {
		this.setExtremes = setExtremes;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSetExtremes(){ return setExtremes; }

	private HIFunction afterSetExtremes;
	/**
 As opposed to the setExtremes event, this event fires after the final min and max values are computed and corrected for minRange. Fires when the minimum and maximum is set for the axis, either by calling the .setExtremes() method or by selecting an area in the chart. One parameter, event, is passed to the function, containing common event information. The new user set minimum and maximum values can be found by event.min and event.max. These reflect the axis minimum and maximum in axis values. The actual data extremes are found in event.dataMin and event.dataMax. 
	*/
	public void setAfterSetExtremes(HIFunction afterSetExtremes) {
		this.afterSetExtremes = afterSetExtremes;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterSetExtremes(){ return afterSetExtremes; }

	private HIFunction mouseover;
	/**
 Mouse over event on a plot band. 
	*/
	public void setMouseover(HIFunction mouseover) {
		this.mouseover = mouseover;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMouseover(){ return mouseover; }

	private HIFunction mouseout;
	/**
 Mouse out event on the corner of a plot band. 
	*/
	public void setMouseout(HIFunction mouseout) {
		this.mouseout = mouseout;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMouseout(){ return mouseout; }

	private HIFunction click;
	/**
 Click event on a plot band. 
	*/
	public void setClick(HIFunction click) {
		this.click = click;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getClick(){ return click; }

	private HIFunction mousemove;
	/**
 Mouse move event on a plot band. 
	*/
	public void setMousemove(HIFunction mousemove) {
		this.mousemove = mousemove;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMousemove(){ return mousemove; }

	private HIFunction load;
	/**
 Fires when the chart is finished loading. Since v4.2.2, it also waits for images to be loaded, for example from point markers. One parameter, event, is passed to the function, containing common event information. There is also a second parameter to the chart constructor where a callback function can be passed to be executed on chart.load. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-load/">Alert on chart load</a>
	*/
	public void setLoad(HIFunction load) {
		this.load = load;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLoad(){ return load; }

	private HIFunction selection;
	/**
 Fires when an area of the chart has been selected. Selection is enabled by setting the chart's zoomType. One parameter, event, is passed to the function, containing common event information. The defaults action for the selection event is to zoom the chart to the selected area. It can be prevented by calling event.preventDefault() or return false. Information on the selected area can be found through event.xAxis and event.yAxis, which are arrays containing the axes of each dimension and each axis' min and max values. The primary axes are event.xAxis[0] and event.yAxis[0]. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00. selection: function(event) {   // log the min and max of the primary, datetime x-axis   console.log(     Highcharts.dateFormat(       '%Y-%m-%d %H:%M:%S',       event.xAxis[0].min     ),     Highcharts.dateFormat(       '%Y-%m-%d %H:%M:%S',       event.xAxis[0].max     )   );   // log the min and max of the y axis   console.log(event.yAxis[0].min, event.yAxis[0].max); } <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection/">Report on selection and reset</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-selection-points/">Select a range of points through a drag selection</a>
	*/
	public void setSelection(HIFunction selection) {
		this.selection = selection;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSelection(){ return selection; }

	private HIFunction render;
	/**
 Fires after initial load of the chart (directly after the load event), and after each redraw (directly after the redraw event). 
	*/
	public void setRender(HIFunction render) {
		this.render = render;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getRender(){ return render; }

	private HIFunction addSeries;
	/**
 Fires when a series is added to the chart after load time, using the addSeries method. One parameter, event, is passed to the function, containing common event information. Through event.options you can access the series options that were passed to the addSeries method. Returning false prevents the series from being added. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-addseries/">Alert on add series</a>
	*/
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
 Fires before a chart is printed through the context menu item or the Chart.print method. Requires the exporting module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>
	*/
	public void setBeforePrint(HIFunction beforePrint) {
		this.beforePrint = beforePrint;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getBeforePrint(){ return beforePrint; }

	private HIFunction drillupall;
	/**
 In a chart with multiple drilldown series, this event fires after all the series have been drilled up. 
	*/
	public void setDrillupall(HIFunction drillupall) {
		this.drillupall = drillupall;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDrillupall(){ return drillupall; }

	private HIFunction drilldown;
	/**
 Fires when a drilldown point is clicked, before the new series is added. This event is also utilized for async drilldown, where the seriesOptions are not added by option, but rather loaded async. Note that when clicking a category label to trigger multiple series drilldown, one drilldown event is triggered per point in the category. Event arguments: - category: If a category label was clicked, which index. - originalEvent: The original browser event (usually click) that triggered  the drilldown. - point: The originating point. - points: If a category label was clicked, this array holds all points  corresponing to the category. - seriesOptions: Options for the new series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/async/">Async drilldown</a>
	*/
	public void setDrilldown(HIFunction drilldown) {
		this.drilldown = drilldown;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDrilldown(){ return drilldown; }

	private HIFunction redraw;
	/**
 Fires when the chart is redrawn, either after a call to chart.redraw() or after an axis, series or point is modified with the redraw option set to true. One parameter, event, is passed to the function, containing common event information. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-redraw/">Alert on chart redraw</a>
	*/
	public void setRedraw(HIFunction redraw) {
		this.redraw = redraw;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getRedraw(){ return redraw; }

	private HIFunction afterPrint;
	/**
 Fires after a chart is printed through the context menu item or the Chart.print method. Requires the exporting module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/">Rescale the chart to print</a>
	*/
	public void setAfterPrint(HIFunction afterPrint) {
		this.afterPrint = afterPrint;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterPrint(){ return afterPrint; }

	private HIFunction unselect;
	/**
 Fires when the point is unselected either programmatically or following a click on the point. One parameter, event, is passed to the function. Returning false cancels the operation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-unselect/">Report the last unselected point</a>
	*/
	public void setUnselect(HIFunction unselect) {
		this.unselect = unselect;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getUnselect(){ return unselect; }

	private HIFunction drop;
	/**
 Callback that fires when the point is dropped. The parameters passed are the same as for drag. To stop the defaults drop action, return false. See `drag and drop options`. Requires the draggable-points module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
	*/
	public void setDrop(HIFunction drop) {
		this.drop = drop;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDrop(){ return drop; }

	private HIFunction update;
	/**
 Fires when the point is updated programmatically through the .update() method. One parameter, event, is passed to the function. The new point options can be accessed through event.options. Returning false cancels the operation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-update/">Confirm point updating</a>
	*/
	public void setUpdate(HIFunction update) {
		this.update = update;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getUpdate(){ return update; }

	private HIFunction remove;
	/**
 Fires when the point is removed using the .remove() method. One parameter, event, is passed to the function. Returning false cancels the operation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-remove/">Remove point and confirm</a>
	*/
	public void setRemove(HIFunction remove) {
		this.remove = remove;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getRemove(){ return remove; }

	private HIFunction drag;
	/**
 Callback that fires while dragging a point. The mouse event is passed in as parameter. The original data can be accessed from e.origin, and the new point values can be accessed from e.newPoints. If there is only a single point being updated, it can be accessed from e.newPoint for simplicity, and its ID can be accessed from e.newPointId. The this context is the point being dragged. To stop the defaults drag action, return false. See `drag and drop options`. Requires the draggable-points module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
	*/
	public void setDrag(HIFunction drag) {
		this.drag = drag;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDrag(){ return drag; }

	private HIFunction mouseOut;
	/**
 Fires when the mouse leaves the area close to the point. One parameter, event, is passed to the function, containing common event information. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
	*/
	public void setMouseOut(HIFunction mouseOut) {
		this.mouseOut = mouseOut;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMouseOut(){ return mouseOut; }

	private HIFunction mouseOver;
	/**
 Fires when the mouse enters the area close to the point. One parameter, event, is passed to the function, containing common event information. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Show values in the chart's corner on mouse over</a>
	*/
	public void setMouseOver(HIFunction mouseOver) {
		this.mouseOver = mouseOver;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getMouseOver(){ return mouseOver; }

	private HIFunction select;
	/**
 Fires when the point is selected either programmatically or following a click on the point. One parameter, event, is passed to the function. Returning false cancels the operation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-select/">Report the last selected point</a>
	*/
	public void setSelect(HIFunction select) {
		this.select = select;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSelect(){ return select; }

	private HIFunction dragStart;
	/**
 Callback that fires when starting to drag a point. The mouse event object is passed in as an argument. If a drag handle is used, e.updateProp is set to the data property being dragged. The this context is the point. See `drag and drop options`. Requires the draggable-points module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Drag events</a>
	*/
	public void setDragStart(HIFunction dragStart) {
		this.dragStart = dragStart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDragStart(){ return dragStart; }

	private HIFunction setRootNode;
	/**
 Fires on a request for change of root node for the tree, before the update is made. An event object is passed to the function, containing additional properties newRootId, previousRootId, redraw and trigger. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-events-setrootnode/">Alert update information on setRootNode event.</a>
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setSetRootNode(HIFunction setRootNode) {
		this.setRootNode = setRootNode;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSetRootNode(){ return setRootNode; }

	private HIFunction selectButton;
	/**
 Event fired on a button click. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui/">Change icon in a dropddown on event</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui-buttons/">Change button class on event</a>
	*/
	public void setSelectButton(HIFunction selectButton) {
		this.selectButton = selectButton;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSelectButton(){ return selectButton; }

	private HIFunction showPopup;
	/**
 A showPopup event. Fired when selecting for example an annotation. 
	*/
	public void setShowPopup(HIFunction showPopup) {
		this.showPopup = showPopup;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getShowPopup(){ return showPopup; }

	private HIFunction hidePopup;
	/**
 A hidePopop event. Fired when Popup should be hidden, for exampole when clicking on an annotation again. 
	*/
	public void setHidePopup(HIFunction hidePopup) {
		this.hidePopup = hidePopup;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getHidePopup(){ return hidePopup; }

	private HIFunction deselectButton;
	/**
 Event fired when button state should change, for example after adding an annotation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui/">Change icon in a dropddown on event</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/gui-buttons/">Change button class on event</a>
	*/
	public void setDeselectButton(HIFunction deselectButton) {
		this.deselectButton = deselectButton;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDeselectButton(){ return deselectButton; }

	private HIFunction legendItemClick;
	/**
 Fires when the legend item belonging to the colorAxis is clicked. One parameter, event, is passed to the function. 
	*/
	public void setLegendItemClick(HIFunction legendItemClick) {
		this.legendItemClick = legendItemClick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLegendItemClick(){ return legendItemClick; }

	private HIFunction hide;
	/**
 Fires when the series is hidden after chart generation time, either by clicking the legend item or by calling .hide(). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-hide/">Alert when the series is hidden by clicking the legend item</a>
	*/
	public void setHide(HIFunction hide) {
		this.hide = hide;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getHide(){ return hide; }

	private HIFunction show;
	/**
 Fires when the series is shown after chart generation time, either by clicking the legend item or by calling .show(). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-show/">Alert when the series is shown by clicking the legend item.</a>
	*/
	public void setShow(HIFunction show) {
		this.show = show;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getShow(){ return show; }

	private HIFunction afterAnimate;
	/**
 Fires after the series has finished its initial animation, or in case animation is disabled, immediately as the series is displayed. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-events-afteranimate/">Show label after animate</a>
	*/
	public void setAfterAnimate(HIFunction afterAnimate) {
		this.afterAnimate = afterAnimate;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterAnimate(){ return afterAnimate; }

	private HIFunction add;
	/**
 Event callback when annotation is added to the chart. 
	*/
	public void setAdd(HIFunction add) {
		this.add = add;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAdd(){ return add; }

	private HIFunction afterUpdate;
	/**
 Event callback when annotation is updated (e.g.draganddropppedorresizedbycontrolpoints). 
	*/
	public void setAfterUpdate(HIFunction afterUpdate) {
		this.afterUpdate = afterUpdate;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAfterUpdate(){ return afterUpdate; }



	public HIEvents() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
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
		if (this.mouseover != null) {
			params.put("mouseover", this.mouseover);
		}
		if (this.mouseout != null) {
			params.put("mouseout", this.mouseout);
		}
		if (this.click != null) {
			params.put("click", this.click);
		}
		if (this.mousemove != null) {
			params.put("mousemove", this.mousemove);
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
		if (this.unselect != null) {
			params.put("unselect", this.unselect);
		}
		if (this.drop != null) {
			params.put("drop", this.drop);
		}
		if (this.update != null) {
			params.put("update", this.update);
		}
		if (this.remove != null) {
			params.put("remove", this.remove);
		}
		if (this.drag != null) {
			params.put("drag", this.drag);
		}
		if (this.mouseOut != null) {
			params.put("mouseOut", this.mouseOut);
		}
		if (this.mouseOver != null) {
			params.put("mouseOver", this.mouseOver);
		}
		if (this.select != null) {
			params.put("select", this.select);
		}
		if (this.dragStart != null) {
			params.put("dragStart", this.dragStart);
		}
		if (this.setRootNode != null) {
			params.put("setRootNode", this.setRootNode);
		}
		if (this.selectButton != null) {
			params.put("selectButton", this.selectButton);
		}
		if (this.showPopup != null) {
			params.put("showPopup", this.showPopup);
		}
		if (this.hidePopup != null) {
			params.put("hidePopup", this.hidePopup);
		}
		if (this.deselectButton != null) {
			params.put("deselectButton", this.deselectButton);
		}
		if (this.legendItemClick != null) {
			params.put("legendItemClick", this.legendItemClick);
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
		if (this.add != null) {
			params.put("add", this.add);
		}
		if (this.afterUpdate != null) {
			params.put("afterUpdate", this.afterUpdate);
		}
		return params;
	}

}