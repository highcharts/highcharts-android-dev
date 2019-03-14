/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIKeyboardNavigation extends HIFoundation { 

	private Boolean enabled;
	/**
 Enable/disable keyboard navigation for the legend. Requires the Accessibility module. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIFocusBorder focusBorder;
	/**
 Options for the focus border drawn around elements while navigating through them. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-focus">Custom focus ring</a>
	*/
	public void setFocusBorder(HIFocusBorder focusBorder) {
		this.focusBorder = focusBorder;
		this.focusBorder.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFocusBorder getFocusBorder(){ return focusBorder; }

	private String mode;
	/**
 Set the keyboard navigation mode for the chart. Can be "normal" or "serialize". In normal mode, left/right arrow keys move between points in a series, while up/down arrow keys move between series. Up/down navigation acts intelligently to figure out which series makes sense to move to from any given point. In "serialize" mode, points are instead navigated as a single list. Left/right behaves as in "normal" mode. Up/down arrow keys will behave like left/right. This is useful for unifying navigation behavior with/without screen readers enabled. <br><br><b>accepted values:</b><br><br>&ensp;["normal", "serialize"]
 <br><br><b>defaults:</b><br><br>&ensp;normal	*/
	public void setMode(String mode) {
		this.mode = mode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMode(){ return mode; }

	private Boolean skipNullPoints;
	/**
 Skip null points when navigating through points with the keyboard. 
	*/
	public void setSkipNullPoints(Boolean skipNullPoints) {
		this.skipNullPoints = skipNullPoints;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkipNullPoints(){ return skipNullPoints; }



	public HIKeyboardNavigation() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.focusBorder != null) {
			params.put("focusBorder", this.focusBorder.getParams());
		}
		if (this.mode != null) {
			params.put("mode", this.mode);
		}
		if (this.skipNullPoints != null) {
			params.put("skipNullPoints", this.skipNullPoints);
		}
		return params;
	}

}