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



public class HIButtonTheme extends HIFoundation { 

	private HIStyle style;
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private HIStates states;
	/**
 State overrides for the buttons 
	*/
	public void setStates(HIStates states) {
		this.states = states;
		this.states.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStates getStates(){ return states; }

	private Number padding;
	/**
 The padding of buttons 
 <br><br><b>defaults:</b><br><br>&ensp;8	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private String stroke;
	/**
 The stroke color for buttons 
 <br><br><b>defaults:</b><br><br>&ensp;#cccccc	*/
	public void setStroke(String stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke(){ return stroke; }

	private Number r;
	/**
 The border radius for buttons 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setR(Number r) {
		this.r = r;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getR(){ return r; }

	private Number strokeWidth;
	/**
 The stroke width for buttons 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setStrokeWidth(Number strokeWidth) {
		this.strokeWidth = strokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStrokeWidth(){ return strokeWidth; }

	private String fill;
	/**
 The fill color for buttons 
 <br><br><b>defaults:</b><br><br>&ensp;#f7f7f7	*/
	public void setFill(String fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFill(){ return fill; }



	public HIButtonTheme() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.states != null) {
			params.put("states", this.states.getParams());
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.r != null) {
			params.put("r", this.r);
		}
		if (this.strokeWidth != null) {
			params.put("stroke-width", this.strokeWidth);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		return params;
	}

}