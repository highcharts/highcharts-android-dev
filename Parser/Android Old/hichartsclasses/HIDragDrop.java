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



public class HIDragDrop extends HIFoundation { 

	private Boolean draggableHigh;
	/**
 Allow high value to be dragged individually. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDraggableHigh(Boolean draggableHigh) {
		this.draggableHigh = draggableHigh;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableHigh(){ return draggableHigh; }

	private Boolean draggableLow;
	/**
 Allow low value to be dragged individually. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDraggableLow(Boolean draggableLow) {
		this.draggableLow = draggableLow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableLow(){ return draggableLow; }

	private Boolean draggableX2;
	/**
 Allow x2 value to be dragged individually. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDraggableX2(Boolean draggableX2) {
		this.draggableX2 = draggableX2;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableX2(){ return draggableX2; }

	private Boolean draggableX1;
	/**
 Allow x value to be dragged individually. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDraggableX1(Boolean draggableX1) {
		this.draggableX1 = draggableX1;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableX1(){ return draggableX1; }

	private Boolean draggableQ1;
	/**
 Allow Q1 value to be dragged individually. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDraggableQ1(Boolean draggableQ1) {
		this.draggableQ1 = draggableQ1;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableQ1(){ return draggableQ1; }

	private Boolean draggableQ3;
	/**
 Allow Q3 value to be dragged individually. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDraggableQ3(Boolean draggableQ3) {
		this.draggableQ3 = draggableQ3;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableQ3(){ return draggableQ3; }



	public HIDragDrop() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.draggableHigh != null) {
			params.put("draggableHigh", this.draggableHigh);
		}
		if (this.draggableLow != null) {
			params.put("draggableLow", this.draggableLow);
		}
		if (this.draggableX2 != null) {
			params.put("draggableX2", this.draggableX2);
		}
		if (this.draggableX1 != null) {
			params.put("draggableX1", this.draggableX1);
		}
		if (this.draggableQ1 != null) {
			params.put("draggableQ1", this.draggableQ1);
		}
		if (this.draggableQ3 != null) {
			params.put("draggableQ3", this.draggableQ3);
		}
		return params;
	}

}