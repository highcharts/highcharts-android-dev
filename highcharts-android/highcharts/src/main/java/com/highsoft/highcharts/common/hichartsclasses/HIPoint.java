/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

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
 In Highmaps, when data is loaded from GeoJSON, the GeoJSON item's properies are copied over here. 
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

	private String valueDescriptionFormat;
	/**
 Format to use for describing the values of data points to assistive technology - including screen readers. The point context is available as {point}. Additionally, the series name, annotation info, and description added in point.accessibility.description is added by defaults if relevant. To override this, use the accessibility.point.descriptionFormatter option. 
	*/
	public void setValueDescriptionFormat(String valueDescriptionFormat) {
		this.valueDescriptionFormat = valueDescriptionFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueDescriptionFormat(){ return valueDescriptionFormat; }

	private String valueSuffix;
	/**
 Suffix to add to the values in the point descriptions. Uses tooltip.valueSuffix if not defined. 
	*/
	public void setValueSuffix(String valueSuffix) {
		this.valueSuffix = valueSuffix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueSuffix(){ return valueSuffix; }

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
 Formatter function to determine the date/time format used with points on datetime axes when describing them to screen reader users. Receives one argument, point, referring to the point to describe. Should return a date format string compatible with `dateFormat`. 
	*/
	public void setDateFormatter(HIFunction dateFormatter) {
		this.dateFormatter = dateFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDateFormatter(){ return dateFormatter; }

	private String valuePrefix;
	/**
 Prefix to add to the values in the point descriptions. Uses tooltip.valuePrefix if not defined. 
	*/
	public void setValuePrefix(String valuePrefix) {
		this.valuePrefix = valuePrefix;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValuePrefix(){ return valuePrefix; }

	private HIFunction descriptionFormatter;
	/**
 Formatter function to use instead of the defaults for point descriptions. Receives one argument, point, referring to the point to describe. Should return a string with the description of the point for a screen reader user. If false is returned, the defaults formatter will be used for that point. Note: Prefer using accessibility.point.valueDescriptionFormat instead if possible, as defaults functionality such as describing annotations will be preserved. 
	*/
	public void setDescriptionFormatter(HIFunction descriptionFormatter) {
		this.descriptionFormatter = descriptionFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDescriptionFormatter(){ return descriptionFormatter; }

	private Number valueDecimals;
	/**
 Decimals to use for the values in the point descriptions. Uses tooltip.valueDecimals if not defined. 
	*/
	public void setValueDecimals(Number valueDecimals) {
		this.valueDecimals = valueDecimals;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValueDecimals(){ return valueDecimals; }

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
		if (this.index != null) {
			params.put("index", this.index);
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
		if (this.valueDescriptionFormat != null) {
			params.put("valueDescriptionFormat", this.valueDescriptionFormat);
		}
		if (this.valueSuffix != null) {
			params.put("valueSuffix", this.valueSuffix);
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
		if (this.descriptionFormatter != null) {
			params.put("descriptionFormatter", this.descriptionFormatter);
		}
		if (this.valueDecimals != null) {
			params.put("valueDecimals", this.valueDecimals);
		}
		return params;
	}

}