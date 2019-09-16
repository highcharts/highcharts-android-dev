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



public class HICrosshair extends HIFoundation { 

	private Number zIndex;
	/**
 The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String dashStyle;
	/**
 The dash style for the crosshair. See plotOptions.series.dashStyle for possible values. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-dotted/">Dotted crosshair</a>
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private HIColor color;
	/**
 The color of the crosshair. Defaults to #cccccc for numeric and datetime axes, and rgba(204,214,235,0.25) for category axes, where the crosshair by defaults highlights the whole category. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a>
 <br><br><b>defaults:</b><br><br>&ensp;#cccccc	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private String className;
	/**
 A class name for the crosshair, especially as a hook for styling. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private Number width;
	/**
 The pixel width of the crosshair. Defaults to 1 for numeric or datetime axes, and for one category width for category axes. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a>
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Boolean snap;
	/**
 Whether the crosshair should snap to the point or follow the pointer independent of points. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-snap-false/">True by defaults</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setSnap(Boolean snap) {
		this.snap = snap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSnap(){ return snap; }



	public HICrosshair() {

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
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.snap != null) {
			params.put("snap", this.snap);
		}
		return params;
	}

}