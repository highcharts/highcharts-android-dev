/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HISeriesPackedBubbleDataLabelsFormatterContextObject extends HIFoundation { 

	private Object color;
	/**
 The color of the node. 
	*/
	public void setColor(Object color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getColor(){ return color; }

	private String key;
	/**
 The ID of the node. 
	*/
	public void setKey(String key) {
		this.key = key;
		this.setChanged();
		this.notifyObservers();
	}

	public String getKey(){ return key; }

	private HIPoint point;
	/**
 The point (node) object. The node name, if defined, is available through `this.point.name`. Arrays: `this.point.linksFrom` and `this.point.linksTo` contains all nodes connected to this point. 
	*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }



	public HISeriesPackedBubbleDataLabelsFormatterContextObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.key != null) {
			params.put("key", this.key);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		return params;
	}

}