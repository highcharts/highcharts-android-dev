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
import com.highsoft.highcharts.common.HIColor;



public class HIPlotBands extends HIFoundation { 

	private Object /* Number, String */ outerRadius;
	/**
 In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like `"100%"`, or as a pixel number, like `100`. 
 <br><br><b>defaults:</b><br><br>&ensp;100%	*/
	public void setOuterRadius(Object /* Number, String */ outerRadius) {
		this.outerRadius = outerRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getOuterRadius(){ return outerRadius; }

	private Object /* Number, String */ innerRadius;
	/**
 In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like `"100%"`, or as a pixel number, like `100`. By defaults, the inner radius is controlled by the `thickness` option. 
	*/
	public void setInnerRadius(Object /* Number, String */ innerRadius) {
		this.innerRadius = innerRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getInnerRadius(){ return innerRadius; }

	private Object /* Number, String */ thickness;
	/**
 In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as a percentage string, like `"10%"`, or as a pixel number, like `10`. The defaults value 10 is the same as the defaults `tickLength`, thus making the plot band act as a background for the tick markers. 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setThickness(Object /* Number, String */ thickness) {
		this.thickness = thickness;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getThickness(){ return thickness; }

	private HIColor borderColor;
	/**
 Border color for the plot band. Also requires `borderWidth` to be set. 
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Number zIndex;
	/**
 The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense. 
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private Object /* Number, String */ from;
	/**
 The start position of the plot band in axis units. On datetime axes, the value can be given as a timestamp or a date string. 
	*/
	public void setFrom(Object /* Number, String */ from) {
		this.from = from;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getFrom(){ return from; }

	private Object /* Number, String */ to;
	/**
 The end position of the plot band in axis units. On datetime axes, the value can be given as a timestamp or a date string. 
	*/
	public void setTo(Object /* Number, String */ to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getTo(){ return to; }

	private Object /* Number, String */ borderRadius;
	/**
 Border radius for the plot band. Applies only to gauges. Can be a pixel value or a percentage, for example `50%`. 
	*/
	public void setBorderRadius(Object /* Number, String */ borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getBorderRadius(){ return borderRadius; }

	private String className;
	/**
 A custom class name, in addition to the defaults `highcharts-plot-band`, to apply to each individual band. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIColor color;
	/**
 The color of the plot band. 
 <br><br><b>defaults:</b><br><br>&ensp;#e6e9ff	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number borderWidth;
	/**
 Border width for the plot band. Also requires `borderColor` to be set. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String id;
	/**
 An id used for identifying the plot band in Axis.removePlotBand. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

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

	private HIEvents events;
	/**
 An object defining mouse events for the plot band. Supported properties are `click`, `mouseover`, `mouseout`, `mousemove`. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }



	public HIPlotBands() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.outerRadius != null) {
			params.put("outerRadius", this.outerRadius);
		}
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		if (this.thickness != null) {
			params.put("thickness", this.thickness);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		return params;
	}

  /**
   * Remove the plot band.
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

}