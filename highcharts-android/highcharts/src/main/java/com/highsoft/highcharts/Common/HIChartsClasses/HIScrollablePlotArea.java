/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;





public class HIScrollablePlotArea extends Observable implements HIChartsJSONSerializable { 

	private Number minWidth;
/**
/** The minimum width for the plot area. If it gets smaller than this, the plot area will become scrollable. 
*/
	public void setMinWidth(Number minWidth) {
		this.minWidth = minWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinWidth(){ return minWidth; }

	private Number scrollPositionX;
/**
/** The initial scrolling position of the scrollable plot area. Ranges from 0 to 1, where 0 aligns the plot area to the left and 1 aligns it to the right. Typically we would use 1 if the chart has right aligned Y axes. 
*/
	public void setScrollPositionX(Number scrollPositionX) {
		this.scrollPositionX = scrollPositionX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScrollPositionX(){ return scrollPositionX; }



	public HIScrollablePlotArea() {

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
		if (this.minWidth != null) {
			params.put("minWidth", this.minWidth);
		}
		if (this.scrollPositionX != null) {
			params.put("scrollPositionX", this.scrollPositionX);
		}
		return params;
	}

}