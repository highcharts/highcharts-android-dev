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



public class HITooltipPositionerPointObject extends HIFoundation { 

	private Boolean isHeader;
	/**
 If `tooltip.split` option is enabled and positioner is called for each of the boxes separately, this property indicates the call on the xAxis header, which is not a point itself. 
	*/
	public void setIsHeader(Boolean isHeader) {
		this.isHeader = isHeader;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsHeader(){ return isHeader; }

	private Number plotX;
	/**
 The reference point relative to the plot area. Add chart.plotLeft to get the full coordinates. 
	*/
	public void setPlotX(Number plotX) {
		this.plotX = plotX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPlotX(){ return plotX; }

	private Number plotY;
	/**
 The reference point relative to the plot area. Add chart.plotTop to get the full coordinates. 
	*/
	public void setPlotY(Number plotY) {
		this.plotY = plotY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPlotY(){ return plotY; }



	public HITooltipPositionerPointObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.isHeader != null) {
			params.put("isHeader", this.isHeader);
		}
		if (this.plotX != null) {
			params.put("plotX", this.plotX);
		}
		if (this.plotY != null) {
			params.put("plotY", this.plotY);
		}
		return params;
	}

}