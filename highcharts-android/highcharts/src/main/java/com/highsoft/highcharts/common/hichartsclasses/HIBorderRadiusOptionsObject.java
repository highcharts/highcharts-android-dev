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



public class HIBorderRadiusOptionsObject extends HIFoundation { 

	private Object /* String, Number */ radius;
	/**
 The border radius. A number signifies pixels. A percentage string, like for example `50%`, signifies a relative size. For columns this is relative to the column width, for pies it is relative to the radius and the inner radius. 
	*/
	public void setRadius(Object /* String, Number */ radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* String, Number */ getRadius(){ return radius; }

	private String scope;
	/**
 The scope of the rounding for column charts. In a stacked column chart, the value `point` means each single point will get rounded corners. The value `stack` means the rounding will apply to the full stack, so that only points close to the top or bottom will receive rounding. 
	*/
	public void setScope(String scope) {
		this.scope = scope;
		this.setChanged();
		this.notifyObservers();
	}

	public String getScope(){ return scope; }

	private String where;
	/**
 For column charts, where in the point or stack to apply rounding. The `end` value means only those corners at the point value will be rounded, leaving the corners at the base or threshold unrounded. This is the most intuitive behaviour. The `all` value means also the base will be rounded. 
	*/
	public void setWhere(String where) {
		this.where = where;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWhere(){ return where; }



	public HIBorderRadiusOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.scope != null) {
			params.put("scope", this.scope);
		}
		if (this.where != null) {
			params.put("where", this.where);
		}
		return params;
	}

}