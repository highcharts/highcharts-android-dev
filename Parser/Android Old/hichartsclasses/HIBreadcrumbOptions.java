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



public class HIBreadcrumbOptions extends HIFoundation { 

	private Number level;
	/**
 Level connected to a specific breadcrumb. 
	*/
	public void setLevel(Number level) {
		this.level = level;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLevel(){ return level; }

	private Object levelOptions;
	/**
 Options for series or point connected to a specific breadcrumb. 
	*/
	public void setLevelOptions(Object levelOptions) {
		this.levelOptions = levelOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getLevelOptions(){ return levelOptions; }



	public HIBreadcrumbOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.level != null) {
			params.put("level", this.level);
		}
		if (this.levelOptions != null) {
			params.put("levelOptions", this.levelOptions);
		}
		return params;
	}

}