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


/**
* description: The chart's subtitle. This can be used both to display a subtitle below
the main title, and to display random text anywhere in the chart. The
subtitle can be updated after chart initialization through the 
Chart.setTitle method.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/title/subtitle/ : Subtitle options demonstrated
*/
public class HISubtitle implements HIChartsJSONSerializable { 


/**
* description: CSS styles for the title.
In styled mode, the subtitle style is given in the .highcharts-subtitle class.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/style/ : Custom color and weight
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/ : Styled mode

* default: { "color": "#666666" }
*/
	public HashMap<String,String> style;

/**
* description: The vertical alignment of the title. Can be one of "top", "middle"
and "bottom". When a value is given, the title behaves as floating.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/ : Footnote at the bottom right of plot area
* accepted values: ["top", "middle", "bottom"]
*/
	public String verticalAlign;

/**
* description: The subtitle of the chart.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text/ : Custom subtitle
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text-formatted/ : Formatted and linked text.
*/
	public String text;

/**
* description: When the subtitle is floating, the plot area will not move to make
space for it.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/floating/ : Floating title and subtitle
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote : Footnote floating at bottom right of plot area
* default: false
*/
	public Boolean floating;

/**
* description: Whether to http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html : use HTML to render the text.
* default: false
*/
	public Boolean useHTML;

/**
* description: The horizontal alignment of the subtitle. Can be one of "left",
 "center" and "right".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/ : Footnote at right of plot area
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote : Footnote at bottom right of plot area
* accepted values: ["left", "center", "right"]
* default: center
*/
	public String align;

/**
* description: The x position of the subtitle relative to the alignment within chart.
spacingLeft and chart.spacingRight.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/ : Footnote at right of plot area
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote : Footnote at the bottom right of plot area
* default: 0
*/
	public Number x;

/**
* description: The y position of the subtitle relative to the alignment within chart.
spacingTop and chart.spacingBottom. By default the subtitle is laid
out below the title unless the title is floating.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/ : Footnote at the bottom right of plot area
*/
	public Number y;

/**
* description: Adjustment made to the subtitle width, normally to reserve space
for the exporting burger menu.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/ : Wider menu, greater padding

* default: -44
*/
	public Number widthAdjust;


	public HISubtitle() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.widthAdjust != null) {
			params.put("widthAdjust", this.widthAdjust);
		}
		return params;
	}

}