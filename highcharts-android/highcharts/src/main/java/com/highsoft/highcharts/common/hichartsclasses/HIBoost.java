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



public class HIBoost extends HIFoundation { 

	private Boolean allowForce;
	/**
 If set to true, the whole chart will be boosted if one of the series crosses its threshold, and all the series can be boosted. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAllowForce(Boolean allowForce) {
		this.allowForce = allowForce;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowForce(){ return allowForce; }

	private Boolean enabled;
	/**
 Enable or disable boost on a chart. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number seriesThreshold;
	/**
 Set the series threshold for when the boost should kick in globally. Setting to e.g. 20 will cause the whole chart to enter boost mode if there are 20 or more series active. When the chart is in boost mode, every series in it will be rendered to a common canvas. This offers a significant speed improvment in charts with a very high amount of series. 
 <br><br><b>defaults:</b><br><br>&ensp;null	*/
	public void setSeriesThreshold(Number seriesThreshold) {
		this.seriesThreshold = seriesThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSeriesThreshold(){ return seriesThreshold; }

	private Boolean usePreallocated;
	/**
 Enable or disable pre-allocation of vertex buffers. Enabling this will make it so that the binary data arrays required for storing the series data will be allocated prior to transforming the data to a WebGL-compatible format. This saves a copy operation on the order of O(n) and so is significantly more performant. However, this is currently an experimental option, and may cause visual artifacts with some datasets. As such, care should be taken when using this setting to make sure that it doesn't cause any rendering glitches with the given use-case. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUsePreallocated(Boolean usePreallocated) {
		this.usePreallocated = usePreallocated;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUsePreallocated(){ return usePreallocated; }

	private Boolean useGPUTranslations;
	/**
 Enable or disable GPU translations. GPU translations are faster than doing the translation in JavaScript. This option may cause rendering issues with certain datasets. Namely, if your dataset has large numbers with small increments (such as timestamps), it won't work correctly. This is due to floating point precission. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseGPUTranslations(Boolean useGPUTranslations) {
		this.useGPUTranslations = useGPUTranslations;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseGPUTranslations(){ return useGPUTranslations; }

	private HIDebug debug;
	/**
 Debugging options for boost. Useful for benchmarking, and general timing. 
	*/
	public void setDebug(HIDebug debug) {
		this.debug = debug;
		this.debug.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDebug getDebug(){ return debug; }



	public HIBoost() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.allowForce != null) {
			params.put("allowForce", this.allowForce);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.seriesThreshold != null) {
			params.put("seriesThreshold", this.seriesThreshold);
		}
		if (this.usePreallocated != null) {
			params.put("usePreallocated", this.usePreallocated);
		}
		if (this.useGPUTranslations != null) {
			params.put("useGPUTranslations", this.useGPUTranslations);
		}
		if (this.debug != null) {
			params.put("debug", this.debug.getParams());
		}
		return params;
	}

}