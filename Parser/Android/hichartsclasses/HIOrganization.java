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



	/**
 An organization series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all organization series are defined in  `plotOptions.organization`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     organization: {       // shared options for all organization series     }   },   series: [{     // specific options for this series instance     type: 'organization'   }] }); `       
	*/

public class HIOrganization extends HISeries {
	private ArrayList <HINodes> nodes;
	/**
 A collection of options for the individual nodes. The nodes in an org chart are auto-generated instances of Highcharts.Point, but options can be applied here and linked by the id. 
	*/
	public void setNodes(ArrayList nodes) {
		this.nodes = nodes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getNodes(){ return nodes; }

	private HIColor borderColor;
	/**
/** * description: The border color of the node cards. * demo:  •  Dark gray border
* defaults: #ffffff
*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Number nodeWidth;
	/**
/** * description: In a horizontal chart, the width of the nodes in pixels. Node that most organization charts are vertical, so the name of this option is counterintuitive. 
*/
	public void setNodeWidth(Number nodeWidth) {
		this.nodeWidth = nodeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNodeWidth(){ return nodeWidth; }

	private Number borderRadius;
	/**
 The border radius of the node cards. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Number linkRadius;
	/**
 Radius for the rounded corners of the links between nodes. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-organization/link-options">Square links</a>
	*/
	public void setLinkRadius(Number linkRadius) {
		this.linkRadius = linkRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkRadius(){ return linkRadius; }

	private HIColor linkColor;
	/**
 The color of the links between nodes. 
	*/
	public void setLinkColor(HIColor linkColor) {
		this.linkColor = linkColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLinkColor(){ return linkColor; }

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

	private Number linkLineWidth;
	/**
 The line width of the links connecting nodes, in pixels. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-organization/link-options">Square links</a>
	*/
	public void setLinkLineWidth(Number linkLineWidth) {
		this.linkLineWidth = linkLineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLinkLineWidth(){ return linkLineWidth; }

	private Number hangingIndent;
	/**
 The indentation in pixels of hanging nodes, nodes which parent has layout set to hanging. 
	*/
	public void setHangingIndent(Number hangingIndent) {
		this.hangingIndent = hangingIndent;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHangingIndent(){ return hangingIndent; }

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

	private Number nodePadding;
	/**
 The padding between nodes in a sankey diagram or dependency wheel, in pixels. 
	*/
	public void setNodePadding(Number nodePadding) {
		this.nodePadding = nodePadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNodePadding(){ return nodePadding; }

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



	public HIOrganization() {
		super(); 
		this.setType("organization");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
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
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.nodeWidth != null) {
			params.put("nodeWidth", this.nodeWidth);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.linkRadius != null) {
			params.put("linkRadius", this.linkRadius);
		}
		if (this.linkColor != null) {
			params.put("linkColor", this.linkColor.getData());
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.linkLineWidth != null) {
			params.put("linkLineWidth", this.linkLineWidth);
		}
		if (this.hangingIndent != null) {
			params.put("hangingIndent", this.hangingIndent);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.minLinkWidth != null) {
			params.put("minLinkWidth", this.minLinkWidth);
		}
		if (this.nodePadding != null) {
			params.put("nodePadding", this.nodePadding);
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
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
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
		return params;
	}

}