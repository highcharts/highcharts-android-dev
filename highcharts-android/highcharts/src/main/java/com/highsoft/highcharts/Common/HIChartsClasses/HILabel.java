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
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HILabel implements HIChartsJSONSerializable { 


/**
CSS styles for the text label.

In styled mode, the labels are styled by the
.highcharts-plot-line-label class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-style/">Blue and bold label</a>*/
	public HIStyle style;

/**
Vertical alignment of the label relative to the plot line. Can be
one of "top", "middle" or "bottom".
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/">Vertically centered label</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"] <br><br><b>default:</b><br><br>&ensp;top*/
	public String verticalAlign;

/**
The text itself. A subset of HTML is supported.
*/
	public String text;

/**
Horizontal alignment of the label. Can be one of "left", "center"
or "right".
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/">Aligned to the right</a> <br><br><b>default:</b><br><br>&ensp;left*/
	public String align;

/**
The text alignment for the label. While align determines where
the texts anchor point is placed within the plot band, textAlign
determines how the text is aligned against its anchor point. Possible
values are "left", "center" and "right". Defaults to the same as
the align option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-textalign/">Text label in bottom position</a>*/
	public String textAlign;

/**
Vertical position of the text baseline relative to the alignment.
 Default varies by orientation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-y/">Label below the plot line</a>*/
	public Number y;

/**
Horizontal position relative the alignment. Default varies by orientation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/">Aligned 10px from the right edge</a>*/
	public Number x;

/**
Rotation of the text label in degrees. Defaults to 0 for horizontal
plot lines and 90 for vertical lines.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/">Slanted text</a>*/
	public Number rotation;

/**
Whether to [use HTML](http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html) to render the labels.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean useHTML;

/**
For area-like series, allow the font size to vary so that
small areas get a smaller font size. The default applies this
effect to area-like series but not line-like series.
*/
	public Number minFontSize;

/**
For area-like series, allow the font size to vary so that
small areas get a smaller font size. The default applies this
effect to area-like series but not line-like series.
*/
	public Number maxFontSize;

/**
Enable the series label per series.
*/
	public Boolean enabled;

/**
If the label is closer than this to a neighbour graph, draw a
connector.
*/
	public Number connectorNeighbourDistance;

/**
Draw the label on the area of an area series. By default it
is drawn on the area. Set it to false to draw it next to
the graph instead.
*/
	public Boolean onArea;

/**
An array of boxes to avoid when laying out the labels. Each 
item has a left, right, top and bottom property.
*/
	public ArrayList boxesToAvoid;

/**
Allow labels to be placed distant to the graph if necessary,
and draw a connector line to the graph.
*/
	public Boolean connectorAllowed;


	public HILabel() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.minFontSize != null) {
			params.put("minFontSize", this.minFontSize);
		}
		if (this.maxFontSize != null) {
			params.put("maxFontSize", this.maxFontSize);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.connectorNeighbourDistance != null) {
			params.put("connectorNeighbourDistance", this.connectorNeighbourDistance);
		}
		if (this.onArea != null) {
			params.put("onArea", this.onArea);
		}
		if (this.boxesToAvoid != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.boxesToAvoid) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("boxesToAvoid", array);
		}
		if (this.connectorAllowed != null) {
			params.put("connectorAllowed", this.connectorAllowed);
		}
		return params;
	}

}