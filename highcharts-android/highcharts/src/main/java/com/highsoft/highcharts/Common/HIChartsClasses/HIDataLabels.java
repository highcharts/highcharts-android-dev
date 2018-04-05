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
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



public class HIDataLabels implements HIChartsJSONSerializable { 

	public Boolean defer;
	public Boolean inside;
	public HIFunction formatter;
	public Boolean enabled;
	public String verticalAlign;
	public Boolean crop;
	public Number padding;
	public Boolean overflow;

/**
The x position of the data label relative to the data point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/">Data labels inside the bar</a> <br><br><b>default:</b><br><br>&ensp;5*/
	public Number x;

/**
Alignment of the data label relative to the data point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bar-datalabels-align-inside-bar/">Data labels inside the bar</a> <br><br><b>default:</b><br><br>&ensp;left*/
	public String align;

/**
Y offset of the higher data labels relative to the point value.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a> <br><br><b>default:</b><br><br>&ensp;-6*/
	public Object /* Number|String */ yHigh;

/**
X offset of the higher data labels relative to the point value.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>*/
	public Number xHigh;

/**
X offset of the lower data labels relative to the point value.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a>*/
	public Number xLow;

/**
Y offset of the lower data labels relative to the point value.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/">Data labels on range series</a> <br><br><b>default:</b><br><br>&ensp;16*/
	public Object /* Number|String */ yLow;

/**
The border radius in pixels for the data label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderRadius;

/**
The name of a symbol to use for the border around the label. Symbols
are predefined functions on the Renderer object.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/">A callout for annotations</a> <br><br><b>default:</b><br><br>&ensp;square*/
	public String shape;

/**
The border color for the data label. Defaults to undefined.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public HIColor borderColor;

/**
A declarative filter for which data labels to display. The
declarative filter is designed for use when callback functions are
not available, like when the chart options require a pure JSON
structure or for use with graphical editors. For programmatic
control, use the formatter instead, and return false to disable
a single data label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome">Data labels filtered by percentage</a>*/
	public HIFilter filter;

/**
Styles for the label. The default color setting is "contrast",
which is a pseudo color that Highcharts picks up and applies the
maximum contrast to the underlying point item, for example the
bar in a bar chart.

The textOutline is a pseudo property that
applies an outline of the given width with the given color, which
by default is the maximum contrast to the text. So a bright text
color will result in a black text outline for maximum readability
on a mixed background. In some cases, especially with grayscale
text, the text outline doesn't work well, in which cases it can
be disabled by setting it to "none". When useHTML is true, the
textOutline will not be picked up. In this, case, the same effect
can be acheived through the text-shadow CSS property.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-style/">Bold labels</a> <br><br><b>default:</b><br><br>&ensp;{"color": "contrast", "fontSize": "11px", "fontWeight": "bold", "textOutline": "1px contrast" }*/
	public HIStyle style;

/**
Text rotation in degrees. Note that due to a more complex structure,
backgrounds, borders and padding will be lost on a rotated data
label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical labels</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number rotation;

/**
Whether to
[use HTML](http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
to render the labels.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean useHTML;

/**
The text color for the data labels. Defaults to null. For certain
series types, like column or map, the data labels can be drawn inside
the points. In this case the data label will be drawn with maximum
contrast by default. Additionally, it will be given a text-outline
style with the opposite color, to further increase the contrast. This
can be overridden by setting the text-outline style to none in
the dataLabels.style option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-color/">Red data labels</a>*/
	public HIColor color;

/**
The background color or gradient for the data label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a>*/
	public HIColor backgroundColor;

/**
Whether to allow data labels to overlap. To make the labels less
sensitive for overlapping, the [dataLabels.padding](#plotOptions.
series.dataLabels.padding) can be set to 0.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/">Don't allow overlap</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean allowOverlap;

/**
A [format string](http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting)
for the data label. Available variables are the same as for
formatter.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/">Add a unit</a> <br><br><b>default:</b><br><br>&ensp;{y}*/
	public String format;

/**
The shadow of the box. Works best with borderWidth or
backgroundColor. Since 2.3 the shadow can be an object
configuration containing color, offsetX, offsetY, opacity and
width.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Object /* Boolean|Object */ shadow;

/**
The Z index of the data labels. The default Z index puts it above
the series. Use a Z index of 2 to display it behind the series.
 <br><br><b>default:</b><br><br>&ensp;6*/
	public Number zIndex;

/**
A class name for the data label. Particularly in styled mode, this
can be used to give each series' or point's data label unique
styling. In addition to this option, a default color class name is
added so that we can give the labels a
[contrast text shadow](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/">Styling by CSS</a>*/
	public String className;

/**
The border width in pixels for the data label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/">Data labels box options</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderWidth;

/**
Decides how the data label will be rotated according to the perimeter
of the sunburst. It can either be parallel or perpendicular to the
perimeter.
series.rotation takes precedence over rotationMode.
 <br><br><b>accepted values:</b><br><br>&ensp;["perpendicular", "parallel"]*/
	public String rotationMode;

/**
The y position offset of the label relative to the point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/">Vertical and positioned</a> <br><br><b>default:</b><br><br>&ensp;-6*/
	public Number y;

/**
Callback to format data labels for _nodes_ in the sankey diagram. 
The nodeFormat option takes precedence over the nodeFormatter.
*/
	public HIFunction nodeFormatter;

/**
The [format string](http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting) specifying what to show for _nodes_ in the 
sankey diagram. By default the nodeFormatter returns
{point.name}.
*/
	public String nodeFormat;

/**
The color of the line connecting the data label to the pie slice.
The default color is the same as the point's color.

In styled mode, the connector stroke is given in the
.highcharts-data-label-connector class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorcolor/">Blue connectors</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled connectors</a> <br><br><b>default:</b><br><br>&ensp;{point.color}*/
	public String connectorColor;

/**
The distance of the data label from the pie's edge. Negative numbers
put the data label on top of the pie slices. Connectors are only
shown for data labels outside the pie.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-distance/">Data labels on top of the pie</a> <br><br><b>default:</b><br><br>&ensp;30*/
	public Number distance;

/**
The width of the line connecting the data label to the pie slice.


In styled mode, the connector stroke width is given in the
.highcharts-data-label-connector class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorwidth-disabled/">Disable the connector</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/">Styled connectors</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number connectorWidth;

/**
Whether to render the connector as a soft arc or a line with sharp
break.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-true/">Soft</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-false/">Non soft</a>*/
	public Number softConnector;

/**
The distance from the data label to the connector.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorpadding/">No padding</a> <br><br><b>default:</b><br><br>&ensp;5*/
	public Number connectorPadding;


	public HIDataLabels() {

	}

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
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor);
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
		return params;
	}

}