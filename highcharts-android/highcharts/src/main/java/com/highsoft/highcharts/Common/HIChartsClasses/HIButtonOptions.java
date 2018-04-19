/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



public class HIButtonOptions extends Observable implements HIChartsJSONSerializable { 

	private String verticalAlign;
/**
The vertical alignment of the buttons. Can be one of "top", "middle"
or "bottom".
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/">Buttons at lower right</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"] <br><br><b>default:</b><br><br>&ensp;top*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private HIColor symbolFill;
/**
Fill color for the symbol within the button.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/">Blue symbol stroke for one of the buttons</a> <br><br><b>default:</b><br><br>&ensp;#666666*/
	public void setSymbolFill(HIColor symbolFill) {
		this.symbolFill = symbolFill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSymbolFill(){ return symbolFill; }

	private String text;
/**
A text string to add to the individual button.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/">Full text button</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/">Combined symbol and text</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
/**
Alignment for the buttons.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-align/">Center aligned</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"] <br><br><b>default:</b><br><br>&ensp;right*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean enabled;
/**
Whether to enable buttons.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/">Exporting module loaded but buttons disabled</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HITheme theme;
/**
A configuration object for the button theme. The object accepts
SVG properties like stroke-width, stroke and fill. Tri-state
button styles are supported by the states.hover and states.select
objects.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-theme/">Theming the buttons</a>*/
	public void setTheme(HITheme theme) {
		this.theme = theme;
		this.theme.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITheme getTheme(){ return theme; }

	private Number height;
/**
Pixel height of the buttons.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a> <br><br><b>default:</b><br><br>&ensp;22*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number width;
/**
The pixel width of the button.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a> <br><br><b>default:</b><br><br>&ensp;24*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number buttonSpacing;
/**
The pixel spacing between buttons.
 <br><br><b>default:</b><br><br>&ensp;3*/
	public void setButtonSpacing(Number buttonSpacing) {
		this.buttonSpacing = buttonSpacing;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getButtonSpacing(){ return buttonSpacing; }

	private Number symbolSize;
/**
The pixel size of the symbol on the button.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a> <br><br><b>default:</b><br><br>&ensp;14*/
	public void setSymbolSize(Number symbolSize) {
		this.symbolSize = symbolSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolSize(){ return symbolSize; }

	private Number y;
/**
The vertical offset of the button's position relative to its
verticalAlign.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/">Buttons at lower right</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private HIColor symbolStroke;
/**
The color of the symbol's stroke or line.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/">Blue symbol stroke</a> <br><br><b>default:</b><br><br>&ensp;#666666*/
	public void setSymbolStroke(HIColor symbolStroke) {
		this.symbolStroke = symbolStroke;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSymbolStroke(){ return symbolStroke; }

	private Number symbolY;
/**
The y position of the center of the symbol inside the button.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a> <br><br><b>default:</b><br><br>&ensp;10.5*/
	public void setSymbolY(Number symbolY) {
		this.symbolY = symbolY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolY(){ return symbolY; }

	private Number symbolX;
/**
The x position of the center of the symbol inside the button.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a> <br><br><b>default:</b><br><br>&ensp;12.5*/
	public void setSymbolX(Number symbolX) {
		this.symbolX = symbolX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolX(){ return symbolX; }

	private Number symbolStrokeWidth;
/**
The pixel stroke width of the symbol on the button.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public void setSymbolStrokeWidth(Number symbolStrokeWidth) {
		this.symbolStrokeWidth = symbolStrokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolStrokeWidth(){ return symbolStrokeWidth; }



	public HIButtonOptions() {

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
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.symbolFill != null) {
			params.put("symbolFill", this.symbolFill.getData());
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.theme != null) {
			params.put("theme", this.theme.getParams());
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.buttonSpacing != null) {
			params.put("buttonSpacing", this.buttonSpacing);
		}
		if (this.symbolSize != null) {
			params.put("symbolSize", this.symbolSize);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.symbolStroke != null) {
			params.put("symbolStroke", this.symbolStroke.getData());
		}
		if (this.symbolY != null) {
			params.put("symbolY", this.symbolY);
		}
		if (this.symbolX != null) {
			params.put("symbolX", this.symbolX);
		}
		if (this.symbolStrokeWidth != null) {
			params.put("symbolStrokeWidth", this.symbolStrokeWidth);
		}
		return params;
	}

}