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
* description: HTML labels that can be positioned anywhere in the chart area.
*/
public class HILabels implements HIChartsJSONSerializable { 


/**
* description: Whether to allow the annotation's labels to overlap.
To make the labels less sensitive for overlapping, 
the can be set to 0.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/tooltip-like/ : Hide overlapping labels
*/
	public Boolean allowOverlap;

/**
* description: A https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting : format string for the data label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/ : Set labels text
* default: undefined
*/
	public String format;

/**
* description: How to handle the annotation's label that flow outside the plot
area. The justify option aligns the label inside the plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/ : Crop or justify labels
* accepted values: ["none", "justify"]
* default: justify
*/
	public String overflow;

/**
* description: When either the borderWidth or the backgroundColor is set,
this    is the padding within the box.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: 5
*/
	public Number padding;

/**
* description: This option defines the point to which the label will be connected.
It can be either the point which exists in the series - it is referenced
by the point's id - or a new point with defined x, y properies
and optionally axes.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/mock-point/ : Attach annotation to a mock point
*/
	public HIPoint point;

/**
* description: The border radius in pixels for the annotaiton's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: 1
*/
	public Number borderRadius;

/**
* description: Callback JavaScript function to format the annotation's label. Note that
if a format or text are defined, the format or text take precedence
and the formatter is ignored. This refers to a point object.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/ : Set labels text
* default: function () {
	return defined(this.y) ? this.y : 'Annotation label';
}
*/
	public HIGFunction /* Function */ formatter;

/**
* description: Styles for the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
*/
	public HIStyle style;

/**
* description: Whether to hide the annotation's label that is outside the plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-crop-overflow/ : Crop or justify labels
*/
	public Boolean crop;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html : use HTML to render the annotation's label.
* default: false
*/
	public Boolean useHTML;

/**
* description: The vertical alignment of the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* accepted values: ["top", "middle", "bottom"]
* default: bottom
*/
	public String verticalAlign;

/**
* description: The label's pixel distance from the point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* default: undefined
*/
	public Number distance;

/**
* description: The border width in pixels for the annotation's label

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: 1
*/
	public Number borderWidth;

/**
* description: Alias for the format option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-text/ : Set labels text
* default: undefined
*/
	public String text;

/**
* description: The shadow of the box. The shadow can be an object configuration
containing color, offsetX, offsetY, opacity and width.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
*/
	public Object /* Boolean, Object */ shadow;

/**
* description: The y position offset of the label relative to the point.
Note that if a distance is defined, the distance takes
precedence over x and y options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* default: -16
*/
	public Number y;

/**
* description: The x position offset of the label relative to the point.
Note that if a distance is defined, the distance takes
precedence over x and y options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
*/
	public Number x;

/**
* description: The name of a symbol to use for the border around the label.
Symbols are predefined functions on the Renderer object.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shapes/ : Available shapes for labels
* default: callout
*/
	public String shape;

/**
* description: The background color or gradient for the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: rgba(0, 0, 0, 0.75)
*/
	public HIColor backgroundColor;

/**
* description: The border color for the annotation's label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-presentation/ : Set labels graphic options
* default: black
*/
	public HIColor borderColor;

/**
* description: The alignment of the annotation's label. If right,
the right side of the label should be touching the point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/label-position/ : Set labels position
* accepted values: ["left", "center", "right"]
* default: center
*/
	public String align;

/**
* description: When each category width is more than this many pixels, we don't
apply auto rotation. Instead, we lay out the axis label with word
wrap. A lower limit makes sense when the label contains multiple
short words that don't extend the available horizontal space for
each label.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotationlimit/ : Lower limit
* default: 80
*/
	public Number autoRotationLimit;

/**
* description: If enabled, the axis labels will skewed to follow the perspective. 
This will fix overlapping labels and titles, but texts become less
legible due to the distortion.
The final appearance depends heavily on labels.position3d.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/ : Skewed labels
*/
	public Boolean skew3d;

/**
* description: Rotation of the labels in degrees.

* demo: X axis labels rotated 90Â°
* default: 0
*/
	public Number rotation;

/**
* description: Horizontal axes only. The number of lines to spread the labels over
to make room or tighter labels. .

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-staggerlines/ : Show labels over two lines
* default: null
*/
	public Number staggerLines;

/**
* description: The Z index for the axis labels.
* default: 7
*/
	public Number zIndex;

/**
* description: Whether to reserve space for the labels. This can be turned off when
for example the labels are rendered inside the plot area instead
of outside.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-reservespace/ : No reserved space, labels inside plot
*/
	public Boolean reserveSpace;

/**
* description: For horizontal axes, the allowed degrees of label rotation to prevent
overlapping labels. If there is enough space, labels are not rotated.
As the chart gets narrower, it will start rotating the labels -45
degrees, then remove every second label and try again with rotations
0 and -45 etc. Set it to false to disable rotation, which will
cause the labels to word-wrap if possible.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-default/ : Default auto rotation of 0 or -45
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-autorotation-0-90/ : Custom graded auto rotation
* default: [-45]
*/
	public ArrayList<Double> autoRotation;

/**
* description: Enable or disable the axis labels.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-enabled/ : X axis labels disabled
* default: True
*/
	public Boolean enabled;

/**
* description: Defines how the labels are be repositioned according to the 3D chart
orientation.

'offset': Maintain a fixed horizontal/vertical distance from the
   tick marks, despite the chart orientation. This is the backwards
   compatible behavior, and causes skewing of X and Z axes.
'chart': Preserve 3D position relative to the chart.
This looks nice, but hard to read if the text isn't
forward-facing.
'flap': Rotated text along the axis to compensate for the chart
   orientation. This tries to maintain text as legible as possible on
   all orientations.
'ortho': Rotated text along the axis direction so that the labels
   are orthogonal to the axis. This is very similar to 'flap', but
   prevents skewing the labels (X and Y scaling are still present).


* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/ : Skewed labels
* accepted values: ['offset', 'chart', 'flap', 'ortho']
* default: offset
*/
	public String position3d;

/**
* description: To show only every n'th label on the axis, set the step to n.
Setting the step to 2 shows every other label.
By default, the step is calculated automatically to avoid overlap.
To prevent this, set it to 1. This usually only happens on a category
axis, and is often a sign that you have chosen the wrong axis type.
Read more at http://www.highcharts.com/docs/chart-concepts/axes : Axis docs
=> What axis should I use?

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step/ : Showing only every other axis label on a categorized x axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/labels-step-auto/ : Auto steps on a category axis
* default: null
*/
	public Number step;

/**
* description: A HTML label that can be positioned anywhere in the chart area.
*/
	public ArrayList <HIItems> items;


	public HILabels() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.autoRotationLimit != null) {
			params.put("autoRotationLimit", this.autoRotationLimit);
		}
		if (this.skew3d != null) {
			params.put("skew3d", this.skew3d);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
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
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.position3d != null) {
			params.put("position3d", this.position3d);
		}
		if (this.step != null) {
			params.put("step", this.step);
		}
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
		return params;
	}

}