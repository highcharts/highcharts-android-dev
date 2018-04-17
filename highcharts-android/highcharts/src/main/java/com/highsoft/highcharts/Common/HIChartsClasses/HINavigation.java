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
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



public class HINavigation implements HIChartsJSONSerializable { 


/**
CSS styles for the popup menu appearing by default when the export
icon is clicked. This menu is rendered in HTML.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menustyle/">Light gray menu background</a> <br><br><b>default:</b><br><br>&ensp;{ "border": "1px solid #999999", "background": "#ffffff", "padding": "5px 0" }*/
	public HIMenuStyle menuStyle;

/**
CSS styles for the individual items within the popup menu appearing
by default when the export icon is clicked. The menu items are rendered
in HTML.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemstyle/">Add a grey stripe to the left</a> <br><br><b>default:</b><br><br>&ensp;{ "padding": "0.5em 1em", "color": "#333333", "background": "none" }*/
	public HIMenuItemStyle menuItemStyle;

/**
A collection of options for buttons appearing in the exporting module.


In styled mode, the buttons are styled with the
.highcharts-contextbutton and .highcharts-button-symbol classes.
*/
	public HIButtonOptions buttonOptions;

/**
CSS styles for the hover state of the individual items within the
popup menu appearing by default when the export icon is clicked.
 The menu items are rendered in HTML.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/menuitemhoverstyle/">Bold text on hover</a> <br><br><b>default:</b><br><br>&ensp;{ "background": "#335cad", "color": "#ffffff" }*/
	public HIMenuItemHoverStyle menuItemHoverStyle;

/**
Text styles for the legend page navigation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a>*/
	public HashMap<String,String> style;

/**
The pixel size of the up and down arrows in the legend paging
navigation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;12*/
	public Number arrowSize;

/**
Whether to enable the legend navigation. In most cases, disabling
the navigation results in an unwanted overflow.

See also the [adapt chart to legend](http://www.highcharts.com/plugin-
registry/single/8/Adapt-Chart-To-Legend) plugin for a solution to
extend the chart height to make room for the legend, optionally in
exported charts only.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean enabled;

/**
The color of the inactive up or down arrow in the legend page
navigation. .
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#cccccc*/
	public HIColor inactiveColor;

/**
How to animate the pages when navigating up or down. A value of true
applies the default navigation given in the chart.animation option.
Additional options can be given as an object containing values for
easing and duration.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Object /* Boolean|Object */ animation;

/**
The color for the active up or down arrow in the legend page navigation.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/legend/navigation/">Legend page navigation demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#003399*/
	public HIColor activeColor;


	public HINavigation() {

	}

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
		if (this.arrowSize != null) {
			params.put("arrowSize", this.arrowSize);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.inactiveColor != null) {
			params.put("inactiveColor", this.inactiveColor.getData());
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