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
 An `xrange` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `xrange` series are defined in  `plotOptions.xrange`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     xrange: {       // shared options for all xrange series     }   },   series: [{     // specific options for this series instance     type: 'xrange'   }] }); ```       
	*/

public class HIXrange extends HISeries {
	private Boolean colorByPoint;
	/**
/** * description: In an X-range series, this option makes all points of the same Y-axis category the same color. * demo: * [False by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/) * [True](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/) 
* defaults: True
*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private HIPartialFill partialFill;
	/**
 A partial fill for each point, typically used to visualize how much of a task is performed. The partial fill object can be set either on series or point level. 
	*/
	public void setPartialFill(HIPartialFill partialFill) {
		this.partialFill = partialFill;
		this.partialFill.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPartialFill getPartialFill(){ return partialFill; }

	private Number borderRadius;
	/**
/** * description: The corner radius of the border surrounding each column or bar. A number signifies pixels. A percentage string, like for example `50%`, signifies a relative size. For columns this is relative to the column width, for pies it is relative to the radius and the inner radius. * demo: * [Rounded columns](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/) * [Column and pie with rounded border](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-border-radius) 
* defaults: 3
*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

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

	private Boolean grouping;
	/**
 Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be laid out individually and overlap each other. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setGrouping(Boolean grouping) {
		this.grouping = grouping;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGrouping(){ return grouping; }



	public HIXrange() {
		super(); 
		this.setType("xrange");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.partialFill != null) {
			params.put("partialFill", this.partialFill.getParams());
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
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
		if (this.centerInCategory != null) {
			params.put("centerInCategory", this.centerInCategory);
		}
		if (this.maxPointWidth != null) {
			params.put("maxPointWidth", this.maxPointWidth);
		}
		if (this.pointWidth != null) {
			params.put("pointWidth", this.pointWidth);
		}
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		return params;
	}

}