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
* description: Options to render charts in 3 dimensions. This feature requires
highcharts-3d.js, found in the download package or online at
http://code.highcharts.com/highcharts-
3d.js : code.highcharts.com/highcharts-3d.js.
*/
public class HIOptions3d implements HIChartsJSONSerializable { 


/**
* description: One of the two rotation angles for the chart.
* default: 0
*/
	public Number beta;

/**
* description: Set it to "auto" to automatically move the labels to the best
edge.

* accepted values: [null, "auto"]
* default: null
*/
	public String axisLabelPosition;

/**
* description: Whether the 3d box should automatically adjust to the chart plot
area.
* default: true
*/
	public Boolean fitToPlot;

/**
* description: The total depth of the chart.
* default: 100
*/
	public Number depth;

/**
* description: Defines the distance the viewer is standing in front of the chart,
this setting is important to calculate the perspective effect
in column and scatter charts. It is not used for 3D pie charts.
* default: 100
*/
	public Number viewDistance;

/**
* description: Provides the option to draw a frame around the charts by defining
a bottom, front and back panel.
*/
	public HIFrame frame;

/**
* description: One of the two rotation angles for the chart.
* default: 0
*/
	public Number alpha;

/**
* description: Wether to render the chart using the 3D functionality.
* default: false
*/
	public Boolean enabled;


	public HIOptions3d() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.beta != null) {
			params.put("beta", this.beta);
		}
		if (this.axisLabelPosition != null) {
			params.put("axisLabelPosition", this.axisLabelPosition);
		}
		if (this.fitToPlot != null) {
			params.put("fitToPlot", this.fitToPlot);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.viewDistance != null) {
			params.put("viewDistance", this.viewDistance);
		}
		if (this.frame != null) {
			params.put("frame", this.frame.getParams());
		}
		if (this.alpha != null) {
			params.put("alpha", this.alpha);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		return params;
	}

}