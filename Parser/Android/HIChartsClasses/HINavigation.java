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
import com.highsoft.highcharts.Common.HIColor;



public class HINavigation extends Observable implements HIChartsJSONSerializable { 

	private HIMenuStyle menuStyle;
/**
CSS styles for the popup menu appearing by default when the export
icon is clicked. This menu is rendered in HTML.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menustyle/">Light gray menu background</a> <br><br><b>default:</b><br><br>&ensp;{ "border": "1px solid #999999", "background": "#ffffff", "padding": "5px 0" }*/
	public void setMenuStyle(HIMenuStyle menuStyle) {
		this.menuStyle = menuStyle;
		this.menuStyle.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMenuStyle getMenuStyle(){ return menuStyle; }

	private HIMenuItemStyle menuItemStyle;
/**
CSS styles for the individual items within the popup menu appearing
by default when the export icon is clicked. The menu items are rendered
in HTML.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemstyle/">Add a grey stripe to the left</a> <br><br><b>default:</b><br><br>&ensp;{ "padding": "0.5em 1em", "color": "#333333", "background": "none" }*/
	public void setMenuItemStyle(HIMenuItemStyle menuItemStyle) {
		this.menuItemStyle = menuItemStyle;
		this.menuItemStyle.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMenuItemStyle getMenuItemStyle(){ return menuItemStyle; }

	private HIButtonOptions buttonOptions;
/**
A collection of options for buttons appearing in the exporting module.


In styled mode, the buttons are styled with the
.highcharts-contextbutton and .highcharts-button-symbol classes.
*/
	public void setButtonOptions(HIButtonOptions buttonOptions) {
		this.buttonOptions = buttonOptions;
		this.buttonOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIButtonOptions getButtonOptions(){ return buttonOptions; }

	private HIMenuItemHoverStyle menuItemHoverStyle;
/**
CSS styles for the hover state of the individual items within the
popup menu appearing by default when the export icon is clicked.
 The menu items are rendered in HTML.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemhoverstyle/">Bold text on hover</a> <br><br><b>default:</b><br><br>&ensp;{ "background": "#335cad", "color": "#ffffff" }*/
	public void setMenuItemHoverStyle(HIMenuItemHoverStyle menuItemHoverStyle) {
		this.menuItemHoverStyle = menuItemHoverStyle;
		this.menuItemHoverStyle.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMenuItemHoverStyle getMenuItemHoverStyle(){ return menuItemHoverStyle; }

	private HashMap<String, String> style;
/**
Text styles for the legend page navigation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>*/
	public void setStyle(HashMap<String, String> style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap<String, String> getStyle(){ return style; }

	private HIColor inactiveColor;
/**
The color of the inactive up or down arrow in the legend page
navigation. .
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#cccccc*/
	public void setInactiveColor(HIColor inactiveColor) {
		this.inactiveColor = inactiveColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getInactiveColor(){ return inactiveColor; }

	private Boolean enabled;
/**
Whether to enable the legend navigation. In most cases, disabling
the navigation results in an unwanted overflow.

See also the [adapt chart to legend](
https://www.highcharts.com/products/plugin-registry/single/8/Adapt-Chart-To-Legend)
plugin for a solution to extend the chart height to make room for
the legend, optionally in exported charts only.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number arrowSize;
/**
The pixel size of the up and down arrows in the legend paging
navigation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;12*/
	public void setArrowSize(Number arrowSize) {
		this.arrowSize = arrowSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getArrowSize(){ return arrowSize; }

	private Object animation;
/**
How to animate the pages when navigating up or down. A value of
true applies the default navigation given in the
chart.animation option. Additional options can be given as an
object containing values for easing and duration.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public void setAnimation(Object animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAnimation(){ return animation; }

	private HIColor activeColor;
/**
The color for the active up or down arrow in the legend page
navigation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#003399*/
	public void setActiveColor(HIColor activeColor) {
		this.activeColor = activeColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getActiveColor(){ return activeColor; }



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
			params.put("menuStyle", this.menuStyle.getParams());
		}
		if (this.menuItemStyle != null) {
			params.put("menuItemStyle", this.menuItemStyle.getParams());
		}
		if (this.buttonOptions != null) {
			params.put("buttonOptions", this.buttonOptions.getParams());
		}
		if (this.menuItemHoverStyle != null) {
			params.put("menuItemHoverStyle", this.menuItemHoverStyle.getParams());
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
		return params;
	}

}