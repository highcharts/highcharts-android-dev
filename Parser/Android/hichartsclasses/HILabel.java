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



public class HILabel extends HIFoundation { 

	private HICSSObject style;
	/**
 Styles for the series label. The color defaultss to the series color, or a contrast color if `onArea`. 
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Number minFontSize;
	/**
 For area-like series, allow the font size to vary so that small areas get a smaller font size. The defaults applies this effect to area-like series but not line-like series. 
	*/
	public void setMinFontSize(Number minFontSize) {
		this.minFontSize = minFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinFontSize(){ return minFontSize; }

	private String format;
	/**
 A format string for the label, with support for a subset of HTML. Variables are enclosed by curly brackets. Available variables are `name`, `options.xxx`, `color` and other members from the `series` object. Use this option also to set a static text for the label. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Number maxFontSize;
	/**
 For area-like series, allow the font size to vary so that small areas get a smaller font size. The defaults applies this effect to area-like series but not line-like series. 
	*/
	public void setMaxFontSize(Number maxFontSize) {
		this.maxFontSize = maxFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxFontSize(){ return maxFontSize; }

	private Boolean enabled;
	/**
 Enable the series label per series. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number connectorNeighbourDistance;
	/**
 If the label is closer than this to a neighbour graph, draw a connector. 
 <br><br><b>defaults:</b><br><br>&ensp;24	*/
	public void setConnectorNeighbourDistance(Number connectorNeighbourDistance) {
		this.connectorNeighbourDistance = connectorNeighbourDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorNeighbourDistance(){ return connectorNeighbourDistance; }

	private Boolean onArea;
	/**
 Draw the label on the area of an area series. By defaults it is drawn on the area. Set it to `false` to draw it next to the graph instead. 
	*/
	public void setOnArea(Boolean onArea) {
		this.onArea = onArea;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOnArea(){ return onArea; }

	private NSArray<HILabelIntersectBoxObject *> boxesToAvoid;
	/**
 An array of boxes to avoid when laying out the labels. Each item has a `left`, `right`, `top` and `bottom` property. 
	*/
	public void setBoxesToAvoid(NSArray<HILabelIntersectBoxObject *> boxesToAvoid) {
		this.boxesToAvoid = boxesToAvoid;
		this.setChanged();
		this.notifyObservers();
	}

	public NSArray<HILabelIntersectBoxObject *> getBoxesToAvoid(){ return boxesToAvoid; }

	private HIFunction formatter;
	/**
 Callback function to format each of the series' labels. The `this` keyword refers to the series object. By defaults the `formatter` is undefined and the `series.name` is rendered. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Boolean useHTML;
	/**
 Whether to use HTML to render the series label. 
	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private Boolean connectorAllowed;
	/**
 Allow labels to be placed distant to the graph if necessary, and draw a connector line to the graph. Setting this option to true may decrease the performance significantly, since the algorithm with systematically search for open spaces in the whole plot area. Visually, it may also result in a more cluttered chart, though more of the series will be labeled. 
	*/
	public void setConnectorAllowed(Boolean connectorAllowed) {
		this.connectorAllowed = connectorAllowed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getConnectorAllowed(){ return connectorAllowed; }

	private String verticalAlign;
	/**
 Vertical alignment of the label relative to the plot line. Can be one of "top", "middle" or "bottom". 
 <br><br><b>defaults:</b><br><br>&ensp;top	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String text;
	/**
 The text itself. A subset of HTML is supported. 
	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
	/**
 Horizontal alignment of the label. Can be one of "left", "center" or "right". 
 <br><br><b>defaults:</b><br><br>&ensp;left	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Number y;
	/**
 Vertical position of the text baseline relative to the alignment. Default varies by orientation. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 Horizontal position relative the alignment. Default varies by orientation. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number rotation;
	/**
 Rotation of the text label in degrees. Defaults to 0 for horizontal plot lines and 90 for vertical lines. 
	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private String textAlign;
	/**
 The text alignment for the label. While `align` determines where the texts anchor point is placed within the plot band, `textAlign` determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the `align` option. 
	*/
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextAlign(){ return textAlign; }

	private Boolean allowOverlap;
	/**
 Whether or not the label can be hidden if it overlaps with another label. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private Boolean inside;
	/**
 Wether or not the text of the label can exceed the width of the label. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setInside(Boolean inside) {
		this.inside = inside;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInside(){ return inside; }



	public HILabel() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.minFontSize != null) {
			params.put("minFontSize", this.minFontSize);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.maxFontSize != null) {
			params.put("maxFontSize", this.maxFontSize);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.connectorNeighbourDistance != null) {
			params.put("connectorNeighbourDistance", this.connectorNeighbourDistance);
		}
		if (this.onArea != null) {
			params.put("onArea", this.onArea);
		}
		if (this.boxesToAvoid != null) {
			params.put("boxesToAvoid", this.boxesToAvoid.getParams());
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.connectorAllowed != null) {
			params.put("connectorAllowed", this.connectorAllowed);
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.inside != null) {
			params.put("inside", this.inside);
		}
		return params;
	}

}