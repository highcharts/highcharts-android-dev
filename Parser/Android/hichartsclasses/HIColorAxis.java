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



public class HIColorAxis extends HIFoundation { 

	private ArrayList <HIDataClasses> dataClasses;
	/**
 An array of data classes or ranges for the choropleth map. If none given, the color axis is scalar and values are distributed as a gradient between the minimum and maximum colors. 
	*/
	public void setDataClasses(ArrayList dataClasses) {
		this.dataClasses = dataClasses;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getDataClasses(){ return dataClasses; }

	private Number minPadding;
	/**
/** * description: Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. * demo: * [Min padding of 0.2](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minpadding/) 
*/
	public void setMinPadding(Number minPadding) {
		this.minPadding = minPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPadding(){ return minPadding; }

	private HILabels labels;
	/**
/** * description: The axis labels show the number for each tick. For more live examples on label options, see `xAxis.labels in the Highcharts API.` 
*/
	public void setLabels(HILabels labels) {
		this.labels = labels;
		this.labels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabels getLabels(){ return labels; }

	private Object /* Number, String */ height;
	/**
/** * description: The height of the color axis. If it's a number, it is interpreted as pixels. If it's a percentage string, it is interpreted as percentages of the total plot height. * demo: * [Percentage width and pixel height for color axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/width-and-height) 
*/
	public void setHeight(Object /* Number, String */ height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getHeight(){ return height; }

	private HIColor maxColor;
	/**
 The color to represent the maximum of the color axis. Unless `dataClasses` or `stops` are set, the gradient ends at this value. If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the `dataClassColor` is set. 
 <br><br><b>defaults:</b><br><br>&ensp;#0022ff	*/
	public void setMaxColor(HIColor maxColor) {
		this.maxColor = maxColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMaxColor(){ return maxColor; }

	private HIMarker marker;
	/**
 The triangular marker on a scalar color axis that points to the value of the hovered area. To disable the marker, set `marker: null`. 
	*/
	public void setMarker(HIMarker marker) {
		this.marker = marker;
		this.marker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMarker getMarker(){ return marker; }

	private String layout;
	/**
 The layout of the color axis. Can be `'horizontal'` or `'vertical'`. If none given, the color axis has the same layout as the legend. 
	*/
	public void setLayout(String layout) {
		this.layout = layout;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayout(){ return layout; }

	private Boolean startOnTick;
	/**
/** * description: Whether to force the axis to start on a tick. Use this option with the `maxPadding` option to control the axis start. * demo: * [False by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-false/) * [True](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startontick-true/) 
* defaults: True
*/
	public void setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStartOnTick(){ return startOnTick; }

	private ArrayList<ArrayList> /* <Number, String> */ stops;
	/**
 Color stops for the gradient of a scalar color axis. Use this in cases where a linear gradient between a `minColor` and `maxColor` is not sufficient. The stops is an array of tuples, where the first item is a float between 0 and 1 assigning the relative position in the gradient, and the second item is the color. 
	*/
	public void setStops(ArrayList<ArrayList> /* <Number, String> */ stops) {
		this.stops = stops;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<ArrayList> /* <Number, String> */ getStops(){ return stops; }

	private Object /* Number, String */ width;
	/**
/** * description: The width of the color axis. If it's a number, it is interpreted as pixels. If it's a percentage string, it is interpreted as percentages of the total plot width. * demo: * [Percentage width and pixel height for color axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/width-and-height) 
*/
	public void setWidth(Object /* Number, String */ width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWidth(){ return width; }

	private String dataClassColor;
	/**
 Determines how to set each data class' color if no individual color is set. The defaults value, `tween`, computes intermediate colors between `minColor` and `maxColor`. The other possible value, `category`, pulls colors from the global or chart specific `colors` array. 
 <br><br><b>defaults:</b><br><br>&ensp;tween	*/
	public void setDataClassColor(String dataClassColor) {
		this.dataClassColor = dataClassColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDataClassColor(){ return dataClassColor; }

	private Boolean endOnTick;
	/**
/** * description: Whether to force the axis to end on a tick. Use this option with the `maxPadding` option to control the axis end. * demo: * [True by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick/) * [False](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/endontick-false/) 
* defaults: True
*/
	public void setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEndOnTick(){ return endOnTick; }

	private String type;
	/**
/** * description: The type of interpolation to use for the color axis. Can be `linear` or `logarithmic`. * demo: * [Logarithmic color axis with extension to emulate negative values](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/logarithmic-with-emulate-negative-values/) 
* defaults: linear
*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Object events;
	/**
/** * description: Event handlers for the axis. 
*/
	public void setEvents(Object events) {
		this.events = events;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getEvents(){ return events; }

	private Number tickPixelInterval;
	/**
/** * description: If `tickInterval` is `null` this option sets the approximate pixel interval of the tick marks. * demo: * [50 px on X axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpixelinterval-50/) 
* defaults: 72
*/
	public void setTickPixelInterval(Number tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickPixelInterval(){ return tickPixelInterval; }

	private Number max;
	/**
/** * description: The maximum value of the axis in terms of map point values. If `null`, the max value is automatically calculated. If the `endOnTick` option is true, the max value might be rounded up. * demo: * [Y axis max of 200](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-200/) * [Y axis max on logarithmic axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/max-logarithmic/) 
*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private Boolean reversed;
	/**
/** * description: Whether to reverse the axis so that the highest number is closest to the origin. Defaults to `false` in a horizontal legend and `true` in a vertical legend, where the smallest value starts on top. * demo: * [Reversed Y axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/reversed/) 
* defaults: undefined
*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private Number gridLineWidth;
	/**
/** * description: The width of the grid lines extending from the axis across the gradient of a scalar color axis. * demo: * [2px lines](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinewidth/) * [Styled mode](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/) 
* defaults: 1
*/
	public void setGridLineWidth(Number gridLineWidth) {
		this.gridLineWidth = gridLineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGridLineWidth(){ return gridLineWidth; }

	private Number tickInterval;
	/**
/** * description: The interval of the tick marks in axis units. When `null`, the tick interval is computed to approximately follow the `tickPixelInterval`. * demo: * [Tick interval of 5 on a linear axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickinterval-5/) 
*/
	public void setTickInterval(Number tickInterval) {
		this.tickInterval = tickInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickInterval(){ return tickInterval; }

	private HIColor gridLineColor;
	/**
/** * description: Color of the grid lines extending from the axis across the gradient. * demo: * [Green lines](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinecolor/) * [Styled mode](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/) 
* defaults: #ffffff
*/
	public void setGridLineColor(HIColor gridLineColor) {
		this.gridLineColor = gridLineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getGridLineColor(){ return gridLineColor; }

	private HIColor minColor;
	/**
 The color to represent the minimum of the color axis. Unless `dataClasses` or `stops` are set, the gradient starts at this value. If dataClasses are set, the color is based on minColor and maxColor unless a color is set for each data class, or the `dataClassColor` is set. 
 <br><br><b>defaults:</b><br><br>&ensp;#e6e9ff	*/
	public void setMinColor(HIColor minColor) {
		this.minColor = minColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMinColor(){ return minColor; }

	private Number min;
	/**
/** * description: The minimum value of the axis in terms of map point values. If `null`, the min value is automatically calculated. If the `startOnTick` option is true, the min value might be rounded down. * demo: * [-50 with startOnTick to false](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-false/) * [-50 with startOnTick true by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/min-startontick-true/) 
*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }

	private Number maxPadding;
	/**
/** * description: Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. * demo: * [Max padding of 0.25 on y axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/maxpadding/) 
*/
	public void setMaxPadding(Number maxPadding) {
		this.maxPadding = maxPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPadding(){ return maxPadding; }

	private Number tickLength;
	/**
/** * description: The pixel length of the main tick marks on the color axis. * demo: * [20 px tick length on the X axis](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/) 
* defaults: 5
*/
	public void setTickLength(Number tickLength) {
		this.tickLength = tickLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickLength(){ return tickLength; }

	private Boolean showInLegend;
	/**
 Whether to display the colorAxis in the legend. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowInLegend(){ return showInLegend; }

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



	public HIColorAxis() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.dataClasses != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.dataClasses) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
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
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.maxColor != null) {
			params.put("maxColor", this.maxColor.getData());
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.layout != null) {
			params.put("layout", this.layout);
		}
		if (this.startOnTick != null) {
			params.put("startOnTick", this.startOnTick);
		}
		if (this.stops != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.stops) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("stops", array);
		}
		if (this.width != null) {
			params.put("width", this.width);
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
			params.put("events", this.events);
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
		if (this.min != null) {
			params.put("min", this.min);
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
		if (this.panningEnabled != null) {
			params.put("panningEnabled", this.panningEnabled);
		}
		if (this.showLastLabel != null) {
			params.put("showLastLabel", this.showLastLabel);
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
		if (this.minorTickInterval != null) {
			params.put("minorTickInterval", this.minorTickInterval);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
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
		if (this.ceiling != null) {
			params.put("ceiling", this.ceiling);
		}
		if (this.tickWidth != null) {
			params.put("tickWidth", this.tickWidth);
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
		if (this.softMax != null) {
			params.put("softMax", this.softMax);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.angle != null) {
			params.put("angle", this.angle);
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
		if (this.softMin != null) {
			params.put("softMin", this.softMin);
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
		if (this.minorGridLineWidth != null) {
			params.put("minorGridLineWidth", this.minorGridLineWidth);
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
		return params;
	}

}