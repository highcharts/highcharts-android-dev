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



public class HITraverseUpButton extends HIFoundation { 

	private HIPosition position;
	/**
 The position of the button. 
	*/
	public void setPosition(HIPosition position) {
		this.position = position;
		this.position.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPosition getPosition(){ return position; }



	public HITraverseUpButton() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		return params;
	}

}