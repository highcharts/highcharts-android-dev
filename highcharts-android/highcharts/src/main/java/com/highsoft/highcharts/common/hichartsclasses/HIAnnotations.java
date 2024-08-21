/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;



public class HIAnnotations extends HIFoundation { 

	private ArrayList <HILabels> labels;
	/**
 An array of labels for the annotation. For options that apply to multiple labels, they can be added to the `labelOptions`. 
	*/
	public void setLabels(ArrayList labels) {
		this.labels = labels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getLabels(){ return labels; }

	private Boolean crop;
	/**
 Whether to hide the part of the annotation that is outside the plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private Boolean visible;
	/**
 Whether the annotation is visible. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setVisible(Boolean visible) {
		this.visible = visible;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getVisible(){ return visible; }

	private Object /* Number, String */ id;
	/**
 Sets an ID for an annotation. Can be user later when removing an annotation in `Chart#removeAnnotation(id)` method. 
	*/
	public void setId(Object /* Number, String */ id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getId(){ return id; }

	private HIControlPointOptions controlPointOptions;
	/**
 Options for annotation's control points. Each control point inherits options from controlPointOptions object. Options from the controlPointOptions can be overwritten by options in a specific control point. 
	*/
	public void setControlPointOptions(HIControlPointOptions controlPointOptions) {
		this.controlPointOptions = controlPointOptions;
		this.controlPointOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIControlPointOptions getControlPointOptions(){ return controlPointOptions; }

	private String draggable;
	/**
 Allow an annotation to be draggable by a user. Possible values are `'x'`, `'xy'`, `'y'` and `''` (disabled). 
 <br><br><b>defaults:</b><br><br>&ensp;xy	*/
	public void setDraggable(String draggable) {
		this.draggable = draggable;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDraggable(){ return draggable; }

	private HIAnimationOptionsObject animation;
	/**
 Enable or disable the initial animation when a series is displayed for the `annotation`. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation. For other animations, see `chart.animation` and the animation parameter under the API methods. The following properties are supported: - `defer`: The animation delay time in milliseconds. 
	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private HIEvents events;
	/**
 Events available in annotations. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private HILabelOptions labelOptions;
	/**
 Options for annotation's labels. Each label inherits options from the labelOptions object. An option from the labelOptions can be overwritten by config for a specific label. 
	*/
	public void setLabelOptions(HILabelOptions labelOptions) {
		this.labelOptions = labelOptions;
		this.labelOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILabelOptions getLabelOptions(){ return labelOptions; }

	private Number zIndex;
	/**
 The Z index of the annotation. 
 <br><br><b>defaults:</b><br><br>&ensp;6	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private ArrayList <HIShapes> shapes;
	/**
 An array of shapes for the annotation. For options that apply to multiple shapes, then can be added to the `shapeOptions`. 
	*/
	public void setShapes(ArrayList shapes) {
		this.shapes = shapes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getShapes(){ return shapes; }

	private HIShapeOptions shapeOptions;
	/**
 Options for annotation's shapes. Each shape inherits options from the shapeOptions object. An option from the shapeOptions can be overwritten by config for a specific shape. 
	*/
	public void setShapeOptions(HIShapeOptions shapeOptions) {
		this.shapeOptions = shapeOptions;
		this.shapeOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIShapeOptions getShapeOptions(){ return shapeOptions; }

	private String descriptionMultiplePoints;
	public void setDescriptionMultiplePoints(String descriptionMultiplePoints) {
		this.descriptionMultiplePoints = descriptionMultiplePoints;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDescriptionMultiplePoints(){ return descriptionMultiplePoints; }

	private String descriptionSinglePoint;
	public void setDescriptionSinglePoint(String descriptionSinglePoint) {
		this.descriptionSinglePoint = descriptionSinglePoint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDescriptionSinglePoint(){ return descriptionSinglePoint; }

	private String descriptionNoPoints;
	public void setDescriptionNoPoints(String descriptionNoPoints) {
		this.descriptionNoPoints = descriptionNoPoints;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDescriptionNoPoints(){ return descriptionNoPoints; }

	private String heading;
	public void setHeading(String heading) {
		this.heading = heading;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHeading(){ return heading; }

	private String itemDelimiter;
	/**
 The way to mark the separator for annotations combined in one export-data table cell. 
 <br><br><b>defaults:</b><br><br>&ensp;; 	*/
	public void setItemDelimiter(String itemDelimiter) {
		this.itemDelimiter = itemDelimiter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getItemDelimiter(){ return itemDelimiter; }

	private Boolean join;
	/**
 When several labels are assigned to a specific point, they will be displayed in one field in the table. 
	*/
	public void setJoin(Boolean join) {
		this.join = join;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getJoin(){ return join; }



	public HIAnnotations() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.labels != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.labels) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("labels", array);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.visible != null) {
			params.put("visible", this.visible);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.controlPointOptions != null) {
			params.put("controlPointOptions", this.controlPointOptions.getParams());
		}
		if (this.draggable != null) {
			params.put("draggable", this.draggable);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.labelOptions != null) {
			params.put("labelOptions", this.labelOptions.getParams());
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.shapes != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.shapes) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("shapes", array);
		}
		if (this.shapeOptions != null) {
			params.put("shapeOptions", this.shapeOptions.getParams());
		}
		if (this.descriptionMultiplePoints != null) {
			params.put("descriptionMultiplePoints", this.descriptionMultiplePoints);
		}
		if (this.descriptionSinglePoint != null) {
			params.put("descriptionSinglePoint", this.descriptionSinglePoint);
		}
		if (this.descriptionNoPoints != null) {
			params.put("descriptionNoPoints", this.descriptionNoPoints);
		}
		if (this.heading != null) {
			params.put("heading", this.heading);
		}
		if (this.itemDelimiter != null) {
			params.put("itemDelimiter", this.itemDelimiter);
		}
		if (this.join != null) {
			params.put("join", this.join);
		}
		return params;
	}

	/**
	 * Hide or show annotaiton attached to points.
	 */
	public void adjustLabelVisibility(HILabels item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "adjustVisibility");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Hide or show annotaiton attached to points.
	 */
	public void adjustShapeVisibility(HIShapes item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "adjustVisibility");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Destroy the annotation. This function does not touch the chart that the annotation belongs to (all annotations are kept in the chart.annotations array) - it is recommended to use HIChartView removeAnnotation() instead.
	 */
	public void destroy(){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "destroy");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Destroy a single item.
	 */
	public void destroyLabelItem(HILabels item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "destroyItem");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Destroy a single item.
	 */
	public void destroyShapeItem(HIShapes item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "destroyItem");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Initialisation of a single label
	 */
	public void initLabel(HILabels item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "initLabel");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Initialisation of a single shape
	 * @param item a confg object for a single shape
	 */
	public void initShape(HIShapes item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "initShape");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Redraw a single item.
	 */
	public void redrawLabelItem(HILabels item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItem0");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Redraw a single item.
	 */
	public void redrawLabelItem(HILabels item, boolean animation){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItem1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(item.getParams(), animation)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Redraw a single item.
	 */
	public void redrawShapeItem(HIShapes item){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItem0");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(item.getParams())));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Redraw a single item.
	 */
	public void redrawShapeItem(HIShapes item, boolean animation) {
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItem1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(item.getParams(), animation)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	public void redrawLabelItems(List<HILabels> items) {
		List<Object> list = new ArrayList<>();
		for(Object obj : items) {
			if(obj instanceof HIFoundation)
				list.add(((HIFoundation) obj).getParams());
			else list.add(obj);
		}
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItems0");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(list)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	public void redrawLabelItems(List<HILabels> items, boolean animation) {
		List<Object> list = new ArrayList<>();
		for(Object obj : items) {
			if(obj instanceof HIFoundation)
				list.add(((HIFoundation) obj).getParams());
			else list.add(obj);
		}
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItems1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(list, animation)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	public void redrawShapeItems(List<HIShapes> items) {
		List<Object> list = new ArrayList<>();
		for(Object obj : items) {
			if(obj instanceof HIFoundation)
				list.add(((HIFoundation) obj).getParams());
			else list.add(obj);
		}
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItems0");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(list)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	public void redrawShapeItems(List<HIShapes> items, boolean animation) {
		List<Object> list = new ArrayList<>();
		for(Object obj : items) {
			if(obj instanceof HIFoundation)
				list.add(((HIFoundation) obj).getParams());
			else list.add(obj);
		}
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "redrawItems1");
			put("id", uuid);
			put("params", new ArrayList<>(Arrays.asList(list, animation)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * See HIAnnotations destroy() method
	 */
	public void remove(){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "remove");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set an annotation options.
	 */
	public void setOptions(){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "setOptions");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the annotation's visibility.
	 */
	public void setVisibility(){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "setVisibility0");
			put("id", uuid);
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}

	/**
	 * Set the annotation's visibility.
	 * @param visible Whether to show or hide an annotation. If the param is omitted, the annotation's visibility is toggled.
	 */
	public void setVisibility(boolean visible){
		this.jsClassMethod = new HashMap<String, Object>() {{
			put("class", "Annotations");
			put("method", "setVisibility1");
			put("id", uuid);
			put("params", new ArrayList<>(Collections.singletonList(visible)));
		}};
		this.setChanged();
		this.notifyObservers(jsClassMethod);
	}
	
}