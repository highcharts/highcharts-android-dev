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
 A packedbubble series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all packedbubble series are defined in  `plotOptions.packedbubble`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     packedbubble: {       // shared options for all packedbubble series     }   },   series: [{     // specific options for this series instance     type: 'packedbubble'   }] }); `       
	*/

public class HIPackedbubble extends HISeries {
	private Object /* Number, String */ minSize;
	/**
/** * description: Minimum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. * demo:  •  Bubble size
*/
	public void setMinSize(Object /* Number, String */ minSize) {
		this.minSize = minSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMinSize(){ return minSize; }

	private Object /* Number, String */ maxSize;
	/**
/** * description: Maximum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the value of each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width and height. * demo:  •  Bubble size
*/
	public void setMaxSize(Object /* Number, String */ maxSize) {
		this.maxSize = maxSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMaxSize(){ return maxSize; }

	private String sizeBy;
	/**
/** * description: Whether the bubble's value should be represented by the area or the width of the bubble. The defaults, area, corresponds best to the human perception of the size of each bubble. * demo:  •  Comparison of area and size* accepted values: ["area", "width"] 
* defaults: area
*/
	public void setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSizeBy(){ return sizeBy; }

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



	public HIPackedbubble() {
		super(); 
		this.setType("packedbubble");
	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = super.getParams();
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.maxSize != null) {
			params.put("maxSize", this.maxSize);
		}
		if (this.sizeBy != null) {
			params.put("sizeBy", this.sizeBy);
		}
		if (this.displayNegative != null) {
			params.put("displayNegative", this.displayNegative);
		}
		if (this.zThreshold != null) {
			params.put("zThreshold", this.zThreshold);
		}
		return params;
	}

}