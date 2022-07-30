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



public class HISeries extends HIFoundation { 

	private ArrayList /* <Data|Number|ArrayList> */ data;
	/**
 An array of data points for the series. The points can be given in three ways:  An array of numerical values. In this case, the numerical values will  	be interpreted as y values, and x values will be automatically calculated, 	either starting at 0 and incrementing by 1, or from pointStart  	and pointInterval given in the plotOptions. If the axis is 	has categories, these will be used. This option is not available for range series. Example: data: [0, 5, 3, 5]  An array of arrays with two values. In this case, the first value is the 	x value and the second is the y value. If the first value is a string, it is 	applied as the name of the point, and the x value is incremented following 	the above rules. For range series, the arrays will be interpreted as [x, low, high]. In this cases, the X value can be skipped altogether to make use of pointStart and pointRange.  Example: data: [[5, 2], [6, 3], [8, 2]] An array of objects with named values. In this case the objects are 	point configuration objects as seen below. Range series values are given by low and high.  Example: data: [{ 	name: 'Point 1', 	color: '#00FF00', 	y: 0 }, { 	name: 'Point 2', 	color: '#FF00FF', 	y: 5 }]  Note that line series and derived types like spline and area, require data to be sorted by X because it interpolates mouse coordinates for the tooltip. Column and scatter series, where each point has its own mouse event, does not require sorting. 
	*/
	public void setData(ArrayList /* <Data|Number|ArrayList> */ data) {
		this.data = data;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList /* <Data|Number|ArrayList> */ getData(){ return data; }

	private String id;
	/**
 An id for the series. This can be used after render time to get a pointer to the series object through chart.get(). <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-id/" target="_blank">Get series by id</a>
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number index;
	/**
 The index of the series in the chart, affecting the internal index in the chart.series array, the visible Z index as well as the order in the legend. 
	*/
	public void setIndex(Number index) {
		this.index = index;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getIndex(){ return index; }

	private Number legendIndex;
	/**
 The sequential index of the series in the legend. Try it: 	Legend in opposite order . 
	*/
	public void setLegendIndex(Number legendIndex) {
		this.legendIndex = legendIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLegendIndex(){ return legendIndex; }

	private String name;
	/**
 The name of the series as shown in the legend, tooltip etc. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/name/" target="_blank">Series name</a>
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private String stack;
	/**
 This option allows grouping series in a stacked chart. The stack option can be a string or a number or anything else, as long as the grouped series' stack options match each other. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/stack/" target="_blank">Stacked and grouped columns</a>
	*/
	public void setStack(String stack) {
		this.stack = stack;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStack(){ return stack; }

	private String type;
	/**
 The type of series. Can be one of area, areaspline, bar, column, line, pie, scatter or spline. From version 2.3, arearange, areasplinerange and columnrange are supported with the highcharts-more.js component. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/type/" target="_blank">Line and column in the same chart</a> <br><br><b>accepted values:</b><br><br>&ensp;[null, "line", "spline", "column", "area", "areaspline", "pie", "arearange", "areasplinerange", "boxplot", "bubble", "columnrange", "errorbar", "funnel", "gauge", "scatter", "waterfall"]
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Object /* Number|String */ xAxis;
	/**
 When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the axis id or the index of the axis in the xAxis array, with 0 being the first. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setXAxis(Object /* Number|String */ xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getXAxis(){ return xAxis; }

	private Object /* Number|String */ yAxis;
	/**
 When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the axis id or the index of the axis in the yAxis array, with 0 being the first. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/series/yaxis/" target="_blank">Apply the column series to the secondary Y axis</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setYAxis(Object /* Number|String */ yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number|String */ getYAxis(){ return yAxis; }

	private Number zIndex;
	/**
 Define the visual z index of the series. <br><br><b><i>Try it:</b></i><br><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex-defaults/" target="_blank">With no z index, the series defined last are on top</a>, 			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-zindex/" target="_blank">with a z index, the series with the highest z index is on top</a>.
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HISVGElement area;
	/**
 SVG element of area-based charts. Can be used for styling purposes. If zones are configured, this element will be hidden and replaced by multiple zone areas, accessible via `series['zone-area-x']` (where x is a number, starting with 0). 
	*/
	public void setArea(HISVGElement area) {
		this.area = area;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getArea(){ return area; }

	private HIChart chart;
	/**
 Read only. The chart that the series belongs to. 
	*/
	public void setChart(HIChart chart) {
		this.chart = chart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIChart getChart(){ return chart; }

	private Number dataMax;
	/**
 Contains the maximum value of the series' data point. Some series types like `networkgraph` do not support this property as they lack a `y`-value. 
	*/
	public void setDataMax(Number dataMax) {
		this.dataMax = dataMax;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDataMax(){ return dataMax; }

	private Number dataMin;
	/**
 Contains the minimum value of the series' data point. Some series types like `networkgraph` do not support this property as they lack a `y`-value. 
	*/
	public void setDataMin(Number dataMin) {
		this.dataMin = dataMin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDataMin(){ return dataMin; }

	private HISVGElement graph;
	/**
 SVG element of line-based charts. Can be used for styling purposes. If zones are configured, this element will be hidden and replaced by multiple zone lines, accessible via `series['zone-graph-x']` (where x is a number, starting with 0). 
	*/
	public void setGraph(HISVGElement graph) {
		this.graph = graph;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getGraph(){ return graph; }

	private Object options;
	/**
 Read only. The series' current options. To update, use {@link Series#update}. 
	*/
	public void setOptions(Object options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOptions(){ return options; }

	private ArrayList points;
	/**
 An array containing all currently visible point objects. In case of cropping, the cropped-away points are not part of this array. The `series.points` array starts at `series.cropStart` compared to `series.data` and `series.options.data`. If however the series data is grouped, these can't be correlated one to one. To modify the data, use {@link Highcharts.Series#setData} or {@link Highcharts.Point#update}. 
	*/
	public void setPoints(ArrayList points) {
		this.points = points;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPoints(){ return points; }

	private Boolean selected;
	/**
 Read only. The series' selected state as set by {@link Highcharts.Series#select}. 
	*/
	public void setSelected(Boolean selected) {
		this.selected = selected;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSelected(){ return selected; }

	private Object userOptions;
	/**
 Contains series options by the user without defaultss. 
	*/
	public void setUserOptions(Object userOptions) {
		this.userOptions = userOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getUserOptions(){ return userOptions; }

	private Boolean visible;
	/**
 Read only. The series' visibility state as set by {@link Series#show}, {@link Series#hide}, or in the initial configuration. 
	*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }



	public HISeries() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.data != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.data) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("data", array);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.index != null) {
			params.put("index", this.index);
		}
		if (this.legendIndex != null) {
			params.put("legendIndex", this.legendIndex);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.stack != null) {
			params.put("stack", this.stack);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.xAxis != null) {
			params.put("xAxis", this.xAxis);
		}
		if (this.yAxis != null) {
			params.put("yAxis", this.yAxis);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.area != null) {
			params.put("area", this.area.getParams());
		}
		if (this.chart != null) {
			params.put("chart", this.chart.getParams());
		}
		if (this.dataMax != null) {
			params.put("dataMax", this.dataMax);
		}
		if (this.dataMin != null) {
			params.put("dataMin", this.dataMin);
		}
		if (this.graph != null) {
			params.put("graph", this.graph.getParams());
		}
		if (this.options != null) {
			params.put("options", this.options);
		}
		if (this.points != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.points) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("points", array);
		}
		if (this.selected != null) {
			params.put("selected", this.selected);
		}
		if (this.userOptions != null) {
			params.put("userOptions", this.userOptions);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		return params;
	}

}