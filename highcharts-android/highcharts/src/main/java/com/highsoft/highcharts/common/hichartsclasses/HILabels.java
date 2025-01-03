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
import java.util.ArrayList;
import java.util.HashMap;



public class HILabels extends HIFoundation { 

	private Object /* Number, String */ distance;
	/**
/** * description: The label's pixel distance from the perimeter of the plot area. On cartesian charts, this is overridden if the `labels.y` setting is set. On polar charts, if it's a percentage string, it is interpreted the same as `series.radius`, so the label can be aligned under the gauge's shape. * demo: * [Polar chart, labels centered under the arc](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/labels-distance/) 
* defaults: 15
*/
	public void setDistance(Object /* Number, String */ distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getDistance(){ return distance; }

	private String align;
	/**
/** * description: What part of the string the given position is anchored to. Can be one of `"left"`, `"center"` or `"right"`. The exact position also depends on the `labels.x` setting. Angular gauges and solid gauges defaultss to `"center"`. Solid gauges with two labels have additional option `"auto"` for automatic horizontal and vertical alignment. * demo: * [Left](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/labels-align-left/) * [Solid gauge labels auto aligned](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-solidgauge/labels-auto-aligned/) 
*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Number y;
	/**
/** * description: The y position offset of all labels relative to the tick positions on the axis. For polar and radial axis consider the use of the `distance` option. * demo: * [Y axis labels placed on grid lines](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/) 
* defaults: 3
*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
/** * description: The x position offset of all labels relative to the tick positions on the axis. Defaults to -15 for left axis, 15 for right axis. * demo: * [Y axis labels placed on grid lines](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/) 
*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number staggerLines;
	/**
 Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels. 0 disables staggering. 
	*/
	public void setStaggerLines(Number staggerLines) {
		this.staggerLines = staggerLines;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStaggerLines(){ return staggerLines; }

	private Number autoRotationLimit;
	/**
 When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't extend the available horizontal space for each label. 
 <br><br><b>defaults:</b><br><br>&ensp;80	*/
	public void setAutoRotationLimit(Number autoRotationLimit) {
		this.autoRotationLimit = autoRotationLimit;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAutoRotationLimit(){ return autoRotationLimit; }

	public enum Position3d {
		OFFSET("offset"),
		CHART("chart"),
		FLAP("flap"),
		ORTHO("ortho");

		private final String value;

		Position3d(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setPosition3d(Position3d position3d) {
		this.position3d = position3d.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String position3d;
	/**
 Defines how the labels are be repositioned according to the 3D chart orientation. - `'offset'`: Maintain a fixed horizontal/vertical distance from  the tick marks, despite the chart orientation. This is the  backwards compatible behavior, and causes skewing of X and Z  axes. - `'chart'`: Preserve 3D position relative to the chart. This  looks nice, but hard to read if the text isn't forward-facing. - `'flap'`: Rotated text along the axis to compensate for the  chart orientation. This tries to maintain text as legible as  possible on all orientations. - `'ortho'`: Rotated text along the axis direction so that the  labels are orthogonal to the axis. This is very similar to  `'flap'`, but prevents skewing the labels (X and Y scaling are  still present). 
 <br><br><b>defaults:</b><br><br>&ensp;offset	*/
	public void setPosition3d(String position3d) {
		this.position3d = position3d;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition3d(){ return position3d; }

	private Number rotation;
	/**
 Rotation of the labels in degrees. When `undefined`, the `autoRotation` option takes precedence. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private HICSSObject style;
	/**
 CSS styles for the label. Use `lineClamp` to control wrapping of category labels. Use `textOverflow: 'none'` to prevent ellipsis (dots). In styled mode, the labels are styled with the `.highcharts-axis-labels` class. 
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Boolean reserveSpace;
	/**
 Whether to reserve space for the labels. By defaults, space is reserved for the labels in these cases: * On all horizontal axes. * On vertical axes if `label.align` is `right` on a left-side axis or `left` on a right-side axis. * On vertical axes if `label.align` is `center`. This can be turned off when for example the labels are rendered inside the plot area instead of outside. 
	*/
	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReserveSpace(){ return reserveSpace; }

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

	private Boolean skew3d;
	/**
 If enabled, the axis labels will skewed to follow the perspective. This will fix overlapping labels and titles, but texts become less legible due to the distortion. The final appearance depends heavily on `labels.position3d`. 
	*/
	public void setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkew3d(){ return skew3d; }

	private HIFunction formatter;
	/**
 Callback JavaScript function to format the label. The value is given by `this.value`. Additional properties for `this` are `axis`, `chart`, `isFirst`, `isLast` and `text` which holds the value of the defaults formatter. Defaults to a built in function returning a formatted string depending on whether the axis is `category`, `datetime`, `numeric` or other. 
	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private ArrayList<Number> autoRotation;
	/**
 For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then remove every second label and try again with rotations 0 and -45 etc. Set it to `undefined` to disable rotation, which will cause the labels to word-wrap if possible. Defaults to `[-45]`` on bottom and top axes, `undefined` on left and right axes. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setAutoRotation(ArrayList<Number> autoRotation) {
		this.autoRotation = autoRotation;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getAutoRotation(){ return autoRotation; }

	private Boolean allowOverlap;
	/**
 Whether to allow the axis labels to overlap. When false, overlapping labels are hidden. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private Number zIndex;
	/**
 The Z index for the axis labels. 
 <br><br><b>defaults:</b><br><br>&ensp;7	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String format;
	/**
 A format string for the axis label. The context is available as format string variables. For example, you can use `{text}` to insert the defaults formatted text. The recommended way of adding units for the label is using `text`, for example `{text} km`. To add custom numeric or datetime formatting, use `{value}` with formatting, for example `{value:.1f}` or `{value:%Y-%m-%d}`. See [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) for more examples of formatting. The defaults value is not specified due to the dynamic nature of the defaults implementation. 
	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Number padding;
	/**
 The pixel padding for axis labels, to ensure white space between them. Defaults to 4 for horizontal axes, 1 for vertical. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private Number step;
	/**
 To show only every _n_'th label on the axis, set the step to _n_. Setting the step to 2 shows every other label. By defaults, when 0, the step is calculated automatically to avoid overlap. To prevent this, set it to 1\. This usually only happens on a category axis, and is often a sign that you have chosen the wrong axis type. Read more at [Axis docs](https://www.highcharts.com/docs/chart-concepts/axes) => What axis should I use? 
	*/
	public void setStep(Number step) {
		this.step = step;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStep(){ return step; }

	public enum Overflow {
		ALLOW("allow"),
		JUSTIFY("justify");

		private final String value;

		Overflow(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setOverflow(Overflow overflow) {
		this.overflow = overflow.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String overflow;
	/**
 How to handle overflowing labels on horizontal axis. If set to `"allow"`, it will not be aligned at all. By defaults it `"justify"` labels inside the chart area. If there is room to move it, it will be aligned to the edge, else it will be removed. 
 <br><br><b>defaults:</b><br><br>&ensp;justify	*/
	public void setOverflow(String overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOverflow(){ return overflow; }

	private Boolean enabled;
	/**
 Enable or disable the axis labels. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIAnnotationMockPointOptionsObject point;
	/**
 This option defines the point to which the label will be connected. It can be either the point which exists in the series - it is referenced by the point's id - or a new point with defined x, y properties and optionally axes. 
	*/
	public void setPoint(HIAnnotationMockPointOptionsObject point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnnotationMockPointOptionsObject getPoint(){ return point; }

	private Boolean includeInDataExport;
	/**
 Whether the annotation is visible in the exported data table. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setIncludeInDataExport(Boolean includeInDataExport) {
		this.includeInDataExport = includeInDataExport;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIncludeInDataExport(){ return includeInDataExport; }

	private Number borderRadius;
	/**
 The border radius in pixels for the annotation's label. 
 <br><br><b>defaults:</b><br><br>&ensp;3	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private String text;
	/**
 Alias for the format option. 
	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private HIAccessibility accessibility;
	/**
 Accessibility options for an annotation label. 
	*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private Boolean crop;
	/**
 Whether to hide the annotation's label that is outside the plot area. 
	*/
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private String shape;
	/**
 The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object. 
 <br><br><b>defaults:</b><br><br>&ensp;callout	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private HIColor borderColor;
	/**
 The border color for the annotation's label. 
 <br><br><b>defaults:</b><br><br>&ensp;#000000	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIColor backgroundColor;
	/**
 The background color or gradient for the annotation's label. 
 <br><br><b>defaults:</b><br><br>&ensp;rgba(0, 0, 0, 0.75)	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private HIShadowOptionsObject /* boolean */ shadow;
	/**
 The shadow of the box. The shadow can be an object configuration containing `color`, `offsetX`, `offsetY`, `opacity` and `width`. 
	*/
	public void setShadow(HIShadowOptionsObject /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public HIShadowOptionsObject /* boolean */ getShadow(){ return shadow; }

	private String verticalAlign;
	/**
 The vertical alignment of the annotation's label. 
 <br><br><b>defaults:</b><br><br>&ensp;bottom	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String className;
	/**
 A class name for styling by CSS. 
 <br><br><b>defaults:</b><br><br>&ensp;highcharts-no-tooltip	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number borderWidth;
	/**
 The border width in pixels for the annotation's label 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Boolean clip;
	/**
 Whether to hide labels that are outside the plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setClip(Boolean clip) {
		this.clip = clip;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getClip(){ return clip; }



	public HILabels() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.staggerLines != null) {
			params.put("staggerLines", this.staggerLines);
		}
		if (this.autoRotationLimit != null) {
			params.put("autoRotationLimit", this.autoRotationLimit);
		}
		if (this.position3d != null) {
			params.put("position3d", this.position3d);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.reserveSpace != null) {
			params.put("reserveSpace", this.reserveSpace);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.skew3d != null) {
			params.put("skew3d", this.skew3d);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.autoRotation != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.autoRotation) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("autoRotation", array);
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.step != null) {
			params.put("step", this.step);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.includeInDataExport != null) {
			params.put("includeInDataExport", this.includeInDataExport);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.clip != null) {
			params.put("clip", this.clip);
		}
		return params;
	}

}