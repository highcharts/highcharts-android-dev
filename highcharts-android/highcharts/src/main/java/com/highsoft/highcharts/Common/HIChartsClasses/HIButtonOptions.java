/**
* (c) 2009-2017 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/


package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIGFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;


/**
* description: A collection of options for buttons appearing in the exporting module.
In styled mode, the buttons are styled with the .highcharts-contextbutton and .highcharts-button-symbol class.
*/
public class HIButtonOptions implements HIChartsJSONSerializable { 


/**
* description: A configuration object for the button theme. The object accepts
SVG properties like stroke-width, stroke and fill. Tri-state
button styles are supported by the states.hover and states.select
objects.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-theme/ : Theming the buttons

*/
	public HITheme theme;

/**
* description: Fill color for the symbol within the button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/ : Blue symbol stroke for one of the buttons

* default: #666666
*/
	public HIColor symbolFill;

/**
* description: The color of the symbol's stroke or line.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/ : Blue symbol stroke

* default: #666666
*/
	public HIColor symbolStroke;

/**
* description: The pixel width of the button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons

* default: 24
*/
	public Number width;

/**
* description: The vertical alignment of the buttons. Can be one of "top", "middle"
or "bottom".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/ : Buttons at lower right

* accepted values: ["top", "middle", "bottom"]
* default: top
*/
	public String verticalAlign;

/**
* description: The pixel size of the symbol on the button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons

* default: 14
*/
	public Number symbolSize;

/**
* description: The pixel stroke width of the symbol on the button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons

* default: 1
*/
	public Number symbolStrokeWidth;

/**
* description: A text string to add to the individual button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/ : Full text button
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/ : Combined symbol and text


* default: null
*/
	public String text;

/**
* description: Alignment for the buttons.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-align/ : Center aligned

* accepted values: ["left", "center", "right"]
* default: right
*/
	public String align;

/**
* description: The vertical offset of the button's position relative to its
verticalAlign.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/ : Buttons at lower right

* default: 0
*/
	public Number y;

/**
* description: The x position of the center of the symbol inside the button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons

* default: 12.5
*/
	public Number symbolX;

/**
* description: The y position of the center of the symbol inside the button.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons

* default: 10.5
*/
	public Number symbolY;

/**
* description: Pixel height of the buttons.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/ : Bigger buttons

* default: 22
*/
	public Number height;

/**
* description: Whether to enable buttons.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/ : Exporting module loaded but buttons disabled

* default: true
*/
	public Boolean enabled;

/**
* description: The pixel spacing between buttons.
* default: 3
*/
	public Number buttonSpacing;


	public HIButtonOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.theme != null) {
			params.put("theme", this.theme.getParams());
		}
		if (this.symbolFill != null) {
			params.put("symbolFill", this.symbolFill.getData());
		}
		if (this.symbolStroke != null) {
			params.put("symbolStroke", this.symbolStroke.getData());
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.symbolSize != null) {
			params.put("symbolSize", this.symbolSize);
		}
		if (this.symbolStrokeWidth != null) {
			params.put("symbolStrokeWidth", this.symbolStrokeWidth);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.symbolX != null) {
			params.put("symbolX", this.symbolX);
		}
		if (this.symbolY != null) {
			params.put("symbolY", this.symbolY);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.buttonSpacing != null) {
			params.put("buttonSpacing", this.buttonSpacing);
		}
		return params;
	}

}