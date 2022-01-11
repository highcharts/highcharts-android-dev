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



public class HIChartPositionObject extends HIFoundation { 

	private Number left;
	public void setLeft(Number left) {
		this.left = left;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLeft(){ return left; }

	private Number scaleX;
	public void setScaleX(Number scaleX) {
		this.scaleX = scaleX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScaleX(){ return scaleX; }

	private Number scaleY;
	public void setScaleY(Number scaleY) {
		this.scaleY = scaleY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScaleY(){ return scaleY; }

	private Number top;
	public void setTop(Number top) {
		this.top = top;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTop(){ return top; }



	public HIChartPositionObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.left != null) {
			params.put("left", this.left);
		}
		if (this.scaleX != null) {
			params.put("scaleX", this.scaleX);
		}
		if (this.scaleY != null) {
			params.put("scaleY", this.scaleY);
		}
		if (this.top != null) {
			params.put("top", this.top);
		}
		return params;
	}

}