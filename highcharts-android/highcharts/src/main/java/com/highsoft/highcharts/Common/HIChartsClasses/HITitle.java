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


/**
* description: The chart's main title.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/title/ : Title options demonstrated
*/
public class HITitle implements HIChartsJSONSerializable { 


/**
* description: Whether to reserve space for the title when laying out the axis.
* default: true
*/
	public Boolean reserveSpace;

/**
* description: The pixel distance between the axis labels or line and the title.
 Defaults to 0 for horizontal axes, 10 for vertical

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-margin/ : Y axis title margin of 60
*/
	public Number margin;

/**
* description: Horizontal pixel offset of the title position.
* default: 0
*/
	public Number x;

/**
* description: Vertical pixel offset of the title position.
*/
	public Number y;

/**
* description: Deprecated. Set the text to null to disable the title.
* default: middle
*/
	public String enabled;

/**
* description: If enabled, the axis title will skewed to follow the perspective.
This will fix overlapping labels and titles, but texts become less
legible due to the distortion.
The final appearance depends heavily on title.position3d.
A null value will use the config from labels.skew3d.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/ : Skewed labels
* accepted values: [false, true, null]
*/
	public Boolean skew3d;

/**
* description: The distance of the axis title from the axis line. By default, this
distance is computed from the offset width of the labels, the labels'
distance from the axis and the title's margin. However when the offset
option is set, it overrides all this.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/ : Place the axis title on top of the axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/ : Place the axis title on top of the Y axis
*/
	public Number offset;

/**
* description: CSS styles for the title. If the title text is longer than the
axis length, it will wrap to multiple lines by default. This can
be customized by setting textOverflow: 'ellipsis', by 
setting a specific width or by setting wordSpace: 'nowrap'.
In styled mode, the stroke width is given in the
.highcharts-axis-title class.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-style/ : Red
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/axis/ : Styled mode
* default: { "color": "#666666" }
*/
	public HIStyle style;

/**
* description: Defines how the title is repositioned according to the 3D chart
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
null: Will use the config from labels.position3d


* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/ : Skewed labels
* accepted values: ['offset', 'chart', 'flap', 'ortho', null]
*/
	public String position3d;

/**
* description: The rotation of the text in degrees. 0 is horizontal, 270 is vertical
reading from bottom to top.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/ : Horizontal
* default: 0
*/
	public Number rotation;

/**
* description: Alignment of the title relative to the axis values. Possible
values are "low", "middle" or "high".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-low/ : "low"
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-center/ : "middle" by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-high/ : "high"
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/ : Place the Y axis title on top of the axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/title-align/ : Aligned to "high" value
* accepted values: ["low", "middle", "high"]
* default: middle
*/
	public String align;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html : use HTML to render the axis title.
* default: false
*/
	public Boolean useHTML;

/**
* description: The actual text of the axis title. It can contain basic HTML text
markup like ,  and spans with style.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-text/ : Custom HTML
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/title-text/ : Titles for both axes
* default: null
*/
	public String text;

/**
* description: When the title is floating, the plot area will not move to make space
for it.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/ : False by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/floating/ : True - title on top of the plot area
* default: false
*/
	public Boolean floating;

/**
* description: The vertical alignment of the title. Can be one of "top", "middle"
and "bottom". When a value is given, the title behaves as if floating were true.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/verticalalign/ : Chart title in bottom right corner
* accepted values: ["top", "middle", "bottom"]
*/
	public String verticalAlign;

/**
* description: Adjustment made to the title width, normally to reserve space for
the exporting burger menu.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/ : Wider menu, greater padding

* default: -44
*/
	public Number widthAdjust;


	public HITitle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.reserveSpace != null) {
			params.put("reserveSpace", this.reserveSpace);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.skew3d != null) {
			params.put("skew3d", this.skew3d);
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.position3d != null) {
			params.put("position3d", this.position3d);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.widthAdjust != null) {
			params.put("widthAdjust", this.widthAdjust);
		}
		return params;
	}

}