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



public class HIStyle extends HIFoundation { 

	private String transition;
	public void setTransition(String transition) {
		this.transition = transition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTransition(){ return transition; }

	private String fontWeight;
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontWeight(){ return fontWeight; }

	private Number fontSize;
	public void setFontSize(Number fontSize) {
		this.fontSize = fontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getFontSize(){ return fontSize; }

	private String color;
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private Number textOutline;
	public void setTextOutline(Number textOutline) {
		this.textOutline = textOutline;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTextOutline(){ return textOutline; }

	private String cursor;
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

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

	private Number borderRadius;
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Number lineWidth;
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private String stroke;
	public void setStroke(String stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke(){ return stroke; }

	private Number strokeWidth;
	public void setStrokeWidth(Number strokeWidth) {
		this.strokeWidth = strokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStrokeWidth(){ return strokeWidth; }

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
		if (this.transition != null) {
			params.put("transition", this.transition);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.textOutline != null) {
			params.put("textOutline", this.textOutline);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.textOverflow != null) {
			params.put("textOverflow", this.textOverflow);
		}
		if (this.whiteSpace != null) {
			params.put("whiteSpace", this.whiteSpace);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.strokeWidth != null) {
			params.put("stroke-width", this.strokeWidth);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		return params;
	}

}