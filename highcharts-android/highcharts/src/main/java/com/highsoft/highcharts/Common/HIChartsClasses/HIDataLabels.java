/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;





public class HIDataLabels extends Observable implements HIChartsJSONSerializable { 

	private Boolean defer;
	public void setDefer(Boolean defer) {
		this.defer = defer;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDefer(){ return defer; }

	private Boolean inside;
	public void setInside(Boolean inside) {
		this.inside = inside;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInside(){ return inside; }

	private HIFunction formatter;
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Boolean enabled;
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String verticalAlign;
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private Boolean crop;
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private Number padding;
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private Boolean overflow;
	public void setOverflow(Boolean overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOverflow(){ return overflow; }

	private Number x;
/**
/** The x position of the data label relative to the data point. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/">Data labels inside the bar</a>
 <br><br><b>defaults:</b><br><br>&ensp;5*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private String align;
/**
/** Alignment of the data label relative to the data point. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/">Data labels inside the bar</a>
 <br><br><b>defaults:</b><br><br>&ensp;left*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Number y;
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Object /* Number, String */ yHigh;
/**
/** Y offset of the higher data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
 <br><br><b>defaults:</b><br><br>&ensp;-6*/
	public void setYHigh(Object /* Number, String */ yHigh) {
		this.yHigh = yHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getYHigh(){ return yHigh; }

	private Number xHigh;
/**
/** X offset of the higher data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
*/
	public void setXHigh(Number xHigh) {
		this.xHigh = xHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXHigh(){ return xHigh; }

	private Number xLow;
/**
/** X offset of the lower data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
*/
	public void setXLow(Number xLow) {
		this.xLow = xLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getXLow(){ return xLow; }

	private Object /* Number, String */ yLow;
/**
/** Y offset of the lower data labels relative to the point value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>
 <br><br><b>defaults:</b><br><br>&ensp;16*/
	public void setYLow(Object /* Number, String */ yLow) {
		this.yLow = yLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getYLow(){ return yLow; }

	private Number borderRadius;
/**
/** The border radius in pixels for the data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private String shape;
/**
/** The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/">A callout for annotations</a>
 <br><br><b>defaults:</b><br><br>&ensp;square*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private HIColor borderColor;
/**
/** The border color for the data label. Defaults to undefined. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIFilter filter;
/**
/** A declarative filter for which data labels to display. The declarative filter is designed for use when callback functions are not available, like when the chart options require a pure JSON structure or for use with graphical editors. For programmatic control, use the formatter instead, and return undefined to disable a single data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome">Data labels filtered by percentage</a>
*/
	public void setFilter(HIFilter filter) {
		this.filter = filter;
		this.filter.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFilter getFilter(){ return filter; }

	private HICSSObject style;
/**
/** Styles for the label. The defaults color setting is "contrast", which is a pseudo color that Highcharts picks up and applies the maximum contrast to the underlying point item, for example the bar in a bar chart. The textOutline is a pseudo property that applies an outline of the given width with the given color, which by defaults is the maximum contrast to the text. So a bright text color will result in a black text outline for maximum readability on a mixed background. In some cases, especially with grayscale text, the text outline doesn't work well, in which cases it can be disabled by setting it to "none". When useHTML is true, the textOutline will not be picked up. In this, case, the same effect can be acheived through the text-shadow CSS property. For some series types, where each point has an extent, like for example tree maps, the data label may overflow the point. There are two strategies for handling overflow. By defaults, the text will wrap to multiple lines. The other strategy is to set style.textOverflow to ellipsis, which will keep the text on one line plus it will break inside long words. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-style/">Bold labels</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "contrast", "fontSize": "11px", "fontWeight": "bold", "textOutline": "1px contrast" }*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Number rotation;
/**
/** Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical labels</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Boolean useHTML;
/**
/** Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the labels. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private HIColor color;
/**
/** The text color for the data labels. Defaults to undefined. For certain series types, like column or map, the data labels can be drawn inside the points. In this case the data label will be drawn with maximum contrast by defaults. Additionally, it will be given a text-outline style with the opposite color, to further increase the contrast. This can be overridden by setting the text-outline style to none in the dataLabels.style option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-color/">Red data labels</a>
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HIColor backgroundColor;
/**
/** The background color or gradient for the data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Boolean allowOverlap;
/**
/** Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the `dataLabels.padding` can be set to 0. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/">Don't allow overlap</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private String format;
/**
/** A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) for the data label. Available variables are the same as for formatter. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Add a unit</a>
 <br><br><b>defaults:</b><br><br>&ensp;{y}*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Object /* boolean, Object */ shadow;
/**
/** The shadow of the box. Works best with borderWidth or backgroundColor. Since 2.3 the shadow can be an object configuration containing color, offsetX, offsetY, opacity and width. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setShadow(Object /* boolean, Object */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* boolean, Object */ getShadow(){ return shadow; }

	private Number zIndex;
/**
/** The Z index of the data labels. The defaults Z index puts it above the series. Use a Z index of 2 to display it behind the series. 
 <br><br><b>defaults:</b><br><br>&ensp;6*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String className;
/**
/** A class name for the data label. Particularly in styled mode, this can be used to give each series' or point's data label unique styling. In addition to this option, a defaults color class name is added so that we can give the labels a [contrast text shadow](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">Styling by CSS</a>
*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number borderWidth;
/**
/** The border width in pixels for the data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String rotationMode;
/**
/** Decides how the data label will be rotated relative to the perimeter of the sunburst. Valid values are auto, parallel and perpendicular. When auto, the best fit will be computed for the point. The series.rotation option takes precedence over rotationMode. <br><br><b>accepted values:</b><br><br>&ensp;["auto", "perpendicular", "parallel"]
*/
	public void setRotationMode(String rotationMode) {
		this.rotationMode = rotationMode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRotationMode(){ return rotationMode; }

	private HIFunction nodeFormatter;
/**
/** Callback to format data labels for _nodes_ in the sankey diagram. The nodeFormat option takes precedence over the nodeFormatter. 
*/
	public void setNodeFormatter(HIFunction nodeFormatter) {
		this.nodeFormatter = nodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNodeFormatter(){ return nodeFormatter; }

	private String nodeFormat;
/**
/** The [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) specifying what to show for _nodes_ in the sankey diagram. By defaults the nodeFormatter returns {point.name}. 
*/
	public void setNodeFormat(String nodeFormat) {
		this.nodeFormat = nodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNodeFormat(){ return nodeFormat; }

	private Number distance;
/**
/** The distance of the data label from the pie's edge. Negative numbers put the data label on top of the pie slices. Connectors are only shown for data labels outside the pie. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-distance/">Data labels on top of the pie</a>
*/
	public void setDistance(Number distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDistance(){ return distance; }

	private Number connectorWidth;
/**
/** The width of the line connecting the data label to the pie slice. In styled mode, the connector stroke width is given in the .highcharts-data-label-connector class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorwidth-disabled/">Disable the connector</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled connectors</a>
 <br><br><b>defaults:</b><br><br>&ensp;1*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private Number softConnector;
/**
/** Whether to render the connector as a soft arc or a line with sharp break. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-true/">Soft</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-false/">Non soft</a>
*/
	public void setSoftConnector(Number softConnector) {
		this.softConnector = softConnector;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSoftConnector(){ return softConnector; }

	private Number connectorPadding;
/**
/** The distance from the data label to the connector. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorpadding/">No padding</a>
 <br><br><b>defaults:</b><br><br>&ensp;5*/
	public void setConnectorPadding(Number connectorPadding) {
		this.connectorPadding = connectorPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorPadding(){ return connectorPadding; }

	private HIColor connectorColor;
/**
/** The color of the line connecting the data label to the pie slice. The defaults color is the same as the point's color. In styled mode, the connector stroke is given in the .highcharts-data-label-connector class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorcolor/">Blue connectors</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled connectors</a>
*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }



	public HIDataLabels() {

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
		if (this.defer != null) {
			params.put("defer", this.defer);
		}
		if (this.inside != null) {
			params.put("inside", this.inside);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.y != null) {
			params.put("y", this.y);
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
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.filter != null) {
			params.put("filter", this.filter.getParams());
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.rotationMode != null) {
			params.put("rotationMode", this.rotationMode);
		}
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.softConnector != null) {
			params.put("softConnector", this.softConnector);
		}
		if (this.connectorPadding != null) {
			params.put("connectorPadding", this.connectorPadding);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor.getData());
		}
		return params;
	}

}