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





public class HILegend extends Observable implements HIChartsJSONSerializable { 

	private Number symbolRadius;
/**
/** The border radius of the symbol for series types that use a rectangle in the legend. Defaults to half the symbolHeight. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolradius/">Round symbols</a>
*/
	public void setSymbolRadius(Number symbolRadius) {
		this.symbolRadius = symbolRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolRadius(){ return symbolRadius; }

	private Number borderRadius;
/**
/** The border corner radius of the legend. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-defaults/">Square by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderradius-round/">5px rounded</a>
*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Boolean rtl;
/**
/** Whether to show the symbol on the right side of the text rather than the left side. This is common in Arabic and Hebraic. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/rtl/">Symbol to the right</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setRtl(Boolean rtl) {
		this.rtl = rtl;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRtl(){ return rtl; }

	private Boolean squareSymbol;
/**
/** When this is true, the legend symbol width will be the same as the symbol height, which in turn defaultss to the font size of the legend items. 
*/
	public void setSquareSymbol(Boolean squareSymbol) {
		this.squareSymbol = squareSymbol;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSquareSymbol(){ return squareSymbol; }

	private Number itemWidth;
/**
/** The width for each legend item. By defaults the items are laid out successively. In a `horizontal layout`, if the items are laid out across two rows or more, they will be vertically aligned depending on the `legend.alignColumns` option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-defaults/">Undefined by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemwidth-80/">80 for aligned legend items</a>
*/
	public void setItemWidth(Number itemWidth) {
		this.itemWidth = itemWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemWidth(){ return itemWidth; }

	private Number symbolPadding;
/**
/** The pixel padding between the legend item symbol and the legend item text. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolpadding/">Greater symbol width and padding</a>
*/
	public void setSymbolPadding(Number symbolPadding) {
		this.symbolPadding = symbolPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolPadding(){ return symbolPadding; }

	private Boolean floating;
/**
/** When the legend is floating, the plot area ignores it and is allowed to be placed below it. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-false/">False by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/floating-true/">True</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setFloating(Boolean floating) {
		this.floating = floating;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFloating(){ return floating; }

	private Number symbolWidth;
/**
/** The pixel width of the legend item symbol. When the squareSymbol option is set, this defaultss to the symbolHeight, otherwise 16. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/symbolwidth/">Greater symbol width and padding</a>
*/
	public void setSymbolWidth(Number symbolWidth) {
		this.symbolWidth = symbolWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolWidth(){ return symbolWidth; }

	private Boolean useHTML;
/**
/** Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/ labels-and-string-formatting#html) to render the legend item texts. Prior to 4.1.7, when using HTML, `legend.navigation` was disabled. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private HIColor borderColor;
/**
/** The color of the drawn border around the legend. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/bordercolor/">Brown border</a>
*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private String layout;
/**
/** The layout of the legend items. Can be one of horizontal or vertical or proximate. When proximate, the legend items will be placed as close as possible to the graphs they're representing, except in inverted charts or when the legend position doesn't allow it. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/">Horizontal by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-vertical/">Vertical</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-proximate">Labels proximate to the data</a> <br><br><b>accepted values:</b><br><br>&ensp;["horizontal", "vertical", "proximate"]
*/
	public void setLayout(String layout) {
		this.layout = layout;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayout(){ return layout; }

	private HITitle title;
/**
/** A title to be added on top of the legend. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/title/">Legend title</a>
*/
	public void setTitle(HITitle title) {
		this.title = title;
		this.title.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITitle getTitle(){ return title; }

	private Number width;
/**
/** The width of the legend box. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/">Aligned to the plot area</a>
*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number itemMarginBottom;
/**
/** The pixel bottom margin for each legend item. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setItemMarginBottom(Number itemMarginBottom) {
		this.itemMarginBottom = itemMarginBottom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemMarginBottom(){ return itemMarginBottom; }

	private HIColor backgroundColor;
/**
/** The background color of the legend. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/backgroundcolor/">Yellowish background</a>
*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Number itemMarginTop;
/**
/** The pixel top margin for each legend item. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setItemMarginTop(Number itemMarginTop) {
		this.itemMarginTop = itemMarginTop;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemMarginTop(){ return itemMarginTop; }

	private HICSSObject itemCheckboxStyle;
/**
/** Default styling for the checkbox next to a legend item when showCheckbox is true. 
 <br><br><b>defaults:</b><br><br>&ensp;{"width": "13px", "height": "13px", "position":"absolute"}*/
	public void setItemCheckboxStyle(HICSSObject itemCheckboxStyle) {
		this.itemCheckboxStyle = itemCheckboxStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemCheckboxStyle(){ return itemCheckboxStyle; }

	private String labelFormat;
/**
/** A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) for each legend label. Available variables relates to properties on the series, or the point in case of pies. 
 <br><br><b>defaults:</b><br><br>&ensp;{name}*/
	public void setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLabelFormat(){ return labelFormat; }

	private HICSSObject itemStyle;
/**
/** CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text. The defaults textOverflow property makes long texts truncate. Set it to undefined to wrap text instead. A width property can be added to control the text width. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemstyle/">Bold black text</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#333333", "cursor": "pointer", "fontSize": "12px", "fontWeight": "bold", "textOverflow": "ellipsis"}*/
	public void setItemStyle(HICSSObject itemStyle) {
		this.itemStyle = itemStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemStyle(){ return itemStyle; }

	private Boolean reversed;
/**
/** Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/reversed/">Stacked bar with reversed legend</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private Number padding;
/**
/** The inner padding of the legend box. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/padding-itemmargin/">Padding and item margins demonstrated</a>
 <br><br><b>defaults:</b><br><br>&ensp;8*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private Number itemDistance;
/**
/** In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/layout-horizontal/">50px item distance</a>
 <br><br><b>defaults:</b><br><br>&ensp;20*/
	public void setItemDistance(Number itemDistance) {
		this.itemDistance = itemDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemDistance(){ return itemDistance; }

	private Number /* boolean */ shadow;
/**
/** Whether to apply a drop shadow to the legend. A backgroundColor also needs to be applied for this to take effect. The shadow can be an object configuration containing color, offsetX, offsetY, opacity and width. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/shadow/">White background and drop shadow</a>
*/
	public void setShadow(Number /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number /* boolean */ getShadow(){ return shadow; }

	private HICSSObject itemHoverStyle;
/**
/** CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from style unless overridden here. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhoverstyle/">Red on hover</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#000000"}*/
	public void setItemHoverStyle(HICSSObject itemHoverStyle) {
		this.itemHoverStyle = itemHoverStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemHoverStyle(){ return itemHoverStyle; }

	private String verticalAlign;
/**
/** The vertical alignment of the legend box. Can be one of top, middle or bottom. Vertical position can be further determined by the y option. In the case that the legend is aligned in a corner position, the layout option will determine whether to place it above/below or on the side of the plot area. When the layout option is proximate, the verticalAlign option doesn't apply. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/">Legend 100px from the top of the chart</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]
*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private Number margin;
/**
/** If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the space between the legend and the axis labels or plot area. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-defaults/">12 pixels by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/margin-30/">30 pixels</a>
 <br><br><b>defaults:</b><br><br>&ensp;12*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private String align;
/**
/** The horizontal alignment of the legend box within the chart area. Valid values are left, center and right. In the case that the legend is aligned in a corner position, the layout option will determine whether to place it above/below or on the side of the plot area. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/align/">Legend at the right of the chart</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"]
*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private HIKeyboardNavigation keyboardNavigation;
/**
/** Keyboard navigation for the legend. Requires the Accessibility module. 
*/
	public void setKeyboardNavigation(HIKeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
		this.keyboardNavigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIKeyboardNavigation getKeyboardNavigation(){ return keyboardNavigation; }

	private Boolean enabled;
/**
/** Enable or disable the legend. There is also a series-specific option, showInLegend, that can hide the series from the legend. In some series types this is false by defaults, so it must set to true in order to show the legend for the series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/enabled-false/">Legend disabled</a>
*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number maxHeight;
/**
/** Maximum pixel height for the legend. When the maximum height is extended, navigation will show. 
*/
	public void setMaxHeight(Number maxHeight) {
		this.maxHeight = maxHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxHeight(){ return maxHeight; }

	private HICSSObject itemHiddenStyle;
/**
/** CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from style unless overridden here. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/itemhiddenstyle/">Darker gray color</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#cccccc"}*/
	public void setItemHiddenStyle(HICSSObject itemHiddenStyle) {
		this.itemHiddenStyle = itemHiddenStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemHiddenStyle(){ return itemHiddenStyle; }

	private Boolean alignColumns;
/**
/** If the `layout` is horizontal and the legend items span over two lines or more, whether to align the items into vertical columns. Setting this to false makes room for more items, but will look more messy. 
*/
	public void setAlignColumns(Boolean alignColumns) {
		this.alignColumns = alignColumns;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignColumns(){ return alignColumns; }

	private Number symbolHeight;
/**
/** The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of legend items. 
*/
	public void setSymbolHeight(Number symbolHeight) {
		this.symbolHeight = symbolHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolHeight(){ return symbolHeight; }

	private Number borderWidth;
/**
/** The width of the drawn border around the legend. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/borderwidth/">2px border width</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Object labelFormatter;
/**
/** Callback function to format each of the series' labels. The this keyword refers to the series object, or the point object in case of pie charts. By defaults the series or point name is printed. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/labelformatter/">Add text</a>
*/
	public void setLabelFormatter(Object labelFormatter) {
		this.labelFormatter = labelFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getLabelFormatter(){ return labelFormatter; }

	private Number y;
/**
/** The vertical offset of the legend relative to it's vertical alignment verticalAlign within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/verticalalign/">Legend 100px from the top of the chart</a>
*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
/**
/** The x offset of the legend relative to its horizontal alignment align within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/width/">Aligned to the plot area</a>
*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private HINavigation navigation;
/**
/** Options for the paging or navigation appearing when the legend is overflown. Navigation works well on screen, but not in static exported images. One way of working around that is to [increase the chart height in export](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-enabled-false/). 
*/
	public void setNavigation(HINavigation navigation) {
		this.navigation = navigation;
		this.navigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigation getNavigation(){ return navigation; }



	public HILegend() {

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
			params.put("itemHoverStyle", this.itemHoverStyle);
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
			params.put("itemHiddenStyle", this.itemHiddenStyle);
		}
		if (this.alignColumns != null) {
			params.put("alignColumns", this.alignColumns);
		}
		if (this.symbolHeight != null) {
			params.put("symbolHeight", this.symbolHeight);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.labelFormatter != null) {
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