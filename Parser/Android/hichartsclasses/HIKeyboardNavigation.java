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



public class HIKeyboardNavigation extends HIFoundation { 

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

	private Boolean enabled;
	/**
 Enable keyboard navigation for the chart. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean wrapAround;
	/**
 Whether or not to wrap around when reaching the end of arrow-key navigation for an element in the chart. 
	*/
	public void setWrapAround(Boolean wrapAround) {
		this.wrapAround = wrapAround;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getWrapAround(){ return wrapAround; }

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

	private ArrayList<String> order;
	/**
 Order of tab navigation in the chart. Determines which elements are tabbed to first. Available elements are: series, zoom, rangeSelector, chartMenu, legend. In addition, any custom components can be added here. 
	*/
	public void setOrder(ArrayList<String> order) {
		this.order = order;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getOrder(){ return order; }

	private String mode;
	/**
 Set the keyboard navigation mode for the chart. Can be "normal" or "serialize". In normal mode, left/right arrow keys move between points in a series, while up/down arrow keys move between series. Up/down navigation acts intelligently to figure out which series makes sense to move to from any given point. In "serialize" mode, points are instead navigated as a single list. Left/right behaves as in "normal" mode. Up/down arrow keys will behave like left/right. This can be useful for unifying navigation behavior with/without screen readers enabled. <br><br><b>accepted values:</b><br><br>&ensp;["normal", "serialize"]
 <br><br><b>defaults:</b><br><br>&ensp;normal	*/
	public void setMode(String mode) {
		this.mode = mode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMode(){ return mode; }



	public HIKeyboardNavigation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.skipNullPoints != null) {
			params.put("skipNullPoints", this.skipNullPoints);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.wrapAround != null) {
			params.put("wrapAround", this.wrapAround);
		}
		if (this.focusBorder != null) {
			params.put("focusBorder", this.focusBorder.getParams());
		}
		if (this.order != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.order) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("order", array);
		}
		if (this.mode != null) {
			params.put("mode", this.mode);
		}
		return params;
	}

}