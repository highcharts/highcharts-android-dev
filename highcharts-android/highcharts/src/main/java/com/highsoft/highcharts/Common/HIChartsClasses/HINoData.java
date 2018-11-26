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





public class HINoData extends Observable implements HIChartsJSONSerializable { 

	private HIPosition position;
/**
/** The position of the no-data label, relative to the plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;{ "x": 0, "y": 0, "align": "center", "verticalAlign": "middle" }*/
	public void setPosition(HIPosition position) {
		this.position = position;
		this.position.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPosition getPosition(){ return position; }

	private HIStyle style;
/**
/** CSS styles for the no-data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Styled no-data text</a>
*/
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private Object attr;
/**
/** An object of additional SVG attributes for the no-data label. 
*/
	public void setAttr(Object attr) {
		this.attr = attr;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAttr(){ return attr; }

	private Boolean useHTML;
/**
/** Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }



	public HINoData() {

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
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.attr != null) {
			params.put("attr", this.attr);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		return params;
	}

}