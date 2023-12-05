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



public class HIZAxis extends HIFoundation { 

	private HILabels labels;
	/**
 The axis labels show the number or category for each tick. Since v8.0.0: Labels are animated in categorized x-axis with updating data if `tickInterval` and `step` is set to 1. 
	*/
	public void setLabels(HILabels labels) {
		this.labels = labels;
		this.labels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabels getLabels(){ return labels; }

	private Number gridZIndex;
	/**
 The Z index of the grid lines. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setGridZIndex(Number gridZIndex) {
		this.gridZIndex = gridZIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGridZIndex(){ return gridZIndex; }

	private Number pane;
	/**
 Refers to the index in the `panes` array. Used for circular gauges and polar charts. When the option is not set then first pane will be used. 
	*/
	public void setPane(Number pane) {
		this.pane = pane;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPane(){ return pane; }

	private HITitle title;
	/**
 The axis title, showing next to the axis line. 
	*/
	public void setTitle(HITitle title) {
		this.title = title;
		this.title.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITitle getTitle(){ return title; }

	private Boolean panningEnabled;
	/**
 Whether to pan axis. If `chart.panning` is enabled, the option allows to disable panning on an individual axis. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setPanningEnabled(Boolean panningEnabled) {
		this.panningEnabled = panningEnabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getPanningEnabled(){ return panningEnabled; }

	private Number tickPixelInterval;
	/**
 If tickInterval is `null` this option sets the approximate pixel interval of the tick marks. Not applicable to categorized axis. The tick interval is also influenced by the `minTickInterval` option, that, by defaults prevents ticks from being denser than the data points. 
 <br><br><b>defaults:</b><br><br>&ensp;100	*/
	public void setTickPixelInterval(Number tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickPixelInterval(){ return tickPixelInterval; }

	private Number tickInterval;
	/**
 The interval of the tick marks in axis units. When `undefined`, the tick interval is computed to approximately follow the `tickPixelInterval` on linear and datetime axes. On categorized axes, a `undefined` tickInterval will defaults to 1, one category. Note that datetime axes are based on milliseconds, so for example an interval of one day is expressed as `24 * 3600 * 1000`. On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc. If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks. If the chart has multiple axes, the `alignTicks` option may interfere with the `tickInterval` setting. 
	*/
	public void setTickInterval(Number tickInterval) {
		this.tickInterval = tickInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickInterval(){ return tickInterval; }

	private ArrayList<String> categories;
	/**
 If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a `name` and setting axis `type` to `category`. However, if you have multiple series, best practice remains defining the `categories` array. Example: `categories: ['Apples', 'Bananas', 'Oranges']` 
	*/
	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getCategories(){ return categories; }

	private Boolean showLastLabel;
	/**
 Whether to show the last tick label. Defaults to `true` on cartesian charts, and `false` on polar charts. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setShowLastLabel(Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowLastLabel(){ return showLastLabel; }

	private Number min;
	/**
 The minimum value of the axis. If `null` the min value is automatically calculated. If the `startOnTick` option is true (defaults), the `min` value might be rounded down. The automatically calculated minimum value is also affected by `floor`, `softMin`, `minPadding`, `minRange` as well as `series.threshold` and `series.softThreshold`. 
	*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }

	private Number crossing;
	/**
 The value on a perpendicular axis where this axis should cross. This is typically used on mathematical plots where the axes cross at 0. When `crossing` is set, space will not be reserved at the sides of the chart for axis labels and title, so those may be clipped. In this case it is better to place the axes without the `crossing` option. 
	*/
	public void setCrossing(Number crossing) {
		this.crossing = crossing;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCrossing(){ return crossing; }

	private String tickPosition;
	/**
 The position of the major tick marks relative to the axis line. Can be one of `inside` and `outside`. 
 <br><br><b>defaults:</b><br><br>&ensp;outside	*/
	public void setTickPosition(String tickPosition) {
		this.tickPosition = tickPosition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTickPosition(){ return tickPosition; }

	private Number startOfWeek;
	/**
 For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setStartOfWeek(Number startOfWeek) {
		this.startOfWeek = startOfWeek;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartOfWeek(){ return startOfWeek; }

	private HIColor minorGridLineColor;
	/**
 Color of the minor, secondary grid lines. In styled mode, the stroke width is given in the `.highcharts-minor-grid-line` class. 
 <br><br><b>defaults:</b><br><br>&ensp;#f2f2f2	*/
	public void setMinorGridLineColor(HIColor minorGridLineColor) {
		this.minorGridLineColor = minorGridLineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMinorGridLineColor(){ return minorGridLineColor; }

	private Boolean endOnTick;
	/**
 Whether to force the axis to end on a tick. Use this option with the `maxPadding` option to control the axis end. 
	*/
	public void setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEndOnTick(){ return endOnTick; }

	private ArrayList <HIPlotLines> plotLines;
	/**
 An array of lines stretching across the plot area, marking a specific value on one of the axes. In styled mode, the plot lines are styled by the `.highcharts-plot-line` class in addition to the `className` option. 
	*/
	public void setPlotLines(ArrayList plotLines) {
		this.plotLines = plotLines;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPlotLines(){ return plotLines; }

	private String gridLineInterpolation;
	/**
 Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either `circle` or `polygon`. Since v8.0.0 this option is also applicable for X axis (inverted polar). 
	*/
	public void setGridLineInterpolation(String gridLineInterpolation) {
		this.gridLineInterpolation = gridLineInterpolation;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGridLineInterpolation(){ return gridLineInterpolation; }

	private String gridLineDashStyle;
	/**
 The dash or dot style of the grid lines. For possible values, see [this demonstration](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/). 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setGridLineDashStyle(String gridLineDashStyle) {
		this.gridLineDashStyle = gridLineDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGridLineDashStyle(){ return gridLineDashStyle; }

	private String minorTickPosition;
	/**
 The position of the minor tick marks relative to the axis line. Can be one of `inside` and `outside`. 
 <br><br><b>defaults:</b><br><br>&ensp;outside	*/
	public void setMinorTickPosition(String minorTickPosition) {
		this.minorTickPosition = minorTickPosition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMinorTickPosition(){ return minorTickPosition; }

	private Boolean minorTicks;
	/**
 Enable or disable minor ticks. The interval between the minor ticks can be controlled either by the `minorTicksPerMajor` setting, or as an absolute `minorTickInterval` value. On a logarithmic axis, minor ticks are laid out based on a best guess, attempting to enter an approximate number of minor ticks between each major tick based on `minorTicksPerMajor`. Prior to v6.0.0, ticks were enabled in auto layout by setting `minorTickInterval` to `"auto"`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setMinorTicks(Boolean minorTicks) {
		this.minorTicks = minorTicks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getMinorTicks(){ return minorTicks; }

	private Number minorTickWidth;
	/**
 The pixel width of the minor tick mark. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setMinorTickWidth(Number minorTickWidth) {
		this.minorTickWidth = minorTickWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorTickWidth(){ return minorTickWidth; }

	private Number offset;
	/**
 The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly. 
	*/
	public void setOffset(Number offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffset(){ return offset; }

	private Number minTickInterval;
	/**
 The minimum tick interval allowed in axis values. For example on zooming in on an axis with daily data, this can be used to prevent the axis from showing hours. Defaults to the closest distance between two points on the axis. 
	*/
	public void setMinTickInterval(Number minTickInterval) {
		this.minTickInterval = minTickInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinTickInterval(){ return minTickInterval; }

	private Object /* Number, String */ minorTickInterval;
	/**
 Specific tick interval in axis units for the minor ticks. On a linear axis, if `"auto"`, the minor tick interval is calculated as a fifth of the tickInterval. If `null` or `undefined`, minor ticks are not shown. On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc. If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems. 
	*/
	public void setMinorTickInterval(Object /* Number, String */ minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMinorTickInterval(){ return minorTickInterval; }

	private Number linkedTo;
	/**
 Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales. 
	*/
	public void setLinkedTo(Number linkedTo) {
		this.linkedTo = linkedTo;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkedTo(){ return linkedTo; }

	private HIDateTimeLabelFormats dateTimeLabelFormats;
	/**
 For a datetime axis, the scale will automatically adjust to the appropriate unit. This member gives the defaults string representations used for each unit. For intermediate values, different units may be used, for example the `day` unit can be used on midnight and `hour` unit be used for intermediate values on the same axis. For an overview of the replacement codes, see `dateFormat`. Defaults to: ```js {   millisecond: '%H:%M:%S.%L',   second: '%H:%M:%S',   minute: '%H:%M',   hour: '%H:%M',   day: '%e. %b',   week: '%e. %b',   month: '%b \'%y',   year: '%Y' } ``` 
	*/
	public void setDateTimeLabelFormats(HIDateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		this.dateTimeLabelFormats.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDateTimeLabelFormats getDateTimeLabelFormats(){ return dateTimeLabelFormats; }

	private Boolean visible;
	/**
 Whether axis, including axis title, line, ticks and labels, should be visible. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private Boolean showFirstLabel;
	/**
 Whether to show the first tick label. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setShowFirstLabel(Boolean showFirstLabel) {
		this.showFirstLabel = showFirstLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowFirstLabel(){ return showFirstLabel; }

	private String tickmarkPlacement;
	/**
 For categorized axes only. If `on` the tick mark is placed in the center of the category, if `between` the tick mark is placed between categories. The defaults is `between` if the `tickInterval` is 1, else `on`. 
 <br><br><b>defaults:</b><br><br>&ensp;between	*/
	public void setTickmarkPlacement(String tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTickmarkPlacement(){ return tickmarkPlacement; }

	private HIFunction tickPositioner;
	/**
 A callback function returning array defining where the ticks are laid out on the axis. This overrides the defaults behaviour of `tickPixelInterval` and `tickInterval`. The automatic tick positions are accessible through `this.tickPositions` and can be modified by the callback. 
	*/
	public void setTickPositioner(HIFunction tickPositioner) {
		this.tickPositioner = tickPositioner;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getTickPositioner(){ return tickPositioner; }

	private Number minorTickLength;
	/**
 The pixel length of the minor tick marks. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setMinorTickLength(Number minorTickLength) {
		this.minorTickLength = minorTickLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorTickLength(){ return minorTickLength; }

	private String type;
	/**
 The type of axis. Can be one of `linear`, `logarithmic`, `datetime` or `category`. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed on appropriate values like full hours or days. In a category axis, the `point names` of the chart's series are used for categories, if not a `categories` array is defined. 
 <br><br><b>defaults:</b><br><br>&ensp;linear	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Number ceiling;
	/**
 The highest allowed value for automatically computed axis extremes. 
	*/
	public void setCeiling(Number ceiling) {
		this.ceiling = ceiling;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCeiling(){ return ceiling; }

	private Number tickWidth;
	/**
 The pixel width of the major tick marks. Defaults to 0 on category axes, otherwise 1. In styled mode, the stroke width is given in the `.highcharts-tick` class, but in order for the element to be generated on category axes, the option must be explicitly set to 1. 
	*/
	public void setTickWidth(Number tickWidth) {
		this.tickWidth = tickWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickWidth(){ return tickWidth; }

	private Boolean reversed;
	/**
 Whether to reverse the axis so that the highest number is closest to the origin. If the chart is inverted, the x axis is reversed by defaults. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private Number gridLineWidth;
	/**
 The width of the grid lines extending the ticks across the plot area. Defaults to 1 on the Y axis and 0 on the X axis, except for 3d charts. In styled mode, the stroke width is given in the `.highcharts-grid-line` class. 
	*/
	public void setGridLineWidth(Number gridLineWidth) {
		this.gridLineWidth = gridLineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGridLineWidth(){ return gridLineWidth; }

	private HIColor alternateGridColor;
	/**
 When using an alternate grid color, a band is painted across the plot area between every other grid line. 
	*/
	public void setAlternateGridColor(HIColor alternateGridColor) {
		this.alternateGridColor = alternateGridColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getAlternateGridColor(){ return alternateGridColor; }

	private HIColor minorTickColor;
	/**
 Color for the minor tick marks. 
 <br><br><b>defaults:</b><br><br>&ensp;#999999	*/
	public void setMinorTickColor(HIColor minorTickColor) {
		this.minorTickColor = minorTickColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMinorTickColor(){ return minorTickColor; }

	private Number maxPadding;
	/**
 Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' `max` option is set or a max extreme is set using `axis.setExtremes()`, the maxPadding will be ignored. 
 <br><br><b>defaults:</b><br><br>&ensp;0.01	*/
	public void setMaxPadding(Number maxPadding) {
		this.maxPadding = maxPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPadding(){ return maxPadding; }

	private String className;
	/**
 A class name that opens for styling the axis by CSS, especially in Highcharts styled mode. The class name is applied to group elements for the grid, axis elements and labels. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number margin;
	/**
 If there are multiple axes on the same side of the chart, the pixel margin between the axes. Defaults to 0 on vertical axes, 15 on horizontal axes. 
	*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private Number softMax;
	/**
 A soft maximum for the axis. If the series data maximum is less than this, the axis will stay at this maximum, but if the series data maximum is higher, the axis will flex to show all data. 
	*/
	public void setSoftMax(Number softMax) {
		this.softMax = softMax;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSoftMax(){ return softMax; }

	private Number minPadding;
	/**
 Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' `min` option is set or a min extreme is set using `axis.setExtremes()`, the minPadding will be ignored. 
 <br><br><b>defaults:</b><br><br>&ensp;0.01	*/
	public void setMinPadding(Number minPadding) {
		this.minPadding = minPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPadding(){ return minPadding; }

	private HIAccessibility accessibility;
	/**
 Accessibility options for an axis. Requires the accessibility module. 
	*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private Boolean alignTicks;
	/**
 When using multiple axis, the ticks of two or more opposite axes will automatically be aligned by adding ticks to the axis or axes with the least ticks, as if `tickAmount` were specified. This can be prevented by setting `alignTicks` to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting `gridLineWidth` to 0. If `startOnTick` or `endOnTick` in an Axis options are set to false, then the `alignTicks ` will be disabled for the Axis. Disabled for logarithmic axes. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignTicks(){ return alignTicks; }

	private Boolean zoomEnabled;
	/**
 Whether to zoom axis. If `chart.zoomType` is set, the option allows to disable zooming on an individual axis. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setZoomEnabled(Boolean zoomEnabled) {
		this.zoomEnabled = zoomEnabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getZoomEnabled(){ return zoomEnabled; }

	private String id;
	/**
 An id for the axis. This can be used after render time to get a pointer to the axis object through `chart.get()`. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number minRange;
	/**
 The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour. The defaults minRange for the x axis is five times the smallest interval between any of the data points. On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc. **Note**: The `minPadding`, `maxPadding`, `startOnTick` and `endOnTick` settings also affect how the extremes of the axis are computed. 
	*/
	public void setMinRange(Number minRange) {
		this.minRange = minRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinRange(){ return minRange; }

	private Number angle;
	/**
 In a polar chart, this is the angle of the Y axis in degrees, where 0 is up and 90 is right. The angle determines the position of the axis line and the labels, though the coordinate system is unaffected. Since v8.0.0 this option is also applicable for X axis (inverted polar). 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setAngle(Number angle) {
		this.angle = angle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAngle(){ return angle; }

	private Boolean allowDecimals;
	/**
 Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals should be avoided in the labels. By defaults, decimals are allowed on small scale axes. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setAllowDecimals(Boolean allowDecimals) {
		this.allowDecimals = allowDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowDecimals(){ return allowDecimals; }

	private Number floor;
	/**
 The lowest allowed value for automatically computed axis extremes. 
	*/
	public void setFloor(Number floor) {
		this.floor = floor;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFloor(){ return floor; }

	private ArrayList<Number> tickPositions;
	/**
 An array defining where the ticks are laid out on the axis. This overrides the defaults behaviour of `tickPixelInterval` and `tickInterval`. 
	*/
	public void setTickPositions(ArrayList<Number> tickPositions) {
		this.tickPositions = tickPositions;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getTickPositions(){ return tickPositions; }

	private ArrayList <HIPlotBands> plotBands;
	/**
 An array of colored bands stretching across the plot area marking an interval on the axis. In styled mode, the plot bands are styled by the `.highcharts-plot-band` class in addition to the `className` option. 
	*/
	public void setPlotBands(ArrayList plotBands) {
		this.plotBands = plotBands;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPlotBands(){ return plotBands; }

	private ArrayList<ArrayList> units;
	/**
 Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the second value another array of allowed multiples. Defaults to: ```js units: [[   'millisecond', // unit name   [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples ], [   'second',   [1, 2, 5, 10, 15, 30] ], [   'minute',   [1, 2, 5, 10, 15, 30] ], [   'hour',   [1, 2, 3, 4, 6, 8, 12] ], [   'day',   [1, 2] ], [   'week',   [1, 2] ], [   'month',   [1, 2, 3, 4, 6] ], [   'year',   null ]] ``` 
	*/
	public void setUnits(ArrayList<ArrayList> units) {
		this.units = units;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<ArrayList> getUnits(){ return units; }

	private Number softMin;
	/**
 A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data. 
	*/
	public void setSoftMin(Number softMin) {
		this.softMin = softMin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSoftMin(){ return softMin; }

	private HIEvents events;
	/**
 Event handlers for the axis. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private Number tickLength;
	/**
 The pixel length of the main tick marks. 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setTickLength(Number tickLength) {
		this.tickLength = tickLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickLength(){ return tickLength; }

	private Boolean opposite;
	/**
 Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes. 
	*/
	public void setOpposite(Boolean opposite) {
		this.opposite = opposite;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOpposite(){ return opposite; }

	private Number max;
	/**
 The maximum value of the axis. If `null`, the max value is automatically calculated. If the `endOnTick` option is true, the `max` value might be rounded up. If a `tickAmount` is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by `chart.alignTicks`, where a `tickAmount` is applied internally. 
	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private String minorGridLineDashStyle;
	/**
 The dash or dot style of the minor grid lines. For possible values, see [this demonstration](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/). 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setMinorGridLineDashStyle(String minorGridLineDashStyle) {
		this.minorGridLineDashStyle = minorGridLineDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMinorGridLineDashStyle(){ return minorGridLineDashStyle; }

	private Number zIndex;
	/**
 The Z index for the axis group. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HIColor tickColor;
	/**
 Color for the main tick marks. In styled mode, the stroke is given in the `.highcharts-tick` class. 
 <br><br><b>defaults:</b><br><br>&ensp;#333333	*/
	public void setTickColor(HIColor tickColor) {
		this.tickColor = tickColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getTickColor(){ return tickColor; }

	private HIColor gridLineColor;
	/**
 Color of the grid lines extending the ticks across the plot area. In styled mode, the stroke is given in the `.highcharts-grid-line` class. 
 <br><br><b>defaults:</b><br><br>&ensp;#e6e6e6	*/
	public void setGridLineColor(HIColor gridLineColor) {
		this.gridLineColor = gridLineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getGridLineColor(){ return gridLineColor; }

	private Number minorGridLineWidth;
	/**
 Width of the minor, secondary grid lines. In styled mode, the stroke width is given in the `.highcharts-grid-line` class. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setMinorGridLineWidth(Number minorGridLineWidth) {
		this.minorGridLineWidth = minorGridLineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorGridLineWidth(){ return minorGridLineWidth; }

	private Boolean startOnTick;
	/**
 Whether to force the axis to start on a tick. Use this option with the `minPadding` option to control the axis start. 
	*/
	public void setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStartOnTick(){ return startOnTick; }

	private Boolean uniqueNames;
	/**
 Applies only when the axis `type` is `category`. When `uniqueNames` is true, points are placed on the X axis according to their names. If the same point name is repeated in the same or another series, the point is placed on the same X position as other points of the same name. When `uniqueNames` is false, the points are laid out in increasing X positions regardless of their names, and the X axis category will take the name of the last point in each position. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setUniqueNames(Boolean uniqueNames) {
		this.uniqueNames = uniqueNames;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUniqueNames(){ return uniqueNames; }

	private Number tickAmount;
	/**
 The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the `tickPixelInterval` option. This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected. 
	*/
	public void setTickAmount(Number tickAmount) {
		this.tickAmount = tickAmount;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickAmount(){ return tickAmount; }

	private Number minorTicksPerMajor;
	/**
 The number of minor ticks per major tick. Works for `linear`, `logarithmic` and `datetime` axes. 
 <br><br><b>defaults:</b><br><br>&ensp;5	*/
	public void setMinorTicksPerMajor(Number minorTicksPerMajor) {
		this.minorTicksPerMajor = minorTicksPerMajor;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorTicksPerMajor(){ return minorTicksPerMajor; }

	private Boolean reversedStacks;
	/**
 This option determines how stacks should be ordered within a group. For example reversed xAxis also reverses stacks, so first series comes last in a group. To keep order like for non-reversed xAxis enable this option. 
	*/
	public void setReversedStacks(Boolean reversedStacks) {
		this.reversedStacks = reversedStacks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversedStacks(){ return reversedStacks; }



	public HIZAxis() {

	}

	/**
	 * Add a plot band after render time.
	 * @param options A configuration object for the plot band, as defined in xAxis.plotBands.
	 */
	public void addPlotBand(HIPlotBands options) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("method", "addPlotBand");
			put("axis", "z");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(options.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}


	/**
	 * Add a plot line after render time.
	 * @param options A configuration object for the plot line, as defined in xAxis.plotLines.
	 */
	public void addPlotLine(HIPlotLines options) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "addPlotLine");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(options.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Adds the title defined in axis.options.title.
	 * @param display Whether or not to display the title.
	 */
	public void addTitle(Boolean display) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "addTitle");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(display)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Internal function to draw a crosshair.
	 */
	public void drawCrosshair() {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "drawCrosshair");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Hide the crosshair if visible.
	 */
	public void hideCrosshair() {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "hideCrosshair");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Remove the axis from the chart.
	 */
	public void remove() {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "remove0");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Remove the axis from the chart.
	 * @param redraw Whether to redraw the chart following the remove.
	 */
	public void remove(Boolean redraw) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "remove1");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(redraw)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Remove a plot band by its id.
	 * @param id The plot band's id as given in the original configuration object or in the addPlotBand option.
	 */
	public void removePlotBand(String id) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "removePlotBand");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(id)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Remove a plot line by its id.
	 * @param id The plot line's id as given in the original configuration object or in the addPlotLine option.
	 */
	public void removePlotLine(String id) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "removePlotLine");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(id)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Render the axis line. Called internally when rendering and redrawing the axis.
	 */
	public void renderLine() {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "renderLine");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Render a minor tick into the given position. If a minor tick already exists in this position, move it.
	 * @param pos The position in axis values.
	 */
	public void renderMinorTick(Number pos) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "renderMinorTick");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(pos)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Render a major tick into the given position. If a tick already exists in this position, move it.
	 * @param pos The position in axis values.
	 * @param i The tick index.
	 */
	public void renderTick(Number pos, Number i) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "renderTick");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(pos, i)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set new axis categories and optionally redraw.
	 * @param categories The new categories.
	 */
	public void setCategories(List<String> categories) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setCategories0");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(categories)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set new axis categories and optionally redraw.
	 * @param categories The new categories.
	 * @param redraw Whether to redraw the chart.
	 */
	public void setCategories(List<String> categories, boolean redraw) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setCategories1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(categories, redraw)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
	 */
	public void setExtremes() {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setExtremes0");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
	 * @param newMin The new minimum value.
	 */
	public void setExtremes(Number newMin) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setExtremes1");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(newMin)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
	 * @param newMin The new minimum value.
	 * @param newMax The new maximum value.
	 */
	public void setExtremes(Number newMin, Number newMax) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setExtremes2");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(newMin, newMax)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
	 * @param newMin The new minimum value.
	 * @param newMax The new maximum value.
	 * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
	 */
	public void setExtremes(Number newMin, Number newMax, boolean redraw) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setExtremes3");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(newMin, newMax, redraw)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}


	/**
	 * Set the minimum and maximum of the axes after render time. If the startOnTick and endOnTick options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, setExtremes will not allow a range lower than the minRange option, which by default is the range of five points.
	 * @param newMin The new minimum value.
	 * @param newMax The new maximum value.
	 * @param redraw Whether to redraw the chart or wait for an explicit call to HIChartView redraw()
	 * @param animation Enable or modify animations.
	 */
	public void setExtremes(Number newMin, Number newMax, boolean redraw, HIAnimationOptionsObject animation) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setExtremes4");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(newMin, newMax, redraw, animation.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Now we have computed the normalized tickInterval, get the tick positions
	 */
	public void setTickPositions() {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setTickPositions");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Update the axis title by options after render time.
	 * @param title The additional title options.
	 */
	public void setAxisTitle(HITitle title) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setTitle0");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(title)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Update the axis title by options after render time.
	 * @param title The additional title options.
	 * @param redraw Whether to redraw the chart after setting the title.
	 */
	public void setAxisTitle(HITitle title, boolean redraw) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setTitle1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(title, redraw)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Translate a pixel position along the axis to a value in terms of axis units.
	 * @param options The new options that will be merged in with existing options on the axis.
	 */
	public void update(HIZAxis options) {
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setTitle0");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(params)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Translate a pixel position along the axis to a value in terms of axis units.
	 * @param options The new options that will be merged in with existing options on the axis.
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call redraw() on HIChartView after.
	 */
	public void update(HIZAxis options, boolean redraw) {
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "z");
			put("method", "setTitle1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(params, redraw)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}


	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
		}
		if (this.gridZIndex != null) {
			params.put("gridZIndex", this.gridZIndex);
		}
		if (this.pane != null) {
			params.put("pane", this.pane);
		}
		if (this.title != null) {
			params.put("title", this.title.getParams());
		}
		if (this.panningEnabled != null) {
			params.put("panningEnabled", this.panningEnabled);
		}
		if (this.tickPixelInterval != null) {
			params.put("tickPixelInterval", this.tickPixelInterval);
		}
		if (this.tickInterval != null) {
			params.put("tickInterval", this.tickInterval);
		}
		if (this.categories != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.categories) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("categories", array);
		}
		if (this.showLastLabel != null) {
			params.put("showLastLabel", this.showLastLabel);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.crossing != null) {
			params.put("crossing", this.crossing);
		}
		if (this.tickPosition != null) {
			params.put("tickPosition", this.tickPosition);
		}
		if (this.startOfWeek != null) {
			params.put("startOfWeek", this.startOfWeek);
		}
		if (this.minorGridLineColor != null) {
			params.put("minorGridLineColor", this.minorGridLineColor.getData());
		}
		if (this.endOnTick != null) {
			params.put("endOnTick", this.endOnTick);
		}
		if (this.plotLines != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.plotLines) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("plotLines", array);
		}
		if (this.gridLineInterpolation != null) {
			params.put("gridLineInterpolation", this.gridLineInterpolation);
		}
		if (this.gridLineDashStyle != null) {
			params.put("gridLineDashStyle", this.gridLineDashStyle);
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
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.minTickInterval != null) {
			params.put("minTickInterval", this.minTickInterval);
		}
		if (this.minorTickInterval != null) {
			params.put("minorTickInterval", this.minorTickInterval);
		}
		if (this.linkedTo != null) {
			params.put("linkedTo", this.linkedTo);
		}
		if (this.dateTimeLabelFormats != null) {
			params.put("dateTimeLabelFormats", this.dateTimeLabelFormats.getParams());
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.showFirstLabel != null) {
			params.put("showFirstLabel", this.showFirstLabel);
		}
		if (this.tickmarkPlacement != null) {
			params.put("tickmarkPlacement", this.tickmarkPlacement);
		}
		if (this.tickPositioner != null) {
			params.put("tickPositioner", this.tickPositioner);
		}
		if (this.minorTickLength != null) {
			params.put("minorTickLength", this.minorTickLength);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.ceiling != null) {
			params.put("ceiling", this.ceiling);
		}
		if (this.tickWidth != null) {
			params.put("tickWidth", this.tickWidth);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.gridLineWidth != null) {
			params.put("gridLineWidth", this.gridLineWidth);
		}
		if (this.alternateGridColor != null) {
			params.put("alternateGridColor", this.alternateGridColor.getData());
		}
		if (this.minorTickColor != null) {
			params.put("minorTickColor", this.minorTickColor.getData());
		}
		if (this.maxPadding != null) {
			params.put("maxPadding", this.maxPadding);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.softMax != null) {
			params.put("softMax", this.softMax);
		}
		if (this.minPadding != null) {
			params.put("minPadding", this.minPadding);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.alignTicks != null) {
			params.put("alignTicks", this.alignTicks);
		}
		if (this.zoomEnabled != null) {
			params.put("zoomEnabled", this.zoomEnabled);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.minRange != null) {
			params.put("minRange", this.minRange);
		}
		if (this.angle != null) {
			params.put("angle", this.angle);
		}
		if (this.allowDecimals != null) {
			params.put("allowDecimals", this.allowDecimals);
		}
		if (this.floor != null) {
			params.put("floor", this.floor);
		}
		if (this.tickPositions != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.tickPositions) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("tickPositions", array);
		}
		if (this.plotBands != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.plotBands) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("plotBands", array);
		}
		if (this.units != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.units) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
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
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.tickLength != null) {
			params.put("tickLength", this.tickLength);
		}
		if (this.opposite != null) {
			params.put("opposite", this.opposite);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.minorGridLineDashStyle != null) {
			params.put("minorGridLineDashStyle", this.minorGridLineDashStyle);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.tickColor != null) {
			params.put("tickColor", this.tickColor.getData());
		}
		if (this.gridLineColor != null) {
			params.put("gridLineColor", this.gridLineColor.getData());
		}
		if (this.minorGridLineWidth != null) {
			params.put("minorGridLineWidth", this.minorGridLineWidth);
		}
		if (this.startOnTick != null) {
			params.put("startOnTick", this.startOnTick);
		}
		if (this.uniqueNames != null) {
			params.put("uniqueNames", this.uniqueNames);
		}
		if (this.tickAmount != null) {
			params.put("tickAmount", this.tickAmount);
		}
		if (this.minorTicksPerMajor != null) {
			params.put("minorTicksPerMajor", this.minorTicksPerMajor);
		}
		if (this.reversedStacks != null) {
			params.put("reversedStacks", this.reversedStacks);
		}
		return params;
	}

}