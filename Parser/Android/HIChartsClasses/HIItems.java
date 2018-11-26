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





public class HIItems extends Observable implements HIChartsJSONSerializable { 

	private HICSSObject style;
/**
/** CSS styles for each label. To position the label, use left and top like this: style: {   left: '100px',   top: '100px' } 
*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String html;
/**
/** Inner HTML or text for the label. 
*/
	public void setHtml(String html) {
		this.html = html;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHtml(){ return html; }



	public HIItems() {

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
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.html != null) {
			params.put("html", this.html);
		}
		return params;
	}

}