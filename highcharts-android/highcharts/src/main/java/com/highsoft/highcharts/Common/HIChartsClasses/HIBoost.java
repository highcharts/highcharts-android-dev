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



public class HIBoost implements HIChartsJSONSerializable { 


/**
Debugging options for boost.
Useful for benchmarking, and general timing.
*/
	public HIDebug debug;

/**
If set to true, the whole chart will be boosted if one of the series
crosses its threshold, and all the series can be boosted.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean allowForce;

/**
Enable or disable GPU translations. GPU translations are faster than doing
the translation in JavaScript.

This option may cause rendering issues with certain datasets.
Namely, if your dataset has large numbers with small increments (such as
timestamps), it won't work correctly. This is due to floating point
precission.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean useGPUTranslations;

/**
Enable or disable boost on a chart.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
Set the series threshold for when the boost should kick in globally.

Setting to e.g. 20 will cause the whole chart to enter boost mode
if there are 20 or more series active. When the chart is in boost mode,
every series in it will be rendered to a common canvas. This offers
a significant speed improvment in charts with a very high
amount of series.
 <br><br><b>default:</b><br><br>&ensp;null*/
	public Number seriesThreshold;


	public HIBoost() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.debug != null) {
			params.put("debug", this.debug.getParams());
		}
		if (this.allowForce != null) {
			params.put("allowForce", this.allowForce);
		}
		if (this.useGPUTranslations != null) {
			params.put("useGPUTranslations", this.useGPUTranslations);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.seriesThreshold != null) {
			params.put("seriesThreshold", this.seriesThreshold);
		}
		return params;
	}

}