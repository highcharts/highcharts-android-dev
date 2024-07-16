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



public class HIZooming extends HIFoundation { 

	private HIMouseWheel mouseWheel;
	/**
 The mouse wheel zoom is a feature included in Highcharts Stock, but is also available for Highcharts Core as a module. Zooming with the mouse wheel is enabled by defaults in Highcharts Stock. In Highcharts Core it is enabled if `chart.zooming.type` is set. It can be disabled by setting this option to `false`. 
	*/
	public void setMouseWheel(HIMouseWheel mouseWheel) {
		this.mouseWheel = mouseWheel;
		this.mouseWheel.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMouseWheel getMouseWheel(){ return mouseWheel; }

	private String pinchType;
	/**
 Equivalent to `type`, but for multitouch gestures only. By defaults, the `pinchType` is the same as the `type` setting. However, pinching can be enabled separately in some cases, for example in stock charts where a mouse drag pans the chart, while pinching is enabled. When `tooltip.followTouchMove` is true, pinchType only applies to two-finger touches. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setPinchType(String pinchType) {
		this.pinchType = pinchType;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPinchType(){ return pinchType; }

	private HIResetButton resetButton;
	/**
 The button that appears after a selection zoom, allowing the user to reset zoom. 
	*/
	public void setResetButton(HIResetButton resetButton) {
		this.resetButton = resetButton;
		this.resetButton.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIResetButton getResetButton(){ return resetButton; }

	private String key;
	/**
 Set a key to hold when dragging to zoom the chart. This is useful to avoid zooming while moving points. Should be set different than `chart.panKey`. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setKey(String key) {
		this.key = key;
		this.setChanged();
		this.notifyObservers();
	}

	public String getKey(){ return key; }

	private Boolean singleTouch;
	/**
 Enables zooming by a single touch, in combination with `chart.zooming.type`. When enabled, two-finger pinch will still work as set up by [chart.zooming.pinchType] (#chart.zooming.pinchType). However, `singleTouch` will interfere with touch-dragging the chart to read the tooltip. And especially when vertical zooming is enabled, it will make it hard to scroll vertically on the page. 
	*/
	public void setSingleTouch(Boolean singleTouch) {
		this.singleTouch = singleTouch;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSingleTouch(){ return singleTouch; }

	private String type;
	/**
 Decides in what dimensions the user can zoom by dragging the mouse. Can be one of `x`, `y` or `xy`. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }



	public HIZooming() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.mouseWheel != null) {
			params.put("mouseWheel", this.mouseWheel.getParams());
		}
		if (this.pinchType != null) {
			params.put("pinchType", this.pinchType);
		}
		if (this.resetButton != null) {
			params.put("resetButton", this.resetButton.getParams());
		}
		if (this.key != null) {
			params.put("key", this.key);
		}
		if (this.singleTouch != null) {
			params.put("singleTouch", this.singleTouch);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		return params;
	}

}