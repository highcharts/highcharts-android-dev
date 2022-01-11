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



public class HITimeTicksInfoObject extends HIFoundation { 

	private ArrayList<String> higherRanks;
	public void setHigherRanks(ArrayList<String> higherRanks) {
		this.higherRanks = higherRanks;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getHigherRanks(){ return higherRanks; }

	private Number totalRange;
	public void setTotalRange(Number totalRange) {
		this.totalRange = totalRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTotalRange(){ return totalRange; }



	public HITimeTicksInfoObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.higherRanks != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.higherRanks) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("higherRanks", array);
		}
		if (this.totalRange != null) {
			params.put("totalRange", this.totalRange);
		}
		return params;
	}

}