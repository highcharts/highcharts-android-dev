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
 A `histogram` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `histogram` series are defined in  `plotOptions.histogram`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     histogram: {       // shared options for all histogram series     }   },   series: [{     // specific options for this series instance     type: 'histogram'   }] }); ```       
	*/

public class HIHistogram extends HISeries {
	private Object /* Number, String */ baseSeries;
	/**
 An integer identifying the index to use for the base series, or a string representing the id of the series. 
	*/
	public void setBaseSeries(Object /* Number, String */ baseSeries) {
		this.baseSeries = baseSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getBaseSeries(){ return baseSeries; }

	private Number pointPadding;
	/**
/** * description: Padding between each column or bar, in x axis units. * demo: * [0.1 by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-defaults/) * [0.25](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-025/) * [0 for tightly packed columns](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-none/) 
*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number binWidth;
	/**
 Width of each bin. By defaults the bin's width is calculated as `(max-min) / number of bins`. This option takes precedence over `binsNumber`. 
	*/
	public void setBinWidth(Number binWidth) {
		this.binWidth = binWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBinWidth(){ return binWidth; }

	private Object binsNumber;
	/**
 A preferable number of bins. It is a suggestion, so a histogram may have a different number of bins. By defaults it is set to the square root of the base series' data length. Available options are: `square-root`, `sturges`, `rice`. You can also define a function which takes a `baseSeries` as a parameter and should return a positive integer. 
	*/
	public void setBinsNumber(Object binsNumber) {
		this.binsNumber = binsNumber;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getBinsNumber(){ return binsNumber; }

	private Number groupPadding;
	/**
/** * description: Padding between each value groups, in x axis units. * demo: * [0.2 by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-defaults/) * [Nogrouppadding-allcolumnsareevenlyspaced](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-none/) 
*/
	public void setGroupPadding(Number groupPadding) {
		this.groupPadding = groupPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupPadding(){ return groupPadding; }

	private Boolean grouping;
	/**
/** * description: Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. * demo: * [Grouping disabled](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/) 
*/
	public void setGrouping(Boolean grouping) {
		this.grouping = grouping;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGrouping(){ return grouping; }

	private HIBorderRadiusOptionsObject borderRadius;
	/**
 The corner radius of the border surrounding each column or bar. A number signifies pixels. A percentage string, like for example `50%`, signifies a relative size. For columns this is relative to the column width, for pies it is relative to the radius and the inner radius. 
 <br><br><b>defaults:</b><br><br>&ensp;3	*/
	public void setBorderRadius(HIBorderRadiusOptionsObject borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public HIBorderRadiusOptionsObject getBorderRadius(){ return borderRadius; }

	private Number pointRange;
	/**
 The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by defaults (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points. The defaults `null` means it is computed automatically, but this option can be used to override the automatic value. This option is set by defaults to 1 if data sorting is enabled. 
	*/
	public void setPointRange(Number pointRange) {
		this.pointRange = pointRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointRange(){ return pointRange; }

	private Number minPointLength;
	/**
 The minimal height for a column or width for a bar. By defaults, 0 values are not shown. To visualize a 0 (or close to zero) point, set the minimal point length to a pixel value like 3\. In stacked column charts, minPointLength might not be respected for tightly packed values. 
	*/
	public void setMinPointLength(Number minPointLength) {
		this.minPointLength = minPointLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPointLength(){ return minPointLength; }

	private Number groupZPadding;
	/**
 The spacing between columns on the Z Axis in a 3D chart. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setGroupZPadding(Number groupZPadding) {
		this.groupZPadding = groupZPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupZPadding(){ return groupZPadding; }

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

	private HIColor edgeColor;
	/**
 3D columns only. The color of the edges. Similar to `borderColor`, except it defaultss to the same color as the column. 
	*/
	public void setEdgeColor(HIColor edgeColor) {
		this.edgeColor = edgeColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getEdgeColor(){ return edgeColor; }

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

	private Number maxPointWidth;
	/**
 The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart. 
	*/
	public void setMaxPointWidth(Number maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPointWidth(){ return maxPointWidth; }

	private Number pointWidth;
	/**
 A pixel value specifying a fixed width for each column or bar point. When set to `undefined`, the width is calculated from the `pointPadding` and `groupPadding`. The width effects the dimension that is not based on the point value. For column series it is the horizontal length and for bar series it is the vertical length. 
	*/
	public void setPointWidth(Number pointWidth) {
		this.pointWidth = pointWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointWidth(){ return pointWidth; }

	private Boolean colorByPoint;
	/**
 When using automatic point colors pulled from the global `colors` or series-specific `plotOptions.column.colors` collections, this option determines whether the chart should receive one color per series or one color per point. In styled mode, the `colors` or `series.colors` arrays are not supported, and instead this option gives the points individual color class names on the form `highcharts-color-{n}`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number edgeWidth;
	/**
 3D columns only. The width of the colored edges. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setEdgeWidth(Number edgeWidth) {
		this.edgeWidth = edgeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEdgeWidth(){ return edgeWidth; }

	private Number depth;
	/**
 Depth of the columns in a 3D column chart. 
 <br><br><b>defaults:</b><br><br>&ensp;25	*/
	public void setDepth(Number depth) {
		this.depth = depth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDepth(){ return depth; }

	private Number borderWidth;
	/**
 The width of the border surrounding each column or bar. Defaults to `1` when there is room for a border, but to `0` when the columns are so dense that a border would cover the next column. In styled mode, the stroke width can be set with the `.highcharts-point` rule. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }



	public HIHistogram() {
		super(); 
		this.setType("histogram");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.baseSeries != null) {
			params.put("baseSeries", this.baseSeries);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.binWidth != null) {
			params.put("binWidth", this.binWidth);
		}
		if (this.binsNumber != null) {
			params.put("binsNumber", this.binsNumber);
		}
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius.getParams());
		}
		if (this.pointRange != null) {
			params.put("pointRange", this.pointRange);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
		}
		if (this.groupZPadding != null) {
			params.put("groupZPadding", this.groupZPadding);
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
		if (this.edgeColor != null) {
			params.put("edgeColor", this.edgeColor.getData());
		}
		if (this.centerInCategory != null) {
			params.put("centerInCategory", this.centerInCategory);
		}
		if (this.maxPointWidth != null) {
			params.put("maxPointWidth", this.maxPointWidth);
		}
		if (this.pointWidth != null) {
			params.put("pointWidth", this.pointWidth);
		}
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		return params;
	}

}