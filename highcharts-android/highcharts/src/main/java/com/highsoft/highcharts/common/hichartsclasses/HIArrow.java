/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.ArrayList;
import java.util.HashMap;



public class HIArrow extends HIFoundation { 

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

	private Boolean render;
	public void setRender(Boolean render) {
		this.render = render;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRender(){ return render; }

	private String id;
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private String tagName;
	public void setTagName(String tagName) {
		this.tagName = tagName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTagName(){ return tagName; }

	private Number markerWidth;
	public void setMarkerWidth(Number markerWidth) {
		this.markerWidth = markerWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarkerWidth(){ return markerWidth; }

	private ArrayList children;
	public void setChildren(ArrayList children) {
		this.children = children;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getChildren(){ return children; }

	private Number markerHeight;
	public void setMarkerHeight(Number markerHeight) {
		this.markerHeight = markerHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMarkerHeight(){ return markerHeight; }



	public HIArrow() {

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
		if (this.render != null) {
			params.put("render", this.render);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.tagName != null) {
			params.put("tagName", this.tagName);
		}
		if (this.markerWidth != null) {
			params.put("markerWidth", this.markerWidth);
		}
		if (this.children != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.children) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("children", array);
		}
		if (this.markerHeight != null) {
			params.put("markerHeight", this.markerHeight);
		}
		return params;
	}

}