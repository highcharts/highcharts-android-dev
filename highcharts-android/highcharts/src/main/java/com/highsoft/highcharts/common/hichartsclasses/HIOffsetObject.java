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



public class HIOffsetObject extends HIFoundation { 

	private Number left;
	/**
 Left distance to the page border. 
	*/
	public void setLeft(Number left) {
		this.left = left;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLeft(){ return left; }

	private Number top;
	/**
 Top distance to the page border. 
	*/
	public void setTop(Number top) {
		this.top = top;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTop(){ return top; }



	public HIOffsetObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.left != null) {
			params.put("left", this.left);
		}
		if (this.top != null) {
			params.put("top", this.top);
		}
		return params;
	}

}