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



public class HIAxisPointBreakEventObject extends HIFoundation { 

	private HashMap brk;
	public void setBrk(HashMap brk) {
		this.brk = brk;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getBrk(){ return brk; }

	private HIPoint point;
	public void setPoint(HIPoint point) {
		this.point = point;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private HIFunction preventDefault;
	public void setPreventDefault(HIFunction preventDefault) {
		this.preventDefault = preventDefault;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getPreventDefault(){ return preventDefault; }

	private HISVGElement target;
	public void setTarget(HISVGElement target) {
		this.target = target;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getTarget(){ return target; }

	private String type;
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HIAxisPointBreakEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.brk != null) {
			params.put("brk", this.brk);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.preventDefault != null) {
			params.put("preventDefault", this.preventDefault);
		}
		if (this.target != null) {
			params.put("target", this.target.getParams());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}