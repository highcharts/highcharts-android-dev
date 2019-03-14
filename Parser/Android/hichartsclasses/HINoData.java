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



public class HINoData extends HIFoundation { 

	private HIAlignObject position;
	/**
 The position of the no-data label, relative to the plot area. 
	*/
	public void setPosition(HIAlignObject position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAlignObject getPosition(){ return position; }

	private HICSSObject style;
	/**
 CSS styles for the no-data label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/no-data-to-display/no-data-line">Styled no-data text</a>
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private HISVGAttributes attr;
	/**
 An object of additional SVG attributes for the no-data label. 
	*/
	public void setAttr(HISVGAttributes attr) {
		this.attr = attr;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getAttr(){ return attr; }

	private Boolean useHTML;
	/**
 Whether to insert the label as HTML, or as pseudo-HTML rendered with SVG. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }



	public HINoData() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.attr != null) {
			params.put("attr", this.attr.getParams());
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		return params;
	}

}