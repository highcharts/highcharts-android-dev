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



public class HIDrillUpButton extends HIFoundation { 

	private HIAlignObject position;
	/**
 Positioning options for the button within the relativeTo box. Available properties are x, y, align and verticalAlign. 
	*/
	public void setPosition(HIAlignObject position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAlignObject getPosition(){ return position; }

	private Object theme;
	/**
 A collection of attributes for the button. The object takes SVG attributes like fill, stroke, stroke-width or r, the border radius. The theme also supports style, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in theme.states.hover. In styled mode, drill-up button styles can be applied with the .highcharts-drillup-button class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/">Button theming</a>
	*/
	public void setTheme(Object theme) {
		this.theme = theme;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getTheme(){ return theme; }

	private String relativeTo;
	/**
 What box to align the button to. Can be either plotBox or spacingBox. <br><br><b>accepted values:</b><br><br>&ensp;["plotBox", "spacingBox"]
 <br><br><b>defaults:</b><br><br>&ensp;plotBox	*/
	public void setRelativeTo(String relativeTo) {
		this.relativeTo = relativeTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRelativeTo(){ return relativeTo; }



	public HIDrillUpButton() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.theme != null) {
			params.put("theme", this.theme);
		}
		if (this.relativeTo != null) {
			params.put("relativeTo", this.relativeTo);
		}
		return params;
	}

}