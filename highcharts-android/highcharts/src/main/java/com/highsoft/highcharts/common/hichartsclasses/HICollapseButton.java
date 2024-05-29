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



public class HICollapseButton extends HIFoundation { 

	private HIStyle style;
	/**
 CSS styles for the collapse button. In styled mode, the collapse button style is given in the `.highcharts-collapse-button` class. 
	*/
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private Boolean enabled;
	/**
 Whether the button should be visible. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String shape;
	/**
 The symbol of the collapse button. 
 <br><br><b>defaults:</b><br><br>&ensp;circle	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private Number height;
	/**
 Height of the button. 
 <br><br><b>defaults:</b><br><br>&ensp;18	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number width;
	/**
 Width of the button. 
 <br><br><b>defaults:</b><br><br>&ensp;18	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Boolean onlyOnHover;
	/**
 Whether the button should be visible only when the node is hovered. When set to true, the button is hidden for nodes, which are not collapsed, and shown for the collapsed ones. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setOnlyOnHover(Boolean onlyOnHover) {
		this.onlyOnHover = onlyOnHover;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOnlyOnHover(){ return onlyOnHover; }

	private Number y;
	/**
 Offset of the button in the y direction. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 Offset of the button in the x direction. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number lineWidth;
	/**
 The line width of the button in pixels 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }



	public HICollapseButton() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.onlyOnHover != null) {
			params.put("onlyOnHover", this.onlyOnHover);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		return params;
	}

}