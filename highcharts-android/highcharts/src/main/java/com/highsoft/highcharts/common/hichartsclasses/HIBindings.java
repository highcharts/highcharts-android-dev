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



public class HIBindings extends HIFoundation { 

	private HINavigationBindingsOptionsObject rectangleAnnotation;
	/**
 A rectangle annotation bindings. Includes start and one event in steps array. 
	*/
	public void setRectangleAnnotation(HINavigationBindingsOptionsObject rectangleAnnotation) {
		this.rectangleAnnotation = rectangleAnnotation;
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigationBindingsOptionsObject getRectangleAnnotation(){ return rectangleAnnotation; }

	private HINavigationBindingsOptionsObject labelAnnotation;
	/**
 A label annotation bindings. Includes start event only. 
	*/
	public void setLabelAnnotation(HINavigationBindingsOptionsObject labelAnnotation) {
		this.labelAnnotation = labelAnnotation;
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigationBindingsOptionsObject getLabelAnnotation(){ return labelAnnotation; }

	private HINavigationBindingsOptionsObject circleAnnotation;
	/**
 A circle annotation bindings. Includes start and one event in steps array. 
	*/
	public void setCircleAnnotation(HINavigationBindingsOptionsObject circleAnnotation) {
		this.circleAnnotation = circleAnnotation;
		this.setChanged();
		this.notifyObservers();
	}

	public HINavigationBindingsOptionsObject getCircleAnnotation(){ return circleAnnotation; }



	public HIBindings() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.rectangleAnnotation != null) {
			params.put("rectangleAnnotation", this.rectangleAnnotation.getParams());
		}
		if (this.labelAnnotation != null) {
			params.put("labelAnnotation", this.labelAnnotation.getParams());
		}
		if (this.circleAnnotation != null) {
			params.put("circleAnnotation", this.circleAnnotation.getParams());
		}
		return params;
	}

}