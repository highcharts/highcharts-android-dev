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
import com.highsoft.highcharts.Common.HIColor;



public class HIMarker implements HIChartsJSONSerializable { 


/**
The color of the marker.
 <br><br><b>default:</b><br><br>&ensp;#999999*/
	public HIColor color;

/**
Animation for the marker as it moves between values. Set to
false to disable animation. Defaults to { duration: 50 }.
*/
	public HIAnimation animation;
	public Boolean enabled;

/**
A predefined shape or symbol for the marker. When null, the symbol
is pulled from options.symbols. Other possible values are "circle",
"square", "diamond", "triangle" and "triangle-down".

Additionally, the URL to a graphic can be given on this form:
"url(graphic.png)". Note that for the image to be applied to exported
charts, its URL needs to be accessible by the export server.

Custom callbacks for symbol path generation can also be added to
Highcharts.SVGRenderer.prototype.symbols. The callback is then
used by its method name, as shown in the demo.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-symbol/">Predefined, graphic and custom markers</a> <br><br><b>accepted values:</b><br><br>&ensp;[null, "circle", "square", "diamond", "triangle",
        "triangle-down"] <br><br><b>default:</b><br><br>&ensp;null*/
	public String symbol;

/**
States for a single point marker.
*/
	public HIStates states;

/**
The fill color of the point marker. When null, the series' or
point's color is used.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">White fill</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor fillColor;

/**
The color of the point marker's outline. When null, the series'
or point's color is used.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">Inherit from series color (null)</a>*/
	public HIColor lineColor;

/**
The width of the point marker's outline.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">2px blue marker</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number lineWidth;

/**
The fill opacity of the bubble markers.
*/
	public Number fillOpacity;

/**
Image markers only. Set the image width explicitly. When using this
option, a width must also be set.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number height;

/**
Image markers only. Set the image width explicitly. When using this
option, a height must also be set.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number width;

/**
The radius of the point marker.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-radius/">Bigger markers</a>*/
	public Number radius;

/**
The threshold for how dense the point markers should be before they
are hidden, given that enabled is not defined. The number indicates
the horizontal distance between the two closest points in the series,
as multiples of the marker.radius. In other words, the default
value of 2 means points are hidden if overlapping horizontally.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabledthreshold">A higher threshold</a>*/
	public Number enabledThreshold;


	public HIMarker() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.symbol != null) {
			params.put("symbol", this.symbol);
		}
		if (this.states != null) {
			params.put("states", this.states.getParams());
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.fillOpacity != null) {
			params.put("fillOpacity", this.fillOpacity);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.enabledThreshold != null) {
			params.put("enabledThreshold", this.enabledThreshold);
		}
		return params;
	}

}