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





public class HIBindings extends Observable implements HIChartsJSONSerializable { 

	private HIStockToolsBindingsObject rectangleAnnotation;
/**
/** A rectangle annotation bindings. Includes start and one event in steps array. 
*/
	public void setRectangleAnnotation(HIStockToolsBindingsObject rectangleAnnotation) {
		this.rectangleAnnotation = rectangleAnnotation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIStockToolsBindingsObject getRectangleAnnotation(){ return rectangleAnnotation; }

	private HIStockToolsBindingsObject labelAnnotation;
/**
/** A label annotation bindings. Includes start event only. 
*/
	public void setLabelAnnotation(HIStockToolsBindingsObject labelAnnotation) {
		this.labelAnnotation = labelAnnotation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIStockToolsBindingsObject getLabelAnnotation(){ return labelAnnotation; }

	private HIStockToolsBindingsObject circleAnnotation;
/**
/** A circle annotation bindings. Includes start and one event in steps array. 
*/
	public void setCircleAnnotation(HIStockToolsBindingsObject circleAnnotation) {
		this.circleAnnotation = circleAnnotation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIStockToolsBindingsObject getCircleAnnotation(){ return circleAnnotation; }



	public HIBindings() {

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