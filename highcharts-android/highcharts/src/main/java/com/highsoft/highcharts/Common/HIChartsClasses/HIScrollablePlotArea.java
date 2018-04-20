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



public class HIScrollablePlotArea implements HIChartsJSONSerializable { 


/**
The minimum width for the plot area. If it gets smaller than this, the plot
area will become scrollable.
*/
	public Number minWidth;

/**
The initial scrolling position of the scrollable plot area. Ranges from 0 to
1, where 0 aligns the plot area to the left and 1 aligns it to the right.
Typically we would use 1 if the chart has right aligned Y axes.
*/
	public Number scrollPositionX;


	public HIScrollablePlotArea() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.minWidth != null) {
			params.put("minWidth", this.minWidth);
		}
		if (this.scrollPositionX != null) {
			params.put("scrollPositionX", this.scrollPositionX);
		}
		return params;
	}

}