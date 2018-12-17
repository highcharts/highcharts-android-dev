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





/**
/** A treemap series. If the type option is not specified, it is inherited from chart.type. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all treemap series are defined in  `plotOptions.treemap`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     treemap: {       // shared options for all treemap series     }   },   series: [{     // specific options for this series instance     type: 'treemap'   }] });  
*/

public class HITreemap extends HISeries {
	private Boolean colorByPoint;
/**
/** When using automatic point colors pulled from the options.colors collection, this option determines whether the chart should receive one color per series or one color per point. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number opacity;
/**
/** The opacity of a point in treemap. When a point has children, the visibility of the children is determined by the opacity. 
*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private Boolean ignoreHiddenPoint;
/**
/** Whether to ignore hidden points when the layout algorithm runs. If false, hidden points will leave open spaces. 
*/
	public void setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreHiddenPoint(){ return ignoreHiddenPoint; }

	private Number sortIndex;
/**
/** The sort index of the point inside the treemap level. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-sortindex/">Sort by years</a>
*/
	public void setSortIndex(Number sortIndex) {
		this.sortIndex = sortIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSortIndex(){ return sortIndex; }

	private String layoutAlgorithm;
/**
/** This option decides which algorithm is used for setting position and dimensions of the points. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-sliceanddice/">SliceAndDice by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-stripes/">Stripes</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-squarified/">Squarified</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-strip/">Strip</a> <br><br><b>accepted values:</b><br><br>&ensp;["sliceAndDice", "stripes", "squarified", "strip"]
*/
	public void setLayoutAlgorithm(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutAlgorithm(){ return layoutAlgorithm; }

	private String layoutStartingDirection;
/**
/** Defines which direction the layout algorithm will start drawing. <br><br><b>accepted values:</b><br><br>&ensp;["vertical", "horizontal"]
*/
	public void setLayoutStartingDirection(String layoutStartingDirection) {
		this.layoutStartingDirection = layoutStartingDirection;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutStartingDirection(){ return layoutStartingDirection; }

	private Boolean levelIsConstant;
/**
/** Used together with the levels and allowDrillToNode options. When set to false the first level visible when drilling is considered to be level one. Otherwise the level will be the same as the tree structure. 
*/
	public void setLevelIsConstant(Boolean levelIsConstant) {
		this.levelIsConstant = levelIsConstant;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getLevelIsConstant(){ return levelIsConstant; }

	private ArrayList<String> colors;
/**
/** A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true. 
*/
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getColors(){ return colors; }

	private ArrayList <HILevels> levels;
/**
/** Set options on specific levels. Takes precedence over series options, but not point options. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/">Styling dataLabels and borders</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-with-levels/">Different layoutAlgorithm</a>
*/
	public void setLevels(ArrayList levels) {
		this.levels = levels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLevels(){ return levels; }

	private HIDrillUpButton drillUpButton;
/**
/** Options for the button appearing when drilling down in a treemap. 
*/
	public void setDrillUpButton(HIDrillUpButton drillUpButton) {
		this.drillUpButton = drillUpButton;
		this.drillUpButton.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDrillUpButton getDrillUpButton(){ return drillUpButton; }

	private Boolean interactByLeaf;
/**
/** This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is undefined, it will be true by defaults. However when allowDrillToNode is true, then it will be false by defaults. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-interactbyleaf-false/">False</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-interactbyleaf-true-and-allowdrilltonode/">InteractByLeaf and allowDrillToNode is true</a>
*/
	public void setInteractByLeaf(Boolean interactByLeaf) {
		this.interactByLeaf = interactByLeaf;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInteractByLeaf(){ return interactByLeaf; }

	private Boolean allowDrillToNode;
/**
/** When enabled the user can click on a point which is a parent and zoom in on its children. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-allowdrilltonode/">Enabled</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setAllowDrillToNode(Boolean allowDrillToNode) {
		this.allowDrillToNode = allowDrillToNode;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowDrillToNode(){ return allowDrillToNode; }

	private Boolean alternateStartingDirection;
/**
/** Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal. The next levels starting direction will always be the opposite of the previous. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-alternatestartingdirection-true/">Enabled</a>
*/
	public void setAlternateStartingDirection(Boolean alternateStartingDirection) {
		this.alternateStartingDirection = alternateStartingDirection;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlternateStartingDirection(){ return alternateStartingDirection; }



	public HITreemap() {
		super(); 
		this.setType("treemap");
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
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		if (this.sortIndex != null) {
			params.put("sortIndex", this.sortIndex);
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm);
		}
		if (this.layoutStartingDirection != null) {
			params.put("layoutStartingDirection", this.layoutStartingDirection);
		}
		if (this.levelIsConstant != null) {
			params.put("levelIsConstant", this.levelIsConstant);
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.colors) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("colors", array);
		}
		if (this.levels != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.levels) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("levels", array);
		}
		if (this.drillUpButton != null) {
			params.put("drillUpButton", this.drillUpButton.getParams());
		}
		if (this.interactByLeaf != null) {
			params.put("interactByLeaf", this.interactByLeaf);
		}
		if (this.allowDrillToNode != null) {
			params.put("allowDrillToNode", this.allowDrillToNode);
		}
		if (this.alternateStartingDirection != null) {
			params.put("alternateStartingDirection", this.alternateStartingDirection);
		}
		return params;
	}

}