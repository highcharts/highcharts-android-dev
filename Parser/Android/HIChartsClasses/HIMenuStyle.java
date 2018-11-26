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





public class HIMenuStyle extends Observable implements HIChartsJSONSerializable { 

	private String padding;
	public void setPadding(String padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPadding(){ return padding; }

	private String border;
	public void setBorder(String border) {
		this.border = border;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorder(){ return border; }

	private String background;
	public void setBackground(String background) {
		this.background = background;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackground(){ return background; }



	public HIMenuStyle() {

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
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.border != null) {
			params.put("border", this.border);
		}
		if (this.background != null) {
			params.put("background", this.background);
		}
		return params;
	}

}