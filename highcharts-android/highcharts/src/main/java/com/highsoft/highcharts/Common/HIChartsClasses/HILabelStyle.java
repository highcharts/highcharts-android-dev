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
* description: CSS styles for the loading label span.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/labelstyle/ : Vertically centered
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/loading/general/ : Label styles
* default: { "fontWeight": "bold", "position": "relative", "top": "45%" }
*/
public class HILabelStyle implements HIChartsJSONSerializable { 

	public String top;
	public String fontWeight;
	public String position;


	public HILabelStyle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.top != null) {
			params.put("top", this.top);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		return params;
	}

}