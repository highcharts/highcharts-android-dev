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



public class HIDataSorting extends HIFoundation { 

	private Boolean matchByName;
	/**
 Whether to allow matching points by name in an update. If this option is disabled, points will be matched by order. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/match-by-name/">Enabled match by name</a>
	*/
	public void setMatchByName(Boolean matchByName) {
		this.matchByName = matchByName;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getMatchByName(){ return matchByName; }

	private Boolean enabled;
	/**
 Enable or disable data sorting for the series. Use xAxis.reversed to change the sorting order. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/animation/">Data sorting in scatter-3d</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/labels-animation/">Axis labels animation</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/dependent-sorting/">Dependent series sorting</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/independent-sorting/">Independent series sorting</a>
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String sortKey;
	/**
 Determines what data value should be used to sort by. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/datasorting/sort-key/">Sort key as `z` value</a>
 <br><br><b>defaults:</b><br><br>&ensp;y	*/
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSortKey(){ return sortKey; }



	public HIDataSorting() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.matchByName != null) {
			params.put("matchByName", this.matchByName);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.sortKey != null) {
			params.put("sortKey", this.sortKey);
		}
		return params;
	}

}