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



public class HIGlobal extends HIFoundation { 

	private String VMLRadialGradientURL;
	/**
 Path to the pattern image required by VML browsers in order to draw radial gradients. 
	*/
	public void setVMLRadialGradientURL(String VMLRadialGradientURL) {
		this.VMLRadialGradientURL = VMLRadialGradientURL;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVMLRadialGradientURL(){ return VMLRadialGradientURL; }



	public HIGlobal() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.VMLRadialGradientURL != null) {
			params.put("VMLRadialGradientURL", this.VMLRadialGradientURL);
		}
		return params;
	}

}