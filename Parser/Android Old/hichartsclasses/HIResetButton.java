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



public class HIResetButton extends HIFoundation { 

	private HIAlignObject position;
	/**
 The position of the button. Note: Adjusting position values might cause overlap with chart elements. Ensure coordinates do not obstruct other components or data visibility. 
	*/
	public void setPosition(HIAlignObject position) {
		this.position = position;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAlignObject getPosition(){ return position; }

	private HISVGAttributes theme;
	/**
 A collection of attributes for the button. The object takes SVG attributes like `fill`, `stroke`, `stroke-width` or `r`, the border radius. The theme also supports `style`, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in `theme.states.hover`. 
	*/
	public void setTheme(HISVGAttributes theme) {
		this.theme = theme;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getTheme(){ return theme; }

	private String relativeTo;
	/**
 What frame the button placement should be related to. Can be either `plotBox` or `spacingBox`. 
 <br><br><b>defaults:</b><br><br>&ensp;plot	*/
	public void setRelativeTo(String relativeTo) {
		this.relativeTo = relativeTo;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRelativeTo(){ return relativeTo; }



	public HIResetButton() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		if (this.theme != null) {
			params.put("theme", this.theme.getParams());
		}
		if (this.relativeTo != null) {
			params.put("relativeTo", this.relativeTo);
		}
		return params;
	}

}