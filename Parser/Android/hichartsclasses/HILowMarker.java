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



public class HILowMarker extends HIFoundation { 

	private String symbol;
	/**
/** * description: A predefined shape or symbol for the marker. When undefined, the symbol is pulled from options.symbols. Other possible values are `'circle'`, `'square'`,`'diamond'`, `'triangle'` and `'triangle-down'`. Additionally, the URL to a graphic can be given on this form: `'url(graphic.png)'`. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server. Custom callbacks for symbol path generation can also be added to `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by its method name, as shown in the demo. * demo: * [Area range chart with `lowMarker` option](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-arearange/lowmarker/) 
*/
	public void setSymbol(String symbol) {
		this.symbol = symbol;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSymbol(){ return symbol; }

	private Boolean enabled;
	/**
 Enable or disable the point marker. If `undefined`, the markers are hidden when the data is dense, and shown for more widespread data points. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number height;
	/**
 Image markers only. Set the image width explicitly. When using this option, a `width` must also be set. 
	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private HIStates states;
	/**
 States for a single point marker. 
	*/
	public void setStates(HIStates states) {
		this.states = states;
		this.states.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStates getStates(){ return states; }

	private Number width;
	/**
 Image markers only. Set the image width explicitly. When using this option, a `height` must also be set. 
	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number radius;
	/**
 The radius of the point marker. 
 <br><br><b>defaults:</b><br><br>&ensp;4	*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private HIColor fillColor;
	/**
 The fill color of the point marker. When `undefined`, the series' or point's color is used. 
	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private HIColor lineColor;
	/**
 The color of the point marker's outline. When `undefined`, the series' or point's color is used. 
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number lineWidth;
	/**
 The width of the point marker's outline. 
	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number enabledThreshold;
	/**
 The threshold for how dense the point markers should be before they are hidden, given that `enabled` is not defined. The number indicates the horizontal distance between the two closest points in the series, as multiples of the `marker.radius`. In other words, the defaults value of 2 means points are hidden if overlapping horizontally. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setEnabledThreshold(Number enabledThreshold) {
		this.enabledThreshold = enabledThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEnabledThreshold(){ return enabledThreshold; }



	public HILowMarker() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.symbol != null) {
			params.put("symbol", this.symbol);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.states != null) {
			params.put("states", this.states.getParams());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.enabledThreshold != null) {
			params.put("enabledThreshold", this.enabledThreshold);
		}
		return params;
	}

}