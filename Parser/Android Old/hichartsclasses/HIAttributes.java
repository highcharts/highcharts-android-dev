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

	private Number refX;
	public void setRefX(Number refX) {
		this.refX = refX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRefX(){ return refX; }

	private Number markerWidth;
	public void setMarkerWidth(Number markerWidth) {
		this.markerWidth = markerWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarkerWidth(){ return markerWidth; }

	private Number refY;
	public void setRefY(Number refY) {
		this.refY = refY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRefY(){ return refY; }

	private String id;
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number markerHeight;
	public void setMarkerHeight(Number markerHeight) {
		this.markerHeight = markerHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarkerHeight(){ return markerHeight; }



	public HIAttributes() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.refX != null) {
			params.put("refX", this.refX);
		}
		if (this.markerWidth != null) {
			params.put("markerWidth", this.markerWidth);
		}
		if (this.refY != null) {
			params.put("refY", this.refY);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.markerHeight != null) {
			params.put("markerHeight", this.markerHeight);
		}
		return params;
	}

}