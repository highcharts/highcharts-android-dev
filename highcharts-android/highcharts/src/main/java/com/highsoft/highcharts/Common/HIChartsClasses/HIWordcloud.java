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
* description: A wordcloud series. If the type option is
not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
wordcloud.
*/

public class HIWordcloud extends HISeries {

/**
* description: The color of the border surrounding each column or bar.
In styled mode, the border stroke can be set with the .highcharts-point
rule.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/ : Dark gray border
* default: #ffffff
*/
	public HIColor borderColor;

/**
* description: When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/ : False by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/ : True
* default: True
*/
	public Boolean colorByPoint;

/**
* description: CSS styles for the words.
* default: {"fontFamily":"Impact, sans-serif"}
*/
	public HIStyle style;

/**
* description: This option decides which algorithm is used for placement, and rotation
of a word. The choice of algorith is therefore a crucial part of the
resulting layout of the wordcloud.
It is possible for users to add their own custom placement strategies
for use in word cloud. Read more about it in our
https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-placement-strategies : documentation
* default: random
*/
	public String placementStrategy;

/**
* description: Rotation options for the words in the wordcloud.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/wordcloud-rotation : Word cloud with rotation
*/
	public HIRotation rotation;

/**
* description: A series specific or series type specific color set to apply instead
of the global colors when colorByPoint is true.
*/
	public ArrayList<HIColor> colors;

/**
* description: The corner radius of the border surrounding each column or bar.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/ : Rounded columns
* default: 0
*/
	public Number borderRadius;

/**
* description: 3D columns only. The width of the colored edges.
* default: 1
*/
	public Number edgeWidth;

/**
* description: Spiral used for placing a word after the inital position experienced a
collision with either another word or the borders.
It is possible for users to add their own custom spiralling algorithms
for use in word cloud. Read more about it in our
https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-spiralling-algorithm : documentation
* default: archimedean
*/
	public String spiral;


	public HIWordcloud() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.placementStrategy != null) {
			params.put("placementStrategy", this.placementStrategy);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation.getParams());
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		if (this.spiral != null) {
			params.put("spiral", this.spiral);
		}
		return params;
	}

}