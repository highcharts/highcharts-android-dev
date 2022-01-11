/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



	/**
 A scatter3d series. If the type option is not specified, it is inherited from chart.type. scatter3d](#plotOptions.scatter3d). In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all scatter3d series are defined in  `plotOptions.scatter3d`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     scatter3d: {       // shared options for all scatter3d series     }   },   series: [{     // specific options for this series instance     type: 'scatter3d'   }] }); `       
	*/

public class HIScatter3d extends HISeries {
	private HIJitter jitter;
	/**
 Apply a jitter effect for the rendered markers. When plotting discrete values, a little random noise may help telling the points apart. The jitter setting applies a random displacement of up to n axis units in either direction. So for example on a horizontal X axis, setting the jitter.x to 0.24 will render the point in a random position between 0.24 units to the left and 0.24 units to the right of the true axis position. On a category axis, setting it to 0.5 will fill up the bin and make the data appear continuous. When rendered on top of a box plot or a column series, a jitter value of 0.24 will correspond to the underlying series' defaults [groupPadding](https://api.highcharts.com/highcharts/plotOptions.column.groupPadding) and [pointPadding](https://api.highcharts.com/highcharts/plotOptions.column.pointPadding) settings. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-scatter/jitter">Jitter on a scatter plot</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-scatter/jitter-boxplot">Jittered scatter plot on top of a box plot</a>
	*/
	public void setJitter(HIJitter jitter) {
		this.jitter = jitter;
		this.jitter.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIJitter getJitter(){ return jitter; }



	public HIScatter3d() {
		super(); 
		this.setType("scatter3d");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.jitter != null) {
			params.put("jitter", this.jitter.getParams());
		}
		return params;
	}

}