/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HISubtitle extends Observable implements HIChartsJSONSerializable { 

	private HICSSObject style;
/**
/** CSS styles for the title. In styled mode, the subtitle style is given in the .highcharts-subtitle class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/style/">Custom color and weight</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a>
 <br><br><b>defaults:</b><br><br>&ensp;{"color": "#666666"}*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String verticalAlign;
/**
/** The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]
*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String text;
/**
/** The subtitle of the chart. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text/">Custom subtitle</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text-formatted/">Formatted and linked text.</a>
*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
/**
/** The horizontal alignment of the subtitle. Can be one of "left", "center" and "right". <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"]
*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Number y;
/**
/** The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By defaults the subtitle is laid out below the title unless the title is floating. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a>
*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
/**
/** The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a>
 <br><br><b>defaults:</b><br><br>&ensp;0*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Boolean floating;
/**
/** When the subtitle is floating, the plot area will not move to make space for it. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/floating/">Floating title and subtitle</a>
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setFloating(Boolean floating) {
		this.floating = floating;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFloating(){ return floating; }

	private Number widthAdjust;
/**
/** Adjustment made to the subtitle width, normally to reserve space for the exporting burger menu. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/">Wider menu, greater padding</a>
*/
	public void setWidthAdjust(Number widthAdjust) {
		this.widthAdjust = widthAdjust;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidthAdjust(){ return widthAdjust; }

	private Boolean useHTML;
/**
/** Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the text. 
 <br><br><b>defaults:</b><br><br>&ensp;false*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }



	public HISubtitle() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
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