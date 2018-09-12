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



public class HILoading extends Observable implements HIChartsJSONSerializable { 

	private HIStyle style;
/**
CSS styles for the loading screen that covers the plot area.

In styled mode, the loading label is styled with the
.highcharts-loading class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/style/">Gray plot area, white text</a> <br><br><b>default:</b><br><br>&ensp;{"position": "absolute", "backgroundColor": "#ffffff", "opacity": 0.5, "textAlign": "center"}*/
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private HILabelStyle labelStyle;
/**
CSS styles for the loading label span.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/labelstyle/">Vertically centered</a> <br><br><b>default:</b><br><br>&ensp;{"fontWeight": "bold", "position": "relative", "top": "45%"}*/
	public void setLabelStyle(HILabelStyle labelStyle) {
		this.labelStyle = labelStyle;
		this.labelStyle.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabelStyle getLabelStyle(){ return labelStyle; }

	private Number hideDuration;
/**
The duration in milliseconds of the fade out effect.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/">Fade in and out over a second</a> <br><br><b>default:</b><br><br>&ensp;100*/
	public void setHideDuration(Number hideDuration) {
		this.hideDuration = hideDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHideDuration(){ return hideDuration; }

	private Number showDuration;
/**
The duration in milliseconds of the fade in effect.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/loading/hideduration/">Fade in and out over a second</a> <br><br><b>default:</b><br><br>&ensp;100*/
	public void setShowDuration(Number showDuration) {
		this.showDuration = showDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getShowDuration(){ return showDuration; }



	public HILoading() {

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
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.labelStyle != null) {
			params.put("labelStyle", this.labelStyle.getParams());
		}
		if (this.hideDuration != null) {
			params.put("hideDuration", this.hideDuration);
		}
		if (this.showDuration != null) {
			params.put("showDuration", this.showDuration);
		}
		return params;
	}

}