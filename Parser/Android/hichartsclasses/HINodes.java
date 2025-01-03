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



public class HINodes extends HIFoundation { 

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

	private ArrayList <HIDataLabels> dataLabels;
	/**
 Individual data label for each node. The options are the same as the ones for `series.networkgraph.dataLabels`. 
	*/
	public void setDataLabels(ArrayList dataLabels) {
		this.dataLabels = dataLabels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getDataLabels(){ return dataLabels; }

	private Number mass;
	/**
 Mass of the node. By defaults, each node has mass equal to it's marker radius . Mass is used to determine how two connected nodes should affect each other: Attractive force is multiplied by the ratio of two connected nodes; if a big node has weights twice as the small one, then the small one will move towards the big one twice faster than the big one to the small one . 
	*/
	public void setMass(Number mass) {
		this.mass = mass;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMass(){ return mass; }

	private HIMarker marker;
	/**
 Options for the node markers. 
	*/
	public void setMarker(HIMarker marker) {
		this.marker = marker;
		this.marker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMarker getMarker(){ return marker; }

	private String id;
	/**
 The id of the auto-generated node, referring to the `from` or `to` setting of the link. 
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

	private Object /* Number, String */ offsetVertical;
	/**
 The vertical offset of a node. Positive values shift the node down, negative shift it up. If a percentage string is given, the node is offset by the percentage of the node size. 
	*/
	public void setOffsetVertical(Object /* Number, String */ offsetVertical) {
		this.offsetVertical = offsetVertical;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getOffsetVertical(){ return offsetVertical; }

	private Number level;
	/**
 An optional level index of where to place the node. The defaults behaviour is to place it next to the preceding node. Alias of `nodes.column`, but in inverted sankeys and org charts, the levels are laid out as rows. 
	*/
	public void setLevel(Number level) {
		this.level = level;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLevel(){ return level; }

	private Object /* Number, String */ offsetHorizontal;
	/**
 The horizontal offset of a node. Positive values shift the node right, negative shift it left. If a percentage string is given, the node is offset by the percentage of the node size. 
	*/
	public void setOffsetHorizontal(Object /* Number, String */ offsetHorizontal) {
		this.offsetHorizontal = offsetHorizontal;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getOffsetHorizontal(){ return offsetHorizontal; }

	private Number height;
	/**
 The height of the node. 
	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number column;
	/**
 An optional column index of where to place the node. The defaults behaviour is to place it next to the preceding node. Note that this option name is counter intuitive in inverted charts, like for example an organization chart rendered top down. In this case the "columns" are horizontal. 
	*/
	public void setColumn(Number column) {
		this.column = column;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColumn(){ return column; }

	private String image;
	/**
 An image for the node card, will be inserted by the defaults `dataLabel.nodeFormatter`. 
	*/
	public void setImage(String image) {
		this.image = image;
		this.setChanged();
		this.notifyObservers();
	}

	public String getImage(){ return image; }

	private String title;
	/**
 The job title for the node card, will be inserted by the defaults `dataLabel.nodeFormatter`. 
	*/
	public void setTitle(String title) {
		this.title = title;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTitle(){ return title; }

	private String layout;
	/**
 Layout for the node's children. If `hanging`, this node's children will hang below their parent, allowing a tighter packing of nodes in the diagram. Note: Since version 10.0.0, the `hanging` layout is set by defaults for children of a parent using `hanging` layout. 
 <br><br><b>defaults:</b><br><br>&ensp;normal	*/
	public void setLayout(String layout) {
		this.layout = layout;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayout(){ return layout; }

	private String definition;
	/**
 The job description for the node card, will be inserted by the defaults `dataLabel.nodeFormatter`. 
	*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }



	public HINodes() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.dataLabels != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.dataLabels) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("dataLabels", array);
		}
		if (this.mass != null) {
			params.put("mass", this.mass);
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.offsetVertical != null) {
			params.put("offsetVertical", this.offsetVertical);
		}
		if (this.level != null) {
			params.put("level", this.level);
		}
		if (this.offsetHorizontal != null) {
			params.put("offsetHorizontal", this.offsetHorizontal);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.column != null) {
			params.put("column", this.column);
		}
		if (this.image != null) {
			params.put("image", this.image);
		}
		if (this.title != null) {
			params.put("title", this.title);
		}
		if (this.layout != null) {
			params.put("layout", this.layout);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		return params;
	}

}