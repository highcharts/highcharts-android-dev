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



public class HIRotation extends HIFoundation { 

	private Number to;
	/**
 The largest degree of rotation for a word. 
	*/
	public void setTo(Number to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTo(){ return to; }

	private Number from;
	/**
 The smallest degree of rotation for a word. 
	*/
	public void setFrom(Number from) {
		this.from = from;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFrom(){ return from; }

	private Number orientations;
	/**
 The number of possible orientations for a word, within the range of rotation.from and rotation.to. 
	*/
	public void setOrientations(Number orientations) {
		this.orientations = orientations;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOrientations(){ return orientations; }



	public HIRotation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.orientations != null) {
			params.put("orientations", this.orientations);
		}
		return params;
	}

}