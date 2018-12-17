/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HILayoutAlgorithm extends Observable implements HIChartsJSONSerializable { 

	private Number linkLength;
/**
/** Ideal length (px) of the link between two nodes. When not defined, length is calculated as: Math.pow(availableWidth * availableHeight / nodesLength, 0.4); Note: Because of the algorithm specification, length of each link might be not exactly as specified. 
*/
	public void setLinkLength(Number linkLength) {
		this.linkLength = linkLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkLength(){ return linkLength; }

	private Number gravitationalConstant;
/**
/** Gravitational const used in the barycenter force of the algorithm. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/">Custom forces</a>
*/
	public void setGravitationalConstant(Number gravitationalConstant) {
		this.gravitationalConstant = gravitationalConstant;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGravitationalConstant(){ return gravitationalConstant; }

	private Number maxIterations;
/**
/** Max number of iterations before algorithm will stop. In general, algorithm should find positions sooner, but when rendering huge number of nodes, it is recommended to increase this value as finding perfect graph positions can require more time. 
*/
	public void setMaxIterations(Number maxIterations) {
		this.maxIterations = maxIterations;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxIterations(){ return maxIterations; }

	private String initialPositions;
/**
/** Initial layout algorithm for positioning nodes. Can be one of built-in options ("circle", "random") or a function where positions should be set on each node (this.nodes) as node.plotX and node.plotY <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/initial-positions/">Initial positions with callback</a> <br><br><b>accepted values:</b><br><br>&ensp;["circle", "random"]
*/
	public void setInitialPositions(String initialPositions) {
		this.initialPositions = initialPositions;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInitialPositions(){ return initialPositions; }

	private Number friction;
/**
/** Friction applied on forces to prevent nodes rushing to fast to the desired positions. 
*/
	public void setFriction(Number friction) {
		this.friction = friction;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFriction(){ return friction; }

	private Boolean enableSimulation;
/**
/** Experimental. Enables live simulation of the algorithm implementation. All nodes are animated as the forces applies on them. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/network-graph/">Live simulation enabled</a>
*/
	public void setEnableSimulation(Boolean enableSimulation) {
		this.enableSimulation = enableSimulation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnableSimulation(){ return enableSimulation; }

	private HIFunction repulsiveForce;
/**
/** Repulsive force applied on a node. Passed are two arguments: - d - which is current distance between two nodes - k - which is desired distance between two nodes <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/">Custom forces</a>
 <br><br><b>defaults:</b><br><br>&ensp;function (d, k) { return k * k / d; }*/
	public void setRepulsiveForce(HIFunction repulsiveForce) {
		this.repulsiveForce = repulsiveForce;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getRepulsiveForce(){ return repulsiveForce; }

	private HIFunction attractiveForce;
/**
/** Attraction force applied on a node which is conected to another node by a link. Passed are two arguments: - d - which is current distance between two nodes - k - which is desired distance between two nodes <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/">Custom forces</a>
 <br><br><b>defaults:</b><br><br>&ensp;function (d, k) { return k * k / d; }*/
	public void setAttractiveForce(HIFunction attractiveForce) {
		this.attractiveForce = attractiveForce;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAttractiveForce(){ return attractiveForce; }

	private String type;
/**
/** Type of the algorithm used when positioning nodes. <br><br><b>accepted values:</b><br><br>&ensp;["reingold-fruchterman"]
*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HILayoutAlgorithm() {

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
		if (this.linkLength != null) {
			params.put("linkLength", this.linkLength);
		}
		if (this.gravitationalConstant != null) {
			params.put("gravitationalConstant", this.gravitationalConstant);
		}
		if (this.maxIterations != null) {
			params.put("maxIterations", this.maxIterations);
		}
		if (this.initialPositions != null) {
			params.put("initialPositions", this.initialPositions);
		}
		if (this.friction != null) {
			params.put("friction", this.friction);
		}
		if (this.enableSimulation != null) {
			params.put("enableSimulation", this.enableSimulation);
		}
		if (this.repulsiveForce != null) {
			params.put("repulsiveForce", this.repulsiveForce);
		}
		if (this.attractiveForce != null) {
			params.put("attractiveForce", this.attractiveForce);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}