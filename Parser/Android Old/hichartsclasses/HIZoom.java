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



public class HIZoom extends HIFoundation { 

	private String mapZoomIn;
	public void setMapZoomIn(String mapZoomIn) {
		this.mapZoomIn = mapZoomIn;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapZoomIn(){ return mapZoomIn; }

	private String resetZoomButton;
	public void setResetZoomButton(String resetZoomButton) {
		this.resetZoomButton = resetZoomButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getResetZoomButton(){ return resetZoomButton; }

	private String mapZoomOut;
	public void setMapZoomOut(String mapZoomOut) {
		this.mapZoomOut = mapZoomOut;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapZoomOut(){ return mapZoomOut; }



	public HIZoom() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.mapZoomIn != null) {
			params.put("mapZoomIn", this.mapZoomIn);
		}
		if (this.resetZoomButton != null) {
			params.put("resetZoomButton", this.resetZoomButton);
		}
		if (this.mapZoomOut != null) {
			params.put("mapZoomOut", this.mapZoomOut);
		}
		return params;
	}

}