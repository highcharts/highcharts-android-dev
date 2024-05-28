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



public class HIParentNode extends HIFoundation { 

	private Boolean allowPointSelect;
	/**
 Allow this series' parent nodes to be selected by clicking on the graph. 
	*/
	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowPointSelect(){ return allowPointSelect; }



	public HIParentNode() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.allowPointSelect != null) {
			params.put("allowPointSelect", this.allowPointSelect);
		}
		return params;
	}

}