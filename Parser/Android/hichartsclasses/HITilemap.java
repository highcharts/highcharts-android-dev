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
/** A tilemap series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all tilemap series are defined in  `plotOptions.tilemap`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     tilemap: {       // shared options for all tilemap series     }   },   series: [{     // specific options for this series instance     type: 'tilemap'   }] }); `       
*/

public class HITilemap extends HISeries {
	private Number rowsize;
/**
/** * description: The row size - how many Y axis units each tilemap row should span. Analogous to colsize. * demo:  •  1 by defaults
* defaults: 1
*/
	public void setRowsize(Number rowsize) {
		this.rowsize = rowsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRowsize(){ return rowsize; }

	private Number pointPadding;
/**
/** * description: The padding between points in the tilemap. * demo:  •  Point padding on tiles
* defaults: 0
*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private String tileShape;
/**
/** The shape of the tiles in the tilemap. Possible values are hexagon, circle, diamond, and square. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa">Circular tile shapes</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap">Diamond tile shapes</a> <br><br><b>accepted values:</b><br><br>&ensp;["circle", "diamond", "hexagon", "square"]
*/
	public void setTileShape(String tileShape) {
		this.tileShape = tileShape;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTileShape(){ return tileShape; }

	private Number colsize;
/**
/** * description: The column size - how many X axis units each column in the tilemap should span. Works as in Heatmaps. * demo:  •  One day
* defaults: 1
*/
	public void setColsize(Number colsize) {
		this.colsize = colsize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColsize(){ return colsize; }

	private HIColor nullColor;
/**
/** The color applied to null points. In styled mode, a general CSS class is applied instead. 
*/
	public void setNullColor(HIColor nullColor) {
		this.nullColor = nullColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNullColor(){ return nullColor; }



	public HITilemap() {
		super(); 
		this.setType("tilemap");
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
		if (this.rowsize != null) {
			params.put("rowsize", this.rowsize);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.tileShape != null) {
			params.put("tileShape", this.tileShape);
		}
		if (this.colsize != null) {
			params.put("colsize", this.colsize);
		}
		if (this.nullColor != null) {
			params.put("nullColor", this.nullColor.getData());
		}
		return params;
	}

}