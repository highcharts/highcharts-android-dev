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
import com.highsoft.highcharts.Core.HIGFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;


/**
* description: A sunburst series. If the type option is
not specified, it is inherited from chart.type.
For options that apply to multiple series, it is recommended to add
them to the plotOptions.series options structure.
To apply to all series of this specific type, apply it to plotOptions.
sunburst.
*/

public class HISunburst extends HISeries {

/**
* description: The color of the border surrounding each slice. When null, the
border takes the same color as the slice fill. This can be used
together with a borderWidth to fill drawing gaps created by antialiazing
artefacts in borderless pies.
In styled mode, the border stroke is given in the .highcharts-point class.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/ : Black border
* default: #ffffff
*/
	public HIColor borderColor;

/**
* description: The diameter of the pie relative to the plot area. Can be a percentage
or pixel value. Pixel values are given as integers. The default
behaviour (as of 3.0) is to scale to the plot area and give room
for data labels within the plot area. As a consequence, the size
of the pie may vary when points are updated and data labels more
around. In that case it is best to set a fixed value, for example
"75%".

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-size/ : Smaller pie
*/
	public Object /* String, Double */ size;

/**
* description: Which point to use as a root in the visualization.
* default: undefined
*/
	public String rootId;

/**
* description: The start angle of the pie slices in degrees where 0 is top and 90
right.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/ : Start from right
* default: 0
*/
	public Number startAngle;

/**
* description: Set options on specific levels. Takes precedence over series options,
but not point options.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst : Sunburst chart
*/
	public ArrayList <HILevels> levels;

/**
* description: Used together with the levels and allowDrillToNode options. When
set to false the first level visible when drilling is considered
to be level one. Otherwise the level will be the same as the tree
structure.
* default: True
*/
	public Boolean levelIsConstant;

/**
* description: A series specific or series type specific color set to use instead
of the global colors.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/ : Set default colors for all pies
*/
	public ArrayList<HIColor> colors;

/**
* description: When enabled the user can click on a point which is a parent and
zoom in on its children.

* demo: https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst : Allow drill to node
* default: false
*/
	public Boolean allowDrillToNode;


	public HISunburst() {
		super(); 
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.rootId != null) {
			params.put("rootId", this.rootId);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
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
		if (this.levelIsConstant != null) {
			params.put("levelIsConstant", this.levelIsConstant);
		}
		if (this.colors != null) {
			ArrayList<HIColor> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add((HIColor) hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.allowDrillToNode != null) {
			params.put("allowDrillToNode", this.allowDrillToNode);
		}
		return params;
	}

}