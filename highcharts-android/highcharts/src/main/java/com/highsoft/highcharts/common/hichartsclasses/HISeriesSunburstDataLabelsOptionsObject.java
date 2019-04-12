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



public class HISeriesSunburstDataLabelsOptionsObject extends HIFoundation { 

	private Object align;
	public void setAlign(Object align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAlign(){ return align; }

	private Object allowOverlap;
	public void setAllowOverlap(Object allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getAllowOverlap(){ return allowOverlap; }

	private String rotationMode;
	/**
 Decides how the data label will be rotated relative to the perimeter of the sunburst. Valid values are `auto`, `parallel` and `perpendicular`. When `auto`, the best fit will be computed for the point. The `series.rotation` option takes precedence over `rotationMode`. 
	*/
	public void setRotationMode(String rotationMode) {
		this.rotationMode = rotationMode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRotationMode(){ return rotationMode; }



	public HISeriesSunburstDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.rotationMode != null) {
			params.put("rotationMode", this.rotationMode);
		}
		return params;
	}

}