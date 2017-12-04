/**
* (c) 2009-2017 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/


package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIGFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;


/**
* description: Options for the data labels appearing on top of the nodes and links. For
sankey charts, data labels are visible for the nodes by default, but 
hidden for links. This is controlled by modifying the nodeFormat, and
the format that applies to links and is an empty string by default.
*/
public class HIDataLabels implements HIChartsJSONSerializable { 


/**
* description: When either the borderWidth or the backgroundColor is set,
this is the padding within the box.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/ : Data labels box options
* default: 5
*/
	public Number padding;

/**
* description: The background color or gradient for the data label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/ : Data labels box options
*/
	public HIColor backgroundColor;

/**
* description: Enable or disable the data labels.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-enabled/ : Data labels enabled
* default: True
*/
	public Boolean enabled;

/**
* description: The border color for the data label. Defaults to undefined.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/ : Data labels box options
* default: undefined
*/
	public HIColor borderColor;

/**
* description: How to handle data labels that flow outside the plot area. The default
is justify, which aligns them inside the plot area. For columns
and bars, this means it will be moved inside the bar. To display
data labels outside the plot area, set crop to false and overflow
to "none".

* accepted values: ["justify", "none"]
* default: justify
*/
	public String overflow;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html : use HTML to render the labels.
* default: false
*/
	public Boolean useHTML;

/**
* description: The Z index of the data labels. The default Z index puts it above
the series. Use a Z index of 2 to display it behind the series.
* default: 6
*/
	public Number zIndex;

/**
* description: The border radius in pixels for the data label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/ : Data labels box options
* default: 0
*/
	public Number borderRadius;

/**
* description: A class name for the data label. Particularly in styled mode, this can
be used to give each series' or point's data label unique styling.
In addition to this option, a default color class name is added
so that we can give the labels a http://jsfiddle.
net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-
label-contrast/ : contrast text shadow.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels/ : Styling by CSS

*/
	public String className;

/**
* description: The text color for the data labels. Defaults to null. For certain series
types, like column or map, the data labels can be drawn inside the points.
In this case the data label will be drawn with maximum contrast by default.
Additionally, it will be given a text-outline style with the opposite
color, to further increase the contrast. This can be overridden by setting
the text-outline style to none in the dataLabels.style option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-color/ : Red data labels
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/color-axis/ : White data labels
*/
	public HIColor color;

/**
* description: The name of a symbol to use for the border around the label. Symbols
are predefined functions on the Renderer object.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/ : A callout for annotations
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-shape/ : A callout for annotations (Highcharts demo)
* default: square
*/
	public String shape;

/**
* description: Whether to allow data labels to overlap. To make the labels less
sensitive for overlapping, the dataLabels.padding can be set to 0.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-allowoverlap-false/ : Don't allow overlap

* default: false
*/
	public Boolean allowOverlap;

/**
* description: Styles for the label. The default color setting is "contrast",
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

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-style/ : Bold labels
* default: {"color": "contrast", "fontSize": "11px", "fontWeight": "bold", "textOutline": "1px contrast" }
*/
	public HIStyle style;

/**
* description: The alignment of the data label compared to the point. If right,
the right side of the label should be touching the point. For
points with an extent, like columns, the alignments also dictates
how to align it inside the box, as given with the inside option. Can be one of "left", "center"
or "right".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-align-left/ : Left aligned
* accepted values: ["left", "center", "right"]
* default: center
*/
	public String align;

/**
* description: The y position offset of the label relative to the point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/ : Vertical and positioned
* default: -6
*/
	public Number y;

/**
* description: The shadow of the box. Works best with borderWidth or backgroundColor.
Since 2.3 the shadow can be an object configuration containing color,
 offsetX, offsetY, opacity and width.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/ : Data labels box options
* default: false
*/
	public Object /* Boolean, Object */ shadow;

/**
* description: Callback JavaScript function to format the data label. Note that
if a format is defined, the format takes precedence and the formatter
is ignored. Available data are:



this.percentage
Stacked series and pies only. The point's percentage of the
total.


this.point
The point object. The point name, if defined, is available
through this.point.name.


this.series:
The series object. The series name is available through this.
series.name.


this.total
Stacked series only. The total value at this point's x value.



this.x:
The x value.


this.y:
The y value.



* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-format/ : Formatted value
*/
	public HIGFunction /* Function */ formatter;

/**
* description: The border width in pixels for the data label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-box/ : Data labels box options
* default: 0
*/
	public Number borderWidth;

/**
* description: The vertical alignment of a data label. Can be one of top, middle
or bottom. The default value depends on the data, for instance
in a column chart, the label is above positive values and below
negative values.

* accepted values: ["top", "middle", "bottom"]
* default: middle
*/
	public String verticalAlign;

/**
* description: For points with an extent, like columns or map areas, whether to align the data
label inside the box or to the actual value point. Defaults to false
in most cases, true in stacked columns.
* default: True
*/
	public Boolean inside;

/**
* description: The x position offset of the label relative to the point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/ : Vertical and positioned
* default: 0
*/
	public Number x;

/**
* description: Text rotation in degrees. Note that due to a more complex structure,
backgrounds, borders and padding will be lost on a rotated data
label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-rotation/ : Vertical labels
* default: 0
*/
	public Number rotation;

/**
* description: A http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting : format string for the data label. Available variables are
the same as for formatter.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-datalabels-format/ : Add a unit
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-datalabels-format/ : Formatted value in the data label
*/
	public String format;

/**
* description: Whether to defer displaying the data labels until the initial series
animation has finished.
*/
	public Boolean defer;

/**
* description: Whether to hide data labels that are outside the plot area. By default,
the data label is moved inside the plot area according to the overflow option.
* default: true
*/
	public Boolean crop;

/**
* description: Decides how the data label will be rotated according to the perimeter
of the sunburst. It can either be parallel or perpendicular to the
perimeter.
series.rotation takes precedence over rotationMode.

* accepted values: ["perpendicular", "parallel"]
* default: perpendicular
*/
	public String rotationMode;

/**
* description: The distance from the data label to the connector.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorpadding/ : No padding
* default: 5
*/
	public Number connectorPadding;

/**
* description: The color of the line connecting the data label to the pie slice.
The default color is the same as the point's color.
In styled mode, the connector stroke is given in the
.highcharts-data-label-connector class.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorcolor/ : Blue connectors
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/ : Styled connectors
* default: {point.color}
*/
	public String connectorColor;

/**
* description: The distance of the data label from the pie's edge. Negative numbers
put the data label on top of the pie slices. Connectors are only
shown for data labels outside the pie.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-distance/ : Data labels on top of the pie
* default: 30
*/
	public Number distance;

/**
* description: The width of the line connecting the data label to the pie slice.
In styled mode, the connector stroke width is given in the
.highcharts-data-label-connector class.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-connectorwidth-disabled/ : Disable the connector
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/pie-point/ : Styled connectors
* default: 1
*/
	public Number connectorWidth;

/**
* description: Whether to render the connector as a soft arc or a line with sharp
break.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-true/ : Soft
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-datalabels-softconnector-false/ : Non soft
*/
	public Boolean softConnector;

/**
* description: X offset of the higher data labels relative to the point value.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/ : Data labels on range series
* default: 0
*/
	public Number xHigh;

/**
* description: Y offset of the higher data labels relative to the point value.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/ : Data labels on range series
* default: -6
*/
	public Number yHigh;

/**
* description: X offset of the lower data labels relative to the point value.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/ : Data labels on range series
* default: 0
*/
	public Number xLow;

/**
* description: Y offset of the lower data labels relative to the point value.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/arearange-datalabels/ : Data labels on range series
* default: 16
*/
	public Number yLow;

/**
* description: The http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting : format string specifying what to show for nodes in the 
sankey diagram.
* default: {point.name}
*/
	public String nodeFormat;


	public HIDataLabels() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.inside != null) {
			params.put("inside", this.inside);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.defer != null) {
			params.put("defer", this.defer);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.rotationMode != null) {
			params.put("rotationMode", this.rotationMode);
		}
		if (this.connectorPadding != null) {
			params.put("connectorPadding", this.connectorPadding);
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
		if (this.xHigh != null) {
			params.put("xHigh", this.xHigh);
		}
		if (this.yHigh != null) {
			params.put("yHigh", this.yHigh);
		}
		if (this.xLow != null) {
			params.put("xLow", this.xLow);
		}
		if (this.yLow != null) {
			params.put("yLow", this.yLow);
		}
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		return params;
	}

}