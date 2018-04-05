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



public class HIBackgroundColor implements HIChartsJSONSerializable { 


/**
Definition of the gradient, similar to SVG: object literal holds
start position (x1, y1) and the end position (x2, y2) relative
to the shape, where 0 means top/left and 1 is bottom/right.
All positions are floats between 0 and 1.
*/
	public HILinearGradient linearGradient;

/**
The stops is an array of tuples, where the first
item is a float between 0 and 1 assigning the relative position in
the gradient, and the second item is the color.
 <br><br><b>default:</b><br><br>&ensp;[[0, #ffffff], [1, #e6e6e6]]*/
	public ArrayList<ArrayList> stops;


	public HIBackgroundColor() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.linearGradient != null) {
			params.put("linearGradient", this.linearGradient.getParams());
		}
		if (this.stops != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.stops) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("stops", array);
		}
		return params;
	}

}