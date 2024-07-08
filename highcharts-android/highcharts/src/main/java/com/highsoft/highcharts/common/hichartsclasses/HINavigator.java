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



public class HINavigator extends HIFoundation { 

	private String groupLabel;
	/**
 Label for the navigator region. Receives `chart` as context. 
 <br><br><b>defaults:</b><br><br>&ensp;Axis zoom	*/
	public void setGroupLabel(String groupLabel) {
		this.groupLabel = groupLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGroupLabel(){ return groupLabel; }

	private String handleLabel;
	/**
 Label for the navigator handles. Receives `handleIx` and `chart` as context. `handleIx` refers to the index of the navigator handle. 
 <br><br><b>defaults:</b><br><br>&ensp;{#eq handleIx 0}Start, percent{else}End, percent{/eq}	*/
	public void setHandleLabel(String handleLabel) {
		this.handleLabel = handleLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHandleLabel(){ return handleLabel; }

	private String changeAnnouncement;
	/**
 Announcement for assistive technology when navigator values are changed. Receives `axisRangeDescription` and `chart` as context. `axisRangeDescription` corresponds to the range description defined in `lang.accessibility.axis` 
 <br><br><b>defaults:</b><br><br>&ensp;{axisRangeDescription}	*/
	public void setChangeAnnouncement(String changeAnnouncement) {
		this.changeAnnouncement = changeAnnouncement;
		this.setChanged();
		this.notifyObservers();
	}

	public String getChangeAnnouncement(){ return changeAnnouncement; }



	public HINavigator() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.groupLabel != null) {
			params.put("groupLabel", this.groupLabel);
		}
		if (this.handleLabel != null) {
			params.put("handleLabel", this.handleLabel);
		}
		if (this.changeAnnouncement != null) {
			params.put("changeAnnouncement", this.changeAnnouncement);
		}
		return params;
	}

}