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



public class HILevelSize implements HIChartsJSONSerializable { 


/**
How to interpret levelSize.value.
percentage gives a width relative to result of outer radius minus
inner radius.
pixels gives the ring a fixed width in pixels.
weight takes the remaining width after percentage and pixels, and
distributes it accross all "weighted" levels. The value relative to the
sum of all weights determines the width.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a> <br><br><b>accepted values:</b><br><br>&ensp;["percentage", "pixels", "weight"]*/
	public String unit;

/**
The value used for calculating the width of the ring. Its' affect is
determined by levelSize.unit.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a>*/
	public Number value;


	public HILevelSize() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.unit != null) {
			params.put("unit", this.unit);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}