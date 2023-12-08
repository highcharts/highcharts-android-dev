/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class HILegend extends HIFoundation { 

	private Number symbolRadius;
	/**
 The border radius of the symbol for series types that use a rectangle in the legend. Defaults to half the `symbolHeight`, effectively creating a circle. For color axis scales, it defaultss to 3. 
	*/
	public void setSymbolRadius(Number symbolRadius) {
		this.symbolRadius = symbolRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolRadius(){ return symbolRadius; }

	private Number borderRadius;
	/**
 The border corner radius of the legend. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Boolean rtl;
	/**
 Whether to show the symbol on the right side of the text rather than the left side. This is common in Arabic and Hebrew. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setRtl(Boolean rtl) {
		this.rtl = rtl;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRtl(){ return rtl; }

	private String valueSuffix;
	/**
 For a color axis with data classes, a suffix for the range numbers in the legend. 
 <br><br><b>defaults:</b><br><br>&ensp;''	*/
	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueSuffix(){ return valueSuffix; }

	private HIAccessibility accessibility;
	/**
 Accessibility options for the legend. Requires the Accessibility module. 
	*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private Boolean squareSymbol;
	/**
 When this is true, the legend symbol width will be the same as the symbol height, which in turn defaultss to the font size of the legend items. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setSquareSymbol(Boolean squareSymbol) {
		this.squareSymbol = squareSymbol;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSquareSymbol(){ return squareSymbol; }

	private Number itemWidth;
	/**
 The width for each legend item. By defaults the items are laid out successively. In a `horizontal layout`, if the items are laid out across two rows or more, they will be vertically aligned depending on the `legend.alignColumns` option. 
	*/
	public void setItemWidth(Number itemWidth) {
		this.itemWidth = itemWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemWidth(){ return itemWidth; }

	private Number symbolPadding;
	/**
 The pixel padding between the legend item symbol and the legend item text. 
 <br><br><b>defaults:</b><br><br>&ensp;5	*/
	public void setSymbolPadding(Number symbolPadding) {
		this.symbolPadding = symbolPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolPadding(){ return symbolPadding; }

	private Boolean floating;
	/**
 When the legend is floating, the plot area ignores it and is allowed to be placed below it. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setFloating(Boolean floating) {
		this.floating = floating;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFloating(){ return floating; }

	private Number symbolWidth;
	/**
 The pixel width of the legend item symbol. When the `squareSymbol` option is set, this defaultss to the `symbolHeight`, otherwise 16. 
	*/
	public void setSymbolWidth(Number symbolWidth) {
		this.symbolWidth = symbolWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolWidth(){ return symbolWidth; }

	private Boolean useHTML;
	/**
 Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the legend item texts. Prior to 4.1.7, when using HTML, `legend.navigation` was disabled. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private HIColor borderColor;
	/**
 The color of the drawn border around the legend. 
 <br><br><b>defaults:</b><br><br>&ensp;#999999	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private String className;
	/**
 A CSS class name to apply to the legend group. 
 <br><br><b>defaults:</b><br><br>&ensp;highcharts-no-tooltip	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private String layout;
	/**
 The layout of the legend items. Can be one of `horizontal` or `vertical` or `proximate`. When `proximate`, the legend items will be placed as close as possible to the graphs they're representing, except in inverted charts or when the legend position doesn't allow it. 
 <br><br><b>defaults:</b><br><br>&ensp;horizontal	*/
	public void setLayout(String layout) {
		this.layout = layout;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayout(){ return layout; }

	private HITitle title;
	/**
 A title to be added on top of the legend. 
	*/
	public void setTitle(HITitle title) {
		this.title = title;
		this.title.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITitle getTitle(){ return title; }

	private Object /* Number, String */ width;
	/**
 The width of the legend box. If a number is set, it translates to pixels. Since v7.0.2 it allows setting a percent string of the full chart width, for example `40%`. Defaults to the full chart width for legends below or above the chart, half the chart width for legends to the left and right. 
	*/
	public void setWidth(Object /* Number, String */ width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWidth(){ return width; }

	private Number itemMarginBottom;
	/**
 The pixel bottom margin for each legend item. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setItemMarginBottom(Number itemMarginBottom) {
		this.itemMarginBottom = itemMarginBottom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemMarginBottom(){ return itemMarginBottom; }

	private HIColor backgroundColor;
	/**
 The background color of the legend. 
	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Number itemMarginTop;
	/**
 The pixel top margin for each legend item. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setItemMarginTop(Number itemMarginTop) {
		this.itemMarginTop = itemMarginTop;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemMarginTop(){ return itemMarginTop; }

	private HIBubbleLegend bubbleLegend;
	/**
 The bubble legend is an additional element in legend which presents the scale of the bubble series. Individual bubble ranges can be defined by user or calculated from series. In the case of automatically calculated ranges, a 1px margin of error is permitted. 
	*/
	public void setBubbleLegend(HIBubbleLegend bubbleLegend) {
		this.bubbleLegend = bubbleLegend;
		this.bubbleLegend.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBubbleLegend getBubbleLegend(){ return bubbleLegend; }

	private String labelFormat;
	/**
 A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) for each legend label. Available variables relates to properties on the series, or the point in case of pies. 
 <br><br><b>defaults:</b><br><br>&ensp;{name}	*/
	public void setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLabelFormat(){ return labelFormat; }

	private HICSSObject itemStyle;
	/**
 CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text. The defaults `textOverflow` property makes long texts truncate. Set it to `undefined` to wrap text instead. A `width` property can be added to control the text width. 
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#333333", "cursor": "pointer", "fontSize": "0.75em", "fontWeight": "bold", "textOverflow": "ellipsis"}	*/
	public void setItemStyle(HICSSObject itemStyle) {
		this.itemStyle = itemStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemStyle(){ return itemStyle; }

	private Boolean reversed;
	/**
 Whether to reverse the order of the legend items compared to the order of the series or points as defined in the configuration object. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private HICSSObject itemCheckboxStyle;
	/**
 Default styling for the checkbox next to a legend item when `showCheckbox` is true. 
 <br><br><b>defaults:</b><br><br>&ensp;{"width": "13px", "height": "13px", "position":"absolute"}	*/
	public void setItemCheckboxStyle(HICSSObject itemCheckboxStyle) {
		this.itemCheckboxStyle = itemCheckboxStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemCheckboxStyle(){ return itemCheckboxStyle; }

	private Number padding;
	/**
 The inner padding of the legend box. 
 <br><br><b>defaults:</b><br><br>&ensp;8	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private String verticalAlign;
	/**
 The vertical alignment of the legend box. Can be one of `top`, `middle` or `bottom`. Vertical position can be further determined by the `y` option. In the case that the legend is aligned in a corner position, the `layout` option will determine whether to place it above/below or on the side of the plot area. When the `layout` option is `proximate`, the `verticalAlign` option doesn't apply. 
 <br><br><b>defaults:</b><br><br>&ensp;bottom	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private HICSSObject /* boolean */ shadow;
	/**
 Whether to apply a drop shadow to the legend. A `backgroundColor` also needs to be applied for this to take effect. The shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`. 
	*/
	public void setShadow(HICSSObject /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject /* boolean */ getShadow(){ return shadow; }

	private HICSSObject itemHoverStyle;
	/**
 CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from `style` unless overridden here. 
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#000000"}	*/
	public void setItemHoverStyle(HICSSObject itemHoverStyle) {
		this.itemHoverStyle = itemHoverStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemHoverStyle(){ return itemHoverStyle; }

	private Number itemDistance;
	/**
 In a legend with horizontal layout, the itemDistance defines the pixel distance between each item. 
 <br><br><b>defaults:</b><br><br>&ensp;20	*/
	public void setItemDistance(Number itemDistance) {
		this.itemDistance = itemDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getItemDistance(){ return itemDistance; }

	private HINavigation navigation;
	/**
 Options for the paging or navigation appearing when the legend is overflown. Navigation works well on screen, but not in static exported images. One way of working around that is to [increase the chart height in export](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation-enabled-false/). 
	*/
	public void setNavigation(HINavigation navigation) {
		this.navigation = navigation;
		this.navigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigation getNavigation(){ return navigation; }

	private String align;
	/**
 The horizontal alignment of the legend box within the chart area. Valid values are `left`, `center` and `right`. In the case that the legend is aligned in a corner position, the `layout` option will determine whether to place it above/below or on the side of the plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;center	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean enabled;
	/**
 Enable or disable the legend. There is also a series-specific option, `showInLegend`, that can hide the series from the legend. In some series types this is `false` by defaults, so it must set to `true` in order to show the legend for the series. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number maxHeight;
	/**
 Maximum pixel height for the legend. When the maximum height is extended, navigation will show. 
	*/
	public void setMaxHeight(Number maxHeight) {
		this.maxHeight = maxHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxHeight(){ return maxHeight; }

	private HICSSObject itemHiddenStyle;
	/**
 CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is supported, notably those options related to text. Properties are inherited from `style` unless overridden here. 
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#cccccc"}	*/
	public void setItemHiddenStyle(HICSSObject itemHiddenStyle) {
		this.itemHiddenStyle = itemHiddenStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getItemHiddenStyle(){ return itemHiddenStyle; }

	private Boolean alignColumns;
	/**
 If the `layout` is `horizontal` and the legend items span over two lines or more, whether to align the items into vertical columns. Setting this to `false` makes room for more items, but will look more messy. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setAlignColumns(Boolean alignColumns) {
		this.alignColumns = alignColumns;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignColumns(){ return alignColumns; }

	private Number symbolHeight;
	/**
 The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of legend items. 
	*/
	public void setSymbolHeight(Number symbolHeight) {
		this.symbolHeight = symbolHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolHeight(){ return symbolHeight; }

	private Number borderWidth;
	/**
 The width of the drawn border around the legend. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private HIFunction labelFormatter;
	/**
 Callback function to format each of the series' labels. The `this` keyword refers to the series object, or the point object in case of pie charts. By defaults the series or point name is printed. 
	*/
	public void setLabelFormatter(HIFunction labelFormatter) {
		this.labelFormatter = labelFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLabelFormatter(){ return labelFormatter; }

	private Number y;
	/**
 The vertical offset of the legend relative to it's vertical alignment `verticalAlign` within chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 The x offset of the legend relative to its horizontal alignment `align` within chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves it to the right. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number margin;
	/**
 If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the space between the legend and the axis labels or plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;12	*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private Number valueDecimals;
	/**
 For a color axis with data classes, how many decimals to render in the legend. The defaults preserves the decimals of the range numbers. 
 <br><br><b>defaults:</b><br><br>&ensp;-1	*/
	public void setValueDecimals(Number valueDecimals) {
		this.valueDecimals = valueDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValueDecimals(){ return valueDecimals; }

	private String legendLabel;
	/**
 Accessible label for the legend, for charts where there is a legend title defined. `{legendTitle}` refers to the visual text in the legend title. 
 <br><br><b>defaults:</b><br><br>&ensp;Chart legend: {legendTitle}	*/
	public void setLegendLabel(String legendLabel) {
		this.legendLabel = legendLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLegendLabel(){ return legendLabel; }

	private String legendLabelNoTitle;
	/**
 Accessible label for the legend, for charts where there is no legend title defined. 
 <br><br><b>defaults:</b><br><br>&ensp;Toggle series visibility, {chartTitle}	*/
	public void setLegendLabelNoTitle(String legendLabelNoTitle) {
		this.legendLabelNoTitle = legendLabelNoTitle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLegendLabelNoTitle(){ return legendLabelNoTitle; }

	private String legendItem;
	/**
 Accessible label for individual legend items. `{itemName}` refers to the visual text in the legend for that item. 
 <br><br><b>defaults:</b><br><br>&ensp;Show {itemName}	*/
	public void setLegendItem(String legendItem) {
		this.legendItem = legendItem;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLegendItem(){ return legendItem; }



	public HILegend() {

	}


	/**
	 * Set the legend item text.
	 * @param item The item for which to update the text in the legend.
	 */
	public void setPointText(HIPoint item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "setText");
			put("id", uuid);
			put("params", Collections.singletonList(item));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the legend item text.
	 * @param item The item for which to update the text in the legend.
	 */
	public void setSeriesText(HISeries item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "setText");
			put("id", uuid);
			put("params", Collections.singletonList(item));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Update the legend with new options. Equivalent to running chart.update with a legend configuration option.
	 * @param options Legend options.
	 */
	public void update(HILegend options){
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "update0");
			put("id", uuid);
			put("params", Collections.singletonList(params));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Update the legend with new options. Equivalent to running chart.update with a legend configuration option.
	 * @param options Legend options.
	 * @param redraw Whether to redraw the chart after the axis is altered. If doing more operations on the chart, it is a good idea to set redraw to false and call HIChartView redraw() after. Whether to redraw the chart.
	 */
	public void update(HILegend options, boolean redraw){
		Map<String, Object> params = options.getParams();
		params.remove("_wrapperID");
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Legend");
			put("method", "update1");
			put("id", uuid);
			put("params", Arrays.asList(params, redraw));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}


	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.symbolRadius != null) {
			params.put("symbolRadius", this.symbolRadius);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.rtl != null) {
			params.put("rtl", this.rtl);
		}
		if (this.valueSuffix != null) {
			params.put("valueSuffix", this.valueSuffix);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
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
		if (this.className != null) {
			params.put("className", this.className);
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
		if (this.bubbleLegend != null) {
			params.put("bubbleLegend", this.bubbleLegend.getParams());
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
		if (this.itemCheckboxStyle != null) {
			params.put("itemCheckboxStyle", this.itemCheckboxStyle.getParams());
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow.getParams());
		}
		if (this.itemHoverStyle != null) {
			params.put("itemHoverStyle", this.itemHoverStyle.getParams());
		}
		if (this.itemDistance != null) {
			params.put("itemDistance", this.itemDistance);
		}
		if (this.navigation != null) {
			params.put("navigation", this.navigation.getParams());
		}
		if (this.align != null) {
			params.put("align", this.align);
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
			params.put("labelFormatter", this.labelFormatter);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.valueDecimals != null) {
			params.put("valueDecimals", this.valueDecimals);
		}
		if (this.legendLabel != null) {
			params.put("legendLabel", this.legendLabel);
		}
		if (this.legendLabelNoTitle != null) {
			params.put("legendLabelNoTitle", this.legendLabelNoTitle);
		}
		if (this.legendItem != null) {
			params.put("legendItem", this.legendItem);
		}
		return params;
	}

}