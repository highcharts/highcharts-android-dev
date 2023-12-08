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



public class HISymbolOptionsObject extends HIFoundation { 

	private Number anchorX;
	/**
 The anchor X position for the `callout` symbol. This is where the chevron points to. 
	*/
	public void setAnchorX(Number anchorX) {
		this.anchorX = anchorX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAnchorX(){ return anchorX; }

	private Number anchorY;
	/**
 The anchor Y position for the `callout` symbol. This is where the chevron points to. 
	*/
	public void setAnchorY(Number anchorY) {
		this.anchorY = anchorY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAnchorY(){ return anchorY; }

	private Number end;
	/**
 The end angle of an `arc` symbol. 
	*/
	public void setEnd(Number end) {
		this.end = end;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEnd(){ return end; }

	private Boolean open;
	/**
 Whether to draw `arc` symbol open or closed. 
	*/
	public void setOpen(Boolean open) {
		this.open = open;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOpen(){ return open; }

	private Number r;
	/**
 The radius of an `arc` symbol, or the border radius for the `callout` symbol. 
	*/
	public void setR(Number r) {
		this.r = r;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getR(){ return r; }

	private Boolean rounded;
	/**
 Whether to draw rounded edges. 
	*/
	public void setRounded(Boolean rounded) {
		this.rounded = rounded;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRounded(){ return rounded; }

	private Number start;
	/**
 The start angle of an `arc` symbol. 
	*/
	public void setStart(Number start) {
		this.start = start;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStart(){ return start; }



	public HISymbolOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.anchorX != null) {
			params.put("anchorX", this.anchorX);
		}
		if (this.anchorY != null) {
			params.put("anchorY", this.anchorY);
		}
		if (this.end != null) {
			params.put("end", this.end);
		}
		if (this.open != null) {
			params.put("open", this.open);
		}
		if (this.r != null) {
			params.put("r", this.r);
		}
		if (this.rounded != null) {
			params.put("rounded", this.rounded);
		}
		if (this.start != null) {
			params.put("start", this.start);
		}
		return params;
	}

}