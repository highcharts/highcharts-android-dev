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
 A `areasplinerange` series. If the `type` option is not specified, it is inherited from `chart.type`. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `areasplinerange` series are defined in  `plotOptions.areasplinerange`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     areasplinerange: {       // shared options for all areasplinerange series     }   },   series: `{     // specific options for this series instance     type: 'areasplinerange'   }] }); ``` **TypeScript:** - the [type` option must always be set. - when accessing an array of series, the combined set of all series types is  represented by `Highcharts.SeriesOptionsType  `. Narrowing down to the  specific type can be done by checking the `type` property. ``` if (chart.options.series?.[0]?.type === areasplinerange) {   // code specific to the areasplinerange series } ```       
	*/

public class HIAreasplinerange extends HISeries {
	private HIColor fillColor;
	/**
/** * description: Fill color or gradient for the area. When `undefined`, the series' `color` is used with the series' `fillOpacity`. In styled mode, the fill color can be set with the `.highcharts-area` class name. * demo: * [Undefined by defaults](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-defaults/) * [Gradient](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-gradient/) 
*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private Number fillOpacity;
	/**
/** * description: Fill opacity for the area. When you set an explicit `fillColor`, the `fillOpacity` is not applied. Instead, you should define the opacity in the `fillColor` with an rgba color definition. The `fillOpacity` setting, also the defaults setting, overrides the alpha component of the `color` setting. In styled mode, the fill opacity can be set with the `.highcharts-area` class name. * demo: * [Automatic fill color and fill opacity of 0.1](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillopacity/) 
* defaults: 0.75
*/
	public void setFillOpacity(Number fillOpacity) {
		this.fillOpacity = fillOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFillOpacity(){ return fillOpacity; }

	private HILowMarker lowMarker;
	/**
 Options for the lower markers of the arearange-like series. When `lowMarker` is not defined, options inherit form the marker. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setLowMarker(HILowMarker lowMarker) {
		this.lowMarker = lowMarker;
		this.lowMarker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILowMarker getLowMarker(){ return lowMarker; }

	private Boolean trackByArea;
	/**
/** * description: Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events. * demo: * [Display the tooltip when the area is hovered](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-trackbyarea/) 
* defaults: True
*/
	public void setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTrackByArea(){ return trackByArea; }

	private HIColor negativeFillColor;
	/**
 A separate color for the negative part of the area. Note that `zones` takes precedence over the negative fill color. In styled mode, a negative color is set with the `.highcharts-negative` class name. 
	*/
	public void setNegativeFillColor(HIColor negativeFillColor) {
		this.negativeFillColor = negativeFillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNegativeFillColor(){ return negativeFillColor; }

	private HIColor lineColor;
	/**
 A separate color for the graph line. By defaults the line takes the `color` of the series, but the lineColor setting allows setting a separate color for the line without altering the `fillColor`. In styled mode, the line stroke can be set with the `.highcharts-graph` class name. 
	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }



	public HIAreasplinerange() {
		super(); 
		this.setType("areasplinerange");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.fillOpacity != null) {
			params.put("fillOpacity", this.fillOpacity);
		}
		if (this.lowMarker != null) {
			params.put("lowMarker", this.lowMarker.getParams());
		}
		if (this.trackByArea != null) {
			params.put("trackByArea", this.trackByArea);
		}
		if (this.negativeFillColor != null) {
			params.put("negativeFillColor", this.negativeFillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		return params;
	}

}