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





public class HIAlignObject extends Observable implements HIChartsJSONSerializable { 

	private String align;
/**
/** Horizontal alignment. Can be one of `left`, `center` and `right`. 
*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean alignByTranslate;
/**
/** Use the `transform` attribute with translateX and translateY custom attributes to align this elements rather than `x` and `y` attributes. 
*/
	public void setAlignByTranslate(Boolean alignByTranslate) {
		this.alignByTranslate = alignByTranslate;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignByTranslate(){ return alignByTranslate; }

	private String verticalAlign;
/**
/** Vertical alignment. Can be one of `top`, `middle` and `bottom`. 
*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private Number x;
/**
/** Horizontal pixel offset from alignment. 
*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number y;
/**
/** Vertical pixel offset from alignment. 
*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }



	public HIAlignObject() {

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
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.alignByTranslate != null) {
			params.put("alignByTranslate", this.alignByTranslate);
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