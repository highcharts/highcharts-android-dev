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
* description: Options for the halo appearing around the hovered point in line-
type series as well as outside the hovered slice in pie charts.
By default the halo is filled by the current point or series
color with an opacity of 0.25. The halo can be disabled by setting
the halo option to false.
In styled mode, the halo is styled with the .highcharts-halo class, with colors inherited from .highcharts-color-{n}.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/ : Halo options
*/
public class HIHalo implements HIChartsJSONSerializable { 


/**
* description: The pixel size of the halo. For point markers this is the radius
of the halo. For pie slices it is the width of the halo outside
the slice. For bubbles it defaults to 5 and is the width of the
halo outside the bubble.
* default: 10
*/
	public Number size;

/**
* description: Opacity for the halo unless a specific fill is overridden using
the attributes setting. Note that Highcharts is only able to
apply opacity to colors of hex or rgb(a) formats.
* default: 0.25
*/
	public Number opacity;

/**
* description: A collection of SVG attributes to override the appearance of the
halo, for example fill, stroke and stroke-width.
*/
	public Object attributes;
	public Boolean enabled;


	public HIHalo() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.attributes != null) {
			params.put("attributes", this.attributes);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		return params;
	}

}