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



public class HILegend implements HIChartsJSONSerializable { 


/**
The border radius of the symbol for series types that use a rectangle
in the legend. Defaults to half the symbolHeight.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/ : Round symbols
*/
	public Number symbolRadius;

/**
The border corner radius of the legend.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-default/ : Square by default
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-round/ : 5px rounded
* default: 0
*/
	public Number borderRadius;

/**
Whether to show the symbol on the right side of the text rather than
the left side. This is common in Arabic and Hebraic.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/rtl/ : Symbol to the right
* default: false
*/
	public Boolean rtl;

/**
When this is true, the legend symbol width will be the same as
the symbol height, which in turn defaults to the font size of the
legend items.
* default: true
*/
	public Boolean squareSymbol;

/**
The width for each legend item. This is useful in a horizontal layout
with many items when you want the items to align vertically. .
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-default/ : Null by default
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-80/ : 80 for aligned legend items
* default: null
*/
	public Number itemWidth;

/**
The pixel padding between the legend item symbol and the legend
item text.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolpadding/ : Greater symbol width and padding
* default: 5
*/
	public Number symbolPadding;

/**
When the legend is floating, the plot area ignores it and is allowed
to be placed below it.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-false/ : False by default
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-true/ : True
* default: false
*/
	public Boolean floating;

/**
The pixel width of the legend item symbol. When the squareSymbol
option is set, this defaults to the symbolHeight, otherwise 16.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolwidth/ : Greater symbol width and padding
*/
	public Number symbolWidth;

/**
Whether to [use HTML](http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html) to render the legend item texts. Prior
to 4.1.7, when using HTML, legend.navigation
was disabled.
* default: false
*/
	public Boolean useHTML;

/**
The color of the drawn border around the legend.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/bordercolor/ : Brown border
* default: #999999
*/
	public HIColor borderColor;

/**
The layout of the legend items. Can be one of "horizontal" or "vertical".
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/ : Horizontal by default
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-vertical/ : Vertical
* accepted values: ["horizontal", "vertical"]
* default: horizontal
*/
	public String layout;

/**
A title to be added on top of the legend.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/title/ : Legend title
*/
	public HITitle title;

/**
The width of the legend box.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/ : Aligned to the plot area
* default: null
*/
	public Number width;

/**
The pixel bottom margin for each legend item.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/ : Padding and item margins demonstrated
* default: 0
*/
	public Number itemMarginBottom;

/**
The background color of the legend.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/backgroundcolor/ : Yellowish background
*/
	public HIColor backgroundColor;

/**
Line height for the legend items. Deprecated as of 2.1\. Instead,
the line height for each item can be set using itemStyle.lineHeight,
and the padding between items using itemMarginTop and itemMarginBottom.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/lineheight/ : Setting padding
* default: 16
*/
	public Number lineHeight;

/**
The pixel top margin for each legend item.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/ : Padding and item margins demonstrated
* default: 0
*/
	public Number itemMarginTop;

/**
Default styling for the checkbox next to a legend item when
showCheckbox is true.
*/
	public HIItemCheckboxStyle itemCheckboxStyle;

/**
A [format string](http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting) for each legend label. Available variables
relates to properties on the series, or the point in case of pies.
* default: {name}
*/
	public String labelFormat;

/**
CSS styles for each legend item. Only a subset of CSS is supported,
notably those options related to text. The default textOverflow
property makes long texts truncate. Set it to null to wrap text
instead. A width property can be added to control the text width.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemstyle/ : Bold black text
* default: { "color": "#333333", "cursor": "pointer", "fontSize": "12px", "fontWeight": "bold", "textOverflow": "ellipsis" }
*/
	public HIItemStyle itemStyle;

/**
Whether to reverse the order of the legend items compared to the
order of the series or points as defined in the configuration object.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/reversed/ : Stacked bar with reversed legend
* default: false
*/
	public Boolean reversed;

/**
The inner padding of the legend box.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/ : Padding and item margins demonstrated
* default: 8
*/
	public Number padding;

/**
In a legend with horizontal layout, the itemDistance defines the
pixel distance between each item.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/ : 50px item distance
* default: 20
*/
	public Number itemDistance;

/**
Whether to apply a drop shadow to the legend. A backgroundColor
also needs to be applied for this to take effect. The shadow can be
an object configuration containing color, offsetX, offsetY,
opacity and width.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/shadow/ : White background and drop shadow
* default: false
*/
	public Object /* Boolean|Object */ shadow;

/**
CSS styles for each legend item in hover mode. Only a subset of
CSS is supported, notably those options related to text. Properties
are inherited from style unless overridden here.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhoverstyle/ : Red on hover
* default: { "color": "#000000" }
*/
	public HIItemHoverStyle itemHoverStyle;

/**
The vertical alignment of the legend box. Can be one of top,
middle or bottom. Vertical position can be further determined
by the y option.

In the case that the legend is aligned in a corner position, the
layout option will determine whether to place it above/below
or on the side of the plot area.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/ : Legend 100px from the top of the chart
* accepted values: ["top", "middle", "bottom"]
* default: bottom
*/
	public String verticalAlign;

/**
If the plot area sized is calculated automatically and the legend
is not floating, the legend margin is the space between the legend
and the axis labels or plot area.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-default/ : 12 pixels by default
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-30/ : 30 pixels
* default: 12
*/
	public Number margin;

/**
The horizontal alignment of the legend box within the chart area.
Valid values are left, center and right.

In the case that the legend is aligned in a corner position, the
layout option will determine whether to place it above/below
or on the side of the plot area.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/align/ : Legend at the right of the chart
* accepted values: ["left", "center", "right"]
*/
	public String align;

/**
Keyboard navigation for the legend. Requires the Accessibility module.
*/
	public HIKeyboardNavigation keyboardNavigation;

/**
Enable or disable the legend.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/enabled-false/ : Legend disabled
*/
	public Boolean enabled;

/**
Maximum pixel height for the legend. When the maximum height is extended,
 navigation will show.
* default: undefined
*/
	public Number maxHeight;

/**
CSS styles for each legend item when the corresponding series or
point is hidden. Only a subset of CSS is supported, notably those
options related to text. Properties are inherited from style
unless overridden here.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhiddenstyle/ : Darker gray color
* default: { "color": "#cccccc" }
*/
	public HIItemHiddenStyle itemHiddenStyle;

/**
The pixel height of the symbol for series types that use a rectangle
in the legend. Defaults to the font size of legend items.
*/
	public Number symbolHeight;

/**
The width of the drawn border around the legend.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderwidth/ : 2px border width
* default: 0
*/
	public Number borderWidth;

/**
Callback function to format each of the series' labels. The this
keyword refers to the series object, or the point object in case
of pie charts. By default the series or point name is printed.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/labelformatter/ : Add text
*/
	public HIFunction labelFormatter;

/**
The vertical offset of the legend relative to it's vertical alignment
verticalAlign within chart.spacingTop and chart.spacingBottom.
 Negative y moves it up, positive y moves it down.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/ : Legend 100px from the top of the chart
* default: 0
*/
	public Number y;

/**
The x offset of the legend relative to its horizontal alignment
align within chart.spacingLeft and chart.spacingRight. Negative
x moves it to the left, positive x moves it to the right.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/ : Aligned to the plot area
* default: 0
*/
	public Number x;

/**
Options for the paging or navigation appearing when the legend
is overflown. Navigation works well on screen, but not in static
exported images. One way of working around that is to [increase
the chart height in export](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-
enabled-false/).
*/
	public HINavigation navigation;


	public HILegend() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.symbolRadius != null) {
			params.put("symbolRadius", this.symbolRadius);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.rtl != null) {
			params.put("rtl", this.rtl);
		}
		if (this.squareSymbol != null) {
			params.put("squareSymbol", this.squareSymbol);
		}
		if (this.itemWidth != null) {
			params.put("itemWidth", this.itemWidth);
		}
		if (this.symbolPadding != null) {
			params.put("symbolPadding", this.symbolPadding);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.symbolWidth != null) {
			params.put("symbolWidth", this.symbolWidth);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.layout != null) {
			params.put("layout", this.layout);
		}
		if (this.title != null) {
			params.put("title", this.title.getParams());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.itemMarginBottom != null) {
			params.put("itemMarginBottom", this.itemMarginBottom);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.lineHeight != null) {
			params.put("lineHeight", this.lineHeight);
		}
		if (this.itemMarginTop != null) {
			params.put("itemMarginTop", this.itemMarginTop);
		}
		if (this.itemCheckboxStyle != null) {
			params.put("itemCheckboxStyle", this.itemCheckboxStyle.getParams());
		}
		if (this.labelFormat != null) {
			params.put("labelFormat", this.labelFormat);
		}
		if (this.itemStyle != null) {
			params.put("itemStyle", this.itemStyle.getParams());
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.itemDistance != null) {
			params.put("itemDistance", this.itemDistance);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.itemHoverStyle != null) {
			params.put("itemHoverStyle", this.itemHoverStyle.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.keyboardNavigation != null) {
			params.put("keyboardNavigation", this.keyboardNavigation.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.maxHeight != null) {
			params.put("maxHeight", this.maxHeight);
		}
		if (this.itemHiddenStyle != null) {
			params.put("itemHiddenStyle", this.itemHiddenStyle.getParams());
		}
		if (this.symbolHeight != null) {
			params.put("symbolHeight", this.symbolHeight);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.labelFormatter != null) {
			params.put("labelFormatter", this.labelFormatter);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.navigation != null) {
			params.put("navigation", this.navigation.getParams());
		}
		return params;
	}

}