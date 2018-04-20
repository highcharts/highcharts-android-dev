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



public class HICredits implements HIChartsJSONSerializable { 


/**
CSS styles for the credits label.
 <br><br><b>default:</b><br><br>&ensp;{ "cursor": "pointer", "color": "#999999", "fontSize": "10px" }*/
	public HIStyle style;

/**
The text for the credits label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/href/">Custom URL and text</a> <br><br><b>default:</b><br><br>&ensp;Highcharts.com*/
	public String text;

/**
Whether to show the credits text.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/enabled-false/">Credits disabled</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
The URL for the credits label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/href/">Custom URL and text</a> <br><br><b>default:</b><br><br>&ensp;http://www.highcharts.com*/
	public String href;

/**
Position configuration for the credits label.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/position-left/">Left aligned</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/position-left/">Left aligned</a>*/
	public HIPosition position;


	public HICredits() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.href != null) {
			params.put("href", this.href);
		}
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		return params;
	}

}