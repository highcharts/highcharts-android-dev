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

	private Map chartOptions;
	/**
 A full set of chart options to apply as overrides to the general chart options. The chart options are applied when the given rule is active. A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections, an id option is used to map the new option set to an existing object. If an existing object of the same id is not found, the item of the same indexupdated. So for example, setting chartOptions with two series items without an id, will cause the existing chart's two series to be updated with respective options. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/legend/">Legend</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/classname/">Class name</a>
	*/
	public void setChartOptions(Map chartOptions) {
		this.chartOptions = chartOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Map getChartOptions(){ return chartOptions; }



	public HIRules() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.condition != null) {
			params.put("condition", this.condition.getParams());
		}
		if (this.chartOptions != null) {
			params.put("chartOptions", this.chartOptions);
		}
		return params;
	}

}