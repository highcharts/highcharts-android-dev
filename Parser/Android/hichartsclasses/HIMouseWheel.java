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



public class HIMouseWheel extends HIFoundation { 

	private String type;
	/**
 Decides in what dimensions the user can zoom scrolling the wheel. Can be one of `x`, `y` or `xy`. If not specified here, it will inherit the type from `chart.zooming.type`. Note that particularly with mouse wheel in the y direction, the zoom is affected by the defaults `yAxis.startOnTick` and `endOnTick`) settings. In order to respect these settings, the zoom level will adjust after the user has stopped zooming. To prevent this, consider setting `startOnTick` and `endOnTick` to `false`. 
 <br><br><b>defaults:</b><br><br>&ensp;x	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Number sensitivity;
	/**
 Adjust the sensitivity of the zoom. Sensitivity of mouse wheel or trackpad scrolling. `1` is no sensitivity, while with `2`, one mouse wheel delta will zoom in `50%`. 
 <br><br><b>defaults:</b><br><br>&ensp;1.1	*/
	public void setSensitivity(Number sensitivity) {
		this.sensitivity = sensitivity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSensitivity(){ return sensitivity; }

	private Boolean enabled;
	/**
 Zooming with the mouse wheel can be disabled by setting this option to `false`. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }



	public HIMouseWheel() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.sensitivity != null) {
			params.put("sensitivity", this.sensitivity);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		return params;
	}

}