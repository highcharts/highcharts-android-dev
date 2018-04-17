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
A tilemap series. If the type option is
not specified, it is inherited from chart.type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all tilemap series are defined in [plotOptions.tilemap](plotOptions.tilemap).
3. Options for one single series are given in
[the series instance array](series.tilemap).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        tilemap: {
            // shared options for all tilemap series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'tilemap'
    }]
});

*/

public class HITilemap extends HISeries {

/**
* description: The padding between points in the tilemap.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/tilemap-pointpadding : Point padding on tiles* default: 0
*/
	public Number pointPadding;

/**
* description: The column size - how many X axis units each column in the tilemap
should span. Works as in Heatmaps.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/ : One day* default: 1
*/
	public Number colsize;

/**
* description: The row size - how many Y axis units each tilemap row should span.
Analogous to colsize.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/ : 1 by default* default: 1
*/
	public Number rowsize;

/**
The shape of the tiles in the tilemap. Possible values are hexagon,
circle, diamond, and square.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa">Circular tile shapes</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap">Diamond tile shapes</a>*/
	public String tileShape;

/**
The color applied to null points. In styled mode, a general CSS class is
applied instead.
*/
	public HIColor nullColor;


	public HITilemap() {
		super(); 
		this.type = "tilemap";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.colsize != null) {
			params.put("colsize", this.colsize);
		}
		if (this.rowsize != null) {
			params.put("rowsize", this.rowsize);
		}
		if (this.tileShape != null) {
			params.put("tileShape", this.tileShape);
		}
		if (this.nullColor != null) {
			params.put("nullColor", this.nullColor.getData());
		}
		return params;
	}

}