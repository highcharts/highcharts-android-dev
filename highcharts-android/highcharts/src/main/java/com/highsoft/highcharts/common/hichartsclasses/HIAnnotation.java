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



public class HIAnnotation extends HIFoundation { 

	private HISVGElement group;
	/**
 The group svg element. 
	*/
	public void setGroup(HISVGElement group) {
		this.group = group;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getGroup(){ return group; }

	private HISVGElement labelsGroup;
	/**
 The group svg element of the annotation's labels. 
	*/
	public void setLabelsGroup(HISVGElement labelsGroup) {
		this.labelsGroup = labelsGroup;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getLabelsGroup(){ return labelsGroup; }

	private Object options;
	/**
 The options for the annotations. 
	*/
	public void setOptions(Object options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOptions(){ return options; }

	private HISVGElement shapesGroup;
	/**
 The group svg element of the annotation's shapes. 
	*/
	public void setShapesGroup(HISVGElement shapesGroup) {
		this.shapesGroup = shapesGroup;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getShapesGroup(){ return shapesGroup; }

	private Object userOptions;
	/**
 The user options for the annotations. 
	*/
	public void setUserOptions(Object userOptions) {
		this.userOptions = userOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getUserOptions(){ return userOptions; }



	public HIAnnotation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.group != null) {
			params.put("group", this.group.getParams());
		}
		if (this.labelsGroup != null) {
			params.put("labelsGroup", this.labelsGroup.getParams());
		}
		if (this.options != null) {
			params.put("options", this.options);
		}
		if (this.shapesGroup != null) {
			params.put("shapesGroup", this.shapesGroup.getParams());
		}
		if (this.userOptions != null) {
			params.put("userOptions", this.userOptions);
		}
		return params;
	}

}