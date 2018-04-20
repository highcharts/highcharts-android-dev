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
A heatmap series. If the type option is
not specified, it is inherited from chart.type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all heatmap series are defined in [plotOptions.heatmap](plotOptions.heatmap).
3. Options for one single series are given in
[the series instance array](series.heatmap).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        heatmap: {
            // shared options for all heatmap series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'heatmap'
    }]
});

*/

public class HIHeatmap extends HISeries {

/**
Padding between the points in the heatmap.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public Number pointPadding;

/**
The column size - how many X axis units each column in the heatmap
should span.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/">One day</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number colsize;

/**
The row size - how many Y axis units each heatmap row should span.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/">1 by default</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number rowsize;

/**
The color applied to null points. In styled mode, a general CSS class is
applied instead.
*/
	public HIColor nullColor;


	public HIHeatmap() {
		super(); 
		this.type = "heatmap";
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
		if (this.nullColor != null) {
			params.put("nullColor", this.nullColor.getData());
		}
		return params;
	}

}