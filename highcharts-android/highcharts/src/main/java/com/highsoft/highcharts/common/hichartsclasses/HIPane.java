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
import java.util.HashMap;



public class HIPane extends HIFoundation { 

	private Object /* Number, String */ innerSize;
	/**
 The inner size of the pane, either as a number defining pixels, or a percentage defining a percentage of the pane's size. 
 <br><br><b>defaults:</b><br><br>&ensp;0%	*/
	public void setInnerSize(Object /* Number, String */ innerSize) {
		this.innerSize = innerSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getInnerSize(){ return innerSize; }

	private ArrayList /* <String, Number> */ center;
	/**
 The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size. 
 <br><br><b>defaults:</b><br><br>&ensp;["50%", "50%"]	*/
	public void setCenter(ArrayList /* <String, Number> */ center) {
		this.center = center;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList /* <String, Number> */ getCenter(){ return center; }

	private Number endAngle;
	/**
 The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north. Defaults to `startAngle` + 360. 
	*/
	public void setEndAngle(Number endAngle) {
		this.endAngle = endAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEndAngle(){ return endAngle; }

	private ArrayList <HIBackground> background;
	/**
 An array of background items for the pane. 
	*/
	public void setBackground(ArrayList background) {
		this.background = background;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getBackground(){ return background; }

	private Number startAngle;
	/**
 The start angle of the polar X axis or gauge axis, given in degrees where 0 is north. Defaults to 0. 
	*/
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartAngle(){ return startAngle; }

	private Object /* Number, String */ size;
	/**
 The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the available plot area (the smallest of the plot height or plot width). 
 <br><br><b>defaults:</b><br><br>&ensp;85%	*/
	public void setSize(Object /* Number, String */ size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getSize(){ return size; }



	public HIPane() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.innerSize != null) {
			params.put("innerSize", this.innerSize);
		}
		if (this.center != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.center) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("center", array);
		}
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
		}
		if (this.background != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.background) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("background", array);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}