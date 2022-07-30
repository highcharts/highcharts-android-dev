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



public class HINavigation extends HIFoundation { 

	private HIButtonOptions buttonOptions;
	public void setButtonOptions(HIButtonOptions buttonOptions) {
		this.buttonOptions = buttonOptions;
		this.buttonOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIButtonOptions getButtonOptions(){ return buttonOptions; }

	private HIAnnotationsOptions annotationsOptions;
	/**
 Additional options to be merged into all annotations. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/stocktools/navigation-annotation-options">Set red color of all line annotations</a>
	*/
	public void setAnnotationsOptions(HIAnnotationsOptions annotationsOptions) {
		this.annotationsOptions = annotationsOptions;
		this.annotationsOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnnotationsOptions getAnnotationsOptions(){ return annotationsOptions; }

	private String bindingsClassName;
	/**
 A CSS class name where all bindings will be attached to. Multiple charts on the same page should have separate class names to prevent duplicating events. Default value of versions < 7.0.4 highcharts-bindings-wrapper 
	*/
	public void setBindingsClassName(String bindingsClassName) {
		this.bindingsClassName = bindingsClassName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBindingsClassName(){ return bindingsClassName; }

	private HIBreadcrumbs breadcrumbs;
	/**
 Options for breadcrumbs. Breadcrumbs general options are defined in navigation.breadcrumbs. Specific options for drilldown are set in drilldown.breadcrumbs and for tree-like series traversing, in plotOptions[series].breadcrumbs. 
	*/
	public void setBreadcrumbs(HIBreadcrumbs breadcrumbs) {
		this.breadcrumbs = breadcrumbs;
		this.breadcrumbs.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBreadcrumbs getBreadcrumbs(){ return breadcrumbs; }

	private HIBindings bindings;
	/**
 Bindings definitions for custom HTML buttons. Each binding implements simple event-driven interface: - className: classname used to bind event to - init: initial event, fired on button click - start: fired on first click on a chart - steps: array of sequential events fired one after another on each  of users clicks - end: last event to be called after last step event <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/bindings/">Simple binding</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/bindings-custom-annotation/">Custom annotation binding</a>
	*/
	public void setBindings(HIBindings bindings) {
		this.bindings = bindings;
		this.bindings.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBindings getBindings(){ return bindings; }

	private HIEvents events;
	/**
 Events to communicate between Stock Tools and custom GUI. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private String iconsURL;
	/**
 Path where Highcharts will look for icons. Change this to use icons from a different server. 
	*/
	public void setIconsURL(String iconsURL) {
		this.iconsURL = iconsURL;
		this.setChanged();
		this.notifyObservers();
	}

	public String getIconsURL(){ return iconsURL; }



	public HINavigation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.buttonOptions != null) {
			params.put("buttonOptions", this.buttonOptions.getParams());
		}
		if (this.annotationsOptions != null) {
			params.put("annotationsOptions", this.annotationsOptions.getParams());
		}
		if (this.bindingsClassName != null) {
			params.put("bindingsClassName", this.bindingsClassName);
		}
		if (this.breadcrumbs != null) {
			params.put("breadcrumbs", this.breadcrumbs.getParams());
		}
		if (this.bindings != null) {
			params.put("bindings", this.bindings.getParams());
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.iconsURL != null) {
			params.put("iconsURL", this.iconsURL);
		}
		return params;
	}

}