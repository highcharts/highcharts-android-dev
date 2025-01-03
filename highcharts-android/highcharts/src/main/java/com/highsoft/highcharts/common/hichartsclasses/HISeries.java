/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HISeries extends HIFoundation {

	private ArrayList /* <Data|Number|ArrayList> */ data;
	/**
 An array of data points for the series. The points can be given in three ways:
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
 An id for the series. This can be used after render time to get a pointer to the series object through chart.get(). 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number index;
	/**
 The index of the series in the chart, affecting the internal index in the chart.series array, the visible Z index as well as the order in the legend. 
	*/
	public void setIndex(Number index) {
		this.index = index;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getIndex(){ return index; }

	private Number legendIndex;
	/**
 The sequential index of the series in the legend. Try it: 	Legend in opposite order . 
	*/
	public void setLegendIndex(Number legendIndex) {
		this.legendIndex = legendIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLegendIndex(){ return legendIndex; }

	private String name;
	/**
 The name of the series as shown in the legend, tooltip etc. 
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private String stack;
	/**
 This option allows grouping series in a stacked chart. The stack option can be a string or a number or anything else, as long as the grouped series' stack options match each other. 
	*/
	public void setStack(String stack) {
		this.stack = stack;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStack(){ return stack; }

	public enum Type {
		LINE("line"),
		SPLINE("spline"),
		COLUMN("column"),
		AREA("area"),
		AREASPLINE("areaspline"),
		PIE("pie"),
		AREARANGE("arearange"),
		AREASPLINERANGE("areasplinerange"),
		BOXPLOT("boxplot"),
		BUBBLE("bubble"),
		COLUMNRANGE("columnrange"),
		ERRORBAR("errorbar"),
		FUNNEL("funnel"),
		GAUGE("gauge"),
		SCATTER("scatter"),
		WATERFALL("waterfall");

		private final String value;

		Type(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setType(Type type) {
		this.type = type.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String type;
	/**
 The type of series. Can be one of area, areaspline,
 bar, column, line, pie,
 scatter or spline. From version 2.3, arearange, areasplinerange and columnrange are supported with the highcharts-more.js component. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Object /* Number|String */ xAxis;
	/**
 When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the axis id or the index of the axis in the xAxis array, with 0 being the first. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setXAxis(Object /* Number|String */ xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getXAxis(){ return xAxis; }

	private Object /* Number|String */ yAxis;
	/**
 When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the axis id or the index of the axis in the yAxis array, with 0 being the first. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setYAxis(Object /* Number|String */ yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getYAxis(){ return yAxis; }

	private Number zIndex;
	/**
 Define the visual z index of the series. 
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HIFunction descriptionFormatter;
	/**
 Formatter function to use instead of the defaults for series descriptions. Receives one argument, `series`, referring to the series to describe. Should return a string with the description of the series for a screen reader user. If `false` is returned, the defaults formatter will be used for that series. 
	*/
	public void setDescriptionFormatter(HIFunction descriptionFormatter) {
		this.descriptionFormatter = descriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDescriptionFormatter(){ return descriptionFormatter; }

	private Number pointDescriptionEnabledThreshold;
	/**
 When a series contains more points than this, we no longer expose information about individual points to screen readers. Set to `false` to disable. 
 <br><br><b>defaults:</b><br><br>&ensp;200	*/
	public void setPointDescriptionEnabledThreshold(Number pointDescriptionEnabledThreshold) {
		this.pointDescriptionEnabledThreshold = pointDescriptionEnabledThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointDescriptionEnabledThreshold(){ return pointDescriptionEnabledThreshold; }

	private String descriptionFormat;
	/**
 Format to use for describing the data series group to assistive technology - including screen readers. The series context and its subproperties are available under the variable `{series}`, for example `{series.name}` for the series name, and `{series.points.length}` for the number of data points. The chart context and its subproperties are available under the variable `{chart}`, for example `{chart.series.length}` for the number of series in the chart. `{seriesDescription}` refers to the automatic description of the series type and number of points added by Highcharts by defaults. `{authorDescription}` refers to the description added in `series.description` if one is present. `{axisDescription}` refers to the description added if the chart has multiple X or Y axes. Note that if `series.descriptionFormatter` is declared it will take precedence, and this option will be overridden. 
 <br><br><b>defaults:</b><br><br>&ensp;{seriesDescription}{authorDescription}{axisDescription}	*/
	public void setDescriptionFormat(String descriptionFormat) {
		this.descriptionFormat = descriptionFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDescriptionFormat(){ return descriptionFormat; }

	private Boolean describeSingleSeries;
	/**
 Whether or not to add series descriptions to charts with a single series. 
	*/
	public void setDescribeSingleSeries(Boolean describeSingleSeries) {
		this.describeSingleSeries = describeSingleSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDescribeSingleSeries(){ return describeSingleSeries; }

	private String definition;
	/**
 User supplied description text. This is added in the point comment description by defaults if present. `{description}` refers to the value given in `point.accessibility.description`. 
 <br><br><b>defaults:</b><br><br>&ensp;{description}	*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

	private String xAxisDescription;
	/**
 X-axis description for series if there are multiple xAxes in the chart. 
 <br><br><b>defaults:</b><br><br>&ensp;X axis, {name}	*/
	public void setXAxisDescription(String xAxisDescription) {
		this.xAxisDescription = xAxisDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisDescription(){ return xAxisDescription; }

	private String yAxisDescription;
	/**
 Y-axis description for series if there are multiple yAxes in the chart. 
 <br><br><b>defaults:</b><br><br>&ensp;Y axis, {name}	*/
	public void setYAxisDescription(String yAxisDescription) {
		this.yAxisDescription = yAxisDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYAxisDescription(){ return yAxisDescription; }

	private String pointAnnotationsDescription;
	/**
 Description for annotations on a point, as it is made available to assistive technology. 
 <br><br><b>defaults:</b><br><br>&ensp;{#each annotations}Annotation: {this}{/each}	*/
	public void setPointAnnotationsDescription(String pointAnnotationsDescription) {
		this.pointAnnotationsDescription = pointAnnotationsDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointAnnotationsDescription(){ return pointAnnotationsDescription; }

	private HISummary summary;
	/**
 Lang configuration for the series main summary. Each series type has two modes: 1. This series type is the only series type used in the  chart 2. This is a combination chart with multiple series types If a definition does not exist for the specific series type and mode, the 'defaults' lang definitions are used. Chart and its subproperties can be accessed with the `{chart}` variable. The series and its subproperties can be accessed with the `{series}` variable. The series index (starting from 1) can be accessed with the `{seriesNumber}` variable. 
	*/
	public void setSummary(HISummary summary) {
		this.summary = summary;
		this.summary.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISummary getSummary(){ return summary; }

	private String nullPointValue;
	/**
 Description for the value of null points. 
 <br><br><b>defaults:</b><br><br>&ensp;No value	*/
	public void setNullPointValue(String nullPointValue) {
		this.nullPointValue = nullPointValue;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNullPointValue(){ return nullPointValue; }

	private Boolean includeInDataExport;
	/**
 When set to `false` will prevent the series data from being included in any form of data export. Since version 6.0.0 until 7.1.0 the option was existing undocumented as `includeInCSVExport`. 
	*/
	public void setIncludeInDataExport(Boolean includeInDataExport) {
		this.includeInDataExport = includeInDataExport;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIncludeInDataExport(){ return includeInDataExport; }

	private Number colorIndex;
	/**
 Styled mode only. A specific color index to use for the series, so its graphic representations are given the class name `highcharts-color-{n}`. Since v11, CSS variables on the form `--highcharts-color-{n}` make changing the color scheme very convenient. 
	*/
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorIndex(){ return colorIndex; }

	private Boolean clip;
	/**
 Disable this option to allow series rendering in the whole plotting area. **Note:** Clipping should be always enabled when `chart.zoomType` is set 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setClip(Boolean clip) {
		this.clip = clip;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getClip(){ return clip; }

	private HIColor negativeColor;
	/**
 The color for the parts of the graph or points that are below the `threshold`. Note that `zones` takes precedence over the negative color. Using `negativeColor` is equivalent to applying a zone with value of 0. 
	*/
	public void setNegativeColor(HIColor negativeColor) {
		this.negativeColor = negativeColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNegativeColor(){ return negativeColor; }

	private HIColor color;
	/**
 The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The defaults value is pulled from the `options.colors` array. In styled mode, the color can be defined by the `colorIndex` option. Also, the series color can be set with the `.highcharts-series`, `.highcharts-color-{n}`, `.highcharts-{type}-series` or `.highcharts-series-{n}` class, or individual classes given by the `className` option. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number pointInterval;
	/**
 If no x values are given for the points in a series, `pointInterval` defines the interval of the x values. For example, if a series contains one value every decade starting from year 0, set `pointInterval` to `10`. In true `datetime` axes, the `pointInterval` is set in milliseconds. It can be also be combined with `pointIntervalUnit` to draw irregular time intervals. If combined with `relativeXValue`, an x value can be set on each point, and the `pointInterval` is added x times to the `pointStart` setting. Please note that this options applies to the _series data_, not the interval of the axis ticks, which is independent. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setPointInterval(Number pointInterval) {
		this.pointInterval = pointInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointInterval(){ return pointInterval; }

	private Number cropThreshold;
	/**
 When the series contains less points than the crop threshold, all points are drawn, even if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series. 
 <br><br><b>defaults:</b><br><br>&ensp;300	*/
	public void setCropThreshold(Number cropThreshold) {
		this.cropThreshold = cropThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCropThreshold(){ return cropThreshold; }

	private HIStates states;
	public void setStates(HIStates states) {
		this.states = states;
		this.states.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStates getStates(){ return states; }

	private String colorKey;
	/**
 Determines what data value should be used to calculate point color if `colorAxis` is used. Requires to set `min` and `max` if some custom point property is used or if approximation for data grouping is set to `'sum'`. 
 <br><br><b>defaults:</b><br><br>&ensp;y	*/
	public void setColorKey(String colorKey) {
		this.colorKey = colorKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColorKey(){ return colorKey; }

	private Boolean softThreshold;
	/**
 When this is true, the series will not cause the Y axis to cross the zero plane (or `threshold` option) unless the data actually crosses the plane. For example, if `softThreshold` is `false`, a series of 0, 1, 2, 3 will make the Y axis show negative values according to the `minPadding` option. If `softThreshold` is `true`, the Y axis starts at 0. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSoftThreshold(){ return softThreshold; }

	private HIDragDrop dragDrop;
	/**
 The draggable-points module allows points to be moved around or modified in the chart. In addition to the options mentioned under the `dragDrop` API structure, the module fires three events, `point.dragStart`, `point.drag` and `point.drop`. 
	*/
	public void setDragDrop(HIDragDrop dragDrop) {
		this.dragDrop = dragDrop;
		this.dragDrop.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDragDrop getDragDrop(){ return dragDrop; }

	private HIPoint point;
	/**
 Properties for each single point. 
	*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.point.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private HIDataSortingOptionsObject dataSorting;
	/**
 Options for the series data sorting. 
	*/
	public void setDataSorting(HIDataSortingOptionsObject dataSorting) {
		this.dataSorting = dataSorting;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataSortingOptionsObject getDataSorting(){ return dataSorting; }

	private HIMarker marker;
	/**
 Options for the point markers of line and scatter-like series. Properties like `fillColor`, `lineColor` and `lineWidth` define the visual appearance of the markers. The `symbol` option defines the shape. Other series types, like column series, don't have markers, but have visual options on the series level instead. In styled mode, the markers can be styled with the `.highcharts-point`, `.highcharts-point-hover` and `.highcharts-point-select` class names. 
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
 A configuration object for the tooltip rendering of each single series. Properties are inherited from `tooltip`, but only the following properties can be defined on a series level. 
	*/
	public void setTooltip(HITooltip tooltip) {
		this.tooltip = tooltip;
		this.tooltip.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITooltip getTooltip(){ return tooltip; }

	private HILabel label;
	/**
 Series labels are placed as close to the series as possible in a natural way, seeking to avoid other series. The goal of this feature is to make the chart more easily readable, like if a human designer placed the labels in the optimal position. The series labels currently work with series types having a `graph` or an `area`. 
	*/
	public void setLabel(HILabel label) {
		this.label = label;
		this.label.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabel getLabel(){ return label; }

	private HIFunction pointDescriptionFormatter;
	/**
 Same as `accessibility.series.descriptionFormatter`, but for an individual series. Overrides the chart wide configuration. 
	*/
	public void setPointDescriptionFormatter(HIFunction pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDescriptionFormatter(){ return pointDescriptionFormatter; }

	private String cursor;
	/**
 You can set the cursor to "pointer" if you have click events attached to the series, to signal to the user that the points and lines can be clicked. In styled mode, the series cursor can be set with the same classes as listed under `series.color`. 
	*/
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private String dashStyle;
	/**
 Name of the dash style to use for the graph, or for some series types the outline of each shape. In styled mode, the [stroke dash-array](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-dashstyle/) can be set with the same classes as listed under `series.color`. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private Object /* String, Number */ pointPlacement;
	/**
 Possible values: `"on"`, `"between"`, `number`. In a column chart, when pointPlacement is `"on"`, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is `"between"`, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart. Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding. Note that pointPlacement needs a `pointRange` to work. For column series this is computed, but for line-type series it needs to be set. For the `xrange` series type and gantt charts, if the Y axis is a category axis, the `pointPlacement` applies to the Y axis rather than the (typically datetime) X axis. Defaults to `undefined` in cartesian charts, `"between"` in polar charts. 
	*/
	public void setPointPlacement(Object /* String, Number */ pointPlacement) {
		this.pointPlacement = pointPlacement;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* String, Number */ getPointPlacement(){ return pointPlacement; }

	private Boolean connectNulls;
	/**
 Whether to connect a graph line across null points, or render a gap between the two points on either side of the null. In stacked area chart, if `connectNulls` is set to true, null points are interpreted as 0. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setConnectNulls(Boolean connectNulls) {
		this.connectNulls = connectNulls;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getConnectNulls(){ return connectNulls; }

	private Boolean inactiveOtherPoints;
	/**
 Highlight only the hovered point and fade the remaining points. Scatter-type series require enabling the 'inactive' marker state and adjusting opacity. Note that this approach could affect performance with large datasets. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setInactiveOtherPoints(Boolean inactiveOtherPoints) {
		this.inactiveOtherPoints = inactiveOtherPoints;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInactiveOtherPoints(){ return inactiveOtherPoints; }

	private Boolean enableMouseTracking;
	/**
 Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnableMouseTracking(){ return enableMouseTracking; }

	private HashMap custom;
	/**
 A reserved subspace to store options and values for customized functionality. Here you can add additional data for your own event callbacks and formatter callbacks. 
	*/
	public void setCustom(HashMap custom) {
		this.custom = custom;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getCustom(){ return custom; }

	private HIOnPoint onPoint;
	/**
 Options for the _Series on point_ feature. Only `pie` and `sunburst` series are supported at this moment. 
	*/
	public void setOnPoint(HIOnPoint onPoint) {
		this.onPoint = onPoint;
		this.onPoint.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIOnPoint getOnPoint(){ return onPoint; }

	private String stacking;
	/**
 Whether to stack the values of each series on top of each other. Possible values are `undefined` to disable, `"normal"` to stack by value or `"percent"`. When stacking is enabled, data must be sorted in ascending X order. Some stacking options are related to specific series types. In the streamgraph series type, the stacking option is set to `"stream"`. The second one is `"overlap"`, which only applies to waterfall series. 
	*/
	public void setStacking(String stacking) {
		this.stacking = stacking;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStacking(){ return stacking; }

	private HIAnimationOptionsObject animation;
	/**
 Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see `chart.animation` and the animation parameter under the API methods. The following properties are supported: - `defer`: The animation delay time in milliseconds. - `duration`: The duration of the animation in milliseconds. (Defaults to  `1000`) - `easing`: Can be a string reference to an easing function set on  the `Math` object or a function. See the _Custom easing function_  demo below. (Defaults to `easeInOutSine`) Due to poor performance, animation is disabled in old IE browsers for several chart types. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	public enum FindNearestPointBy {
		X("x"),
		XY("xy");

		private final String value;

		FindNearestPointBy(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setFindNearestPointBy(FindNearestPointBy findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String findNearestPointBy;
	/**
 Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when hovering the series. Defaults to `'xy'` for scatter series and `'x'` for most other series. If the data has duplicate x-values, it is recommended to set this to `'xy'` to allow hovering over all points. Applies only to series types using nearest neighbor search (not direct hover) for tooltip. 
 <br><br><b>defaults:</b><br><br>&ensp;x	*/
	public void setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFindNearestPointBy(){ return findNearestPointBy; }

	private Boolean relativeXValue;
	/**
 When true, X values in the data set are relative to the current `pointStart`, `pointInterval` and `pointIntervalUnit` settings. This allows compression of the data for datasets with irregular X values. The real X values are computed on the formula `f(x) = ax + b`, where `a` is the `pointInterval` (optionally with a time unit given by `pointIntervalUnit`), and `b` is the `pointStart`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setRelativeXValue(Boolean relativeXValue) {
		this.relativeXValue = relativeXValue;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRelativeXValue(){ return relativeXValue; }

	private Number threshold;
	/**
 The threshold, also called zero level or base level. For line type series this is only used in conjunction with `negativeColor`. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getThreshold(){ return threshold; }

	private Boolean showCheckbox;
	/**
 If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the `selected` option. 
	*/
	public void setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowCheckbox(){ return showCheckbox; }

	private String boostBlending;
	/**
 Sets the color blending in the boost module. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setBoostBlending(String boostBlending) {
		this.boostBlending = boostBlending;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoostBlending(){ return boostBlending; }

	public enum LegendSymbol {
		AREA_MARKER("areaMarker"),
		LINE_MARKER("lineMarker"),
		RECTANGLE("rectangle");

		private final String value;

		LegendSymbol(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setLegendSymbol(LegendSymbol legendSymbol) {
		this.legendSymbol = legendSymbol.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String legendSymbol;
	/**
 What type of legend symbol to render for this series. Can be one of `areaMarker`, `lineMarker` or `rectangle`. 
 <br><br><b>defaults:</b><br><br>&ensp;rectangle	*/
	public void setLegendSymbol(String legendSymbol) {
		this.legendSymbol = legendSymbol;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLegendSymbol(){ return legendSymbol; }

	private HIEvents events;
	/**
 General event handlers for the series items. These event hooks can also be attached to the series at run time using the `Highcharts.addEvent` function. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private HIFunction pointDescriptionFormat;
	/**
 Same as `accessibility.point.descriptionFormat`, but for an individual series. Overrides the chart wide configuration. 
	*/
	public void setPointDescriptionFormat(HIFunction pointDescriptionFormat) {
		this.pointDescriptionFormat = pointDescriptionFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointDescriptionFormat(){ return pointDescriptionFormat; }

	private Number opacity;
	/**
 Opacity of a series parts: line, fill (e.g.area) and dataLabels. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private Number animationLimit;
	/**
 For some series, there is a limit that shuts down animation by defaults when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation does not run if there is more than 250 points totally. To disable this cap, set `animationLimit` to `Infinity`. This option works if animation is fired on individual points, not on a group of points like e.g. during the initial animation. 
	*/
	public void setAnimationLimit(Number animationLimit) {
		this.animationLimit = animationLimit;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAnimationLimit(){ return animationLimit; }

	private Number turboThreshold;
	/**
 When a series contains a `data` array that is longer than this, the Series class looks for data configurations of plain numbers or arrays of numbers. The first and last valid points are checked. If found, the rest of the data is assumed to be the same. This saves expensive data checking and indexing in long series, and makes data-heavy charts render faster. Set it to `0` disable. Note: - In boost mode turbo threshold is forced. Only array of numbers or two  dimensional arrays are allowed. - In version 11.4.3 and earlier, if object configurations were passed  beyond the turbo threshold, a warning was logged in the console and the  data series didn't render. 
 <br><br><b>defaults:</b><br><br>&ensp;1000	*/
	public void setTurboThreshold(Number turboThreshold) {
		this.turboThreshold = turboThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTurboThreshold(){ return turboThreshold; }

	private ArrayList<String> keys;
	/**
 An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources. 
	*/
	public void setKeys(ArrayList<String> keys) {
		this.keys = keys;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getKeys(){ return keys; }

	private HIColor legendSymbolColor;
	/**
 Defines the color of the legend symbol for this series. Defaults to undefined, in which case the series color is used. Does not work with styled mode. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setLegendSymbolColor(HIColor legendSymbolColor) {
		this.legendSymbolColor = legendSymbolColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLegendSymbolColor(){ return legendSymbolColor; }

	private Boolean selected;
	/**
 Whether to select the series initially. If `showCheckbox` is true, the checkbox next to the series name in the legend will be checked for a selected series. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setSelected(Boolean selected) {
		this.selected = selected;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSelected(){ return selected; }

	private Boolean skipKeyboardNavigation;
	/**
 If set to `true`, the accessibility module will skip past the points in this series for keyboard navigation. 
	*/
	public void setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkipKeyboardNavigation(){ return skipKeyboardNavigation; }

	private HIAccessibility accessibility;
	/**
 Accessibility options for a series. 
	*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private String step;
	/**
 Whether to apply steps to the line. Possible values are `left`, `center` and `right`. 
	*/
	public void setStep(String step) {
		this.step = step;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStep(){ return step; }

	private Boolean getExtremesFromAll;
	/**
 Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By defaults, the Y axis adjusts to the min and max of the visible data. Cartesian series only. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGetExtremesFromAll(){ return getExtremesFromAll; }

	private HISonification sonification;
	/**
 Sonification/audio chart options for a series. 
	*/
	public void setSonification(HISonification sonification) {
		this.sonification = sonification;
		this.sonification.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISonification getSonification(){ return sonification; }

	private HIShadowOptionsObject /* boolean */ shadow;
	/**
 Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`. Note that in some cases, like stacked columns or other dense layouts, the series may cast shadows on each other. In that case, the `chart.seriesGroupShadow` allows applying a common drop shadow to the whole series group. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setShadow(HIShadowOptionsObject /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIShadowOptionsObject /* boolean */ getShadow(){ return shadow; }

	private Boolean allowPointSelect;
	/**
 Allow this series' points to be selected by clicking on the graphic (columns, point markers, pie slices, map areas etc). The selected points can be handled by point select and unselect events, or collectively by the `getSelectedPoints` function. And alternative way of selecting points is through dragging. 
	*/
	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowPointSelect(){ return allowPointSelect; }

	private Object /* Number, String */ colorAxis;
	/**
 When using dual or multiple color axes, this number defines which colorAxis the particular series is connected to. It refers to either the axis id or the index of the axis in the colorAxis array, with 0 being the first. Set this option to false to prevent a series from connecting to the defaults color axis. Since v7.2.0 the option can also be an axis id or an axis index instead of a boolean flag.
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setColorAxis(Object /* Number, String */ colorAxis) {
		this.colorAxis = colorAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getColorAxis(){ return colorAxis; }

	private String zoneAxis;
	/**
 Defines the Axis on which the zones are applied. 
 <br><br><b>defaults:</b><br><br>&ensp;y	*/
	public void setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public String getZoneAxis(){ return zoneAxis; }

	private ArrayList <HIZones> zones;
	/**
 An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the `zoneAxis` option. The zone definitions have to be in ascending order regarding to the value. In styled mode, the color zones are styled with the `.highcharts-zone-{n}` class, or custom classed from the `className` option ([view live demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/)). 
	*/
	public void setZones(ArrayList zones) {
		this.zones = zones;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getZones(){ return zones; }

	private String pointIntervalUnit;
	/**
 On datetime series, this allows for setting the `pointInterval` to irregular time units, `day`, `month` and `year`. A day is usually the same as 24 hours, but `pointIntervalUnit` also takes the DST crossover into consideration when dealing with local time. Combine this option with `pointInterval` to draw weeks, quarters, 6 months, 10 years etc. Please note that this options applies to the _series data_, not the interval of the axis ticks, which is independent. 
	*/
	public void setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointIntervalUnit(){ return pointIntervalUnit; }

	private Number lineWidth;
	/**
 Pixel width of the graph line. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Boolean crisp;
	/**
 When true, each point or column edge is rounded to its nearest pixel in order to render sharp on screen. In some cases, when there are a lot of densely packed columns, this leads to visible difference in column widths or distance between columns. In these cases, setting `crisp` to `false` may look better, even though each column is rendered blurry. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setCrisp(Boolean crisp) {
		this.crisp = crisp;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrisp(){ return crisp; }

	private Boolean visible;
	/**
 Set the initial visibility of the series. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private String linkedTo;
	/**
 The `id` of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series. If master series uses data sorting and linked series does not have its own sorting definition, the linked series will be sorted in the same order as the master one. 
	*/
	public void setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkedTo(){ return linkedTo; }

	private Boolean stickyTracking;
	/**
 Sticky tracking of mouse events. When true, the `mouseOut` event on a series isn't triggered until the mouse moves over another series, or out of the plot area. When false, the `mouseOut` event on a series is triggered when the mouse leaves the area around the series' graph or markers. This also implies the tooltip when not shared. When `stickyTracking` is false and `tooltip.shared` is false, the tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc. **Note:** The boost module will force this option because of technical limitations. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStickyTracking(){ return stickyTracking; }

	private ArrayList <HIDataLabels> dataLabels;
	/**
 Options for the series data labels, appearing next to each data point. Since v6.2.0, multiple data labels can be applied to each single point by defining them as an array of configs. In styled mode, the data labels can be styled with the `.highcharts-data-label-box` and `.highcharts-data-label` class names ([see example](https://www.highcharts.com/samples/highcharts/css/series-datalabels)). 
	*/
	public void setDataLabels(ArrayList dataLabels) {
		this.dataLabels = dataLabels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getDataLabels(){ return dataLabels; }

	private String className;
	/**
 An additional class name to apply to the series' graphical elements. This option does not replace defaults class names of the graphical element. Changes to the series' color will also be reflected in a chart's legend and tooltip. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Object /* Number, String */ pointStart;
	/**
 If no x values are given for the points in a series, `pointStart` defines on what value to start. For example, if a series contains one yearly value starting from 1945, set `pointStart` to 1945. The `pointStart` setting can be a number, or a datetime string that is parsed according to the `time.timezone` setting. If combined with `relativeXValue`, an x value can be set on each point. The x value from the point options is multiplied by `pointInterval` and added to `pointStart` to produce a modified x value. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setPointStart(Object /* Number, String */ pointStart) {
		this.pointStart = pointStart;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getPointStart(){ return pointStart; }

	private String linecap;
	/**
 The line cap used for line ends and line joins on the graph. 
 <br><br><b>defaults:</b><br><br>&ensp;round	*/
	public void setLinecap(String linecap) {
		this.linecap = linecap;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinecap(){ return linecap; }

	private Boolean connectEnds;
	/**
 Polar charts only. Whether to connect the ends of a line series plot across the extremes. 
	*/
	public void setConnectEnds(Boolean connectEnds) {
		this.connectEnds = connectEnds;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getConnectEnds(){ return connectEnds; }

	private Number boostThreshold;
	/**
 Set the point threshold for when a series should enter boost mode. Setting it to e.g. 2000 will cause the series to enter boost mode when there are 2000 or more points in the series. To disable boosting on the series, set the `boostThreshold` to 0. Setting it to 1 will force boosting. Note that the `cropThreshold` also affects this setting. When zooming in on a series that has fewer points than the `cropThreshold`, all points are rendered although outside the visible plot area, and the `boostThreshold` won't take effect. 
 <br><br><b>defaults:</b><br><br>&ensp;5000	*/
	public void setBoostThreshold(Number boostThreshold) {
		this.boostThreshold = boostThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBoostThreshold(){ return boostThreshold; }

	private Boolean showInLegend;
	/**
 Whether to display this particular series or series type in the legend. Standalone series are shown in legend by defaults, and linked series are not. Since v7.2.0 it is possible to show series that use colorAxis by setting this option to `true`. 
	*/
	public void setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowInLegend(){ return showInLegend; }



	public HISeries() {

	}

	private HashMap<String, Object> jsProperties;
	/**
	 * Add a custom property to your chart. Those can be accessible later by HIFunction callbacks.
	 * @param name the name by which you can access property
	 * @param value the actual value which can be accessed
	 */
	 public void setProperty(String name, Object value) {
		 if(jsProperties == null) jsProperties = new HashMap<>();
		 jsProperties.put(name, value);
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);

		if (this.jsProperties != null) {
			for (Map.Entry<String, Object> entry : jsProperties.entrySet()) {
				params.put(entry.getKey(), entry.getValue());
			}
		}
		if (this.data != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.data) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
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
		if (this.descriptionFormatter != null) {
			params.put("descriptionFormatter", this.descriptionFormatter);
		}
		if (this.pointDescriptionEnabledThreshold != null) {
			params.put("pointDescriptionEnabledThreshold", this.pointDescriptionEnabledThreshold);
		}
		if (this.descriptionFormat != null) {
			params.put("descriptionFormat", this.descriptionFormat);
		}
		if (this.describeSingleSeries != null) {
			params.put("describeSingleSeries", this.describeSingleSeries);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.xAxisDescription != null) {
			params.put("xAxisDescription", this.xAxisDescription);
		}
		if (this.yAxisDescription != null) {
			params.put("yAxisDescription", this.yAxisDescription);
		}
		if (this.pointAnnotationsDescription != null) {
			params.put("pointAnnotationsDescription", this.pointAnnotationsDescription);
		}
		if (this.summary != null) {
			params.put("summary", this.summary.getParams());
		}
		if (this.nullPointValue != null) {
			params.put("nullPointValue", this.nullPointValue);
		}
		if (this.includeInDataExport != null) {
			params.put("includeInDataExport", this.includeInDataExport);
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
		if (this.colorKey != null) {
			params.put("colorKey", this.colorKey);
		}
		if (this.softThreshold != null) {
			params.put("softThreshold", this.softThreshold);
		}
		if (this.dragDrop != null) {
			params.put("dragDrop", this.dragDrop.getParams());
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.dataSorting != null) {
			params.put("dataSorting", this.dataSorting.getParams());
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.tooltip != null) {
			params.put("tooltip", this.tooltip.getParams());
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.pointDescriptionFormatter != null) {
			params.put("pointDescriptionFormatter", this.pointDescriptionFormatter);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
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
		if (this.inactiveOtherPoints != null) {
			params.put("inactiveOtherPoints", this.inactiveOtherPoints);
		}
		if (this.enableMouseTracking != null) {
			params.put("enableMouseTracking", this.enableMouseTracking);
		}
		if (this.custom != null) {
			params.put("custom", this.custom);
		}
		if (this.onPoint != null) {
			params.put("onPoint", this.onPoint.getParams());
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
		if (this.relativeXValue != null) {
			params.put("relativeXValue", this.relativeXValue);
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
		if (this.legendSymbol != null) {
			params.put("legendSymbol", this.legendSymbol);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.pointDescriptionFormat != null) {
			params.put("pointDescriptionFormat", this.pointDescriptionFormat);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.animationLimit != null) {
			params.put("animationLimit", this.animationLimit);
		}
		if (this.turboThreshold != null) {
			params.put("turboThreshold", this.turboThreshold);
		}
		if (this.keys != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.keys) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("keys", array);
		}
		if (this.legendSymbolColor != null) {
			params.put("legendSymbolColor", this.legendSymbolColor.getData());
		}
		if (this.selected != null) {
			params.put("selected", this.selected);
		}
		if (this.skipKeyboardNavigation != null) {
			params.put("skipKeyboardNavigation", this.skipKeyboardNavigation);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.step != null) {
			params.put("step", this.step);
		}
		if (this.getExtremesFromAll != null) {
			params.put("getExtremesFromAll", this.getExtremesFromAll);
		}
		if (this.sonification != null) {
			params.put("sonification", this.sonification.getParams());
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow.getParams());
		}
		if (this.allowPointSelect != null) {
			params.put("allowPointSelect", this.allowPointSelect);
		}
		if (this.colorAxis != null) {
			params.put("colorAxis", this.colorAxis);
		}
		if (this.zoneAxis != null) {
			params.put("zoneAxis", this.zoneAxis);
		}
		if (this.zones != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.zones) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
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
		if (this.crisp != null) {
			params.put("crisp", this.crisp);
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
		if(this.dataLabels !=null) {
			if(this instanceof HIPie){
				HIFoundation obj=(HIFoundation)this.getDataLabels().get(0);
				if(obj !=null) {
					params.put("dataLabels", obj.getParams());
				}
			} else{
				ArrayList<Object>array =new ArrayList<>();
				for(Object obj :this.dataLabels) {
					if(obj instanceof HIFoundation) {
						array.add(((HIFoundation) obj).getParams());
					}
					else{
						array.add(obj);
					}
				}
				params.put("dataLabels", array);
			}
		}
		if (this.className != null) {
			params.put("className", this.className);
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

  /**
   * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
   * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
   */
  public void addPoint(HIData options){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "addPoint0");
      put("id", uuid);
      put("params", Collections.singletonList(options.getParams()));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
   * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
   * @param redraw Whether to redraw the chart after the point is added. When adding more than one point, it is highly recommended that the redraw option be set to false, and instead Highcharts.Chart#redraw is explicitly called after the adding of points is finished. Otherwise, the chart will redraw after adding each point.
   */
  public void addPoint(HIData options, boolean redraw){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "addPoint1");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(options.getParams(), redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
   * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
   * @param redraw Whether to redraw the chart after the point is added. When adding more than one point, it is highly recommended that the redraw option be set to false, and instead Highcharts.Chart#redraw is explicitly called after the adding of points is finished. Otherwise, the chart will redraw after adding each point.
   * @param shift If true, a point is shifted off the start of the series as one is appended to the end.
   */
  public void addPoint(HIData options, boolean redraw, boolean shift){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "addPoint2");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(options.getParams(), redraw, shift)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
   * @param options The point options. If options is a single number, a point with that y value is appended to the series. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
   * @param redraw Whether to redraw the chart after the point is added. When adding more than one point, it is highly recommended that the redraw option be set to false, and instead Highcharts.Chart#redraw is explicitly called after the adding of points is finished. Otherwise, the chart will redraw after adding each point.
   * @param shift If true, a point is shifted off the start of the series as one is appended to the end.
   * @param animation Whether to apply animation, and optionally animation configuration.
   */
  public void addPoint(HIData options, boolean redraw, boolean shift, HIAnimationOptionsObject animation){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "addPoint3");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(options.getParams(), redraw, shift, animation)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Animate in the series. Called internally twice. First with the init parameter set to true, which sets up the initial state of the animation. Then when ready, it is called with the init parameter undefined, in order to perform the actual animation. After the second run, the function is removed.
   * @param init Initialize the animation.
   */
  public void animate(boolean init){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "animate");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(init)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Draw the graph. Called internally when rendering line-like series types. The first time it generates the series.graph item and optionally other series-wide items like series.area for area charts. On subsequent calls these items are updated with new positions and attributes.
   */
  public void drawGraph(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "drawGraph");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Draw the markers for line-like series types, and columns or other graphical representation for Highcharts.Point objects for other series types. The resulting element is typically stored as Highcharts.Point.graphic, and is created on the first call and updated and moved on subsequent calls.
   */
  public void drawPoints(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "drawPoints");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Hide the series if visible. If the chart.ignoreHiddenSeries option is true, the chart is redrawn without this series.
   */
  public void hide(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "hide");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Runs on mouse over the series graphical items.
   */
  public void onMouseOver(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "onMouseOver");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Runs on mouse out of the series graphical items.
   */
  public void onMouseOut() {
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "onMouseOut");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a series and optionally redraw the chart.
   */
  public void remove(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "remove0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a series and optionally redraw the chart.
   * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
   */
  public void remove(boolean redraw){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "remove1");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a series and optionally redraw the chart.
   * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
   * @param animation Whether to apply animation, and optionally animation configuration.
   */
  public void remove(boolean redraw, HIAnimationOptionsObject animation){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "remove2");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(redraw, animation)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a series and optionally redraw the chart.
   * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
   * @param animation Whether to apply animation, and optionally animation configuration.
   * @param withEvents Used internally, whether to fire the series remove event.
   */
  public void remove(boolean redraw, HIAnimationOptionsObject animation, boolean withEvents){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "remove3");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(redraw, animation, withEvents)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a point from the series. Unlike the HIPoint remove() method, this can also be done on a point that is not instanciated because it is outside the view
   * @param i The index of the point in the data array.
   */
  public void removePoint(Number i){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "removePoint0");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(i)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a point from the series. Unlike the HIPoint remove() method, this can also be done on a point that is not instanciated because it is outside the view
   * @param i The index of the point in the data array.
   * @param redraw Whether to redraw the chart after the point is added. When removing more than one point, it is highly recommended that the redraw option be set to false, and instead HIChartView redraw() is explicitly called after the adding of points is finished.
   */
  public void removePoint(Number i, boolean redraw){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "removePoint1");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(i, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }


  /**
   * Remove a point from the series. Unlike the HIPoint remove() method, this can also be done on a point that is not instanciated because it is outside the view
   * @param i The index of the point in the data array.
   * @param redraw Whether to redraw the chart after the point is added. When removing more than one point, it is highly recommended that the redraw option be set to false, and instead HIChartView redraw() is explicitly called after the adding of points is finished.
   * @param animation Whether and optionally how the series should be animated.
   */
  public void removePoint(Number i, boolean redraw, HIAnimationOptionsObject animation){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "removePoint2");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(i, redraw, animation)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Render the graph and markers. Called internally when first rendering and later when redrawing the chart. This function can be extended in plugins, but normally shouldn't be called directly.
   */
  public void render(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "render");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Select or unselect the series. This means its selected property is set, the checkbox in the legend is toggled.
   */
  public void select(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "select0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Select or unselect the series. This means its selected property is set, the checkbox in the legend is toggled.
   * @param selected True to select the series, false to unselect.
   */
  public void select(boolean selected){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "select1");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(selected)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
   * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
   */
  public void setSeriesData(List data){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setData0");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(data)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
   * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
   * @param redraw  Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
   */
  public void setSeriesData(List data, boolean redraw){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setData1");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(data, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
   * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
   * @param redraw  Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
   * @param animation When the updated data is the same length as the existing data, points will be updated by default, and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
   */
  public void setSeriesData(List data, boolean redraw, HIAnimationOptionsObject animation){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setData2");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(data, redraw, animation)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of updatePoints), and may later be mutated when updating the chart data.
   *
   * Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the updatePoints parameter.
   * @param data Takes an array of data in the same format as described under HISeries data for the given series type, for example a line series would take data in the form described under series.line.data.
   * @param redraw  Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
   * @param animation When the updated data is the same length as the existing data, points will be updated by default, and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
   * @param updatePoints When this is true, points will be updated instead of replaced whenever possible. This occurs a) when the updated data is the same length as the existing data, b) when points are matched by their id's, or c) when points can be matched by X values. This allows updating with animation and performs better. In this case, the original array is not passed by reference. Set false to prevent.
   */
  public void setSeriesData(List data, boolean redraw, HIAnimationOptionsObject animation, boolean updatePoints){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setData3");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(data, redraw, animation, updatePoints)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the series options by merging from the options tree. Called internally on initializing and updating series. This function will not redraw the series. For API usage, use HISeries update().
   * @param itemOptions The series options.
   */
  public void setOptions(HISeries itemOptions){
    Map itemOtionsCopy = itemOptions.getParams();
    itemOtionsCopy.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setOptions");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(itemOtionsCopy)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the state of the series. Called internally on mouse interaction operations, but it can also be called directly to visually highlight a series.
   */
  public void setState(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setState1");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  public enum State {
    HOVER("hover"),
    SELECT("select"),
    INACTIVE("inactive"),
    NORMAL("normal");

    private final String value;

    State(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
  }

  /**
   * Set the state of the series. Called internally on mouse interaction operations, but it can also be called directly to visually highlight a series.
   * @param state Can be either hover or undefined to set to normal state.
   */
  public void setState(String state){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setState1");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(state)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }
  public void setState(State state){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setState1");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(state.getValue())));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Show or hide the series.
   */
  public void setSeriesVisible(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setVisible0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Show or hide the series.
   * @param visible True to show the series, false to hide. If undefined, the visibility is toggled.
   */
  public void setSeriesVisible(boolean visible){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setVisible1");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(visible)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Show or hide the series.
   * @param visible True to show the series, false to hide. If undefined, the visibility is toggled.
   * @param redraw Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
   */
  public void setSeriesVisible(boolean visible, boolean redraw){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "setVisible2");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(visible, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Show the series if hidden.
   */
  public void show(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "show");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Sonify a series.
   * @param options The options for sonifying this series.
   */
  public void sonify(Map options){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "sonify");
      put("id", uuid);
      put("params", options);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Translate data points from raw data values to chart specific positioning data needed later in the drawPoints and drawGraph functions. This function can be overridden in plugins and custom series type implementations.
   */
  public void translate(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "sonify");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Update the series with a new set of options. For a clean and precise handling of new options, all methods and elements from the series are removed, and it is initialized from scratch. Therefore, this method is more performance expensive than some other utility methods like HISeries setData() or HISeries setSeriesVisible().
   * @param options New options that will be merged with the series' existing options.
   */
  public void update(HISeries options){
    Map optionsCopy = options.getParams();
    optionsCopy.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "update0");
      put("id", uuid);
      put("params", new ArrayList<>(Collections.singletonList(optionsCopy)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Update the series with a new set of options. For a clean and precise handling of new options, all methods and elements from the series are removed, and it is initialized from scratch. Therefore, this method is more performance expensive than some other utility methods like HISeries setData() or HISeries setSeriesVisible().
   * @param options New options that will be merged with the series' existing options.
   * @param redraw Whether to redraw the chart after the series is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after.
   */
  public void update(HISeries options, boolean redraw){
    Map optionsCopy = options.getParams();
    optionsCopy.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Series");
      put("method", "update1");
      put("id", uuid);
      put("params", new ArrayList<>(Arrays.asList(optionsCopy, redraw)));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

}