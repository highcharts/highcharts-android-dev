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



public class HISeriesOrganizationDataLabelsOptionsObject extends HIFoundation { 

	private HIFunction nodeFormatter;
	/**
 A callback for defining the format for _nodes_ in the organization chart. The `nodeFormat` option takes precedence over `nodeFormatter`. In an organization chart, the `nodeFormatter` is a quite complex function of the available options, striving for a good defaults layout of cards with or without images. In organization chart, the data labels come with `useHTML` set to true, meaning they will be rendered as true HTML above the SVG. 
	*/
	public void setNodeFormatter(HIFunction nodeFormatter) {
		this.nodeFormatter = nodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getNodeFormatter(){ return nodeFormatter; }



	public HISeriesOrganizationDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.nodeFormatter != null) {
			params.put("nodeFormatter", this.nodeFormatter);
		}
		return params;
	}

}