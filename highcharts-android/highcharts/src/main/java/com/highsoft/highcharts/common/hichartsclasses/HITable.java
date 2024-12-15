/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import java.util.HashMap;



public class HITable extends HIFoundation { 

	private String tableSummary;
	public void setTableSummary(String tableSummary) {
		this.tableSummary = tableSummary;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTableSummary(){ return tableSummary; }

	private String viewAsDataTableButtonText;
	public void setViewAsDataTableButtonText(String viewAsDataTableButtonText) {
		this.viewAsDataTableButtonText = viewAsDataTableButtonText;
		this.setChanged();
		this.notifyObservers();
	}

	public String getViewAsDataTableButtonText(){ return viewAsDataTableButtonText; }



	public HITable() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.tableSummary != null) {
			params.put("tableSummary", this.tableSummary);
		}
		if (this.viewAsDataTableButtonText != null) {
			params.put("viewAsDataTableButtonText", this.viewAsDataTableButtonText);
		}
		return params;
	}

}