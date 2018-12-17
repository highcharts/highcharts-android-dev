/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;
import com.highsoft.highcharts.common.HIColor;





public class HIBubbleLegend extends Observable implements HIChartsJSONSerializable { 

	private HIColor borderColor;
/**
/** The color of the ranges borders, can be also defined for an individual range. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/similartoseries/">Similat look to the bubble series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/bordercolor/">Individual bubble border color</a>
*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIColor connectorColor;
/**
/** The color of the connector, can be also defined for an individual range. 
*/
	public void setConnectorColor(HIColor connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getConnectorColor(){ return connectorColor; }

	private Number zIndex;
/**
/** Define the visual z index of the bubble legend. 
*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private String sizeBy;
/**
/** Whether the bubble legend range value should be represented by the area or the width of the bubble. The defaults, area, corresponds best to the human perception of the size of each bubble. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/ranges/">Size by width</a> <br><br><b>accepted values:</b><br><br>&ensp;["area", "width"]
*/
	public void setSizeBy(String sizeBy) {
		this.sizeBy = sizeBy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSizeBy(){ return sizeBy; }

	private Number legendIndex;
/**
/** The position of the bubble legend in the legend. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/connectorandlabels/">Bubble legend as last item in legend</a>
*/
	public void setLegendIndex(Number legendIndex) {
		this.legendIndex = legendIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLegendIndex(){ return legendIndex; }

	private Number connectorWidth;
/**
/** The width of the connectors in pixels. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/connectorandlabels/">Increased connector width</a>
*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private HIColor color;
/**
/** The main color of the bubble legend. Applies to ranges, if individual color is not defined. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/similartoseries/">Similat look to the bubble series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/color/">Individual bubble color</a>
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private HILabels labels;
/**
/** Options for the bubble legend labels. 
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
/** Enable or disable the bubble legend. 
*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean sizeByAbsoluteValue;
/**
/** When this is true, the absolute value of z determines the size of the bubble. This means that with the defaults zThreshold of 0, a bubble of value -1 will have the same size as a bubble of value 1, while a bubble of value 0 will have a smaller size according to minSize. 
*/
	public void setSizeByAbsoluteValue(Boolean sizeByAbsoluteValue) {
		this.sizeByAbsoluteValue = sizeByAbsoluteValue;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSizeByAbsoluteValue(){ return sizeByAbsoluteValue; }

	private String className;
/**
/** An additional class name to apply to the bubble legend' circle graphical elements. This option does not replace defaults class names of the graphical element. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/bubble-legend/">Styling by CSS</a>
*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private ArrayList <HIRanges> ranges;
/**
/** Options for specific range. One range consists of bubble, label and connector. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/ranges/">Manually defined ranges</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/autoranges/">Auto calculated ranges</a>
*/
	public void setRanges(ArrayList ranges) {
		this.ranges = ranges;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getRanges(){ return ranges; }

	private Number maxSize;
/**
/** Miximum bubble legend range size. If values for ranges are not specified, the minSize and the maxSize are calculated from bubble series. 
*/
	public void setMaxSize(Number maxSize) {
		this.maxSize = maxSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxSize(){ return maxSize; }

	private Number minSize;
/**
/** Minimum bubble legend range size. If values for ranges are not specified, the minSize and the maxSize are calculated from bubble series. 
*/
	public void setMinSize(Number minSize) {
		this.minSize = minSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinSize(){ return minSize; }

	private Number borderWidth;
/**
/** The width of the ranges borders in pixels, can be also defined for an individual range. 
*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String connectorClassName;
/**
/** An additional class name to apply to the bubble legend's connector graphical elements. This option does not replace defaults class names of the graphical element. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/bubble-legend/">Styling by CSS</a>
*/
	public void setConnectorClassName(String connectorClassName) {
		this.connectorClassName = connectorClassName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorClassName(){ return connectorClassName; }

	private Number zThreshold;
/**
/** Ranges with with lower value than zThreshold, are skipped. 
*/
	public void setZThreshold(Number zThreshold) {
		this.zThreshold = zThreshold;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZThreshold(){ return zThreshold; }

	private Number connectorDistance;
/**
/** The length of the connectors in pixels. If labels are centered, the distance is reduced to 0. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/connectorandlabels/">Increased connector length</a>
*/
	public void setConnectorDistance(Number connectorDistance) {
		this.connectorDistance = connectorDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorDistance(){ return connectorDistance; }



	public HIBubbleLegend() {

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
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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