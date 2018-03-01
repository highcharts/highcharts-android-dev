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



public class HILoading implements HIChartsJSONSerializable { 


/**
CSS styles for the loading screen that covers the plot area.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/style/ : Gray plot area, white text
* default: { "position": "absolute", "backgroundColor": "#ffffff", "opacity": 0.5, "textAlign": "center" }
*/
	public HIStyle style;

/**
CSS styles for the loading label span.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/labelstyle/ : Vertically centered
* default: { "fontWeight": "bold", "position": "relative", "top": "45%" }
*/
	public HILabelStyle labelStyle;

/**
The duration in milliseconds of the fade out effect.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/ : Fade in and out over a second
* default: 100
*/
	public Number hideDuration;

/**
The duration in milliseconds of the fade in effect.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/ : Fade in and out over a second
* default: 100
*/
	public Number showDuration;


	public HILoading() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.labelStyle != null) {
			params.put("labelStyle", this.labelStyle.getParams());
		}
		if (this.hideDuration != null) {
			params.put("hideDuration", this.hideDuration);
		}
		if (this.showDuration != null) {
			params.put("showDuration", this.showDuration);
		}
		return params;
	}

}