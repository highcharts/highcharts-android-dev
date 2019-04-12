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



public class HIScrollablePlotArea extends HIFoundation { 

	private Number minWidth;
	/**
 The minimum width for the plot area. If it gets smaller than this, the plot area will become scrollable. 
	*/
	public void setMinWidth(Number minWidth) {
		this.minWidth = minWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinWidth(){ return minWidth; }

	private Number opacity;
	/**
 The opacity of mask applied on one of the sides of the plot area. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/scrollable-plotarea-opacity">Disabled opacity for the mask</a>
 <br><br><b>defaults:</b><br><br>&ensp;0.85	*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private Number scrollPositionX;
	/**
 The initial scrolling position of the scrollable plot area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1 aligns it to the right. Typically we would use 1 if the chart has right aligned Y axes. 
	*/
	public void setScrollPositionX(Number scrollPositionX) {
		this.scrollPositionX = scrollPositionX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScrollPositionX(){ return scrollPositionX; }



	public HIScrollablePlotArea() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.minWidth != null) {
			params.put("minWidth", this.minWidth);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.scrollPositionX != null) {
			params.put("scrollPositionX", this.scrollPositionX);
		}
		return params;
	}

}