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
/** A venn series. If the type option is not specified, it is inherited from chart.type. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all venn series are defined in  `plotOptions.venn`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     venn: {       // shared options for all venn series     }   },   series: [{     // specific options for this series instance     type: 'venn'   }] });  
*/

public class HIVenn extends HISeries {
	private Boolean colorByPoint;
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private Number opacity;
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private String borderDashStyle;
	public void setBorderDashStyle(String borderDashStyle) {
		this.borderDashStyle = borderDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderDashStyle(){ return borderDashStyle; }

	private Number brighten;
	public void setBrighten(Number brighten) {
		this.brighten = brighten;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBrighten(){ return brighten; }



	public HIVenn() {
		super(); 
		this.setType("venn");
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
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.borderDashStyle != null) {
			params.put("borderDashStyle", this.borderDashStyle);
		}
		if (this.brighten != null) {
			params.put("brighten", this.brighten);
		}
		return params;
	}

}