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



public class HITooltipFormatterContextObject extends HIFoundation { 

	private ArrayList points;
	/**
 Array of points in shared tooltips. 
	*/
	public void setPoints(ArrayList points) {
		this.points = points;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getPoints(){ return points; }



	public HITooltipFormatterContextObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.points != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.points) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("points", array);
		}
		return params;
	}

}