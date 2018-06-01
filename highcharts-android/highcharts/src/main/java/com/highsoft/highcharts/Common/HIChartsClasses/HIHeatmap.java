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
import java.util.Observable;
import java.util.Observer;
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
	private Number pointPadding;
/**
Padding between the points in the heatmap.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number colsize;
/**
The column size - how many X axis units each column in the heatmap
should span.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/">One day</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public void setColsize(Number colsize) {
		this.colsize = colsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColsize(){ return colsize; }

	private Number rowsize;
/**
The row size - how many Y axis units each heatmap row should span.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/">1 by default</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public void setRowsize(Number rowsize) {
		this.rowsize = rowsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRowsize(){ return rowsize; }

	private HIColor nullColor;
/**
The color applied to null points. In styled mode, a general CSS class is
applied instead.
*/
	public void setNullColor(HIColor nullColor) {
		this.nullColor = nullColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNullColor(){ return nullColor; }



	public HIHeatmap() {
		super(); 
		this.setType("heatmap");
	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


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