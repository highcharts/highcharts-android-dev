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



public class HIOptions3d implements HIChartsJSONSerializable { 


/**
Defines the distance the viewer is standing in front of the chart,
this setting is important to calculate the perspective effect
in column and scatter charts. It is not used for 3D pie charts.
 <br><br><b>default:</b><br><br>&ensp;100*/
	public Number viewDistance;

/**
Provides the option to draw a frame around the charts by defining
a bottom, front and back panel.
*/
	public HIFrame frame;

/**
Set it to "auto" to automatically move the labels to the best
edge.
 <br><br><b>accepted values:</b><br><br>&ensp;[null, "auto"] <br><br><b>default:</b><br><br>&ensp;null*/
	public String axisLabelPosition;

/**
Wether to render the chart using the 3D functionality.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean enabled;

/**
One of the two rotation angles for the chart.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public Number beta;

/**
The total depth of the chart.
 <br><br><b>default:</b><br><br>&ensp;100*/
	public Number depth;

/**
Whether the 3d box should automatically adjust to the chart plot
area.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean fitToPlot;

/**
One of the two rotation angles for the chart.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public Number alpha;


	public HIOptions3d() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.viewDistance != null) {
			params.put("viewDistance", this.viewDistance);
		}
		if (this.frame != null) {
			params.put("frame", this.frame.getParams());
		}
		if (this.axisLabelPosition != null) {
			params.put("axisLabelPosition", this.axisLabelPosition);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.beta != null) {
			params.put("beta", this.beta);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.fitToPlot != null) {
			params.put("fitToPlot", this.fitToPlot);
		}
		if (this.alpha != null) {
			params.put("alpha", this.alpha);
		}
		return params;
	}

}