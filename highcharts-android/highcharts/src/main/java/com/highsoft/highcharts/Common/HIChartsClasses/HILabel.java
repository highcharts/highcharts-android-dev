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
* description: Text labels for the plot bands
*/
public class HILabel implements HIChartsJSONSerializable { 


/**
* description: Allow labels to be placed distant to the graph if necessary,
and draw a connector line to the graph.
* default: True
*/
	public Boolean connectorAllowed;

/**
* description: An array of boxes to avoid when laying out the labels. Each 
item has a left, right, top and bottom property.
*/
	public ArrayList boxesToAvoid;

/**
* description: Draw the label on the area of an area series. By default it
is drawn on the area. Set it to false to draw it next to
the graph instead.
*/
	public Boolean onArea;

/**
* description: For area-like series, allow the font size to vary so that
small areas get a smaller font size. The default applies this
effect to area-like series but not line-like series.
*/
	public Number maxFontSize;

/**
* description: If the label is closer than this to a neighbour graph, draw a
connector.
* default: 24
*/
	public Number connectorNeighbourDistance;

/**
* description: For area-like series, allow the font size to vary so that
small areas get a smaller font size. The default applies this
effect to area-like series but not line-like series.
*/
	public Number minFontSize;

/**
* description: Styles for the series label. The color defaults to the series
color, or a contrast color if onArea.
*/
	public HIStyle style;

/**
* description: Enable the series label per series.
* default: True
*/
	public Boolean enabled;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html : use HTML to render the labels.
* default: false
*/
	public Boolean useHTML;

/**
* description: Horizontal position relative the alignment. Default varies by orientation.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-align/ : Aligned 10px from the right edge
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/ : Plot band with labels
*/
	public Number x;

/**
* description: Rotation of the text label in degrees .

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/ : Vertical text
* default: 0
*/
	public Number rotation;

/**
* description: The string text itself. A subset of HTML is supported.
*/
	public String text;

/**
* description: Vertical position of the text baseline relative to the alignment.
 Default varies by orientation.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-y/ : Label on x axis
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/ : Plot band with labels
*/
	public Number y;

/**
* description: Horizontal alignment of the label. Can be one of "left", "center"
or "right".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-align/ : Aligned to the right
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/ : Plot band with labels
* default: center
*/
	public String align;

/**
* description: The text alignment for the label. While align determines where
the texts anchor point is placed within the plot band, textAlign
determines how the text is aligned against its anchor point. Possible
values are "left", "center" and "right". Defaults to the same as
the align option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/ : Vertical text in center position but text-aligned left
*/
	public String textAlign;

/**
* description: Vertical alignment of the label relative to the plot band. Can be
one of "top", "middle" or "bottom".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotbands-label-verticalalign/ : Vertically centered label
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotbands-label/ : Plot band with labels
* default: top
*/
	public String verticalAlign;


	public HILabel() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.connectorAllowed != null) {
			params.put("connectorAllowed", this.connectorAllowed);
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
		if (this.onArea != null) {
			params.put("onArea", this.onArea);
		}
		if (this.maxFontSize != null) {
			params.put("maxFontSize", this.maxFontSize);
		}
		if (this.connectorNeighbourDistance != null) {
			params.put("connectorNeighbourDistance", this.connectorNeighbourDistance);
		}
		if (this.minFontSize != null) {
			params.put("minFontSize", this.minFontSize);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		return params;
	}

}