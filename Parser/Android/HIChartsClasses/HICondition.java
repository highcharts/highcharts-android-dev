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



public class HICondition extends Observable implements HIChartsJSONSerializable { 

	private Number minWidth;
/**
The responsive rule applies if the chart width is greater than this.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public void setMinWidth(Number minWidth) {
		this.minWidth = minWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinWidth(){ return minWidth; }

	private HIFunction callback;
/**
A callback function to gain complete control on when the responsive
rule applies. Return true if it applies. This opens for checking
against other metrics than the chart size, or example the document
size or other elements.
*/
	public void setCallback(HIFunction callback) {
		this.callback = callback;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getCallback(){ return callback; }

	private Number minHeight;
/**
The responsive rule applies if the chart height is greater than this.
 <br><br><b>default:</b><br><br>&ensp;0*/
	public void setMinHeight(Number minHeight) {
		this.minHeight = minHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinHeight(){ return minHeight; }

	private Number maxWidth;
/**
The responsive rule applies if the chart width is less than this.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Max width is 500</a>*/
	public void setMaxWidth(Number maxWidth) {
		this.maxWidth = maxWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxWidth(){ return maxWidth; }

	private Number maxHeight;
/**
The responsive rule applies if the chart height is less than this.
*/
	public void setMaxHeight(Number maxHeight) {
		this.maxHeight = maxHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxHeight(){ return maxHeight; }



	public HICondition() {

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
		if (this.callback != null) {
			params.put("callback", this.callback);
		}
		if (this.minHeight != null) {
			params.put("minHeight", this.minHeight);
		}
		if (this.maxWidth != null) {
			params.put("maxWidth", this.maxWidth);
		}
		if (this.maxHeight != null) {
			params.put("maxHeight", this.maxHeight);
		}
		return params;
	}

}