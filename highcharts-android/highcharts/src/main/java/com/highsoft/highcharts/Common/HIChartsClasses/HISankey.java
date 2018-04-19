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
import java.util.Observable;
import java.util.Observer;

import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



/**
A sankey series. If the type option is not
specified, it is inherited from chart.type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all sankey series are defined in [plotOptions.sankey](plotOptions.sankey).
3. Options for one single series are given in
[the series instance array](series.sankey).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        sankey: {
            // shared options for all sankey series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'sankey'
    }]
});

*/

public class HISankey extends HISeries {
	private Boolean colorByPoint;
/**
* description: When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/ : False by default •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/ : True* default: false
*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number curveFactor;
/**
Higher numbers makes the links in a sankey diagram render more curved.
A curveFactor of 0 makes the lines straight.
*/
	public void setCurveFactor(Number curveFactor) {
		this.curveFactor = curveFactor;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCurveFactor(){ return curveFactor; }

	private Number nodePadding;
/**
The padding between nodes in a sankey diagram, in pixels.
*/
	public void setNodePadding(Number nodePadding) {
		this.nodePadding = nodePadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNodePadding(){ return nodePadding; }

	private Number nodeWidth;
/**
The pixel width of each node in a sankey diagram, or the height in case
the chart is inverted.
*/
	public void setNodeWidth(Number nodeWidth) {
		this.nodeWidth = nodeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNodeWidth(){ return nodeWidth; }

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

	private Number minPointLength;
/**
The minimal height for a column or width for a bar. By default,
0 values are not shown. To visualize a 0 (or close to zero) point,
set the minimal point length to a pixel value like 3\. In stacked
column charts, minPointLength might not be respected for tightly
packed values.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/">Zero base value</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/">Positive and negative close to zero values</a>*/
	public void setMinPointLength(Number minPointLength) {
		this.minPointLength = minPointLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPointLength(){ return minPointLength; }

	private ArrayList<HIColor> colors;
/**
A series specific or series type specific color set to apply instead
of the global colors when [colorByPoint](
#plotOptions.column.colorByPoint) is true.
*/
	public void setColors(ArrayList<HIColor> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIColor> getColors(){ return colors; }

	private ArrayList <HINodes> nodes;
/**
A collection of options for the individual nodes. The nodes in a sankey
diagram are auto-generated instances of Highcharts.Point, but options can
be applied here and linked by the id.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/sankey/">Sankey diagram with node options</a>*/
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
		if (this.curveFactor != null) {
			params.put("curveFactor", this.curveFactor);
		}
		if (this.nodePadding != null) {
			params.put("nodePadding", this.nodePadding);
		}
		if (this.nodeWidth != null) {
			params.put("nodeWidth", this.nodeWidth);
		}
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.nodes != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.nodes) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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