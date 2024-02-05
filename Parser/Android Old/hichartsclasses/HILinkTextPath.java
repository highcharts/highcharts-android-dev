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



public class HILinkTextPath extends HIFoundation { 

	private HIAttributes attributes;
	public void setAttributes(HIAttributes attributes) {
		this.attributes = attributes;
		this.attributes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAttributes getAttributes(){ return attributes; }

	private Boolean enabled;
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean defer;
	public void setDefer(Boolean defer) {
		this.defer = defer;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getDefer(){ return defer; }

	private HIStyle style;
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private HILinkTextPath linkTextPath;
	/**
 Options for a _link_ label text which should follow link connection. Border and background are disabled for a label that follows a path. **Note:** Only SVG-based renderer supports this option. Setting `useHTML` to true will disable this option. 
	*/
	public void setLinkTextPath(HILinkTextPath linkTextPath) {
		this.linkTextPath = linkTextPath;
		this.linkTextPath.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILinkTextPath getLinkTextPath(){ return linkTextPath; }



	public HILinkTextPath() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.attributes != null) {
			params.put("attributes", this.attributes.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.defer != null) {
			params.put("defer", this.defer);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.linkTextPath != null) {
			params.put("linkTextPath", this.linkTextPath.getParams());
		}
		return params;
	}

}