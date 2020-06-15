/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIPlotLines extends HIFoundation { 

	private Number zIndex;
	/**
 The z index of the plot line within the chart. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/">Behind plot lines by defaults</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/">Above plot lines</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/">Above plot lines and series</a>
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String dashStyle;
	/**
 The dashing or dot style for the plot line. For possible values see [this overview](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/). <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/">Dash and dot pattern</a>
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private HIColor color;
	/**
 The color of the line. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">A red line from X axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;#999999	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HILabel label;
	/**
 Text labels for the plot bands 
	*/
	public void setLabel(HILabel label) {
		this.label = label;
		this.label.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabel getLabel(){ return label; }

	private Number value;
	/**
 The position of the line in axis units. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">Between two categories on X axis</a>
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private HIEvents events;
	/**
 An object defining mouse events for the plot line. Supported properties are click, mouseover, mouseout, mousemove. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-events/">Mouse events demonstrated</a>
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private String className;
	/**
 A custom class name, in addition to the defaults highcharts-plot-line, to apply to each individual line. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number width;
	/**
 The width or thickness of the plot line. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">2px wide line from X axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private String id;
	/**
 An id used for identifying the plot line in Axis.removePlotLine. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-id/">Remove plot line by id</a>
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }



	public HIPlotLines() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		return params;
	}

}