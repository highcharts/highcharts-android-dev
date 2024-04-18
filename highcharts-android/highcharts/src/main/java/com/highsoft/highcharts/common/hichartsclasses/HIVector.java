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
 A `vector` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `vector` series are defined in  `plotOptions.vector`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     vector: {       // shared options for all vector series     }   },   series: [{     // specific options for this series instance     type: 'vector'   }] }); ```       
	*/

public class HIVector extends HISeries {
	private Number vectorLength;
	/**
 Maximum length of the arrows in the vector plot. The individual arrow length is computed between 0 and this value. 
 <br><br><b>defaults:</b><br><br>&ensp;20	*/
	public void setVectorLength(Number vectorLength) {
		this.vectorLength = vectorLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getVectorLength(){ return vectorLength; }

	private String rotationOrigin;
	/**
 What part of the vector it should be rotated around. Can be one of `start`, `center` and `end`. When `start`, the vectors will start from the given [x, y] position, and when `end` the vectors will end in the [x, y] position. 
 <br><br><b>defaults:</b><br><br>&ensp;center	*/
	public void setRotationOrigin(String rotationOrigin) {
		this.rotationOrigin = rotationOrigin;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRotationOrigin(){ return rotationOrigin; }

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



	public HIVector() {
		super(); 
		this.setType("vector");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.vectorLength != null) {
			params.put("vectorLength", this.vectorLength);
		}
		if (this.rotationOrigin != null) {
			params.put("rotationOrigin", this.rotationOrigin);
		}
		if (this.cluster != null) {
			params.put("cluster", this.cluster.getParams());
		}
		return params;
	}

}