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



public class HIColorVariation extends HIFoundation { 

	private Number to;
	/**
 The ending value of a color variation. The last sibling will receive this value. 
	*/
	public void setTo(Number to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTo(){ return to; }

	private String key;
	/**
 The key of a color variation. Currently supports brightness only. <br><br><b>accepted values:</b><br><br>&ensp;["brightness"]
	*/
	public void setKey(String key) {
		this.key = key;
		this.setChanged();
		this.notifyObservers();
	}

	public String getKey(){ return key; }



	public HIColorVariation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.key != null) {
			params.put("key", this.key);
		}
		return params;
	}

}