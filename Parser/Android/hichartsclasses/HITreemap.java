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
 A treemap series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all treemap series are defined in  `plotOptions.treemap`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     treemap: {       // shared options for all treemap series     }   },   series: [{     // specific options for this series instance     type: 'treemap'   }] }); `       
	*/

public class HITreemap extends HISeries {
	private Boolean ignoreHiddenPoint;
	/**
 Whether to ignore hidden points when the layout algorithm runs. If false, hidden points will leave open spaces. 
	*/
	public void setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreHiddenPoint(){ return ignoreHiddenPoint; }

	private ArrayList<String> colors;
	/**
 A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true. 
	*/
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getColors(){ return colors; }

	private Number sortIndex;
	/**
 The sort index of the point inside the treemap level. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-sortindex/">Sort by years</a>
	*/
	public void setSortIndex(Number sortIndex) {
		this.sortIndex = sortIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSortIndex(){ return sortIndex; }

	private Boolean colorByPoint;
	/**
 When using automatic point colors pulled from the options.colors collection, this option determines whether the chart should receive one color per series or one color per point. 
	*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Boolean allowTraversingTree;
	/**
 When enabled the user can click on a point which is a parent and zoom in on its children. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-allowtraversingtree/">Enabled</a>
	*/
	public void setAllowTraversingTree(Boolean allowTraversingTree) {
		this.allowTraversingTree = allowTraversingTree;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowTraversingTree(){ return allowTraversingTree; }

	private String layoutStartingDirection;
	/**
 Defines which direction the layout algorithm will start drawing. <br><br><b>accepted values:</b><br><br>&ensp;["vertical", "horizontal"]
	*/
	public void setLayoutStartingDirection(String layoutStartingDirection) {
		this.layoutStartingDirection = layoutStartingDirection;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutStartingDirection(){ return layoutStartingDirection; }

	private ArrayList <HILevels> levels;
	/**
 Set options on specific levels. Takes precedence over series options, but not point options. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/">Styling dataLabels and borders</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-with-levels/">Different layoutAlgorithm</a>
	*/
	public void setLevels(ArrayList levels) {
		this.levels = levels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLevels(){ return levels; }

	private Boolean interactByLeaf;
	/**
 This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is undefined, it will be true by defaults. However when allowTraversingTree is true, then it will be false by defaults. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-interactbyleaf-false/">False</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-interactbyleaf-true-and-allowtraversingtree/">InteractByLeaf and allowTraversingTree is true</a>
	*/
	public void setInteractByLeaf(Boolean interactByLeaf) {
		this.interactByLeaf = interactByLeaf;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInteractByLeaf(){ return interactByLeaf; }

	private Boolean alternateStartingDirection;
	/**
 Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal. The next levels starting direction will always be the opposite of the previous. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-alternatestartingdirection-true/">Enabled</a>
	*/
	public void setAlternateStartingDirection(Boolean alternateStartingDirection) {
		this.alternateStartingDirection = alternateStartingDirection;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlternateStartingDirection(){ return alternateStartingDirection; }

	private HITraverseUpButton traverseUpButton;
	/**
 Options for the button appearing when traversing down in a treemap. 
	*/
	public void setTraverseUpButton(HITraverseUpButton traverseUpButton) {
		this.traverseUpButton = traverseUpButton;
		this.traverseUpButton.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITraverseUpButton getTraverseUpButton(){ return traverseUpButton; }

	private String layoutAlgorithm;
	/**
 This option decides which algorithm is used for setting position and dimensions of the points. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-sliceanddice/">SliceAndDice by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-stripes/">Stripes</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-squarified/">Squarified</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-strip/">Strip</a> <br><br><b>accepted values:</b><br><br>&ensp;["sliceAndDice", "stripes", "squarified", "strip"]
	*/
	public void setLayoutAlgorithm(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutAlgorithm(){ return layoutAlgorithm; }

	private Boolean levelIsConstant;
	/**
 Used together with the levels and allowTraversingTree options. When set to false the first level visible to be level one, which is dynamic when traversing the tree. Otherwise the level will be the same as the tree structure. 
	*/
	public void setLevelIsConstant(Boolean levelIsConstant) {
		this.levelIsConstant = levelIsConstant;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getLevelIsConstant(){ return levelIsConstant; }

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



	public HITreemap() {
		super(); 
		this.setType("treemap");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.colors) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("colors", array);
		}
		if (this.sortIndex != null) {
			params.put("sortIndex", this.sortIndex);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.allowTraversingTree != null) {
			params.put("allowTraversingTree", this.allowTraversingTree);
		}
		if (this.layoutStartingDirection != null) {
			params.put("layoutStartingDirection", this.layoutStartingDirection);
		}
		if (this.levels != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.levels) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("levels", array);
		}
		if (this.interactByLeaf != null) {
			params.put("interactByLeaf", this.interactByLeaf);
		}
		if (this.alternateStartingDirection != null) {
			params.put("alternateStartingDirection", this.alternateStartingDirection);
		}
		if (this.traverseUpButton != null) {
			params.put("traverseUpButton", this.traverseUpButton.getParams());
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm);
		}
		if (this.levelIsConstant != null) {
			params.put("levelIsConstant", this.levelIsConstant);
		}
		if (this.cluster != null) {
			params.put("cluster", this.cluster.getParams());
		}
		return params;
	}

}