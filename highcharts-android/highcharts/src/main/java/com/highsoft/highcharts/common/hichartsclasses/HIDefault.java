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



public class HIDefault extends HIFoundation { 

	private Number zIndex;
	/**
 Guide box zIndex. 
 <br><br><b>defaults:</b><br><br>&ensp;900	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HIColor color;
	/**
 Guide box fill color. 
 <br><br><b>defaults:</b><br><br>&ensp;rgba(0, 0, 0, 0.1)	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private String className;
	/**
 CSS class name of the guide box in this state. Defaults to `highcharts-drag-box-defaults`. 
 <br><br><b>defaults:</b><br><br>&ensp;highcharts-drag-box-defaults	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private String cursor;
	/**
 Guide box cursor. 
 <br><br><b>defaults:</b><br><br>&ensp;move	*/
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private HIColor lineColor;
	/**
 Color of the border around the guide box. 
 <br><br><b>defaults:</b><br><br>&ensp;#888	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }

	private Number lineWidth;
	/**
 Width of the line around the guide box. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }



	public HIDefault() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		return params;
	}

}