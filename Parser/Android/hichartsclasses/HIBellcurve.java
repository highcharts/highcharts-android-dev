/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.common.HIColor;



	/**
 A bellcurve series. If the type option is not specified, it is inherited from chart.type. For options that apply to multiple series, it is recommended to add them to the plotOptions.series options structure. To apply to all series of this specific type, apply it to plotOptions.bellcurve. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all bellcurve series are defined in  `plotOptions.bellcurve`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     bellcurve: {       // shared options for all bellcurve series     }   },   series: [{     // specific options for this series instance     type: 'bellcurve'   }] }); `       
	*/

public class HIBellcurve extends HISeries {
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

	private Number intervals;
	/**
 This option allows to define the length of the bell curve. A unit of the length of the bell curve is standard deviation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bellcurve-intervals-pointsininterval">Intervals and points in interval</a>
	*/
	public void setIntervals(Number intervals) {
		this.intervals = intervals;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getIntervals(){ return intervals; }

	private Number pointsInInterval;
	/**
 Defines how many points should be plotted within 1 interval. See plotOptions.bellcurve.intervals. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bellcurve-intervals-pointsininterval">Intervals and points in interval</a>
	*/
	public void setPointsInInterval(Number pointsInInterval) {
		this.pointsInInterval = pointsInInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointsInInterval(){ return pointsInInterval; }

	private HIColor negativeFillColor;
	/**
 A separate color for the negative part of the area. In styled mode, a negative color is set with the .highcharts-negative class name. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-negative-color/">Negative color in styled mode</a>
	*/
	public void setNegativeFillColor(HIColor negativeFillColor) {
		this.negativeFillColor = negativeFillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNegativeFillColor(){ return negativeFillColor; }

	private Boolean trackByArea;
	/**
 Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-trackbyarea/">Display the tooltip when the area is hovered</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTrackByArea(){ return trackByArea; }

	private HIColor fillColor;
	/**
 Fill color or gradient for the area. When null, the series' color is used with the series' fillOpacity. In styled mode, the fill color can be set with the .highcharts-area class name. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-defaults/">Null by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-gradient/">Gradient</a>
	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private HIColor lineColor;
	/**
 A separate color for the graph line. By defaults the line takes the color of the series, but the lineColor setting allows setting a separate color for the line without altering the fillColor. In styled mode, the line stroke can be set with the .highcharts-graph class name. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-linecolor/">Dark gray line</a>
	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number fillOpacity;
	/**
 Fill opacity for the area. When you set an explicit fillColor, the fillOpacity is not applied. Instead, you should define the opacity in the fillColor with an rgba color definition. The fillOpacity setting, also the defaults setting, overrides the alpha component of the color setting. In styled mode, the fill opacity can be set with the .highcharts-area class name. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillopacity/">Automatic fill color and fill opacity of 0.1</a>
 <br><br><b>defaults:</b><br><br>&ensp;0.75	*/
	public void setFillOpacity(Number fillOpacity) {
		this.fillOpacity = fillOpacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFillOpacity(){ return fillOpacity; }



	public HIBellcurve() {
		super(); 
		this.setType("bellcurve");
	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = super.getParams();
		if (this.baseSeries != null) {
			params.put("baseSeries", this.baseSeries);
		}
		if (this.intervals != null) {
			params.put("intervals", this.intervals);
		}
		if (this.pointsInInterval != null) {
			params.put("pointsInInterval", this.pointsInInterval);
		}
		if (this.negativeFillColor != null) {
			params.put("negativeFillColor", this.negativeFillColor.getData());
		}
		if (this.trackByArea != null) {
			params.put("trackByArea", this.trackByArea);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.fillOpacity != null) {
			params.put("fillOpacity", this.fillOpacity);
		}
		return params;
	}

}