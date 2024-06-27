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



public class HIBreadcrumbsAlignOptions extends HIFoundation { 

	private Object align;
	/**
 Align of a Breadcrumb group. 
	*/
	public void setAlign(Object align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAlign(){ return align; }

	private Object verticalAlign;
	/**
 Vertical align of a Breadcrumb group. 
	*/
	public void setVerticalAlign(Object verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getVerticalAlign(){ return verticalAlign; }

	private Number x;
	/**
 X offset of a Breadcrumbs group. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number y;
	/**
 Y offset of a Breadcrumbs group. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }



	public HIBreadcrumbsAlignOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		return params;
	}

}