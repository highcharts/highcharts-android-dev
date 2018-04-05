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



public class HIHover implements HIChartsJSONSerializable { 

	public Number radiusPlus;

/**
Enable separate styles for the hovered series to visualize that
the user hovers either the series itself or the legend. .
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/">Line</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/">Column</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/">Pie</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
Animation setting for hovering the graph in line-type series.
 <br><br><b>default:</b><br><br>&ensp;{ "duration": 50 }*/
	public HIAnimation animation;

/**
Pixel width of the graph line. By default this property is
undefined, and the lineWidthPlus property dictates how much
to increase the linewidth from normal state.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/">5px line on hover</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Number lineWidth;

/**
The additional line width for the graph of a hovered series.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels wider</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number lineWidthPlus;

/**
Options for the halo appearing around the hovered point in line-
type series as well as outside the hovered slice in pie charts.
By default the halo is filled by the current point or series
color with an opacity of 0.25\. The halo can be disabled by
setting the halo option to false.

In styled mode, the halo is styled with the .highcharts-halo
class, with colors inherited from .highcharts-color-{n}.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/">Halo options</a>*/
	public HIHalo halo;

/**
The fill color of the marker in hover state. When null, the
series' or point's fillColor for normal state is used.
 <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor fillColor;

/**
The color of the point marker's outline. When null, the
series' or point's lineColor for normal state is used.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/">White fill color, black line color</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor lineColor;

/**
The radius of the point marker. In hover state, it defaults
to the normal state's radius + 2 as per the
radiusPlus
option.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/">10px radius</a>*/
	public Number radius;

/**
How much to brighten the point on interaction. Requires the main
color to be defined in hex or rgb(a) format.

In styled mode, the hover brightening is by default replaced
with a fill-opacity set in the .highcharts-point:hover rule.
*/
	public Number brightness;

/**
Opacity for the links between nodes in the sankey diagram in
hover mode.
*/
	public Number linkOpacity;

/**
The border color for the hovered state.
*/
	public String borderColor;

/**
The opacity of a point in treemap. When a point has children,
the visibility of the children is determined by the opacity.
 <br><br><b>default:</b><br><br>&ensp;0.75*/
	public Number opacity;

/**
The shadow option for hovered state.
*/
	public Boolean shadow;

/**
A specific color for the hovered point.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public HIColor color;


	public HIHover() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.radiusPlus != null) {
			params.put("radiusPlus", this.radiusPlus);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.lineWidthPlus != null) {
			params.put("lineWidthPlus", this.lineWidthPlus);
		}
		if (this.halo != null) {
			params.put("halo", this.halo.getParams());
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.brightness != null) {
			params.put("brightness", this.brightness);
		}
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		return params;
	}

}