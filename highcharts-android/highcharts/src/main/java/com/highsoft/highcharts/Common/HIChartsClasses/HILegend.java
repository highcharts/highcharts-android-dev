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
* description: The legend is a box containing a symbol and name for each series
item or point item in the chart. Each series (or points in case
of pie charts) is represented by a symbol and its name in the legend.
It is possible to override the symbol creator function and
create http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/studies/legend-
custom-symbol/ : custom legend symbols.
*/
public class HILegend implements HIChartsJSONSerializable { 


/**
* description: Maximum pixel height for the legend. When the maximum height is extended,
 navigation will show.
* default: undefined
*/
	public Number maxHeight;

/**
* description: Options for the paging or navigation appearing when the legend
is overflown. Navigation works well on screen, but not in static
exported images. One way of working around that is to http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-
enabled-false/ : increase
the chart height in export.
*/
	public HINavigation navigation;

/**
* description: The vertical offset of the legend relative to it's vertical alignment
verticalAlign within chart.spacingTop and chart.spacingBottom.
 Negative y moves it up, positive y moves it down.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/ : Legend 100px from the top of the chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/ : Legend alignment
* default: 0
*/
	public Number y;

/**
* description: The x offset of the legend relative to its horizontal alignment
align within chart.spacingLeft and chart.spacingRight. Negative
x moves it to the left, positive x moves it to the right.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/ : Aligned to the plot area
* default: 0
*/
	public Number x;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html : use HTML to render the legend item texts. Prior
to 4.1.7, when using HTML, legend.navigation
was disabled.
* default: false
*/
	public Boolean useHTML;

/**
* description: The pixel bottom margin for each legend item.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/ : Padding and item margins demonstrated
* default: 0
*/
	public Number itemMarginBottom;

/**
* description: Whether to reverse the order of the legend items compared to the
order of the series or points as defined in the configuration object.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/reversed/ : Stacked bar with reversed legend
* default: false
*/
	public Boolean reversed;

/**
* description: Default styling for the checkbox next to a legend item when
showCheckbox is true.
*/
	public HIItemCheckboxStyle itemCheckboxStyle;

/**
* description: The background color of the legend.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/backgroundcolor/ : Yellowish background
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/ : Border and background options
*/
	public HIColor backgroundColor;

/**
* description: Keyboard navigation for the legend. Requires the Accessibility module.
*/
	public HIKeyboardNavigation keyboardNavigation;

/**
* description: In a legend with horizontal layout, the itemDistance defines the
pixel distance between each item.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/ : 50px item distance
*/
	public Number itemDistance;

/**
* description: The width for each legend item. This is useful in a horizontal layout
with many items when you want the items to align vertically. .

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-default/ : Null by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-80/ : 80 for aligned legend items
* default: null
*/
	public Number itemWidth;

/**
* description: A http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting : format string for each legend label. Available variables
relates to properties on the series, or the point in case of pies.
* default: {name}
*/
	public String labelFormat;

/**
* description: A title to be added on top of the legend.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/title/ : Legend title
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/ : Legend with title
*/
	public HITitle title;

/**
* description: CSS styles for each legend item. Only a subset of CSS is supported,
notably those options related to text. The default textOverflow
property makes long texts truncate. Set it to null to wrap text
instead. A width property can be added to control the text width.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemstyle/ : Bold black text
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/itemstyle/ : Item text styles
* default: { "color": "#333333", "cursor": "pointer", "fontSize": "12px", "fontWeight": "bold", "textOverflow": "ellipsis" }
*/
	public HIItemStyle itemStyle;

/**
* description: The layout of the legend items. Can be one of "horizontal" or "vertical".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/ : Horizontal by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-vertical/ : Vertical
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/ : Vertical with data classes
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical/ : Vertical with color axis gradient
* accepted values: ["horizontal", "vertical"]
* default: horizontal
*/
	public String layout;

/**
* description: The pixel padding between the legend item symbol and the legend
item text.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolpadding/ : Greater symbol width and padding
* default: 5
*/
	public Number symbolPadding;

/**
* description: CSS styles for each legend item in hover mode. Only a subset of
CSS is supported, notably those options related to text. Properties
are inherited from style unless overridden here.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhoverstyle/ : Red on hover
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/itemstyle/ : Item text styles
* default: { "color": "#000000" }
*/
	public HIItemHoverStyle itemHoverStyle;

/**
* description: The width of the drawn border around the legend.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderwidth/ : 2px border width
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/ : Border and background options
* default: 0
*/
	public Number borderWidth;

/**
* description: Callback function to format each of the series' labels. The this
keyword refers to the series object, or the point object in case
of pie charts. By default the series or point name is printed.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/labelformatter/ : Add text
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/labelformatter/ : Data classes with label formatter
*/
	public HIGFunction /* Function */ labelFormatter;

/**
* description: Whether to apply a drop shadow to the legend. A backgroundColor
also needs to be applied for this to take effect. The shadow can be
an object configuration containing color, offsetX, offsetY,
opacity and width.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/shadow/ : White background and drop shadow
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/ : Border and background options
* default: false
*/
	public Object /* Boolean, Object */ shadow;

/**
* description: When the legend is floating, the plot area ignores it and is allowed
to be placed below it.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-false/ : False by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-true/ : True
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/ : Floating legend
* default: false
*/
	public Boolean floating;

/**
* description: When this is true, the legend symbol width will be the same as
the symbol height, which in turn defaults to the font size of the
legend items.
* default: true
*/
	public Boolean squareSymbol;

/**
* description: CSS styles for each legend item when the corresponding series or
point is hidden. Only a subset of CSS is supported, notably those
options related to text. Properties are inherited from style
unless overridden here.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhiddenstyle/ : Darker gray color
* default: { "color": "#cccccc" }
*/
	public HIItemHiddenStyle itemHiddenStyle;

/**
* description: The pixel top margin for each legend item.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/ : Padding and item margins demonstrated
* default: 0
*/
	public Number itemMarginTop;

/**
* description: The color of the drawn border around the legend.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/bordercolor/ : Brown border
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/ : Border and background options
* default: #999999
*/
	public HIColor borderColor;

/**
* description: The vertical alignment of the legend box. Can be one of top,
middle or bottom. Vertical position can be further determined
by the y option.
In the case that the legend is aligned in a corner position, the
layout option will determine whether to place it above/below
or on the side of the plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/ : Legend 100px from the top of the chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/ : Legend alignment
* accepted values: ["top", "middle", "bottom"]
* default: bottom
*/
	public String verticalAlign;

/**
* description: Whether to show the symbol on the right side of the text rather than
the left side. This is common in Arabic and Hebraic.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/rtl/ : Symbol to the right
* default: false
*/
	public Boolean rtl;

/**
* description: The border radius of the symbol for series types that use a rectangle
in the legend. Defaults to half the symbolHeight.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/ : Round symbols

*/
	public Number symbolRadius;

/**
* description: The border corner radius of the legend.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-default/ : Square by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-round/ : 5px rounded
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/border-background/ : Border and background options
* default: 0
*/
	public Number borderRadius;

/**
* description: The horizontal alignment of the legend box within the chart area.
Valid values are left, center and right.
In the case that the legend is aligned in a corner position, the
layout option will determine whether to place it above/below
or on the side of the plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/align/ : Legend at the right of the chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/alignment/ : Legend alignment
* accepted values: ["left", "center", "right"]
* default: center
*/
	public String align;

/**
* description: If the plot area sized is calculated automatically and the legend
is not floating, the legend margin is the space between the legend
and the axis labels or plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-default/ : 12 pixels by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-30/ : 30 pixels
* default: 12
*/
	public Number margin;

/**
* description: Line height for the legend items. Deprecated as of 2.1. Instead,
the line height for each item can be set using itemStyle.lineHeight,
and the padding between items using itemMarginTop and itemMarginBottom.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/lineheight/ : Setting padding
* default: 16
*/
	public Number lineHeight;

/**
* description: Enable or disable the legend.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/enabled-false/ : Legend disabled
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/legend/align/ : Various legend options
* default: True
*/
	public Boolean enabled;

/**
* description: The inner padding of the legend box.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/ : Padding and item margins demonstrated
* default: 8
*/
	public Number padding;

/**
* description: The pixel height of the symbol for series types that use a rectangle
in the legend. Defaults to the font size of legend items.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical-sized/ : Sized vertical gradient
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/ : No distance between data classes
*/
	public Number symbolHeight;

/**
* description: CSS styles for the legend area. In the 1.x versions the position
of the legend area was determined by CSS. In 2.x, the position is
determined by properties like align, verticalAlign, x and y,
 but the styles are still parsed for backwards compatibility.
*/
	public HashMap<String,String> style;

/**
* description: The width of the legend box.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/ : Aligned to the plot area
* default: null
*/
	public Number width;

/**
* description: The pixel width of the legend item symbol. When the squareSymbol
option is set, this defaults to the symbolHeight, otherwise 16.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolwidth/ : Greater symbol width and padding
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/padding-itemmargin/ : Padding and item margins demonstrated
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/legend/layout-vertical-sized/ : Sized vertical gradient
*/
	public Number symbolWidth;


	public HILegend() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.maxHeight != null) {
			params.put("maxHeight", this.maxHeight);
		}
		if (this.navigation != null) {
			params.put("navigation", this.navigation.getParams());
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.itemMarginBottom != null) {
			params.put("itemMarginBottom", this.itemMarginBottom);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.itemCheckboxStyle != null) {
			params.put("itemCheckboxStyle", this.itemCheckboxStyle.getParams());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.keyboardNavigation != null) {
			params.put("keyboardNavigation", this.keyboardNavigation.getParams());
		}
		if (this.itemDistance != null) {
			params.put("itemDistance", this.itemDistance);
		}
		if (this.itemWidth != null) {
			params.put("itemWidth", this.itemWidth);
		}
		if (this.labelFormat != null) {
			params.put("labelFormat", this.labelFormat);
		}
		if (this.title != null) {
			params.put("title", this.title.getParams());
		}
		if (this.itemStyle != null) {
			params.put("itemStyle", this.itemStyle.getParams());
		}
		if (this.layout != null) {
			params.put("layout", this.layout);
		}
		if (this.symbolPadding != null) {
			params.put("symbolPadding", this.symbolPadding);
		}
		if (this.itemHoverStyle != null) {
			params.put("itemHoverStyle", this.itemHoverStyle.getParams());
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.labelFormatter != null) {
			params.put("labelFormatter", this.labelFormatter);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.squareSymbol != null) {
			params.put("squareSymbol", this.squareSymbol);
		}
		if (this.itemHiddenStyle != null) {
			params.put("itemHiddenStyle", this.itemHiddenStyle.getParams());
		}
		if (this.itemMarginTop != null) {
			params.put("itemMarginTop", this.itemMarginTop);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.rtl != null) {
			params.put("rtl", this.rtl);
		}
		if (this.symbolRadius != null) {
			params.put("symbolRadius", this.symbolRadius);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.lineHeight != null) {
			params.put("lineHeight", this.lineHeight);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.symbolHeight != null) {
			params.put("symbolHeight", this.symbolHeight);
		}
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.symbolWidth != null) {
			params.put("symbolWidth", this.symbolWidth);
		}
		return params;
	}

}