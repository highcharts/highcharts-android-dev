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





public class HIStockToolsBindingsObject extends Observable implements HIChartsJSONSerializable { 

	private String className;
/**
/** ClassName of the element for a binding. 
*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIFunction end;
/**
/** Last event to be fired after last step event. 
*/
	public void setEnd(HIFunction end) {
		this.end = end;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getEnd(){ return end; }

	private HIFunction init;
/**
/** Initial event, fired on a button click. 
*/
	public void setInit(HIFunction init) {
		this.init = init;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getInit(){ return init; }

	private HIFunction start;
/**
/** Event fired on first click on a chart. 
*/
	public void setStart(HIFunction start) {
		this.start = start;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getStart(){ return start; }

	private ArrayList<HIFunction> steps;
/**
/** Last event to be fired after last step event. Array of step events to be called sequentially after each user click. 
*/
	public void setSteps(ArrayList<HIFunction> steps) {
		this.steps = steps;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIFunction> getSteps(){ return steps; }



	public HIStockToolsBindingsObject() {

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
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.end != null) {
			params.put("end", this.end);
		}
		if (this.init != null) {
			params.put("init", this.init);
		}
		if (this.start != null) {
			params.put("start", this.start);
		}
		if (this.steps != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.steps) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("steps", array);
		}
		return params;
	}

}