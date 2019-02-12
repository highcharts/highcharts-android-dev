/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HIHalo extends Observable implements HIChartsJSONSerializable { 

	private Number opacity;
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private HISVGAttributes attributes;
	public void setAttributes(HISVGAttributes attributes) {
		this.attributes = attributes;
		this.attributes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getAttributes(){ return attributes; }

	private Boolean enabled;
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number size;
	public void setSize(Number size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSize(){ return size; }



	public HIHalo() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.attributes != null) {
			params.put("attributes", this.attributes.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}