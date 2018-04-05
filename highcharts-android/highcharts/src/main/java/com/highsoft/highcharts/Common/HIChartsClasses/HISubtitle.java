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



public class HISubtitle implements HIChartsJSONSerializable { 


/**
CSS styles for the title.

In styled mode, the subtitle style is given in the .highcharts-subtitle class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/style/">Custom color and weight</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;{ "color": "#666666" }*/
	public HashMap<String,String> style;

/**
The vertical alignment of the title. Can be one of "top", "middle"
and "bottom". When a value is given, the title behaves as floating.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]*/
	public String verticalAlign;

/**
The subtitle of the chart.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text/">Custom subtitle</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text-formatted/">Formatted and linked text.</a>*/
	public String text;

/**
The horizontal alignment of the subtitle. Can be one of "left",
 "center" and "right".
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"] <br><br><b>default:</b><br><br>&ensp;center*/
	public String align;

/**
Whether to [use HTML](http://www.highcharts.com/docs/chart-concepts/labels-
and-string-formatting#html) to render the text.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean useHTML;

/**
The y position of the subtitle relative to the alignment within chart.
spacingTop and chart.spacingBottom. By default the subtitle is laid
out below the title unless the title is floating.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public Number y;

/**
The x position of the subtitle relative to the alignment within chart.
spacingLeft and chart.spacingRight.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number x;

/**
Adjustment made to the subtitle width, normally to reserve space
for the exporting burger menu.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/">Wider menu, greater padding</a> <br><br><b>default:</b><br><br>&ensp;-44*/
	public Number widthAdjust;

/**
When the subtitle is floating, the plot area will not move to make
space for it.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/floating/">Floating title and subtitle</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean floating;


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
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.widthAdjust != null) {
			params.put("widthAdjust", this.widthAdjust);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		return params;
	}

}