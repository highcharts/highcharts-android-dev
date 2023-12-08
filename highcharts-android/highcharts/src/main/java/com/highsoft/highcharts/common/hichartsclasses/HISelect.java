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



public class HISelect extends HIFoundation { 

	private Number radius;
	/**
 The radius of the point marker. In hover state, it defaultss to the normal state's radius + 2. 
	*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private Number lineWidth;
	/**
 The width of the point marker's outline. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Boolean enabled;
	/**
 Enable or disable visible feedback for selection. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIColor fillColor;
	/**
 The fill color of the point marker. 
 <br><br><b>defaults:</b><br><br>&ensp;#cccccc	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private HIColor lineColor;
	/**
 The color of the point marker's outline. When `undefined`, the series' or point's color is used. 
 <br><br><b>defaults:</b><br><br>&ensp;#000000	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number width;
	/**
 Set the marker's fixed width on select state. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number heightPlus;
	/**
 The number of pixels to increase the height of the hovered point. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setHeightPlus(Number heightPlus) {
		this.heightPlus = heightPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeightPlus(){ return heightPlus; }

	private Number widthPlus;
	/**
 The number of pixels to increase the width of the hovered point. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setWidthPlus(Number widthPlus) {
		this.widthPlus = widthPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidthPlus(){ return widthPlus; }

	private Number height;
	/**
 Set the marker's fixed height on select state. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private HIColor borderColor;
	/**
 A specific border color for the selected point. 
 <br><br><b>defaults:</b><br><br>&ensp;#000000	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIColor color;
	/**
 A specific color for the selected point. 
 <br><br><b>defaults:</b><br><br>&ensp;#cccccc	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HIAnimation animation;
	/**
/** * description: Animation setting for hovering the graph in line-type series. 
*/
	public void setAnimation(HIAnimation animation) {
		this.animation = animation;
		this.animation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimation getAnimation(){ return animation; }

	private Number lineWidthPlus;
	/**
 The additional line width for the graph of a hovered series. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setLineWidthPlus(Number lineWidthPlus) {
		this.lineWidthPlus = lineWidthPlus;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidthPlus(){ return lineWidthPlus; }

	private HIHalo halo;
	/**
 Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By defaults the halo is filled by the current point or series color with an opacity of 0.25\. The halo can be disabled by setting the `halo` option to `null`. In styled mode, the halo is styled with the `.highcharts-halo` class, with colors inherited from `.highcharts-color-{n}`. 
	*/
	public void setHalo(HIHalo halo) {
		this.halo = halo;
		this.halo.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHalo getHalo(){ return halo; }



	public HISelect() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
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
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.heightPlus != null) {
			params.put("heightPlus", this.heightPlus);
		}
		if (this.widthPlus != null) {
			params.put("widthPlus", this.widthPlus);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.lineWidthPlus != null) {
			params.put("lineWidthPlus", this.lineWidthPlus);
		}
		if (this.halo != null) {
			params.put("halo", this.halo.getParams());
		}
		return params;
	}

}