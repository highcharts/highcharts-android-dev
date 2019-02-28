/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import com.highsoft.highcharts.core.HIAbstractFoundation;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;
import com.highsoft.highcharts.common.HIColor;





public class HISeries extends HIAbstractFoundation implements HIChartsJSONSerializable {

	private ArrayList /* <Data|Number|ArrayList> */ data;
/**
/** An array of data points for the series. The points can be given in three ways:
  An array of numerical values. In this case, the numerical values will 
 	be interpreted as y values, and x values will be automatically calculated,
 	either starting at 0 and incrementing by 1, or from pointStart 
 	and pointInterval given in the plotOptions. If the axis is
 	has categories, these will be used. This option is not available for range series. Example:
 data: [0, 5, 3, 5]  An array of arrays with two values. In this case, the first value is the
 	x value and the second is the y value. If the first value is a string, it is
 	applied as the name of the point, and the x value is incremented following
 	the above rules. For range series, the arrays will be interpreted as [x, low, high]. In this cases, the X value can be skipped altogether to make use of pointStart and pointRange.
 
 Example:
 data: [[5, 2], [6, 3], [8, 2]] An array of objects with named values. In this case the objects are
 	point configuration objects as seen below. Range series values are given by low and high.
 
 Example:
 data: [{
 	name: 'Point 1',
 	color: '#00FF00',
 	y: 0
 }, {
 	name: 'Point 2',
 	color: '#FF00FF',
 	y: 5
 }]  Note that line series and derived types like spline and area, require data to be sorted by X because it interpolates mouse coordinates for the tooltip. Column and scatter series, where each point has its own mouse event, does not require sorting. 
*/
	public void setData(ArrayList /* <Data|Number|ArrayList> */ data) {
		this.data = data;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList /* <Data|Number|ArrayList> */ getData(){ return data; }

	private String id;
/**
/** An id for the series. This can be used after render time to get a pointer to the series object through chart.get(). <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-id/" target="_blank">Get series by id</a>
*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number index;
/**
/** The index of the series in the chart, affecting the internal index in the chart.series array, the visible Z index as well as the order in the legend. 
*/
	public void setIndex(Number index) {
		this.index = index;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getIndex(){ return index; }

	private Number legendIndex;
/**
/** The sequential index of the series in the legend. Try it: 	Legend in opposite order . 
*/
	public void setLegendIndex(Number legendIndex) {
		this.legendIndex = legendIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLegendIndex(){ return legendIndex; }

	private String name;
/**
/** The name of the series as shown in the legend, tooltip etc. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/name/" target="_blank">Series name</a>
*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private String stack;
/**
/** This option allows grouping series in a stacked chart. The stack option can be a string or a number or anything else, as long as the grouped series' stack options match each other. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/stack/" target="_blank">Stacked and grouped columns</a>
*/
	public void setStack(String stack) {
		this.stack = stack;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStack(){ return stack; }

	private String type;
/**
/** The type of series. Can be one of area, areaspline,
 bar, column, line, pie,
 scatter or spline. From version 2.3, arearange, areasplinerange and columnrange are supported with the highcharts-more.js component. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/type/" target="_blank">Line and column in the same chart</a> <br><br><b>accepted values:</b><br><br>&ensp;[null, "line", "spline", "column", "area", "areaspline", "pie", "arearange", "areasplinerange", "boxplot", "bubble", "columnrange", "errorbar", "funnel", "gauge", "scatter", "waterfall"]
*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Object /* Number|String */ xAxis;
/**
/** When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the axis id or the index of the axis in the xAxis array, with 0 being the first. 
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setXAxis(Object /* Number|String */ xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getXAxis(){ return xAxis; }

	private Object /* Number|String */ yAxis;
/**
/** When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the axis id or the index of the axis in the yAxis array, with 0 being the first. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/yaxis/" target="_blank">Apply the column series to the secondary Y axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setYAxis(Object /* Number|String */ yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getYAxis(){ return yAxis; }

	private Number zIndex;
/**
/** Define the visual z index of the series. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-defaults/" target="_blank">With no z index, the series defined last are on top</a>,
 			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HIPoint point;
/**
/** Properties for each single point. 
*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.point.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private Boolean selected;
/**
/** Whether to select the series initially. If showCheckbox is true, the checkbox next to the series name in the legend will be checked for a selected series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-selected/">One out of two series selected</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setSelected(Boolean selected) {
		this.selected = selected;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSelected(){ return selected; }

	private Number colorIndex;
/**
/** Styled mode only. A specific color index to use for the series, so its graphic representations are given the class name highcharts-color-{n}. 
*/
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorIndex(){ return colorIndex; }

	private Boolean clip;
/**
/** Disable this option to allow series rendering in the whole plotting area. **Note:** Clipping should be always enabled when chart.zoomType is set <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-clip/">Disabled clipping</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setClip(Boolean clip) {
		this.clip = clip;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getClip(){ return clip; }

	private HIColor negativeColor;
/**
/** The color for the parts of the graph or points that are below the threshold. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-negative-color/">Spline, area and column</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-negativecolor/">Arearange</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-negative-color/">Styled mode</a>
*/
	public void setNegativeColor(HIColor negativeColor) {
		this.negativeColor = negativeColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNegativeColor(){ return negativeColor; }

	private HIColor color;
/**
/** The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The defaults value is pulled from the options.colors array. In styled mode, the color can be defined by the colorIndex option. Also, the series color can be set with the .highcharts-series, .highcharts-color-{n}, .highcharts-{type}-series or .highcharts-series-{n} class, or individual classes given by the className option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-general/">General plot option</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-specific/">One specific series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-area/">Area color</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/infographic/">Pattern fill</a>
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number pointInterval;
/**
/** If no x values are given for the points in a series, pointInterval defines the interval of the x values. For example, if a series contains one value every decade starting from year 0, set pointInterval to 10. In true datetime axes, the pointInterval is set in milliseconds. It can be also be combined with pointIntervalUnit to draw irregular time intervals. Please note that this options applies to the _series data_, not the interval of the axis ticks, which is independent. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/">Datetime X axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;1*/
	public void setPointInterval(Number pointInterval) {
		this.pointInterval = pointInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointInterval(){ return pointInterval; }

	private Number cropThreshold;
/**
/** When the series contains less points than the crop threshold, all points are drawn, even if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series. 
*/
	public void setCropThreshold(Number cropThreshold) {
		this.cropThreshold = cropThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCropThreshold(){ return cropThreshold; }

	private HIStates states;
/**
/** A wrapper object for all the series options in specific states. 
*/
	public void setStates(HIStates states) {
		this.states = states;
		this.states.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStates getStates(){ return states; }

	private Boolean softThreshold;
/**
/** When this is true, the series will not cause the Y axis to cross the zero plane (or threshold option) unless the data actually crosses the plane. For example, if softThreshold is false, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the minPadding option. If softThreshold is true, the Y axis starts at 0. 
*/
	public void setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSoftThreshold(){ return softThreshold; }

	private HIDragDrop dragDrop;
/**
/** The draggable-points module allows points to be moved around or modified in the chart. In addition to the options mentioned under the dragDrop API structure, the module fires three events, `point.dragStart`, `point.drag` and `point.drop`. It requires the modules/draggable-points.js file to be loaded. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/resize-column">Draggable column and line series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/bar-series">Draggable bar</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-bubble">Draggable bubbles</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange">Draggable X range series</a>
*/
	public void setDragDrop(HIDragDrop dragDrop) {
		this.dragDrop = dragDrop;
		this.dragDrop.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDragDrop getDragDrop(){ return dragDrop; }

	private HIMarker marker;
/**
/** Options for the point markers of line-like series. Properties like fillColor, lineColor and lineWidth define the visual appearance of the markers. Other series types, like column series, don't have markers, but have visual options on the series level instead. In styled mode, the markers can be styled with the .highcharts-point, .highcharts-point-hover and .highcharts-point-select class names. 
*/
	public void setMarker(HIMarker marker) {
		this.marker = marker;
		this.marker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMarker getMarker(){ return marker; }

	private HITooltip tooltip;
/**
/** A configuration object for the tooltip rendering of each single series. Properties are inherited from tooltip, but only the following properties can be defined on a series level. 
*/
	public void setTooltip(HITooltip tooltip) {
		this.tooltip = tooltip;
		this.tooltip.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITooltip getTooltip(){ return tooltip; }

	private HIFunction pointDescriptionFormatter;
/**
/** Same as accessibility.pointDescriptionFormatter, but for an individual series. Overrides the chart wide configuration. 
*/
	public void setPointDescriptionFormatter(HIFunction pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDescriptionFormatter(){ return pointDescriptionFormatter; }

	private String className;
/**
/** An additional class name to apply to the series' graphical elements. This option does not replace defaults class names of the graphical element. 
*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private String dashStyle;
/**
/** A name for the dash style to use for the graph, or for some series types the outline of each shape. In styled mode, the [stroke dash-array](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-dashstyle/) can be set with the same classes as listed under series.color. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">Possible values demonstrated</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle/">Chart suitable for printing in black and white</a>
 <br><br><b>defaults:</b><br><br>&ensp;Solid*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private Object /* String, Number */ pointPlacement;
/**
/** Possible values: "on", "between", number. In a column chart, when pointPlacement is "on", the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is "between", the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart. Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding. Note that pointPlacement needs a pointRange to work. For column series this is computed, but for line-type series it needs to be set. For the xrange series type and gantt charts, if the Y axis is a category axis, the pointPlacement applies to the Y axis rather than the (typically datetime) X axis. Defaults to undefined in cartesian charts, "between" in polar charts. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-between/">Between in a column chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointplacement-numeric/">Numeric placement for custom layout</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/heatmap-pointplacement/">Placement in heatmap</a>
*/
	public void setPointPlacement(Object /* String, Number */ pointPlacement) {
		this.pointPlacement = pointPlacement;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* String, Number */ getPointPlacement(){ return pointPlacement; }

	private Boolean connectNulls;
/**
/** Whether to connect a graph line across null points, or render a gap between the two points on either side of the null. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-connectnulls-false/">False by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-connectnulls-true/">True</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setConnectNulls(Boolean connectNulls) {
		this.connectNulls = connectNulls;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getConnectNulls(){ return connectNulls; }

	private Boolean enableMouseTracking;
/**
/** Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-enablemousetracking-false/">No mouse tracking</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnableMouseTracking(){ return enableMouseTracking; }

	private HILabel label;
/**
/** Series labels are placed as close to the series as possible in a natural way, seeking to avoid other series. The goal of this feature is to make the chart more easily readable, like if a human designer placed the labels in the optimal position. The series labels currently work with series types having a graph or an area. Requires the series-label.js module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/line-chart">Line chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph">Stream graph</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-label/stock-chart">Stock chart</a>
*/
	public void setLabel(HILabel label) {
		this.label = label;
		this.label.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabel getLabel(){ return label; }

	private String stacking;
/**
/** Whether to stack the values of each series on top of each other. Possible values are undefined to disable, "normal" to stack by value or "percent". When stacking is enabled, data must be sorted in ascending X order. A special stacking option is with the streamgraph series type, where the stacking option is set to "stream". The second one is "overlap", which only applies to waterfall series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-line/">Line</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-column/">Column</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-bar/">Bar</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-area/">Area</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-line/">Line</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-column/">Column</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-bar/">Bar</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stacking-percent-area/">Area</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-waterfall-with-normal-stacking">Waterfall with normal stacking</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-waterfall-with-overlap-stacking">Waterfall with overlap stacking</a> <br><br><b>accepted values:</b><br><br>&ensp;["normal", "percent"]
*/
	public void setStacking(String stacking) {
		this.stacking = stacking;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStacking(){ return stacking; }

	private HIAnimationOptionsObject animation;
/**
/** Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see chart.animation and the animation parameter under the API methods. The following properties are supported: - duration: The duration of the animation in milliseconds. - easing: Can be a string reference to an easing function set on  the Math object or a function. See the _Custom easing function_  demo below. Due to poor performance, animation is disabled in old IE browsers for several chart types. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-disabled/">Animation disabled</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-slower/">Slower animation</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">Custom easing function</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private String findNearestPointBy;
/**
/** Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when hovering the series. Defaults to 'xy' for scatter series and 'x' for most other series. If the data has duplicate x-values, it is recommended to set this to 'xy' to allow hovering over all points. Applies only to series types using nearest neighbor search (not direct hover) for tooltip. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/findnearestpointby/">Different hover behaviors</a> <br><br><b>accepted values:</b><br><br>&ensp;["x", "xy"]
*/
	public void setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFindNearestPointBy(){ return findNearestPointBy; }

	private Number threshold;
/**
/** The threshold, also called zero level or base level. For line type series this is only used in conjunction with negativeColor. 
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getThreshold(){ return threshold; }

	private Boolean showCheckbox;
/**
/** If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the selected option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showcheckbox-true/">Show select box</a>
*/
	public void setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowCheckbox(){ return showCheckbox; }

	private String boostBlending;
/**
/** Sets the color blending in the boost module. <br><br><b>accepted values:</b><br><br>&ensp;["add", "multiply", "darken"]
 <br><br><b>defaults:</b><br><br>&ensp;undefined*/
	public void setBoostBlending(String boostBlending) {
		this.boostBlending = boostBlending;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoostBlending(){ return boostBlending; }

	private HIEvents events;
/**
/** General event handlers for the series items. These event hooks can also be attached to the series at run time using the Highcharts.addEvent function. 
*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private Number animationLimit;
/**
/** For some series, there is a limit that shuts down initial animation by defaults when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation does not run if there is more than 250 points totally. To disable this cap, set animationLimit to Infinity. 
*/
	public void setAnimationLimit(Number animationLimit) {
		this.animationLimit = animationLimit;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAnimationLimit(){ return animationLimit; }

	private String definition;
/**
/** Requires the Accessibility module. A description of the series to add to the screen reader information about the series. 
*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

	private ArrayList<String> keys;
/**
/** An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-keys/">An extended data array with keys</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-nested-keys/">Nested keys used to access object properties</a>
*/
	public void setKeys(ArrayList<String> keys) {
		this.keys = keys;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getKeys(){ return keys; }

	private Number turboThreshold;
/**
/** When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to 0 disable. 
*/
	public void setTurboThreshold(Number turboThreshold) {
		this.turboThreshold = turboThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTurboThreshold(){ return turboThreshold; }

	private Boolean skipKeyboardNavigation;
/**
/** If set to true, the accessibility module will skip past the points in this series for keyboard navigation. 
*/
	public void setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkipKeyboardNavigation(){ return skipKeyboardNavigation; }

	private Boolean allowPointSelect;
/**
/** Allow this series' points to be selected by clicking on the graphic (columns, point markers, pie slices, map areas etc). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-line/">Line</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-column/">Column</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-allowpointselect-pie/">Pie</a>
*/
	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowPointSelect(){ return allowPointSelect; }

	private String step;
/**
/** Whether to apply steps to the line. Possible values are left, center and right. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/line-step/">Different step line options</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-step/">Stepped, stacked area</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"]
*/
	public void setStep(String step) {
		this.step = step;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStep(){ return step; }

	private Boolean getExtremesFromAll;
/**
/** Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By defaults, the Y axis adjusts to the min and max of the visible data. Cartesian series only. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGetExtremesFromAll(){ return getExtremesFromAll; }

	private Boolean exposeElementToA11y;
/**
/** By defaults, series are exposed to screen readers as regions. By enabling this option, the series element itself will be exposed in the same way as the data points. This is useful if the series is not used as a grouping entity in the chart, but you still want to attach a description to the series. Requires the Accessibility module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/art-grants/">Accessible data visualization</a>
*/
	public void setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getExposeElementToA11y(){ return exposeElementToA11y; }

	private Boolean /* boolean */ shadow;
/**
/** Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing color, offsetX, offsetY, opacity and width. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-shadow/">Shadow enabled</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setShadow(Boolean /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean /* boolean */ getShadow(){ return shadow; }

	private String zoneAxis;
/**
/** Defines the Axis on which the zones are applied. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-zoneaxis-x/">Zones on the X-Axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;y*/
	public void setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public String getZoneAxis(){ return zoneAxis; }

	private ArrayList <HIZones> zones;
/**
/** An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the zoneAxis option. The zone definitions have to be in ascending order regarding to the value. In styled mode, the color zones are styled with the .highcharts-zone-{n} class, or custom classed from the className option ([view live demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/)). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/color-zones-simple/">Color zones</a>
*/
	public void setZones(ArrayList zones) {
		this.zones = zones;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getZones(){ return zones; }

	private String pointIntervalUnit;
/**
/** On datetime series, this allows for setting the pointInterval to irregular time units, day, month and year. A day is usually the same as 24 hours, but pointIntervalUnit also takes the DST crossover into consideration when dealing with local time. Combine this option with pointInterval to draw weeks, quarters, 6 months, 10 years etc. Please note that this options applies to the _series data_, not the interval of the axis ticks, which is independent. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointintervalunit/">One point a month</a> <br><br><b>accepted values:</b><br><br>&ensp;["day", "month", "year"]
*/
	public void setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointIntervalUnit(){ return pointIntervalUnit; }

	private Number lineWidth;
/**
/** Pixel width of the graph line. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-general/">On all series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-specific/">On one single series</a>
*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Boolean visible;
/**
/** Set the initial visibility of the series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-visible/">Two series, one hidden and one visible</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private String linkedTo;
/**
/** The id of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange-line/">Linked series</a>
*/
	public void setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkedTo(){ return linkedTo; }

	private Boolean stickyTracking;
/**
/** Sticky tracking of mouse events. When true, the mouseOut event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the mouseOut event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip when not shared. When stickyTracking is false and tooltip.shared is false, the tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-true/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-stickytracking-false/">False</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStickyTracking(){ return stickyTracking; }

	private HIDataLabels dataLabels;
/**
/** Options for the series data labels, appearing next to each data point. Since v6.2.0, multiple data labels can be applied to each single point by defining them as an array of configs. In styled mode, the data labels can be styled with the .highcharts-data-label-box and .highcharts-data-label class names ([see example](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels)). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled">Data labels enabled</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-multiple">Multiple data labels on a bar series</a>
*/
	public void setDataLabels(HIDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		this.dataLabels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataLabels getDataLabels(){ return dataLabels; }

	private String cursor;
/**
/** You can set the cursor to "pointer" if you have click events attached to the series, to signal to the user that the points and lines can be clicked. In styled mode, the series cursor can be set with the same classes as listed under series.color. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-line/">On line graph</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-column/">On columns</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-cursor-scatter/">On scatter markers</a>
*/
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private Number pointStart;
/**
/** If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-linear/">Linear</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-pointstart-datetime/">Datetime</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setPointStart(Number pointStart) {
		this.pointStart = pointStart;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointStart(){ return pointStart; }

	private String linecap;
/**
/** The line cap used for line ends and line joins on the graph. <br><br><b>accepted values:</b><br><br>&ensp;["round", "square"]
 <br><br><b>defaults:</b><br><br>&ensp;round*/
	public void setLinecap(String linecap) {
		this.linecap = linecap;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinecap(){ return linecap; }

	private Boolean connectEnds;
/**
/** Polar charts only. Whether to connect the ends of a line series plot across the extremes. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/line-connectends-false/">Do not connect</a>
*/
	public void setConnectEnds(Boolean connectEnds) {
		this.connectEnds = connectEnds;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getConnectEnds(){ return connectEnds; }

	private Number boostThreshold;
/**
/** Set the point threshold for when a series should enter boost mode. Setting it to e.g. 2000 will cause the series to enter boost mode when there are 2000 or more points in the series. To disable boosting on the series, set the boostThreshold to 0. Setting it to 1 will force boosting. Note that the `cropThreshold` also affects this setting. When zooming in on a series that has fewer points than the cropThreshold, all points are rendered although outside the visible plot area, and the boostThreshold won't take effect. Requires modules/boost.js. 
 <br><br><b>defaults:</b><br><br>&ensp;5000*/
	public void setBoostThreshold(Number boostThreshold) {
		this.boostThreshold = boostThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBoostThreshold(){ return boostThreshold; }

	private Boolean showInLegend;
/**
/** Whether to display this particular series or series type in the legend. The defaults value is true for standalone series, false for linked series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-showinlegend/">One series in the legend, one hidden</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowInLegend(){ return showInLegend; }



	public HISeries() {
		super();
	}

	public void hide(){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Series");
			put("method", "hide");
			put("id", uuid);
		}};
	}


//	 private Observer updateObserver = new Observer() {
//		@Override
//		public void update(Observable observable, Object o) {
//			setChanged();
//			notifyObservers();
//		}
//	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.data != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.data) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("data", array);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.index != null) {
			params.put("index", this.index);
		}
		if (this.legendIndex != null) {
			params.put("legendIndex", this.legendIndex);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.stack != null) {
			params.put("stack", this.stack);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.xAxis != null) {
			params.put("xAxis", this.xAxis);
		}
		if (this.yAxis != null) {
			params.put("yAxis", this.yAxis);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.selected != null) {
			params.put("selected", this.selected);
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.clip != null) {
			params.put("clip", this.clip);
		}
		if (this.negativeColor != null) {
			params.put("negativeColor", this.negativeColor.getData());
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.pointInterval != null) {
			params.put("pointInterval", this.pointInterval);
		}
		if (this.cropThreshold != null) {
			params.put("cropThreshold", this.cropThreshold);
		}
		if (this.states != null) {
			params.put("states", this.states.getParams());
		}
		if (this.softThreshold != null) {
			params.put("softThreshold", this.softThreshold);
		}
		if (this.dragDrop != null) {
			params.put("dragDrop", this.dragDrop.getParams());
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.tooltip != null) {
			params.put("tooltip", this.tooltip.getParams());
		}
		if (this.pointDescriptionFormatter != null) {
			params.put("pointDescriptionFormatter", this.pointDescriptionFormatter);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.pointPlacement != null) {
			params.put("pointPlacement", this.pointPlacement);
		}
		if (this.connectNulls != null) {
			params.put("connectNulls", this.connectNulls);
		}
		if (this.enableMouseTracking != null) {
			params.put("enableMouseTracking", this.enableMouseTracking);
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.stacking != null) {
			params.put("stacking", this.stacking);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.findNearestPointBy != null) {
			params.put("findNearestPointBy", this.findNearestPointBy);
		}
		if (this.threshold != null) {
			params.put("threshold", this.threshold);
		}
		if (this.showCheckbox != null) {
			params.put("showCheckbox", this.showCheckbox);
		}
		if (this.boostBlending != null) {
			params.put("boostBlending", this.boostBlending);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.animationLimit != null) {
			params.put("animationLimit", this.animationLimit);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.keys != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.keys) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("keys", array);
		}
		if (this.turboThreshold != null) {
			params.put("turboThreshold", this.turboThreshold);
		}
		if (this.skipKeyboardNavigation != null) {
			params.put("skipKeyboardNavigation", this.skipKeyboardNavigation);
		}
		if (this.allowPointSelect != null) {
			params.put("allowPointSelect", this.allowPointSelect);
		}
		if (this.step != null) {
			params.put("step", this.step);
		}
		if (this.getExtremesFromAll != null) {
			params.put("getExtremesFromAll", this.getExtremesFromAll);
		}
		if (this.exposeElementToA11y != null) {
			params.put("exposeElementToA11y", this.exposeElementToA11y);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.zoneAxis != null) {
			params.put("zoneAxis", this.zoneAxis);
		}
		if (this.zones != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.zones) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("zones", array);
		}
		if (this.pointIntervalUnit != null) {
			params.put("pointIntervalUnit", this.pointIntervalUnit);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.linkedTo != null) {
			params.put("linkedTo", this.linkedTo);
		}
		if (this.stickyTracking != null) {
			params.put("stickyTracking", this.stickyTracking);
		}
		if (this.dataLabels != null) {
			params.put("dataLabels", this.dataLabels.getParams());
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.pointStart != null) {
			params.put("pointStart", this.pointStart);
		}
		if (this.linecap != null) {
			params.put("linecap", this.linecap);
		}
		if (this.connectEnds != null) {
			params.put("connectEnds", this.connectEnds);
		}
		if (this.boostThreshold != null) {
			params.put("boostThreshold", this.boostThreshold);
		}
		if (this.showInLegend != null) {
			params.put("showInLegend", this.showInLegend);
		}
		return params;
	}

}