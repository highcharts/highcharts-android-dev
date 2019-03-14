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



public class HICSSObject extends HIFoundation { 

	private String background;
	/**
 Background style for the element. 
	*/
	public void setBackground(String background) {
		this.background = background;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackground(){ return background; }

	private String backgroundColor;
	/**
 Background color of the element. 
	*/
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackgroundColor(){ return backgroundColor; }

	private String border;
	/**
 Border style for the element. 
	*/
	public void setBorder(String border) {
		this.border = border;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorder(){ return border; }

	private Number borderRadius;
	/**
 Radius of the element border. 
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private String color;
	/**
 Color used in the element. The "contrast" option is a Highcharts custom property that results in black or white, depending on the background of the element. 
	*/
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private String cursor;
	/**
 Style of the mouse cursor when resting over the element. 
	*/
	public void setCursor(String cursor) {
		this.cursor = cursor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCursor(){ return cursor; }

	private String fontFamily;
	/**
 Font family of the element text. Multiple values have to be in decreasing preference order and separated by comma. 
	*/
	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontFamily(){ return fontFamily; }

	private String fontSize;
	/**
 Font size of the element text. 
	*/
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontSize(){ return fontSize; }

	private String fontWeight;
	/**
 Font weight of the element text. 
	*/
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontWeight(){ return fontWeight; }

	private Number height;
	/**
 Height of the element. 
	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number lineWidth;
	/**
 Width of the element border. 
	*/
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLineWidth(){ return lineWidth; }

	private Number opacity;
	/**
 Opacity of the element. 
	*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private String padding;
	/**
 Space around the element content. 
	*/
	public void setPadding(String padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPadding(){ return padding; }

	private String pointerEvents;
	/**
 Behaviour of the element when the mouse cursor rests over it. 
	*/
	public void setPointerEvents(String pointerEvents) {
		this.pointerEvents = pointerEvents;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPointerEvents(){ return pointerEvents; }

	private String position;
	/**
 Positioning of the element. 
	*/
	public void setPosition(String position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition(){ return position; }

	private String textAlign;
	/**
 Alignment of the element text. 
	*/
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextAlign(){ return textAlign; }

	private String textDecoration;
	/**
 Additional decoration of the element text. 
	*/
	public void setTextDecoration(String textDecoration) {
		this.textDecoration = textDecoration;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextDecoration(){ return textDecoration; }

	private String textOutline;
	/**
 Outline style of the element text. 
	*/
	public void setTextOutline(String textOutline) {
		this.textOutline = textOutline;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextOutline(){ return textOutline; }

	private String textOverflow;
	/**
 Line break style of the element text. Highcharts SVG elements support `ellipsis` when a `width` is set. 
	*/
	public void setTextOverflow(String textOverflow) {
		this.textOverflow = textOverflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextOverflow(){ return textOverflow; }

	private String top;
	/**
 Top spacing of the element relative to the parent element. 
	*/
	public void setTop(String top) {
		this.top = top;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTop(){ return top; }

	private String transition;
	/**
 Animated transition of selected element properties. 
	*/
	public void setTransition(String transition) {
		this.transition = transition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTransition(){ return transition; }

	private String whiteSpace;
	/**
 Line break style of the element text. 
	*/
	public void setWhiteSpace(String whiteSpace) {
		this.whiteSpace = whiteSpace;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWhiteSpace(){ return whiteSpace; }

	private Number width;
	/**
 Width of the element. 
	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }



	public HICSSObject() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.background != null) {
			params.put("background", this.background);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor);
		}
		if (this.border != null) {
			params.put("border", this.border);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.cursor != null) {
			params.put("cursor", this.cursor);
		}
		if (this.fontFamily != null) {
			params.put("fontFamily", this.fontFamily);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.fontWeight != null) {
			params.put("fontWeight", this.fontWeight);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.lineWidth != null) {
			params.put("lineWidth", this.lineWidth);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.pointerEvents != null) {
			params.put("pointerEvents", this.pointerEvents);
		}
		if (this.position != null) {
			params.put("position", this.position);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.textDecoration != null) {
			params.put("textDecoration", this.textDecoration);
		}
		if (this.textOutline != null) {
			params.put("textOutline", this.textOutline);
		}
		if (this.textOverflow != null) {
			params.put("textOverflow", this.textOverflow);
		}
		if (this.top != null) {
			params.put("top", this.top);
		}
		if (this.transition != null) {
			params.put("transition", this.transition);
		}
		if (this.whiteSpace != null) {
			params.put("whiteSpace", this.whiteSpace);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		return params;
	}

}