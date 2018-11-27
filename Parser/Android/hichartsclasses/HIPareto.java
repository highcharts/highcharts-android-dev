/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





/**
/** A pareto series. If the type option is not specified, it is inherited from chart.type. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all pareto series are defined in  `plotOptions.pareto`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     pareto: {       // shared options for all pareto series     }   },   series: [{     // specific options for this series instance     type: 'pareto'   }] });  
*/

public class HIPareto extends HISeries {
	private Object /* Number|String */ baseSeries;
/**
/** An integer identifying the index to use for the base series, or a string representing the id of the series. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined*/
	public void setBaseSeries(Object /* Number|String */ baseSeries) {
		this.baseSeries = baseSeries;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getBaseSeries(){ return baseSeries; }



	public HIPareto() {
		super(); 
		this.setType("pareto");
	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.baseSeries != null) {
			params.put("baseSeries", this.baseSeries);
		}
		return params;
	}

}