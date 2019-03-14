/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIFrame extends HIFoundation { 

	private HIRight right;
	/**
 The right of the frame around a 3D chart. 
	*/
	public void setRight(HIRight right) {
		this.right = right;
		this.right.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIRight getRight(){ return right; }

	private HIBottom bottom;
	/**
 The bottom of the frame around a 3D chart. 
	*/
	public void setBottom(HIBottom bottom) {
		this.bottom = bottom;
		this.bottom.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBottom getBottom(){ return bottom; }

	private HITop top;
	/**
 The top of the frame around a 3D chart. 
	*/
	public void setTop(HITop top) {
		this.top = top;
		this.top.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITop getTop(){ return top; }

	private HIBack back;
	/**
 The back side of the frame around a 3D chart. 
	*/
	public void setBack(HIBack back) {
		this.back = back;
		this.back.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBack getBack(){ return back; }

	private String visible;
	/**
 Whether the frames are visible. 
	*/
	public void setVisible(String visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVisible(){ return visible; }

	private HIFront front;
	/**
 The front of the frame around a 3D chart. 
	*/
	public void setFront(HIFront front) {
		this.front = front;
		this.front.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFront getFront(){ return front; }

	private Number size;
	/**
 General pixel thickness for the frame faces. 
	*/
	public void setSize(Number size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSize(){ return size; }

	private HILeft left;
	/**
 The left side of the frame around a 3D chart. 
	*/
	public void setLeft(HILeft left) {
		this.left = left;
		this.left.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILeft getLeft(){ return left; }



	public HIFrame() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.right != null) {
			params.put("right", this.right.getParams());
		}
		if (this.bottom != null) {
			params.put("bottom", this.bottom.getParams());
		}
		if (this.top != null) {
			params.put("top", this.top.getParams());
		}
		if (this.back != null) {
			params.put("back", this.back.getParams());
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.front != null) {
			params.put("front", this.front.getParams());
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.left != null) {
			params.put("left", this.left.getParams());
		}
		return params;
	}

}