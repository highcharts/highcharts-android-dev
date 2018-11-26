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
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;





public class HITheme extends Observable implements HIChartsJSONSerializable { 

	private Number zIndex;
/**
/** The Z index for the reset zoom button. The defaults value places it below the tooltip that has Z index 7. 
*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private Number padding;
	public void setPadding(Number padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPadding(){ return padding; }

	private String stroke;
	public void setStroke(String stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke(){ return stroke; }

	private String fill;
/**
/** The defaults fill exists only to capture hover events. 
*/
	public void setFill(String fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFill(){ return fill; }



	public HITheme() {

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
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		return params;
	}

}