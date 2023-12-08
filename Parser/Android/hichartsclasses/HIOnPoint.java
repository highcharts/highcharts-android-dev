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



public class HIOnPoint extends HIFoundation { 

	private HIPosition position;
	/**
 Options allowing to set a position and an offset of the series in the _Series on point_ feature. 
	*/
	public void setPosition(HIPosition position) {
		this.position = position;
		this.position.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPosition getPosition(){ return position; }

	private HISVGAttributes connectorOptions;
	/**
 Options for the connector in the _Series on point_ feature. In styled mode, the connector can be styled with the `.highcharts-connector-seriesonpoint` class name. 
	*/
	public void setConnectorOptions(HISVGAttributes connectorOptions) {
		this.connectorOptions = connectorOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getConnectorOptions(){ return connectorOptions; }

	private String id;
	/**
 The `id` of the point that we connect the series to. Only points with a given `plotX` and `plotY` values and map points are valid. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }



	public HIOnPoint() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.connectorOptions != null) {
			params.put("connectorOptions", this.connectorOptions.getParams());
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		return params;
	}

}