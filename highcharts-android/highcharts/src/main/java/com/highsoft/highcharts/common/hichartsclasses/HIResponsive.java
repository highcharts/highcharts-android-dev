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



public class HIResponsive extends HIFoundation { 

	private ArrayList <HIRules> rules;
	/**
 A set of rules for responsive settings. The rules are executed from the top down. 
	*/
	public void setRules(ArrayList rules) {
		this.rules = rules;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getRules(){ return rules; }



	public HIResponsive() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.rules != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.rules) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("rules", array);
		}
		return params;
	}

}