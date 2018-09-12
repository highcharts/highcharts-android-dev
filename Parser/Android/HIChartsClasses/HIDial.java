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
import com.highsoft.highcharts.Common.HIColor;



public class HIDial extends Observable implements HIChartsJSONSerializable { 

	private HIColor borderColor;
/**
The border color or stroke of the gauge's dial. By default, the
borderWidth is 0, so this must be set in addition to a custom border
color.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#cccccc*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private String rearLength;
/**
The length of the dial's rear end, the part that extends out on the
other side of the pivot. Relative to the dial's length.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;10%*/
	public void setRearLength(String rearLength) {
		this.rearLength = rearLength;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRearLength(){ return rearLength; }

	private String baseLength;
/**
The length of the dial's base part, relative to the total radius
or length of the dial.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;70%*/
	public void setBaseLength(String baseLength) {
		this.baseLength = baseLength;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBaseLength(){ return baseLength; }

	private String radius;
/**
The radius or length of the dial, in percentages relative to the
radius of the gauge itself.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;80%*/
	public void setRadius(String radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRadius(){ return radius; }

	private Number borderWidth;
/**
The width of the gauge dial border in pixels.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private HIColor backgroundColor;
/**
The background or fill color of the gauge's dial.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;#000000*/
	public void setBackgroundColor(HIColor backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBackgroundColor(){ return backgroundColor; }

	private Number topWidth;
/**
The width of the top of the dial, closest to the perimeter. The pivot
narrows in from the base to the top.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public void setTopWidth(Number topWidth) {
		this.topWidth = topWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTopWidth(){ return topWidth; }

	private Number baseWidth;
/**
The pixel width of the base of the gauge dial. The base is the part
closest to the pivot, defined by baseLength.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/gauge-dial/">Dial options demonstrated</a> <br><br><b>default:</b><br><br>&ensp;3*/
	public void setBaseWidth(Number baseWidth) {
		this.baseWidth = baseWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBaseWidth(){ return baseWidth; }



	public HIDial() {

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
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.rearLength != null) {
			params.put("rearLength", this.rearLength);
		}
		if (this.baseLength != null) {
			params.put("baseLength", this.baseLength);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor.getData());
		}
		if (this.topWidth != null) {
			params.put("topWidth", this.topWidth);
		}
		if (this.baseWidth != null) {
			params.put("baseWidth", this.baseWidth);
		}
		return params;
	}

}