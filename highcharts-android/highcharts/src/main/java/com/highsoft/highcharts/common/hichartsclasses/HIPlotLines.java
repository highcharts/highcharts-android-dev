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
 The z index of the plot line within the chart. 
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String dashStyle;
	/**
 The dashing or dot style for the plot line. For possible values see [this overview](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/). 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private HIColor color;
	/**
 The color of the line. 
 <br><br><b>defaults:</b><br><br>&ensp;#999999	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HILabels labels;
	public void setLabels(HILabels labels) {
		this.labels = labels;
		this.labels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabels getLabels(){ return labels; }

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
 The position of the line in axis units. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private HIEvents events;
	/**
 An object defining mouse events for the plot line. Supported properties are `click`, `mouseover`, `mouseout`, `mousemove`. 
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
 A custom class name, in addition to the defaults `highcharts-plot-line`, to apply to each individual line. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number width;
	/**
 The width or thickness of the plot line. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private String id;
	/**
 An id used for identifying the plot line in Axis.removePlotLine. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }



	public HIPlotLines() {

	}

	/**
	 * Remove the plot line.
	 */
	public void destroy() {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "PlotLineOrBand");
			put("method", "destroy");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
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
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
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