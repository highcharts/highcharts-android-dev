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



public class HIExportData extends HIFoundation { 

	private String annotationHeader;
	/**
 The annotation column title. 
 <br><br><b>defaults:</b><br><br>&ensp;Annotations	*/
	public void setAnnotationHeader(String annotationHeader) {
		this.annotationHeader = annotationHeader;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAnnotationHeader(){ return annotationHeader; }

	private String categoryHeader;
	/**
 The category column title. 
 <br><br><b>defaults:</b><br><br>&ensp;Category	*/
	public void setCategoryHeader(String categoryHeader) {
		this.categoryHeader = categoryHeader;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCategoryHeader(){ return categoryHeader; }

	private String categoryDatetimeHeader;
	/**
 The category column title when axis type set to "datetime". 
 <br><br><b>defaults:</b><br><br>&ensp;DateTime	*/
	public void setCategoryDatetimeHeader(String categoryDatetimeHeader) {
		this.categoryDatetimeHeader = categoryDatetimeHeader;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCategoryDatetimeHeader(){ return categoryDatetimeHeader; }



	public HIExportData() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.annotationHeader != null) {
			params.put("annotationHeader", this.annotationHeader);
		}
		if (this.categoryHeader != null) {
			params.put("categoryHeader", this.categoryHeader);
		}
		if (this.categoryDatetimeHeader != null) {
			params.put("categoryDatetimeHeader", this.categoryDatetimeHeader);
		}
		return params;
	}

}