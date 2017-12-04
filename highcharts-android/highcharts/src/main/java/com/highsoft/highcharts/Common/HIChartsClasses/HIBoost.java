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
* description: Options for the Boost module. The Boost module allows certain series types
to be rendered by WebGL instead of the default SVG. This allows hundreds of
thousands of data points to be rendered in milliseconds. In addition to the
WebGL rendering it saves time by skipping processing and inspection of the
data wherever possible.
In addition to the global boost option, each series has a
boostThreshold that defines when the
boost should kick in.
Requires the modules/boost.js module.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy-stock : Stock chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy-dynamic : Dynamic stock chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line : Line chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/line-series-heavy : Line chart with hundreds of series
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/scatter : Scatter chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/area : Area chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/arearange : Arearange chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/column : Column chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/bubble : Bubble chart
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/heatmap : Heat map
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/boost/treemap : Tree map
*/
public class HIBoost implements HIChartsJSONSerializable { 


/**
* description: Enable or disable boost on a chart.
* default: true
*/
	public Boolean enabled;

/**
* description: Debugging options for boost.
Useful for benchmarking, and general timing.
*/
	public HIDebug debug;

/**
* description: If set to true, the whole chart will be boosted if one of the series
crosses its threshold, and all the series can be boosted.
* default: true
*/
	public Boolean allowForce;

/**
* description: Enable or disable GPU translations. GPU translations are faster than doing
the translation in JavaScript.
This option may cause rendering issues with certain datasets.
Namely, if your dataset has large numbers with small increments (such as
timestamps), it won't work correctly. This is due to floating point
precission.
* default: false
*/
	public Boolean useGPUTranslations;

/**
* description: Set the series threshold for when the boost should kick in globally.
Setting to e.g. 20 will cause the whole chart to enter boost mode
if there are 20 or more series active. When the chart is in boost mode,
every series in it will be rendered to a common canvas. This offers
a significant speed improvment in charts with a very high
amount of series.
* default: null
*/
	public String seriesThreshold;


	public HIBoost() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.debug != null) {
			params.put("debug", this.debug.getParams());
		}
		if (this.allowForce != null) {
			params.put("allowForce", this.allowForce);
		}
		if (this.useGPUTranslations != null) {
			params.put("useGPUTranslations", this.useGPUTranslations);
		}
		if (this.seriesThreshold != null) {
			params.put("seriesThreshold", this.seriesThreshold);
		}
		return params;
	}

}