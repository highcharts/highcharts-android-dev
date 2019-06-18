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



public class HIDataLabelsOptionsObject extends HIFoundation { 

	private String align;
	/**
 The alignment of the data label compared to the point. If `right`, the right side of the label should be touching the point. For points with an extent, like columns, the alignments also dictates how to align it inside the box, as given with the `inside` option. Can be one of `left`, `center` or `right`. 
	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean allowOverlap;
	/**
 Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the `dataLabels.padding` can be set to 0. 
	*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private HIColor backgroundColor;
	/**
 The background color or gradient for the data label. 
	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private String borderColor;
	/**
 The border color for the data label. Defaults to `undefined`. 
	*/
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderColor(){ return borderColor; }

	private Number borderRadius;
	/**
 The border radius in pixels for the data label. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Number borderWidth;
	/**
 The border width in pixels for the data label. 
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

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

	private String color;
	/**
 The text color for the data labels. Defaults to `undefined`. For certain series types, like column or map, the data labels can be drawn inside the points. In this case the data label will be drawn with maximum contrast by defaults. Additionally, it will be given a `text-outline` style with the opposite color, to further increase the contrast. This can be overridden by setting the `text-outline` style to `none` in the `dataLabels.style` option. 
	*/
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private Boolean crop;
	/**
 Whether to hide data labels that are outside the plot area. By defaults, the data label is moved inside the plot area according to the `overflow` option. 
	*/
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private Boolean defer;
	/**
 Whether to defer displaying the data labels until the initial series animation has finished. 
	*/
	public void setDefer(Boolean defer) {
		this.defer = defer;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDefer(){ return defer; }

	private Boolean enabled;
	/**
 Enable or disable the data labels. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIDataLabelsFilterOptionsObject filter;
	/**
 A declarative filter to control of which data labels to display. The declarative filter is designed for use when callback functions are not available, like when the chart options require a pure JSON structure or for use with graphical editors. For programmatic control, use the `formatter` instead, and return `undefined` to disable a single data label. 
	*/
	public void setFilter(HIDataLabelsFilterOptionsObject filter) {
		this.filter = filter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataLabelsFilterOptionsObject getFilter(){ return filter; }

	private String format;
	/**
 A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) for the data label. Available variables are the same as for `formatter`. 
	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private HIFunction formatter;
	/**
 Callback JavaScript function to format the data label. Note that if a `format` is defined, the format takes precedence and the formatter is ignored. 
	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Boolean inside;
	/**
 For points with an extent, like columns or map areas, whether to align the data label inside the box or to the actual value point. Defaults to `false` in most cases, `true` in stacked columns. 
	*/
	public void setInside(Boolean inside) {
		this.inside = inside;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInside(){ return inside; }

	private NSString nullFormat;
	/**
 Format for points with the value of null. Works analogously to `format`. `nullFormat` can be applied only to series which support displaying null points. 
	*/
	public void setNullFormat(NSString nullFormat) {
		this.nullFormat = nullFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public NSString getNullFormat(){ return nullFormat; }

	private HIFunction nullFormatter;
	/**
 Callback JavaScript function that defines formatting for points with the value of null. Works analogously to `formatter`. `nullPointFormatter` can be applied only to series which support displaying null points. 
	*/
	public void setNullFormatter(HIFunction nullFormatter) {
		this.nullFormatter = nullFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNullFormatter(){ return nullFormatter; }

	private String overflow;
	/**
 How to handle data labels that flow outside the plot area. The defaults is `"justify"`, which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the plot area, set `crop` to `false` and `overflow` to `"allow"`. 
	*/
	public void setOverflow(String overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOverflow(){ return overflow; }

	private Number padding;
	/**
 When either the `borderWidth` or the `backgroundColor` is set, this is the padding within the box. 
	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private Number rotation;
	/**
 Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be lost on a rotated data label. 
	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private HIShadowOptionsObject shadow;
	/**
 The shadow of the box. Works best with `borderWidth` or `backgroundColor`. Since 2.3 the shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`. 
	*/
	public void setShadow(HIShadowOptionsObject shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIShadowOptionsObject getShadow(){ return shadow; }

	private String shape;
	/**
 The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object. 
	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private HICSSObject style;
	/**
 Styles for the label. The defaults `color` setting is `"contrast"`, which is a pseudo color that Highcharts picks up and applies the maximum contrast to the underlying point item, for example the bar in a bar chart. The `textOutline` is a pseudo property that applies an outline of the given width with the given color, which by defaults is the maximum contrast to the text. So a bright text color will result in a black text outline for maximum readability on a mixed background. In some cases, especially with grayscale text, the text outline doesn't work well, in which cases it can be disabled by setting it to `"none"`. When `useHTML` is true, the `textOutline` will not be picked up. In this, case, the same effect can be acheived through the `text-shadow` CSS property. For some series types, where each point has an extent, like for example tree maps, the data label may overflow the point. There are two strategies for handling overflow. By defaults, the text will wrap to multiple lines. The other strategy is to set `style.textOverflow` to `ellipsis`, which will keep the text on one line plus it will break inside long words. 
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private HIDataLabelsTextPath textPath;
	/**
 Options for a label text which should follow marker's shape. Border and background are disabled for a label that follows a path. **Note:** Only SVG-based renderer supports this option. Setting `useHTML` to true will disable this option. 
	*/
	public void setTextPath(HIDataLabelsTextPath textPath) {
		this.textPath = textPath;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataLabelsTextPath getTextPath(){ return textPath; }

	private Boolean useHTML;
	/**
 Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the labels. 
	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

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

	private Number zIndex;
	/**
 The Z index of the data labels. The defaults Z index puts it above the series. Use a Z index of 2 to display it behind the series. 
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }



	public HIDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.defer != null) {
			params.put("defer", this.defer);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.filter != null) {
			params.put("filter", this.filter.getParams());
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.inside != null) {
			params.put("inside", this.inside);
		}
		if (this.nullFormat != null) {
			params.put("nullFormat", this.nullFormat);
		}
		if (this.nullFormatter != null) {
			params.put("nullFormatter", this.nullFormatter);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow.getParams());
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.textPath != null) {
			params.put("textPath", this.textPath.getParams());
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		return params;
	}

}