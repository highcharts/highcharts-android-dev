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



public class HIItems extends HIFoundation { 

	private HICSSObject style;
	/**
 CSS styles for each label. To position the label, use left and top like this: style: {   left: '100px',   top: '100px' } 
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String html;
	/**
 Inner HTML or text for the label. 
	*/
	public void setHtml(String html) {
		this.html = html;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHtml(){ return html; }



	public HIItems() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.html != null) {
			params.put("html", this.html);
		}
		return params;
	}

}