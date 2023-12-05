/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIPosition extends HIFoundation { 

	private Number y;
	/**
 Y position of the series center. By defaults, the series is displayed on the point that it is connected to. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 X position of the series center. By defaults, the series is displayed on the point that it is connected to. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number offsetX;
	/**
 Series center offset from the original x position. If defined, the connector line is drawn connecting original position with new position. 
	*/
	public void setOffsetX(Number offsetX) {
		this.offsetX = offsetX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffsetX(){ return offsetX; }

	private Number offsetY;
	/**
 Series center offset from the original y position. If defined, the connector line is drawn from original position to a new position. 
	*/
	public void setOffsetY(Number offsetY) {
		this.offsetY = offsetY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffsetY(){ return offsetY; }

	private String align;
	/**
 The horizontal alignment of the button. 
 <br><br><b>defaults:</b><br><br>&ensp;right	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private String verticalAlign;
	/**
 The vertical alignment of the button. 
 <br><br><b>defaults:</b><br><br>&ensp;top	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }



	public HIPosition() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.offsetX != null) {
			params.put("offsetX", this.offsetX);
		}
		if (this.offsetY != null) {
			params.put("offsetY", this.offsetY);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		return params;
	}

}