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
 A `networkgraph` series. If the `type` option is not specified, it is inherited from `chart.type`. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `networkgraph` series are defined in  `plotOptions.networkgraph`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     networkgraph: {       // shared options for all networkgraph series     }   },   series: `{     // specific options for this series instance     type: 'networkgraph'   }] }); ``` **TypeScript:** - the [type` option must always be set. - when accessing an array of series, the combined set of all series types is  represented by `Highcharts.SeriesOptionsType  `. Narrowing down to the  specific type can be done by checking the `type` property. ``` if (chart.options.series?.[0]?.type === networkgraph) {   // code specific to the networkgraph series } ```       
	*/

public class HINetworkgraph extends HISeries {
	private ArrayList <HINodes> nodes;
	/**
 A collection of options for the individual nodes. The nodes in a networkgraph diagram are auto-generated instances of `Highcharts.Point`, but options can be applied here and linked by the `id`. 
	*/
	public void setNodes(ArrayList nodes) {
		this.nodes = nodes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getNodes(){ return nodes; }

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
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
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
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.nodes != null) {
			ArrayList<Object> array = new ArrayList<>();
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