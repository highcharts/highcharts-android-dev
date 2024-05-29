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



public class HITheme extends HIFoundation { 

	private Number padding;
	/**
 Padding for the button. 
 <br><br><b>defaults:</b><br><br>&ensp;5	*/
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private HIColor stroke;
	/**
 Default stroke for the buttons. 
 <br><br><b>defaults:</b><br><br>&ensp;none	*/
	public void setStroke(HIColor stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getStroke(){ return stroke; }

	private String stroke-linecap;
	/**
 Default stroke linecap for the buttons. 
 <br><br><b>defaults:</b><br><br>&ensp;round	*/
	public void setStroke-linecap(String stroke-linecap) {
		this.stroke-linecap = stroke-linecap;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke-linecap(){ return stroke-linecap; }

	private HIColor fill;
	/**
 The defaults fill exists only to capture hover events. 
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setFill(HIColor fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFill(){ return fill; }

	private Number zIndex;
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }



	public HITheme() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke.getData());
		}
		if (this.stroke-linecap != null) {
			params.put("stroke-linecap", this.stroke-linecap);
		}
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		return params;
	}

}