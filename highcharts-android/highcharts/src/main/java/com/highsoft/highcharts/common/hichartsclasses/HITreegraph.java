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
 A `treegraph` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `treegraph` series are defined in  `plotOptions.treegraph`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     treegraph: {       // shared options for all treegraph series     }   },   series: [{     // specific options for this series instance     type: 'treegraph'   }] }); ```       
	*/

public class HITreegraph extends HISeries {
	private HILink link;
	public void setLink(HILink link) {
		this.link = link;
		this.link.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILink getLink(){ return link; }

	private ArrayList <HILevels> levels;
	/**
/** * description: Set options on specific levels. Takes precedence over series options, but not point options. * demo: * [Treegraph chart with level options applied](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-treegraph/level-options) 
*/
	public void setLevels(ArrayList levels) {
		this.levels = levels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLevels(){ return levels; }

	private HICollapseButton collapseButton;
	/**
 Options applied to collapse Button. The collape button is the small button which indicates, that the node is collapsable. 
	*/
	public void setCollapseButton(HICollapseButton collapseButton) {
		this.collapseButton = collapseButton;
		this.collapseButton.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICollapseButton getCollapseButton(){ return collapseButton; }

	private Object /* Number, String */ nodeWidth;
	/**
 The pixel width of each node in a, or the height in case the chart is inverted. For tree graphs, the node width is only applied if the marker symbol is `rect`, otherwise the `marker` sizing options apply. Can be a number or a percentage string, or `auto`. If `auto`, the nodes are sized to fill up the plot area in the longitudinal direction, regardless of the number of levels. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setNodeWidth(Object /* Number, String */ nodeWidth) {
		this.nodeWidth = nodeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getNodeWidth(){ return nodeWidth; }

	private Boolean reversed;
	/**
 Flips the positions of the nodes of a treegraph along the horizontal axis (vertical if chart is inverted). 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private Object /* Number, String */ nodeDistance;
	/**
 The distance between nodes in a tree graph in the longitudinal direction. The longitudinal direction means the direction that the chart flows - in a horizontal chart the distance is horizontal, in an inverted chart (vertical), the distance is vertical. If a number is given, it denotes pixels. If a percentage string is given, the distance is a percentage of the rendered node width. A `nodeDistance` of `100%` will render equal widths for the nodes and the gaps between them. This option applies only when the `nodeWidth` option is `auto`, making the node width respond to the number of columns. 
 <br><br><b>defaults:</b><br><br>&ensp;30	*/
	public void setNodeDistance(Object /* Number, String */ nodeDistance) {
		this.nodeDistance = nodeDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getNodeDistance(){ return nodeDistance; }

	private Boolean fillSpace;
	/**
 Whether the treegraph series should fill the entire plot area in the X axis direction, even when there are collapsed points. 
	*/
	public void setFillSpace(Boolean fillSpace) {
		this.fillSpace = fillSpace;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFillSpace(){ return fillSpace; }

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



	public HITreegraph() {
		super(); 
		this.setType("treegraph");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.link != null) {
			params.put("link", this.link.getParams());
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
		if (this.collapseButton != null) {
			params.put("collapseButton", this.collapseButton.getParams());
		}
		if (this.nodeWidth != null) {
			params.put("nodeWidth", this.nodeWidth);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.nodeDistance != null) {
			params.put("nodeDistance", this.nodeDistance);
		}
		if (this.fillSpace != null) {
			params.put("fillSpace", this.fillSpace);
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
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		return params;
	}

}