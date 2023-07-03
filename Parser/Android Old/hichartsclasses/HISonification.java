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



public class HISonification extends HIFoundation { 

	private String playAsSoundClickAnnouncement;
	public void setPlayAsSoundClickAnnouncement(String playAsSoundClickAnnouncement) {
		this.playAsSoundClickAnnouncement = playAsSoundClickAnnouncement;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPlayAsSoundClickAnnouncement(){ return playAsSoundClickAnnouncement; }

	private String playAsSoundButtonText;
	public void setPlayAsSoundButtonText(String playAsSoundButtonText) {
		this.playAsSoundButtonText = playAsSoundButtonText;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPlayAsSoundButtonText(){ return playAsSoundButtonText; }



	public HISonification() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.playAsSoundClickAnnouncement != null) {
			params.put("playAsSoundClickAnnouncement", this.playAsSoundClickAnnouncement);
		}
		if (this.playAsSoundButtonText != null) {
			params.put("playAsSoundButtonText", this.playAsSoundButtonText);
		}
		return params;
	}

}