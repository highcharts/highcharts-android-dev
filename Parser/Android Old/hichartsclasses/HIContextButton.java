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
import com.highsoft.highcharts.common.HIColor;



public class HIContextButton extends HIFoundation { 

	private HIColor symbolFill;
	/**
/** * description: See `navigation.buttonOptions.symbolFill`. * demo: * [Blue symbol stroke for one of the buttons](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/) 
* defaults: #666666
*/
	public void setSymbolFill(HIColor symbolFill) {
		this.symbolFill = symbolFill;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSymbolFill(){ return symbolFill; }

	private ArrayList<String> menuItems;
	/**
 A collection of strings pointing to config options for the menu items. The config options are defined in the `menuItemDefinitions` option. By defaults, there is the "View in full screen" and "Print" menu items, plus one menu item for each of the available export types. 
 <br><br><b>defaults:</b><br><br>&ensp;["viewFullscreen", "printChart", "separator", "downloadPNG", "downloadJPEG", "downloadPDF", "downloadSVG"]	*/
	public void setMenuItems(ArrayList<String> menuItems) {
		this.menuItems = menuItems;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getMenuItems(){ return menuItems; }

	private String className;
	/**
 The class name of the context button. 
 <br><br><b>defaults:</b><br><br>&ensp;highcharts-contextbutton	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIFunction onclick;
	/**
 A click handler callback to use on the button directly instead of the popup menu. 
	*/
	public void setOnclick(HIFunction onclick) {
		this.onclick = onclick;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getOnclick(){ return onclick; }

	private String titleKey;
	/**
 The key to a `lang` option setting that is used for the button's title tooltip. When the key is `contextButtonTitle`, it refers to `lang.contextButtonTitle` that defaultss to "Chart context menu". 
 <br><br><b>defaults:</b><br><br>&ensp;contextButtonTitle	*/
	public void setTitleKey(String titleKey) {
		this.titleKey = titleKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTitleKey(){ return titleKey; }

	private Number x;
	/**
 The horizontal position of the button relative to the `align` option. 
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
 <br><br><b>defaults:</b><br><br>&ensp;highcharts-contextmenu	*/
	public void setMenuClassName(String menuClassName) {
		this.menuClassName = menuClassName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMenuClassName(){ return menuClassName; }

	private String symbol;
	/**
 The symbol for the button. Points to a definition function in the `Highcharts.Renderer.symbols` collection. The defaults `menu` function is part of the exporting module. Possible values are "circle", "square", "diamond", "triangle", "triangle-down", "menu", "menuball" or custom shape. 
 <br><br><b>defaults:</b><br><br>&ensp;menu	*/
	public void setSymbol(String symbol) {
		this.symbol = symbol;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSymbol(){ return symbol; }

	private HIColor symbolStroke;
	/**
 The color of the symbol's stroke or line. 
 <br><br><b>defaults:</b><br><br>&ensp;#666666	*/
	public void setSymbolStroke(HIColor symbolStroke) {
		this.symbolStroke = symbolStroke;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getSymbolStroke(){ return symbolStroke; }

	private String text;
	/**
 A text string to add to the individual button. 
 <br><br><b>defaults:</b><br><br>&ensp;null	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
	/**
 Alignment for the buttons. 
 <br><br><b>defaults:</b><br><br>&ensp;right	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean enabled;
	/**
 Whether to enable buttons. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HITheme theme;
	/**
 A configuration object for the button theme. The object accepts SVG properties like `stroke-width`, `stroke` and `fill`. Tri-state button styles are supported by the `states.hover` and `states.select` objects. 
	*/
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
 <br><br><b>defaults:</b><br><br>&ensp;28	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private Number width;
	/**
 The pixel width of the button. 
 <br><br><b>defaults:</b><br><br>&ensp;28	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number buttonSpacing;
	/**
 The pixel spacing between buttons. 
 <br><br><b>defaults:</b><br><br>&ensp;3	*/
	public void setButtonSpacing(Number buttonSpacing) {
		this.buttonSpacing = buttonSpacing;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getButtonSpacing(){ return buttonSpacing; }

	private Number symbolSize;
	/**
 The pixel size of the symbol on the button. 
 <br><br><b>defaults:</b><br><br>&ensp;14	*/
	public void setSymbolSize(Number symbolSize) {
		this.symbolSize = symbolSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolSize(){ return symbolSize; }

	private Number y;
	/**
 The vertical offset of the button's position relative to its `verticalAlign`. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private String verticalAlign;
	/**
 The vertical alignment of the buttons. Can be one of `"top"`, `"middle"` or `"bottom"`. 
 <br><br><b>defaults:</b><br><br>&ensp;top	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private Number symbolY;
	/**
 The y position of the center of the symbol inside the button. 
 <br><br><b>defaults:</b><br><br>&ensp;13.5	*/
	public void setSymbolY(Number symbolY) {
		this.symbolY = symbolY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolY(){ return symbolY; }

	private Number symbolX;
	/**
 The x position of the center of the symbol inside the button. 
 <br><br><b>defaults:</b><br><br>&ensp;14.5	*/
	public void setSymbolX(Number symbolX) {
		this.symbolX = symbolX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolX(){ return symbolX; }

	private Number symbolStrokeWidth;
	/**
 The pixel stroke width of the symbol on the button. 
 <br><br><b>defaults:</b><br><br>&ensp;3	*/
	public void setSymbolStrokeWidth(Number symbolStrokeWidth) {
		this.symbolStrokeWidth = symbolStrokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSymbolStrokeWidth(){ return symbolStrokeWidth; }

	private Boolean useHTML;
	/**
 Whether to use HTML for rendering the button. HTML allows for things like inline CSS or image-based icons. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }



	public HIContextButton() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.symbolFill != null) {
			params.put("symbolFill", this.symbolFill.getData());
		}
		if (this.menuItems != null) {
			ArrayList<Object> array = new ArrayList<>();
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
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
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
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		return params;
	}

}