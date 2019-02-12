/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;
import com.highsoft.highcharts.common.HIColor;





/**
/** A boxplot series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all boxplot series are defined in  `plotOptions.boxplot`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     boxplot: {       // shared options for all boxplot series     }   },   series: [{     // specific options for this series instance     type: 'boxplot'   }] }); `       
*/

public class HIBoxplot extends HISeries {
	private Number stemWidth;
/**
/** The width of the stem, the vertical line extending from the box to the whiskers. If undefined, the width is inherited from the lineWidth option. In styled mode, the stem stroke width can be set with the .highcharts-boxplot-stem class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
*/
	public void setStemWidth(Number stemWidth) {
		this.stemWidth = stemWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStemWidth(){ return stemWidth; }

	private Number medianWidth;
/**
/** The pixel width of the median line. If null, the lineWidth is used. In styled mode, the median stroke width can be set with the .highcharts-boxplot-median class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
*/
	public void setMedianWidth(Number medianWidth) {
		this.medianWidth = medianWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMedianWidth(){ return medianWidth; }

	private HIColor whiskerColor;
/**
/** The color of the whiskers, the horizontal lines marking low and high values. When undefined, the general series color is used. In styled mode, the whisker stroke can be set with the .highcharts-boxplot-whisker class . <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
*/
	public void setWhiskerColor(HIColor whiskerColor) {
		this.whiskerColor = whiskerColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getWhiskerColor(){ return whiskerColor; }

	private HIColor medianColor;
/**
/** The color of the median line. If undefined, the general series color applies. In styled mode, the median stroke width can be set with the .highcharts-boxplot-median class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
*/
	public void setMedianColor(HIColor medianColor) {
		this.medianColor = medianColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getMedianColor(){ return medianColor; }

	private String stemDashStyle;
/**
/** The dash style of the stem, the vertical line extending from the box to the whiskers. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/error-bar-styling/">Error bar styling</a>
 <br><br><b>defaults:</b><br><br>&ensp;Solid*/
	public void setStemDashStyle(String stemDashStyle) {
		this.stemDashStyle = stemDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStemDashStyle(){ return stemDashStyle; }

	private Object /* Number, String */ whiskerLength;
/**
/** The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value, or a percentage value of the box width. Set 0 to disable whiskers. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">True by defaults</a>
*/
	public void setWhiskerLength(Object /* Number, String */ whiskerLength) {
		this.whiskerLength = whiskerLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWhiskerLength(){ return whiskerLength; }

	private Number whiskerWidth;
/**
/** The line width of the whiskers, the horizontal lines marking low and high values. When undefined, the general lineWidth applies. In styled mode, the whisker stroke width can be set with the .highcharts-boxplot-whisker class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/boxplot/">Box plot in styled mode</a>
*/
	public void setWhiskerWidth(Number whiskerWidth) {
		this.whiskerWidth = whiskerWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWhiskerWidth(){ return whiskerWidth; }

	private HIColor fillColor;
/**
/** The fill color of the box. In styled mode, the fill color can be set with the .highcharts-boxplot-box class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/box-plot-styling/">Box plot styling</a>
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private Number pointPadding;
/**
/** Padding between each column or bar, in x axis units. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-defaults/">0.1 by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-025/">0.25</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointpadding-none/">0 for tightly packed columns</a>
*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number pointRange;
/**
/** The X axis range that each point is valid for. This determines the width of the column. On a categorized axis, the range will be 1 by defaults (one category unit). On linear and datetime axes, the range will be computed as the distance between the two closest data points. The defaults null means it is computed automatically, but this option can be used to override the automatic value. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointrange/">Set the point range to one day on a data set with one week between the points</a>
*/
	public void setPointRange(Number pointRange) {
		this.pointRange = pointRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointRange(){ return pointRange; }

	private Number minPointLength;
/**
/** The minimal height for a column or width for a bar. By defaults, 0 values are not shown. To visualize a 0 (or close to zero) point, set the minimal point length to a pixel value like 3\. In stacked column charts, minPointLength might not be respected for tightly packed values. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength/">Zero base value</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-minpointlength-pos-and-neg/">Positive and negative close to zero values</a>
*/
	public void setMinPointLength(Number minPointLength) {
		this.minPointLength = minPointLength;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinPointLength(){ return minPointLength; }

	private ArrayList<String> colors;
/**
/** A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true. 
*/
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getColors(){ return colors; }

	private HIColor edgeColor;
/**
/** 3D columns only. The color of the edges. Similar to borderColor, except it defaultss to the same color as the column. 
*/
	public void setEdgeColor(HIColor edgeColor) {
		this.edgeColor = edgeColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getEdgeColor(){ return edgeColor; }

	private Number maxPointWidth;
/**
/** The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the columns from becoming too wide when there is a small number of points in the chart. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-maxpointwidth-20/">Limited to 50</a>
*/
	public void setMaxPointWidth(Number maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxPointWidth(){ return maxPointWidth; }

	private Number pointWidth;
/**
/** A pixel value specifying a fixed width for each column or bar. When null, the width is calculated from the pointPadding and groupPadding. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-pointwidth-20/">20px wide columns regardless of chart width or the amount of data points</a>
*/
	public void setPointWidth(Number pointWidth) {
		this.pointWidth = pointWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointWidth(){ return pointWidth; }

	private Boolean colorByPoint;
/**
/** When using automatic point colors pulled from the global `colors` or series-specific `plotOptions.column.colors` collections, this option determines whether the chart should receive one color per series or one color per point. In styled mode, the colors or series.colors arrays are not supported, and instead this option gives the points individual color class names on the form highcharts-color-{n}. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/">False by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/">True</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number groupPadding;
/**
/** Padding between each value groups, in x axis units. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-defaults/">0.2 by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouppadding-none/">No group padding - all columns are evenly spaced</a>
*/
	public void setGroupPadding(Number groupPadding) {
		this.groupPadding = groupPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupPadding(){ return groupPadding; }

	private Number edgeWidth;
/**
/** 3D columns only. The width of the colored edges. 
 <br><br><b>defaults:</b><br><br>&ensp;1*/
	public void setEdgeWidth(Number edgeWidth) {
		this.edgeWidth = edgeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEdgeWidth(){ return edgeWidth; }

	private Boolean crisp;
/**
/** When true, each column edge is rounded to its nearest pixel in order to render sharp on screen. In some cases, when there are a lot of densely packed columns, this leads to visible difference in column widths or distance between columns. In these cases, setting crisp to false may look better, even though each column is rendered blurry. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-crisp-false/">Crisp is false</a>
*/
	public void setCrisp(Boolean crisp) {
		this.crisp = crisp;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrisp(){ return crisp; }

	private Number depth;
/**
/** Depth of the columns in a 3D column chart. Requires highcharts-3d.js. 
 <br><br><b>defaults:</b><br><br>&ensp;25*/
	public void setDepth(Number depth) {
		this.depth = depth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDepth(){ return depth; }

	private Boolean grouping;
/**
/** Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-grouping-false/">Grouping disabled</a>
 <br><br><b>defaults:</b><br><br>&ensp;true*/
	public void setGrouping(Boolean grouping) {
		this.grouping = grouping;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGrouping(){ return grouping; }



	public HIBoxplot() {
		super(); 
		this.setType("boxplot");
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
		if (this.stemWidth != null) {
			params.put("stemWidth", this.stemWidth);
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
		if (this.whiskerLength != null) {
			params.put("whiskerLength", this.whiskerLength);
		}
		if (this.whiskerWidth != null) {
			params.put("whiskerWidth", this.whiskerWidth);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
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
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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
		if (this.crisp != null) {
			params.put("crisp", this.crisp);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		return params;
	}

}