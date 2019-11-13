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



public class HITimelineDataLabelsOptionsObject extends HIFoundation { 

	private Boolean alternate;
	/**
 Whether to position data labels alternately. For example, if `distance` is set equal to `100`, then data labels will be positioned alternately (on both sides of the point) at a distance of 100px. 
	*/
	public void setAlternate(Boolean alternate) {
		this.alternate = alternate;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlternate(){ return alternate; }

	private HIColor connectorColor;
	/**
 The color of the line connecting the data label to the point. The defaults color is the same as the point's color. 
	*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }

	private Number connectorWidth;
	/**
 The width of the line connecting the data label to the point. In styled mode, the connector stroke width is given in the `.highcharts-data-label-connector` class. 
	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private Number distance;
	/**
 A pixel value defining the distance between the data label and the point. Negative numbers puts the label on top of the point. 
	*/
	public void setDistance(Number distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDistance(){ return distance; }

	private HIFunction formatter;
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Number width;
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }



	public HITimelineDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.alternate != null) {
			params.put("alternate", this.alternate);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor.getData());
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		return params;
	}

}