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





public class HIStyle extends Observable implements HIChartsJSONSerializable { 

	private String color;
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private String fontWeight;
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontWeight(){ return fontWeight; }

	private String fontSize;
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontSize(){ return fontSize; }

	private String fontFamily;
	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontFamily(){ return fontFamily; }

	private Number borderRadius;
/**
/** Border radius of the focus border. 
 <br><br><b>defaults:</b><br><br>&ensp;3*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Number lineWidth;
/**
/** Line width of the focus border. 
 <br><br><b>defaults:</b><br><br>&ensp;2*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private String textOverflow;
	public void setTextOverflow(String textOverflow) {
		this.textOverflow = textOverflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextOverflow(){ return textOverflow; }

	private String whiteSpace;
	public void setWhiteSpace(String whiteSpace) {
		this.whiteSpace = whiteSpace;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWhiteSpace(){ return whiteSpace; }



	public HIStyle() {

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
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.fontFamily != null) {
			params.put("fontFamily", this.fontFamily);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.textOverflow != null) {
			params.put("textOverflow", this.textOverflow);
		}
		if (this.whiteSpace != null) {
			params.put("whiteSpace", this.whiteSpace);
		}
		return params;
	}

}