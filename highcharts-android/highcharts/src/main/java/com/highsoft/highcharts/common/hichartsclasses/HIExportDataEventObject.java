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



public class HIExportDataEventObject extends HIFoundation { 

	private ArrayList<ArrayList<String>> dataRows;
	/**
 Contains the data rows for the current export task and can be modified. 
	*/
	public void setDataRows(ArrayList<ArrayList<String>> dataRows) {
		this.dataRows = dataRows;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<ArrayList<String>> getDataRows(){ return dataRows; }



	public HIExportDataEventObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.dataRows != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.dataRows) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("dataRows", array);
		}
		return params;
	}

}