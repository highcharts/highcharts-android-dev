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
/** A polygon series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all polygon series are defined in  `plotOptions.polygon`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     polygon: {       // shared options for all polygon series     }   },   series: [{     // specific options for this series instance     type: 'polygon'   }] }); `       
*/

public class HIPolygon extends HISeries {
	private Boolean trackByArea;
	public void setTrackByArea(Boolean trackByArea) {
		this.trackByArea = trackByArea;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTrackByArea(){ return trackByArea; }



	public HIPolygon() {
		super(); 
		this.setType("polygon");
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
		if (this.trackByArea != null) {
			params.put("trackByArea", this.trackByArea);
		}
		return params;
	}

}