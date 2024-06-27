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



public class HIFocusBorder extends HIFoundation { 

	private Number margin;
	/**
 Focus border margin around the elements. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private HICSSObject style;
	/**
 Style options for the focus border drawn around elements while navigating through them. Note that some browsers in addition draw their own borders for focused elements. These automatic borders cannot be styled by Highcharts. In styled mode, the border is given the `.highcharts-focus-border` class. 
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Boolean enabled;
	/**
 Enable/disable focus border for chart. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean hideBrowserFocusOutline;
	/**
 Hide the browser's defaults focus indicator. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setHideBrowserFocusOutline(Boolean hideBrowserFocusOutline) {
		this.hideBrowserFocusOutline = hideBrowserFocusOutline;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getHideBrowserFocusOutline(){ return hideBrowserFocusOutline; }



	public HIFocusBorder() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
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