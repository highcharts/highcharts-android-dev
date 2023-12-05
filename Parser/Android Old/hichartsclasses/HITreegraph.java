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

	private HILevels levels;
	/**
/** * description: Set options on specific levels. Takes precedence over series options, but not point options. * demo: * [Treegraph chart with level options applied](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-treegraph/level-options) 
*/
	public void setLevels(HILevels levels) {
		this.levels = levels;
		this.levels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILevels getLevels(){ return levels; }

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
			params.put("levels", this.levels.getParams());
		}
		if (this.collapseButton != null) {
			params.put("collapseButton", this.collapseButton.getParams());
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
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