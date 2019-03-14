/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



	/**
 A networkgraph series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all networkgraph series are defined in  `plotOptions.networkgraph`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     networkgraph: {       // shared options for all networkgraph series     }   },   series: [{     // specific options for this series instance     type: 'networkgraph'   }] }); `       
	*/

public class HINetworkgraph extends HISeries {
	private List <HINodes> nodes;
	/**
 A collection of options for the individual nodes. The nodes in a networkgraph diagram are auto-generated instances of Highcharts.Point, but options can be applied here and linked by the id. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/data-options/">Networkgraph diagram with node options</a>
	*/
	public void setNodes(List nodes) {
		this.nodes = nodes;
		this.setChanged();
		this.notifyObservers();
	}

	public List getNodes(){ return nodes; }

	private HILayoutAlgorithm layoutAlgorithm;
	public void setLayoutAlgorithm(HILayoutAlgorithm layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		this.layoutAlgorithm.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILayoutAlgorithm getLayoutAlgorithm(){ return layoutAlgorithm; }

	private Boolean draggable;
	/**
 Flag to determine if nodes are draggable or not. 
	*/
	public void setDraggable(Boolean draggable) {
		this.draggable = draggable;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggable(){ return draggable; }

	private HILink link;
	/**
 Link style options 
	*/
	public void setLink(HILink link) {
		this.link = link;
		this.link.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILink getLink(){ return link; }



	public HINetworkgraph() {
		super(); 
		this.setType("networkgraph");
	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = super.getParams();
		if (this.nodes != null) {
			List<Object> array = new List<>();
			for (Object obj : this.nodes) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("nodes", array);
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm.getParams());
		}
		if (this.draggable != null) {
			params.put("draggable", this.draggable);
		}
		if (this.link != null) {
			params.put("link", this.link.getParams());
		}
		return params;
	}

}