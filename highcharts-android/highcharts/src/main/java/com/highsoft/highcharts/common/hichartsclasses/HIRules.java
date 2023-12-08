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



public class HIRules extends HIFoundation { 

	private HICondition condition;
	/**
 Under which conditions the rule applies. 
	*/
	public void setCondition(HICondition condition) {
		this.condition = condition;
		this.condition.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HICondition getCondition(){ return condition; }

	private HashMap chartOptions;
	/**
 A full set of chart options to apply as overrides to the general chart options. The chart options are applied when the given rule is active. A special case is configuration objects that take arrays, for example `xAxis`, `yAxis` or `series`. For these collections, an `id` option is used to map the new option set to an existing object. If an existing object of the same id is not found, the item of the same indexupdated. So for example, setting `chartOptions` with two series items without an `id`, will cause the existing chart's two series to be updated with respective options. 
	*/
	public void setChartOptions(HashMap chartOptions) {
		this.chartOptions = chartOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getChartOptions(){ return chartOptions; }



	public HIRules() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.condition != null) {
			params.put("condition", this.condition.getParams());
		}
		if (this.chartOptions != null) {
			params.put("chartOptions", this.chartOptions);
		}
		return params;
	}

}