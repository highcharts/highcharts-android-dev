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



public class HIPointEventsOptionsObject extends HIFoundation { 

	private HIFunction select;
	/**
 Fires when the point is selected either programmatically or following a click on the point. One parameter, `event`, is passed to the function. Returning `false` cancels the operation. 
	*/
	public void setSelect(HIFunction select) {
		this.select = select;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSelect(){ return select; }

	private HIFunction unselect;
	/**
 Fires when the point is unselected either programmatically or following a click on the point. One parameter, `event`, is passed to the function. Returning `false` cancels the operation. 
	*/
	public void setUnselect(HIFunction unselect) {
		this.unselect = unselect;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getUnselect(){ return unselect; }



	public HIPointEventsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.select != null) {
			params.put("select", this.select);
		}
		if (this.unselect != null) {
			params.put("unselect", this.unselect);
		}
		return params;
	}

}