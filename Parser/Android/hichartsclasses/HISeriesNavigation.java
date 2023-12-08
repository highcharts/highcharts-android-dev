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



public class HISeriesNavigation extends HIFoundation { 

	private Boolean rememberPointFocus;
	/**
 Remember which point was focused even after navigating away from the series, so that when navigating back to the series you start at the last focused point. 
	*/
	public void setRememberPointFocus(Boolean rememberPointFocus) {
		this.rememberPointFocus = rememberPointFocus;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRememberPointFocus(){ return rememberPointFocus; }

	private Boolean skipNullPoints;
	/**
 Skip null points when navigating through points with the keyboard. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setSkipNullPoints(Boolean skipNullPoints) {
		this.skipNullPoints = skipNullPoints;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkipNullPoints(){ return skipNullPoints; }

	private String mode;
	/**
 Set the keyboard navigation mode for the chart. Can be "normal" or "serialize". In normal mode, left/right arrow keys move between points in a series, while up/down arrow keys move between series. Up/down navigation acts intelligently to figure out which series makes sense to move to from any given point. In "serialize" mode, points are instead navigated as a single list. Left/right behaves as in "normal" mode. Up/down arrow keys will behave like left/right. This can be useful for unifying navigation behavior with/without screen readers enabled. 
 <br><br><b>defaults:</b><br><br>&ensp;normal	*/
	public void setMode(String mode) {
		this.mode = mode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMode(){ return mode; }

	private Number pointNavigationEnabledThreshold;
	/**
 When a series contains more points than this, we no longer allow keyboard navigation for it. Set to `false` to disable. 
	*/
	public void setPointNavigationEnabledThreshold(Number pointNavigationEnabledThreshold) {
		this.pointNavigationEnabledThreshold = pointNavigationEnabledThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointNavigationEnabledThreshold(){ return pointNavigationEnabledThreshold; }



	public HISeriesNavigation() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.rememberPointFocus != null) {
			params.put("rememberPointFocus", this.rememberPointFocus);
		}
		if (this.skipNullPoints != null) {
			params.put("skipNullPoints", this.skipNullPoints);
		}
		if (this.mode != null) {
			params.put("mode", this.mode);
		}
		if (this.pointNavigationEnabledThreshold != null) {
			params.put("pointNavigationEnabledThreshold", this.pointNavigationEnabledThreshold);
		}
		return params;
	}

}