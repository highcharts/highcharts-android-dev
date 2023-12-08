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



public class HIPointDragStartEventObject extends HIFoundation { 

	private String updateProp;
	/**
 Data property being dragged. 
	*/
	public void setUpdateProp(String updateProp) {
		this.updateProp = updateProp;
		this.setChanged();
		this.notifyObservers();
	}

	public String getUpdateProp(){ return updateProp; }



	public HIPointDragStartEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.updateProp != null) {
			params.put("updateProp", this.updateProp);
		}
		return params;
	}

}