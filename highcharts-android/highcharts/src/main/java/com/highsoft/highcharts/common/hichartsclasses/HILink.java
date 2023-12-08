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



public class HILink extends HIFoundation { 

	private HIColor color;
	/**
 The color of the links between nodes. 
 <br><br><b>defaults:</b><br><br>&ensp;#666666	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private String type;
	/**
 Type of the link shape. 
 <br><br><b>defaults:</b><br><br>&ensp;'defaults'	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Number lineWidth;
	/**
 The line width of the links connecting nodes, in pixels. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number radius;
	/**
 Radius for the rounded corners of the links between nodes. Works for `defaults` link type. 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setRadius(Number radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRadius(){ return radius; }

	private Number offset;
	/**
 Modifier of the shape of the curved link. Works best for values between 0 and 1, where 0 is a straight line, and 1 is a shape close to the defaults one. 
 <br><br><b>defaults:</b><br><br>&ensp;0.5	*/
	public void setOffset(Number offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffset(){ return offset; }

	private Number opacity;
	/**
 Opacity of the link between two nodes. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private String dashStyle;
	/**
 A name for the dash style to use for links. 
	*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private Number width;
	/**
 Width (px) of the link between two nodes. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private String cursor;
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private Number curveFactor;
	/**
 Modifier of the shape of the curved link. Works best for values between 0 and 1, where 0 is a straight line, and 1 is a shape close to the defaults one. 
 <br><br><b>defaults:</b><br><br>&ensp;0.5	*/
	public void setCurveFactor(Number curveFactor) {
		this.curveFactor = curveFactor;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCurveFactor(){ return curveFactor; }



	public HILink() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.curveFactor != null) {
			params.put("curveFactor", this.curveFactor);
		}
		return params;
	}

}