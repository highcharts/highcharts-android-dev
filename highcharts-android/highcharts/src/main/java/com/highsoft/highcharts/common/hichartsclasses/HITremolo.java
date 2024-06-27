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



public class HITremolo extends HIFoundation { 

	private HIDepth depth;
	/**
 Map to tremolo depth, from 0 to 1. This determines the intensity of the tremolo effect, how much the volume changes. 
	*/
	public void setDepth(HIDepth depth) {
		this.depth = depth;
		this.depth.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDepth getDepth(){ return depth; }

	private HISpeed speed;
	/**
 Map to tremolo speed, from 0 to 1. This determines the speed of the tremolo effect, how fast the volume changes. 
	*/
	public void setSpeed(HISpeed speed) {
		this.speed = speed;
		this.speed.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISpeed getSpeed(){ return speed; }



	public HITremolo() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.depth != null) {
			params.put("depth", this.depth.getParams());
		}
		if (this.speed != null) {
			params.put("speed", this.speed.getParams());
		}
		return params;
	}

}