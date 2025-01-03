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
import com.highsoft.highcharts.common.HIColor;



public class HIRanges extends HIFoundation { 

	private HIColor borderColor;
	/**
 The color of the border for individual range. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIColor color;
	/**
 The color of the bubble for individual range. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HIColor connectorColor;
	/**
 The color of the connector for individual range. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }

	private Number value;
	/**
 Range size value, similar to bubble Z data. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }



	public HIRanges() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor.getData());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		return params;
	}

}