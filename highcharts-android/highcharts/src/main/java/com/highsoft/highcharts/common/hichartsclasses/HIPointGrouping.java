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



public class HIPointGrouping extends HIFoundation { 

	private Number groupTimespan;
	/**
 The size of each group in milliseconds. Audio events closer than this are grouped together. 
 <br><br><b>defaults:</b><br><br>&ensp;15	*/
	public void setGroupTimespan(Number groupTimespan) {
		this.groupTimespan = groupTimespan;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupTimespan(){ return groupTimespan; }

	private Boolean enabled;
	/**
 Whether or not to group points 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String algorithm;
	/**
 The grouping algorithm, deciding which points to keep when grouping a set of points together. By defaults `"minmax"` is used, which keeps both the minimum and maximum points. The other algorithms will either keep the first point in the group (time wise), last point, middle point, or both the first and the last point. The timing of the resulting point(s) is then adjusted to play evenly, regardless of its original position within the group. 
 <br><br><b>defaults:</b><br><br>&ensp;minmax	*/
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlgorithm(){ return algorithm; }

	private String prop;
	/**
 The data property for each point to compare when deciding which points to keep in the group. By defaults it is "y", which means that if the `"minmax"` algorithm is used, the two points the group with the lowest and highest `y` value will be kept, and the others not played. 
 <br><br><b>defaults:</b><br><br>&ensp;y	*/
	public void setProp(String prop) {
		this.prop = prop;
		this.setChanged();
		this.notifyObservers();
	}

	public String getProp(){ return prop; }



	public HIPointGrouping() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.groupTimespan != null) {
			params.put("groupTimespan", this.groupTimespan);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.algorithm != null) {
			params.put("algorithm", this.algorithm);
		}
		if (this.prop != null) {
			params.put("prop", this.prop);
		}
		return params;
	}

}