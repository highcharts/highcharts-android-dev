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



public class HIPoint extends HIFoundation { 

	private HIEvents events;
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private String category;
	/**
 For categorized axes this property holds the category name for the point. For other axes it holds the X value. 
	*/
	public void setCategory(String category) {
		this.category = category;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCategory(){ return category; }

	private Object color;
	/**
 The point's current color. 
	*/
	public void setColor(Object color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getColor(){ return color; }

	private Number colorIndex;
	/**
 The point's current color index, used in styled mode instead of `color`. The color index is inserted in class names used for styling. 
	*/
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorIndex(){ return colorIndex; }

	private HIDataGroupingInfoObject dataGroup;
	/**
 Highcharts Stock only. If a point object is created by data grouping, it doesn't reflect actual points in the raw data. In this case, the `dataGroup` property holds information that points back to the raw data. - `dataGroup.start` is the index of the first raw data point in the group. - `dataGroup.length` is the amount of points in the group. 
	*/
	public void setDataGroup(HIDataGroupingInfoObject dataGroup) {
		this.dataGroup = dataGroup;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataGroupingInfoObject getDataGroup(){ return dataGroup; }

	private Number high;
	/**
 Range series only. The high or maximum value for each data point. 
	*/
	public void setHigh(Number high) {
		this.high = high;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHigh(){ return high; }

	private Number index;
	/**
 Contains the point's index in the `Series.points` array. 
	*/
	public void setIndex(Number index) {
		this.index = index;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getIndex(){ return index; }

	private Number low;
	/**
 Range series only. The low or minimum value for each data point. 
	*/
	public void setLow(Number low) {
		this.low = low;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLow(){ return low; }

	private Boolean mock;
	/**
 Indicates if this is a mock point for an annotation. 
	*/
	public void setMock(Boolean mock) {
		this.mock = mock;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getMock(){ return mock; }

	private String name;
	/**
 The name of the point. The name can be given as the first position of the point configuration array, or as a `name` property in the configuration: 
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private HIPointOptionsObject options;
	/**
 The point's options as applied in the initial configuration, or extended through `Point.update`. In TypeScript you have to extend `PointOptionsObject` via an additional interface to allow custom data options: ``` declare interface PointOptionsObject { customProperty: string; } ``` 
	*/
	public void setOptions(HIPointOptionsObject options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointOptionsObject getOptions(){ return options; }

	private Number percentage;
	/**
 The percentage for points in a stacked series or pies. 
	*/
	public void setPercentage(Number percentage) {
		this.percentage = percentage;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPercentage(){ return percentage; }

	private Number plotX;
	/**
 The translated X value for the point in terms of pixels. Relative to the X axis position if the series has one, otherwise relative to the plot area. Depending on the series type this value might not be defined. 
	*/
	public void setPlotX(Number plotX) {
		this.plotX = plotX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPlotX(){ return plotX; }

	private Number plotY;
	/**
 The translated Y value for the point in terms of pixels. Relative to the Y axis position if the series has one, otherwise relative to the plot area. Depending on the series type this value might not be defined. 
	*/
	public void setPlotY(Number plotY) {
		this.plotY = plotY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPlotY(){ return plotY; }

	private Number pointPadding;
	/**
 Heatmap series only. Padding between the points in the heatmap. 
	*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Object properties;
	/**
 In Highcharts Maps, when data is loaded from GeoJSON, the GeoJSON item's properies are copied over here. 
	*/
	public void setProperties(Object properties) {
		this.properties = properties;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getProperties(){ return properties; }

	private Boolean selected;
	/**
 Whether the point is selected or not. 
	*/
	public void setSelected(Boolean selected) {
		this.selected = selected;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSelected(){ return selected; }

	private HISeries series;
	/**
 The series object associated with the point. 
	*/
	public void setSeries(HISeries series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private Object shapeArgs;
	/**
 The attributes of the rendered SVG shape like in `column` or `pie` series. 
	*/
	public void setShapeArgs(Object shapeArgs) {
		this.shapeArgs = shapeArgs;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getShapeArgs(){ return shapeArgs; }

	private Boolean sliced;
	/**
 Pie series only. Whether to display a slice offset from the center. 
	*/
	public void setSliced(Boolean sliced) {
		this.sliced = sliced;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSliced(){ return sliced; }

	private Number total;
	/**
 The total of values in either a stack for stacked series, or a pie in a pie series. 
	*/
	public void setTotal(Number total) {
		this.total = total;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTotal(){ return total; }

	private Number value;
	/**
 Heatmap series only. The value of the point, resulting in a color controled by options as set in the colorAxis configuration. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private Boolean visible;
	/**
 For certain series types, like pie charts, where individual points can be shown or hidden. 
	*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private Number x;
	/**
 The x value of the point. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number x2;
	/**
 The ending X value of the range point. 
	*/
	public void setX2(Number x2) {
		this.x2 = x2;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX2(){ return x2; }

	private Number y;
	/**
 The y value of the point. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }



	public HIPoint() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.category != null) {
			params.put("category", this.category);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.dataGroup != null) {
			params.put("dataGroup", this.dataGroup.getParams());
		}
		if (this.high != null) {
			params.put("high", this.high);
		}
		if (this.index != null) {
			params.put("index", this.index);
		}
		if (this.low != null) {
			params.put("low", this.low);
		}
		if (this.mock != null) {
			params.put("mock", this.mock);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.options != null) {
			params.put("options", this.options.getParams());
		}
		if (this.percentage != null) {
			params.put("percentage", this.percentage);
		}
		if (this.plotX != null) {
			params.put("plotX", this.plotX);
		}
		if (this.plotY != null) {
			params.put("plotY", this.plotY);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.properties != null) {
			params.put("properties", this.properties);
		}
		if (this.selected != null) {
			params.put("selected", this.selected);
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.shapeArgs != null) {
			params.put("shapeArgs", this.shapeArgs);
		}
		if (this.sliced != null) {
			params.put("sliced", this.sliced);
		}
		if (this.total != null) {
			params.put("total", this.total);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.x2 != null) {
			params.put("x2", this.x2);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		return params;
	}

}