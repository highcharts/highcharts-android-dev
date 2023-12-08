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

	private HIDragHandle dragHandle;
	/**
 Options for the drag handles available in column series. 
	*/
	public void setDragHandle(HIDragHandle dragHandle) {
		this.dragHandle = dragHandle;
		this.dragHandle.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDragHandle getDragHandle(){ return dragHandle; }

	private Boolean draggableTarget;
	/**
 Allow target value to be dragged individually. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setDraggableTarget(Boolean draggableTarget) {
		this.draggableTarget = draggableTarget;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableTarget(){ return draggableTarget; }

	private HIGuideBox guideBox;
	/**
 Style options for the guide box. The guide box has one state by defaults, the `defaults` state. 
	*/
	public void setGuideBox(HIGuideBox guideBox) {
		this.guideBox = guideBox;
		this.guideBox.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIGuideBox getGuideBox(){ return guideBox; }

	private Number dragMaxX;
	/**
 Set the maximum X value the points can be moved to. 
	*/
	public void setDragMaxX(Number dragMaxX) {
		this.dragMaxX = dragMaxX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDragMaxX(){ return dragMaxX; }

	private Number dragMaxY;
	/**
 Set the maximum Y value the points can be moved to. 
	*/
	public void setDragMaxY(Number dragMaxY) {
		this.dragMaxY = dragMaxY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDragMaxY(){ return dragMaxY; }

	private Number dragPrecisionX;
	/**
 The X precision value to drag to for this series. Set to 0 to disable. By defaults this is disabled, except for category axes, where the defaults is `1`. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setDragPrecisionX(Number dragPrecisionX) {
		this.dragPrecisionX = dragPrecisionX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDragPrecisionX(){ return dragPrecisionX; }

	private Number dragPrecisionY;
	/**
 The Y precision value to drag to for this series. Set to 0 to disable. By defaults this is disabled, except for category axes, where the defaults is `1`. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setDragPrecisionY(Number dragPrecisionY) {
		this.dragPrecisionY = dragPrecisionY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDragPrecisionY(){ return dragPrecisionY; }

	private Number dragMinX;
	/**
 Set the minimum X value the points can be moved to. 
	*/
	public void setDragMinX(Number dragMinX) {
		this.dragMinX = dragMinX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDragMinX(){ return dragMinX; }

	private Number dragMinY;
	/**
 Set the minimum Y value the points can be moved to. 
	*/
	public void setDragMinY(Number dragMinY) {
		this.dragMinY = dragMinY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDragMinY(){ return dragMinY; }

	private Boolean draggableY;
	/**
 Enable dragging in the Y dimension. Note that this is not supported for TreeGrid axes (the defaults axis type in Gantt charts). 
	*/
	public void setDraggableY(Boolean draggableY) {
		this.draggableY = draggableY;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableY(){ return draggableY; }

	private Boolean draggableX;
	/**
 Enable dragging in the X dimension. 
	*/
	public void setDraggableX(Boolean draggableX) {
		this.draggableX = draggableX;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDraggableX(){ return draggableX; }

	private Number dragSensitivity;
	/**
 The amount of pixels to drag the pointer before it counts as a drag operation. This prevents drag/drop to fire when just clicking or selecting points. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setDragSensitivity(Number dragSensitivity) {
		this.dragSensitivity = dragSensitivity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDragSensitivity(){ return dragSensitivity; }

	private String groupBy;
	/**
 Group the points by a property. Points with the same property value will be grouped together when moving. 
	*/
	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGroupBy(){ return groupBy; }

	private Boolean liveRedraw;
	/**
 Update points as they are dragged. If false, a guide box is drawn to illustrate the new point size. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setLiveRedraw(Boolean liveRedraw) {
		this.liveRedraw = liveRedraw;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getLiveRedraw(){ return liveRedraw; }



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
		if (this.dragHandle != null) {
			params.put("dragHandle", this.dragHandle.getParams());
		}
		if (this.draggableTarget != null) {
			params.put("draggableTarget", this.draggableTarget);
		}
		if (this.guideBox != null) {
			params.put("guideBox", this.guideBox.getParams());
		}
		if (this.dragMaxX != null) {
			params.put("dragMaxX", this.dragMaxX);
		}
		if (this.dragMaxY != null) {
			params.put("dragMaxY", this.dragMaxY);
		}
		if (this.dragPrecisionX != null) {
			params.put("dragPrecisionX", this.dragPrecisionX);
		}
		if (this.dragPrecisionY != null) {
			params.put("dragPrecisionY", this.dragPrecisionY);
		}
		if (this.dragMinX != null) {
			params.put("dragMinX", this.dragMinX);
		}
		if (this.dragMinY != null) {
			params.put("dragMinY", this.dragMinY);
		}
		if (this.draggableY != null) {
			params.put("draggableY", this.draggableY);
		}
		if (this.draggableX != null) {
			params.put("draggableX", this.draggableX);
		}
		if (this.dragSensitivity != null) {
			params.put("dragSensitivity", this.dragSensitivity);
		}
		if (this.groupBy != null) {
			params.put("groupBy", this.groupBy);
		}
		if (this.liveRedraw != null) {
			params.put("liveRedraw", this.liveRedraw);
		}
		return params;
	}

}