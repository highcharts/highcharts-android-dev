/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;



public class HIPoint extends HIFoundation { 

	private Number y;
	/**
 The y position of the point. Units can be either in axis or chart pixel coordinates. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 The x position of the point. Units can be either in axis or chart pixel coordinates. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Object /* Number, String */ xAxis;
	/**
 This number defines which xAxis the point is connected to. It refers to either the axis id or the index of the axis in the xAxis array. If the option is not configured or the axis is not found the point's x coordinate refers to the chart pixels. 
	*/
	public void setXAxis(Object /* Number, String */ xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getXAxis(){ return xAxis; }

	private Object /* Number, String */ yAxis;
	/**
 This number defines which yAxis the point is connected to. It refers to either the axis id or the index of the axis in the yAxis array. If the option is not configured or the axis is not found the point's y coordinate refers to the chart pixels. 
	*/
	public void setYAxis(Object /* Number, String */ yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getYAxis(){ return yAxis; }

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

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.xAxis != null) {
			params.put("xAxis", this.xAxis);
		}
		if (this.yAxis != null) {
			params.put("yAxis", this.yAxis);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		return params;
	}

}