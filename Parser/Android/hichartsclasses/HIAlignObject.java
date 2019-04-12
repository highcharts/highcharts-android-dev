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



public class HIAlignObject extends HIFoundation { 

	private String align;
	/**
 Horizontal alignment. Can be one of `left`, `center` and `right`. 
	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean alignByTranslate;
	/**
 Use the `transform` attribute with translateX and translateY custom attributes to align this elements rather than `x` and `y` attributes. 
	*/
	public void setAlignByTranslate(Boolean alignByTranslate) {
		this.alignByTranslate = alignByTranslate;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlignByTranslate(){ return alignByTranslate; }

	private String verticalAlign;
	/**
 Vertical alignment. Can be one of `top`, `middle` and `bottom`. 
	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private Number x;
	/**
 Horizontal pixel offset from alignment. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number y;
	/**
 Vertical pixel offset from alignment. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }



	public HIAlignObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
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