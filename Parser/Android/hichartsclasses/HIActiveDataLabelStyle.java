/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIActiveDataLabelStyle extends HIFoundation { 

	private String color;
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private String cursor;
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

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

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
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