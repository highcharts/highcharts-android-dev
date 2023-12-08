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



public class HIPlotLineOrBand extends HIFoundation { 

	private HISVGElement label;
	/**
 SVG element of the label. 
	*/
	public void setLabel(HISVGElement label) {
		this.label = label;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getLabel(){ return label; }

	private HISVGElement svgElement;
	/**
 SVG element of the plot line or band. 
	*/
	public void setSvgElement(HISVGElement svgElement) {
		this.svgElement = svgElement;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getSvgElement(){ return svgElement; }



	public HIPlotLineOrBand() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.label != null) {
			params.put("label", this.label.getParams());
		}
		if (this.svgElement != null) {
			params.put("svgElement", this.svgElement.getParams());
		}
		return params;
	}

}