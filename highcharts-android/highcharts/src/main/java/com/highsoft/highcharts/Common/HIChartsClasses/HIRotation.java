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



public class HIRotation implements HIChartsJSONSerializable { 


/**
The largest degree of rotation for a word.
*/
	public Number to;

/**
The smallest degree of rotation for a word.
*/
	public Number from;

/**
The number of possible orientations for a word, within the range of
rotation.from and rotation.to.
*/
	public Number orientations;


	public HIRotation() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.orientations != null) {
			params.put("orientations", this.orientations);
		}
		return params;
	}

}