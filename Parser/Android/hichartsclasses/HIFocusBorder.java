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





public class HIFocusBorder extends Observable implements HIChartsJSONSerializable { 

	private Number margin;
/**
/** Focus border margin around the elements. 
*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private HICSSObject style;
/**
/** Style options for the focus border drawn around elements while navigating through them. Note that some browsers in addition draw their own borders for focused elements. These automatic borders can not be styled by Highcharts. In styled mode, the border is given the .highcharts-focus-border class. 
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#335cad", "lineWidth": 2, "borderRadius": 3}*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Boolean enabled;
/**
/** Enable/disable focus border for chart. 
*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean hideBrowserFocusOutline;
/**
/** Hide the browser's defaults focus indicator. 
*/
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
			params.put("style", this.style);
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