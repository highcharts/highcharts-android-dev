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





public class HIMenuItemStyle extends Observable implements HIChartsJSONSerializable { 

	private String padding;
	public void setPadding(String padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPadding(){ return padding; }

	private String color;
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private String transition;
	public void setTransition(String transition) {
		this.transition = transition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTransition(){ return transition; }

	private String fontSize;
/**
/** Defaults to 14px on touch devices and 11px on desktop. 
*/
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontSize(){ return fontSize; }

	private String background;
	public void setBackground(String background) {
		this.background = background;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackground(){ return background; }



	public HIMenuItemStyle() {

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
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.transition != null) {
			params.put("transition", this.transition);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.background != null) {
			params.put("background", this.background);
		}
		return params;
	}

}