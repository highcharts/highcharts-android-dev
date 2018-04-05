/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



/**
A treemap series. If the type option is
not specified, it is inherited from chart.type.

For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to [plotOptions.
treemap](#plotOptions.treemap).
*/

public class HITreemap extends HISeries {

/**
When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean colorByPoint;

/**
The color of the border surrounding each tree map item.
 <br><br><b>default:</b><br><br>&ensp;#e6e6e6*/
	public HIColor borderColor;

/**
The opacity of a point in treemap. When a point has children, the
visibility of the children is determined by the opacity.
 <br><br><b>default:</b><br><br>&ensp;0.15*/
	public Number opacity;

/**
Whether to ignore hidden points when the layout algorithm runs.
If false, hidden points will leave open spaces.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean ignoreHiddenPoint;

/**
When enabled the user can click on a point which is a parent and
zoom in on its children.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-allowdrilltonode/">Enabled</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean allowDrillToNode;

/**
The sort index of the point inside the treemap level.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-sortindex/">Sort by years</a>*/
	public Number sortIndex;

/**
This option decides if the user can interact with the parent nodes
or just the leaf nodes. When this option is undefined, it will be
true by default. However when allowDrillToNode is true, then it will
be false by default.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-interactbyleaf-false/">False</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-interactbyleaf-true-and-allowdrilltonode/">InteractByLeaf and allowDrillToNode is true</a>*/
	public Boolean interactByLeaf;

/**
A series specific or series type specific color set to apply instead
of the global colors when [colorByPoint](#plotOptions.
treemap.colorByPoint) is true.
*/
	public ArrayList<HIColor> colors;

/**
This option decides which algorithm is used for setting position
and dimensions of the points. Can be one of sliceAndDice, stripes,
 squarified or strip.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-sliceanddice/">SliceAndDice by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-stripes/">Stripes</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-squarified/">Squarified</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-layoutalgorithm-strip/">Strip</a> <br><br><b>accepted values:</b><br><br>&ensp;["sliceAndDice", "stripes", "squarified", "strip"] <br><br><b>default:</b><br><br>&ensp;sliceAndDice*/
	public String layoutAlgorithm;

/**
Used together with the levels and allowDrillToNode options. When
set to false the first level visible when drilling is considered
to be level one. Otherwise the level will be the same as the tree
structure.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean levelIsConstant;

/**
Defines which direction the layout algorithm will start drawing.
 Possible values are "vertical" and "horizontal".
 <br><br><b>accepted values:</b><br><br>&ensp;["vertical", "horizontal"] <br><br><b>default:</b><br><br>&ensp;vertical*/
	public String layoutStartingDirection;

/**
Set options on specific levels. Takes precedence over series options,
but not point options.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/">Styling dataLabels and borders</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-with-levels/">Different layoutAlgorithm</a>*/
	public ArrayList <HILevels> levels;

/**
Options for the button appearing when drilling down in a treemap.
*/
	public HIDrillUpButton drillUpButton;

/**
Enabling this option will make the treemap alternate the drawing
direction between vertical and horizontal. The next levels starting
direction will always be the opposite of the previous.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-alternatestartingdirection-true/">Enabled</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean alternateStartingDirection;


	public HITreemap() {
		super(); 
		this.type = "treemap";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		if (this.allowDrillToNode != null) {
			params.put("allowDrillToNode", this.allowDrillToNode);
		}
		if (this.sortIndex != null) {
			params.put("sortIndex", this.sortIndex);
		}
		if (this.interactByLeaf != null) {
			params.put("interactByLeaf", this.interactByLeaf);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm);
		}
		if (this.levelIsConstant != null) {
			params.put("levelIsConstant", this.levelIsConstant);
		}
		if (this.layoutStartingDirection != null) {
			params.put("layoutStartingDirection", this.layoutStartingDirection);
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
		if (this.alternateStartingDirection != null) {
			params.put("alternateStartingDirection", this.alternateStartingDirection);
		}
		return params;
	}

}