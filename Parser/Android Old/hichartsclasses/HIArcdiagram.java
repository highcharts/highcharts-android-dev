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
import com.highsoft.highcharts.common.HIColor;

import com.highsoft.highcharts.common.HIColor;


	/**
 An arcdiagram series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all arcdiagram series are defined in  `plotOptions.arcdiagram`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     arcdiagram: {       // shared options for all arcdiagram series     }   },   series: [{     // specific options for this series instance     type: 'arcdiagram'   }] }); `       
	*/

public class HIArcdiagram extends HISeries {
	private Number linkRadius;
	/**
 The radius of the link arc. If not set, series renders a semi-circle between the nodes, except when overflowing the edge of the plot area, in which case an arc touching the edge is rendered. If linkRadius is set, an arc extending to the given value is rendered. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setLinkRadius(Number linkRadius) {
		this.linkRadius = linkRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkRadius(){ return linkRadius; }

	private String offset;
	/**
 The offset of an arc diagram nodes column in relation to the plotArea. The offset equal to 50% places nodes in the center of a chart. By defaults the series is placed so that the biggest node is touching the bottom border of the plotArea. 
 <br><br><b>defaults:</b><br><br>&ensp;'100%'	*/
	public void setOffset(String offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOffset(){ return offset; }

	private Number linkWeight;
	/**
 The global link weight. If not set, width is calculated per link, depending on the weight value. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setLinkWeight(Number linkWeight) {
		this.linkWeight = linkWeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkWeight(){ return linkWeight; }

	private ArrayList <HINodes> nodes;
	/**
 A collection of options for the individual nodes. The nodes in an arc diagram are auto-generated instances of Highcharts.Point, but options can be applied here and linked by the id. 
	*/
	public void setNodes(ArrayList nodes) {
		this.nodes = nodes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getNodes(){ return nodes; }

	private Boolean reversed;
	/**
 Whether the series should be placed on the other side of the plotArea. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private Boolean equalNodes;
	/**
 Whether nodes with different values should have the same size. If set to true, all nodes are calculated based on the nodePadding and current plotArea. It is possible to override it using the marker.radius option. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setEqualNodes(Boolean equalNodes) {
		this.equalNodes = equalNodes;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEqualNodes(){ return equalNodes; }

	private Boolean centeredLinks;
	/**
 The option to center links rather than position them one after another 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setCenteredLinks(Boolean centeredLinks) {
		this.centeredLinks = centeredLinks;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCenteredLinks(){ return centeredLinks; }

	private Boolean colorByPoint;
	/**
/** * description: When using automatic point colors pulled from the global `colors` or series-specific `plotOptions.column.colors` collections, this option determines whether the chart should receive one color per series or one color per point. In styled mode, the colors or series.colors arrays are not supported, and instead this option gives the points individual color class names on the form highcharts-color-{n}. * demo:  •  False by defaults •  True
* defaults: false
*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number minLinkWidth;
	/**
 The minimal width for a line of a sankey. By defaults, 0 values are not shown. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-minlinkwidth">Sankey diagram with minimal link height</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setMinLinkWidth(Number minLinkWidth) {
		this.minLinkWidth = minLinkWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinLinkWidth(){ return minLinkWidth; }

	private Number nodeWidth;
	/**
 The pixel width of each node in a sankey diagram or dependency wheel, or the height in case the chart is inverted. 
	*/
	public void setNodeWidth(Number nodeWidth) {
		this.nodeWidth = nodeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNodeWidth(){ return nodeWidth; }

	private ArrayList <HILevels> levels;
	/**
 Set options on specific levels. Takes precedence over series options, but not node and link options. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>
	*/
	public void setLevels(ArrayList levels) {
		this.levels = levels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLevels(){ return levels; }

	private Number borderWidth;
	/**
/** * description: The width of the border surrounding each column or bar. Defaults to 1 when there is room for a border, but to 0 when the columns are so dense that a border would cover the next column. In styled mode, the stroke width can be set with the .highcharts-point rule. * demo:  •  2px black border
* defaults: undefined
*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Number linkOpacity;
	/**
 Opacity for the links between nodes in the sankey diagram. 
	*/
	public void setLinkOpacity(Number linkOpacity) {
		this.linkOpacity = linkOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkOpacity(){ return linkOpacity; }

	private ArrayList<HIColor> colors;
	/**
 A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true. 
	*/
	public void setColors(ArrayList<HIColor> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIColor> getColors(){ return colors; }

	private HIColor borderColor;
	/**
 The color of the border surrounding each column or bar. In styled mode, the border stroke can be set with the .highcharts-point rule. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/">Dark gray border</a>
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }



	public HIArcdiagram() {
		super(); 
		this.setType("arcdiagram");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.linkRadius != null) {
			params.put("linkRadius", this.linkRadius);
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.linkWeight != null) {
			params.put("linkWeight", this.linkWeight);
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
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.equalNodes != null) {
			params.put("equalNodes", this.equalNodes);
		}
		if (this.centeredLinks != null) {
			params.put("centeredLinks", this.centeredLinks);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.minLinkWidth != null) {
			params.put("minLinkWidth", this.minLinkWidth);
		}
		if (this.nodeWidth != null) {
			params.put("nodeWidth", this.nodeWidth);
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
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add(hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		return params;
	}

}