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
 Whether the tooltip should update as the finger moves on a touch device. If this is true and chart.panning is set,followTouchMove will take over one-finger touches, so the user needs to use two fingers for zooming and panning. Note the difference to followPointer that only defines the _position_ of the tooltip. If followPointer is false in for example a column series, the tooltip will show above or below the column, but as followTouchMove is true, the tooltip will jump from column to column as the user swipes across the plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setFollowTouchMove(Boolean followTouchMove) {
		this.followTouchMove = followTouchMove;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFollowTouchMove(){ return followTouchMove; }

	private HIFunction nullFormatter;
	/**
 Callback function to format the text of the tooltip for visible null points. Works analogously to formatter. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-nullformat">Format data label and tooltip for null point.</a>
	*/
	public void setNullFormatter(HIFunction nullFormatter) {
		this.nullFormatter = nullFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNullFormatter(){ return nullFormatter; }

	private Object clusterFormat;
	/**
 The HTML of the cluster point's in the tooltip. Works only with marker-clusters module and analogously to pointFormat. The cluster tooltip can be also formatted using tooltip.formatter callback function and point.isCluster flag. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/grid">Format tooltip for cluster points.</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/europe/">Format tooltip for clusters using tooltip.formatter</a>
	*/
	public void setClusterFormat(Object clusterFormat) {
		this.clusterFormat = clusterFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getClusterFormat(){ return clusterFormat; }

	private Number borderRadius;
	/**
 The radius of the rounded border corners. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-defaults/">5px by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderradius-0/">Square borders</a>
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private String headerFormat;
	/**
 The HTML of the tooltip header line. Variables are enclosed by curly brackets. Available variables are point.key, series.name, series.color and other members from the point and series objects. The point.key variable contains the category name, x value or datetime string depending on the type of axis. For datetime axes, the point.key date format can be set using tooltip.xDateFormat. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">An HTML table in the tooltip</a>
	*/
	public void setHeaderFormat(String headerFormat) {
		this.headerFormat = headerFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHeaderFormat(){ return headerFormat; }

	private String valueSuffix;
	/**
 A string to append to each series' y value. Overridable in each series' tooltip options object. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
	*/
	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueSuffix(){ return valueSuffix; }

	private String valuePrefix;
	/**
 A string to prepend to each series' y value. Overridable in each series' tooltip options object. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
	*/
	public void setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValuePrefix(){ return valuePrefix; }

	private HIFunction positioner;
	/**
 A callback function to place the tooltip in a defaults position. The callback receives three parameters: labelWidth, labelHeight and point, where point contains values for plotX and plotY telling where the reference point is in the plot area. Add chart.plotLeft and chart.plotTop to get the full coordinates. Since v7, when tooltip.split option is enabled, positioner is called for each of the boxes separately, including xAxis header. xAxis header is not a point, instead point argument contains info: { plotX: Number, plotY: Number, isHeader: Boolean }  The return should be an object containing x and y values, for example { x: 100, y: 100 }. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/positioner/">A fixed tooltip position</a>
	*/
	public void setPositioner(HIFunction positioner) {
		this.positioner = positioner;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPositioner(){ return positioner; }

	private Boolean useHTML;
	/**
 Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced formatting like tables and images in the tooltip. It is also recommended for rtl languages as it works around rtl bugs in early Firefox. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/fullhtml/">Full HTML tooltip</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private HIColor borderColor;
	/**
 The color of the tooltip border. When undefined, the border takes the color of the corresponding series or point. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-defaults/">Follow series by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-black/">Black border</a>
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HICSSObject style;
	/**
 CSS styles for the tooltip. The tooltip can also be styled through the CSS class .highcharts-tooltip. Note that the defaults pointerEvents style makes the tooltip ignore mouse events, so in order to use clickable tooltips, this value must be set to auto. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/style/">Greater padding, bold text</a>
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String headerShape;
	/**
 The name of a symbol to use for the border around the tooltip header. Applies only when tooltip.split is enabled. Custom callbacks for symbol path generation can also be added to Highcharts.SVGRenderer.prototype.symbols the same way as for `series.marker.symbol`. <br><br><b>accepted values:</b><br><br>&ensp;["callout", "square"]
 <br><br><b>defaults:</b><br><br>&ensp;callout	*/
	public void setHeaderShape(String headerShape) {
		this.headerShape = headerShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHeaderShape(){ return headerShape; }

	private String footerFormat;
	/**
 A string to append to the tooltip format. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/footerformat/">A table for value alignment</a>
	*/
	public void setFooterFormat(String footerFormat) {
		this.footerFormat = footerFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFooterFormat(){ return footerFormat; }

	private Boolean outside;
	/**
 Whether to allow the tooltip to render outside the chart's SVG element box. By defaults (false), the tooltip is rendered within the chart's SVG element, which results in the tooltip being aligned inside the chart area. For small charts, this may result in clipping or overlapping. When true, a separate SVG element is created and overlaid on the page, allowing the tooltip to be aligned inside the page itself. Defaults to true if chart.scrollablePlotArea is activated, otherwise false. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/outside">Small charts with tooltips outside</a>
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
 Split the tooltip into one label per series, with the header close to the axis. This is recommended over shared tooltips for charts with multiple line series, generally making them easier to read. This option takes precedence over tooltip.shared. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/split/">Split tooltip</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-split/">Split tooltip and custom formatter callback</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setSplit(Boolean split) {
		this.split = split;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSplit(){ return split; }

	private HIColor backgroundColor;
	/**
 The background color or gradient for the tooltip. In styled mode, the stroke width is set in the .highcharts-tooltip-box class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-solid/">Yellowish background</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/backgroundcolor-gradient/">Gradient</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Number snap;
	/**
 Proximity snap for graphs or single points. It defaultss to 10 for mouse-powered devices and 25 for touch devices. Note that in most cases the whole plot area captures the mouse movement, and in these cases tooltip.snap doesn't make sense. This applies when stickyTracking is true (defaults) and when the tooltip is shared or split. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-defaults/">10 px by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/snap-50/">50 px on graph</a>
 <br><br><b>defaults:</b><br><br>&ensp;10/25	*/
	public void setSnap(Number snap) {
		this.snap = snap;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSnap(){ return snap; }

	private Boolean shared;
	/**
 When the tooltip is shared, the entire plot area will capture mouse movement or touch events. Tooltip texts for series types with ordered data (not pie, scatter, flags etc) will be shown in a single bubble. This is recommended for single series charts and for tablet/mobile optimized charts. See also tooltip.split, that is better suited for charts with many series, especially line-type series. The tooltip.split option takes precedence over tooltip.shared. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-false/">False by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true/">True</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-x-crosshair/">True with x axis crosshair</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shared-true-mixed-types/">True with mixed series types</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setShared(Boolean shared) {
		this.shared = shared;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShared(){ return shared; }

	private HIFunction formatter;
	/**
 Callback function to format the text of the tooltip from scratch. In case of single or shared tooltips, a string should be returned. In case of split tooltips, it should return an array where the first item is the header, and subsequent items are mapped to the points. Return false to disable tooltip for a specific point on series. A subset of HTML is supported. Unless useHTML is true, the HTML of the tooltip is parsed and converted to SVG, therefore this isn't a complete HTML renderer. The following HTML tags are supported: b, br, em, i, span, strong. Spans can be styled with a style attribute, but only text-related CSS, that is shared with SVG, is handled. The available data in the formatter differ a bit depending on whether the tooltip is shared or split, or belongs to a single point. In a shared/split tooltip, all properties except x, which is common for all points, are kept in an array, this.points. Available data are: - **this.percentage (not shared) /**  **this.points[i].percentage (shared)**:  Stacked series and pies only. The point's percentage of the total. - **this.point (not shared) / this.points[i].point (shared)**:  The point object. The point name, if defined, is available through  this.point.name. - **this.points**:  In a shared tooltip, this is an array containing all other  properties for each point. - **this.series (not shared) / this.points[i].series (shared)**:  The series object. The series name is available through  this.series.name. - **this.total (not shared) / this.points[i].total (shared)**:  Stacked series only. The total value at this point's x value. - **this.x**:  The x value. This property is the same regardless of the tooltip  being shared or not. - **this.y (not shared) / this.points[i].y (shared)**:  The y value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-simple/">Simple string formatting</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-shared/">Formatting with shared tooltip</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-split/">Formatting with split tooltip</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/formatter-conditional-defaults/">Extending defaults formatter</a>
	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private String nullFormat;
	/**
 The HTML of the null point's line in the tooltip. Works analogously to pointFormat. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-nullformat">Format data label and tooltip for null point.</a>
	*/
	public void setNullFormat(String nullFormat) {
		this.nullFormat = nullFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNullFormat(){ return nullFormat; }

	private String pointFormat;
	/**
 The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets. Available variables are point.x, point.y, series. name and series.color and other properties on the same form. Furthermore, point.y can be extended by the tooltip.valuePrefix and tooltip.valueSuffix variables. This can also be overridden for each series, which makes it a good hook for displaying units. In styled mode, the dot is colored by a class name rather than the point color. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/pointformat/">A different point format with value suffix</a>
	*/
	public void setPointFormat(String pointFormat) {
		this.pointFormat = pointFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointFormat(){ return pointFormat; }

	private String xDateFormat;
	/**
 The format for the date in the tooltip header if the X axis is a datetime axis. The defaults is a best guess based on the smallest distance between points in the chart. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/xdateformat/">A different format</a>
	*/
	public void setXDateFormat(String xDateFormat) {
		this.xDateFormat = xDateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXDateFormat(){ return xDateFormat; }

	private HIDateTimeLabelFormats dateTimeLabelFormats;
	/**
 For series on a datetime axes, the date format in the tooltip's header will by defaults be guessed based on the closest data points. This member gives the defaults string representations used for each unit. For an overview of the replacement codes, see `dateFormat`. 
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
	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private Boolean /* boolean */ shadow;
	/**
 Whether to apply a drop shadow to the tooltip. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-defaults/">True by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/shadow/">False</a>
	*/
	public void setShadow(Boolean /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean /* boolean */ getShadow(){ return shadow; }

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
 Enable or disable the tooltip. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/enabled/">Disabled</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-point-events-mouseover/">Disable tooltip and show values on chart instead</a>
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String shape;
	/**
 The name of a symbol to use for the border around the tooltip. Can be one of: "callout", "circle", or "square". When tooltip.split option is enabled, shape is applied to all boxes except header, which is controlled by tooltip.headerShape. Custom callbacks for symbol path generation can also be added to Highcharts.SVGRenderer.prototype.symbols the same way as for `series.marker.symbol`. 
 <br><br><b>defaults:</b><br><br>&ensp;callout	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private HIFunction pointFormatter;
	/**
 A callback function for formatting the HTML output for a single point in the tooltip. Like the pointFormat string, but with more flexibility. 
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
 The pixel width of the tooltip border. In styled mode, the stroke width is set in the .highcharts-tooltip-box class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/bordercolor-defaults/">2px by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/borderwidth/">No border (shadow only)</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/tooltip-border-background/">Tooltip in styled mode</a>
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Boolean followPointer;
	/**
 Whether the tooltip should follow the mouse as it moves across columns, pie slices and other point types with an extent. By defaults it behaves this way for pie, polygon, map, sankey and wordcloud series by override in the plotOptions for those series types. For touch moves to behave the same way, followTouchMove must be true also. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
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
 How many decimals to show in each series' y value. This is overridable in each series' tooltip options object. The defaults is to preserve all decimals. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/tooltip/valuedecimals/">Set decimals, prefix and suffix for the value</a>
	*/
	public void setValueDecimals(Number valueDecimals) {
		this.valueDecimals = valueDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValueDecimals(){ return valueDecimals; }

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
			params.put("shadow", this.shadow);
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
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		return params;
	}

}