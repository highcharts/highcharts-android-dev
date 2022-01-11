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



public class HIAxis extends HIFoundation { 

	private ArrayList<String> categories;
	/**
 If categories are present for the axis, names are used instead of numbers for that axis. Since Highcharts 3.0, categories can also be extracted by giving each point a name and setting axis type to `category`. However, if you have multiple series, best practice remains defining the `categories` array. 
	*/
	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getCategories(){ return categories; }

	private HIChart chart;
	/**
 The Chart that the axis belongs to. 
	*/
	public void setChart(HIChart chart) {
		this.chart = chart;
		this.setChanged();
		this.notifyObservers();
	}

	public HIChart getChart(){ return chart; }

	private String coll;
	/**
 The collection where the axis belongs, for example `xAxis`, `yAxis` or `colorAxis`. Corresponds to properties on Chart, for example {@link Chart.xAxis}. 
	*/
	public void setColl(String coll) {
		this.coll = coll;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColl(){ return coll; }

	private Object crosshair;
	/**
 The processed crosshair options. 
	*/
	public void setCrosshair(Object crosshair) {
		this.crosshair = crosshair;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getCrosshair(){ return crosshair; }

	private Boolean horiz;
	/**
 Whether the axis is horizontal. 
	*/
	public void setHoriz(Boolean horiz) {
		this.horiz = horiz;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getHoriz(){ return horiz; }

	private Boolean isXAxis;
	/**
 Whether the axis is the x-axis. 
	*/
	public void setIsXAxis(Boolean isXAxis) {
		this.isXAxis = isXAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsXAxis(){ return isXAxis; }

	private Number max;
	/**
 The maximum value of the axis. In a logarithmic axis, this is the logarithm of the real value, and the real value can be obtained from {@link Axis#getExtremes}. 
	*/
	public void setMax(Number max) {
		this.max = max;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMax(){ return max; }

	private Number min;
	/**
 The minimum value of the axis. In a logarithmic axis, this is the logarithm of the real value, and the real value can be obtained from {@link Axis#getExtremes}. 
	*/
	public void setMin(Number min) {
		this.min = min;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMin(){ return min; }

	private Object minorTicks;
	/**
 List of minor ticks mapped by position on the axis. 
	*/
	public void setMinorTicks(Object minorTicks) {
		this.minorTicks = minorTicks;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getMinorTicks(){ return minorTicks; }

	private Object options;
	/**
 Current options for the axis after merge of defaultss and user's options. 
	*/
	public void setOptions(Object options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOptions(){ return options; }

	private Boolean reversed;
	/**
 Whether the axis is reversed. Based on the `axis.reversed`, option, but inverted charts have reversed xAxis by defaults. 
	*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private ArrayList series;
	/**
 All series associated to the axis. 
	*/
	public void setSeries(ArrayList series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getSeries(){ return series; }

	private Number side;
	/**
 The side on which the axis is rendered. 0 is top, 1 is right, 2 is bottom and 3 is left. 
	*/
	public void setSide(Number side) {
		this.side = side;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSide(){ return side; }

	private ArrayList<Number> tickPositions;
	/**
 Contains the current positions that are laid out on the axis. The positions are numbers in terms of axis values. In a category axis they are integers, in a datetime axis they are also integers, but designating milliseconds. This property is read only - for modifying the tick positions, use the `tickPositioner` callback or [axis.tickPositions( https://api.highcharts.com/highcharts/xAxis.tickPositions) option instead. 
	*/
	public void setTickPositions(ArrayList<Number> tickPositions) {
		this.tickPositions = tickPositions;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getTickPositions(){ return tickPositions; }

	private Object ticks;
	/**
 List of major ticks mapped by postition on axis. 
	*/
	public void setTicks(Object ticks) {
		this.ticks = ticks;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getTicks(){ return ticks; }

	private Object userOptions;
	/**
 User's options for this axis without defaultss. 
	*/
	public void setUserOptions(Object userOptions) {
		this.userOptions = userOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getUserOptions(){ return userOptions; }

	private String xAxisDescriptionSingular;
	public void setXAxisDescriptionSingular(String xAxisDescriptionSingular) {
		this.xAxisDescriptionSingular = xAxisDescriptionSingular;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisDescriptionSingular(){ return xAxisDescriptionSingular; }

	private String timeRangeMinutes;
	public void setTimeRangeMinutes(String timeRangeMinutes) {
		this.timeRangeMinutes = timeRangeMinutes;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeMinutes(){ return timeRangeMinutes; }

	private String timeRangeHours;
	public void setTimeRangeHours(String timeRangeHours) {
		this.timeRangeHours = timeRangeHours;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeHours(){ return timeRangeHours; }

	private String rangeCategories;
	public void setRangeCategories(String rangeCategories) {
		this.rangeCategories = rangeCategories;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeCategories(){ return rangeCategories; }

	private String timeRangeSeconds;
	public void setTimeRangeSeconds(String timeRangeSeconds) {
		this.timeRangeSeconds = timeRangeSeconds;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeSeconds(){ return timeRangeSeconds; }

	private String yAxisDescriptionPlural;
	public void setYAxisDescriptionPlural(String yAxisDescriptionPlural) {
		this.yAxisDescriptionPlural = yAxisDescriptionPlural;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYAxisDescriptionPlural(){ return yAxisDescriptionPlural; }

	private String rangeFromTo;
	public void setRangeFromTo(String rangeFromTo) {
		this.rangeFromTo = rangeFromTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeFromTo(){ return rangeFromTo; }

	private String timeRangeDays;
	public void setTimeRangeDays(String timeRangeDays) {
		this.timeRangeDays = timeRangeDays;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTimeRangeDays(){ return timeRangeDays; }

	private String xAxisDescriptionPlural;
	public void setXAxisDescriptionPlural(String xAxisDescriptionPlural) {
		this.xAxisDescriptionPlural = xAxisDescriptionPlural;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisDescriptionPlural(){ return xAxisDescriptionPlural; }

	private String yAxisDescriptionSingular;
	public void setYAxisDescriptionSingular(String yAxisDescriptionSingular) {
		this.yAxisDescriptionSingular = yAxisDescriptionSingular;
		this.setChanged();
		this.notifyObservers();
	}

	public String getYAxisDescriptionSingular(){ return yAxisDescriptionSingular; }



	public HIAxis() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.categories != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.categories) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("categories", array);
		}
		if (this.chart != null) {
			params.put("chart", this.chart.getParams());
		}
		if (this.coll != null) {
			params.put("coll", this.coll);
		}
		if (this.crosshair != null) {
			params.put("crosshair", this.crosshair);
		}
		if (this.horiz != null) {
			params.put("horiz", this.horiz);
		}
		if (this.isXAxis != null) {
			params.put("isXAxis", this.isXAxis);
		}
		if (this.max != null) {
			params.put("max", this.max);
		}
		if (this.min != null) {
			params.put("min", this.min);
		}
		if (this.minorTicks != null) {
			params.put("minorTicks", this.minorTicks);
		}
		if (this.options != null) {
			params.put("options", this.options);
		}
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.series != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.series) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("series", array);
		}
		if (this.side != null) {
			params.put("side", this.side);
		}
		if (this.tickPositions != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.tickPositions) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("tickPositions", array);
		}
		if (this.ticks != null) {
			params.put("ticks", this.ticks);
		}
		if (this.userOptions != null) {
			params.put("userOptions", this.userOptions);
		}
		if (this.xAxisDescriptionSingular != null) {
			params.put("xAxisDescriptionSingular", this.xAxisDescriptionSingular);
		}
		if (this.timeRangeMinutes != null) {
			params.put("timeRangeMinutes", this.timeRangeMinutes);
		}
		if (this.timeRangeHours != null) {
			params.put("timeRangeHours", this.timeRangeHours);
		}
		if (this.rangeCategories != null) {
			params.put("rangeCategories", this.rangeCategories);
		}
		if (this.timeRangeSeconds != null) {
			params.put("timeRangeSeconds", this.timeRangeSeconds);
		}
		if (this.yAxisDescriptionPlural != null) {
			params.put("yAxisDescriptionPlural", this.yAxisDescriptionPlural);
		}
		if (this.rangeFromTo != null) {
			params.put("rangeFromTo", this.rangeFromTo);
		}
		if (this.timeRangeDays != null) {
			params.put("timeRangeDays", this.timeRangeDays);
		}
		if (this.xAxisDescriptionPlural != null) {
			params.put("xAxisDescriptionPlural", this.xAxisDescriptionPlural);
		}
		if (this.yAxisDescriptionSingular != null) {
			params.put("yAxisDescriptionSingular", this.yAxisDescriptionSingular);
		}
		return params;
	}

}