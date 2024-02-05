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



public class HIChart extends HIFoundation { 

	private HIParallelAxes parallelAxes;
	/**
 Common options for all yAxes rendered in a parallel coordinates plot. This feature requires `modules/parallel-coordinates.js`. The defaults options are: ```js parallelAxes: {  lineWidth: 1,    // classic mode only  gridlinesWidth: 0, // classic mode only  title: {    text: '',    reserveSpace: false  },  labels: {    x: 0,    y: 0,    align: 'center',    reserveSpace: false  },  offset: 0 } ``` 
	*/
	public void setParallelAxes(HIParallelAxes parallelAxes) {
		this.parallelAxes = parallelAxes;
		this.parallelAxes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIParallelAxes getParallelAxes(){ return parallelAxes; }

	private Number borderRadius;
	/**
 The corner radius of the outer chart border. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Number spacingBottom;
	/**
 The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). 
 <br><br><b>defaults:</b><br><br>&ensp;15	*/
	public void setSpacingBottom(Number spacingBottom) {
		this.spacingBottom = spacingBottom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingBottom(){ return spacingBottom; }

	private HIShadowOptionsObject /* boolean */ plotShadow;
	/**
 Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. The shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setPlotShadow(HIShadowOptionsObject /* boolean */ plotShadow) {
		this.plotShadow = plotShadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIShadowOptionsObject /* boolean */ getPlotShadow(){ return plotShadow; }

	private Object /* Number, String */ height;
	/**
 An explicit height for the chart. If a _number_, the height is given in pixels. If given a _percentage string_ (for example `'56%'`), the height is given as the percentage of the actual chart width. This allows for preserving the aspect ratio across responsive sizes. By defaults (when `null`) the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0. 
	*/
	public void setHeight(Object /* Number, String */ height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getHeight(){ return height; }

	private HICSSObject style;
	/**
 Additional CSS styles to apply inline to the container `div` and the root SVG. Since v11, the root font size is 1rem by defaults, and all child element are given a relative `em` font size by defaults. This allows implementers to control all the chart's font sizes by only setting the root level. 
 <br><br><b>defaults:</b><br><br>&ensp;{"fontFamily": Helvetica, Arial, sans-serif","fontSize":"1rem"}	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Boolean alignTicks;
	/**
 When using multiple axes, the ticks of two or more opposite axes will automatically be aligned by adding ticks to the axis or axes with the least ticks, as if `tickAmount` were specified. This can be prevented by setting `alignTicks` to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting `gridLineWidth` to 0. If `startOnTick` or `endOnTick` in the axis options are set to false, then the `alignTicks ` will be disabled for the axis. Disabled for logarithmic axes. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignTicks(){ return alignTicks; }

	private Boolean displayErrors;
	/**
 Whether to display errors on the chart. When `false`, the errors will be shown only in the console. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setDisplayErrors(Boolean displayErrors) {
		this.displayErrors = displayErrors;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDisplayErrors(){ return displayErrors; }

	private Number marginRight;
	/**
 The margin between the right outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also `spacingRight`. 
	*/
	public void setMarginRight(Number marginRight) {
		this.marginRight = marginRight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginRight(){ return marginRight; }

	private HIColor plotBorderColor;
	/**
 The color of the inner chart or plot area border. 
 <br><br><b>defaults:</b><br><br>&ensp;#cccccc	*/
	public void setPlotBorderColor(HIColor plotBorderColor) {
		this.plotBorderColor = plotBorderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getPlotBorderColor(){ return plotBorderColor; }

	private Boolean alignThresholds;
	/**
 When using multiple axes, align the thresholds. When this is true, other ticks will also be aligned. Note that for line series and some other series types, the `threshold` option is set to `null` by defaults. This will in turn cause their y-axis to not have a threshold. In order to avoid that, set the series `threshold` to 0 or another number. If `startOnTick` or `endOnTick` in the axis options are set to false, or if the axis is logarithmic, the threshold will not be aligned. 
	*/
	public void setAlignThresholds(Boolean alignThresholds) {
		this.alignThresholds = alignThresholds;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignThresholds(){ return alignThresholds; }

	private Number spacingRight;
	/**
 The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setSpacingRight(Number spacingRight) {
		this.spacingRight = spacingRight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingRight(){ return spacingRight; }

	private HIColor borderColor;
	/**
 The color of the outer chart border. 
 <br><br><b>defaults:</b><br><br>&ensp;#334eff	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private String className;
	/**
 A CSS class name to apply to the charts container `div`, allowing unique CSS styling for each chart. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Boolean polar;
	/**
 When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system. This produces _polar charts_, also known as _radar charts_. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setPolar(Boolean polar) {
		this.polar = polar;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getPolar(){ return polar; }

	private String renderTo;
	/**
 The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference, or as the first argument of the chart constructor, in which case the option is not needed. 
	*/
	public void setRenderTo(String renderTo) {
		this.renderTo = renderTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRenderTo(){ return renderTo; }

	private Boolean reflow;
	/**
 Whether to reflow the chart to fit the width of the container div on resizing the window. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setReflow(Boolean reflow) {
		this.reflow = reflow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReflow(){ return reflow; }

	private Number spacingTop;
	/**
 The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setSpacingTop(Number spacingTop) {
		this.spacingTop = spacingTop;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingTop(){ return spacingTop; }

	private Number marginBottom;
	/**
 The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also `spacingBottom`. 
	*/
	public void setMarginBottom(Number marginBottom) {
		this.marginBottom = marginBottom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginBottom(){ return marginBottom; }

	private Object /* Number, String */ width;
	/**
 An explicit width for the chart. By defaults (when `null`) the width is calculated from the offset width of the containing element. 
	*/
	public void setWidth(Object /* Number, String */ width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWidth(){ return width; }

	private HIAnimationOptionsObject animation;
	/**
 Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to false here. It can be overridden for each individual API method as a function parameter. The only animation not affected by this option is the initial series animation, see `plotOptions.series.animation`. The animation can either be set as a boolean or a configuration object. If `true`, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported: - `defer`: The animation delay time in milliseconds. - `duration`: The duration of the animation in milliseconds. - `easing`: A string reference to an easing function set on the  `Math` object. See  [the easing demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/). When zooming on a series with less than 100 points, the chart redraw will be done with animation, but in case of more data points, it is necessary to set this option to ensure animation on zoom. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private HIColor plotBackgroundColor;
	/**
 The background color or gradient for the plot area. 
	*/
	public void setPlotBackgroundColor(HIColor plotBackgroundColor) {
		this.plotBackgroundColor = plotBackgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getPlotBackgroundColor(){ return plotBackgroundColor; }

	private HIColor backgroundColor;
	/**
 The background color or gradient for the outer chart area. 
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private HIPanning panning;
	/**
 Allow panning in a chart. Best used with `panKey` to combine zooming and panning. On touch devices, when the `tooltip.followTouchMove` option is `true` (defaults), panning requires two fingers. To allow panning with one finger, set `followTouchMove` to `false`. 
	*/
	public void setPanning(HIPanning panning) {
		this.panning = panning;
		this.panning.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPanning getPanning(){ return panning; }

	private HIOptions3d options3d;
	/**
 Options to render charts in 3 dimensions. This feature requires `highcharts-3d.js`, found in the download package or online at [https://code.highcharts.com/highcharts-3d.js](https://code.highcharts.com/highcharts-3d.js). 
	*/
	public void setOptions3d(HIOptions3d options3d) {
		this.options3d = options3d;
		this.options3d.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIOptions3d getOptions3d(){ return options3d; }

	private String type;
	/**
 The defaults series type for the chart. Can be any of the chart types listed under `plotOptions` and `series` or can be a series provided by an additional module. In TypeScript this option has no effect in sense of typing and instead the `type` option must always be set in the series. 
 <br><br><b>defaults:</b><br><br>&ensp;line	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private HIEvents events;
	/**
 Event listeners for the chart. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private Number spacingLeft;
	/**
 The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setSpacingLeft(Number spacingLeft) {
		this.spacingLeft = spacingLeft;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingLeft(){ return spacingLeft; }

	private Number axisLayoutRuns;
	/**
 When a chart with an x and a y-axis is rendered, we first pre-render the labels of both in order to measure them. Then, if either of the axis labels take up so much space that it significantly affects the length of the other axis, we repeat the process. By defaults we stop at two axis layout runs, but it may be that the second run also alter the space required by either axis, for example if it causes the labels to rotate. In this situation, a subsequent redraw of the chart may cause the tick and label placement to change for apparently no reason. Use the `axisLayoutRuns` option to set the maximum allowed number of repetitions. But keep in mind that the defaults value of 2 is set because every run costs performance time. **Note:** Changing that option to higher than the defaults might decrease performance significantly, especially with bigger sets of data. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setAxisLayoutRuns(Number axisLayoutRuns) {
		this.axisLayoutRuns = axisLayoutRuns;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAxisLayoutRuns(){ return axisLayoutRuns; }

	private ArrayList<Number> spacing;
	/**
 The distance between the outer edge of the chart and the content, like title or legend, or axis title and labels if present. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option. 
 <br><br><b>defaults:</b><br><br>&ensp;[10, 10, 15, 10]	*/
	public void setSpacing(ArrayList<Number> spacing) {
		this.spacing = spacing;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getSpacing(){ return spacing; }

	private String panKey;
	/**
 Allows setting a key to switch between zooming and panning. Can be one of `alt`, `ctrl`, `meta` (the command key on Mac and Windows key on Windows) or `shift`. The keys are mapped directly to the key properties of the click event argument (`event.altKey`, `event.ctrlKey`, `event.metaKey` and `event.shiftKey`). 
	*/
	public void setPanKey(String panKey) {
		this.panKey = panKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPanKey(){ return panKey; }

	private Number marginLeft;
	/**
 The margin between the left outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also `spacingLeft`. 
	*/
	public void setMarginLeft(Number marginLeft) {
		this.marginLeft = marginLeft;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginLeft(){ return marginLeft; }

	private Boolean allowMutatingData;
	/**
 By defaults, (because of memory and performance reasons) the chart does not copy the data but keeps it as a reference. In some cases, this might result in mutating the original data source. In order to prevent that, set that property to false. Please note that changing that might decrease performance, especially with bigger sets of data. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setAllowMutatingData(Boolean allowMutatingData) {
		this.allowMutatingData = allowMutatingData;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowMutatingData(){ return allowMutatingData; }

	private HIScrollablePlotArea scrollablePlotArea;
	/**
 Options for a scrollable plot area. This feature provides a minimum size for the plot area of the chart. If the size gets smaller than this, typically on mobile devices, a native browser scrollbar is presented. This scrollbar provides smooth scrolling for the contents of the plot area, whereas the title, legend and unaffected axes are fixed. Since v7.1.2, a scrollable plot area can be defined for either horizontal or vertical scrolling, depending on whether the `minWidth` or `minHeight` option is set. 
	*/
	public void setScrollablePlotArea(HIScrollablePlotArea scrollablePlotArea) {
		this.scrollablePlotArea = scrollablePlotArea;
		this.scrollablePlotArea.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIScrollablePlotArea getScrollablePlotArea(){ return scrollablePlotArea; }

	private HIShadowOptionsObject /* boolean */ shadow;
	/**
 Whether to apply a drop shadow to the outer chart area. Requires that backgroundColor be set. The shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setShadow(HIShadowOptionsObject /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIShadowOptionsObject /* boolean */ getShadow(){ return shadow; }

	private Boolean inverted;
	/**
 Whether to invert the axes so that the x axis is vertical and y axis is horizontal. When `true`, the x axis is `reversed` by defaults. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInverted(){ return inverted; }

	private Number plotBorderWidth;
	/**
 The pixel width of the plot area border. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setPlotBorderWidth(Number plotBorderWidth) {
		this.plotBorderWidth = plotBorderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPlotBorderWidth(){ return plotBorderWidth; }

	private Boolean ignoreHiddenSeries;
	/**
 If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and showing a series will not affect the axes or the other series. For stacks, once one series within the stack is hidden, the rest of the stack will close in around it even if the axis is not affected. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setIgnoreHiddenSeries(Boolean ignoreHiddenSeries) {
		this.ignoreHiddenSeries = ignoreHiddenSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreHiddenSeries(){ return ignoreHiddenSeries; }

	private HIZooming zooming;
	/**
 Chart zooming options. 
	*/
	public void setZooming(HIZooming zooming) {
		this.zooming = zooming;
		this.zooming.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIZooming getZooming(){ return zooming; }

	private HIColor selectionMarkerFill;
	/**
 The background color of the marker square when selecting (zooming in on) an area of the chart. 
 <br><br><b>defaults:</b><br><br>&ensp;rgba(51,92,173,0.25)	*/
	public void setSelectionMarkerFill(HIColor selectionMarkerFill) {
		this.selectionMarkerFill = selectionMarkerFill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSelectionMarkerFill(){ return selectionMarkerFill; }

	private String plotBackgroundImage;
	/**
 The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server. 
	*/
	public void setPlotBackgroundImage(String plotBackgroundImage) {
		this.plotBackgroundImage = plotBackgroundImage;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPlotBackgroundImage(){ return plotBackgroundImage; }

	private HIFunction numberFormatter;
	/**
 Callback function to override the defaults function that formats all the numbers in the chart. Returns a string with the formatted number. 
	*/
	public void setNumberFormatter(HIFunction numberFormatter) {
		this.numberFormatter = numberFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNumberFormatter(){ return numberFormatter; }

	private Number colorCount;
	/**
 In styled mode, this sets how many colors the class names should rotate between. With ten colors, series (or points) are given class names like `highcharts-color-0`, `highcharts-color-1` `...] `highcharts-color-9`. The equivalent in non-styled mode is to set colors using the [colors` setting. 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setColorCount(Number colorCount) {
		this.colorCount = colorCount;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorCount(){ return colorCount; }

	private Boolean parallelCoordinates;
	/**
 Flag to render charts as a parallel coordinates plot. In a parallel coordinates plot (||-coords) by defaults all required yAxes are generated and the legend is disabled. This feature requires `modules/parallel-coordinates.js`. 
	*/
	public void setParallelCoordinates(Boolean parallelCoordinates) {
		this.parallelCoordinates = parallelCoordinates;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getParallelCoordinates(){ return parallelCoordinates; }

	private Boolean showAxes;
	/**
 Whether to show the axes initially. This only applies to empty charts where series are added dynamically, as axes are automatically added to cartesian series. 
	*/
	public void setShowAxes(Boolean showAxes) {
		this.showAxes = showAxes;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowAxes(){ return showAxes; }

	private Number borderWidth;
	/**
 The pixel width of the outer chart border. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Number marginTop;
	/**
 The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also `spacingTop`. 
	*/
	public void setMarginTop(Number marginTop) {
		this.marginTop = marginTop;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginTop(){ return marginTop; }

	private ArrayList<Number> margin;
	/**
 The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options `marginTop`, `marginRight`, `marginBottom` and `marginLeft` for shorthand setting of one option. By defaults there is no margin. The actual space is dynamically calculated from the offset of axis labels, axis title, title, subtitle and legend in addition to the `spacingTop`, `spacingRight`, `spacingBottom` and `spacingLeft` options. 
	*/
	public void setMargin(ArrayList<Number> margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getMargin(){ return margin; }

	private Boolean styledMode;
	/**
 Whether to apply styled mode. When in styled mode, no presentational attributes or CSS are applied to the chart SVG. Instead, CSS rules are required to style the chart. The defaults style sheet is available from `https://code.highcharts.com/css/highcharts.css`. [Read more in the docs](https://www.highcharts.com/docs/chart-design-and-style/style-by-css) on what classes and variables are available. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setStyledMode(Boolean styledMode) {
		this.styledMode = styledMode;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStyledMode(){ return styledMode; }



	public HIChart() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.parallelAxes != null) {
			params.put("parallelAxes", this.parallelAxes.getParams());
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.spacingBottom != null) {
			params.put("spacingBottom", this.spacingBottom);
		}
		if (this.plotShadow != null) {
			params.put("plotShadow", this.plotShadow.getParams());
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.alignTicks != null) {
			params.put("alignTicks", this.alignTicks);
		}
		if (this.displayErrors != null) {
			params.put("displayErrors", this.displayErrors);
		}
		if (this.marginRight != null) {
			params.put("marginRight", this.marginRight);
		}
		if (this.plotBorderColor != null) {
			params.put("plotBorderColor", this.plotBorderColor.getData());
		}
		if (this.alignThresholds != null) {
			params.put("alignThresholds", this.alignThresholds);
		}
		if (this.spacingRight != null) {
			params.put("spacingRight", this.spacingRight);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.polar != null) {
			params.put("polar", this.polar);
		}
		if (this.renderTo != null) {
			params.put("renderTo", this.renderTo);
		}
		if (this.reflow != null) {
			params.put("reflow", this.reflow);
		}
		if (this.spacingTop != null) {
			params.put("spacingTop", this.spacingTop);
		}
		if (this.marginBottom != null) {
			params.put("marginBottom", this.marginBottom);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.plotBackgroundColor != null) {
			params.put("plotBackgroundColor", this.plotBackgroundColor.getData());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.panning != null) {
			params.put("panning", this.panning.getParams());
		}
		if (this.options3d != null) {
			params.put("options3d", this.options3d.getParams());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.spacingLeft != null) {
			params.put("spacingLeft", this.spacingLeft);
		}
		if (this.axisLayoutRuns != null) {
			params.put("axisLayoutRuns", this.axisLayoutRuns);
		}
		if (this.spacing != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.spacing) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("spacing", array);
		}
		if (this.panKey != null) {
			params.put("panKey", this.panKey);
		}
		if (this.marginLeft != null) {
			params.put("marginLeft", this.marginLeft);
		}
		if (this.allowMutatingData != null) {
			params.put("allowMutatingData", this.allowMutatingData);
		}
		if (this.scrollablePlotArea != null) {
			params.put("scrollablePlotArea", this.scrollablePlotArea.getParams());
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow.getParams());
		}
		if (this.inverted != null) {
			params.put("inverted", this.inverted);
		}
		if (this.plotBorderWidth != null) {
			params.put("plotBorderWidth", this.plotBorderWidth);
		}
		if (this.ignoreHiddenSeries != null) {
			params.put("ignoreHiddenSeries", this.ignoreHiddenSeries);
		}
		if (this.zooming != null) {
			params.put("zooming", this.zooming.getParams());
		}
		if (this.selectionMarkerFill != null) {
			params.put("selectionMarkerFill", this.selectionMarkerFill.getData());
		}
		if (this.plotBackgroundImage != null) {
			params.put("plotBackgroundImage", this.plotBackgroundImage);
		}
		if (this.numberFormatter != null) {
			params.put("numberFormatter", this.numberFormatter);
		}
		if (this.colorCount != null) {
			params.put("colorCount", this.colorCount);
		}
		if (this.parallelCoordinates != null) {
			params.put("parallelCoordinates", this.parallelCoordinates);
		}
		if (this.showAxes != null) {
			params.put("showAxes", this.showAxes);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.marginTop != null) {
			params.put("marginTop", this.marginTop);
		}
		if (this.margin != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.margin) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("margin", array);
		}
		if (this.styledMode != null) {
			params.put("styledMode", this.styledMode);
		}
		return params;
	}

}