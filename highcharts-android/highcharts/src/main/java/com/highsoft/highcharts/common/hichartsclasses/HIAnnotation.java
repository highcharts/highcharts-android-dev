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


public class HIAnnotation extends HIFoundation {

	private HISVGElement group;
	/**
 The group svg element. 
	*/
	public void setGroup(HISVGElement group) {
		this.group = group;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getGroup(){ return group; }

	private HISVGElement labelsGroup;
	/**
 The group svg element of the annotation's labels. 
	*/
	public void setLabelsGroup(HISVGElement labelsGroup) {
		this.labelsGroup = labelsGroup;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getLabelsGroup(){ return labelsGroup; }

	private Object options;
	/**
 The options for the annotations. 
	*/
	public void setOptions(Object options) {
		this.options = options;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getOptions(){ return options; }

	private HISVGElement shapesGroup;
	/**
 The group svg element of the annotation's shapes. 
	*/
	public void setShapesGroup(HISVGElement shapesGroup) {
		this.shapesGroup = shapesGroup;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getShapesGroup(){ return shapesGroup; }

	private Object userOptions;
	/**
 The user options for the annotations. 
	*/
	public void setUserOptions(Object userOptions) {
		this.userOptions = userOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getUserOptions(){ return userOptions; }



	public HIAnnotation() {

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


	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.group != null) {
			params.put("group", this.group.getParams());
		}
		if (this.labelsGroup != null) {
			params.put("labelsGroup", this.labelsGroup.getParams());
		}
		if (this.options != null) {
			params.put("options", this.options);
		}
		if (this.shapesGroup != null) {
			params.put("shapesGroup", this.shapesGroup.getParams());
		}
		if (this.userOptions != null) {
			params.put("userOptions", this.userOptions);
		}
		return params;
	}

}