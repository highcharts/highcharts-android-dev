/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.common.HIColor;



public class HINodes extends HIFoundation { 

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

	private String name;
	/**
 The name to display for the node in data labels and tooltips. Use this when the name is different from the id. Where the id must be unique for each node, this is not necessary for the name. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-networkgraph/data-options/">Networkgraph diagram with node options</a>
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private String id;
	/**
 The id of the auto-generated node, refering to the from or to setting of the link. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number column;
	/**
 An optional column index of where to place the node. The defaults behaviour is to place it next to the preceding node. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/">Specified node column</a>
	*/
	public void setColumn(Number column) {
		this.column = column;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColumn(){ return column; }

	private Number offset;
	/**
 The vertical offset of a node in terms of weight. Positive values shift the node downwards, negative shift it upwards. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-node-column/">Specified node offset</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setOffset(Number offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffset(){ return offset; }



	public HINodes() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.column != null) {
			params.put("column", this.column);
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		return params;
	}

}