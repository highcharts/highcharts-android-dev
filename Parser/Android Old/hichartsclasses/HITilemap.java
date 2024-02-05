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
 A `tilemap` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `tilemap` series are defined in  `plotOptions.tilemap`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     tilemap: {       // shared options for all tilemap series     }   },   series: [{     // specific options for this series instance     type: 'tilemap'   }] }); ```       
	*/

public class HITilemap extends HISeries {
	private Number pointPadding;
	/**
/** * description: The padding between points in the tilemap. * demo: * [Point padding on tiles](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/tilemap-pointpadding) 
* defaults: 2
*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number colsize;
	/**
/** * description: The column size - how many X axis units each column in the tilemap should span. Works as in `Heatmaps`. * demo: * [One day](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/) 
* defaults: 1
*/
	public void setColsize(Number colsize) {
		this.colsize = colsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColsize(){ return colsize; }

	private Number rowsize;
	/**
/** * description: The row size - how many Y axis units each tilemap row should span. Analogous to `colsize`. * demo: * [1 by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/heatmap/) 
* defaults: 1
*/
	public void setRowsize(Number rowsize) {
		this.rowsize = rowsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRowsize(){ return rowsize; }

	private String tileShape;
	/**
 The shape of the tiles in the tilemap. Possible values are `hexagon`, `circle`, `diamond`, and `square`. 
 <br><br><b>defaults:</b><br><br>&ensp;hexagon	*/
	public void setTileShape(String tileShape) {
		this.tileShape = tileShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTileShape(){ return tileShape; }

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



	public HITilemap() {
		super(); 
		this.setType("tilemap");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.colsize != null) {
			params.put("colsize", this.colsize);
		}
		if (this.rowsize != null) {
			params.put("rowsize", this.rowsize);
		}
		if (this.tileShape != null) {
			params.put("tileShape", this.tileShape);
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