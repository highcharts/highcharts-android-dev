/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import java.util.ArrayList;
import java.util.HashMap;



public class HICluster extends HIFoundation { 

	private Boolean allowOverlap;
	/**
 When set to `false` prevent cluster overlapping - this option works only when `layoutAlgorithm.type = "grid"`. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private HIStates states;
	public void setStates(HIStates states) {
		this.states = states;
		this.states.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStates getStates(){ return states; }

	private ArrayList <HIZones> zones;
	/**
 An array defining zones within marker clusters. In styled mode, the color zones are styled with the `.highcharts-cluster-zone-{n}` class, or custom classed from the `className` option. 
	*/
	public void setZones(ArrayList zones) {
		this.zones = zones;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getZones(){ return zones; }

	private Boolean enabled;
	/**
 Whether to enable the marker-clusters module. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HILayoutAlgorithm layoutAlgorithm;
	/**
 Options for layout algorithm. Inside there are options to change the type of the algorithm, gridSize, distance or iterations. 
	*/
	public void setLayoutAlgorithm(HILayoutAlgorithm layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		this.layoutAlgorithm.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILayoutAlgorithm getLayoutAlgorithm(){ return layoutAlgorithm; }

	private HIDataLabels dataLabels;
	/**
 Options for the cluster data labels. 
	*/
	public void setDataLabels(HIDataLabels dataLabels) {
		this.dataLabels = dataLabels;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataLabels getDataLabels(){ return dataLabels; }

	private Boolean drillToCluster;
	/**
 Zoom the plot area to the cluster points range when a cluster is clicked. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setDrillToCluster(Boolean drillToCluster) {
		this.drillToCluster = drillToCluster;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDrillToCluster(){ return drillToCluster; }

	private HIAnimationOptionsObject animation;
	/**
 Options for the cluster marker animation. 
 <br><br><b>defaults:</b><br><br>&ensp;{ "duration": 500 }	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private HIMarker marker;
	/**
 Options for the cluster marker. 
	*/
	public void setMarker(HIMarker marker) {
		this.marker = marker;
		this.setChanged();
		this.notifyObservers();
	}

	public HIMarker getMarker(){ return marker; }

	private Number minimumClusterSize;
	/**
 The minimum amount of points to be combined into a cluster. This value has to be greater or equal to 2. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setMinimumClusterSize(Number minimumClusterSize) {
		this.minimumClusterSize = minimumClusterSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinimumClusterSize(){ return minimumClusterSize; }

	private HIEvents events;
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }



	public HICluster() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.states != null) {
			params.put("states", this.states.getParams());
		}
		if (this.zones != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.zones) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("zones", array);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm.getParams());
		}
		if (this.dataLabels != null) {
			params.put("dataLabels", this.dataLabels.getParams());
		}
		if (this.drillToCluster != null) {
			params.put("drillToCluster", this.drillToCluster);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.minimumClusterSize != null) {
			params.put("minimumClusterSize", this.minimumClusterSize);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		return params;
	}

}