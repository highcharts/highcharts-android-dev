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
* description: A tilemap series. If the type option is
not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
tilemap.
*/

public class HITilemap extends HISeries {

/**
* description: The column size - how many X axis units each column in the tilemap
should span. Works as in Heatmaps.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/ : One day
* default: 1
*/
	public Number colsize;

/**
* description: The padding between points in the tilemap.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/tilemap-pointpadding : Point padding on tiles
* default: 2
*/
	public Number pointPadding;

/**
* description: The row size - how many Y axis units each tilemap row should span.
Analogous to colsize.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/ : 1 by default
* default: 1
*/
	public Number rowsize;

/**
* description: The color applied to null points. In styled mode, a general CSS class is
applied instead.
* default: #f7f7f7
*/
	public HIColor nullColor;

/**
* description: The shape of the tiles in the tilemap. Possible values are hexagon,
circle, diamond, and square.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa : Circular tile shapes
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap : Diamond tile shapes
* default: hexagon
*/
	public String tileShape;


	public HITilemap() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colsize != null) {
			params.put("colsize", this.colsize);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.rowsize != null) {
			params.put("rowsize", this.rowsize);
		}
		if (this.nullColor != null) {
			params.put("nullColor", this.nullColor.getData());
		}
		if (this.tileShape != null) {
			params.put("tileShape", this.tileShape);
		}
		return params;
	}

}