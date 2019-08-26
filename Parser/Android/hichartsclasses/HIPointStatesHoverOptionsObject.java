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



public class HIPointStatesHoverOptionsObject extends HIFoundation { 

	private HIAnimationOptionsObject animation;
	/**
 Animation when hovering over the point marker. 
	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private Boolean enabled;
	/**
 Enable or disable the point marker. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIColor fillColor;
	/**
 The fill color of the marker in hover state. When `undefined`, the series' or point's fillColor for normal state is used. 
	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private HIColor lineColor;
	/**
 The color of the point marker's outline. When `undefined`, the series' or point's lineColor for normal state is used. 
	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number lineWidth;
	/**
 The width of the point marker's outline. When `undefined`, the series' or point's lineWidth for normal state is used. 
	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number lineWidthPlus;
	/**
 The additional line width for a hovered point. 
	*/
	public void setLineWidthPlus(Number lineWidthPlus) {
		this.lineWidthPlus = lineWidthPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidthPlus(){ return lineWidthPlus; }

	private Number radius;
	/**
 The radius of the point marker. In hover state, it defaultss to the normal state's radius + 2 as per the radiusPlus option. 
	*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private Number radiusPlus;
	/**
 The number of pixels to increase the radius of the hovered point. 
	*/
	public void setRadiusPlus(Number radiusPlus) {
		this.radiusPlus = radiusPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadiusPlus(){ return radiusPlus; }



	public HIPointStatesHoverOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
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
		if (this.lineWidthPlus != null) {
			params.put("lineWidthPlus", this.lineWidthPlus);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.radiusPlus != null) {
			params.put("radiusPlus", this.radiusPlus);
		}
		return params;
	}

}