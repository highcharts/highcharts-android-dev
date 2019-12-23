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

	private Number patternIndex;
	/**
 Optionally an index referencing which pattern to use. Highcharts adds 10 defaults patterns to the `Highcharts.patterns` array. Additional pattern definitions can be pushed to this array if desired. This option is an index into this array. 
	*/
	public void setPatternIndex(Number patternIndex) {
		this.patternIndex = patternIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPatternIndex(){ return patternIndex; }



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
		if (this.patternIndex != null) {
			params.put("patternIndex", this.patternIndex);
		}
		return params;
	}

}