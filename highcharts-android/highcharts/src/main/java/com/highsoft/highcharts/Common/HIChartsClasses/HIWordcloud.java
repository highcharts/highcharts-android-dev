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



/**
A wordcloud series. If the type option is
not specified, it is inherited from chart.type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all wordcloud series are defined in [plotOptions.wordcloud](plotOptions.wordcloud).
3. Options for one single series are given in
[the series instance array](series.wordcloud).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        wordcloud: {
            // shared options for all wordcloud series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'wordcloud'
    }]
});

*/

public class HIWordcloud extends HISeries {

/**
* description: When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/ : False by default •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/ : True* default: false
*/
	public Boolean colorByPoint;

/**
CSS styles for the words.
 <br><br><b>default:</b><br><br>&ensp;{"fontFamily":"sans-serif", "fontWeight": "900"}*/
	public HIStyle style;

/**
A threshold determining the minimum font size that can be applied to a
word.
*/
	public Number minFontSize;

/**
The word with the largest weight will have a font size equal to this
value. The font size of a word is the ratio between its weight and the
largest occuring weight, multiplied with the value of maxFontSize.
*/
	public Number maxFontSize;

/**
Spiral used for placing a word after the inital position experienced a
collision with either another word or the borders.
It is possible for users to add their own custom spiralling algorithms
for use in word cloud. Read more about it in our
[documentation](https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-spiralling-algorithm)
*/
	public String spiral;

/**
* description: The width of the border surrounding each column or bar.

In styled mode, the stroke width can be set with the .highcharts-point
rule.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderwidth/ : 2px black border* default: 1
*/
	public Number borderWidth;

/**
Rotation options for the words in the wordcloud.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/wordcloud-rotation">Word cloud with rotation</a>*/
	public HIRotation rotation;

/**
This option decides which algorithm is used for placement, and rotation
of a word. The choice of algorith is therefore a crucial part of the
resulting layout of the wordcloud.
It is possible for users to add their own custom placement strategies
for use in word cloud. Read more about it in our
[documentation](https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-placement-strategies)
*/
	public String placementStrategy;

/**
The corner radius of the border surrounding each column or bar.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/">Rounded columns</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number borderRadius;

/**
A series specific or series type specific color set to apply instead
of the global colors when [colorByPoint](
#plotOptions.column.colorByPoint) is true.
*/
	public ArrayList<HIColor> colors;

/**
The color of the border surrounding each column or bar.

In styled mode, the border stroke can be set with the .highcharts-point
rule.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/">Dark gray border</a> <br><br><b>default:</b><br><br>&ensp;#ffffff*/
	public HIColor borderColor;

/**
3D columns only. The width of the colored edges.
 <br><br><b>default:</b><br><br>&ensp;1*/
	public Number edgeWidth;


	public HIWordcloud() {
		super(); 
		this.type = "wordcloud";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.minFontSize != null) {
			params.put("minFontSize", this.minFontSize);
		}
		if (this.maxFontSize != null) {
			params.put("maxFontSize", this.maxFontSize);
		}
		if (this.spiral != null) {
			params.put("spiral", this.spiral);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation.getParams());
		}
		if (this.placementStrategy != null) {
			params.put("placementStrategy", this.placementStrategy);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		return params;
	}

}