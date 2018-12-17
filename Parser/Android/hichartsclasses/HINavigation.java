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
import com.highsoft.highcharts.common.HIColor;





public class HINavigation extends Observable implements HIChartsJSONSerializable { 

	private HICSSObject menuStyle;
/**
/** CSS styles for the popup menu appearing by defaults when the export icon is clicked. This menu is rendered in HTML. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menustyle/">Light gray menu background</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"border": "1px solid #999999", "background": "#ffffff", "padding": "5px 0"}*/
	public void setMenuStyle(HICSSObject menuStyle) {
		this.menuStyle = menuStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getMenuStyle(){ return menuStyle; }

	private HIButtonOptions buttonOptions;
/**
/** A collection of options for buttons appearing in the exporting module. In styled mode, the buttons are styled with the .highcharts-contextbutton and .highcharts-button-symbol classes. 
*/
	public void setButtonOptions(HIButtonOptions buttonOptions) {
		this.buttonOptions = buttonOptions;
		this.buttonOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIButtonOptions getButtonOptions(){ return buttonOptions; }

	private String bindingsClassName;
/**
/** A CSS class name where all bindings will be attached to. Multiple charts on the same page should have separate class names to prevent duplicating events. 
*/
	public void setBindingsClassName(String bindingsClassName) {
		this.bindingsClassName = bindingsClassName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBindingsClassName(){ return bindingsClassName; }

	private HIEvents events;
/**
/** Events to communicate between Stock Tools and custom GUI. 
*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private HICSSObject menuItemStyle;
/**
/** CSS styles for the individual items within the popup menu appearing by defaults when the export icon is clicked. The menu items are rendered in HTML. Font size defaultss to 11px on desktop and 14px on touch devices. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemstyle/">Add a grey stripe to the left</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"padding": "0.5em 1em", "color": "#333333", "background": "none", "fontSize": "11px/14px", "transition": "background 250ms, color 250ms"}*/
	public void setMenuItemStyle(HICSSObject menuItemStyle) {
		this.menuItemStyle = menuItemStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getMenuItemStyle(){ return menuItemStyle; }

	private HICSSObject menuItemHoverStyle;
/**
/** CSS styles for the hover state of the individual items within the popup menu appearing by defaults when the export icon is clicked. The menu items are rendered in HTML. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemhoverstyle/">Bold text on hover</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"background": "#335cad", "color": "#ffffff"}*/
	public void setMenuItemHoverStyle(HICSSObject menuItemHoverStyle) {
		this.menuItemHoverStyle = menuItemHoverStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getMenuItemHoverStyle(){ return menuItemHoverStyle; }

	private HIBindings bindings;
/**
/** Bindings definitions for custom HTML buttons. Each binding implements simple event-driven interface: - className: classname used to bind event to - init: initial event, fired on button click - start: fired on first click on a chart - steps: array of sequential events fired one after another on each  of users clicks - end: last event to be called after last step event <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/stocktools/stocktools-thresholds">Custom bindings in Highstock</a>
*/
	public void setBindings(HIBindings bindings) {
		this.bindings = bindings;
		this.bindings.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBindings getBindings(){ return bindings; }

	private HICSSObject style;
/**
/** Text styles for the legend page navigation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private HIColor inactiveColor;
/**
/** The color of the inactive up or down arrow in the legend page navigation. . <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
*/
	public void setInactiveColor(HIColor inactiveColor) {
		this.inactiveColor = inactiveColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getInactiveColor(){ return inactiveColor; }

	private Boolean enabled;
/**
/** Whether to enable the legend navigation. In most cases, disabling the navigation results in an unwanted overflow. See also the [adapt chart to legend](https://www.highcharts.com/products/plugin-registry/single/8/Adapt-Chart-To-Legend) plugin for a solution to extend the chart height to make room for the legend, optionally in exported charts only. 
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number arrowSize;
/**
/** The pixel size of the up and down arrows in the legend paging navigation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
 <br><br><b>defaults:</b><br><br>&ensp;12*/
	public void setArrowSize(Number arrowSize) {
		this.arrowSize = arrowSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getArrowSize(){ return arrowSize; }

	private HIAnimationOptionsObject animation;
/**
/** How to animate the pages when navigating up or down. A value of true applies the defaults navigation given in the chart.animation option. Additional options can be given as an object containing values for easing and duration. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private HIColor activeColor;
/**
/** The color for the active up or down arrow in the legend page navigation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>
*/
	public void setActiveColor(HIColor activeColor) {
		this.activeColor = activeColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getActiveColor(){ return activeColor; }

	private HIPopup popup;
/**
/** Translations for all field names used in popup. 
*/
	public void setPopup(HIPopup popup) {
		this.popup = popup;
		this.popup.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPopup getPopup(){ return popup; }



	public HINavigation() {

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
		if (this.menuStyle != null) {
			params.put("menuStyle", this.menuStyle);
		}
		if (this.buttonOptions != null) {
			params.put("buttonOptions", this.buttonOptions.getParams());
		}
		if (this.bindingsClassName != null) {
			params.put("bindingsClassName", this.bindingsClassName);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.menuItemStyle != null) {
			params.put("menuItemStyle", this.menuItemStyle);
		}
		if (this.menuItemHoverStyle != null) {
			params.put("menuItemHoverStyle", this.menuItemHoverStyle);
		}
		if (this.bindings != null) {
			params.put("bindings", this.bindings.getParams());
		}
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.inactiveColor != null) {
			params.put("inactiveColor", this.inactiveColor.getData());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.arrowSize != null) {
			params.put("arrowSize", this.arrowSize);
		}
		if (this.animation != null) {
			params.put("animation", this.animation);
		}
		if (this.activeColor != null) {
			params.put("activeColor", this.activeColor.getData());
		}
		if (this.popup != null) {
			params.put("popup", this.popup.getParams());
		}
		return params;
	}

}