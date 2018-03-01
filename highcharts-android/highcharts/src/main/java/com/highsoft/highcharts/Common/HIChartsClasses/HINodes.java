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
import com.highsoft.highcharts.Common.HIColor;



public class HINodes implements HIChartsJSONSerializable { 


/**
The name to display for the node in data labels and tooltips. Use this when
the name is different from the id. Where the id must be unique for each
node, this is not necessary for the name.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/sankey/ : Sankey diagram with node options
*/
	public String name;

/**
The color of the auto generated node.
*/
	public HIColor color;

/**
An optional column index of where to place the node. The default behaviour is
to place it next to the preceding node.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/ : Specified node column
* default: undefined
*/
	public Number column;

/**
The vertical offset of a node in terms of weight. Positive values shift the
node downwards, negative shift it upwards.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/ : Specified node offset
* default: 0
*/
	public Number offset;

/**
The id of the auto-generated node, refering to the from or to setting of
the link.
*/
	public String id;

/**
The color index of the auto generated node, especially for use in styled
mode.
*/
	public Number colorIndex;


	public HINodes() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.column != null) {
			params.put("column", this.column);
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		return params;
	}

}