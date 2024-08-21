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



public class HIPoint extends HIFoundation { 

	private HIFunction descriptionFormatter;
	/**
/** * description: Formatter function to use instead of the defaults for point descriptions. Same as `accessibility.point.descriptionFormatter`, but applies to a series instead of the whole chart. Note: Prefer using `accessibility.point.valueDescriptionFormat` instead if possible, as defaults functionality such as describing annotations will be preserved. 
*/
	public void setDescriptionFormatter(HIFunction descriptionFormatter) {
		this.descriptionFormatter = descriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDescriptionFormatter(){ return descriptionFormatter; }

	private String valueDescriptionFormat;
	/**
 Format to use for describing the values of data points to assistive technology - including screen readers. The point context is available as `{point}`. Other available context variables include `{index}`, `{value}`, and `{xDescription}`. Additionally, the series name, annotation info, and description added in `point.accessibility.description` is added by defaults if relevant. To override this, use the `accessibility.point.descriptionFormatter` option. 
 <br><br><b>defaults:</b><br><br>&ensp;{xDescription}{separator}{value}.	*/
	public void setValueDescriptionFormat(String valueDescriptionFormat) {
		this.valueDescriptionFormat = valueDescriptionFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueDescriptionFormat(){ return valueDescriptionFormat; }

	private String valueSuffix;
	/**
 Suffix to add to the values in the point descriptions. Uses `tooltip.valueSuffix` if not defined. 
	*/
	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueSuffix(){ return valueSuffix; }

	private Boolean describeNull;
	/**
 Whether or not to describe points with the value `null` to assistive technology, such as screen readers. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setDescribeNull(Boolean describeNull) {
		this.describeNull = describeNull;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDescribeNull(){ return describeNull; }

	private String dateFormat;
	/**
 Date format to use for points on datetime axes when describing them to screen reader users. Defaults to the same format as in tooltip. For an overview of the replacement codes, see `dateFormat`. 
	*/
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDateFormat(){ return dateFormat; }

	private HIFunction dateFormatter;
	/**
 Formatter function to determine the date/time format used with points on datetime axes when describing them to screen reader users. Receives one argument, `point`, referring to the point to describe. Should return a date format string compatible with `dateFormat`. 
	*/
	public void setDateFormatter(HIFunction dateFormatter) {
		this.dateFormatter = dateFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDateFormatter(){ return dateFormatter; }

	private String valuePrefix;
	/**
 Prefix to add to the values in the point descriptions. Uses `tooltip.valuePrefix` if not defined. 
	*/
	public void setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValuePrefix(){ return valuePrefix; }

	private String descriptionFormat;
	/**
 A [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) to use instead of the defaults for point descriptions. The context of the format string is the point instance. As opposed to `accessibility.point.valueDescriptionFormat`, this option replaces the whole description. 
	*/
	public void setDescriptionFormat(String descriptionFormat) {
		this.descriptionFormat = descriptionFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDescriptionFormat(){ return descriptionFormat; }

	private Number valueDecimals;
	/**
 Decimals to use for the values in the point descriptions. Uses `tooltip.valueDecimals` if not defined. 
	*/
	public void setValueDecimals(Number valueDecimals) {
		this.valueDecimals = valueDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValueDecimals(){ return valueDecimals; }

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

	private HIColor color;
	/**
 The point's current color. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

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

	private HIEvents events;
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }



	public HIPoint() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.descriptionFormatter != null) {
			params.put("descriptionFormatter", this.descriptionFormatter);
		}
		if (this.valueDescriptionFormat != null) {
			params.put("valueDescriptionFormat", this.valueDescriptionFormat);
		}
		if (this.valueSuffix != null) {
			params.put("valueSuffix", this.valueSuffix);
		}
		if (this.describeNull != null) {
			params.put("describeNull", this.describeNull);
		}
		if (this.dateFormat != null) {
			params.put("dateFormat", this.dateFormat);
		}
		if (this.dateFormatter != null) {
			params.put("dateFormatter", this.dateFormatter);
		}
		if (this.valuePrefix != null) {
			params.put("valuePrefix", this.valuePrefix);
		}
		if (this.descriptionFormat != null) {
			params.put("descriptionFormat", this.descriptionFormat);
		}
		if (this.valueDecimals != null) {
			params.put("valueDecimals", this.valueDecimals);
		}
		if (this.category != null) {
			params.put("category", this.category);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.name != null) {
			params.put("name", this.name);
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
		if (this.selected != null) {
			params.put("selected", this.selected);
		}
		if (this.sliced != null) {
			params.put("sliced", this.sliced);
		}
		if (this.total != null) {
			params.put("total", this.total);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		return params;
	}

  /**
   * Cancel sonification of a point. Calls onEnd functions.
   */
  public void cancelSonify(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "cancelSonify0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Cancel sonification of a point. Calls onEnd functions.
   * @param fadeOut Whether or not to fade out as we stop. If false, the points are cancelled synchronously.
   */
  public void cancelSonify(boolean fadeOut){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "cancelSonify1");
      put("id", uuid);
      put("params", Collections.singletonList(fadeOut));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Runs on mouse out from the point. Called internally from mouse and touch events.
   */
  public void onMouseOut(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "onMouseOut");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a point and optionally redraw the series and if necessary the axes
   * @param redraw Whether to redraw the chart or wait for an explicit call. When doing more operations on the chart, for example running point.remove() in a loop, it is best practice to set redraw to false and call HIChartView redraw() after.
   */
  public void remove(boolean redraw){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "remove0");
      put("id", uuid);
      put("params", Collections.singletonList(redraw));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Remove a point and optionally redraw the series and if necessary the axes
   * @param redraw Whether to redraw the chart or wait for an explicit call. When doing more operations on the chart, for example running point.remove() in a loop, it is best practice to set redraw to false and call HIChartView redraw() after.
   * @param animation Whether to apply animation, and optionally animation configuration.
   */
  public void remove(boolean redraw, HIAnimationOptionsObject animation){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "remove1");
      put("id", uuid);
      put("params", Arrays.asList(redraw, animation));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Toggle the selection status of a point.
   */
  public void select(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "select0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Toggle the selection status of a point.
   * @param selected When true, the point is selected. When false, the point is unselected. When null or undefined, the selection state is toggled.
   */
  public void select(boolean selected){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "select1");
      put("id", uuid);
      put("params", Collections.singletonList(selected));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Toggle the selection status of a point.
   * @param selected When true, the point is selected. When false, the point is unselected. When null or undefined, the selection state is toggled.
   * @param accumulate When true, the selection is added to other selected points. When false, other selected points are deselected. Internally in Highcharts, when allowPointSelect is true, selected points are accumulated on Control, Shift or Cmd clicking the point.
   */
  public void select(boolean selected, boolean accumulate){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "select2");
      put("id", uuid);
      put("params", Arrays.asList(selected, accumulate));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set a value in an object, on the property defined by key. The key supports nested properties using dot notation. The function modifies the input object and does not make a copy.
   * @param object The object to set the value on.
   * @param value The value to set.
   * @param key Key to the property to set.
   */
  public void setNestedProperty(Object object, Object value, String key){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "setNestedProperty");
      put("id", uuid);
      put("params", Arrays.asList(object, value, key));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  public enum State {
    HOVER("hover"),
    SELECT("select"),
    INACTIVE("inactive"),
    NORMAL("normal");

    private final String value;

    State(String value) {
      this.value = value;
    }

    public String getValue() {
      return this.value;
    }
  }

  /**
   * Set the point's state.
   */
  public void setState(){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "setState0");
      put("id", uuid);
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the point's state.
   * @param state The new state, can be one of '' (an empty string), hover or select
   */
  public void setState(String state){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "setState1");
      put("id", uuid);
      put("params", Collections.singletonList(state));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }
  public void setState(State state){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "setState1");
      put("id", uuid);
      put("params", Collections.singletonList(state.getValue()));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Set the point's state.
   * @param object The new state, can be one of '' (an empty string), hover or select.
   * @param move State for animation.
   */
  public void setState(Object object, boolean move){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "setState2");
      put("id", uuid);
      put("params", Arrays.asList(object, move));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }
  public void setState(State state, boolean move){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "setState2");
      put("id", uuid);
      put("params", Arrays.asList(state.getValue(), move));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Sonify a single point.
   * @param options Options for the sonification of the point.
   */
  public void sonify(Map options){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "sonify");
      put("id", uuid);
      put("params", Collections.singletonList(options));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Extendable method for formatting each point's tooltip line.
   * @param pointFormat The point format.
   */
  public void tooltipFormatter(String pointFormat){
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "tooltipFormatter");
      put("id", uuid);
      put("params", Collections.singletonList(pointFormat));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Update point with new options (typically x/y data) and optionally redraw the series.
   * @param options The point options. Point options are handled as described under the series.type.data item for each series type. For example for a line series, if options is a single number, the point will be given that number as the marin y value. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
   */
  public void update(HIPoint options){
    Map<String, Object> params = options.getParams();
    params.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "update0");
      put("id", uuid);
      put("params", Collections.singletonList(params));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Update point with new options (typically x/y data) and optionally redraw the series.
   * @param options The point options. Point options are handled as described under the series.type.data item for each series type. For example for a line series, if options is a single number, the point will be given that number as the marin y value. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
   * @param redraw Whether to redraw the chart after the point is updated. If doing more operations on the chart, it is best practice to set redraw to false and call chart.redraw() after.
   */
  public void update(HIPoint options, boolean redraw){
    Map<String, Object> params = options.getParams();
    params.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "update1");
      put("id", uuid);
      put("params", Arrays.asList(params, redraw));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

  /**
   * Update point with new options (typically x/y data) and optionally redraw the series.
   * @param options The point options. Point options are handled as described under the series.type.data item for each series type. For example for a line series, if options is a single number, the point will be given that number as the marin y value. If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
   * @param redraw Whether to redraw the chart after the point is updated. If doing more operations on the chart, it is best practice to set redraw to false and call chart.redraw() after.
   * @param animation Whether to apply animation, and optionally animation configuration.
   */
  public void update(HIPoint options, boolean redraw, HIAnimationOptionsObject animation){
    Map<String, Object> params = options.getParams();
    params.remove("_wrapperID");
    this.jsClassMethod = new HashMap<String, Object>() {{
      put("class", "Point");
      put("method", "update2");
      put("id", uuid);
      put("params", Arrays.asList(params, redraw, animation));
    }};
    this.setChanged();
    this.notifyObservers(jsClassMethod);
  }

}