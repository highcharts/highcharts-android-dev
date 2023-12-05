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



public class HITooltip extends HIFoundation { 

	private Boolean followTouchMove;
	/**
 Whether the tooltip should update as the finger moves on a touch device. If this is `true` and `chart.panning` is set,`followTouchMove` will take over one-finger touches, so the user needs to use two fingers for zooming and panning. Note the difference to `followPointer` that only defines the _position_ of the tooltip. If `followPointer` is false in for example a column series, the tooltip will show above or below the column, but as `followTouchMove` is true, the tooltip will jump from column to column as the user swipes across the plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setFollowTouchMove(Boolean followTouchMove) {
		this.followTouchMove = followTouchMove;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFollowTouchMove(){ return followTouchMove; }

	private HIFunction nullFormatter;
	/**
 Callback function to format the text of the tooltip for visible null points. Works analogously to `formatter`. 
	*/
	public void setNullFormatter(HIFunction nullFormatter) {
		this.nullFormatter = nullFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNullFormatter(){ return nullFormatter; }

	private String clusterFormat;
	/**
 The HTML of the cluster point's in the tooltip. Works only with marker-clusters module and analogously to `pointFormat`. The cluster tooltip can be also formatted using `tooltip.formatter` callback function and `point.isCluster` flag. 
 <br><br><b>defaults:</b><br><br>&ensp;Clustered points: {point.clusterPointsAmount}	*/
	public void setClusterFormat(String clusterFormat) {
		this.clusterFormat = clusterFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClusterFormat(){ return clusterFormat; }

	private Number borderRadius;
	/**
 The radius of the rounded border corners. 
 <br><br><b>defaults:</b><br><br>&ensp;3	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private String headerFormat;
	/**
 The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables are `point.key`, `series.name`, `series.color` and other members from the `point` and `series` objects. The `point.key` variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the `point.key` date format can be set using `tooltip.xDateFormat`. 
	*/
	public void setHeaderFormat(String headerFormat) {
		this.headerFormat = headerFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHeaderFormat(){ return headerFormat; }

	private String valueSuffix;
	/**
 A string to append to each series' y value. Overridable in each series' tooltip options object. 
	*/
	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueSuffix(){ return valueSuffix; }

	private String valuePrefix;
	/**
 A string to prepend to each series' y value. Overridable in each series' tooltip options object. 
	*/
	public void setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValuePrefix(){ return valuePrefix; }

	private HIFunction positioner;
	/**
 A callback function to place the tooltip in a custom position. The callback receives three parameters: `labelWidth`, `labelHeight` and `point`, where point contains values for `plotX` and `plotY` telling where the reference point is in the plot area. Add `chart.plotLeft` and `chart.plotTop` to get the full coordinates. To find the actual hovered `Point` instance, use `this.chart.hoverPoint`. For shared or split tooltips, all the hover points are available in `this.chart.hoverPoints`. Since v7, when `tooltip.split` option is enabled, positioner is called for each of the boxes separately, including xAxis header. xAxis header is not a point, instead `point` argument contains info: `{ plotX: Number, plotY: Number, isHeader: Boolean }` The return should be an object containing x and y values, for example `{ x: 100, y: 100 }`. 
	*/
	public void setPositioner(HIFunction positioner) {
		this.positioner = positioner;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPositioner(){ return positioner; }

	private Boolean stickOnContact;
	/**
 Prevents the tooltip from switching or closing when touched or pointed. 
	*/
	public void setStickOnContact(Boolean stickOnContact) {
		this.stickOnContact = stickOnContact;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getStickOnContact(){ return stickOnContact; }

	private Boolean useHTML;
	/**
 Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private HIColor borderColor;
	/**
 The color of the tooltip border. When `undefined`, the border takes the color of the corresponding series or point. 
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HICSSObject style;
	/**
 CSS styles for the tooltip. The tooltip can also be styled through the CSS class `.highcharts-tooltip`. Note that the defaults `pointerEvents` style makes the tooltip ignore mouse events, so in order to use clickable tooltips, this value must be set to `auto`. 
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String headerShape;
	/**
 The name of a symbol to use for the border around the tooltip header. Applies only when `tooltip.split` is enabled. Custom callbacks for symbol path generation can also be added to `Highcharts.SVGRenderer.prototype.symbols` the same way as for `series.marker.symbol`. 
 <br><br><b>defaults:</b><br><br>&ensp;callout	*/
	public void setHeaderShape(String headerShape) {
		this.headerShape = headerShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHeaderShape(){ return headerShape; }

	private String footerFormat;
	/**
 A string to append to the tooltip format. 
	*/
	public void setFooterFormat(String footerFormat) {
		this.footerFormat = footerFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFooterFormat(){ return footerFormat; }

	private Boolean outside;
	/**
 Whether to allow the tooltip to render outside the chart's SVG element box. By defaults (`false`), the tooltip is rendered within the chart's SVG element, which results in the tooltip being aligned inside the chart area. For small charts, this may result in clipping or overlapping. When `true`, a separate SVG element is created and overlaid on the page, allowing the tooltip to be aligned inside the page itself. Defaults to `true` if `chart.scrollablePlotArea` is activated, otherwise `false`. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setOutside(Boolean outside) {
		this.outside = outside;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOutside(){ return outside; }

	private Boolean animation;
	/**
 Enable or disable animation of the tooltip. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAnimation(Boolean animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAnimation(){ return animation; }

	private Boolean split;
	/**
 Split the tooltip into one label per series, with the header close to the axis. This is recommended over `shared` tooltips for charts with multiple line series, generally making them easier to read. This option takes precedence over `tooltip.shared`. Not supported for `polar` and `inverted` charts. 
	*/
	public void setSplit(Boolean split) {
		this.split = split;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSplit(){ return split; }

	private HIColor backgroundColor;
	/**
 The background color or gradient for the tooltip. In styled mode, the stroke width is set in the `.highcharts-tooltip-box` class. 
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Number snap;
	/**
 Proximity snap for graphs or single points. It defaultss to 10 for mouse-powered devices and 25 for touch devices. Note that in most cases the whole plot area captures the mouse movement, and in these cases `tooltip.snap` doesn't make sense. This applies when `stickyTracking` is `true` (defaults) and when the tooltip is `shared` or `split`. 
 <br><br><b>defaults:</b><br><br>&ensp;10/25	*/
	public void setSnap(Number snap) {
		this.snap = snap;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSnap(){ return snap; }

	private Boolean shared;
	/**
 When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is recommended for single series charts and for tablet/mobile optimized charts. See also `tooltip.split`, that is better suited for charts with many series, especially line-type series. The `tooltip.split` option takes precedence over `tooltip.shared`. 
	*/
	public void setShared(Boolean shared) {
		this.shared = shared;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShared(){ return shared; }

	private HIFunction formatter;
	/**
 Callback function to format the text of the tooltip from scratch. In case of single or `shared` tooltips, a string should be returned. In case of `split` tooltips, it should return an array where the first item is the header, and subsequent items are mapped to the points. Return `false` to disable tooltip for a specific point on series. A subset of HTML is supported. Unless `useHTML` is true, the HTML of the tooltip is parsed and converted to SVG, therefore this isn't a complete HTML renderer. The following HTML tags are supported: `b`, `br`, `em`, `i`, `span`, `strong`. Spans can be styled with a `style` attribute, but only text-related CSS, that is shared with SVG, is handled. The available data in the formatter differ a bit depending on whether the tooltip is shared or split, or belongs to a single point. In a shared/split tooltip, all properties except `x`, which is common for all points, are kept in an array, `this.points`. Available data are: - **this.percentage (not shared) /**  **this.points[i].percentage (shared)**:  Stacked series and pies only. The point's percentage of the total. - **this.point (not shared) / this.points[i].point (shared)**:  The point object. The point name, if defined, is available through  `this.point.name`. - **this.points**:  In a shared tooltip, this is an array containing all other  properties for each point. - **this.series (not shared) / this.points[i].series (shared)**:  The series object. The series name is available through  `this.series.name`. - **this.total (not shared) / this.points[i].total (shared)**:  Stacked series only. The total value at this point's x value. - **this.x**:  The x value. This property is the same regardless of the tooltip  being shared or not. - **this.y (not shared) / this.points[i].y (shared)**:  The y value. 
	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private String nullFormat;
	/**
 The HTML of the null point's line in the tooltip. Works analogously to `pointFormat`. 
	*/
	public void setNullFormat(String nullFormat) {
		this.nullFormat = nullFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNullFormat(){ return nullFormat; }

	private String format;
	/**
 A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) for the whole tooltip. When format strings are a requirement, it is usually more convenient to use `headerFormat`, `pointFormat` and `footerFormat`, but the `format` option allows combining them into one setting. The context of the format string is the same as that of the `formatter` callback. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private String pointFormat;
	/**
 The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are `point.x`, `point.y`, `series.name` and `series.color` and other properties on the same form. Furthermore, `point.y` can be extended by the `tooltip.valuePrefix` and `tooltip.valueSuffix` variables. This can also be overridden for each series, which makes it a good hook for displaying units. In styled mode, the dot is colored by a class name rather than the point color. 
	*/
	public void setPointFormat(String pointFormat) {
		this.pointFormat = pointFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointFormat(){ return pointFormat; }

	private String xDateFormat;
	/**
 The format for the date in the tooltip header if the X axis is a datetime axis. The defaults is a best guess based on the smallest distance between points in the chart. 
	*/
	public void setXDateFormat(String xDateFormat) {
		this.xDateFormat = xDateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXDateFormat(){ return xDateFormat; }

	private HIDateTimeLabelFormats dateTimeLabelFormats;
	/**
 For series on datetime axes, the date format in the tooltip's header will by defaults be guessed based on the closest data points. This member gives the defaults string representations used for each unit. For an overview of the replacement codes, see `dateFormat`. 
	*/
	public void setDateTimeLabelFormats(HIDateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		this.dateTimeLabelFormats.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDateTimeLabelFormats getDateTimeLabelFormats(){ return dateTimeLabelFormats; }

	private Number padding;
	/**
 Padding inside the tooltip, in pixels. 
 <br><br><b>defaults:</b><br><br>&ensp;8	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private HIShadowOptionsObject /* boolean */ shadow;
	/**
 Whether to apply a drop shadow to the tooltip. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setShadow(HIShadowOptionsObject /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIShadowOptionsObject /* boolean */ getShadow(){ return shadow; }

	private Number distance;
	/**
 Distance from point to tooltip in pixels. 
 <br><br><b>defaults:</b><br><br>&ensp;16	*/
	public void setDistance(Number distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDistance(){ return distance; }

	private Boolean enabled;
	/**
 Enable or disable the tooltip. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String shape;
	/**
 The name of a symbol to use for the border around the tooltip. Can be one of: `"callout"`, `"circle"` or `"rect"`. When `tooltip.split` option is enabled, shape is applied to all boxes except header, which is controlled by `tooltip.headerShape`. Custom callbacks for symbol path generation can also be added to `Highcharts.SVGRenderer.prototype.symbols` the same way as for `series.marker.symbol`. 
 <br><br><b>defaults:</b><br><br>&ensp;callout	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private HIFunction pointFormatter;
	/**
 A callback function for formatting the HTML output for a single point in the tooltip. Like the `pointFormat` string, but with more flexibility. 
	*/
	public void setPointFormatter(HIFunction pointFormatter) {
		this.pointFormatter = pointFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPointFormatter(){ return pointFormatter; }

	private String className;
	/**
 A CSS class name to apply to the tooltip's container div, allowing unique CSS styling for each chart. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number borderWidth;
	/**
 The pixel width of the tooltip border. Defaults to 0 for single tooltips and 1 for split tooltips. In styled mode, the stroke width is set in the `.highcharts-tooltip-box` class. 
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Boolean followPointer;
	/**
 Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By defaults it behaves this way for pie, polygon, map, sankey and wordcloud series by override in the `plotOptions` for those series types. Does not apply if `split` is `true`. For touch moves to behave the same way, `followTouchMove` must be `true` also. 
	*/
	public void setFollowPointer(Boolean followPointer) {
		this.followPointer = followPointer;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFollowPointer(){ return followPointer; }

	private Number hideDelay;
	/**
 The number of milliseconds to wait until the tooltip is hidden when mouse out from a point or chart. 
 <br><br><b>defaults:</b><br><br>&ensp;500	*/
	public void setHideDelay(Number hideDelay) {
		this.hideDelay = hideDelay;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHideDelay(){ return hideDelay; }

	private Number valueDecimals;
	/**
 How many decimals to show in each series' y value. This is overridable in each series' tooltip options object. The defaults is to preserve all decimals. 
	*/
	public void setValueDecimals(Number valueDecimals) {
		this.valueDecimals = valueDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValueDecimals(){ return valueDecimals; }

	private String linkFormat;
	/**
 The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are `point.id`, `point.fromNode.id`, `point.toNode.id`, `series.name`, `series.color` and other properties on the same form. Furthermore, This can also be overridden for each series, which makes it a good hook for displaying units. In styled mode, the dot is colored by a class name rather than the point color. 
 <br><br><b>defaults:</b><br><br>&ensp;{point.fromNode.id} → {point.toNode.id}	*/
	public void setLinkFormat(String linkFormat) {
		this.linkFormat = linkFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkFormat(){ return linkFormat; }

	private String nodeFormat;
	public void setNodeFormat(String nodeFormat) {
		this.nodeFormat = nodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNodeFormat(){ return nodeFormat; }

	private HIFunction nodeFormatter;
	/**
 A callback for defining the format for _nodes_ in the chart's tooltip, as opposed to links. 
	*/
	public void setNodeFormatter(HIFunction nodeFormatter) {
		this.nodeFormatter = nodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNodeFormatter(){ return nodeFormatter; }



	public HITooltip() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.followTouchMove != null) {
			params.put("followTouchMove", this.followTouchMove);
		}
		if (this.nullFormatter != null) {
			params.put("nullFormatter", this.nullFormatter);
		}
		if (this.clusterFormat != null) {
			params.put("clusterFormat", this.clusterFormat);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.headerFormat != null) {
			params.put("headerFormat", this.headerFormat);
		}
		if (this.valueSuffix != null) {
			params.put("valueSuffix", this.valueSuffix);
		}
		if (this.valuePrefix != null) {
			params.put("valuePrefix", this.valuePrefix);
		}
		if (this.positioner != null) {
			params.put("positioner", this.positioner);
		}
		if (this.stickOnContact != null) {
			params.put("stickOnContact", this.stickOnContact);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.headerShape != null) {
			params.put("headerShape", this.headerShape);
		}
		if (this.footerFormat != null) {
			params.put("footerFormat", this.footerFormat);
		}
		if (this.outside != null) {
			params.put("outside", this.outside);
		}
		if (this.animation != null) {
			params.put("animation", this.animation);
		}
		if (this.split != null) {
			params.put("split", this.split);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.snap != null) {
			params.put("snap", this.snap);
		}
		if (this.shared != null) {
			params.put("shared", this.shared);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.nullFormat != null) {
			params.put("nullFormat", this.nullFormat);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.pointFormat != null) {
			params.put("pointFormat", this.pointFormat);
		}
		if (this.xDateFormat != null) {
			params.put("xDateFormat", this.xDateFormat);
		}
		if (this.dateTimeLabelFormats != null) {
			params.put("dateTimeLabelFormats", this.dateTimeLabelFormats.getParams());
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow.getParams());
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.pointFormatter != null) {
			params.put("pointFormatter", this.pointFormatter);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.followPointer != null) {
			params.put("followPointer", this.followPointer);
		}
		if (this.hideDelay != null) {
			params.put("hideDelay", this.hideDelay);
		}
		if (this.valueDecimals != null) {
			params.put("valueDecimals", this.valueDecimals);
		}
		if (this.linkFormat != null) {
			params.put("linkFormat", this.linkFormat);
		}
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		return params;
	}

}