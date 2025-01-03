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
 A `heatmap` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `heatmap` series are defined in  `plotOptions.heatmap`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     heatmap: {       // shared options for all heatmap series     }   },   series: [{     // specific options for this series instance     type: 'heatmap'   }] }); ```       
	*/

public class HIHeatmap extends HISeries {
	private Number pointPadding;
	/**
 Padding between the points in the heatmap. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number rowsize;
	/**
 The row size - how many Y axis units each heatmap row should span. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setRowsize(Number rowsize) {
		this.rowsize = rowsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRowsize(){ return rowsize; }

	private Number colsize;
	/**
 The column size - how many X axis units each column in the heatmap should span. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setColsize(Number colsize) {
		this.colsize = colsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColsize(){ return colsize; }

	private Number borderRadius;
	/**
 The border radius for each heatmap item. The border's color and width can be set in marker options. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private HIColor nullColor;
	/**
 The color applied to null points. In styled mode, a general CSS class is applied instead. 
 <br><br><b>defaults:</b><br><br>&ensp;#f7f7f7	*/
	public void setNullColor(HIColor nullColor) {
		this.nullColor = nullColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNullColor(){ return nullColor; }

	private Boolean interpolation;
	/**
 Make the heatmap render its data points as an interpolated image. 
	*/
	public void setInterpolation(Boolean interpolation) {
		this.interpolation = interpolation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInterpolation(){ return interpolation; }



	public HIHeatmap() {
		super(); 
		this.setType("heatmap");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.rowsize != null) {
			params.put("rowsize", this.rowsize);
		}
		if (this.colsize != null) {
			params.put("colsize", this.colsize);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.nullColor != null) {
			params.put("nullColor", this.nullColor.getData());
		}
		if (this.interpolation != null) {
			params.put("interpolation", this.interpolation);
		}
		return params;
	}

}