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



public class HIParentNodeOptions extends HIFoundation { 

	private Boolean seriesInteraction;
	public void setSeriesInteraction(Boolean seriesInteraction) {
		this.seriesInteraction = seriesInteraction;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSeriesInteraction(){ return seriesInteraction; }

	private Number gravitationalConstant;
	/**
/** * description: Gravitational const used in the barycenter force of the algorithm. * demo: * [Custom forces with Euler integration](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/forces/) 
* defaults: 0.03
*/
	public void setGravitationalConstant(Number gravitationalConstant) {
		this.gravitationalConstant = gravitationalConstant;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGravitationalConstant(){ return gravitationalConstant; }

	private Number maxIterations;
	/**
/** * description: Max number of iterations before algorithm will stop. In general, algorithm should find positions sooner, but when rendering huge number of nodes, it is recommended to increase this value as finding perfect graph positions can require more time. 
* defaults: 400
*/
	public void setMaxIterations(Number maxIterations) {
		this.maxIterations = maxIterations;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxIterations(){ return maxIterations; }

	private Number initialPositionRadius;
	/**
/** * description: When `initialPositions` are set to 'circle', `initialPositionRadius` is a distance from the center of circle, in which nodes are created. 
* defaults: 100
*/
	public void setInitialPositionRadius(Number initialPositionRadius) {
		this.initialPositionRadius = initialPositionRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getInitialPositionRadius(){ return initialPositionRadius; }

	private Number maxSpeed;
	/**
/** * description: Verlet integration only. Max speed that node can get in one iteration. In terms of simulation, it's a maximum translation (in pixels) that node can move (in both, x and y, dimensions). While `friction` is applied on all nodes, max speed is applied only for nodes that move very fast, for example small or disconnected ones. 
* defaults: 50
*/
	public void setMaxSpeed(Number maxSpeed) {
		this.maxSpeed = maxSpeed;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxSpeed(){ return maxSpeed; }

	private HIMarker marker;
	/**
 Styling options for parentNodes markers. Similar to line.marker options. 
	*/
	public void setMarker(HIMarker marker) {
		this.marker = marker;
		this.marker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMarker getMarker(){ return marker; }

	private String initialPositions;
	/**
 Initial layout algorithm for positioning nodes. Can be one of built-in options ("circle", "random") or a function where positions should be set on each node (`this.nodes`) as `node.plotX` and `node.plotY` 
 <br><br><b>defaults:</b><br><br>&ensp;circle	*/
	public void setInitialPositions(String initialPositions) {
		this.initialPositions = initialPositions;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInitialPositions(){ return initialPositions; }

	private Number friction;
	/**
 Friction applied on forces to prevent nodes rushing to fast to the desired positions. 
 <br><br><b>defaults:</b><br><br>&ensp;-0.981	*/
	public void setFriction(Number friction) {
		this.friction = friction;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFriction(){ return friction; }

	private String integration;
	/**
 Integration type. Available options are `'euler'` and `'verlet'`. Integration determines how forces are applied on particles. In Euler integration, force is applied direct as `newPosition += velocity;`. In Verlet integration, new position is based on a previous position without velocity: `newPosition += previousPosition - newPosition`. Note that different integrations give different results as forces are different. In Highcharts v7.0.x only `'euler'` integration was supported. 
 <br><br><b>defaults:</b><br><br>&ensp;euler	*/
	public void setIntegration(String integration) {
		this.integration = integration;
		this.setChanged();
		this.notifyObservers();
	}

	public String getIntegration(){ return integration; }

	private Number linkLength;
	/**
 Ideal length (px) of the link between two nodes. When not defined, length is calculated as: `Math.pow(availableWidth * availableHeight / nodesLength, 0.4);` Note: Because of the algorithm specification, length of each link might be not exactly as specified. 
	*/
	public void setLinkLength(Number linkLength) {
		this.linkLength = linkLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkLength(){ return linkLength; }

	private String type;
	/**
 Type of the algorithm used when positioning nodes. 
 <br><br><b>defaults:</b><br><br>&ensp;reingold-fruchterman	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HIParentNodeOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.seriesInteraction != null) {
			params.put("seriesInteraction", this.seriesInteraction);
		}
		if (this.gravitationalConstant != null) {
			params.put("gravitationalConstant", this.gravitationalConstant);
		}
		if (this.maxIterations != null) {
			params.put("maxIterations", this.maxIterations);
		}
		if (this.initialPositionRadius != null) {
			params.put("initialPositionRadius", this.initialPositionRadius);
		}
		if (this.maxSpeed != null) {
			params.put("maxSpeed", this.maxSpeed);
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.initialPositions != null) {
			params.put("initialPositions", this.initialPositions);
		}
		if (this.friction != null) {
			params.put("friction", this.friction);
		}
		if (this.integration != null) {
			params.put("integration", this.integration);
		}
		if (this.linkLength != null) {
			params.put("linkLength", this.linkLength);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}