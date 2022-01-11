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



public class HIChartSelectionContextObject extends HIFoundation { 

	private ArrayList xAxis;
	/**
 Arrays containing the axes of each dimension and each axis' min and max values. 
	*/
	public void setXAxis(ArrayList xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getXAxis(){ return xAxis; }

	private ArrayList yAxis;
	/**
 Arrays containing the axes of each dimension and each axis' min and max values. 
	*/
	public void setYAxis(ArrayList yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getYAxis(){ return yAxis; }



	public HIChartSelectionContextObject() {

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