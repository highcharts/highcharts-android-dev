/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;
import com.highsoft.highcharts.common.HIColor;





public class HIShapes extends Observable implements HIChartsJSONSerializable { 

	private ArrayList <HIPoints> points;
/**
/** An array of points for the shape. This option is available for shapes which can use multiple points such as path. A point can be either a point object or a point's id. 
*/
	public void setPoints(ArrayList points) {
		this.points = points;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPoints(){ return points; }

	private String markerEnd;
/**
/** Id of the marker which will be drawn at the final vertex of the path. Custom markers can be defined in defs property. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>
*/
	public void setMarkerEnd(String markerEnd) {
		this.markerEnd = markerEnd;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMarkerEnd(){ return markerEnd; }

	private String markerStart;
/**
/** Id of the marker which will be drawn at the first vertex of the path. Custom markers can be defined in defs property. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/custom-markers/">Define a custom marker for annotations</a>
*/
	public void setMarkerStart(String markerStart) {
		this.markerStart = markerStart;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMarkerStart(){ return markerStart; }

	private HIPoint point;
/**
/** This option defines the point to which the shape will be connected. It can be either the point which exists in the series - it is referenced by the point's id - or a new point with defined x, y properties and optionally axes. 
*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.point.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private Number strokeWidth;
/**
/** The pixel stroke width of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
*/
	public void setStrokeWidth(Number strokeWidth) {
		this.strokeWidth = strokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStrokeWidth(){ return strokeWidth; }

	private Number height;
/**
/** The height of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number width;
/**
/** The width of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private HIColor stroke;
/**
/** The color of the shape's stroke. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
*/
	public void setStroke(HIColor stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getStroke(){ return stroke; }

	private Number r;
/**
/** The radius of the shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
*/
	public void setR(Number r) {
		this.r = r;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getR(){ return r; }

	private String type;
/**
/** The type of the shape, e.g. circle or rectangle. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
 <br><br><b>defaults:</b><br><br>&ensp;'rect'*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private HIColor fill;
/**
/** The color of the shape's fill. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/annotations/shape/">Basic shape annotation</a>
*/
	public void setFill(HIColor fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFill(){ return fill; }



	public HIShapes() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.points != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.points) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("points", array);
		}
		if (this.markerEnd != null) {
			params.put("markerEnd", this.markerEnd);
		}
		if (this.markerStart != null) {
			params.put("markerStart", this.markerStart);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
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
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.fill != null) {
			params.put("fill", this.fill.getData());
		}
		return params;
	}

}