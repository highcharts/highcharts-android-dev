/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HILabelIntersectBoxObject extends Observable implements HIChartsJSONSerializable { 

	private Number bottom;
	public void setBottom(Number bottom) {
		this.bottom = bottom;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBottom(){ return bottom; }

	private Number left;
	public void setLeft(Number left) {
		this.left = left;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLeft(){ return left; }

	private Number right;
	public void setRight(Number right) {
		this.right = right;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRight(){ return right; }

	private Number top;
	public void setTop(Number top) {
		this.top = top;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTop(){ return top; }



	public HILabelIntersectBoxObject() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.bottom != null) {
			params.put("bottom", this.bottom);
		}
		if (this.left != null) {
			params.put("left", this.left);
		}
		if (this.right != null) {
			params.put("right", this.right);
		}
		if (this.top != null) {
			params.put("top", this.top);
		}
		return params;
	}

}