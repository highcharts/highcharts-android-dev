/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.common.HIColor;



public class HIParallelAxes extends HIFoundation { 

	private Object title;
	/**
/** * description: Titles for yAxes are taken from `xAxis.categories`. All options for `xAxis.labels` applies to parallel coordinates titles. For example, to style categories, use `xAxis.labels.style`. 
*/
	public void setTitle(Object title) {
		this.title = title;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getTitle(){ return title; }

	private HILabels labels;
	/**
/** * description: The axis labels show the number or category for each tick. Since v8.0.0: Labels are animated in categorized x-axis with updating data if `tickInterval` and `step` is set to 1. 
*/
	public void setLabels(HILabels labels) {
		this.labels = labels;
		this.labels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabels getLabels(){ return labels; }

	private Number offset;
	/**
/** * description: The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly. * demo: * [Y axis offset of 70](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset/) * [Axes positioned in the center of the plot](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset-centered/) 
*/
	public void setOffset(Number offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffset(){ return offset; }

	private Number lineWidth;
	/**
/** * description: The width of the line marking the axis itself. In styled mode, the stroke width is given in the `.highcharts-axis-line` or `.highcharts-xaxis-line` class. * demo: * [A 1px line on Y axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linecolor/) * [Axes in styled mode](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/) 
* defaults: 1
*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number minPadding;
	/**
/** * description: Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' `min` option is set or a max extreme is set using `axis.setExtremes()`, the maxPadding will be ignored. Also the `softThreshold` option takes precedence over `minPadding`, so if the data is tangent to the threshold, `minPadding` may not apply unless `softThreshold` is set to false. * demo: * [Min padding of 0.2](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/) 
* defaults: 0.05
*/
	public void setMinPadding(Number minPadding) {
		this.minPadding = minPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPadding(){ return minPadding; }

	private Object /* Number, String */ height;
	/**
/** * description: The height of the Y axis. If it's a number, it is interpreted as pixels. Since Highcharts 2: If it's a percentage string, it is interpreted as percentages of the total plot height. * demo: * [Different axis position properties](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/axis-position-properties) 
*/
	public void setHeight(Object /* Number, String */ height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getHeight(){ return height; }

	private Number softMax;
	/**
/** * description: A soft maximum for the axis. If the series data maximum is less than this, the axis will stay at this maximum, but if the series data maximum is higher, the axis will flex to show all data. **Note**: The `series.softThreshold` option takes precedence over this option. * demo: * [Soft min and max](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/) 
*/
	public void setSoftMax(Number softMax) {
		this.softMax = softMax;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSoftMax(){ return softMax; }

	private Object /* Number, String */ min;
	/**
/** * description: The minimum value of the axis. If `undefined`, the min value is automatically calculated. If a datetime string is passed, it is parsed into epoch time according to the time zone given in `time.timezone`. If the `startOnTick` option is true (defaults), the `min` value might be rounded down. The automatically calculated minimum value is also affected by `floor`, `softMin`, `minPadding`, `minRange` as well as `series.threshold` and `series.softThreshold`. * demo: * [-50 with startOnTick to false](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-false/) * [-50 with startOnTick true by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-true/) 
*/
	public void setMin(Object /* Number, String */ min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMin(){ return min; }

	private Boolean endOnTick;
	/**
/** * description: Whether to force the axis to end on a tick. Use this option with the `maxPadding` option to control the axis end. This option is always disabled, when panning type is either `y` or `xy`. * demo: * [True by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/) * [False](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick-false/) 
* defaults: True
*/
	public void setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEndOnTick(){ return endOnTick; }

	private Object /* Number, String */ max;
	/**
/** * description: The maximum value of the axis. If `undefined`, the max value is automatically calculated. If a datetime string is passed, it is parsed into epoch time according to the time zone given in `time.timezone`. If the `endOnTick` option is true, the `max` value might be rounded up. If a `tickAmount` is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by `chart.alignTicks`, where a `tickAmount` is applied internally. * demo: * [Y axis max of 200](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-200/) * [Y axis max on logarithmic axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-logarithmic/) 
*/
	public void setMax(Object /* Number, String */ max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMax(){ return max; }

	private Number softMin;
	/**
/** * description: A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data. **Note**: The `series.softThreshold` option takes precedence over this option. * demo: * [Soft min and max](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/softmin-softmax/) 
*/
	public void setSoftMin(Number softMin) {
		this.softMin = softMin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSoftMin(){ return softMin; }

	private String type;
	/**
/** * description: The type of axis. Can be one of `linear`, `logarithmic`, `datetime`, `category` or `treegrid`. Defaults to `treegrid` for Gantt charts, `linear` for other chart types. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed on appropriate values, like full hours or days. In a category or treegrid axis, the `point names` of the chart's series are used for categories, if a `categories` array is not defined. * demo: * [Logarithmic with minor grid lines](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-minorgrid/) * [Logarithmic with extension to emulate negative values](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/type-log-negative/) 
* defaults: linear
*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private HIStackShadow stackShadow;
	/**
 Relevant only for pictorial series. The `stackShadow` forms the background of stacked points. Requires `series.stacking` to be defined. 
	*/
	public void setStackShadow(HIStackShadow stackShadow) {
		this.stackShadow = stackShadow;
		this.stackShadow.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStackShadow getStackShadow(){ return stackShadow; }

	private Number tickPixelInterval;
	/**
/** * description: If tickInterval is `null` this option sets the approximate pixel interval of the tick marks. Not applicable to categorized axis. The tick interval is also influenced by the `minTickInterval` option, that, by defaults prevents ticks from being denser than the data points. * demo: * [50 px on X axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/) 
* defaults: 72
*/
	public void setTickPixelInterval(Number tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickPixelInterval(){ return tickPixelInterval; }

	private Number tickWidth;
	/**
/** * description: The pixel width of the major tick marks. * demo: * [10 px width](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickwidth/) 
* defaults: 0
*/
	public void setTickWidth(Number tickWidth) {
		this.tickWidth = tickWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickWidth(){ return tickWidth; }

	private Boolean opposite;
	/**
/** * description: Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes. * demo: * [Secondary Y axis opposite](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/opposite/) 
*/
	public void setOpposite(Boolean opposite) {
		this.opposite = opposite;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOpposite(){ return opposite; }

	private Boolean reversed;
	/**
/** * description: Whether to reverse the axis so that the highest number is closest to the origin. * demo: * [Reversed Y axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/) 
*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private String tooltipValueFormat;
	/**
 Parallel coordinates only. Format that will be used for point.y and available in `tooltip.pointFormat` as `{point.formattedValue}`. If not set, `{point.formattedValue}` will use other options, in this order: 1. `yAxis.labels.format` will be used if  set 2. If yAxis is a category, then category name will be displayed 3. If yAxis is a datetime, then value will use the same format as  yAxis labels 4. If yAxis is linear/logarithmic type, then simple value will be  used 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setTooltipValueFormat(String tooltipValueFormat) {
		this.tooltipValueFormat = tooltipValueFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTooltipValueFormat(){ return tooltipValueFormat; }

	private Boolean showLastLabel;
	/**
/** * description: Whether to show the last tick label. * demo: * [Set to true on X axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showlastlabel-true/) 
* defaults: undefined
*/
	public void setShowLastLabel(Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowLastLabel(){ return showLastLabel; }

	private Boolean startOnTick;
	/**
/** * description: Whether to force the axis to start on a tick. Use this option with the `maxPadding` option to control the axis start. This option is always disabled, when panning type is either `y` or `xy`. * demo: * [False by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/) * [True](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/) 
* defaults: True
*/
	public void setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStartOnTick(){ return startOnTick; }

	private Number maxPadding;
	/**
/** * description: Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' `max` option is set or a max extreme is set using `axis.setExtremes()`, the maxPadding will be ignored. Also the `softThreshold` option takes precedence over `maxPadding`, so if the data is tangent to the threshold, `maxPadding` may not apply unless `softThreshold` is set to false. * demo: * [Max padding of 0.2](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding-02/) 
* defaults: 0.05
*/
	public void setMaxPadding(Number maxPadding) {
		this.maxPadding = maxPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPadding(){ return maxPadding; }

	private Boolean reversedStacks;
	/**
/** * description: If `true`, the first series in a stack will be drawn on top in a positive, non-reversed Y axis. If `false`, the first series is in the base of the stack. * demo: * [Non-reversed stacks](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversedstacks-false/) 
* defaults: true
*/
	public void setReversedStacks(Boolean reversedStacks) {
		this.reversedStacks = reversedStacks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversedStacks(){ return reversedStacks; }

	private Object /* Number, String */ top;
	/**
/** * description: The top position of the Y axis. If it's a number, it is interpreted as pixel position relative to the chart. Since Highcharts 2: If it's a percentage string, it is interpreted as percentages of the plot height, offset from plot area top. * demo: * [Different axis position properties](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/axis-position-properties) 
*/
	public void setTop(Object /* Number, String */ top) {
		this.top = top;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getTop(){ return top; }

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

	public enum TickPosition {
		INSIDE("inside"),
		OUTSIDE("outside");

		private final String value;

		TickPosition(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setTickPosition(TickPosition tickPosition) {
		this.tickPosition = tickPosition.getValue();
		this.setChanged();
		this.notifyObservers();
	}

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

	private Boolean showEmpty;
	/**
 Whether to show the axis line and title when the axis has no data. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setShowEmpty(Boolean showEmpty) {
		this.showEmpty = showEmpty;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowEmpty(){ return showEmpty; }

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

	private HICrosshair crosshair;
	/**
 Configure a crosshair that follows either the mouse pointer or the hovered point. In styled mode, the crosshairs are styled in the `.highcharts-crosshair`, `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setCrosshair(HICrosshair crosshair) {
		this.crosshair = crosshair;
		this.crosshair.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICrosshair getCrosshair(){ return crosshair; }

	public enum MinorTickPosition {
		INSIDE("inside"),
		OUTSIDE("outside");

		private final String value;

		MinorTickPosition(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setMinorTickPosition(MinorTickPosition minorTickPosition) {
		this.minorTickPosition = minorTickPosition.getValue();
		this.setChanged();
		this.notifyObservers();
	}

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

	private Number minorTickInterval;
	/**
 Specific tick interval in axis units for the minor ticks. On a linear axis, if `"auto"`, the minor tick interval is calculated as a fifth of the tickInterval. If `undefined`, minor ticks are not shown. On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc. If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems. 
	*/
	public void setMinorTickInterval(Number minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorTickInterval(){ return minorTickInterval; }

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

	private HIColor lineColor;
	/**
 The color of the line marking the axis itself. In styled mode, the line stroke is given in the `.highcharts-axis-line` or `.highcharts-xaxis-line` class. 
 <br><br><b>defaults:</b><br><br>&ensp;#333333	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private HIDateTimeLabelFormats dateTimeLabelFormats;
	/**
 For a datetime axis, the scale will automatically adjust to the appropriate unit. This member gives the defaults string representations used for each unit. For intermediate values, different units may be used, for example the `day` unit can be used on midnight and `hour` unit be used for intermediate values on the same axis. For an overview of the string or object configuration, see `dateFormat`. Defaults to: ```js {   millisecond: '%[HMSL]',   second: '%[HMS]',   minute: '%[HM]',   hour: '%[HM]',   day: '%[eb]',   week: '%[eb]',   month: '%[bY]',   year: '%Y' } ``` 
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

	public enum TickmarkPlacement {
		ON("on"),
		BETWEEN("between");

		private final String value;

		TickmarkPlacement(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setTickmarkPlacement(TickmarkPlacement tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String tickmarkPlacement;
	/**
 For categorized axes only. If `on` the tick mark is placed in the center of the category, if `between` the tick mark is placed between categories. The defaults is `between` if the `tickInterval` is 1, else `on`. In order to render tick marks on a category axis it is necessary to provide a `tickWidth`. 
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

	private Object /* Number, String */ width;
	/**
 The width as the horizontal axis. If it's a number, it is interpreted as pixels. Since Highcharts v5.0.13: If it's a percentage string, it is interpreted as percentages of the total plot width. 
	*/
	public void setWidth(Object /* Number, String */ width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWidth(){ return width; }

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

	private Boolean uniqueNames;
	/**
 Applies only when the axis `type` is `category`. When `uniqueNames` is true, points are placed on the X axis according to their names. If the same point name is repeated in the same or another series, the point is placed on the same X position as other points of the same name. When `uniqueNames` is false, the points are laid out in increasing X positions regardless of their names, and the X axis category will take the name of the last point in each position. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
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

	private Object /* Number, String */ left;
	/**
 The left position as the horizontal axis. If it's a number, it is interpreted as pixel position relative to the chart. Since Highcharts v5.0.13: If it's a percentage string, it is interpreted as percentages of the plot width, offset from plot area left. 
	*/
	public void setLeft(Object /* Number, String */ left) {
		this.left = left;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getLeft(){ return left; }



	public HIParallelAxes() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.title != null) {
			params.put("title", this.title);
		}
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.minPadding != null) {
			params.put("minPadding", this.minPadding);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.softMax != null) {
			params.put("softMax", this.softMax);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.endOnTick != null) {
			params.put("endOnTick", this.endOnTick);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.softMin != null) {
			params.put("softMin", this.softMin);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.stackShadow != null) {
			params.put("stackShadow", this.stackShadow.getParams());
		}
		if (this.tickPixelInterval != null) {
			params.put("tickPixelInterval", this.tickPixelInterval);
		}
		if (this.tickWidth != null) {
			params.put("tickWidth", this.tickWidth);
		}
		if (this.opposite != null) {
			params.put("opposite", this.opposite);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.tooltipValueFormat != null) {
			params.put("tooltipValueFormat", this.tooltipValueFormat);
		}
		if (this.showLastLabel != null) {
			params.put("showLastLabel", this.showLastLabel);
		}
		if (this.startOnTick != null) {
			params.put("startOnTick", this.startOnTick);
		}
		if (this.maxPadding != null) {
			params.put("maxPadding", this.maxPadding);
		}
		if (this.reversedStacks != null) {
			params.put("reversedStacks", this.reversedStacks);
		}
		if (this.top != null) {
			params.put("top", this.top);
		}
		if (this.gridZIndex != null) {
			params.put("gridZIndex", this.gridZIndex);
		}
		if (this.pane != null) {
			params.put("pane", this.pane);
		}
		if (this.panningEnabled != null) {
			params.put("panningEnabled", this.panningEnabled);
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
		if (this.crossing != null) {
			params.put("crossing", this.crossing);
		}
		if (this.tickPosition != null) {
			params.put("tickPosition", this.tickPosition);
		}
		if (this.showEmpty != null) {
			params.put("showEmpty", this.showEmpty);
		}
		if (this.startOfWeek != null) {
			params.put("startOfWeek", this.startOfWeek);
		}
		if (this.crosshair != null) {
			params.put("crosshair", this.crosshair.getParams());
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
		if (this.minTickInterval != null) {
			params.put("minTickInterval", this.minTickInterval);
		}
		if (this.minorTickInterval != null) {
			params.put("minorTickInterval", this.minorTickInterval);
		}
		if (this.linkedTo != null) {
			params.put("linkedTo", this.linkedTo);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
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
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.minorTickLength != null) {
			params.put("minorTickLength", this.minorTickLength);
		}
		if (this.ceiling != null) {
			params.put("ceiling", this.ceiling);
		}
		if (this.minorTickColor != null) {
			params.put("minorTickColor", this.minorTickColor.getData());
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
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
		if (this.minRange != null) {
			params.put("minRange", this.minRange);
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
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.tickLength != null) {
			params.put("tickLength", this.tickLength);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.tickColor != null) {
			params.put("tickColor", this.tickColor.getData());
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
		if (this.left != null) {
			params.put("left", this.left);
		}
		return params;
	}

}