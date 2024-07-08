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



public class HIConnectorOptions extends HIFoundation { 

	private Number width;
	/**
 Pixel width of the connector line. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private String dashstyle;
	/**
 A name for the dash style to use for the connector. 
	*/
	public void setDashstyle(String dashstyle) {
		this.dashstyle = dashstyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashstyle(){ return dashstyle; }

	private String stroke;
	/**
 Color of the connector line. By defaults it's the series' color. 
	*/
	public void setStroke(String stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke(){ return stroke; }



	public HIConnectorOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.dashstyle != null) {
			params.put("dashstyle", this.dashstyle);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		return params;
	}

}