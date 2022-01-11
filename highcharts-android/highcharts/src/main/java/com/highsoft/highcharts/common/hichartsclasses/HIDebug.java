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



public class HIDebug extends HIFoundation { 

	private Boolean timeKDTree;
	/**
 Time the building of the k-d tree. This outputs the time spent building the k-d tree used for markers etc. Note that the k-d tree is built async, and runs post-rendering. Following, it does not affect the performance of the rendering itself. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setTimeKDTree(Boolean timeKDTree) {
		this.timeKDTree = timeKDTree;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTimeKDTree(){ return timeKDTree; }

	private Boolean timeSeriesProcessing;
	/**
 Time the series processing. This outputs the time spent on transforming the series data to vertex buffers when set to true. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setTimeSeriesProcessing(Boolean timeSeriesProcessing) {
		this.timeSeriesProcessing = timeSeriesProcessing;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTimeSeriesProcessing(){ return timeSeriesProcessing; }

	private Boolean timeBufferCopy;
	/**
 Time the WebGL to SVG buffer copy After rendering, the result is copied to an image which is injected into the SVG. If this property is set to true, the time it takes for the buffer copy to complete is outputted. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setTimeBufferCopy(Boolean timeBufferCopy) {
		this.timeBufferCopy = timeBufferCopy;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTimeBufferCopy(){ return timeBufferCopy; }

	private Boolean timeSetup;
	/**
 Time the the WebGL setup. This outputs the time spent on setting up the WebGL context, creating shaders, and textures. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setTimeSetup(Boolean timeSetup) {
		this.timeSetup = timeSetup;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTimeSetup(){ return timeSetup; }

	private Boolean timeRendering;
	/**
 Time the series rendering. This outputs the time spent on actual rendering in the console when set to true. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setTimeRendering(Boolean timeRendering) {
		this.timeRendering = timeRendering;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getTimeRendering(){ return timeRendering; }

	private Boolean showSkipSummary;
	/**
 Show the number of points skipped through culling. When set to true, the number of points skipped in series processing is outputted. Points are skipped if they are closer than 1 pixel from each other. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setShowSkipSummary(Boolean showSkipSummary) {
		this.showSkipSummary = showSkipSummary;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowSkipSummary(){ return showSkipSummary; }



	public HIDebug() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.timeKDTree != null) {
			params.put("timeKDTree", this.timeKDTree);
		}
		if (this.timeSeriesProcessing != null) {
			params.put("timeSeriesProcessing", this.timeSeriesProcessing);
		}
		if (this.timeBufferCopy != null) {
			params.put("timeBufferCopy", this.timeBufferCopy);
		}
		if (this.timeSetup != null) {
			params.put("timeSetup", this.timeSetup);
		}
		if (this.timeRendering != null) {
			params.put("timeRendering", this.timeRendering);
		}
		if (this.showSkipSummary != null) {
			params.put("showSkipSummary", this.showSkipSummary);
		}
		return params;
	}

}