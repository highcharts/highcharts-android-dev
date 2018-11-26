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





public class HICredits extends Observable implements HIChartsJSONSerializable { 

	private HICSSObject style;
/**
/** CSS styles for the credits label. 
 <br><br><b>defaults:</b><br><br>&ensp;{"cursor": "pointer", "color": "#999999", "fontSize": "10px"}*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String text;
/**
/** The text for the credits label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/href/">Custom URL and text</a>
*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private Boolean enabled;
/**
/** Whether to show the credits text. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/enabled-false/">Credits disabled</a>
*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private String href;
/**
/** The URL for the credits label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/href/">Custom URL and text</a>
*/
	public void setHref(String href) {
		this.href = href;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHref(){ return href; }

	private HIPosition position;
/**
/** Position configuration for the credits label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/position-left/">Left aligned</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/position-left/">Left aligned</a>
*/
	public void setPosition(HIPosition position) {
		this.position = position;
		this.position.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPosition getPosition(){ return position; }



	public HICredits() {

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
			params.put("style", this.style);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.href != null) {
			params.put("href", this.href);
		}
		if (this.position != null) {
			params.put("position", this.position.getParams());
		}
		return params;
	}

}