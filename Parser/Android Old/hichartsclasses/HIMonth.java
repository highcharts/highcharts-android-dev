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



public class HIMonth extends HIFoundation { 

	private String main;
	public void setMain(String main) {
		this.main = main;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMain(){ return main; }

	private ArrayList<String> list;
	public void setList(ArrayList<String> list) {
		this.list = list;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getList(){ return list; }



	public HIMonth() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.main != null) {
			params.put("main", this.main);
		}
		if (this.list != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.list) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("list", array);
		}
		return params;
	}

}