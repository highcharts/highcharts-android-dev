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



public class HIBreadcrumbs extends HIFoundation { 

	private Number zIndex;
	/**
 The z index of the breadcrumbs group. 
	*/
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }

	private HISVGAttributes style;
	/**
 CSS styles for all breadcrumbs. In styled mode, the breadcrumbs buttons are styled by the .highcharts-breadcrumbs-buttons .highcharts-button rule with its different states. 
	*/
	public void setStyle(HISVGAttributes style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getStyle(){ return style; }

	private String format;
	/**
 A format string for the breadcrumbs button. Variables are enclosed by curly brackets. Available values are passed in the declared point options. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/breadcrumbs/format">Display custom values in breadcrumb button.</a>
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private Boolean rtl;
	/**
 Whether to reverse the order of buttons. This is common in Arabic and Hebrew. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/breadcrumbs/rtl">Breadcrumbs in RTL</a>
	*/
	public void setRtl(Boolean rtl) {
		this.rtl = rtl;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRtl(){ return rtl; }

	private Boolean useHTML;
	/**
 Whether to use HTML to render the breadcrumbs items texts. 
	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private HISVGAttributes buttonTheme;
	/**
 A collection of attributes for the buttons. The object takes SVG attributes like fill, stroke, stroke-width, as well as style, a collection of CSS properties for the text. The object can also be extended with states, so you can set presentational options for hover, select or disabled button states. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/breadcrumbs/single-button">Themed, single button</a>
	*/
	public void setButtonTheme(HISVGAttributes buttonTheme) {
		this.buttonTheme = buttonTheme;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getButtonTheme(){ return buttonTheme; }

	private String relativeTo;
	/**
 What box to align the button to. Can be either plotBox or spacingBox. 
 <br><br><b>defaults:</b><br><br>&ensp;plotBox	*/
	public void setRelativeTo(String relativeTo) {
		this.relativeTo = relativeTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRelativeTo(){ return relativeTo; }

	private Number buttonSpacing;
	/**
 The defaults padding for each button and separator in each direction. 
	*/
	public void setButtonSpacing(Number buttonSpacing) {
		this.buttonSpacing = buttonSpacing;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getButtonSpacing(){ return buttonSpacing; }

	private HISeparator separator;
	/**
 Options object for Breadcrumbs separator. 
	*/
	public void setSeparator(HISeparator separator) {
		this.separator = separator;
		this.separator.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeparator getSeparator(){ return separator; }

	private Boolean showFullPath;
	/**
 Show full path or only a single button. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/breadcrumbs/single-button">Single, styled button</a>
	*/
	public void setShowFullPath(Boolean showFullPath) {
		this.showFullPath = showFullPath;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowFullPath(){ return showFullPath; }

	private HIBreadcrumbsAlignOptions position;
	/**
 Positioning for the button row. The breadcrumbs buttons will be aligned properly for the defaults chart layout (title, subtitle, legend, range selector) for the custom chart layout set the position properties. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/breadcrumbs/single-button">Single, right aligned button</a>
	*/
	public void setPosition(HIBreadcrumbsAlignOptions position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public HIBreadcrumbsAlignOptions getPosition(){ return position; }

	private Boolean floating;
	/**
 When the breadcrumbs are floating, the plot area will not move to make space for it. By defaults, the chart will not make space for the buttons. This property won't work when positioned in the middle. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/breadcrumbs/single-button">Floating button</a>
	*/
	public void setFloating(Boolean floating) {
		this.floating = floating;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFloating(){ return floating; }

	private HIFunction formatter;
	/**
 Callback function to format the breadcrumb text from scratch. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private HIEvents events;
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }



	public HIBreadcrumbs() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.rtl != null) {
			params.put("rtl", this.rtl);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.buttonTheme != null) {
			params.put("buttonTheme", this.buttonTheme.getParams());
		}
		if (this.relativeTo != null) {
			params.put("relativeTo", this.relativeTo);
		}
		if (this.buttonSpacing != null) {
			params.put("buttonSpacing", this.buttonSpacing);
		}
		if (this.separator != null) {
			params.put("separator", this.separator.getParams());
		}
		if (this.showFullPath != null) {
			params.put("showFullPath", this.showFullPath);
		}
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		return params;
	}

}