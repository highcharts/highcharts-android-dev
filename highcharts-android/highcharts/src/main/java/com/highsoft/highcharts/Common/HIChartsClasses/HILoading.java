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
* description: The loading options control the appearance of the loading screen
that covers the plot area on chart operations. This screen only
appears after an explicit call to chart.showLoading(). It is a
utility for developers to communicate to the end user that something
is going on, for example while retrieving new data via an XHR connection.
The "Loading..." text itself is not part of this configuration
object, but part of the lang object.
*/
public class HILoading implements HIChartsJSONSerializable { 


/**
* description: CSS styles for the loading label span.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/labelstyle/ : Vertically centered
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/loading/general/ : Label styles
* default: { "fontWeight": "bold", "position": "relative", "top": "45%" }
*/
	public HILabelStyle labelStyle;

/**
* description: CSS styles for the loading screen that covers the plot area.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/style/ : Gray plot area, white text
* default: { "position": "absolute", "backgroundColor": "#ffffff", "opacity": 0.5, "textAlign": "center" }
*/
	public HIStyle style;

/**
* description: The duration in milliseconds of the fade in effect.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/ : Fade in and out over a second
* default: 100
*/
	public Number showDuration;

/**
* description: The duration in milliseconds of the fade out effect.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/ : Fade in and out over a second
* default: 100
*/
	public Number hideDuration;


	public HILoading() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.labelStyle != null) {
			params.put("labelStyle", this.labelStyle.getParams());
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.showDuration != null) {
			params.put("showDuration", this.showDuration);
		}
		if (this.hideDuration != null) {
			params.put("hideDuration", this.hideDuration);
		}
		return params;
	}

}