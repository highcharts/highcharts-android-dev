/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIPatternObject extends HIFoundation { 

	private Boolean animation;
	/**
 Animation options for the image pattern loading. 
	*/
	public void setAnimation(Boolean animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAnimation(){ return animation; }

	private Object pattern;
	/**
 Pattern options 
	*/
	public void setPattern(Object pattern) {
		this.pattern = pattern;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getPattern(){ return pattern; }



	public HIPatternObject() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.animation != null) {
			params.put("animation", this.animation);
		}
		if (this.pattern != null) {
			params.put("pattern", this.pattern);
		}
		return params;
	}

}