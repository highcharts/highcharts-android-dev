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





public class HIActiveDataLabelStyle extends Observable implements HIChartsJSONSerializable { 

	private String cursor;
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private String color;
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private String textDecoration;
	public void setTextDecoration(String textDecoration) {
		this.textDecoration = textDecoration;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextDecoration(){ return textDecoration; }

	private String fontWeight;
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontWeight(){ return fontWeight; }



	public HIActiveDataLabelStyle() {

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
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.textDecoration != null) {
			params.put("textDecoration", this.textDecoration);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		return params;
	}

}