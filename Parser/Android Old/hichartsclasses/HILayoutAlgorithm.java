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



public class HILayoutAlgorithm extends HIFoundation { 

	private Object /* Number, String */ distance;
	/**
 When type is set to kmeans, distance is a maximum distance between point and cluster center so that this point will be inside the cluster. The distance is either a number defining pixels or a percentage defining a percentage of the plot area width. 
	*/
	public void setDistance(Object /* Number, String */ distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getDistance(){ return distance; }

	private Object /* Number, String */ gridSize;
	/**
 When type is set to the grid, gridSize is a size of a grid square element either as a number defining pixels, or a percentage defining a percentage of the plot area width. 
	*/
	public void setGridSize(Object /* Number, String */ gridSize) {
		this.gridSize = gridSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getGridSize(){ return gridSize; }

	private Number kmeansThreshold;
	/**
 When type is set to undefined and there are more visible points than the kmeansThreshold the grid algorithm is used to find clusters, otherwise kmeans. It ensures good performance on large datasets and better clusters arrangement after the zoom. 
	*/
	public void setKmeansThreshold(Number kmeansThreshold) {
		this.kmeansThreshold = kmeansThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getKmeansThreshold(){ return kmeansThreshold; }

	private Number iterations;
	/**
 When type is set to kmeans, iterations are the number of iterations that this algorithm will be repeated to find clusters positions. 
	*/
	public void setIterations(Number iterations) {
		this.iterations = iterations;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getIterations(){ return iterations; }

	private String type;
	/**
 Type of the algorithm used to combine points into a cluster. There are three available algorithms: 1) grid - grid-based clustering technique. Points are assigned to squares of set size depending on their position on the plot area. Points inside the grid square are combined into a cluster. The grid size can be controlled by gridSize property (grid size changes at certain zoom levels). 2) kmeans - based on K-Means clustering technique. In the first step, points are divided using the grid method (distance property is a grid size) to find the initial amount of clusters. Next, each point is classified by computing the distance between each cluster center and that point. When the closest cluster distance is lower than distance property set by a user the point is added to this cluster otherwise is classified as noise. The algorithm is repeated until each cluster center not change its previous position more than one pixel. This technique is more accurate but also more time consuming than the grid algorithm, especially for big datasets. 3) optimizedKmeans - based on K-Means clustering technique. This algorithm uses k-means algorithm only on the chart initialization or when chart extremes have greater range than on initialization. When a chart is redrawn the algorithm checks only clustered points distance from the cluster center and rebuild it when the point is spaced enough to be outside the cluster. It provides performance improvement and more stable clusters position yet can be used rather on small and sparse datasets. By defaults, the algorithm depends on visible quantity of points and kmeansThreshold. When there are more visible points than the kmeansThreshold the grid algorithm is used, otherwise kmeans. The custom clustering algorithm can be added by assigning a callback function as the type property. This function takes an array of processedXData, processedYData, processedXData indexes and layoutAlgorithm options as arguments and should return an object with grouped data. The algorithm should return an object like that: { clusterId1: [{   x: 573,   y: 285,   index: 1 // point index in the data array }, {   x: 521,   y: 197,   index: 2 }], clusterId2: [{   ... }] ... } clusterId (exampleabove-uniqueidofaclusterornoise) is an array of points belonging to a cluster. If the array has only one point or fewer points than set in cluster.minimumClusterSize it won't be combined into a cluster. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/optimized-kmeans">Optimized K-Means algorithm</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/kmeans">K-Means algorithm</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/marker-clusters/grid">Grid algorithm</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/marker-clusters/custom-alg">Custom algorithm</a>
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Boolean seriesInteraction;
	/**
 Whether series should interact with each other or not. When parentNodeLimit is set to true, thi option should be set to false to avoid sticking points in wrong series parentNode. 
	*/
	public void setSeriesInteraction(Boolean seriesInteraction) {
		this.seriesInteraction = seriesInteraction;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSeriesInteraction(){ return seriesInteraction; }

	private Number gravitationalConstant;
	/**
/** * description: Gravitational const used in the barycenter force of the algorithm. * demo:  •  Custom forces with Euler integration
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
*/
	public void setMaxIterations(Number maxIterations) {
		this.maxIterations = maxIterations;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxIterations(){ return maxIterations; }

	private String initialPositions;
	/**
/** * description: Initial layout algorithm for positioning nodes. Can be one of the built-in options ("circle", "random") or a function where positions should be set on each node (this.nodes) as node.plotX and node.plotY. * demo:  •  Initial positions with callback
*/
	public void setInitialPositions(String initialPositions) {
		this.initialPositions = initialPositions;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInitialPositions(){ return initialPositions; }

	private HIParentNodeOptions parentNodeOptions;
	/**
 Layout algorithm options for parent nodes. 
	*/
	public void setParentNodeOptions(HIParentNodeOptions parentNodeOptions) {
		this.parentNodeOptions = parentNodeOptions;
		this.parentNodeOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIParentNodeOptions getParentNodeOptions(){ return parentNodeOptions; }

	private Number initialPositionRadius;
	/**
/** * description: When initialPositions are set to 'circle', initialPositionRadius is a distance from the center of circle, in which nodes are created. * demo:  •  Initial radius set to 200
* defaults: 1
*/
	public void setInitialPositionRadius(Number initialPositionRadius) {
		this.initialPositionRadius = initialPositionRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getInitialPositionRadius(){ return initialPositionRadius; }

	private Number friction;
	/**
/** * description: Friction applied on forces to prevent nodes rushing to fast to the desired positions. 
*/
	public void setFriction(Number friction) {
		this.friction = friction;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFriction(){ return friction; }

	private Boolean dragBetweenSeries;
	/**
 In case of split series, this option allows user to drag and drop points between series, for changing point related series. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-packedbubble/packed-dashboard/">Example of drag'n drop bubbles for bubble kanban</a>
	*/
	public void setDragBetweenSeries(Boolean dragBetweenSeries) {
		this.dragBetweenSeries = dragBetweenSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDragBetweenSeries(){ return dragBetweenSeries; }

	private Number maxSpeed;
	/**
/** * description: Max speed that node can get in one iteration. In terms of simulation, it's a maximum translation (in pixels) that a node can move (in both, x and y, dimensions). While friction is applied on all nodes, max speed is applied only for nodes that move very fast, for example small or disconnected ones. 
*/
	public void setMaxSpeed(Number maxSpeed) {
		this.maxSpeed = maxSpeed;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxSpeed(){ return maxSpeed; }

	private Boolean enableSimulation;
	/**
/** * description: Experimental. Enables live simulation of the algorithm implementation. All nodes are animated as the forces applies on them. * demo:  •  Live simulation enabled
*/
	public void setEnableSimulation(Boolean enableSimulation) {
		this.enableSimulation = enableSimulation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnableSimulation(){ return enableSimulation; }

	private Number bubblePadding;
	/**
 The distance between two bubbles, when the algorithm starts to treat two bubbles as overlapping. The bubblePadding is also the expected distance between all the bubbles on simulation end. 
	*/
	public void setBubblePadding(Number bubblePadding) {
		this.bubblePadding = bubblePadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBubblePadding(){ return bubblePadding; }

	private String splitSeries;
	/**
 Whether to split series into individual groups or to mix all series together. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setSplitSeries(String splitSeries) {
		this.splitSeries = splitSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSplitSeries(){ return splitSeries; }

	private Boolean parentNodeLimit;
	/**
 Whether bubbles should interact with their parentNode to keep them inside. 
	*/
	public void setParentNodeLimit(Boolean parentNodeLimit) {
		this.parentNodeLimit = parentNodeLimit;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getParentNodeLimit(){ return parentNodeLimit; }

	private String integration;
	/**
 Integration type. Available options are 'euler' and 'verlet'. Integration determines how forces are applied on particles. In Euler integration, force is applied direct as newPosition += velocity;. In Verlet integration, new position is based on a previous posittion without velocity: newPosition += previousPosition - newPosition. Note that different integrations give different results as forces are different. In Highcharts v7.0.x only 'euler' integration was supported. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/integration-comparison/">Comparison of Verlet and Euler integrations</a> <br><br><b>accepted values:</b><br><br>&ensp;["euler", "verlet"]
	*/
	public void setIntegration(String integration) {
		this.integration = integration;
		this.setChanged();
		this.notifyObservers();
	}

	public String getIntegration(){ return integration; }

	private Number linkLength;
	/**
 Ideal length (px) of the link between two nodes. When not defined, length is calculated as: Math.pow(availableWidth * availableHeight / nodesLength, 0.4); Note: Because of the algorithm specification, length of each link might be not exactly as specified. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/styled-links/">Numerical values</a>
	*/
	public void setLinkLength(Number linkLength) {
		this.linkLength = linkLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkLength(){ return linkLength; }



	public HILayoutAlgorithm() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.gridSize != null) {
			params.put("gridSize", this.gridSize);
		}
		if (this.kmeansThreshold != null) {
			params.put("kmeansThreshold", this.kmeansThreshold);
		}
		if (this.iterations != null) {
			params.put("iterations", this.iterations);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.seriesInteraction != null) {
			params.put("seriesInteraction", this.seriesInteraction);
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
		if (this.parentNodeOptions != null) {
			params.put("parentNodeOptions", this.parentNodeOptions.getParams());
		}
		if (this.initialPositionRadius != null) {
			params.put("initialPositionRadius", this.initialPositionRadius);
		}
		if (this.friction != null) {
			params.put("friction", this.friction);
		}
		if (this.dragBetweenSeries != null) {
			params.put("dragBetweenSeries", this.dragBetweenSeries);
		}
		if (this.maxSpeed != null) {
			params.put("maxSpeed", this.maxSpeed);
		}
		if (this.enableSimulation != null) {
			params.put("enableSimulation", this.enableSimulation);
		}
		if (this.bubblePadding != null) {
			params.put("bubblePadding", this.bubblePadding);
		}
		if (this.splitSeries != null) {
			params.put("splitSeries", this.splitSeries);
		}
		if (this.parentNodeLimit != null) {
			params.put("parentNodeLimit", this.parentNodeLimit);
		}
		if (this.integration != null) {
			params.put("integration", this.integration);
		}
		if (this.linkLength != null) {
			params.put("linkLength", this.linkLength);
		}
		return params;
	}

}