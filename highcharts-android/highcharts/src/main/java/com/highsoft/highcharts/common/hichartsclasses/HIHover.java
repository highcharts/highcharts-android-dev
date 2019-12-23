/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIHover extends HIFoundation { 

	private Number radiusPlus;
	public void setRadiusPlus(Number radiusPlus) {
		this.radiusPlus = radiusPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadiusPlus(){ return radiusPlus; }

	private String borderColor;
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderColor(){ return borderColor; }

	private Number opacity;
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private Boolean enabled;
	/**
 Enable or disable the point marker. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-enabled/">Disabled hover state</a>
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number lineWidthPlus;
	/**
 The additional line width for a hovered point. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">2 pixels wider on hover</a>
	*/
	public void setLineWidthPlus(Number lineWidthPlus) {
		this.lineWidthPlus = lineWidthPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidthPlus(){ return lineWidthPlus; }

	private Number radius;
	/**
 The radius of the point marker. In hover state, it defaultss to the normal state's radius + 2 as per the radiusPlus option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/">10px radius</a>
	*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private HIColor fillColor;
	/**
 The fill color of the marker in hover state. When undefined, the series' or point's fillColor for normal state is used. 
	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private HIColor lineColor;
	/**
 The color of the point marker's outline. When undefined, the series' or point's lineColor for normal state is used. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/">White fill color, black line color</a>
	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number lineWidth;
	/**
 The width of the point marker's outline. When undefined, the series' or point's lineWidth for normal state is used. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linewidth/">3px line width</a>
	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private HIAnimationOptionsObject animation;
	/**
 Animation when hovering over the marker. 
	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private HIHalo halo;
	public void setHalo(HIHalo halo) {
		this.halo = halo;
		this.halo.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHalo getHalo(){ return halo; }

	private Number brightness;
	/**
 How much to brighten the point on interaction. Requires the main color to be defined in hex or rgb(a) format. In styled mode, the hover brightening is by defaults replaced with a fill-opacity set in the .highcharts-point:hover rule. 
	*/
	public void setBrightness(Number brightness) {
		this.brightness = brightness;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBrightness(){ return brightness; }

	private Number linkOpacity;
	/**
 Opacity for the links between nodes in the sankey diagram in hover mode. 
	*/
	public void setLinkOpacity(Number linkOpacity) {
		this.linkOpacity = linkOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkOpacity(){ return linkOpacity; }

	private Boolean shadow;
	/**
 The shadow option for hovered state. 
	*/
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShadow(){ return shadow; }

	private HIColor color;
	/**
 A specific color for the hovered point. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number connectorWidthPlus;
	/**
 The additional connector line width for a hovered point. 
	*/
	public void setConnectorWidthPlus(Number connectorWidthPlus) {
		this.connectorWidthPlus = connectorWidthPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidthPlus(){ return connectorWidthPlus; }



	public HIHover() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.radiusPlus != null) {
			params.put("radiusPlus", this.radiusPlus);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.lineWidthPlus != null) {
			params.put("lineWidthPlus", this.lineWidthPlus);
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
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.halo != null) {
			params.put("halo", this.halo.getParams());
		}
		if (this.brightness != null) {
			params.put("brightness", this.brightness);
		}
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.connectorWidthPlus != null) {
			params.put("connectorWidthPlus", this.connectorWidthPlus);
		}
		return params;
	}

}