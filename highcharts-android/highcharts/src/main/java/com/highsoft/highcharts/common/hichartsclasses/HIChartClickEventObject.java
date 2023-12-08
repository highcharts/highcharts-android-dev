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



public class HIChartClickEventObject extends HIFoundation { 

	private ArrayList xAxis;
	/**
 Information about the x-axis on the clicked spot. 
	*/
	public void setXAxis(ArrayList xAxis) {
		this.xAxis = xAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getXAxis(){ return xAxis; }

	private ArrayList yAxis;
	/**
 Information about the y-axis on the clicked spot. 
	*/
	public void setYAxis(ArrayList yAxis) {
		this.yAxis = yAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getYAxis(){ return yAxis; }

	private ArrayList zAxis;
	/**
 Information about the z-axis on the clicked spot. 
	*/
	public void setZAxis(ArrayList zAxis) {
		this.zAxis = zAxis;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getZAxis(){ return zAxis; }



	public HIChartClickEventObject() {

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
		if (this.zAxis != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.zAxis) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("zAxis", array);
		}
		return params;
	}

}