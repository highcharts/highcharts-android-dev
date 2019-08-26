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



public class HIStyle extends HIFoundation { 

	private String fontWeight;
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontWeight(){ return fontWeight; }

	private String textOutline;
	public void setTextOutline(String textOutline) {
		this.textOutline = textOutline;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextOutline(){ return textOutline; }

	private String fontSize;
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontSize(){ return fontSize; }

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

	private String stroke;
	public void setStroke(String stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke(){ return stroke; }

	private Number stroke-width;
	public void setStroke-width(Number stroke-width) {
		this.stroke-width = stroke-width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStroke-width(){ return stroke-width; }

	private String fill;
	public void setFill(String fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFill(){ return fill; }



	public HIStyle() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.textOutline != null) {
			params.put("textOutline", this.textOutline);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.stroke-width != null) {
			params.put("stroke-width", this.stroke-width);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		return params;
	}

}