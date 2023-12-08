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



public class HIStackItemObject extends HIFoundation { 

	private HIAlignObject alignOptions;
	/**
 Alignment settings 
	*/
	public void setAlignOptions(HIAlignObject alignOptions) {
		this.alignOptions = alignOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAlignObject getAlignOptions(){ return alignOptions; }

	private HIAxis axis;
	/**
 Related axis 
	*/
	public void setAxis(HIAxis axis) {
		this.axis = axis;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAxis getAxis(){ return axis; }

	private Number cumulative;
	/**
 Cumulative value of the stacked data points 
	*/
	public void setCumulative(Number cumulative) {
		this.cumulative = cumulative;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getCumulative(){ return cumulative; }

	private Boolean isNegative;
	/**
 True if on the negative side 
	*/
	public void setIsNegative(Boolean isNegative) {
		this.isNegative = isNegative;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsNegative(){ return isNegative; }

	private HISVGElement label;
	/**
 Related SVG element 
	*/
	public void setLabel(HISVGElement label) {
		this.label = label;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getLabel(){ return label; }

	private Object options;
	/**
 Related stack options 
	*/
	public void setOptions(Object options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOptions(){ return options; }

	private Number total;
	/**
 Total value of the stacked data points 
	*/
	public void setTotal(Number total) {
		this.total = total;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTotal(){ return total; }

	private Number x;
	/**
 Shared x value of the stack 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }



	public HIStackItemObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.alignOptions != null) {
			params.put("alignOptions", this.alignOptions.getParams());
		}
		if (this.axis != null) {
			params.put("axis", this.axis.getParams());
		}
		if (this.cumulative != null) {
			params.put("cumulative", this.cumulative);
		}
		if (this.isNegative != null) {
			params.put("isNegative", this.isNegative);
		}
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.options != null) {
			params.put("options", this.options);
		}
		if (this.total != null) {
			params.put("total", this.total);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		return params;
	}

}