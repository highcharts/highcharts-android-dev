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
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private Boolean defer;
	public void setDefer(Boolean defer) {
		this.defer = defer;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDefer(){ return defer; }

	private HIStyle style;
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private String rotationMode;
	/**
 Decides how the data label will be rotated relative to the perimeter of the sunburst. Valid values are `circular`, `auto`, `parallel` and `perpendicular`. When `circular`, the best fit will be computed for the point, so that the label is curved around the center when there is room for it, otherwise perpendicular. The legacy `auto` option works similiar to `circular`, but instead of curving the labels they are tangent to the perimiter. The `rotation` option takes precedence over `rotationMode`. 
 <br><br><b>defaults:</b><br><br>&ensp;circular	*/
	public void setRotationMode(String rotationMode) {
		this.rotationMode = rotationMode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRotationMode(){ return rotationMode; }

	private HIColor connectorColor;
	/**
 The color of the line connecting the data label to the pie slice. The defaults color is the same as the point's color. In styled mode, the connector stroke is given in the `.highcharts-data-label-connector` class. 
	*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }

	private String crookDistance;
	/**
 Works only if `connectorShape` is `'crookedLine'`. It defines how far from the vertical plot edge the coonnector path should be crooked. With the defaults, `undefined`, the crook is placed so that the horizontal line from the label intersects with the radial line extending through the center of the pie slice. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setCrookDistance(String crookDistance) {
		this.crookDistance = crookDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCrookDistance(){ return crookDistance; }

	private String alignTo;
	/**
 Alignment method for data labels. Possible values are: - `plotEdges`: Each label touches the nearest vertical edge of  the plot area. - `connectors`: Connectors have the same x position and the  widest label of each half (left & right) touches the nearest  vertical edge of the plot area. 
	*/
	public void setAlignTo(String alignTo) {
		this.alignTo = alignTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlignTo(){ return alignTo; }

	private Number connectorWidth;
	/**
 The width of the line connecting the data label to the pie slice. In styled mode, the connector stroke width is given in the `.highcharts-data-label-connector` class. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private Boolean softConnector;
	/**
 Whether to render the connector as a soft arc or a line with a sharp break. Works only if `connectorShape` equals to `fixedOffset`. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setSoftConnector(Boolean softConnector) {
		this.softConnector = softConnector;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSoftConnector(){ return softConnector; }

	private String format;
	/**
/** * description: A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) for the data label. Available variables are the same as for `formatter`. * demo: * [Add a unit](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/) 
* defaults: undefined
*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Boolean enabled;
	/**
/** * description: Enable or disable the data labels. * demo: * [Data labels enabled](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled/) 
* defaults: True
*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number connectorPadding;
	/**
 The distance from the data label to the connector. Note that data labels also have a defaults `padding`, so in order for the connector to touch the text, the `padding` must also be 0. 
 <br><br><b>defaults:</b><br><br>&ensp;5	*/
	public void setConnectorPadding(Number connectorPadding) {
		this.connectorPadding = connectorPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorPadding(){ return connectorPadding; }

	private String connectorShape;
	/**
 Specifies the method that is used to generate the connector path. Highcharts provides 3 built-in connector shapes: `'crookedLine'` (defaults since v11), `'fixedOffset'` and `'straight'`. Users can provide their own method by passing a function instead of a string. Three arguments are passed to the callback: - An object that holds the information about the coordinates of the  label (`x` & `y` properties) and how the label is located in  relation to the pie (`alignment` property). `alignment` can by one  of the following: `'left'` (pie on the left side of the data  label), `'right'` (pie on the right side of the data label) or  `'center'` (data label overlaps the pie). - An object that holds the information about the position of the  connector. Its `touchingSliceAt` porperty tells the position of  the place where the connector touches the slice. - Data label options The function has to return an SVG path definition in array form (see the example). 
 <br><br><b>defaults:</b><br><br>&ensp;crookedLine	*/
	public void setConnectorShape(String connectorShape) {
		this.connectorShape = connectorShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorShape(){ return connectorShape; }

	private HIFunction formatter;
	/**
/** * description: Callback JavaScript function to format the data label. Note that if a `format` is defined, the format takes precedence and the formatter is ignored. 
* defaults: function () { return this.point.isNull ? void 0 : this.point.name; }
*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Object /* Number, String */ distance;
	/**
 The distance of the data label from the pie's edge. Negative numbers put the data label on top of the pie slices. Can also be defined as a percentage of pie's radius. Connectors are only shown for data labels outside the pie. 
 <br><br><b>defaults:</b><br><br>&ensp;30	*/
	public void setDistance(Object /* Number, String */ distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getDistance(){ return distance; }

	private HIFunction nullFormatter;
	/**
 Callback JavaScript function that defines formatting for points with the value of null. Works analogously to `formatter`. `nullFormatter` can be applied only to series which support displaying null points i.e `heatmap` or `tilemap`. Does not work with series that don't display null points, like `line`, `column`, `bar` or `pie`. 
	*/
	public void setNullFormatter(HIFunction nullFormatter) {
		this.nullFormatter = nullFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNullFormatter(){ return nullFormatter; }

	private HIBorderRadius borderRadius;
	/**
 The border radius in pixels for the data label. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBorderRadius(HIBorderRadius borderRadius) {
		this.borderRadius = borderRadius;
		this.borderRadius.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBorderRadius getBorderRadius(){ return borderRadius; }

	private Boolean crop;
	/**
 Whether to hide data labels that are outside the plot area. By defaults, the data label is moved inside the plot area according to the `overflow` option. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private String shape;
	/**
 The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object. 
 <br><br><b>defaults:</b><br><br>&ensp;square	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private String overflow;
	/**
 How to handle data labels that flow outside the plot area. The defaults is `"justify"`, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set `crop` to `false` and `overflow` to `"allow"`. 
 <br><br><b>defaults:</b><br><br>&ensp;justify	*/
	public void setOverflow(String overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOverflow(){ return overflow; }

	private HIColor borderColor;
	/**
 The border color for the data label. Setting it to `auto` will use the point's color. Defaults to `undefined`. 
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIFilter filter;
	/**
 A declarative filter to control of which data labels to display. The declarative filter is designed for use when callback functions are not available, like when the chart options require a pure JSON structure or for use with graphical editors. For programmatic control, use the `formatter` instead, and return `undefined` to disable a single data label. 
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

	private HIAnimationOptionsObject animation;
	/**
 Enable or disable the initial animation when a series is displayed for the `dataLabels`. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation. For other animations, see `chart.animation` and the animation parameter under the API methods. The following properties are supported: - `defer`: The animation delay time in milliseconds. 
	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private HIColor backgroundColor;
	/**
 The background color or gradient for the data label. Setting it to `auto` will use the point's color. 
	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Object /* boolean, String */ nullFormat;
	/**
 Format for points with the value of null. Works analogously to `format`. `nullFormat` can be applied only to series which support displaying null points i.e `heatmap` or `tilemap`. Does not work with series that don't display null points, like `line`, `column`, `bar` or `pie`. 
	*/
	public void setNullFormat(Object /* boolean, String */ nullFormat) {
		this.nullFormat = nullFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* boolean, String */ getNullFormat(){ return nullFormat; }

	private Number padding;
	/**
 When either the `borderWidth` or the `backgroundColor` is set, this is the padding within the box. 
 <br><br><b>defaults:</b><br><br>&ensp;5	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private HIShadowOptionsObject /* boolean */ shadow;
	/**
 The shadow of the box. Works best with `borderWidth` or `backgroundColor`. Since 2.3 the shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setShadow(HIShadowOptionsObject /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIShadowOptionsObject /* boolean */ getShadow(){ return shadow; }

	private Number x;
	/**
 The x position offset of the label relative to the point in pixels. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number rotation;
	/**
 Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Number zIndex;
	/**
 The z index of the data labels. Use a `zIndex` of 6 to display it above the series, or use a `zIndex` of 2 to display it behind the series. 
 <br><br><b>defaults:</b><br><br>&ensp;6	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String verticalAlign;
	/**
 The vertical alignment of a data label. Can be one of `top`, `middle` or `bottom`. The defaults value depends on the data, for instance in a column chart, the label is above positive values and below negative values. 
	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String className;
	/**
 A class name for the data label. Particularly in styled mode, this can be used to give each series' or point's data label unique styling. In addition to this option, a defaults color class name is added so that we can give the labels a contrast text shadow. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number borderWidth;
	/**
 The border width in pixels for the data label. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Number y;
	/**
 The y position offset of the label relative to the point in pixels. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private String position;
	/**
 Aligns data labels relative to points. If `center` alignment is not possible, it defaultss to `right`. 
 <br><br><b>defaults:</b><br><br>&ensp;center	*/
	public void setPosition(String position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition(){ return position; }

	private HITextPath textPath;
	/**
 Options for a label text which should follow marker's shape. Border and background are disabled for a label that follows a path. **Note:** Only SVG-based renderer supports this option. Setting `useHTML` to true will disable this option. 
	*/
	public void setTextPath(HITextPath textPath) {
		this.textPath = textPath;
		this.textPath.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITextPath getTextPath(){ return textPath; }

	private String align;
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean inside;
	public void setInside(Boolean inside) {
		this.inside = inside;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInside(){ return inside; }

	private String linkFormat;
	/**
 The format string specifying what to show for *links* in the organization chart. Best to use with ``linkTextPath`` enabled. 
	*/
	public void setLinkFormat(String linkFormat) {
		this.linkFormat = linkFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkFormat(){ return linkFormat; }

	private HIDataLabelTextPathOptions linkTextPath;
	/**
 Options for a _link_ label text which should follow link connection. 
	*/
	public void setLinkTextPath(HIDataLabelTextPathOptions linkTextPath) {
		this.linkTextPath = linkTextPath;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataLabelTextPathOptions getLinkTextPath(){ return linkTextPath; }

	private HIFunction linkFormatter;
	/**
 Callback to format data labels for _links_ in the organization chart. The `linkFormat` option takes precedence over the `linkFormatter`. 
	*/
	public void setLinkFormatter(HIFunction linkFormatter) {
		this.linkFormatter = linkFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLinkFormatter(){ return linkFormatter; }

	private Number yHigh;
	/**
 Y offset of the higher data labels relative to the point value. 
	*/
	public void setYHigh(Number yHigh) {
		this.yHigh = yHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getYHigh(){ return yHigh; }

	private Number xHigh;
	/**
 X offset of the higher data labels relative to the point value. 
	*/
	public void setXHigh(Number xHigh) {
		this.xHigh = xHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXHigh(){ return xHigh; }

	private Number xLow;
	/**
 X offset of the lower data labels relative to the point value. 
	*/
	public void setXLow(Number xLow) {
		this.xLow = xLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXLow(){ return xLow; }

	private Number yLow;
	/**
 Y offset of the lower data labels relative to the point value. 
	*/
	public void setYLow(Number yLow) {
		this.yLow = yLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getYLow(){ return yLow; }

	private HIFunction nodeFormatter;
	/**
 Callback to format data labels for _nodes_ in the sankey diagram. The `nodeFormat` option takes precedence over the `nodeFormatter`. 
	*/
	public void setNodeFormatter(HIFunction nodeFormatter) {
		this.nodeFormatter = nodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNodeFormatter(){ return nodeFormatter; }

	private String nodeFormat;
	/**
 The [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) specifying what to show for _nodes_ in the sankey diagram. By defaults the `nodeFormatter` returns `{point.name}`. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setNodeFormat(String nodeFormat) {
		this.nodeFormat = nodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNodeFormat(){ return nodeFormat; }

	private HIColor color;
	/**
/** * description: The main color of the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The defaults value is pulled from the `options.colors` array. In styled mode, the color can be defined by the `colorIndex` option. Also, the series color can be set with the `.highcharts-series`, `.highcharts-color-{n}`, `.highcharts-{type}-series` or `.highcharts-series-{n}` class, or individual classes given by the `className` option. * demo: * [General plot option](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-general/) * [One specific series](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-specific/) * [Area color](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-color-area/) * [Pattern fill](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/infographic/) 
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private ArrayList <HIData> data;
	/**
/** * description: An array of data points for the series. For the `arearange` series type, points can be given in the following ways: 1. An array of arrays with 3 or 2 values. In this case, the values   correspond to `x,low,high`. If the first value is a string, it is   applied as the name of the point, and the `x` value is inferred.  The `x` value can also be omitted, in which case the inner arrays   should be of length 2\. Then the `x` value is automatically calculated,   either starting at 0 and incremented by 1, or from `pointStart`   and `pointInterval` given in the series options.  ```js   data: `     [0, 8, 3],     [1, 1, 1],     [2, 6, 8]   ]   ``` 2. An array of objects with named values. The following snippet shows only a   few settings, see the complete options set below. If the total number of   data points exceeds the series'   [turboThreshold`,   this option is not available.  ```js   data: [{     x: 1,     low: 9,     high: 0,     name: "Point2",     color: "#00FF00"   }, {     x: 1,     low: 3,     high: 4,     name: "Point1",     color: "#FF00FF"   }]   ``` * demo: * [Arrays of numeric x and y](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays/) * [Arrays of datetime x and y](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-arrays-datetime/) * [Arrays of point.name and y](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-name-value/) * [Config objects](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/) 
*/
	public void setData(ArrayList data) {
		this.data = data;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getData(){ return data; }

	private HIColor fillColor;
	/**
/** * description: Fill color or gradient for the area. When `undefined`, the series' `color` is used with the series' `fillOpacity`. In styled mode, the fill color can be set with the `.highcharts-area` class name. * demo: * [Undefined by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-defaults/) * [Gradient](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-gradient/) 
*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private Number fillOpacity;
	/**
/** * description: Fill opacity for the area. When you set an explicit `fillColor`, the `fillOpacity` is not applied. Instead, you should define the opacity in the `fillColor` with an rgba color definition. The `fillOpacity` setting, also the defaults setting, overrides the alpha component of the `color` setting. In styled mode, the fill opacity can be set with the `.highcharts-area` class name. * demo: * [Automatic fill color and fill opacity of 0.1](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillopacity/) 
* defaults: 0.75
*/
	public void setFillOpacity(Number fillOpacity) {
		this.fillOpacity = fillOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFillOpacity(){ return fillOpacity; }

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

	private String type;
	/**
 The type of series. Can be one of area, areaspline, bar, column, line, pie, scatter or spline. From version 2.3, arearange, areasplinerange and columnrange are supported with the highcharts-more.js component. 
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

	private HILowMarker lowMarker;
	/**
 Options for the lower markers of the arearange-like series. When `lowMarker` is not defined, options inherit form the marker. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setLowMarker(HILowMarker lowMarker) {
		this.lowMarker = lowMarker;
		this.lowMarker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILowMarker getLowMarker(){ return lowMarker; }

	private HITooltip tooltip;
	/**
/** * description: A configuration object for the tooltip rendering of each single series. Properties are inherited from `tooltip`, but only the following properties can be defined on a series level. 
*/
	public void setTooltip(HITooltip tooltip) {
		this.tooltip = tooltip;
		this.tooltip.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITooltip getTooltip(){ return tooltip; }

	private HIDataLabels dataLabels;
	/**
/** * description: Extended data labels for range series types. Range series data labels use no `x` and `y` options. Instead, they have `xLow`, `xHigh`, `yLow` and `yHigh` options to allow the higher and lower data label sets individually. * demo: * [Data labels enabled](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled) * [Multiple data labels on a bar series](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-multiple) * [Styled mode example](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels) 
*/
	public void setDataLabels(HIDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		this.dataLabels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataLabels getDataLabels(){ return dataLabels; }

	private HIDragDrop dragDrop;
	/**
/** * description: The draggable-points module allows points to be moved around or modified in the chart. In addition to the options mentioned under the `dragDrop` API structure, the module fires three events, `point.dragStart`, `point.drag` and `point.drop`. * demo: * [Draggable column and line series](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/resize-column) * [Draggable bar](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/bar-series) * [Draggable bubbles](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-bubble) * [Draggable X range series](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/drag-xrange) * [Dragging disabled for specific points](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/dragdrop/undraggable-points) 
*/
	public void setDragDrop(HIDragDrop dragDrop) {
		this.dragDrop = dragDrop;
		this.dragDrop.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDragDrop getDragDrop(){ return dragDrop; }

	private String colorKey;
	/**
/** * description: Determines what data value should be used to calculate point color if `colorAxis` is used. Requires to set `min` and `max` if some custom point property is used or if approximation for data grouping is set to `'sum'`. * demo: * [Custom color key](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/custom-color-key/) * [Custom colorKey with color axis stops](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/color-key-with-stops/) * [Changed defaults color key](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/coloraxis/changed-defaults-color-key/) 
* defaults: low
*/
	public void setColorKey(String colorKey) {
		this.colorKey = colorKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColorKey(){ return colorKey; }

	private Boolean trackByArea;
	/**
/** * description: Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events. * demo: * [Display the tooltip when the area is hovered](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-trackbyarea/) 
* defaults: True
*/
	public void setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTrackByArea(){ return trackByArea; }

	private Number threshold;
	/**
/** * description: The Y axis value to serve as the base for the area, for distinguishing between values above and below a threshold. The area between the graph and the threshold is filled. * If a number is given, the Y axis will scale to the threshold. * If `null`, the scaling behaves like a line series with fill between  the graph and the Y axis minimum. * If `Infinity` or `-Infinity`, the area between the graph and the  corresponding Y axis extreme is filled (since v6.1.0). * demo: * [A threshold of 100](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-threshold/) * [A threshold of Infinity](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-threshold-infinity/) 
*/
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getThreshold(){ return threshold; }

	private Number lineWidth;
	/**
/** * description: Pixel width of the arearange graph line. * demo: * [On all series](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-general/) * [On one single series](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-linewidth-specific/) 
* defaults: 1
*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private HIColor negativeFillColor;
	/**
 A separate color for the negative part of the area. In styled mode, a negative color is set with the `.highcharts-negative` class name. 
	*/
	public void setNegativeFillColor(HIColor negativeFillColor) {
		this.negativeFillColor = negativeFillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNegativeFillColor(){ return negativeFillColor; }

	private String legendSymbol;
	/**
/** * description: What type of legend symbol to render for this series. Can be one of `areaMarker`, `lineMarker` or `rectangle`. * demo: * [Change the legend symbol](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/legend-symbol/) * accepted values: ["areaMarker", "lineMarker", "rectangle"] 
* defaults: areaMarker
*/
	public void setLegendSymbol(String legendSymbol) {
		this.legendSymbol = legendSymbol;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLegendSymbol(){ return legendSymbol; }

	private HIColor lineColor;
	/**
 A separate color for the graph line. By defaults the line takes the `color` of the series, but the lineColor setting allows setting a separate color for the line without altering the `fillColor`. In styled mode, the line stroke can be set with the `.highcharts-graph` class name. 
	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private String linecap;
	/**
/** * description: The SVG value used for the `stroke-linecap` and `stroke-linejoin` of a line graph. Round means that lines are rounded in the ends and bends. * demo: * [Line cap comparison](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-line/linecap/) 
* defaults: round
*/
	public void setLinecap(String linecap) {
		this.linecap = linecap;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinecap(){ return linecap; }

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
 When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to `0` disable. Note: In boost mode turbo threshold is forced. Only array of numbers or two dimensional arrays are allowed. 
 <br><br><b>defaults:</b><br><br>&ensp;1000	*/
	public void setTurboThreshold(Number turboThreshold) {
		this.turboThreshold = turboThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTurboThreshold(){ return turboThreshold; }

	private String definition;
	/**
 A description of the series to add to the screen reader information about the series. 
	*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

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
 When using dual or multiple color axes, this number defines which colorAxis the particular series is connected to. It refers to either the {@link #colorAxis.id|axis id} or the index of the axis in the colorAxis array, with 0 being the first. Set this option to false to prevent a series from connecting to the defaults color axis. Since v7.2.0 the option can also be an axis id or an axis index instead of a boolean flag. 
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

	private Number pointStart;
	/**
 If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945. If combined with `relativeXValue`, an x value can be set on each point. The x value from the point options is multiplied by `pointInterval` and added to `pointStart` to produce a modified x value. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setPointStart(Number pointStart) {
		this.pointStart = pointStart;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointStart(){ return pointStart; }

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

	private String parentNodeFormat;
	public void setParentNodeFormat(String parentNodeFormat) {
		this.parentNodeFormat = parentNodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getParentNodeFormat(){ return parentNodeFormat; }

	private HIParentNodeTextPath parentNodeTextPath;
	public void setParentNodeTextPath(HIParentNodeTextPath parentNodeTextPath) {
		this.parentNodeTextPath = parentNodeTextPath;
		this.parentNodeTextPath.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIParentNodeTextPath getParentNodeTextPath(){ return parentNodeTextPath; }

	private HIFunction parentNodeFormatter;
	public void setParentNodeFormatter(HIFunction parentNodeFormatter) {
		this.parentNodeFormatter = parentNodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getParentNodeFormatter(){ return parentNodeFormatter; }

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

	private Boolean alternate;
	/**
 Whether to position data labels alternately. For example, if `distance` is set equal to `100`, then data labels will be positioned alternately (on both sides of the point) at a distance of 100px. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setAlternate(Boolean alternate) {
		this.alternate = alternate;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlternate(){ return alternate; }

	private Number width;
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Object pointRange;
	/**
/** * description: The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by defaults (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points. The defaults `null` means it is computed automatically, but this option can be used to override the automatic value. This option is set by defaults to 1 if data sorting is enabled. * demo: * [Set the point range to one day on a data set with one week between the points](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointrange/) 
*/
	public void setPointRange(Object pointRange) {
		this.pointRange = pointRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPointRange(){ return pointRange; }

	private Number pointPadding;
	/**
 Padding between each column or bar, in x axis units. 
 <br><br><b>defaults:</b><br><br>&ensp;0.1	*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number minPointLength;
	/**
 The minimal height for a column or width for a bar. By defaults, 0 values are not shown. To visualize a 0 (or close to zero) point, set the minimal point length to a pixel value like 3\. In stacked column charts, minPointLength might not be respected for tightly packed values. 
	*/
	public void setMinPointLength(Number minPointLength) {
		this.minPointLength = minPointLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPointLength(){ return minPointLength; }

	private Number groupZPadding;
	/**
 The spacing between columns on the Z Axis in a 3D chart. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setGroupZPadding(Number groupZPadding) {
		this.groupZPadding = groupZPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupZPadding(){ return groupZPadding; }

	private ArrayList<String> colors;
	/**
 A series specific or series type specific color set to apply instead of the global `colors` when `colorByPoint` is true. 
	*/
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getColors(){ return colors; }

	private HIColor edgeColor;
	/**
 3D columns only. The color of the edges. Similar to `borderColor`, except it defaultss to the same color as the column. 
	*/
	public void setEdgeColor(HIColor edgeColor) {
		this.edgeColor = edgeColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getEdgeColor(){ return edgeColor; }

	private Boolean centerInCategory;
	/**
 When `true`, the columns will center in the category, ignoring null or missing points. When `false`, space will be reserved for null or missing points. 
	*/
	public void setCenterInCategory(Boolean centerInCategory) {
		this.centerInCategory = centerInCategory;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCenterInCategory(){ return centerInCategory; }

	private Number maxPointWidth;
	/**
 The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart. 
	*/
	public void setMaxPointWidth(Number maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPointWidth(){ return maxPointWidth; }

	private Number pointWidth;
	/**
 A pixel value specifying a fixed width for each column or bar point. When set to `undefined`, the width is calculated from the `pointPadding` and `groupPadding`. The width effects the dimension that is not based on the point value. For column series it is the hoizontal length and for bar series it is the vertical length. 
	*/
	public void setPointWidth(Number pointWidth) {
		this.pointWidth = pointWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointWidth(){ return pointWidth; }

	private Boolean colorByPoint;
	/**
 When using automatic point colors pulled from the global `colors` or series-specific `plotOptions.column.colors` collections, this option determines whether the chart should receive one color per series or one color per point. In styled mode, the `colors` or `series.colors` arrays are not supported, and instead this option gives the points individual color class names on the form `highcharts-color-{n}`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number groupPadding;
	/**
 Padding between each value groups, in x axis units. 
 <br><br><b>defaults:</b><br><br>&ensp;0.2	*/
	public void setGroupPadding(Number groupPadding) {
		this.groupPadding = groupPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupPadding(){ return groupPadding; }

	private Number edgeWidth;
	/**
 3D columns only. The width of the colored edges. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setEdgeWidth(Number edgeWidth) {
		this.edgeWidth = edgeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEdgeWidth(){ return edgeWidth; }

	private Number depth;
	/**
 Depth of the columns in a 3D column chart. 
 <br><br><b>defaults:</b><br><br>&ensp;25	*/
	public void setDepth(Number depth) {
		this.depth = depth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDepth(){ return depth; }

	private Boolean grouping;
	/**
 Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setGrouping(Boolean grouping) {
		this.grouping = grouping;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGrouping(){ return grouping; }



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
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor.getData());
		}
		if (this.crookDistance != null) {
			params.put("crookDistance", this.crookDistance);
		}
		if (this.alignTo != null) {
			params.put("alignTo", this.alignTo);
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.softConnector != null) {
			params.put("softConnector", this.softConnector);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.connectorPadding != null) {
			params.put("connectorPadding", this.connectorPadding);
		}
		if (this.connectorShape != null) {
			params.put("connectorShape", this.connectorShape);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.nullFormatter != null) {
			params.put("nullFormatter", this.nullFormatter);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius.getParams());
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
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
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.nullFormat != null) {
			params.put("nullFormat", this.nullFormat);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow.getParams());
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		if (this.textPath != null) {
			params.put("textPath", this.textPath.getParams());
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.inside != null) {
			params.put("inside", this.inside);
		}
		if (this.linkFormat != null) {
			params.put("linkFormat", this.linkFormat);
		}
		if (this.linkTextPath != null) {
			params.put("linkTextPath", this.linkTextPath.getParams());
		}
		if (this.linkFormatter != null) {
			params.put("linkFormatter", this.linkFormatter);
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
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
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
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.fillOpacity != null) {
			params.put("fillOpacity", this.fillOpacity);
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
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.xAxis != null) {
			params.put("xAxis", this.xAxis);
		}
		if (this.yAxis != null) {
			params.put("yAxis", this.yAxis);
		}
		if (this.lowMarker != null) {
			params.put("lowMarker", this.lowMarker.getParams());
		}
		if (this.tooltip != null) {
			params.put("tooltip", this.tooltip.getParams());
		}
		if (this.dataLabels != null) {
			params.put("dataLabels", this.dataLabels.getParams());
		}
		if (this.dragDrop != null) {
			params.put("dragDrop", this.dragDrop.getParams());
		}
		if (this.colorKey != null) {
			params.put("colorKey", this.colorKey);
		}
		if (this.trackByArea != null) {
			params.put("trackByArea", this.trackByArea);
		}
		if (this.threshold != null) {
			params.put("threshold", this.threshold);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.negativeFillColor != null) {
			params.put("negativeFillColor", this.negativeFillColor.getData());
		}
		if (this.legendSymbol != null) {
			params.put("legendSymbol", this.legendSymbol);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.linecap != null) {
			params.put("linecap", this.linecap);
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
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.dataSorting != null) {
			params.put("dataSorting", this.dataSorting.getParams());
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
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
		if (this.findNearestPointBy != null) {
			params.put("findNearestPointBy", this.findNearestPointBy);
		}
		if (this.relativeXValue != null) {
			params.put("relativeXValue", this.relativeXValue);
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
		if (this.definition != null) {
			params.put("definition", this.definition);
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
		if (this.pointStart != null) {
			params.put("pointStart", this.pointStart);
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
		if (this.parentNodeFormat != null) {
			params.put("parentNodeFormat", this.parentNodeFormat);
		}
		if (this.parentNodeTextPath != null) {
			params.put("parentNodeTextPath", this.parentNodeTextPath.getParams());
		}
		if (this.parentNodeFormatter != null) {
			params.put("parentNodeFormatter", this.parentNodeFormatter);
		}
		if (this.attributes != null) {
			params.put("attributes", this.attributes.getParams());
		}
		if (this.alternate != null) {
			params.put("alternate", this.alternate);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.pointRange != null) {
			params.put("pointRange", this.pointRange);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
		}
		if (this.groupZPadding != null) {
			params.put("groupZPadding", this.groupZPadding);
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.colors) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("colors", array);
		}
		if (this.edgeColor != null) {
			params.put("edgeColor", this.edgeColor.getData());
		}
		if (this.centerInCategory != null) {
			params.put("centerInCategory", this.centerInCategory);
		}
		if (this.maxPointWidth != null) {
			params.put("maxPointWidth", this.maxPointWidth);
		}
		if (this.pointWidth != null) {
			params.put("pointWidth", this.pointWidth);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		return params;
	}

}