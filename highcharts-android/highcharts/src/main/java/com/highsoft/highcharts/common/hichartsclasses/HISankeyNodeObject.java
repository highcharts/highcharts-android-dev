/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HISankeyNodeObject extends HIFoundation { 

	private HIColor color;
	/**
 The color of the auto generated node. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Number colorIndex;
	/**
 The color index of the auto generated node, especially for use in styled mode. 
	*/
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorIndex(){ return colorIndex; }

	private Number column;
	/**
 An optional column index of where to place the node. The defaults behaviour is to place it next to the preceding node. 
	*/
	public void setColumn(Number column) {
		this.column = column;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColumn(){ return column; }

	private String id;
	/**
 The id of the auto-generated node, refering to the `from` or `to` setting of the link. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private String name;
	/**
 The name to display for the node in data labels and tooltips. Use this when the name is different from the `id`. Where the id must be unique for each node, this is not necessary for the name. 
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private Object /* Number, String */ offsetHorizontal;
	/**
 The horizontal offset of a node. Positive values shift the node right, negative shift it left. If a percantage string is given, the node is offset by the percentage of the node size. 
	*/
	public void setOffsetHorizontal(Object /* Number, String */ offsetHorizontal) {
		this.offsetHorizontal = offsetHorizontal;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getOffsetHorizontal(){ return offsetHorizontal; }

	private Object /* Number, String */ offsetVertical;
	/**
 The vertical offset of a node. Positive values shift the node down, negative shift it up. If a percantage string is given, the node is offset by the percentage of the node size. 
	*/
	public void setOffsetVertical(Object /* Number, String */ offsetVertical) {
		this.offsetVertical = offsetVertical;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getOffsetVertical(){ return offsetVertical; }



	public HISankeyNodeObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.column != null) {
			params.put("column", this.column);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.offsetHorizontal != null) {
			params.put("offsetHorizontal", this.offsetHorizontal);
		}
		if (this.offsetVertical != null) {
			params.put("offsetVertical", this.offsetVertical);
		}
		return params;
	}

}