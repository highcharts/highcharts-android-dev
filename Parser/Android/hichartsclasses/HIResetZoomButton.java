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





public class HIResetZoomButton extends Observable implements HIChartsJSONSerializable { 

	private HIPosition position;
/**
/** The position of the button. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-position/">Above the plot area</a>
*/
	public void setPosition(HIPosition position) {
		this.position = position;
		this.position.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPosition getPosition(){ return position; }

	private HITheme theme;
/**
/** A collection of attributes for the button. The object takes SVG attributes like fill, stroke, stroke-width or r, the border radius. The theme also supports style, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in theme.states.hover. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-theme/">Theming the button</a>
*/
	public void setTheme(HITheme theme) {
		this.theme = theme;
		this.theme.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITheme getTheme(){ return theme; }

	private String relativeTo;
/**
/** What frame the button should be placed related to. Can be either plot or chart <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/resetzoombutton-relativeto/">Relative to the chart</a> <br><br><b>accepted values:</b><br><br>&ensp;["plot", "chart"]
 <br><br><b>defaults:</b><br><br>&ensp;plot*/
	public void setRelativeTo(String relativeTo) {
		this.relativeTo = relativeTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRelativeTo(){ return relativeTo; }



	public HIResetZoomButton() {

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
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.theme != null) {
			params.put("theme", this.theme.getParams());
		}
		if (this.relativeTo != null) {
			params.put("relativeTo", this.relativeTo);
		}
		return params;
	}

}