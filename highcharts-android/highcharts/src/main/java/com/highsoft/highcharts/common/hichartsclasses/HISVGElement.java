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



public class HISVGElement extends HIFoundation { 

	private Object element;
	/**
 The primary DOM node. Each `SVGElement` instance wraps a main DOM node, but may also represent more nodes. 
	*/
	public void setElement(Object element) {
		this.element = element;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getElement(){ return element; }

	private HISVGRenderer renderer;
	/**
 The renderer that the SVGElement belongs to. 
	*/
	public void setRenderer(HISVGRenderer renderer) {
		this.renderer = renderer;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGRenderer getRenderer(){ return renderer; }



	public HISVGElement() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.element != null) {
			params.put("element", this.element);
		}
		if (this.renderer != null) {
			params.put("renderer", this.renderer.getParams());
		}
		return params;
	}

}