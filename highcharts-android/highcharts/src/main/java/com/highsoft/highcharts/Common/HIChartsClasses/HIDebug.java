/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HIDebug implements HIChartsJSONSerializable { 


/**
Time the building of the k-d tree.

This outputs the time spent building the k-d tree used for
markers etc.

Note that the k-d tree is built async, and runs post-rendering.
Following, it does not affect the performance of the rendering itself.
* default: false
*/
	public Boolean timeKDTree;

/**
Time the series processing.

This outputs the time spent on transforming the series data to
vertex buffers when set to true.
* default: false
*/
	public Boolean timeSeriesProcessing;

/**
Time the WebGL to SVG buffer copy

After rendering, the result is copied to an image which is injected
into the SVG.

If this property is set to true, the time it takes for the buffer copy
to complete is outputted.
* default: false
*/
	public Boolean timeBufferCopy;

/**
Time the the WebGL setup.

This outputs the time spent on setting up the WebGL context,
creating shaders, and textures.
* default: false
*/
	public Boolean timeSetup;

/**
Time the series rendering.

This outputs the time spent on actual rendering in the console when
set to true.
* default: false
*/
	public Boolean timeRendering;

/**
Show the number of points skipped through culling.

When set to true, the number of points skipped in series processing
is outputted. Points are skipped if they are closer than 1 pixel from
each other.
* default: false
*/
	public Boolean showSkipSummary;


	public HIDebug() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
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