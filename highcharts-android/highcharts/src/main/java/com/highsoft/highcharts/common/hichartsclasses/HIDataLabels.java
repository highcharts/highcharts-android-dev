/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.HashMap;



public class HIDataLabels extends HIFoundation { 

	private String verticalAlign;
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private Boolean allowOverlap;
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private String borderColor;
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderColor(){ return borderColor; }

	private HIStyle style;
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private Number connectorWidth;
	/**
 The width of the line connecting the data label to the point. In styled mode, the connector stroke width is given in the .highcharts-data-label-connector class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/connector-styles">Custom connector width and color</a>
	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private Number borderRadius;
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private Boolean alternate;
	/**
 Whether to position data labels alternately. For example, if distance is set equal to 100, then data labels will be positioned alternately (on both sides of the point) at a distance of 100px. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-timeline/alternate-disabled">Alternate disabled</a>
	*/
	public void setAlternate(Boolean alternate) {
		this.alternate = alternate;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAlternate(){ return alternate; }

	private Boolean enabled;
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String color;
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private String connectorColor;
	/**
 The color of the line connecting the data label to the point. The defaults color is the same as the point's color. In styled mode, the connector stroke is given in the .highcharts-data-label-connector class. 
	*/
	public void setConnectorColor(String connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorColor(){ return connectorColor; }

	private Number borderWidth;
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String backgroundColor;
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackgroundColor(){ return backgroundColor; }

	private Boolean /* boolean */ shadow;
	/**
 Shadow options for the data label. 
	*/
	public void setShadow(Boolean /* boolean */ shadow) {
		this.shadow = shadow;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean /* boolean */ getShadow(){ return shadow; }

	private HIFunction formatter;
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Number distance;
	/**
 A pixel value defining the distance between the data label and the point. Negative numbers puts the label on top of the point. 
	*/
	public void setDistance(Number distance) {
		this.distance = distance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDistance(){ return distance; }

	private Object nodeFormatter;
	/**
 A callback for defining the format for _nodes_ in the organization chart. The nodeFormat option takes precedence over nodeFormatter. In an organization chart, the nodeFormatter is a quite complex function of the available options, striving for a good defaults layout of cards with or without images. In organization chart, the data labels come with useHTML set to true, meaning they will be rendered as true HTML above the SVG. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-organization/datalabels-nodeformatter">Modify the defaults label format output</a>
	*/
	public void setNodeFormatter(Object nodeFormatter) {
		this.nodeFormatter = nodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getNodeFormatter(){ return nodeFormatter; }

	private Boolean useHTML;
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private String align;
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private String overflow;
	public void setOverflow(String overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOverflow(){ return overflow; }

	private Boolean inside;
	public void setInside(Boolean inside) {
		this.inside = inside;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInside(){ return inside; }

	private Boolean crop;
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }



	public HIDataLabels() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.alternate != null) {
			params.put("alternate", this.alternate);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor);
		}
		if (this.shadow != null) {
			params.put("shadow", this.shadow);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.distance != null) {
			params.put("distance", this.distance);
		}
		if (this.nodeFormatter != null) {
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.inside != null) {
			params.put("inside", this.inside);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		return params;
	}

}