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



	/**
 A bubble series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all bubble series are defined in  `plotOptions.bubble`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     bubble: {       // shared options for all bubble series     }   },   series: [{     // specific options for this series instance     type: 'bubble'   }] }); `       
	*/

public class HIBubble extends HISeries {
	private Number zMax;
	/**
 The minimum for the Z value range. Defaults to the highest Z value in the data. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-zmin-zmax/">Z has a possible range of 0-100</a>
	*/
	public void setZMax(Number zMax) {
		this.zMax = zMax;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZMax(){ return zMax; }

	private String sizeBy;
	/**
 Whether the bubble's value should be represented by the area or the width of the bubble. The defaults, area, corresponds best to the human perception of the size of each bubble. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-sizeby/">Comparison of area and size</a> <br><br><b>accepted values:</b><br><br>&ensp;["area", "width"]
 <br><br><b>defaults:</b><br><br>&ensp;area	*/
	public void setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSizeBy(){ return sizeBy; }

	private Number zMin;
	/**
 The minimum for the Z value range. Defaults to the lowest Z value in the data. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-zmin-zmax/">Z has a possible range of 0-100</a>
	*/
	public void setZMin(Number zMin) {
		this.zMin = zMin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZMin(){ return zMin; }

	private Object /* Number, String */ minSize;
	/**
 Minimum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the z value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-size/">Bubble size</a>
	*/
	public void setMinSize(Object /* Number, String */ minSize) {
		this.minSize = minSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMinSize(){ return minSize; }

	private Object /* Number, String */ maxSize;
	/**
 Maximum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the z value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-size/">Bubble size</a>
	*/
	public void setMaxSize(Object /* Number, String */ maxSize) {
		this.maxSize = maxSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMaxSize(){ return maxSize; }

	private Boolean displayNegative;
	/**
 Whether to display negative sized bubbles. The threshold is given by the zThreshold option, and negative bubbles can be visualized by setting negativeColor. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-negative/">Negative bubbles</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDisplayNegative(Boolean displayNegative) {
		this.displayNegative = displayNegative;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDisplayNegative(){ return displayNegative; }

	private Number zThreshold;
	/**
 When displayNegative is false, bubbles with lower Z values are skipped. When displayNegative is true and a negativeColor is given, points with lower Z is colored. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-negative/">Negative bubbles</a>
	*/
	public void setZThreshold(Number zThreshold) {
		this.zThreshold = zThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZThreshold(){ return zThreshold; }

	private Boolean sizeByAbsoluteValue;
	/**
 When this is true, the absolute value of z determines the size of the bubble. This means that with the defaults zThreshold of 0, a bubble of value -1 will have the same size as a bubble of value 1, while a bubble of value 0 will have a smaller size according to minSize. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/bubble-sizebyabsolutevalue/">Size by absolute value, various thresholds</a>
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setSizeByAbsoluteValue(Boolean sizeByAbsoluteValue) {
		this.sizeByAbsoluteValue = sizeByAbsoluteValue;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSizeByAbsoluteValue(){ return sizeByAbsoluteValue; }

	private HIJitter jitter;
	/**
 Apply a jitter effect for the rendered markers. When plotting discrete values, a little random noise may help telling the points apart. The jitter setting applies a random displacement of up to n axis units in either direction. So for example on a horizontal X axis, setting the jitter.x to 0.24 will render the point in a random position between 0.24 units to the left and 0.24 units to the right of the true axis position. On a category axis, setting it to 0.5 will fill up the bin and make the data appear continuous. When rendered on top of a box plot or a column series, a jitter value of 0.24 will correspond to the underlying series' defaults [groupPadding](https://api.highcharts.com/highcharts/plotOptions.column.groupPadding) and [pointPadding](https://api.highcharts.com/highcharts/plotOptions.column.pointPadding) settings. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-scatter/jitter">Jitter on a scatter plot</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-scatter/jitter-boxplot">Jittered scatter plot on top of a box plot</a>
	*/
	public void setJitter(HIJitter jitter) {
		this.jitter = jitter;
		this.jitter.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIJitter getJitter(){ return jitter; }



	public HIBubble() {
		super(); 
		this.setType("bubble");
	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = super.getParams();
		if (this.zMax != null) {
			params.put("zMax", this.zMax);
		}
		if (this.sizeBy != null) {
			params.put("sizeBy", this.sizeBy);
		}
		if (this.zMin != null) {
			params.put("zMin", this.zMin);
		}
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.maxSize != null) {
			params.put("maxSize", this.maxSize);
		}
		if (this.displayNegative != null) {
			params.put("displayNegative", this.displayNegative);
		}
		if (this.zThreshold != null) {
			params.put("zThreshold", this.zThreshold);
		}
		if (this.sizeByAbsoluteValue != null) {
			params.put("sizeByAbsoluteValue", this.sizeByAbsoluteValue);
		}
		if (this.jitter != null) {
			params.put("jitter", this.jitter.getParams());
		}
		return params;
	}

}