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



public class HIShapeOptions extends HIFoundation { 

	private Number strokeWidth;
	/**
 The pixel stroke width of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
	*/
	public void setStrokeWidth(Number strokeWidth) {
		this.strokeWidth = strokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStrokeWidth(){ return strokeWidth; }

	private Number height;
	/**
 The height of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number width;
	/**
 The width of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private HIColor stroke;
	/**
 The color of the shape's stroke. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
	*/
	public void setStroke(HIColor stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getStroke(){ return stroke; }

	private Number r;
	/**
 The radius of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
	*/
	public void setR(Number r) {
		this.r = r;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getR(){ return r; }

	private Number snap;
	/**
 Defines additional snapping area around an annotation making this annotation to focus. Defined in pixels. 
	*/
	public void setSnap(Number snap) {
		this.snap = snap;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSnap(){ return snap; }

	private String type;
	/**
 The type of the shape, e.g. circle or rectangle. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
 <br><br><b>defaults:</b><br><br>&ensp;'rect'	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private HIColor fill;
	/**
 The color of the shape's fill. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
	*/
	public void setFill(HIColor fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFill(){ return fill; }



	public HIShapeOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.strokeWidth != null) {
			params.put("strokeWidth", this.strokeWidth);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke.getData());
		}
		if (this.r != null) {
			params.put("r", this.r);
		}
		if (this.snap != null) {
			params.put("snap", this.snap);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		return params;
	}

}