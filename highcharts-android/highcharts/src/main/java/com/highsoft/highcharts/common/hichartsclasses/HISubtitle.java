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



public class HISubtitle extends HIFoundation { 

	private HICSSObject style;
	/**
 CSS styles for the title. In styled mode, the subtitle style is given in the `.highcharts-subtitle` class. 
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#666666"}	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String verticalAlign;
	/**
 The vertical alignment of the title. Can be one of `"top"`, `"middle"` and `"bottom"`. When middle, the subtitle behaves as floating. 
	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String text;
	/**
 The subtitle of the chart. 
	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
	/**
 The horizontal alignment of the subtitle. Can be one of "left", "center" and "right". 
 <br><br><b>defaults:</b><br><br>&ensp;center	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Number y;
	/**
 The y position of the subtitle relative to the alignment within `chart.spacingTop` and `chart.spacingBottom`. By defaults the subtitle is laid out below the title unless the title is floating. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 The x position of the subtitle relative to the alignment within `chart.spacingLeft` and `chart.spacingRight`. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Boolean floating;
	/**
 When the subtitle is floating, the plot area will not move to make space for it. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setFloating(Boolean floating) {
		this.floating = floating;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFloating(){ return floating; }

	private Number widthAdjust;
	/**
 Adjustment made to the subtitle width, normally to reserve space for the exporting burger menu. 
 <br><br><b>defaults:</b><br><br>&ensp;-44	*/
	public void setWidthAdjust(Number widthAdjust) {
		this.widthAdjust = widthAdjust;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidthAdjust(){ return widthAdjust; }

	private Boolean useHTML;
	/**
 Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the text. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }



	public HISubtitle() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.widthAdjust != null) {
			params.put("widthAdjust", this.widthAdjust);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		return params;
	}

}