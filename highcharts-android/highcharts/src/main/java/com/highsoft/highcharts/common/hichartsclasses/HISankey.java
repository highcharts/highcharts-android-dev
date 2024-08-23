/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;

import java.util.ArrayList;
import java.util.HashMap;



	/**
 A `sankey` series. If the `type` option is not specified, it is inherited from `chart.type`. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `sankey` series are defined in  `plotOptions.sankey`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     sankey: {       // shared options for all sankey series     }   },   series: `{     // specific options for this series instance     type: 'sankey'   }] }); ``` **TypeScript:** - the [type` option must always be set. - when accessing an array of series, the combined set of all series types is  represented by `Highcharts.SeriesOptionsType  `. Narrowing down to the  specific type can be done by checking the `type` property. ``` if (chart.options.series?.[0]?.type === sankey) {   // code specific to the sankey series } ```       
	*/

public class HISankey extends HISeries {
	private Boolean colorByPoint;
	/**
/** * description: When using automatic point colors pulled from the global `colors` or series-specific `plotOptions.column.colors` collections, this option determines whether the chart should receive one color per series or one color per point. In styled mode, the `colors` or `series.colors` arrays are not supported, and instead this option gives the points individual color class names on the form `highcharts-color-{n}`. * demo: * [False by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/) * [True](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/) 
* defaults: True
*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number minLinkWidth;
	/**
 The minimal width for a line of a sankey. By defaults, 0 values are not shown. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setMinLinkWidth(Number minLinkWidth) {
		this.minLinkWidth = minLinkWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinLinkWidth(){ return minLinkWidth; }

	private Number curveFactor;
	/**
 Higher numbers makes the links in a sankey diagram or dependency wheelrender more curved. A `curveFactor` of 0 makes the lines straight. 
 <br><br><b>defaults:</b><br><br>&ensp;0.33	*/
	public void setCurveFactor(Number curveFactor) {
		this.curveFactor = curveFactor;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCurveFactor(){ return curveFactor; }

	private Number nodePadding;
	/**
 The padding between nodes in a sankey diagram or dependency wheel, in pixels. For sankey charts, this applies to the nodes of the same column, so vertical distance by defaults, or horizontal distance in an inverted (vertical) sankey. If the number of nodes is so great that it is impossible to lay them out within the plot area with the given `nodePadding`, they will be rendered with a smaller padding as a strategy to avoid overflow. 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setNodePadding(Number nodePadding) {
		this.nodePadding = nodePadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNodePadding(){ return nodePadding; }

	private Object /* Number, String */ nodeDistance;
	/**
 The distance between nodes in a sankey diagram in the longitudinal direction. The longitudinal direction means the direction that the chart flows - in a horizontal chart the distance is horizontal, in an inverted chart (vertical), the distance is vertical. If a number is given, it denotes pixels. If a percentage string is given, the distance is a percentage of the rendered node width. A `nodeDistance` of `100%` will render equal widths for the nodes and the gaps between them. This option applies only when the `nodeWidth` option is `auto`, making the node width respond to the number of columns. 
 <br><br><b>defaults:</b><br><br>&ensp;30	*/
	public void setNodeDistance(Object /* Number, String */ nodeDistance) {
		this.nodeDistance = nodeDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getNodeDistance(){ return nodeDistance; }

	private ArrayList <HILevels> levels;
	/**
 Set options on specific levels. Takes precedence over series options, but not node and link options. 
	*/
	public void setLevels(ArrayList levels) {
		this.levels = levels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLevels(){ return levels; }

	private Number borderWidth;
	/**
/** * description: The width of the border surrounding each column or bar. Defaults to `1` when there is room for a border, but to `0` when the columns are so dense that a border would cover the next column. In styled mode, the stroke width can be set with the `.highcharts-point` rule. * demo: * [2px black border](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderwidth/) 
*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String nodeAlignment;
	/**
 Determines which side of the chart the nodes are to be aligned to. When the chart is inverted, `top` aligns to the left and `bottom` to the right. 
	*/
	public void setNodeAlignment(String nodeAlignment) {
		this.nodeAlignment = nodeAlignment;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNodeAlignment(){ return nodeAlignment; }

	private Object /* Number, String */ nodeWidth;
	/**
 The pixel width of each node in a sankey diagram or dependency wheel, or the height in case the chart is inverted. Can be a number or a percentage string. Sankey series also support setting it to `auto`. With this setting, the nodes are sized to fill up the plot area in the longitudinal direction, regardless of the number of levels. 
 <br><br><b>defaults:</b><br><br>&ensp;20	*/
	public void setNodeWidth(Object /* Number, String */ nodeWidth) {
		this.nodeWidth = nodeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getNodeWidth(){ return nodeWidth; }

	private Number linkOpacity;
	/**
 Opacity for the links between nodes in the sankey diagram. 
 <br><br><b>defaults:</b><br><br>&ensp;0.5	*/
	public void setLinkOpacity(Number linkOpacity) {
		this.linkOpacity = linkOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkOpacity(){ return linkOpacity; }

	private String linkColorMode;
	/**
 Determines color mode for sankey links. Available options: - `from` color of the sankey link will be the same as the 'from node' - `gradient` color of the sankey link will be set to gradient between colors of 'from node' and 'to node' - `to` color of the sankey link will be same as the 'to node'. 
 <br><br><b>defaults:</b><br><br>&ensp;from	*/
	public void setLinkColorMode(String linkColorMode) {
		this.linkColorMode = linkColorMode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkColorMode(){ return linkColorMode; }

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

	private HIColor borderColor;
	/**
 The color of the border surrounding each column or bar. In styled mode, the border stroke can be set with the `.highcharts-point` rule. 
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Boolean centerInCategory;
	/**
 When `true`, the columns will center in the category, ignoring null or missing points. When `false`, space will be reserved for null or missing points. 
	*/
	public void setCenterInCategory(Boolean centerInCategory) {
		this.centerInCategory = centerInCategory;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCenterInCategory(){ return centerInCategory; }

	private ArrayList <HINodes> nodes;
	/**
 A collection of options for the individual nodes. The nodes in a sankey diagram are auto-generated instances of `Highcharts.Point`, but options can be applied here and linked by the `id`. 
	*/
	public void setNodes(ArrayList nodes) {
		this.nodes = nodes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getNodes(){ return nodes; }



	public HISankey() {
		super(); 
		this.setType("sankey");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.minLinkWidth != null) {
			params.put("minLinkWidth", this.minLinkWidth);
		}
		if (this.curveFactor != null) {
			params.put("curveFactor", this.curveFactor);
		}
		if (this.nodePadding != null) {
			params.put("nodePadding", this.nodePadding);
		}
		if (this.nodeDistance != null) {
			params.put("nodeDistance", this.nodeDistance);
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
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.nodeAlignment != null) {
			params.put("nodeAlignment", this.nodeAlignment);
		}
		if (this.nodeWidth != null) {
			params.put("nodeWidth", this.nodeWidth);
		}
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.linkColorMode != null) {
			params.put("linkColorMode", this.linkColorMode);
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
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.centerInCategory != null) {
			params.put("centerInCategory", this.centerInCategory);
		}
		if (this.nodes != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.nodes) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("nodes", array);
		}
		return params;
	}

}