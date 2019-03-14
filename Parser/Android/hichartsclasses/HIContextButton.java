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
import com.highsoft.highcharts.common.HIColor;



public class HIContextButton extends HIFoundation { 

	private HIColor symbolFill;
	/**
/** * description: See navigation.buttonOptions.symbolFill. * demo:  •  Blue symbol stroke for one of the buttons
* defaults: #666666
*/
	public void setSymbolFill(HIColor symbolFill) {
		this.symbolFill = symbolFill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSymbolFill(){ return symbolFill; }

	private List<String> menuItems;
	/**
 A collection of strings pointing to config options for the menu items. The config options are defined in the menuItemDefinitions option. By defaults, there is the "Print" menu item plus one menu item for each of the available export types. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
 <br><br><b>defaults:</b><br><br>&ensp;["printChart", "separator", "downloadPNG", "downloadJPEG", "downloadPDF", "downloadSVG"]	*/
	public void setMenuItems(List<String> menuItems) {
		this.menuItems = menuItems;
		this.setChanged();
		this.notifyObservers();
	}

	public List<String> getMenuItems(){ return menuItems; }

	private String className;
	/**
 The class name of the context button. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIFunction onclick;
	/**
 A click handler callback to use on the button directly instead of the popup menu. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-onclick/">Skip the menu and export the chart directly</a>
	*/
	public void setOnclick(HIFunction onclick) {
		this.onclick = onclick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnclick(){ return onclick; }

	private String titleKey;
	/**
 The key to a lang option setting that is used for the button's title tooltip. When the key is contextButtonTitle, it refers to lang.contextButtonTitle that defaultss to "Chart context menu". 
	*/
	public void setTitleKey(String titleKey) {
		this.titleKey = titleKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTitleKey(){ return titleKey; }

	private Number x;
	/**
 The horizontal position of the button relative to the align option. 
 <br><br><b>defaults:</b><br><br>&ensp;-10	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private String menuClassName;
	/**
 The class name of the menu appearing from the button. 
	*/
	public void setMenuClassName(String menuClassName) {
		this.menuClassName = menuClassName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMenuClassName(){ return menuClassName; }

	private String symbol;
	/**
 The symbol for the button. Points to a definition function in the Highcharts.Renderer.symbols collection. The defaults exportIcon function is part of the exporting module. Possible values are "circle", "square", "diamond", "triangle", "triangle-down", "menu", "menuball" or custom shape. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol/">Use a circle for symbol</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol-custom/">Custom shape as symbol</a> <br><br><b>accepted values:</b><br><br>&ensp;["menu", "menuball", "exportIcon", "circle", "square", "diamond", "triangle", "triangle-down"]
	*/
	public void setSymbol(String symbol) {
		this.symbol = symbol;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSymbol(){ return symbol; }

	private HIColor symbolStroke;
	/**
 The color of the symbol's stroke or line. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/">Blue symbol stroke</a>
	*/
	public void setSymbolStroke(HIColor symbolStroke) {
		this.symbolStroke = symbolStroke;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSymbolStroke(){ return symbolStroke; }

	private String text;
	/**
 A text string to add to the individual button. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/">Full text button</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/">Combined symbol and text</a>
 <br><br><b>defaults:</b><br><br>&ensp;null	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private Boolean enabled;
	/**
 Whether to enable buttons. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/">Exporting module loaded but buttons disabled</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HITheme theme;
	/**
 A configuration object for the button theme. The object accepts SVG properties like stroke-width, stroke and fill. Tri-state button styles are supported by the states.hover and states.select objects. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-theme/">Theming the buttons</a>
	*/
	public void setTheme(HITheme theme) {
		this.theme = theme;
		this.theme.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITheme getTheme(){ return theme; }

	private Number y;
	/**
 The vertical offset of the button's position relative to its verticalAlign. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/">Buttons at lower right</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number symbolStrokeWidth;
	/**
 The pixel stroke width of the symbol on the button. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a>
	*/
	public void setSymbolStrokeWidth(Number symbolStrokeWidth) {
		this.symbolStrokeWidth = symbolStrokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolStrokeWidth(){ return symbolStrokeWidth; }



	public HIContextButton() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.symbolFill != null) {
			params.put("symbolFill", this.symbolFill.getData());
		}
		if (this.menuItems != null) {
			List<Object> array = new List<>();
			for (Object obj : this.menuItems) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("menuItems", array);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.onclick != null) {
			params.put("onclick", this.onclick);
		}
		if (this.titleKey != null) {
			params.put("titleKey", this.titleKey);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.menuClassName != null) {
			params.put("menuClassName", this.menuClassName);
		}
		if (this.symbol != null) {
			params.put("symbol", this.symbol);
		}
		if (this.symbolStroke != null) {
			params.put("symbolStroke", this.symbolStroke.getData());
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.theme != null) {
			params.put("theme", this.theme.getParams());
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.symbolStrokeWidth != null) {
			params.put("symbolStrokeWidth", this.symbolStrokeWidth);
		}
		return params;
	}

}