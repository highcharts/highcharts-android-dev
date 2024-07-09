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



public class HIGradientColorObject extends HIFoundation { 

	private HILinearGradientColorObject linearGradient;
	/**
 Holds an object that defines the start position and the end position relative to the shape. 
	*/
	public void setLinearGradient(HILinearGradientColorObject linearGradient) {
		this.linearGradient = linearGradient;
		this.setChanged();
		this.notifyObservers();
	}

	public HILinearGradientColorObject getLinearGradient(){ return linearGradient; }

	private HIRadialGradientColorObject radialGradient;
	/**
 Holds an object that defines the center position and the radius. 
	*/
	public void setRadialGradient(HIRadialGradientColorObject radialGradient) {
		this.radialGradient = radialGradient;
		this.setChanged();
		this.notifyObservers();
	}

	public HIRadialGradientColorObject getRadialGradient(){ return radialGradient; }

	private ArrayList stops;
	/**
 The first item in each tuple is the position in the gradient, where 0 is the start of the gradient and 1 is the end of the gradient. Multiple stops can be applied. The second item is the color for each stop. This color can also be given in the rgba format. 
	*/
	public void setStops(ArrayList stops) {
		this.stops = stops;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getStops(){ return stops; }



	public HIGradientColorObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.linearGradient != null) {
			params.put("linearGradient", this.linearGradient.getParams());
		}
		if (this.radialGradient != null) {
			params.put("radialGradient", this.radialGradient.getParams());
		}
		if (this.stops != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.stops) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("stops", array);
		}
		return params;
	}

}