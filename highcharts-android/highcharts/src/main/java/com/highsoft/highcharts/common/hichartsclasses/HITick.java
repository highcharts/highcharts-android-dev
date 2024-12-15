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



public class HITick extends HIFoundation { 

	private HIAxis axis;
	/**
 The related axis of the tick. 
	*/
	public void setAxis(HIAxis axis) {
		this.axis = axis;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAxis getAxis(){ return axis; }

	private HISVGElement gridLine;
	/**
 The rendered grid line of the tick. 
	*/
	public void setGridLine(HISVGElement gridLine) {
		this.gridLine = gridLine;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getGridLine(){ return gridLine; }

	private Boolean isFirst;
	/**
 True if the tick is the first one on the axis. 
	*/
	public void setIsFirst(Boolean isFirst) {
		this.isFirst = isFirst;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsFirst(){ return isFirst; }

	private Boolean isLast;
	/**
 True if the tick is the last one on the axis. 
	*/
	public void setIsLast(Boolean isLast) {
		this.isLast = isLast;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsLast(){ return isLast; }

	private HISVGElement label;
	/**
 The rendered text label of the tick. 
	*/
	public void setLabel(HISVGElement label) {
		this.label = label;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getLabel(){ return label; }

	private HISVGElement mark;
	/**
 The rendered mark of the tick. 
	*/
	public void setMark(HISVGElement mark) {
		this.mark = mark;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getMark(){ return mark; }

	private Number pos;
	/**
 The logical position of the tick on the axis in terms of axis values. 
	*/
	public void setPos(Number pos) {
		this.pos = pos;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPos(){ return pos; }

	private Number tickmarkOffset;
	/**
 The mark offset of the tick on the axis. Usually `undefined`, numeric for grid axes. 
	*/
	public void setTickmarkOffset(Number tickmarkOffset) {
		this.tickmarkOffset = tickmarkOffset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTickmarkOffset(){ return tickmarkOffset; }

	private String type;
	/**
 The tick type, which can be `"minor"`, or an empty string. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HITick() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
		}
		if (this.gridLine != null) {
			params.put("gridLine", this.gridLine.getParams());
		}
		if (this.isFirst != null) {
			params.put("isFirst", this.isFirst);
		}
		if (this.isLast != null) {
			params.put("isLast", this.isLast);
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.mark != null) {
			params.put("mark", this.mark.getParams());
		}
		if (this.pos != null) {
			params.put("pos", this.pos);
		}
		if (this.tickmarkOffset != null) {
			params.put("tickmarkOffset", this.tickmarkOffset);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}