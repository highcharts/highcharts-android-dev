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



public class HIAttributes extends HIFoundation { 

	private Number refY;
	public void setRefY(Number refY) {
		this.refY = refY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRefY(){ return refY; }

	private Number refX;
	public void setRefX(Number refX) {
		this.refX = refX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRefX(){ return refX; }

	private String id;
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number markerWidth;
	public void setMarkerWidth(Number markerWidth) {
		this.markerWidth = markerWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarkerWidth(){ return markerWidth; }

	private String display;
	public void setDisplay(String display) {
		this.display = display;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDisplay(){ return display; }

	private Number markerHeight;
	public void setMarkerHeight(Number markerHeight) {
		this.markerHeight = markerHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarkerHeight(){ return markerHeight; }

	private Number zIndex;
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }



	public HIAttributes() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.refY != null) {
			params.put("refY", this.refY);
		}
		if (this.refX != null) {
			params.put("refX", this.refX);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.markerWidth != null) {
			params.put("markerWidth", this.markerWidth);
		}
		if (this.display != null) {
			params.put("display", this.display);
		}
		if (this.markerHeight != null) {
			params.put("markerHeight", this.markerHeight);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		return params;
	}

}