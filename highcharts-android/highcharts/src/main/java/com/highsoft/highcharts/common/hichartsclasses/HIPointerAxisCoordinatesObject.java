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



public class HIPointerAxisCoordinatesObject extends HIFoundation { 

	private ArrayList xAxis;
	/**
 Positions on the x-axis. 
	*/
	public void setXAxis(ArrayList xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getXAxis(){ return xAxis; }

	private ArrayList yAxis;
	/**
 Positions on the y-axis. 
	*/
	public void setYAxis(ArrayList yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getYAxis(){ return yAxis; }



	public HIPointerAxisCoordinatesObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.xAxis != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.xAxis) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("xAxis", array);
		}
		if (this.yAxis != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.yAxis) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("yAxis", array);
		}
		return params;
	}

}