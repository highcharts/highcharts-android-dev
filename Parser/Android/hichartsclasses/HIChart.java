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
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;
import com.highsoft.highcharts.common.HIColor;





public class HIChart extends Observable implements HIChartsJSONSerializable { 

	private HIParallelAxes parallelAxes;
/**
/** Common options for all yAxes rendered in a parallel coordinates plot. This feature requires modules/parallel-coordinates.js. The defaults options are:  parallelAxes: {  lineWidth: 1,    // classic mode only  gridlinesWidth: 0, // classic mode only  title: {    text: '',    reserveSpace: false  },  labels: {    x: 0,    y: 0,    align: 'center',    reserveSpace: false  },  offset: 0 } <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/parallelaxes/">Set the same tickAmount for all yAxes</a>
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
/** The corner radius of the outer chart border. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderradius/">20px radius</a>
*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Number spacingBottom;
/**
/** The space between the bottom edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingbottom/">Spacing bottom set to 100</a>
 <br><br><b>defaults:</b><br><br>&ensp;15*/
	public void setSpacingBottom(Number spacingBottom) {
		this.spacingBottom = spacingBottom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingBottom(){ return spacingBottom; }

	private Boolean /* boolean */ plotShadow;
/**
/** Whether to apply a drop shadow to the plot area. Requires that plotBackgroundColor be set. The shadow can be an object configuration containing color, offsetX, offsetY, opacity and width. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotshadow/">Plot shadow</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setPlotShadow(Boolean /* boolean */ plotShadow) {
		this.plotShadow = plotShadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean /* boolean */ getPlotShadow(){ return plotShadow; }

	private Object /* Number, String */ height;
/**
/** An explicit height for the chart. If a _number_, the height is given in pixels. If given a _percentage string_ (for example '56%'), the height is given as the percentage of the actual chart width. This allows for preserving the aspect ratio across responsive sizes. By defaults (when null) the height is calculated from the offset height of the containing element, or 400 pixels if the containing element's height is 0. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/height/">500px height</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/height-percent/">Highcharts with percentage height</a>
*/
	public void setHeight(Object /* Number, String */ height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getHeight(){ return height; }

	private Boolean alignTicks;
/**
/** When using multiple axis, the ticks of two or more opposite axes will automatically be aligned by adding ticks to the axis or axes with the least ticks, as if tickAmount were specified. This can be prevented by setting alignTicks to false. If the grid lines look messy, it's a good idea to hide them for the secondary axis by setting gridLineWidth to 0. If startOnTick or endOnTick in an Axis options are set to false, then the alignTicks will be disabled for the Axis. Disabled for logarithmic axes. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-true/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/alignticks-false/">False</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignTicks(){ return alignTicks; }

	private Boolean displayErrors;
/**
/** Whether to display errors on the chart. When false, the errors will be shown only in the console. Requires debugger.js module. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/display-errors/">Show errors on chart</a>
*/
	public void setDisplayErrors(Boolean displayErrors) {
		this.displayErrors = displayErrors;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDisplayErrors(){ return displayErrors; }

	private Number marginRight;
/**
/** The margin between the right outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also spacingRight. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginright/">100px right margin</a>
*/
	public void setMarginRight(Number marginRight) {
		this.marginRight = marginRight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginRight(){ return marginRight; }

	private HIColor plotBorderColor;
/**
/** The color of the inner chart or plot area border. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbordercolor/">Blue border</a>
*/
	public void setPlotBorderColor(HIColor plotBorderColor) {
		this.plotBorderColor = plotBorderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getPlotBorderColor(){ return plotBorderColor; }

	private Number spacingRight;
/**
/** The space between the right edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-100/">Spacing set to 100</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingright-legend/">Legend in right position with defaults spacing</a>
 <br><br><b>defaults:</b><br><br>&ensp;10*/
	public void setSpacingRight(Number spacingRight) {
		this.spacingRight = spacingRight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingRight(){ return spacingRight; }

	private HIColor borderColor;
/**
/** The color of the outer chart border. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/bordercolor/">Brown border</a>
*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private String className;
/**
/** A CSS class name to apply to the charts container div, allowing unique CSS styling for each chart. 
*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Boolean polar;
/**
/** When true, cartesian charts like line, spline, area and column are transformed into the polar coordinate system. This produces _polar charts_, also known as _radar charts_. Requires highcharts-more.js. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar/">Polar chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-wind-rose/">Wind rose, stacked polar column chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polar-spider/">Spider web chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/polar/">Star plot, multivariate data in a polar chart</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setPolar(Boolean polar) {
		this.polar = polar;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getPolar(){ return polar; }

	private String renderTo;
/**
/** The HTML element where the chart will be rendered. If it is a string, the element by that id is used. The HTML element can also be passed by direct reference, or as the first argument of the chart constructor, in which case the option is not needed. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">String</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/renderto-object/">Object reference</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/renderto-jquery/">Object reference through jQuery</a>
*/
	public void setRenderTo(String renderTo) {
		this.renderTo = renderTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRenderTo(){ return renderTo; }

	private Boolean reflow;
/**
/** Whether to reflow the chart to fit the width of the container div on resizing the window. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-true/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/reflow-false/">False</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setReflow(Boolean reflow) {
		this.reflow = reflow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReflow(){ return reflow; }

	private String zoomType;
/**
/** Decides in what dimensions the user can zoom by dragging the mouse. Can be one of x, y or xy. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/">None by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-x/">X</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-y/">Y</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-xy/">Xy</a> <br><br><b>accepted values:</b><br><br>&ensp;["x", "y", "xy"]
*/
	public void setZoomType(String zoomType) {
		this.zoomType = zoomType;
		this.setChanged();
		this.notifyObservers();
	}

	public String getZoomType(){ return zoomType; }

	private Number spacingTop;
/**
/** The space between the top edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-100/">A top spacing of 100</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingtop-10/">Floating chart title makes the plot area align to the defaults spacingTop of 10.</a>
 <br><br><b>defaults:</b><br><br>&ensp;10*/
	public void setSpacingTop(Number spacingTop) {
		this.spacingTop = spacingTop;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingTop(){ return spacingTop; }

	private Number marginBottom;
/**
/** The margin between the bottom outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also spacingBottom. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginbottom/">100px bottom margin</a>
*/
	public void setMarginBottom(Number marginBottom) {
		this.marginBottom = marginBottom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginBottom(){ return marginBottom; }

	private Number width;
/**
/** An explicit width for the chart. By defaults (when null) the width is calculated from the offset width of the containing element. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/width/">800px wide</a>
*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number marginLeft;
/**
/** The margin between the left outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also spacingLeft. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/marginleft/">150px left margin</a>
*/
	public void setMarginLeft(Number marginLeft) {
		this.marginLeft = marginLeft;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginLeft(){ return marginLeft; }

	private HIColor plotBackgroundColor;
/**
/** The background color or gradient for the plot area. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-color/">Color</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundcolor-gradient/">Gradient</a>
*/
	public void setPlotBackgroundColor(HIColor plotBackgroundColor) {
		this.plotBackgroundColor = plotBackgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getPlotBackgroundColor(){ return plotBackgroundColor; }

	private HIColor backgroundColor;
/**
/** The background color or gradient for the outer chart area. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-color/">Color</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/backgroundcolor-gradient/">Gradient</a>
*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Boolean panning;
/**
/** Allow panning in a chart. Best used with panKey to combine zooming and panning. On touch devices, when the tooltip.followTouchMove option is true (defaults), panning requires two fingers. To allow panning with one finger, set followTouchMove to false. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/pankey/">Zooming and panning</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setPanning(Boolean panning) {
		this.panning = panning;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getPanning(){ return panning; }

	private HIOptions3d options3d;
/**
/** Options to render charts in 3 dimensions. This feature requires highcharts-3d.js, found in the download package or online at [https://code.highcharts.com/highcharts-3d.js](http://code.highcharts.com/highcharts-3d.js). 
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
/** The defaults series type for the chart. Can be any of the chart types listed under plotOptions. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/type-bar/">Bar</a> <br><br><b>accepted values:</b><br><br>&ensp;["line", "spline", "column", "bar", "area", "areaspline",       "pie", "arearange", "areasplinerange", "boxplot",       "bubble", "columnrange", "errorbar", "funnel", "gauge",       "heatmap", "polygon", "pyramid", "scatter", "solidgauge",       "treemap", "waterfall"]
 <br><br><b>defaults:</b><br><br>&ensp;line*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private HIEvents events;
/**
/** Event listeners for the chart. 
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
/** The space between the left edge of the chart and the content (plot area, axis title and labels, title, subtitle or legend in top position). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/spacingleft/">Spacing left set to 100</a>
 <br><br><b>defaults:</b><br><br>&ensp;10*/
	public void setSpacingLeft(Number spacingLeft) {
		this.spacingLeft = spacingLeft;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSpacingLeft(){ return spacingLeft; }

	private String definition;
/**
/** A text description of the chart. If the Accessibility module is loaded, this is included by defaults as a long description of the chart and its contents in the hidden screen reader information region. 
*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

	private ArrayList<Number> spacing;
/**
/** The distance between the outer edge of the chart and the content, like title or legend, or axis title and labels if present. The numbers in the array designate top, right, bottom and left respectively. Use the options spacingTop, spacingRight, spacingBottom and spacingLeft options for shorthand setting of one option. 
 <br><br><b>defaults:</b><br><br>&ensp;[10, 10, 15, 10]*/
	public void setSpacing(ArrayList<Number> spacing) {
		this.spacing = spacing;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getSpacing(){ return spacing; }

	private String panKey;
/**
/** Allows setting a key to switch between zooming and panning. Can be one of alt, ctrl, meta (the command key on Mac and Windows key on Windows) or shift. The keys are mapped directly to the key properties of the click event argument (event.altKey, event.ctrlKey, event.metaKey and event.shiftKey). <br><br><b>accepted values:</b><br><br>&ensp;["alt", "ctrl", "meta", "shift"]
*/
	public void setPanKey(String panKey) {
		this.panKey = panKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPanKey(){ return panKey; }

	private HICSSObject style;
/**
/** Additional CSS styles to apply inline to the container div. Note that since the defaults font styles are applied in the renderer, it is ignorant of the individual chart options and must be set globally. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/style-serif-font/">Using a serif type font</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/em/">Styled mode with relative font sizes</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"fontFamily": "\"Lucida Grande\", \"Lucida Sans Unicode\", Verdana, Arial, Helvetica, sans-serif","fontSize":"12px"}*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private HIScrollablePlotArea scrollablePlotArea;
/**
/** Options for a scrollable plot area. This feature provides a minimum width for the plot area of the chart. If the width gets smaller than this, typically on mobile devices, a native browser scrollbar is presented below the chart. This scrollbar provides smooth scrolling for the contents of the plot area, whereas the title, legend and axes are fixed. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea">Scrollable plot area</a>
*/
	public void setScrollablePlotArea(HIScrollablePlotArea scrollablePlotArea) {
		this.scrollablePlotArea = scrollablePlotArea;
		this.scrollablePlotArea.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIScrollablePlotArea getScrollablePlotArea(){ return scrollablePlotArea; }

	private Boolean /* boolean */ shadow;
/**
/** Whether to apply a drop shadow to the outer chart area. Requires that backgroundColor be set. The shadow can be an object configuration containing color, offsetX, offsetY, opacity and width. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/shadow/">Shadow</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setShadow(Boolean /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean /* boolean */ getShadow(){ return shadow; }

	private Boolean inverted;
/**
/** Whether to invert the axes so that the x axis is vertical and y axis is horizontal. When true, the x axis is reversed by defaults. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted/">Inverted line</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInverted(){ return inverted; }

	private HIAnimationOptionsObject animation;
/**
/** Set the overall animation for all chart updating. Animation can be disabled throughout the chart by setting it to false here. It can be overridden for each individual API method as a function parameter. The only animation not affected by this option is the initial series animation, see plotOptions.series.animation. The animation can either be set as a boolean or a configuration object. If true, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported:  duration The duration of the animation in milliseconds. easing A string reference to an easing function set on the Math object. See [the easing demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/).   <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-none/">Updating with no animation</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-duration/">With a longer duration</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/animation-easing/">With a jQuery UI easing</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private Number plotBorderWidth;
/**
/** The pixel width of the plot area border. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotborderwidth/">1px border</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setPlotBorderWidth(Number plotBorderWidth) {
		this.plotBorderWidth = plotBorderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPlotBorderWidth(){ return plotBorderWidth; }

	private String zoomKey;
/**
/** Set a key to hold when dragging to zoom the chart. Requires the draggable-points module. This is useful to avoid zooming while moving points. Should be set different than chart.panKey. <br><br><b>accepted values:</b><br><br>&ensp;["alt", "ctrl", "meta", "shift"]
*/
	public void setZoomKey(String zoomKey) {
		this.zoomKey = zoomKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getZoomKey(){ return zoomKey; }

	private Boolean ignoreHiddenSeries;
/**
/** If true, the axes will scale to the remaining visible series once one series is hidden. If false, hiding and showing a series will not affect the axes or the other series. For stacks, once one series within the stack is hidden, the rest of the stack will close in around it even if the axis is not affected. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-true/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-false/">False</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/ignorehiddenseries-true-stacked/">True with stack</a>
*/
	public void setIgnoreHiddenSeries(Boolean ignoreHiddenSeries) {
		this.ignoreHiddenSeries = ignoreHiddenSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreHiddenSeries(){ return ignoreHiddenSeries; }

	private HIColor selectionMarkerFill;
/**
/** The background color of the marker square when selecting (zooming in on) an area of the chart. 
 <br><br><b>defaults:</b><br><br>&ensp;rgba(51,92,173,0.25)*/
	public void setSelectionMarkerFill(HIColor selectionMarkerFill) {
		this.selectionMarkerFill = selectionMarkerFill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSelectionMarkerFill(){ return selectionMarkerFill; }

	private String plotBackgroundImage;
/**
/** The URL for an image to use as the plot background. To set an image as the background for the entire chart, set a CSS background image to the container element. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/plotbackgroundimage/">Skies</a>
*/
	public void setPlotBackgroundImage(String plotBackgroundImage) {
		this.plotBackgroundImage = plotBackgroundImage;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPlotBackgroundImage(){ return plotBackgroundImage; }

	private String pinchType;
/**
/** Equivalent to zoomType, but for multitouch gestures only. By defaults, the pinchType is the same as the zoomType setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse drag pans the chart, while pinching is enabled. When tooltip.followTouchMove is true, pinchType only applies to two-finger touches. <br><br><b>accepted values:</b><br><br>&ensp;["x", "y", "xy"]
 <br><br><b>defaults:</b><br><br>&ensp;undefined*/
	public void setPinchType(String pinchType) {
		this.pinchType = pinchType;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPinchType(){ return pinchType; }

	private Number colorCount;
/**
/** In styled mode, this sets how many colors the class names should rotate between. With ten colors, series (or points) are given class names like highcharts-color-0, highcharts-color-0 [...] highcharts-color-9. The equivalent in non-styled mode is to set colors using the colors setting. 
*/
	public void setColorCount(Number colorCount) {
		this.colorCount = colorCount;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorCount(){ return colorCount; }

	private Boolean parallelCoordinates;
/**
/** Flag to render charts as a parallel coordinates plot. In a parallel coordinates plot (||-coords) by defaults all required yAxes are generated and the legend is disabled. This feature requires modules/parallel-coordinates.js. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples//highcharts/demo/parallel-coordinates/">Parallel coordinates demo</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/parallel-coordinates/polar/">Star plot, multivariate data in a polar chart</a>
*/
	public void setParallelCoordinates(Boolean parallelCoordinates) {
		this.parallelCoordinates = parallelCoordinates;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getParallelCoordinates(){ return parallelCoordinates; }

	private HIResetZoomButton resetZoomButton;
/**
/** The button that appears after a selection zoom, allowing the user to reset zoom. 
*/
	public void setResetZoomButton(HIResetZoomButton resetZoomButton) {
		this.resetZoomButton = resetZoomButton;
		this.resetZoomButton.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIResetZoomButton getResetZoomButton(){ return resetZoomButton; }

	private Boolean showAxes;
/**
/** Whether to show the axes initially. This only applies to empty charts where series are added dynamically, as axes are automatically added to cartesian series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-false/">False by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/showaxes-true/">True</a>
*/
	public void setShowAxes(Boolean showAxes) {
		this.showAxes = showAxes;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowAxes(){ return showAxes; }

	private Number borderWidth;
/**
/** The pixel width of the outer chart border. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/borderwidth/">5px border</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String typeDescription;
/**
/** A text description of the chart type. If the Accessibility module is loaded, this will be included in the description of the chart in the screen reader information region. Highcharts will by defaults attempt to guess the chart type, but for more complex charts it is recommended to specify this property for clarity. 
*/
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTypeDescription(){ return typeDescription; }

	private Number marginTop;
/**
/** The margin between the top outer edge of the chart and the plot area. Use this to set a fixed pixel value for the margin as opposed to the defaults dynamic margin. See also spacingTop. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/margintop/">100px top margin</a>
*/
	public void setMarginTop(Number marginTop) {
		this.marginTop = marginTop;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarginTop(){ return marginTop; }

	private ArrayList<Number> margin;
/**
/** The margin between the outer edge of the chart and the plot area. The numbers in the array designate top, right, bottom and left respectively. Use the options marginTop, marginRight, marginBottom and marginLeft for shorthand setting of one option. By defaults there is no margin. The actual space is dynamically calculated from the offset of axis labels, axis title, title, subtitle and legend in addition to the spacingTop, spacingRight, spacingBottom and spacingLeft options. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/margins-zero/">Zero margins</a>
*/
	public void setMargin(ArrayList<Number> margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getMargin(){ return margin; }

	private Boolean styledMode;
/**
/** Whether to apply styled mode. When in styled mode, no presentational attributes or CSS are applied to the chart SVG. Instead, CSS rules are required to style the chart. The defaults style sheet is available from https://code.highcharts.com/css/highcharts.css. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setStyledMode(Boolean styledMode) {
		this.styledMode = styledMode;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStyledMode(){ return styledMode; }



	public HIChart() {

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
			params.put("plotShadow", this.plotShadow);
		}
		if (this.height != null) {
			params.put("height", this.height);
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
		if (this.zoomType != null) {
			params.put("zoomType", this.zoomType);
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
		if (this.marginLeft != null) {
			params.put("marginLeft", this.marginLeft);
		}
		if (this.plotBackgroundColor != null) {
			params.put("plotBackgroundColor", this.plotBackgroundColor.getData());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.panning != null) {
			params.put("panning", this.panning);
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
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.spacing != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.spacing) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.scrollablePlotArea != null) {
			params.put("scrollablePlotArea", this.scrollablePlotArea.getParams());
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.inverted != null) {
			params.put("inverted", this.inverted);
		}
		if (this.animation != null) {
			params.put("animation", this.animation);
		}
		if (this.plotBorderWidth != null) {
			params.put("plotBorderWidth", this.plotBorderWidth);
		}
		if (this.zoomKey != null) {
			params.put("zoomKey", this.zoomKey);
		}
		if (this.ignoreHiddenSeries != null) {
			params.put("ignoreHiddenSeries", this.ignoreHiddenSeries);
		}
		if (this.selectionMarkerFill != null) {
			params.put("selectionMarkerFill", this.selectionMarkerFill.getData());
		}
		if (this.plotBackgroundImage != null) {
			params.put("plotBackgroundImage", this.plotBackgroundImage);
		}
		if (this.pinchType != null) {
			params.put("pinchType", this.pinchType);
		}
		if (this.colorCount != null) {
			params.put("colorCount", this.colorCount);
		}
		if (this.parallelCoordinates != null) {
			params.put("parallelCoordinates", this.parallelCoordinates);
		}
		if (this.resetZoomButton != null) {
			params.put("resetZoomButton", this.resetZoomButton.getParams());
		}
		if (this.showAxes != null) {
			params.put("showAxes", this.showAxes);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.typeDescription != null) {
			params.put("typeDescription", this.typeDescription);
		}
		if (this.marginTop != null) {
			params.put("marginTop", this.marginTop);
		}
		if (this.margin != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.margin) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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