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
 A venn series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all venn series are defined in  `plotOptions.venn`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     venn: {       // shared options for all venn series     }   },   series: [{     // specific options for this series instance     type: 'venn'   }] }); `       
	*/

public class HIVenn extends HISeries {
	private Boolean colorByPoint;
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private String borderDashStyle;
	public void setBorderDashStyle(String borderDashStyle) {
		this.borderDashStyle = borderDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderDashStyle(){ return borderDashStyle; }

	private Number brighten;
	public void setBrighten(Number brighten) {
		this.brighten = brighten;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBrighten(){ return brighten; }

	private HICluster cluster;
	/**
 Options for marker clusters, the concept of sampling the data values into larger blocks in order to ease readability and increase performance of the JavaScript charts. Note: marker clusters module is not working with boost and draggable-points modules. The marker clusters feature requires the marker-clusters.js file to be loaded, found in the modules directory of the download package, or online at `https://code.highcharts.com/modules/marker-clusters.js`. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/europe">Maps marker clusters</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/basic">Scatter marker clusters</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/optimized-kmeans">Marker clusters with colorAxis</a>
	*/
	public void setCluster(HICluster cluster) {
		this.cluster = cluster;
		this.cluster.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICluster getCluster(){ return cluster; }



	public HIVenn() {
		super(); 
		this.setType("venn");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.borderDashStyle != null) {
			params.put("borderDashStyle", this.borderDashStyle);
		}
		if (this.brighten != null) {
			params.put("brighten", this.brighten);
		}
		if (this.cluster != null) {
			params.put("cluster", this.cluster.getParams());
		}
		return params;
	}

}