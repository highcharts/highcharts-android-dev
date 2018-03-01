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



public class HIContextButton implements HIChartsJSONSerializable { 


/**
* description: See navigation.buttonOptions.symbolFill.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/ : Blue symbol stroke for one of the buttons
* default: #666666
*/
	public HIColor symbolFill;

/**
The symbol for the button. Points to a definition function in
the Highcharts.Renderer.symbols collection. The default exportIcon
function is part of the exporting module.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol/ : Use a circle for symbol
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol-custom/ : Custom shape as symbol
* accepted values: ["circle", "square", "diamond", "triangle", "triangle-down", "menu"]
* default: menu
*/
	public String symbol;

/**
The class name of the context button.
*/
	public String className;

/**
The key to a lang option setting that is used for the
button's title tooltip. When the key is contextButtonTitle, it
refers to lang.contextButtonTitle
that defaults to "Chart context menu".
*/
	public String _titleKey;

/**
A click handler callback to use on the button directly instead of
the popup menu.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-onclick/ : Skip the menu and export the chart directly
*/
	public HIFunction onclick;

/**
The horizontal position of the button relative to the align
option.
* default: -10
*/
	public Number x;

/**
The class name of the menu appearing from the button.
*/
	public String menuClassName;

/**
A collection of strings pointing to config options for the menu
items. The config options are defined in the
menuItemDefinitions option.

By default, there is the "Print" menu item plus one menu item
for each of the available export types. 

Defaults to 

[
	'printChart',
	'separator',
	'downloadPNG',
	'downloadJPEG',
	'downloadPDF',
	'downloadSVG'
]

* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/ : Menu item definitions
*/
	public ArrayList menuItems;

/**
The vertical alignment of the buttons. Can be one of "top", "middle"
or "bottom".
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/ : Buttons at lower right
* accepted values: ["top", "middle", "bottom"]
* default: top
*/
	public String verticalAlign;

/**
A text string to add to the individual button.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/ : Full text button
https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/ : Combined symbol and text
* default: null
*/
	public String text;

/**
Alignment for the buttons.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-align/ : Center aligned
* accepted values: ["left", "center", "right"]
* default: right
*/
	public String align;

/**
Whether to enable buttons.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/ : Exporting module loaded but buttons disabled
* default: true
*/
	public Boolean enabled;

/**
A configuration object for the button theme. The object accepts
SVG properties like stroke-width, stroke and fill. Tri-state
button styles are supported by the states.hover and states.select
objects.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-theme/ : Theming the buttons
*/
	public HITheme theme;

/**
Pixel height of the buttons.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons
* default: 22
*/
	public Number height;

/**
The pixel width of the button.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons
* default: 24
*/
	public Number width;

/**
The pixel spacing between buttons.
* default: 3
*/
	public Number buttonSpacing;

/**
The pixel size of the symbol on the button.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons
* default: 14
*/
	public Number symbolSize;

/**
The vertical offset of the button's position relative to its
verticalAlign.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/ : Buttons at lower right
* default: 0
*/
	public Number y;

/**
The color of the symbol's stroke or line.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/ : Blue symbol stroke
* default: #666666
*/
	public HIColor symbolStroke;

/**
The y position of the center of the symbol inside the button.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons
* default: 10.5
*/
	public Number symbolY;

/**
The x position of the center of the symbol inside the button.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons
* default: 12.5
*/
	public Number symbolX;

/**
The pixel stroke width of the symbol on the button.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons
* default: 1
*/
	public Number symbolStrokeWidth;


	public HIContextButton() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.symbolFill != null) {
			params.put("symbolFill", this.symbolFill.getData());
		}
		if (this.symbol != null) {
			params.put("symbol", this.symbol);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this._titleKey != null) {
			params.put("_titleKey", this._titleKey);
		}
		if (this.onclick != null) {
			params.put("onclick", this.onclick);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.menuClassName != null) {
			params.put("menuClassName", this.menuClassName);
		}
		if (this.menuItems != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.menuItems) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("menuItems", array);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.theme != null) {
			params.put("theme", this.theme.getParams());
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.buttonSpacing != null) {
			params.put("buttonSpacing", this.buttonSpacing);
		}
		if (this.symbolSize != null) {
			params.put("symbolSize", this.symbolSize);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.symbolStroke != null) {
			params.put("symbolStroke", this.symbolStroke.getData());
		}
		if (this.symbolY != null) {
			params.put("symbolY", this.symbolY);
		}
		if (this.symbolX != null) {
			params.put("symbolX", this.symbolX);
		}
		if (this.symbolStrokeWidth != null) {
			params.put("symbolStrokeWidth", this.symbolStrokeWidth);
		}
		return params;
	}

}