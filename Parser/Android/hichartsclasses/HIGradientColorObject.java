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



public class HIGradientColorObject extends HIFoundation { 

	private Object linearGradient;
	/**
 Holds an object that defines the start position and the end position relative to the shape. 
	*/
	public void setLinearGradient(Object linearGradient) {
		this.linearGradient = linearGradient;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getLinearGradient(){ return linearGradient; }

	private Object radialGradient;
	/**
 Holds an object that defines the center position and the radius. 
	*/
	public void setRadialGradient(Object radialGradient) {
		this.radialGradient = radialGradient;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getRadialGradient(){ return radialGradient; }

	private List<List> stops;
	/**
 The first item in each tuple is the position in the gradient, where 0 is the start of the gradient and 1 is the end of the gradient. Multiple stops can be applied. The second item is the color for each stop. This color can also be given in the rgba format. 
	*/
	public void setStops(List<List> stops) {
		this.stops = stops;
		this.setChanged();
		this.notifyObservers();
	}

	public List<List> getStops(){ return stops; }



	public HIGradientColorObject() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.linearGradient != null) {
			params.put("linearGradient", this.linearGradient);
		}
		if (this.radialGradient != null) {
			params.put("radialGradient", this.radialGradient);
		}
		if (this.stops != null) {
			List<Object> array = new List<>();
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