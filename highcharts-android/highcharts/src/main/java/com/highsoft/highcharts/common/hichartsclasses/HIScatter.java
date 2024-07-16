/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;



	/**
 A `scatter` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `scatter` series are defined in  `plotOptions.scatter`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     scatter: {       // shared options for all scatter series     }   },   series: [{     // specific options for this series instance     type: 'scatter'   }] }); ```       
	*/

public class HIScatter extends HISeries {
	private HIJitter jitter;
	/**
 Apply a jitter effect for the rendered markers. When plotting discrete values, a little random noise may help telling the points apart. The jitter setting applies a random displacement of up to `n` axis units in either direction. So for example on a horizontal X axis, setting the `jitter.x` to 0.24 will render the point in a random position between 0.24 units to the left and 0.24 units to the right of the true axis position. On a category axis, setting it to 0.5 will fill up the bin and make the data appear continuous. When rendered on top of a box plot or a column series, a jitter value of 0.24 will correspond to the underlying series' defaults [groupPadding](https://api.highcharts.com/highcharts/plotOptions.column.groupPadding) and [pointPadding](https://api.highcharts.com/highcharts/plotOptions.column.pointPadding) settings. **Note:** With boost mode enabled, the jitter effect is not supported. 
	*/
	public void setJitter(HIJitter jitter) {
		this.jitter = jitter;
		this.jitter.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIJitter getJitter(){ return jitter; }

	private HICluster cluster;
	/**
 Options for marker clusters, the concept of sampling the data values into larger blocks in order to ease readability and increase performance of the JavaScript charts. Note: marker clusters module is not working with `boost` and `draggable-points` modules. The marker clusters feature requires the marker-clusters.js file to be loaded, found in the modules directory of the download package, or online at `https://code.highcharts.com/modules/marker-clusters.js`. 
	*/
	public void setCluster(HICluster cluster) {
		this.cluster = cluster;
		this.cluster.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICluster getCluster(){ return cluster; }



	public HIScatter() {
		super(); 
		this.setType("scatter");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.jitter != null) {
			params.put("jitter", this.jitter.getParams());
		}
		if (this.cluster != null) {
			params.put("cluster", this.cluster.getParams());
		}
		return params;
	}

}