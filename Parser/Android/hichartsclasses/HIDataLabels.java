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



public class HIDataLabels extends HIFoundation { 

	private Boolean allowOverlap;
	/**
/** * description: Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the dataLabels.padding can be set to 0. * demo:  •  Don't allow overlap
* defaults: false
*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private Boolean defer;
	/**
/** * description: Whether to defer displaying the data labels until the initial series animation has finished. 
* defaults: true
*/
	public void setDefer(Boolean defer) {
		this.defer = defer;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDefer(){ return defer; }

	private HIStyle style;
	/**
/** * description: Styles for the label. The defaults color setting is "contrast", which is a pseudo color that Highcharts picks up and applies the maximum contrast to the underlying point item, for example the bar in a bar chart. The textOutline is a pseudo property that applies an outline of the given width with the given color, which by defaults is the maximum contrast to the text. So a bright text color will result in a black text outline for maximum readability on a mixed background. In some cases, especially with grayscale text, the text outline doesn't work well, in which cases it can be disabled by setting it to "none". When useHTML is true, the textOutline will not be picked up. In this, case, the same effect can be acheived through the text-shadow CSS property. For some series types, where each point has an extent, like for example tree maps, the data label may overflow the point. There are two strategies for handling overflow. By defaults, the text will wrap to multiple lines. The other strategy is to set style.textOverflow to ellipsis, which will keep the text on one line plus it will break inside long words. * demo:  •  Bold labels •  Long labels truncated with an ellipsis in a pie •  Long labels are wrapped in a pie
*/
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private String rotationMode;
	/**
 Decides how the data label will be rotated relative to the perimeter of the sunburst. Valid values are auto, parallel and perpendicular. When auto, the best fit will be computed for the point. The series.rotation option takes precedence over rotationMode. <br><br><b>accepted values:</b><br><br>&ensp;["auto", "perpendicular", "parallel"]
	*/
	public void setRotationMode(String rotationMode) {
		this.rotationMode = rotationMode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRotationMode(){ return rotationMode; }

	private Object y;
	public void setY(Object y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getY(){ return y; }

	private Object align;
	public void setAlign(Object align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAlign(){ return align; }

	private Object verticalAlign;
	public void setVerticalAlign(Object verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getVerticalAlign(){ return verticalAlign; }

	private Boolean inside;
	public void setInside(Boolean inside) {
		this.inside = inside;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInside(){ return inside; }

	private Boolean enabled;
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String format;
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Boolean crop;
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private HIFunction nodeFormatter;
	/**
 Callback to format data labels for _nodes_ in the sankey diagram. The nodeFormat option takes precedence over the nodeFormatter. 
	*/
	public void setNodeFormatter(HIFunction nodeFormatter) {
		this.nodeFormatter = nodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNodeFormatter(){ return nodeFormatter; }

	private String backgroundColor;
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackgroundColor(){ return backgroundColor; }

	private HIFunction formatter;
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private String nodeFormat;
	/**
 The [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) specifying what to show for _nodes_ in the sankey diagram. By defaults the nodeFormatter returns {point.name}. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-link-datalabels/">Node and link data labels</a>
	*/
	public void setNodeFormat(String nodeFormat) {
		this.nodeFormat = nodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNodeFormat(){ return nodeFormat; }

	private HIFunction nullFormatter;
	/**
 Callback JavaScript function that defines formatting for points with the value of null. Works analogously to formatter. nullPointFormatter can be applied only to series which support displaying null points. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Format data label and tooltip for null point.</a>
	*/
	public void setNullFormatter(HIFunction nullFormatter) {
		this.nullFormatter = nullFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNullFormatter(){ return nullFormatter; }

	private Number borderRadius;
	/**
 The border radius in pixels for the data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private String overflow;
	/**
 How to handle data labels that flow outside the plot area. The defaults is "justify", which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set crop to false and overflow to "allow". 
 <br><br><b>defaults:</b><br><br>&ensp;justify	*/
	public void setOverflow(String overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOverflow(){ return overflow; }

	private String shape;
	/**
 The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/">A callout for annotations</a>
 <br><br><b>defaults:</b><br><br>&ensp;square	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private Number rotation;
	/**
 Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical labels</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private HIColor borderColor;
	/**
 The border color for the data label. Defaults to undefined. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIFilter filter;
	/**
 A declarative filter to control of which data labels to display. The declarative filter is designed for use when callback functions are not available, like when the chart options require a pure JSON structure or for use with graphical editors. For programmatic control, use the formatter instead, and return undefined to disable a single data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome">Data labels filtered by percentage</a>
	*/
	public void setFilter(HIFilter filter) {
		this.filter = filter;
		this.filter.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFilter getFilter(){ return filter; }

	private Boolean useHTML;
	/**
 Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the labels. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private HIColor color;
	/**
 The text color for the data labels. Defaults to undefined. For certain series types, like column or map, the data labels can be drawn inside the points. In this case the data label will be drawn with maximum contrast by defaults. Additionally, it will be given a text-outline style with the opposite color, to further increase the contrast. This can be overridden by setting the text-outline style to none in the dataLabels.style option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-color/">Red data labels</a>
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Object /* boolean, String */ nullFormat;
	/**
 Format for points with the value of null. Works analogously to format. nullFormat can be applied only to series which support displaying null points. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Format data label and tooltip for null point.</a>
	*/
	public void setNullFormat(Object /* boolean, String */ nullFormat) {
		this.nullFormat = nullFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* boolean, String */ getNullFormat(){ return nullFormat; }

	private Number padding;
	/**
 When either the borderWidth or the backgroundColor is set, this is the padding within the box. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private Number x;
	/**
 The x position offset of the label relative to the point in pixels. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical and positioned</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/">Data labels inside the bar</a>
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Boolean /* boolean */ shadow;
	/**
 The shadow of the box. Works best with borderWidth or backgroundColor. Since 2.3 the shadow can be an object configuration containing color, offsetX, offsetY, opacity and width. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setShadow(Boolean /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean /* boolean */ getShadow(){ return shadow; }

	private String className;
	/**
 A class name for the data label. Particularly in styled mode, this can be used to give each series' or point's data label unique styling. In addition to this option, a defaults color class name is added so that we can give the labels a contrast text shadow. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/">Contrast text shadow</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">Styling by CSS</a>
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number borderWidth;
	/**
 The border width in pixels for the data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String position;
	/**
 Aligns data labels relative to points. If center alignment is not possible, it defaultss to right. 
 <br><br><b>defaults:</b><br><br>&ensp;center	*/
	public void setPosition(String position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition(){ return position; }

	private Number z;
	/**
 The Z index of the data labels. The defaults Z index puts it above the series. Use a Z index of 2 to display it behind the series. 
 <br><br><b>defaults:</b><br><br>&ensp;6	*/
	public void setZ(Number z) {
		this.z = z;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZ(){ return z; }

	private HITextPath textPath;
	/**
 Options for a label text which should follow marker's shape. Border and background are disabled for a label that follows a path. **Note:** Only SVG-based renderer supports this option. Setting useHTML to true will disable this option. 
	*/
	public void setTextPath(HITextPath textPath) {
		this.textPath = textPath;
		this.textPath.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITextPath getTextPath(){ return textPath; }

	private Number yHigh;
	/**
 Y offset of the higher data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
	*/
	public void setYHigh(Number yHigh) {
		this.yHigh = yHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getYHigh(){ return yHigh; }

	private Number xHigh;
	/**
 X offset of the higher data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
	*/
	public void setXHigh(Number xHigh) {
		this.xHigh = xHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXHigh(){ return xHigh; }

	private Number xLow;
	/**
 X offset of the lower data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
	*/
	public void setXLow(Number xLow) {
		this.xLow = xLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXLow(){ return xLow; }

	private Number yLow;
	/**
 Y offset of the lower data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
	*/
	public void setYLow(Number yLow) {
		this.yLow = yLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getYLow(){ return yLow; }

	private HIFunction parentNodeFormatter;
	/**
 Callback to format data labels for _parentNodes_. The parentNodeFormat option takes precedence over the parentNodeFormatter. 
	*/
	public void setParentNodeFormatter(HIFunction parentNodeFormatter) {
		this.parentNodeFormatter = parentNodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getParentNodeFormatter(){ return parentNodeFormatter; }

	private HIParentNodeTextPath parentNodeTextPath;
	/**
 Options for a _parentNode_ label text. **Note:** Only SVG-based renderer supports this option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-packedbubble/packed-dashboard">Dashboard with dataLabels on parentNodes</a>
	*/
	public void setParentNodeTextPath(HIParentNodeTextPath parentNodeTextPath) {
		this.parentNodeTextPath = parentNodeTextPath;
		this.parentNodeTextPath.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIParentNodeTextPath getParentNodeTextPath(){ return parentNodeTextPath; }

	private Number connectorWidth;
	/**
 The width of the line connecting the data label to the point. In styled mode, the connector stroke width is given in the .highcharts-data-label-connector class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/connector-styles">Custom connector width and color</a>
	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private Boolean alternate;
	/**
 Whether to position data labels alternately. For example, if distance is set equal to 100, then data labels will be positioned alternately (on both sides of the point) at a distance of 100px. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/alternate-disabled">Alternate disabled</a>
	*/
	public void setAlternate(Boolean alternate) {
		this.alternate = alternate;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlternate(){ return alternate; }

	private HIColor connectorColor;
	/**
 The color of the line connecting the data label to the point. The defaults color is the same as the point's color. In styled mode, the connector stroke is given in the .highcharts-data-label-connector class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/connector-styles">Custom connector width and color</a>
	*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }

	private Number width;
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number distance;
	/**
 A pixel value defining the distance between the data label and the point. Negative numbers puts the label on top of the point. 
	*/
	public void setDistance(Number distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDistance(){ return distance; }

	private Number zIndex;
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String linkFormat;
	/**
 The [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) specifying what to show for _links_ in the networkgraph. (Default: undefined) 
	*/
	public void setLinkFormat(String linkFormat) {
		this.linkFormat = linkFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkFormat(){ return linkFormat; }

	private HIFunction linkFormatter;
	/**
 Callback to format data labels for _links_ in the sankey diagram. The linkFormat option takes precedence over the linkFormatter. 
	*/
	public void setLinkFormatter(HIFunction linkFormatter) {
		this.linkFormatter = linkFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLinkFormatter(){ return linkFormatter; }

	private HILinkTextPath linkTextPath;
	/**
 Options for a _link_ label text which should follow link connection. Border and background are disabled for a label that follows a path. **Note:** Only SVG-based renderer supports this option. Setting useHTML to true will disable this option. 
	*/
	public void setLinkTextPath(HILinkTextPath linkTextPath) {
		this.linkTextPath = linkTextPath;
		this.linkTextPath.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILinkTextPath getLinkTextPath(){ return linkTextPath; }

	private String alignTo;
	/**
 Alignment method for data labels. Possible values are: - toPlotEdges: Each label touches the nearest vertical edge of  the plot area. - connectors: Connectors have the same x position and the  widest label of each half (left & right) touches the nearest  vertical edge of the plot area. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-alignto-connectors/">alignTo: connectors</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-alignto-plotedges/">alignTo: plotEdges</a>
	*/
	public void setAlignTo(String alignTo) {
		this.alignTo = alignTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlignTo(){ return alignTo; }

	private Boolean softConnector;
	/**
 Whether to render the connector as a soft arc or a line with sharp break. Works only if connectorShape equals to fixedOffset. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-true/">Soft</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-false/">Non soft</a>
	*/
	public void setSoftConnector(Boolean softConnector) {
		this.softConnector = softConnector;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSoftConnector(){ return softConnector; }

	private Number connectorPadding;
	/**
 The distance from the data label to the connector. Note that data labels also have a defaults padding, so in order for the connector to touch the text, the padding must also be 0. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorpadding/">No padding</a>
	*/
	public void setConnectorPadding(Number connectorPadding) {
		this.connectorPadding = connectorPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorPadding(){ return connectorPadding; }

	private String connectorShape;
	/**
 Specifies the method that is used to generate the connector path. Highcharts provides 3 built-in connector shapes: 'fixedOffset' (defaults), 'straight' and 'crookedLine'. Using 'crookedLine' has the most sense (in most of the cases) when 'alignTo' is set. Users can provide their own method by passing a function instead of a String. 3 arguments are passed to the callback: - Object that holds the information about the coordinates of the  label (x & y properties) and how the label is located in  relation to the pie (alignment property). alignment can by  one of the following:  'left' (pie on the left side of the data label),  'right' (pie on the right side of the data label) or  'center' (data label overlaps the pie). - Object that holds the information about the position of the  connector. Its touchingSliceAt porperty tells the position  of the place where the connector touches the slice. - Data label options The function has to return an SVG path definition in array form (see the example). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorshape-string/">connectorShape is a String</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorshape-function/">connectorShape is a function</a>
	*/
	public void setConnectorShape(String connectorShape) {
		this.connectorShape = connectorShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorShape(){ return connectorShape; }

	private String crookDistance;
	/**
 Works only if connectorShape is 'crookedLine'. It defines how far from the vertical plot edge the coonnector path should be crooked. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-crookdistance/">crookDistance set to 90%</a>
	*/
	public void setCrookDistance(String crookDistance) {
		this.crookDistance = crookDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCrookDistance(){ return crookDistance; }

	private HISVGAttributes attributes;
	/**
 Presentation attributes for the text path. 
	*/
	public void setAttributes(HISVGAttributes attributes) {
		this.attributes = attributes;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getAttributes(){ return attributes; }

	private String parentNodeFormat;
	public void setParentNodeFormat(String parentNodeFormat) {
		this.parentNodeFormat = parentNodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getParentNodeFormat(){ return parentNodeFormat; }



	public HIDataLabels() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.defer != null) {
			params.put("defer", this.defer);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.rotationMode != null) {
			params.put("rotationMode", this.rotationMode);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.inside != null) {
			params.put("inside", this.inside);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.nullFormatter != null) {
			params.put("nullFormatter", this.nullFormatter);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.filter != null) {
			params.put("filter", this.filter.getParams());
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.nullFormat != null) {
			params.put("nullFormat", this.nullFormat);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		if (this.z != null) {
			params.put("z", this.z);
		}
		if (this.textPath != null) {
			params.put("textPath", this.textPath.getParams());
		}
		if (this.yHigh != null) {
			params.put("yHigh", this.yHigh);
		}
		if (this.xHigh != null) {
			params.put("xHigh", this.xHigh);
		}
		if (this.xLow != null) {
			params.put("xLow", this.xLow);
		}
		if (this.yLow != null) {
			params.put("yLow", this.yLow);
		}
		if (this.parentNodeFormatter != null) {
			params.put("parentNodeFormatter", this.parentNodeFormatter);
		}
		if (this.parentNodeTextPath != null) {
			params.put("parentNodeTextPath", this.parentNodeTextPath.getParams());
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.alternate != null) {
			params.put("alternate", this.alternate);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor.getData());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.linkFormat != null) {
			params.put("linkFormat", this.linkFormat);
		}
		if (this.linkFormatter != null) {
			params.put("linkFormatter", this.linkFormatter);
		}
		if (this.linkTextPath != null) {
			params.put("linkTextPath", this.linkTextPath.getParams());
		}
		if (this.alignTo != null) {
			params.put("alignTo", this.alignTo);
		}
		if (this.softConnector != null) {
			params.put("softConnector", this.softConnector);
		}
		if (this.connectorPadding != null) {
			params.put("connectorPadding", this.connectorPadding);
		}
		if (this.connectorShape != null) {
			params.put("connectorShape", this.connectorShape);
		}
		if (this.crookDistance != null) {
			params.put("crookDistance", this.crookDistance);
		}
		if (this.attributes != null) {
			params.put("attributes", this.attributes.getParams());
		}
		if (this.parentNodeFormat != null) {
			params.put("parentNodeFormat", this.parentNodeFormat);
		}
		return params;
	}

}