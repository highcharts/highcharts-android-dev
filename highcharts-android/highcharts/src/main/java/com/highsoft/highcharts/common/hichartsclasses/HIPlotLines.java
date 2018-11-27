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
import com.highsoft.highcharts.common.HIColor;





public class HIPlotLines extends Observable implements HIChartsJSONSerializable { 

	private Number zIndex;
/**
/** The z index of the plot line within the chart. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/">Behind plot lines by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/">Above plot lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/">Above plot lines and series</a>
*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String dashStyle;
/**
/** The dashing or dot style for the plot line. For possible values see [this overview](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/">Dash and dot pattern</a> <br><br><b>accepted values:</b><br><br>&ensp;["Solid", "ShortDash", "ShortDot", "ShortDashDot",       "ShortDashDotDot", "Dot", "Dash" ,"LongDash", "DashDot",       "LongDashDot", "LongDashDotDot"]
 <br><br><b>defaults:</b><br><br>&ensp;Solid*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private HIColor color;
/**
/** The color of the line. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">A red line from X axis</a>
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number value;
/**
/** The position of the line in axis units. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">Between two categories on X axis</a>
*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private String id;
/**
/** An id used for identifying the plot line in Axis.removePlotLine. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-id/">Remove plot line by id</a>
*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private String className;
/**
/** A custom class name, in addition to the defaults highcharts-plot-line, to apply to each individual line. 
*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number width;
/**
/** The width or thickness of the plot line. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">2px wide line from X axis</a>
*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private HILabel label;
/**
/** Text labels for the plot bands 
*/
	public void setLabel(HILabel label) {
		this.label = label;
		this.label.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabel getLabel(){ return label; }

	private Object events;
/**
/** An object defining mouse events for the plot line. Supported properties are click, mouseover, mouseout, mousemove. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-events/">Mouse events demonstrated</a>
*/
	public void setEvents(Object events) {
		this.events = events;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getEvents(){ return events; }



	public HIPlotLines() {

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
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.events != null) {
			params.put("events", this.events);
		}
		return params;
	}

}