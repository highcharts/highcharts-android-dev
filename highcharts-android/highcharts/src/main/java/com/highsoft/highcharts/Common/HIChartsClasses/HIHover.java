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
* description: Options for the hovered series
*/
public class HIHover implements HIChartsJSONSerializable { 


/**
* description: A specific color for the hovered point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-hover/ : Hover options
* default: undefined
*/
	public HIColor color;

/**
* description: A specific border color for the hovered point. Defaults to
inherit the normal state border color.
*/
	public HIColor borderColor;

/**
* description: Animation setting for hovering the graph in line-type series.
* default: { "duration": 50 }
*/
	public HIAnimation animation;

/**
* description: The additional line width for the graph of a hovered series.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/ : 5 pixels wider
*/
	public Number lineWidthPlus;

/**
* description: How much to brighten the point on interaction. Requires the main
color to be defined in hex or rgb(a) format.
In styled mode, the hover brightening is by default replaced
with a fill-opacity set in the .highcharts-point:hover rule.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-states-hover-brightness/ : Brighten by 0.5
* default: 0.1
*/
	public Number brightness;

/**
* description: In Highcharts 1.0, the appearance of all markers belonging to
the hovered series. For settings on the hover state of the individual
point, see marker.states.hover.
*/
	public HIMarker marker;
	public Boolean shadow;

/**
* description: Pixel with of the graph line. By default this property is
undefined, and the lineWidthPlus property dictates how much
to increase the linewidth from normal state.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/ : 5px line on hover
* default: undefined
*/
	public Number lineWidth;

/**
* description: Options for the halo appearing around the hovered point in line-
type series as well as outside the hovered slice in pie charts.
By default the halo is filled by the current point or series
color with an opacity of 0.25. The halo can be disabled by setting
the halo option to false.
In styled mode, the halo is styled with the .highcharts-halo class, with colors inherited from .highcharts-color-{n}.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/ : Halo options
*/
	public HIHalo halo;

/**
* description: Enable separate styles for the hovered series to visualize that the
user hovers either the series itself or the legend. .

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/ : Line
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/ : Column
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/ : Pie
* default: true
*/
	public Boolean enabled;

/**
* description: The radius of the point marker. In hover state, it defaults to the
normal state's radius + 2 as per the radiusPlus option.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/ : 10px radius
*/
	public Number radius;

/**
* description: The number of pixels to increase the radius of the hovered point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/ : 5 pixels greater radius on hover
* default: 2
*/
	public Number radiusPlus;

/**
* description: The fill color of the marker in hover state.
* default: null
*/
	public HIColor fillColor;

/**
* description: The color of the point marker's outline. When null, the
series' or point's color is used.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/ : White fill color, black line color
* default: #ffffff
*/
	public HIColor lineColor;

/**
* description: Opacity for the links between nodes in the sankey diagram in
hover mode.
* default: 1
*/
	public Number linkOpacity;

/**
* description: The opacity of a point in treemap. When a point has children,
the visibility of the children is determined by the opacity.
* default: 0.75
*/
	public Number opacity;


	public HIHover() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.lineWidthPlus != null) {
			params.put("lineWidthPlus", this.lineWidthPlus);
		}
		if (this.brightness != null) {
			params.put("brightness", this.brightness);
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.halo != null) {
			params.put("halo", this.halo.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.radiusPlus != null) {
			params.put("radiusPlus", this.radiusPlus);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		return params;
	}

}