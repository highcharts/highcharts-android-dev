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



public class HIBackground extends HIFoundation { 

	private HIColor borderColor;
	/**
 The pane background border color. 
 <br><br><b>defaults:</b><br><br>&ensp;#cccccc	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Object /* Number, String */ outerRadius;
	/**
 The outer radius of the circular pane background. Can be either numeric (pixels) or a percentage string. 
 <br><br><b>defaults:</b><br><br>&ensp;105%	*/
	public void setOuterRadius(Object /* Number, String */ outerRadius) {
		this.outerRadius = outerRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getOuterRadius(){ return outerRadius; }

	private Object /* Number, String */ borderRadius;
	/**
 The border radius of the pane background when the shape is `arc`. Can be a number (pixels) or a percentage string. 
	*/
	public void setBorderRadius(Object /* Number, String */ borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getBorderRadius(){ return borderRadius; }

	private Object /* Number, String */ innerRadius;
	/**
 The inner radius of the pane background. Can be either numeric (pixels) or a percentage string. 
	*/
	public void setInnerRadius(Object /* Number, String */ innerRadius) {
		this.innerRadius = innerRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getInnerRadius(){ return innerRadius; }

	private String className;
	/**
 The class name for this background. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private String shape;
	/**
 The shape of the pane background. When `solid`, the background is circular. When `arc`, the background extends only from the min to the max of the value axis. 
 <br><br><b>defaults:</b><br><br>&ensp;circle	*/
	public void setShape(String shape) {
		this.shape = shape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShape(){ return shape; }

	private Number borderWidth;
	/**
 The pixel border width of the pane background. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private HIColor backgroundColor;
	/**
 The background color or gradient for the pane. 
 <br><br><b>defaults:</b><br><br>&ensp;{ linearGradient: { x1: 0, y1: 0, x2: 0, y2: 1 }, stops: [[0, #ffffff], [1, #e6e6e6]] }	*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }



	public HIBackground() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.outerRadius != null) {
			params.put("outerRadius", this.outerRadius);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.shape != null) {
			params.put("shape", this.shape);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		return params;
	}

}