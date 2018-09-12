/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HIFocusBorder extends Observable implements HIChartsJSONSerializable { 

	private Number margin;
/**
Focus border margin around the elements.
 <br><br><b>default:</b><br><br>&ensp;2*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private HIStyle style;
/**
Style options for the focus border drawn around elements
while navigating through them. Note that some browsers in
addition draw their own borders for focused elements. These
automatic borders can not be styled by Highcharts.

In styled mode, the border is given the
.highcharts-focus-border class.
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
Enable/disable focus border for chart.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean hideBrowserFocusOutline;
/**
Hide the browser's default focus indicator.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public void setHideBrowserFocusOutline(Boolean hideBrowserFocusOutline) {
		this.hideBrowserFocusOutline = hideBrowserFocusOutline;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getHideBrowserFocusOutline(){ return hideBrowserFocusOutline; }



	public HIFocusBorder() {

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
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.hideBrowserFocusOutline != null) {
			params.put("hideBrowserFocusOutline", this.hideBrowserFocusOutline);
		}
		return params;
	}

}