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



public class HIYAxis extends HIFoundation { 

	private Number minPadding;
	/**
/** * description: Padding of the min value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the lowest data value to appear on the edge of the plot area. When the axis' min option is set or a max extreme is set using axis.setExtremes(), the maxPadding will be ignored. Also the softThreshold option takes precedence over minPadding, so if the data is tangent to the threshold, minPadding may not apply unless softThreshold is set to false. * demo:  •  Min padding of 0.2
* defaults: 0.01
*/
	public void setMinPadding(Number minPadding) {
		this.minPadding = minPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPadding(){ return minPadding; }

	private HILabels labels;
	/**
/** * description: The axis labels show the number or category for each tick. Since v8.0.0: Labels are animated in categorized x-axis with updating data if tickInterval and step is set to 1. 
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
/** * description: The height of the Y axis. If it's a number, it is interpreted as pixels. Since Highcharts 2: If it's a percentage string, it is interpreted as percentages of the total plot height. 
*/
	public void setHeight(Object /* Number, String */ height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getHeight(){ return height; }

	private HIColor maxColor;
	/**
 Solid gauge only. Unless stops are set, the color to represent the maximum value of the Y axis. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/mincolor-maxcolor/">Min and max colors</a>
 <br><br><b>defaults:</b><br><br>&ensp;#003399	*/
	public void setMaxColor(HIColor maxColor) {
		this.maxColor = maxColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMaxColor(){ return maxColor; }

	private Number softMax;
	/**
/** * description: A soft maximum for the axis. If the series data maximum is less than this, the axis will stay at this maximum, but if the series data maximum is higher, the axis will flex to show all data. **Note**: The series.softThreshold option takes precedence over this option. * demo:  •  Soft min and max
*/
	public void setSoftMax(Number softMax) {
		this.softMax = softMax;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSoftMax(){ return softMax; }

	private Number min;
	/**
/** * description: The minimum value of the axis. If null the min value is automatically calculated. If the startOnTick option is true (defaults), the min value might be rounded down. The automatically calculated minimum value is also affected by floor, softMin, minPadding, minRange as well as series.threshold and series.softThreshold. * demo:  •  -50 with startOnTick to false •  -50 with startOnTick true by defaults
*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }

	private ArrayList <HIPlotBands> plotBands;
	/**
/** * description: An array of colored bands stretching across the plot area marking an interval on the axis. In styled mode, the plot bands are styled by the .highcharts-plot-band class in addition to the className option. 
*/
	public void setPlotBands(ArrayList plotBands) {
		this.plotBands = plotBands;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPlotBands(){ return plotBands; }

	private ArrayList stops;
	/**
 Solid gauge series only. Color stops for the solid gauge. Use this in cases where a linear gradient between a minColor and maxColor is not sufficient. The stops is an array of tuples, where the first item is a float between 0 and 1 assigning the relative position in the gradient, and the second item is the color. For solid gauges, the Y axis also inherits the concept of [data classes](https://api.highcharts.com/highmaps#colorAxis.dataClasses) from the Highmaps color axis. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/">True by defaults</a>
	*/
	public void setStops(ArrayList stops) {
		this.stops = stops;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getStops(){ return stops; }

	private Boolean endOnTick;
	/**
/** * description: Whether to force the axis to end on a tick. Use this option with the maxPadding option to control the axis end. This option is always disabled, when panning type is either y or xy. * demo:  •  True by defaults •  False
*/
	public void setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEndOnTick(){ return endOnTick; }

	private Number max;
	/**
/** * description: The maximum value of the axis. If null, the max value is automatically calculated. If the endOnTick option is true, the max value might be rounded up. If a tickAmount is set, the axis may be extended beyond the set max in order to reach the given number of ticks. The same may happen in a chart with multiple axes, determined by `chart.alignTicks`, where a tickAmount is applied internally. * demo:  •  Y axis max of 200 •  Y axis max on logarithmic axis
*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private Number softMin;
	/**
/** * description: A soft minimum for the axis. If the series data minimum is greater than this, the axis will stay at this minimum, but if the series data minimum is lower, the axis will flex to show all data. **Note**: The series.softThreshold option takes precedence over this option. * demo:  •  Soft min and max
*/
	public void setSoftMin(Number softMin) {
		this.softMin = softMin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSoftMin(){ return softMin; }

	private String type;
	/**
/** * description: The type of axis. Can be one of linear, logarithmic, datetime, category or treegrid. Defaults to treegrid for Gantt charts, linear for other chart types. In a datetime axis, the numbers are given in milliseconds, and tick marks are placed on appropriate values, like full hours or days. In a category or treegrid axis, the point names of the chart's series are used for categories, if a categories array is not defined. * demo:  •  Logarithmic with minor grid lines •  Logarithmic with extension to emulate negative values
* defaults: linear
*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Number tickPixelInterval;
	/**
/** * description: If tickInterval is null this option sets the approximate pixel interval of the tick marks. Not applicable to categorized axis. The tick interval is also influenced by the minTickInterval option, that, by defaults prevents ticks from being denser than the data points. * demo:  •  50 px on X axis
*/
	public void setTickPixelInterval(Number tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickPixelInterval(){ return tickPixelInterval; }

	private Number tickWidth;
	/**
/** * description: The pixel width of the major tick marks. * demo:  •  10 px width
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
/** * description: Whether to display the axis on the opposite side of the normal. The normal is on the left side for vertical axes and bottom for horizontal, so the opposite sides will be right and top respectively. This is typically used with dual or multiple axes. * demo:  •  Secondary Y axis opposite
*/
	public void setOpposite(Boolean opposite) {
		this.opposite = opposite;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOpposite(){ return opposite; }

	private Boolean reversed;
	/**
/** * description: Whether to reverse the axis so that the highest number is closest to the origin. * demo:  •  Reversed Y axis
*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private ArrayList <HIPlotLines> plotLines;
	/**
/** * description: An array of lines stretching across the plot area, marking a specific value on one of the axes. In styled mode, the plot lines are styled by the .highcharts-plot-line class in addition to the className option. * demo:  •  Basic plot line •  Solid gauge plot line
*/
	public void setPlotLines(ArrayList plotLines) {
		this.plotLines = plotLines;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPlotLines(){ return plotLines; }

	private Number gridLineWidth;
	/**
/** * description: The width of the grid lines extending the ticks across the plot area. In styled mode, the stroke width is given in the .highcharts-grid-line class. * demo:  •  2px lines •  Styled mode
* defaults: 0
*/
	public void setGridLineWidth(Number gridLineWidth) {
		this.gridLineWidth = gridLineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGridLineWidth(){ return gridLineWidth; }

	private String tooltipValueFormat;
	/**
 Parallel coordinates only. Format that will be used for point.y and available in tooltip.pointFormat as {point.formattedValue}. If not set, {point.formattedValue} will use other options, in this order: 1. yAxis.labels.format will be used if  set 2. If yAxis is a category, then category name will be displayed 3. If yAxis is a datetime, then value will use the same format as  yAxis labels 4. If yAxis is linear/logarithmic type, then simple value will be  used <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples//highcharts/parallel-coordinates/tooltipvalueformat/">Different tooltipValueFormats's</a>
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setTooltipValueFormat(String tooltipValueFormat) {
		this.tooltipValueFormat = tooltipValueFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTooltipValueFormat(){ return tooltipValueFormat; }

	private Number lineWidth;
	/**
/** * description: The width of the line marking the axis itself. In styled mode, the stroke width is given in the .highcharts-axis-line or .highcharts-xaxis-line class. * demo:  •  A 1px line on Y axis •  Axes in styled mode
* defaults: 1
*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private HIColor minColor;
	/**
 Solid gauge only. Unless stops are set, the color to represent the minimum value of the Y axis. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/mincolor-maxcolor/">Min and max color</a>
 <br><br><b>defaults:</b><br><br>&ensp;#e6ebf5	*/
	public void setMinColor(HIColor minColor) {
		this.minColor = minColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMinColor(){ return minColor; }

	private Boolean showLastLabel;
	/**
/** * description: Whether to show the last tick label. Defaults to true on cartesian charts, and false on polar charts. * demo:  •  Set to true on X axis
* defaults: True
*/
	public void setShowLastLabel(Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowLastLabel(){ return showLastLabel; }

	private Boolean startOnTick;
	/**
/** * description: Whether to force the axis to start on a tick. Use this option with the maxPadding option to control the axis start. This option is always disabled, when panning type is either y or xy. * demo:  •  False by defaults •  True
*/
	public void setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStartOnTick(){ return startOnTick; }

	private HIStackLabels stackLabels;
	/**
 The stack labels show the total value for each bar in a stacked column or bar chart. The label will be placed on top of positive columns and below negative columns. In case of an inverted column chart or a bar chart the label is placed to the right of positive bars and to the left of negative bars. 
	*/
	public void setStackLabels(HIStackLabels stackLabels) {
		this.stackLabels = stackLabels;
		this.stackLabels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStackLabels getStackLabels(){ return stackLabels; }

	private Number maxPadding;
	/**
/** * description: Padding of the max value relative to the length of the axis. A padding of 0.05 will make a 100px axis 5px longer. This is useful when you don't want the highest data value to appear on the edge of the plot area. When the axis' max option is set or a max extreme is set using axis.setExtremes(), the maxPadding will be ignored. Also the softThreshold option takes precedence over maxPadding, so if the data is tangent to the threshold, maxPadding may not apply unless softThreshold is set to false. * demo:  •  Max padding of 0.2
* defaults: 0.01
*/
	public void setMaxPadding(Number maxPadding) {
		this.maxPadding = maxPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPadding(){ return maxPadding; }

	private HIColor lineColor;
	/**
/** * description: The color of the line marking the axis itself. In styled mode, the line stroke is given in the .highcharts-axis-line or .highcharts-xaxis-line class. * demo:  •  A red line on Y axis •  Axes in styled mode
* defaults: #ccd6eb
*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private HITitle title;
	/**
/** * description: The axis title, showing next to the axis line. 
*/
	public void setTitle(HITitle title) {
		this.title = title;
		this.title.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITitle getTitle(){ return title; }

	private Boolean reversedStacks;
	/**
/** * description: If true, the first series in a stack will be drawn on top in a positive, non-reversed Y axis. If false, the first series is in the base of the stack. * demo:  •  Non-reversed stacks
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
/** * description: The top position of the Y axis. If it's a number, it is interpreted as pixel position relative to the chart. Since Highcharts 2: If it's a percentage string, it is interpreted as percentages of the plot height, offset from plot area top. 
*/
	public void setTop(Object /* Number, String */ top) {
		this.top = top;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getTop(){ return top; }

	private HIColor minorTickColor;
	/**
 Color for the minor tick marks. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickcolor/">Black tick marks on Y axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;#999999	*/
	public void setMinorTickColor(HIColor minorTickColor) {
		this.minorTickColor = minorTickColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMinorTickColor(){ return minorTickColor; }

	private Number pane;
	/**
 Refers to the index in the panes array. Used for circular gauges and polar charts. When the option is not set then first pane will be used. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter">Two gauges with different center</a>
	*/
	public void setPane(Number pane) {
		this.pane = pane;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPane(){ return pane; }

	private String tickmarkPlacement;
	/**
 For categorized axes only. If on the tick mark is placed in the center of the category, if between the tick mark is placed between categories. The defaults is between if the tickInterval is 1, else on. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-between/">"between" by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickmarkplacement-on/">"on"</a> <br><br><b>accepted values:</b><br><br>&ensp;["on", "between"]
	*/
	public void setTickmarkPlacement(String tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTickmarkPlacement(){ return tickmarkPlacement; }

	private Number gridZIndex;
	/**
 The Z index of the grid lines. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridzindex/">A Z index of 4 renders the grid above the graph</a>
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setGridZIndex(Number gridZIndex) {
		this.gridZIndex = gridZIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGridZIndex(){ return gridZIndex; }

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

	private Boolean visible;
	/**
 Whether axis, including axis title, line, ticks and labels, should be visible. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private Boolean alignTicks;
	/**
 When using multiple axis, the ticks of two or more opposite axes will automatically be aligned by adding ticks to the axis or axes with the least ticks, as if tickAmount were specified. This can be prevented by setting alignTicks to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting gridLineWidth to 0. If startOnTick or endOnTick in an Axis options are set to false, then the alignTicks will be disabled for the Axis. Disabled for logarithmic axes. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignTicks(){ return alignTicks; }

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

	private Boolean showFirstLabel;
	/**
 Whether to show the first tick label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/showfirstlabel-false/">Set to false on X axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setShowFirstLabel(Boolean showFirstLabel) {
		this.showFirstLabel = showFirstLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowFirstLabel(){ return showFirstLabel; }

	private Number startOfWeek;
	/**
 For datetime axes, this decides where to put the tick between weeks. 0 = Sunday, 1 = Monday. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-monday/">Monday by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/startofweek-sunday/">Sunday</a>
	*/
	public void setStartOfWeek(Number startOfWeek) {
		this.startOfWeek = startOfWeek;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartOfWeek(){ return startOfWeek; }

	private String id;
	/**
 An id for the axis. This can be used after render time to get a pointer to the axis object through chart.get(). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/id/">Get the object</a>
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private ArrayList<Number> tickPositions;
	/**
 An array defining where the ticks are laid out on the axis. This overrides the defaults behaviour of tickPixelInterval and tickInterval. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
	*/
	public void setTickPositions(ArrayList<Number> tickPositions) {
		this.tickPositions = tickPositions;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getTickPositions(){ return tickPositions; }

	private Number minRange;
	/**
 The minimum range to display on this axis. The entire axis will not be allowed to span over a smaller interval than this. For example, for a datetime axis the main unit is milliseconds. If minRange is set to 3600000, you can't zoom in more than to one hour. The defaults minRange for the x axis is five times the smallest interval between any of the data points. On a logarithmic axis, the unit for the minimum range is the power. So a minRange of 1 means that the axis can be zoomed to 10-100, 100-1000, 1000-10000 etc. **Note**: The minPadding, maxPadding, startOnTick and endOnTick settings also affect how the extremes of the axis are computed. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/minrange/">Minimum range of 5</a>
	*/
	public void setMinRange(Number minRange) {
		this.minRange = minRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinRange(){ return minRange; }

	private Number angle;
	/**
 In a polar chart, this is the angle of the Y axis in degrees, where 0 is up and 90 is right. The angle determines the position of the axis line and the labels, though the coordinate system is unaffected. Since v8.0.0 this option is also applicable for X axis (inverted polar). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/angle/">Custom X axis' angle on inverted polar chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/angle/">Dual axis polar chart</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setAngle(Number angle) {
		this.angle = angle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAngle(){ return angle; }

	private Boolean allowDecimals;
	/**
 Whether to allow decimals in this axis' ticks. When counting integers, like persons or hits on a web page, decimals should be avoided in the labels. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-true/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/allowdecimals-false/">False</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAllowDecimals(Boolean allowDecimals) {
		this.allowDecimals = allowDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowDecimals(){ return allowDecimals; }

	private Number floor;
	/**
 The lowest allowed value for automatically computed axis extremes. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>
	*/
	public void setFloor(Number floor) {
		this.floor = floor;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFloor(){ return floor; }

	private HIColor minorGridLineColor;
	/**
 Color of the minor, secondary grid lines. In styled mode, the stroke width is given in the .highcharts-minor-grid-line class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinecolor/">Bright grey lines from Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
 <br><br><b>defaults:</b><br><br>&ensp;#f2f2f2	*/
	public void setMinorGridLineColor(HIColor minorGridLineColor) {
		this.minorGridLineColor = minorGridLineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMinorGridLineColor(){ return minorGridLineColor; }

	private HIFunction tickPositioner;
	/**
 A callback function returning array defining where the ticks are laid out on the axis. This overrides the defaults behaviour of tickPixelInterval and tickInterval. The automatic tick positions are accessible through this.tickPositions and can be modified by the callback. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickpositions-tickpositioner/">Demo of tickPositions and tickPositioner</a>
	*/
	public void setTickPositioner(HIFunction tickPositioner) {
		this.tickPositioner = tickPositioner;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getTickPositioner(){ return tickPositioner; }

	private String minorGridLineDashStyle;
	/**
 The dash or dot style of the minor grid lines. For possible values, see [this demonstration](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinedashstyle/">Long dashes on minor grid lines</a>
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setMinorGridLineDashStyle(String minorGridLineDashStyle) {
		this.minorGridLineDashStyle = minorGridLineDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMinorGridLineDashStyle(){ return minorGridLineDashStyle; }

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
 The pixel length of the minor tick marks. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticklength/">10px on Y axis</a>
	*/
	public void setMinorTickLength(Number minorTickLength) {
		this.minorTickLength = minorTickLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorTickLength(){ return minorTickLength; }

	private ArrayList<ArrayList> units;
	/**
 Datetime axis only. An array determining what time intervals the ticks are allowed to fall on. Each array item is an array where the first value is the time unit and the second value another array of allowed multiples. Defaults to: `js units: [[   'millisecond', // unit name   [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples ], [   'second',   [1, 2, 5, 10, 15, 30] ], [   'minute',   [1, 2, 5, 10, 15, 30] ], [   'hour',   [1, 2, 3, 4, 6, 8, 12] ], [   'day',   [1] ], [   'week',   [1] ], [   'month',   [1, 3, 6] ], [   'year',   null ]] ` 
	*/
	public void setUnits(ArrayList<ArrayList> units) {
		this.units = units;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<ArrayList> getUnits(){ return units; }

	private String gridLineInterpolation;
	/**
 Polar charts only. Whether the grid lines should draw as a polygon with straight lines between categories, or as circles. Can be either circle or polygon. Since v8.0.0 this option is also applicable for X axis (inverted polar). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-spider/">Polygon grid lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/gridlineinterpolation/">Circle and polygon on inverted polar</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlineinterpolation/">Circle and polygon</a> <br><br><b>accepted values:</b><br><br>&ensp;["circle", "polygon"]
	*/
	public void setGridLineInterpolation(String gridLineInterpolation) {
		this.gridLineInterpolation = gridLineInterpolation;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGridLineInterpolation(){ return gridLineInterpolation; }

	private Number tickLength;
	/**
 The pixel length of the main tick marks. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/ticklength/">20 px tick length on the X axis</a>
	*/
	public void setTickLength(Number tickLength) {
		this.tickLength = tickLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickLength(){ return tickLength; }

	private Boolean zoomEnabled;
	/**
 Whether to zoom axis. If chart.zoomType is set, the option allows to disable zooming on an individual axis. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/zoomenabled/">Zoom enabled is false</a>
 <br><br><b>defaults:</b><br><br>&ensp;enabled	*/
	public void setZoomEnabled(Boolean zoomEnabled) {
		this.zoomEnabled = zoomEnabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getZoomEnabled(){ return zoomEnabled; }

	private Number ceiling;
	/**
 The highest allowed value for automatically computed axis extremes. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/floor-ceiling/">Floor and ceiling</a>
	*/
	public void setCeiling(Number ceiling) {
		this.ceiling = ceiling;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCeiling(){ return ceiling; }

	private Boolean showEmpty;
	/**
 Whether to show the axis line and title when the axis has no data. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/showempty/">When clicking the legend to hide series, one axis preserves line and title, the other doesn't</a>
	*/
	public void setShowEmpty(Boolean showEmpty) {
		this.showEmpty = showEmpty;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowEmpty(){ return showEmpty; }

	private String gridLineDashStyle;
	/**
 The dash or dot style of the grid lines. For possible values, see [this demonstration](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinedashstyle/">Long dashes</a>
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setGridLineDashStyle(String gridLineDashStyle) {
		this.gridLineDashStyle = gridLineDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGridLineDashStyle(){ return gridLineDashStyle; }

	private String minorTickPosition;
	/**
 The position of the minor tick marks relative to the axis line. Can be one of inside and outside. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-outside/">Outside by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickposition-inside/">Inside</a> <br><br><b>accepted values:</b><br><br>&ensp;["inside", "outside"]
	*/
	public void setMinorTickPosition(String minorTickPosition) {
		this.minorTickPosition = minorTickPosition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMinorTickPosition(){ return minorTickPosition; }

	private ArrayList <HIBreaks> breaks;
	/**
 An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-simple/">Simple break</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/">Advanced with callback</a>
	*/
	public void setBreaks(ArrayList breaks) {
		this.breaks = breaks;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getBreaks(){ return breaks; }

	private HIDateTimeLabelFormats dateTimeLabelFormats;
	/**
 For a datetime axis, the scale will automatically adjust to the appropriate unit. This member gives the defaults string representations used for each unit. For intermediate values, different units may be used, for example the day unit can be used on midnight and hour unit be used for intermediate values on the same axis. For an overview of the replacement codes, see `dateFormat`. Defaults to: `js {   millisecond: '%H:%M:%S.%L',   second: '%H:%M:%S',   minute: '%H:%M',   hour: '%H:%M',   day: '%e. %b',   week: '%e. %b',   month: '%b \'%y',   year: '%Y' } ` 
	*/
	public void setDateTimeLabelFormats(HIDateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		this.dateTimeLabelFormats.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDateTimeLabelFormats getDateTimeLabelFormats(){ return dateTimeLabelFormats; }

	private Boolean minorTicks;
	/**
 Enable or disable minor ticks. Unless minorTickInterval is set, the tick interval is calculated as a fifth of the tickInterval. On a logarithmic axis, minor ticks are laid out based on a best guess, attempting to enter approximately 5 minor ticks between each major tick. Prior to v6.0.0, ticks were unabled in auto layout by setting minorTickInterval to "auto". <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorticks-true/">Enabled on linear Y axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setMinorTicks(Boolean minorTicks) {
		this.minorTicks = minorTicks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getMinorTicks(){ return minorTicks; }

	private Number minorTickWidth;
	/**
 The pixel width of the minor tick mark. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickwidth/">3px width</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setMinorTickWidth(Number minorTickWidth) {
		this.minorTickWidth = minorTickWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorTickWidth(){ return minorTickWidth; }

	private Number offset;
	/**
 The distance in pixels from the plot area to the axis line. A positive offset moves the axis with it's line, labels and ticks away from the plot area. This is typically used when two or more axes are displayed on the same side of the plot. With multiple axes the offset is dynamically adjusted to avoid collision, this can be overridden by setting offset explicitly. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset/">Y axis offset of 70</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/offset-centered/">Axes positioned in the center of the plot</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setOffset(Number offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffset(){ return offset; }

	private HIColor tickColor;
	/**
 Color for the main tick marks. In styled mode, the stroke is given in the .highcharts-tick class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickcolor/">Red ticks on X axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
 <br><br><b>defaults:</b><br><br>&ensp;#ccd6eb	*/
	public void setTickColor(HIColor tickColor) {
		this.tickColor = tickColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getTickColor(){ return tickColor; }

	private Number tickInterval;
	/**
 The interval of the tick marks in axis units. When undefined, the tick interval is computed to approximately follow the tickPixelInterval on linear and datetime axes. On categorized axes, a undefined tickInterval will defaults to 1, one category. Note that datetime axes are based on milliseconds, so for example an interval of one day is expressed as 24 * 3600 * 1000. On logarithmic axes, the tickInterval is based on powers, so a tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40 etc. If the tickInterval is too dense for labels to be drawn, Highcharts may remove ticks. If the chart has multiple axes, the alignTicks option may interfere with the tickInterval setting. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickinterval-5/">Tick interval of 5 on a linear axis</a>
	*/
	public void setTickInterval(Number tickInterval) {
		this.tickInterval = tickInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickInterval(){ return tickInterval; }

	private String tickPosition;
	/**
 The position of the major tick marks relative to the axis line. Can be one of inside and outside. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-outside/">"outside" by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/tickposition-inside/">"inside"</a> <br><br><b>accepted values:</b><br><br>&ensp;["inside", "outside"]
	*/
	public void setTickPosition(String tickPosition) {
		this.tickPosition = tickPosition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTickPosition(){ return tickPosition; }

	private ArrayList<String> categories;
	/**
 If categories are present for the xAxis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a name and setting axis type to category. However, if you have multiple series, best practice remains defining the categories array. Example: categories: ['Apples', 'Bananas', 'Oranges'] <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-labels/">With</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/categories/">Without</a>
	*/
	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getCategories(){ return categories; }

	private HIColor gridLineColor;
	/**
 Color of the grid lines extending the ticks across the plot area. In styled mode, the stroke is given in the .highcharts-grid-line class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/gridlinecolor/">Green lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
 <br><br><b>defaults:</b><br><br>&ensp;#e6e6e6	*/
	public void setGridLineColor(HIColor gridLineColor) {
		this.gridLineColor = gridLineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getGridLineColor(){ return gridLineColor; }

	private Number linkedTo;
	/**
 Index of another axis that this axis is linked to. When an axis is linked to a master axis, it will take the same extremes as the master, but as assigned by min or max or by setExtremes. It can be used to show additional info, or to ease reading the chart by duplicating the scales. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/linkedto/">Different string formats of the same date</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/linkedto/">Y values on both sides</a>
	*/
	public void setLinkedTo(Number linkedTo) {
		this.linkedTo = linkedTo;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkedTo(){ return linkedTo; }

	private HIColor alternateGridColor;
	/**
 When using an alternate grid color, a band is painted across the plot area between every other grid line. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/alternategridcolor/">Alternate grid color on the Y axis</a>
	*/
	public void setAlternateGridColor(HIColor alternateGridColor) {
		this.alternateGridColor = alternateGridColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getAlternateGridColor(){ return alternateGridColor; }

	private Boolean uniqueNames;
	/**
 Applies only when the axis type is category. When uniqueNames is true, points are placed on the X axis according to their names. If the same point name is repeated in the same or another series, the point is placed on the same X position as other points of the same name. When uniqueNames is false, the points are laid out in increasing X positions regardless of their names, and the X axis category will take the name of the last point in each position. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/uniquenames-true/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/uniquenames-false/">False</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setUniqueNames(Boolean uniqueNames) {
		this.uniqueNames = uniqueNames;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUniqueNames(){ return uniqueNames; }

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

	private String className;
	/**
 A class name that opens for styling the axis by CSS, especially in Highcharts styled mode. The class name is applied to group elements for the grid, axis elements and labels. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/">Multiple axes with separate styling</a>
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number tickAmount;
	/**
 The amount of ticks to draw on the axis. This opens up for aligning the ticks of multiple charts or panes within a chart. This option overrides the tickPixelInterval option. This option only has an effect on linear axes. Datetime, logarithmic or category axes are not affected. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/tickamount/">8 ticks on Y axis</a>
	*/
	public void setTickAmount(Number tickAmount) {
		this.tickAmount = tickAmount;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickAmount(){ return tickAmount; }

	private HICrosshair crosshair;
	/**
 Configure a crosshair that follows either the mouse pointer or the hovered point. In styled mode, the crosshairs are styled in the .highcharts-crosshair, .highcharts-crosshair-thin or .highcharts-xaxis-category classes. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-both/">Crosshair on both axes</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setCrosshair(HICrosshair crosshair) {
		this.crosshair = crosshair;
		this.crosshair.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICrosshair getCrosshair(){ return crosshair; }

	private Number minorGridLineWidth;
	/**
 Width of the minor, secondary grid lines. In styled mode, the stroke width is given in the .highcharts-grid-line class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minorgridlinewidth/">2px lines from Y axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis-grid/">Styled mode</a>
	*/
	public void setMinorGridLineWidth(Number minorGridLineWidth) {
		this.minorGridLineWidth = minorGridLineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinorGridLineWidth(){ return minorGridLineWidth; }

	private Object /* Number, String */ minorTickInterval;
	/**
 Specific tick interval in axis units for the minor ticks. On a linear axis, if "auto", the minor tick interval is calculated as a fifth of the tickInterval. If null or undefined, minor ticks are not shown. On logarithmic axes, the unit is the power of the value. For example, setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10, 10 and 100 etc. If user settings dictate minor ticks to become too dense, they don't make sense, and will be ignored to prevent performance problems. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-null/">Null by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-5/">5 units</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-log-auto/">"auto"</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/minortickinterval-log/">0.1</a>
	*/
	public void setMinorTickInterval(Object /* Number, String */ minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMinorTickInterval(){ return minorTickInterval; }

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

	/**
	 * Add a plot band after render time.
	 * @param options A configuration object for the plot band, as defined in xAxis.plotBands.
	 */
	public void addPlotBand(HIPlotBands options) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("method", "addPlotBand");
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
			put("axis", "y");
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
	public void update(HIYAxis options) {
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "y");
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
	public void update(HIYAxis options, boolean redraw) {
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Axis");
			put("axis", "y");
			put("method", "setTitle1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(params, redraw)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}


	public HIYAxis() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
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
		if (this.softMax != null) {
			params.put("softMax", this.softMax);
		}
		if (this.min != null) {
			params.put("min", this.min);
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
		if (this.gridLineWidth != null) {
			params.put("gridLineWidth", this.gridLineWidth);
		}
		if (this.tooltipValueFormat != null) {
			params.put("tooltipValueFormat", this.tooltipValueFormat);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.minColor != null) {
			params.put("minColor", this.minColor.getData());
		}
		if (this.showLastLabel != null) {
			params.put("showLastLabel", this.showLastLabel);
		}
		if (this.startOnTick != null) {
			params.put("startOnTick", this.startOnTick);
		}
		if (this.stackLabels != null) {
			params.put("stackLabels", this.stackLabels.getParams());
		}
		if (this.maxPadding != null) {
			params.put("maxPadding", this.maxPadding);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.title != null) {
			params.put("title", this.title.getParams());
		}
		if (this.reversedStacks != null) {
			params.put("reversedStacks", this.reversedStacks);
		}
		if (this.top != null) {
			params.put("top", this.top);
		}
		if (this.minorTickColor != null) {
			params.put("minorTickColor", this.minorTickColor.getData());
		}
		if (this.pane != null) {
			params.put("pane", this.pane);
		}
		if (this.tickmarkPlacement != null) {
			params.put("tickmarkPlacement", this.tickmarkPlacement);
		}
		if (this.gridZIndex != null) {
			params.put("gridZIndex", this.gridZIndex);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.alignTicks != null) {
			params.put("alignTicks", this.alignTicks);
		}
		if (this.minTickInterval != null) {
			params.put("minTickInterval", this.minTickInterval);
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
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("tickPositions", array);
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
		if (this.minorGridLineColor != null) {
			params.put("minorGridLineColor", this.minorGridLineColor.getData());
		}
		if (this.tickPositioner != null) {
			params.put("tickPositioner", this.tickPositioner);
		}
		if (this.minorGridLineDashStyle != null) {
			params.put("minorGridLineDashStyle", this.minorGridLineDashStyle);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.minorTickLength != null) {
			params.put("minorTickLength", this.minorTickLength);
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
		if (this.gridLineInterpolation != null) {
			params.put("gridLineInterpolation", this.gridLineInterpolation);
		}
		if (this.tickLength != null) {
			params.put("tickLength", this.tickLength);
		}
		if (this.zoomEnabled != null) {
			params.put("zoomEnabled", this.zoomEnabled);
		}
		if (this.ceiling != null) {
			params.put("ceiling", this.ceiling);
		}
		if (this.showEmpty != null) {
			params.put("showEmpty", this.showEmpty);
		}
		if (this.gridLineDashStyle != null) {
			params.put("gridLineDashStyle", this.gridLineDashStyle);
		}
		if (this.minorTickPosition != null) {
			params.put("minorTickPosition", this.minorTickPosition);
		}
		if (this.breaks != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.breaks) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("breaks", array);
		}
		if (this.dateTimeLabelFormats != null) {
			params.put("dateTimeLabelFormats", this.dateTimeLabelFormats.getParams());
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
		if (this.tickColor != null) {
			params.put("tickColor", this.tickColor.getData());
		}
		if (this.tickInterval != null) {
			params.put("tickInterval", this.tickInterval);
		}
		if (this.tickPosition != null) {
			params.put("tickPosition", this.tickPosition);
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
		if (this.gridLineColor != null) {
			params.put("gridLineColor", this.gridLineColor.getData());
		}
		if (this.linkedTo != null) {
			params.put("linkedTo", this.linkedTo);
		}
		if (this.alternateGridColor != null) {
			params.put("alternateGridColor", this.alternateGridColor.getData());
		}
		if (this.uniqueNames != null) {
			params.put("uniqueNames", this.uniqueNames);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.tickAmount != null) {
			params.put("tickAmount", this.tickAmount);
		}
		if (this.crosshair != null) {
			params.put("crosshair", this.crosshair.getParams());
		}
		if (this.minorGridLineWidth != null) {
			params.put("minorGridLineWidth", this.minorGridLineWidth);
		}
		if (this.minorTickInterval != null) {
			params.put("minorTickInterval", this.minorTickInterval);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.left != null) {
			params.put("left", this.left);
		}
		return params;
	}

}