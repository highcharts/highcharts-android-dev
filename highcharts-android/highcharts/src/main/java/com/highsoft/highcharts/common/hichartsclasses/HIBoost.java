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
 The chart will be boosted, if one of the series crosses its threshold and all the series in the chart can be boosted. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAllowForce(Boolean allowForce) {
		this.allowForce = allowForce;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowForce(){ return allowForce; }

	private Number pixelRatio;
	/**
 The pixel ratio for the WebGL content. If 0, the `window.devicePixelRatio` is used. This ensures sharp graphics on high DPI displays like Apple's Retina, as well as when a page is zoomed. The defaults is left at 1 for now, as this is a new feature that has the potential to break existing setups. Over time, when it has been battle tested, the intention is to set it to 0 by defaults. Another use case for this option is to set it to 2 in order to make exported and upscaled charts render sharp. One limitation when using the `pixelRatio` is that the line width of graphs is scaled down. Since the Boost module currently can only render 1px line widths, it is scaled down to a thin 0.5 pixels on a Retina display. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setPixelRatio(Number pixelRatio) {
		this.pixelRatio = pixelRatio;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPixelRatio(){ return pixelRatio; }

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
 Set the series threshold for when the boost should kick in globally. Setting to e.g. 20 will cause the whole chart to enter boost mode if there are 20 or more series active. When the chart is in boost mode, every series in it will be rendered to a common canvas. This offers a significant speed improvement in charts with a very high amount of series. 
 <br><br><b>defaults:</b><br><br>&ensp;50	*/
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
 Enable or disable GPU translations. GPU translations are faster than doing the translation in JavaScript. This option may cause rendering issues with certain datasets. Namely, if your dataset has large numbers with small increments (such as timestamps), it won't work correctly. This is due to floating point precision. 
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
		if (this.pixelRatio != null) {
			params.put("pixelRatio", this.pixelRatio);
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