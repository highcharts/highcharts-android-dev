/**
* (c) 2009-2017 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/


package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;


/**
* description: A sankey series. If the type option is not
specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
sankey.
*/

public class HISankey extends HISeries {

/**
* description: Higher numbers makes the links in a sankey diagram render more curved.
A curveFactor of 0 makes the lines straight.
* default: 0.33
*/
	public Number curveFactor;

/**
* description: A series specific or series type specific color set to apply instead
of the global colors when colorByPoint is true.
*/
	public ArrayList<HIColor> colors;

/**
* description: Opacity for the links between nodes in the sankey diagram.
* default: 0.5
*/
	public Number linkOpacity;

/**
* description: The pixel width of each node in a sankey diagram, or the height in case
the chart is inverted.
* default: 20
*/
	public Number nodeWidth;

/**
* description: When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/ : False by default
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/ : True
* default: True
*/
	public Boolean colorByPoint;

/**
* description: The padding between nodes in a sankey diagram, in pixels.
* default: 10
*/
	public Number nodePadding;

/**
* description: The minimal height for a column or width for a bar. By default,
0 values are not shown. To visualize a 0 (or close to zero) point,
set the minimal point length to a pixel value like 3. In stacked
column charts, minPointLength might not be respected for tightly
packed values.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/ : Zero base value
https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/ : Positive and negative close to zero values
* default: 0
*/
	public Number minPointLength;

/**
* description: A collection of options for the individual nodes. The nodes in a sankey 
diagram are auto-generated instances of Highcharts.Point, but options can
be applied here and linked by the id.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/sankey/ : Sankey diagram with node options
*/
	public ArrayList <HINodes> nodes;


	public HISankey() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.curveFactor != null) {
			params.put("curveFactor", this.curveFactor);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.linkOpacity != null) {
			params.put("linkOpacity", this.linkOpacity);
		}
		if (this.nodeWidth != null) {
			params.put("nodeWidth", this.nodeWidth);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.nodePadding != null) {
			params.put("nodePadding", this.nodePadding);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
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