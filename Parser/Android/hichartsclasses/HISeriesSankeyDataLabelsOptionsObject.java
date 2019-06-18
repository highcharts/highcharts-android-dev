/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HISeriesSankeyDataLabelsOptionsObject extends HIFoundation { 

	private String nodeFormat;
	/**
 The [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) specifying what to show for _nodes_ in the sankey diagram. By defaults the `nodeFormatter` returns `{point.name}`. 
	*/
	public void setNodeFormat(String nodeFormat) {
		this.nodeFormat = nodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNodeFormat(){ return nodeFormat; }

	private HIFunction nodeFormatter;
	/**
 Callback to format data labels for _nodes_ in the sankey diagram. The `nodeFormat` option takes precedence over the `nodeFormatter`. 
	*/
	public void setNodeFormatter(HIFunction nodeFormatter) {
		this.nodeFormatter = nodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNodeFormatter(){ return nodeFormatter; }



	public HISeriesSankeyDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.nodeFormat != null) {
			params.put("nodeFormat", this.nodeFormat);
		}
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		return params;
	}

}