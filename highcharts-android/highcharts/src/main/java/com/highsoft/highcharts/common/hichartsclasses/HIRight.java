/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIRight extends HIFoundation { 

	private HIColor color;
	/**
 The color of the panel. 
 <br><br><b>defaults:</b><br><br>&ensp;transparent	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Object /* boolean, String */ visible;
	/**
 Whether to display the frame. Possible values are true, false, "auto" to display only the frames behind the data, and "default" to display faces behind the data based on the axis layout, ignoring the point of view. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter-frame/">Auto frames</a>
 <br><br><b>defaults:</b><br><br>&ensp;defaults	*/
	public void setVisible(Object /* boolean, String */ visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* boolean, String */ getVisible(){ return visible; }

	private Number size;
	/**
 The thickness of the panel. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setSize(Number size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSize(){ return size; }



	public HIRight() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}