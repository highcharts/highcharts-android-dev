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



public class HILabels extends Observable implements HIChartsJSONSerializable { 

	private ArrayList <HIItems> items;
/**
An HTML label that can be positioned anywhere in the chart area.
*/
	public void setItems(ArrayList items) {
		this.items = items;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getItems(){ return items; }

	private HIStyle style;
/**
Shared CSS styles for all labels.
 <br><br><b>default:</b><br><br>&ensp;{"color": "#333333"}*/
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private Number y;
/**
* description: The y position offset of the label relative to the tick position
on the axis.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/ : Y axis labels placed on grid lines* default: 3
*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number distance;
/**
* description: Angular gauges and solid gauges only. The label's pixel distance
from the perimeter of the plot area.
* default: -25
*/
	public void setDistance(Number distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDistance(){ return distance; }

	private String align;
/**
* description: What part of the string the given position is anchored to. Can
be one of "left", "center" or "right". The exact position
also depends on the labels.x setting.

Angular gauges and solid gauges defaults to center.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/labels-align-left/ : Left* accepted values: ["left", "center", "right"]
* default: right
*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Number x;
/**
* description: The x position offset of the label relative to the tick position
on the axis. Defaults to -15 for left axis, 15 for right axis.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-x/ : Y axis labels placed on grid lines* default: -8
*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number staggerLines;
/**
Horizontal axes only. The number of lines to spread the labels
over to make room or tighter labels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-staggerlines/">Show labels over two lines</a>*/
	public void setStaggerLines(Number staggerLines) {
		this.staggerLines = staggerLines;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStaggerLines(){ return staggerLines; }

	private Number zIndex;
/**
The Z index for the axis labels.
 <br><br><b>default:</b><br><br>&ensp;7*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private Boolean reserveSpace;
/**
Whether to reserve space for the labels. By default, space is
reserved for the labels in these cases:

* On all horizontal axes.
* On vertical axes if label.align is right on a left-side
axis or left on a right-side axis.
* On vertical axes if label.align is center.

This can be turned off when for example the labels are rendered
inside the plot area instead of outside.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace/">No reserved space, labels inside plot</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace-true/">Left-aligned labels on a vertical category axis</a>*/
	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReserveSpace(){ return reserveSpace; }

	private String format;
/**
A [format string](https://www.highcharts.com/docs/chart-
concepts/labels-and-string-formatting) for the axis label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/labels-format/">Add units to Y axis label</a> <br><br><b>default:</b><br><br>&ensp;{value}*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Number autoRotationLimit;
/**
When each category width is more than this many pixels, we don't
apply auto rotation. Instead, we lay out the axis label with word
wrap. A lower limit makes sense when the label contains multiple
short words that don't extend the available horizontal space for
each label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotationlimit/">Lower limit</a> <br><br><b>default:</b><br><br>&ensp;80*/
	public void setAutoRotationLimit(Number autoRotationLimit) {
		this.autoRotationLimit = autoRotationLimit;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAutoRotationLimit(){ return autoRotationLimit; }

	private Boolean enabled;
/**
Enable or disable the axis labels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-enabled/">X axis labels disabled</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String position3d;
/**
Defines how the labels are be repositioned according to the 3D chart
orientation.
- 'offset': Maintain a fixed horizontal/vertical distance from the
     tick marks, despite the chart orientation. This is the backwards
     compatible behavior, and causes skewing of X and Z axes.
- 'chart': Preserve 3D position relative to the chart.
  This looks nice, but hard to read if the text isn't
  forward-facing.
- 'flap': Rotated text along the axis to compensate for the chart
     orientation. This tries to maintain text as legible as possible
     on all orientations.
- 'ortho': Rotated text along the axis direction so that the labels
     are orthogonal to the axis. This is very similar to 'flap',
     but prevents skewing the labels (X and Y scaling are still
     present).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a> <br><br><b>accepted values:</b><br><br>&ensp;['offset', 'chart', 'flap', 'ortho']*/
	public void setPosition3d(String position3d) {
		this.position3d = position3d;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition3d(){ return position3d; }

	private Number padding;
/**
The pixel padding for axis labels, to ensure white space between
them.
 <br><br><b>default:</b><br><br>&ensp;5*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private Number step;
/**
To show only every _n_'th label on the axis, set the step to _n_.
Setting the step to 2 shows every other label.

By default, the step is calculated automatically to avoid
overlap. To prevent this, set it to 1\. This usually only
happens on a category axis, and is often a sign that you have
chosen the wrong axis type.

Read more at
[Axis docs](https://www.highcharts.com/docs/chart-concepts/axes)
=> What axis should I use?
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step/">Showing only every other axis label on a categorized x-axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step-auto/">Auto steps on a category axis</a>*/
	public void setStep(Number step) {
		this.step = step;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStep(){ return step; }

	private Boolean skew3d;
/**
If enabled, the axis labels will skewed to follow the perspective.

This will fix overlapping labels and titles, but texts become less
legible due to the distortion.

The final appearance depends heavily on labels.position3d.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a>*/
	public void setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkew3d(){ return skew3d; }

	private HIFunction formatter;
/**
Callback JavaScript function to format the label. The value
is given by this.value. Additional properties for this are
axis, chart, isFirst and isLast. The value of the default
label formatter can be retrieved by calling
this.axis.defaultLabelFormatter.call(this) within the function.

Defaults to:

function() {
    return this.value;
}
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-formatter-linked/">Linked category names</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-formatter-extended/">Modified numeric labels</a>*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Number rotation;
/**
Rotation of the labels in degrees.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-rotation/">X axis labels rotated 90Â°</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Boolean useHTML;
/**
Whether to [use HTML](https://www.highcharts.com/docs/chart-
concepts/labels-and-string-formatting#html) to render the labels.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private ArrayList<Number> autoRotation;
/**
For horizontal axes, the allowed degrees of label rotation
to prevent overlapping labels. If there is enough space,
labels are not rotated. As the chart gets narrower, it
will start rotating the labels -45 degrees, then remove
every second label and try again with rotations 0 and -45 etc.
Set it to false to disable rotation, which will
cause the labels to word-wrap if possible.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-default/">Default auto rotation of 0 or -45</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-0-90/">Custom graded auto rotation</a> <br><br><b>default:</b><br><br>&ensp;[-45]*/
	public void setAutoRotation(ArrayList<Number> autoRotation) {
		this.autoRotation = autoRotation;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getAutoRotation(){ return autoRotation; }

	private HIPoint point;
/**
This option defines the point to which the label will be connected.
It can be either the point which exists in the series - it is
referenced by the point's id - or a new point with defined x, y
properies and optionally axes.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/mock-point/">Attach annotation to a mock point</a>*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.point.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private Boolean allowOverlap;
/**
Whether to allow the annotation's labels to overlap.
To make the labels less sensitive for overlapping,
the can be set to 0.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/tooltip-like/">Hide overlapping labels</a>*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private HIColor borderColor;
/**
The border color for the annotation's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private String verticalAlign;
/**
The vertical alignment of the annotation's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/">Set labels position</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private Number borderRadius;
/**
The border radius in pixels for the annotaiton's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private String text;
/**
Alias for the format option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/">Set labels text</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private Boolean crop;
/**
Whether to hide the annotation's label that is outside the plot
area.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels</a>*/
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private String className;
/**
A class name for styling by CSS.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/annotations">Styled mode annotations</a>*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private String shape;
/**
The name of a symbol to use for the border around the label.
Symbols are predefined functions on the Renderer object.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shapes/">Available shapes for labels</a>*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private Number borderWidth;
/**
The border width in pixels for the annotation's label
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private HIColor backgroundColor;
/**
The background color or gradient for the annotation's label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private String overflow;
/**
How to handle the annotation's label that flow outside the plot
area. The justify option aligns the label inside the plot area.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/">Crop or justify labels
*</a> <br><br><b>accepted values:</b><br><br>&ensp;["none", "justify"]*/
	public void setOverflow(String overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOverflow(){ return overflow; }

	private Object /* Boolean|Object */ shadow;
/**
The shadow of the box. The shadow can be an object configuration
containing color, offsetX, offsetY, opacity and width.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/">Set labels graphic options</a>*/
	public void setShadow(Object /* Boolean|Object */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Boolean|Object */ getShadow(){ return shadow; }



	public HILabels() {

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
		if (this.items != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.items) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("items", array);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.staggerLines != null) {
			params.put("staggerLines", this.staggerLines);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.reserveSpace != null) {
			params.put("reserveSpace", this.reserveSpace);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.autoRotationLimit != null) {
			params.put("autoRotationLimit", this.autoRotationLimit);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.position3d != null) {
			params.put("position3d", this.position3d);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.step != null) {
			params.put("step", this.step);
		}
		if (this.skew3d != null) {
			params.put("skew3d", this.skew3d);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.autoRotation != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.autoRotation) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("autoRotation", array);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		return params;
	}

}