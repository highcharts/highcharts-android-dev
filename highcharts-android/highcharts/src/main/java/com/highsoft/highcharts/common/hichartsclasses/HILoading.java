/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HILoading extends HIFoundation { 

	private HICSSObject style;
	/**
 CSS styles for the loading screen that covers the plot area. In styled mode, the loading label is styled with the `.highcharts-loading` class. 
 <br><br><b>defaults:</b><br><br>&ensp;{"position": "absolute", "backgroundColor": "#ffffff", "opacity": 0.5, "textAlign": "center"}	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private HICSSObject labelStyle;
	/**
 CSS styles for the loading label `span`. 
 <br><br><b>defaults:</b><br><br>&ensp;{"fontWeight": "bold", "position": "relative", "top": "45%"}	*/
	public void setLabelStyle(HICSSObject labelStyle) {
		this.labelStyle = labelStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getLabelStyle(){ return labelStyle; }

	private Number hideDuration;
	/**
 The duration in milliseconds of the fade out effect. 
 <br><br><b>defaults:</b><br><br>&ensp;100	*/
	public void setHideDuration(Number hideDuration) {
		this.hideDuration = hideDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHideDuration(){ return hideDuration; }

	private Number showDuration;
	/**
 The duration in milliseconds of the fade in effect. 
 <br><br><b>defaults:</b><br><br>&ensp;100	*/
	public void setShowDuration(Number showDuration) {
		this.showDuration = showDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getShowDuration(){ return showDuration; }



	public HILoading() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.labelStyle != null) {
			params.put("labelStyle", this.labelStyle.getParams());
		}
		if (this.hideDuration != null) {
			params.put("hideDuration", this.hideDuration);
		}
		if (this.showDuration != null) {
			params.put("showDuration", this.showDuration);
		}
		return params;
	}

}