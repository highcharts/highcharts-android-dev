/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;
import com.highsoft.highcharts.common.HIColor;





public class HIHover extends Observable implements HIChartsJSONSerializable { 

	private Number radiusPlus;
	public void setRadiusPlus(Number radiusPlus) {
		this.radiusPlus = radiusPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadiusPlus(){ return radiusPlus; }

	private Boolean enabled;
/**
/** Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend. . <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/">Line</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/">Column</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/">Pie</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIAnimationOptionsObject animation;
/**
/** Animation setting for hovering the graph in line-type series. 
*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private Number lineWidth;
/**
/** Pixel width of the graph line. By defaults this property is undefined, and the lineWidthPlus property dictates how much to increase the linewidth from normal state. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/">5px line on hover</a>
*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number lineWidthPlus;
/**
/** The additional line width for the graph of a hovered series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/">5 pixels wider</a>
*/
	public void setLineWidthPlus(Number lineWidthPlus) {
		this.lineWidthPlus = lineWidthPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidthPlus(){ return lineWidthPlus; }

	private HIHalo halo;
/**
/** Options for the halo appearing around the hovered point in line- type series as well as outside the hovered slice in pie charts. By defaults the halo is filled by the current point or series color with an opacity of 0.25\. The halo can be disabled by setting the halo option to false. In styled mode, the halo is styled with the .highcharts-halo class, with colors inherited from .highcharts-color-{n}. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/">Halo options</a>
*/
	public void setHalo(HIHalo halo) {
		this.halo = halo;
		this.halo.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHalo getHalo(){ return halo; }

	private HIColor fillColor;
/**
/** The fill color of the marker in hover state. When undefined, the series' or point's fillColor for normal state is used. 
*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private HIColor lineColor;
/**
/** The color of the point marker's outline. When undefined, the series' or point's lineColor for normal state is used. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/">White fill color, black line color</a>
*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number radius;
/**
/** The radius of the point marker. In hover state, it defaultss to the normal state's radius + 2 as per the `radiusPlus` option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/">10px radius</a>
*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private Number brightness;
/**
/** How much to brighten the point on interaction. Requires the main color to be defined in hex or rgb(a) format. In styled mode, the hover brightening is by defaults replaced with a fill-opacity set in the .highcharts-point:hover rule. 
*/
	public void setBrightness(Number brightness) {
		this.brightness = brightness;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBrightness(){ return brightness; }

	private Number linkOpacity;
/**
/** Opacity for the links between nodes in the sankey diagram in hover mode. 
*/
	public void setLinkOpacity(Number linkOpacity) {
		this.linkOpacity = linkOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkOpacity(){ return linkOpacity; }

	private String borderColor;
/**
/** The border color for the hovered state. 
*/
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderColor(){ return borderColor; }

	private Number opacity;
/**
/** The opacity of a point in treemap. When a point has children, the visibility of the children is determined by the opacity. 
 <br><br><b>defaults:</b><br><br>&ensp;0.75*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private Boolean shadow;
/**
/** The shadow option for hovered state. 
*/
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShadow(){ return shadow; }

	private HIColor color;
/**
/** A specific color for the hovered point. 
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }



	public HIHover() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.radiusPlus != null) {
			params.put("radiusPlus", this.radiusPlus);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.lineWidthPlus != null) {
			params.put("lineWidthPlus", this.lineWidthPlus);
		}
		if (this.halo != null) {
			params.put("halo", this.halo.getParams());
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.brightness != null) {
			params.put("brightness", this.brightness);
		}
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		return params;
	}

}