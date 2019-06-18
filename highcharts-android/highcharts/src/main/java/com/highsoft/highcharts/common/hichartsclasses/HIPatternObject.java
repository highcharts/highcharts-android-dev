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



public class HIPatternObject extends HIFoundation { 

	private HIAnimationOptionsObject animation;
	/**
 Animation options for the image pattern loading. 
	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private HIPatternOptionsObject pattern;
	/**
 Pattern options 
	*/
	public void setPattern(HIPatternOptionsObject pattern) {
		this.pattern = pattern;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPatternOptionsObject getPattern(){ return pattern; }



	public HIPatternObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.pattern != null) {
			params.put("pattern", this.pattern.getParams());
		}
		return params;
	}

}