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



public class HIResponsive extends HIFoundation { 

	private List <HIRules> rules;
	/**
 A set of rules for responsive settings. The rules are executed from the top down. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/responsive/axis/">Axis changes</a>
	*/
	public void setRules(List rules) {
		this.rules = rules;
		this.setChanged();
		this.notifyObservers();
	}

	public List getRules(){ return rules; }



	public HIResponsive() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.rules != null) {
			List<Object> array = new List<>();
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