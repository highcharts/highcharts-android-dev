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



public class HIMarker extends HIFoundation { 

	private HIStates states;
	public void setStates(HIStates states) {
		this.states = states;
		this.states.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStates getStates(){ return states; }

	private String symbol;
	/**
/** * description: A predefined shape or symbol for the marker. When undefined, the symbol is pulled from options.symbols. Other possible values are 'circle', 'square','diamond', 'triangle' and 'triangle-down'. Additionally, the URL to a graphic can be given on this form: 'url(graphic.png)'. Note that for the image to be applied to exported charts, its URL needs to be accessible by the export server. Custom callbacks for symbol path generation can also be added to Highcharts.SVGRenderer.prototype.symbols. The callback is then used by its method name, as shown in the demo. * demo:  •  Predefined, graphic and custom markers
*/
	public void setSymbol(String symbol) {
		this.symbol = symbol;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSymbol(){ return symbol; }

	private Number lineWidth;
	/**
/** * description: The width of the point marker's outline. * demo:  •  2px blue marker
*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number radius;
	/**
/** * description: The radius of the point marker. * demo:  •  Bigger markers
* defaults: 4
*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private String lineColor;
	/**
/** * description: The color of the point marker's outline. When undefined, the series' or point's color is used. * demo:  •  Inherit from series color (undefined)
*/
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLineColor(){ return lineColor; }

	private Boolean enabled;
	/**
 Enable or disable the point marker. If undefined, the markers are hidden when the data is dense, and shown for more widespread data points. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled/">Disabled markers</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabled-false/">Disabled in normal state but enabled on hover</a>
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number height;
	/**
 Image markers only. Set the image width explicitly. When using this option, a width must also be set. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number width;
	/**
 Image markers only. Set the image width explicitly. When using this option, a height must also be set. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-width-height/">Fixed width and height</a>
	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private HIColor fillColor;
	/**
 The fill color of the point marker. When undefined, the series' or point's color is used. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-fillcolor/">White fill</a>
	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private HIColor color;
	/**
 The color of the marker. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HIAnimationOptionsObject animation;
	/**
 Animation for the marker as it moves between values. Set to false to disable animation. Defaults to { duration: 50 }. 
	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private Number fillOpacity;
	public void setFillOpacity(Number fillOpacity) {
		this.fillOpacity = fillOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFillOpacity(){ return fillOpacity; }

	private Number enabledThreshold;
	/**
 The threshold for how dense the point markers should be before they are hidden, given that enabled is not defined. The number indicates the horizontal distance between the two closest points in the series, as multiples of the marker.radius. In other words, the defaults value of 2 means points are hidden if overlapping horizontally. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-enabledthreshold">A higher threshold</a>
	*/
	public void setEnabledThreshold(Number enabledThreshold) {
		this.enabledThreshold = enabledThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEnabledThreshold(){ return enabledThreshold; }



	public HIMarker() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.states != null) {
			params.put("states", this.states.getParams());
		}
		if (this.symbol != null) {
			params.put("symbol", this.symbol);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.fillOpacity != null) {
			params.put("fillOpacity", this.fillOpacity);
		}
		if (this.enabledThreshold != null) {
			params.put("enabledThreshold", this.enabledThreshold);
		}
		return params;
	}

}