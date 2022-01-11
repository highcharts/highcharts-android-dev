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



public class HIChartIsInsideOptionsObject extends HIFoundation { 

	private Boolean ignoreX;
	public void setIgnoreX(Boolean ignoreX) {
		this.ignoreX = ignoreX;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreX(){ return ignoreX; }

	private Boolean ignoreY;
	public void setIgnoreY(Boolean ignoreY) {
		this.ignoreY = ignoreY;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreY(){ return ignoreY; }

	private Boolean inverted;
	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInverted(){ return inverted; }

	private Boolean paneCoordinates;
	public void setPaneCoordinates(Boolean paneCoordinates) {
		this.paneCoordinates = paneCoordinates;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getPaneCoordinates(){ return paneCoordinates; }

	private HISeries series;
	public void setSeries(HISeries series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private Boolean visiblePlotOnly;
	public void setVisiblePlotOnly(Boolean visiblePlotOnly) {
		this.visiblePlotOnly = visiblePlotOnly;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisiblePlotOnly(){ return visiblePlotOnly; }



	public HIChartIsInsideOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.ignoreX != null) {
			params.put("ignoreX", this.ignoreX);
		}
		if (this.ignoreY != null) {
			params.put("ignoreY", this.ignoreY);
		}
		if (this.inverted != null) {
			params.put("inverted", this.inverted);
		}
		if (this.paneCoordinates != null) {
			params.put("paneCoordinates", this.paneCoordinates);
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.visiblePlotOnly != null) {
			params.put("visiblePlotOnly", this.visiblePlotOnly);
		}
		return params;
	}

}