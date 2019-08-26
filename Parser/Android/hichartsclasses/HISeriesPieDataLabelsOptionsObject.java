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



public class HISeriesPieDataLabelsOptionsObject extends HIFoundation { 

	private String alignTo;
	/**
 Alignment method for data labels. Possible values are: - `toPlotEdges`: each label touches the nearest vertical edge of the plot area - `connectors`: connectors have the same x position and the widest label of each half (left & right) touches the nearest vertical edge of the plot area. 
	*/
	public void setAlignTo(String alignTo) {
		this.alignTo = alignTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlignTo(){ return alignTo; }

	private HIColor connectorColor;
	/**
 The color of the line connecting the data label to the pie slice. The defaults color is the same as the point's color. In styled mode, the connector stroke is given in the `.highcharts-data-label-connector` class. 
	*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }

	private Number connectorPadding;
	/**
 The distance from the data label to the connector. Note that data labels also have a defaults `padding`, so in order for the connector to touch the text, the `padding` must also be 0. 
	*/
	public void setConnectorPadding(Number connectorPadding) {
		this.connectorPadding = connectorPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorPadding(){ return connectorPadding; }

	private String connectorShape;
	/**
 Specifies the method that is used to generate the connector path. Highcharts provides 3 built-in connector shapes: `'fixedOffset'` (defaults), `'straight'` and `'crookedLine'`. Using `'crookedLine'` has the most sense (in most of the cases) when `'alignTo'` is set. Users can provide their own method by passing a function instead of a String. 3 arguments are passed to the callback: - Object that holds the information about the coordinates of the label (`x` & `y` properties) and how the label is located in relation to the pie (`alignment` property). `alignment` can by one of the following: `'left'` (pie on the left side of the data label), `'right'` (pie on the right side of the data label) or `'center'` (data label overlaps the pie). - Object that holds the information about the position of the connector. Its `touchingSliceAt` porperty tells the position of the place where the connector touches the slice. - Data label options The function has to return an SVG path definition in array form (see the example). 
	*/
	public void setConnectorShape(String connectorShape) {
		this.connectorShape = connectorShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorShape(){ return connectorShape; }

	private Number connectorWidth;
	/**
 The width of the line connecting the data label to the pie slice. In styled mode, the connector stroke width is given in the `.highcharts-data-label-connector` class. 
	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private String crookDistance;
	/**
 Works only if `connectorShape` is `'crookedLine'`. It defines how far from the vertical plot edge the coonnector path should be crooked. 
	*/
	public void setCrookDistance(String crookDistance) {
		this.crookDistance = crookDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCrookDistance(){ return crookDistance; }

	private Number distance;
	/**
 The distance of the data label from the pie's edge. Negative numbers put the data label on top of the pie slices. Can also be defined as a percentage of pie's radius. Connectors are only shown for data labels outside the pie. 
	*/
	public void setDistance(Number distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDistance(){ return distance; }

	private Boolean softConnector;
	/**
 Whether to render the connector as a soft arc or a line with sharp break. Works only if `connectorShape` equals to `fixedOffset`. 
	*/
	public void setSoftConnector(Boolean softConnector) {
		this.softConnector = softConnector;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSoftConnector(){ return softConnector; }



	public HISeriesPieDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.alignTo != null) {
			params.put("alignTo", this.alignTo);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor.getData());
		}
		if (this.connectorPadding != null) {
			params.put("connectorPadding", this.connectorPadding);
		}
		if (this.connectorShape != null) {
			params.put("connectorShape", this.connectorShape);
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.crookDistance != null) {
			params.put("crookDistance", this.crookDistance);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.softConnector != null) {
			params.put("softConnector", this.softConnector);
		}
		return params;
	}

}