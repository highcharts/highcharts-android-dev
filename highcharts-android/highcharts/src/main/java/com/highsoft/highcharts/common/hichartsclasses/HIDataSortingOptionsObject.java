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



public class HIDataSortingOptionsObject extends HIFoundation { 

	private Boolean enabled;
	/**
 Enable or disable data sorting for the series. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean matchByName;
	/**
 Whether to allow matching points by name in an update. 
	*/
	public void setMatchByName(Boolean matchByName) {
		this.matchByName = matchByName;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getMatchByName(){ return matchByName; }

	private String sortKey;
	/**
 Determines what data value should be used to sort by. 
	*/
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSortKey(){ return sortKey; }



	public HIDataSortingOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.matchByName != null) {
			params.put("matchByName", this.matchByName);
		}
		if (this.sortKey != null) {
			params.put("sortKey", this.sortKey);
		}
		return params;
	}

}