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
 A `errorbar` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `errorbar` series are defined in  `plotOptions.errorbar`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     errorbar: {       // shared options for all errorbar series     }   },   series: [{     // specific options for this series instance     type: 'errorbar'   }] }); ```       
	*/

public class HIErrorbar extends HISeries {
	private Number whiskerWidth;
	/**
/** * description: The line width of the whiskers, the horizontal lines marking low and high values. When `null`, the general `lineWidth` applies. * demo: * [Error bar styling](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/) 
* defaults: 2
*/
	public void setWhiskerWidth(Number whiskerWidth) {
		this.whiskerWidth = whiskerWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWhiskerWidth(){ return whiskerWidth; }

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

	private HIColor stemColor;
	/**
 The color of the stem, the vertical line extending from the box to the whiskers. If `undefined`, the series color is used. In styled mode, the stem stroke can be set with the `.highcharts-boxplot-stem` class. 
	*/
	public void setStemColor(HIColor stemColor) {
		this.stemColor = stemColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getStemColor(){ return stemColor; }

	private Object /* Number, String */ whiskerLength;
	/**
 The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set `0` to disable whiskers. 
 <br><br><b>defaults:</b><br><br>&ensp;50%	*/
	public void setWhiskerLength(Object /* Number, String */ whiskerLength) {
		this.whiskerLength = whiskerLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWhiskerLength(){ return whiskerLength; }

	private Number medianWidth;
	/**
 The pixel width of the median line. If `null`, the `lineWidth` is used. In styled mode, the median stroke width can be set with the `.highcharts-boxplot-median` class. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setMedianWidth(Number medianWidth) {
		this.medianWidth = medianWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMedianWidth(){ return medianWidth; }

	private HIColor whiskerColor;
	/**
 The color of the whiskers, the horizontal lines marking low and high values. When `undefined`, the general series color is used. In styled mode, the whisker stroke can be set with the `.highcharts-boxplot-whisker` class . 
	*/
	public void setWhiskerColor(HIColor whiskerColor) {
		this.whiskerColor = whiskerColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getWhiskerColor(){ return whiskerColor; }

	private HIColor medianColor;
	/**
 The color of the median line. If `undefined`, the general series color applies. In styled mode, the median stroke width can be set with the `.highcharts-boxplot-median` class. 
	*/
	public void setMedianColor(HIColor medianColor) {
		this.medianColor = medianColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMedianColor(){ return medianColor; }

	private String stemDashStyle;
	/**
 The dash style of the stem, the vertical line extending from the box to the whiskers. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setStemDashStyle(String stemDashStyle) {
		this.stemDashStyle = stemDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStemDashStyle(){ return stemDashStyle; }

	private String whiskerDashStyle;
	/**
 The dash style of the whiskers. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setWhiskerDashStyle(String whiskerDashStyle) {
		this.whiskerDashStyle = whiskerDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWhiskerDashStyle(){ return whiskerDashStyle; }

	private HIColor fillColor;
	/**
 The fill color of the box. In styled mode, the fill color can be set with the `.highcharts-boxplot-box` class. 
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private String medianDashStyle;
	/**
 The dash style of the median. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setMedianDashStyle(String medianDashStyle) {
		this.medianDashStyle = medianDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMedianDashStyle(){ return medianDashStyle; }

	private String boxDashStyle;
	/**
 The dash style of the box. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setBoxDashStyle(String boxDashStyle) {
		this.boxDashStyle = boxDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoxDashStyle(){ return boxDashStyle; }

	private Number stemWidth;
	/**
 The width of the stem, the vertical line extending from the box to the whiskers. If `undefined`, the width is inherited from the `lineWidth` option. In styled mode, the stem stroke width can be set with the `.highcharts-boxplot-stem` class. 
	*/
	public void setStemWidth(Number stemWidth) {
		this.stemWidth = stemWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStemWidth(){ return stemWidth; }

	private Number pointPadding;
	/**
 Padding between each column or bar, in x axis units. 
 <br><br><b>defaults:</b><br><br>&ensp;0.1	*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

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

	private Number groupPadding;
	/**
 Padding between each value groups, in x axis units. 
 <br><br><b>defaults:</b><br><br>&ensp;0.2	*/
	public void setGroupPadding(Number groupPadding) {
		this.groupPadding = groupPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupPadding(){ return groupPadding; }

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



	public HIErrorbar() {
		super(); 
		this.setType("errorbar");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.whiskerWidth != null) {
			params.put("whiskerWidth", this.whiskerWidth);
		}
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		if (this.stemColor != null) {
			params.put("stemColor", this.stemColor.getData());
		}
		if (this.whiskerLength != null) {
			params.put("whiskerLength", this.whiskerLength);
		}
		if (this.medianWidth != null) {
			params.put("medianWidth", this.medianWidth);
		}
		if (this.whiskerColor != null) {
			params.put("whiskerColor", this.whiskerColor.getData());
		}
		if (this.medianColor != null) {
			params.put("medianColor", this.medianColor.getData());
		}
		if (this.stemDashStyle != null) {
			params.put("stemDashStyle", this.stemDashStyle);
		}
		if (this.whiskerDashStyle != null) {
			params.put("whiskerDashStyle", this.whiskerDashStyle);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.medianDashStyle != null) {
			params.put("medianDashStyle", this.medianDashStyle);
		}
		if (this.boxDashStyle != null) {
			params.put("boxDashStyle", this.boxDashStyle);
		}
		if (this.stemWidth != null) {
			params.put("stemWidth", this.stemWidth);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.pointRange != null) {
			params.put("pointRange", this.pointRange);
		}
		if (this.minPointLength != null) {
			params.put("minPointLength", this.minPointLength);
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
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		return params;
	}

}