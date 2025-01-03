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
import com.highsoft.highcharts.common.HIColor;



public class HIBubbleLegend extends HIFoundation { 

	private HIColor borderColor;
	/**
 The color of the ranges borders, can be also defined for an individual range. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIColor connectorColor;
	/**
 The color of the connector, can be also defined for an individual range. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }

	private Number zIndex;
	/**
 Define the visual z index of the bubble legend. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String sizeBy;
	/**
 Whether the bubble legend range value should be represented by the area or the width of the bubble. The defaults, area, corresponds best to the human perception of the size of each bubble. 
 <br><br><b>defaults:</b><br><br>&ensp;area	*/
	public void setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSizeBy(){ return sizeBy; }

	private Number legendIndex;
	/**
 The position of the bubble legend in the legend. 
	*/
	public void setLegendIndex(Number legendIndex) {
		this.legendIndex = legendIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLegendIndex(){ return legendIndex; }

	private Number connectorWidth;
	/**
 The width of the connectors in pixels. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private HIColor color;
	/**
 The main color of the bubble legend. Applies to ranges, if individual color is not defined. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HILabels labels;
	/**
 Options for the bubble legend labels. 
	*/
	public void setLabels(HILabels labels) {
		this.labels = labels;
		this.labels.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabels getLabels(){ return labels; }

	private Boolean enabled;
	/**
 Enable or disable the bubble legend. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean sizeByAbsoluteValue;
	/**
 When this is true, the absolute value of z determines the size of the bubble. This means that with the defaults zThreshold of 0, a bubble of value -1 will have the same size as a bubble of value 1, while a bubble of value 0 will have a smaller size according to minSize. 
	*/
	public void setSizeByAbsoluteValue(Boolean sizeByAbsoluteValue) {
		this.sizeByAbsoluteValue = sizeByAbsoluteValue;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSizeByAbsoluteValue(){ return sizeByAbsoluteValue; }

	private String className;
	/**
 An additional class name to apply to the bubble legend' circle graphical elements. This option does not replace defaults class names of the graphical element. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private ArrayList <HIRanges> ranges;
	/**
 Options for specific range. One range consists of bubble, label and connector. 
	*/
	public void setRanges(ArrayList ranges) {
		this.ranges = ranges;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getRanges(){ return ranges; }

	private Number maxSize;
	/**
 Maximum bubble legend range size. If values for ranges are not specified, the `minSize` and the `maxSize` are calculated from bubble series. 
 <br><br><b>defaults:</b><br><br>&ensp;60	*/
	public void setMaxSize(Number maxSize) {
		this.maxSize = maxSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxSize(){ return maxSize; }

	private Number minSize;
	/**
 Minimum bubble legend range size. If values for ranges are not specified, the `minSize` and the `maxSize` are calculated from bubble series. 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setMinSize(Number minSize) {
		this.minSize = minSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinSize(){ return minSize; }

	private Number borderWidth;
	/**
 The width of the ranges borders in pixels, can be also defined for an individual range. 
 <br><br><b>defaults:</b><br><br>&ensp;2	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String connectorClassName;
	/**
 An additional class name to apply to the bubble legend's connector graphical elements. This option does not replace defaults class names of the graphical element. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setConnectorClassName(String connectorClassName) {
		this.connectorClassName = connectorClassName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorClassName(){ return connectorClassName; }

	private Number zThreshold;
	/**
 Ranges with lower value than zThreshold are skipped. 
	*/
	public void setZThreshold(Number zThreshold) {
		this.zThreshold = zThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZThreshold(){ return zThreshold; }

	private Number connectorDistance;
	/**
 The length of the connectors in pixels. If labels are centered, the distance is reduced to 0. 
 <br><br><b>defaults:</b><br><br>&ensp;60	*/
	public void setConnectorDistance(Number connectorDistance) {
		this.connectorDistance = connectorDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorDistance(){ return connectorDistance; }



	public HIBubbleLegend() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor.getData());
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.sizeBy != null) {
			params.put("sizeBy", this.sizeBy);
		}
		if (this.legendIndex != null) {
			params.put("legendIndex", this.legendIndex);
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.labels != null) {
			params.put("labels", this.labels.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.sizeByAbsoluteValue != null) {
			params.put("sizeByAbsoluteValue", this.sizeByAbsoluteValue);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.ranges != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.ranges) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("ranges", array);
		}
		if (this.maxSize != null) {
			params.put("maxSize", this.maxSize);
		}
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.connectorClassName != null) {
			params.put("connectorClassName", this.connectorClassName);
		}
		if (this.zThreshold != null) {
			params.put("zThreshold", this.zThreshold);
		}
		if (this.connectorDistance != null) {
			params.put("connectorDistance", this.connectorDistance);
		}
		return params;
	}

}