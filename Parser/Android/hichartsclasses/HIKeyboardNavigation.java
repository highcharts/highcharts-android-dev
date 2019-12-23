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

	private Boolean enabled;
	/**
 Enable keyboard navigation for the legend. 
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

	private HISeriesNavigation seriesNavigation;
	/**
 Options for the keyboard navigation of data points and series. 
	*/
	public void setSeriesNavigation(HISeriesNavigation seriesNavigation) {
		this.seriesNavigation = seriesNavigation;
		this.seriesNavigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeriesNavigation getSeriesNavigation(){ return seriesNavigation; }



	public HIKeyboardNavigation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
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
		if (this.seriesNavigation != null) {
			params.put("seriesNavigation", this.seriesNavigation.getParams());
		}
		return params;
	}

}