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
* description: Rotation options for the words in the wordcloud.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/wordcloud-rotation : Word cloud with rotation
*/
public class HIRotation implements HIChartsJSONSerializable { 


/**
* description: The largest degree of rotation for a word.
* default: 90
*/
	public Number to;

/**
* description: The number of possible orientations for a word, within the range of
rotation.from and rotation.to.
* default: 2
*/
	public Number orientations;

/**
* description: The smallest degree of rotation for a word.
*/
	public Number from;


	public HIRotation() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.orientations != null) {
			params.put("orientations", this.orientations);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		return params;
	}

}