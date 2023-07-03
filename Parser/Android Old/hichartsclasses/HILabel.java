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



public class HILabel extends HIFoundation { 

	private HICSSObject style;
	/**
 Styles for the series label. The color defaultss to the series color, or a contrast color if onArea. 
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Number minFontSize;
	/**
 For area-like series, allow the font size to vary so that small areas get a smaller font size. The defaults applies this effect to area-like series but not line-like series. 
	*/
	public void setMinFontSize(Number minFontSize) {
		this.minFontSize = minFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinFontSize(){ return minFontSize; }

	private String format;
	/**
 A format string for the label, with support for a subset of HTML. Variables are enclosed by curly brackets. Available variables are name, options.xxx, color and other members from the series object. Use this option also to set a static text for the label. 
	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Number maxFontSize;
	/**
 For area-like series, allow the font size to vary so that small areas get a smaller font size. The defaults applies this effect to area-like series but not line-like series. 
	*/
	public void setMaxFontSize(Number maxFontSize) {
		this.maxFontSize = maxFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxFontSize(){ return maxFontSize; }

	private Boolean enabled;
	/**
 Enable the series label per series. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number connectorNeighbourDistance;
	/**
 If the label is closer than this to a neighbour graph, draw a connector. 
	*/
	public void setConnectorNeighbourDistance(Number connectorNeighbourDistance) {
		this.connectorNeighbourDistance = connectorNeighbourDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorNeighbourDistance(){ return connectorNeighbourDistance; }

	private Boolean onArea;
	/**
 Draw the label on the area of an area series. By defaults it is drawn on the area. Set it to false to draw it next to the graph instead. 
	*/
	public void setOnArea(Boolean onArea) {
		this.onArea = onArea;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOnArea(){ return onArea; }

	private ArrayList<HILabelIntersectBoxObject> boxesToAvoid;
	/**
 An array of boxes to avoid when laying out the labels. Each item has a left, right, top and bottom property. 
	*/
	public void setBoxesToAvoid(ArrayList<HILabelIntersectBoxObject> boxesToAvoid) {
		this.boxesToAvoid = boxesToAvoid;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HILabelIntersectBoxObject> getBoxesToAvoid(){ return boxesToAvoid; }

	private HIFunction formatter;
	/**
 Callback function to format each of the series' labels. The this keyword refers to the series object. By defaults the formatter is undefined and the series.name is rendered. 
	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Boolean connectorAllowed;
	/**
 Allow labels to be placed distant to the graph if necessary, and draw a connector line to the graph. Setting this option to true may decrease the performance significantly, since the algorithm with systematically search for open spaces in the whole plot area. Visually, it may also result in a more cluttered chart, though more of the series will be labeled. 
	*/
	public void setConnectorAllowed(Boolean connectorAllowed) {
		this.connectorAllowed = connectorAllowed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getConnectorAllowed(){ return connectorAllowed; }



	public HILabel() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.minFontSize != null) {
			params.put("minFontSize", this.minFontSize);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.maxFontSize != null) {
			params.put("maxFontSize", this.maxFontSize);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.connectorNeighbourDistance != null) {
			params.put("connectorNeighbourDistance", this.connectorNeighbourDistance);
		}
		if (this.onArea != null) {
			params.put("onArea", this.onArea);
		}
		if (this.boxesToAvoid != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.boxesToAvoid) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("boxesToAvoid", array);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.connectorAllowed != null) {
			params.put("connectorAllowed", this.connectorAllowed);
		}
		return params;
	}

}