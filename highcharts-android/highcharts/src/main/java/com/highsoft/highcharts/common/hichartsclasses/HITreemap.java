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



	/**
 A `treemap` series. If the `type` option is not specified, it is inherited from `chart.type`. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `treemap` series are defined in  `plotOptions.treemap`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     treemap: {       // shared options for all treemap series     }   },   series: `{     // specific options for this series instance     type: 'treemap'   }] }); ``` **TypeScript:** - the [type` option must always be set. - when accessing an array of series, the combined set of all series types is  represented by `Highcharts.SeriesOptionsType  `. Narrowing down to the  specific type can be done by checking the `type` property. ``` if (chart.options.series?.[0]?.type === treemap) {   // code specific to the treemap series } ```       
	*/

public class HITreemap extends HISeries {
	private Boolean ignoreHiddenPoint;
	/**
 Whether to ignore hidden points when the layout algorithm runs. If `false`, hidden points will leave open spaces. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreHiddenPoint(){ return ignoreHiddenPoint; }

	private Number borderRadius;
	/**
 The border radius for each treemap item. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Boolean traverseToLeaf;
	/**
 This option enables automatic traversing to the last child level upon node interaction. This feature simplifies navigation by immediately focusing on the deepest layer of the data structure without intermediate steps. 
	*/
	public void setTraverseToLeaf(Boolean traverseToLeaf) {
		this.traverseToLeaf = traverseToLeaf;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTraverseToLeaf(){ return traverseToLeaf; }

	private ArrayList<String> colors;
	/**
 A series specific or series type specific color set to apply instead of the global `colors` when `colorByPoint` is true. 
	*/
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getColors(){ return colors; }

	private Number sortIndex;
	/**
 The sort index of the point inside the treemap level. 
	*/
	public void setSortIndex(Number sortIndex) {
		this.sortIndex = sortIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSortIndex(){ return sortIndex; }

	private Boolean colorByPoint;
	/**
 When using automatic point colors pulled from the `options.colors` collection, this option determines whether the chart should receive one color per series or one color per point. 
	*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private HIBreadcrumbs breadcrumbs;
	/**
 Options for the breadcrumbs, the navigation at the top leading the way up through the traversed levels. 
	*/
	public void setBreadcrumbs(HIBreadcrumbs breadcrumbs) {
		this.breadcrumbs = breadcrumbs;
		this.breadcrumbs.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBreadcrumbs getBreadcrumbs(){ return breadcrumbs; }

	private Boolean allowTraversingTree;
	/**
 When enabled the user can click on a point which is a parent and zoom in on its children. 
	*/
	public void setAllowTraversingTree(Boolean allowTraversingTree) {
		this.allowTraversingTree = allowTraversingTree;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowTraversingTree(){ return allowTraversingTree; }

	public enum LayoutStartingDirection {
		VERTICAL("vertical"),
		HORIZONTAL("horizontal");

		private final String value;

		LayoutStartingDirection(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setLayoutStartingDirection(LayoutStartingDirection layoutStartingDirection) {
		this.layoutStartingDirection = layoutStartingDirection.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String layoutStartingDirection;
	/**
 Defines which direction the layout algorithm will start drawing. 
 <br><br><b>defaults:</b><br><br>&ensp;vertical	*/
	public void setLayoutStartingDirection(String layoutStartingDirection) {
		this.layoutStartingDirection = layoutStartingDirection;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutStartingDirection(){ return layoutStartingDirection; }

	private ArrayList <HILevels> levels;
	/**
 Set options on specific levels. Takes precedence over series options, but not point options. 
	*/
	public void setLevels(ArrayList levels) {
		this.levels = levels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLevels(){ return levels; }

	private Boolean interactByLeaf;
	/**
 This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is undefined, it will be true by defaults. However when allowTraversingTree is true, then it will be false by defaults. 
	*/
	public void setInteractByLeaf(Boolean interactByLeaf) {
		this.interactByLeaf = interactByLeaf;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInteractByLeaf(){ return interactByLeaf; }

	private Boolean alternateStartingDirection;
	/**
 Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal. The next levels starting direction will always be the opposite of the previous. 
	*/
	public void setAlternateStartingDirection(Boolean alternateStartingDirection) {
		this.alternateStartingDirection = alternateStartingDirection;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlternateStartingDirection(){ return alternateStartingDirection; }

	public enum LayoutAlgorithm {
		SLICE_AND_DICE("sliceAndDice"),
		STRIPES("stripes"),
		SQUARIFIED("squarified"),
		STRIP("strip");

		private final String value;

		LayoutAlgorithm(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}

	public void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm.getValue();
		this.setChanged();
		this.notifyObservers();
	}

	private String layoutAlgorithm;
	/**
 This option decides which algorithm is used for setting position and dimensions of the points. 
 <br><br><b>defaults:</b><br><br>&ensp;sliceAndDice	*/
	public void setLayoutAlgorithm(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutAlgorithm(){ return layoutAlgorithm; }

	private Boolean levelIsConstant;
	/**
 Used together with the levels and allowTraversingTree options. When set to false the first level visible to be level one, which is dynamic when traversing the tree. Otherwise the level will be the same as the tree structure. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setLevelIsConstant(Boolean levelIsConstant) {
		this.levelIsConstant = levelIsConstant;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getLevelIsConstant(){ return levelIsConstant; }



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
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.traverseToLeaf != null) {
			params.put("traverseToLeaf", this.traverseToLeaf);
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
		if (this.breadcrumbs != null) {
			params.put("breadcrumbs", this.breadcrumbs.getParams());
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
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm);
		}
		if (this.levelIsConstant != null) {
			params.put("levelIsConstant", this.levelIsConstant);
		}
		return params;
	}

}