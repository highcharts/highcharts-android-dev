/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.HashMap;



public class HIAnnounceNewData extends HIFoundation { 

	private String newDataAnnounce;
	public void setNewDataAnnounce(String newDataAnnounce) {
		this.newDataAnnounce = newDataAnnounce;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNewDataAnnounce(){ return newDataAnnounce; }

	private String newSeriesAnnounceMultiple;
	public void setNewSeriesAnnounceMultiple(String newSeriesAnnounceMultiple) {
		this.newSeriesAnnounceMultiple = newSeriesAnnounceMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNewSeriesAnnounceMultiple(){ return newSeriesAnnounceMultiple; }

	private String newSeriesAnnounceSingle;
	public void setNewSeriesAnnounceSingle(String newSeriesAnnounceSingle) {
		this.newSeriesAnnounceSingle = newSeriesAnnounceSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNewSeriesAnnounceSingle(){ return newSeriesAnnounceSingle; }

	private String newPointAnnounceMultiple;
	public void setNewPointAnnounceMultiple(String newPointAnnounceMultiple) {
		this.newPointAnnounceMultiple = newPointAnnounceMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNewPointAnnounceMultiple(){ return newPointAnnounceMultiple; }

	private String newPointAnnounceSingle;
	public void setNewPointAnnounceSingle(String newPointAnnounceSingle) {
		this.newPointAnnounceSingle = newPointAnnounceSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNewPointAnnounceSingle(){ return newPointAnnounceSingle; }

	private Boolean enabled;
	/**
 Enable announcing new data to screen reader users <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/accessible-dynamic">Dynamic data accessible</a>
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIFunction announcementFormatter;
	/**
 Optional formatter callback for the announcement. Receives up to three arguments. The first argument is always an array of all series that received updates. If an announcement is already queued, the series that received updates for that announcement are also included in this array. The second argument is provided if chart.addSeries was called, and there is a new series. In that case, this argument is a reference to the new series. The third argument, similarly, is provided if series.addPoint was called, and there is a new point. In that case, this argument is a reference to the new point. The function should return a string with the text to announce to the user. Return empty string to not announce anything. Return false to use the defaults announcement format. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-dynamic">High priority live alerts</a>
	*/
	public void setAnnouncementFormatter(HIFunction announcementFormatter) {
		this.announcementFormatter = announcementFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getAnnouncementFormatter(){ return announcementFormatter; }

	private Boolean interruptUser;
	/**
 Choose whether or not the announcements should interrupt the screen reader. If not enabled, the user will be notified once idle. It is recommended not to enable this setting unless there is a specific reason to do so. 
	*/
	public void setInterruptUser(Boolean interruptUser) {
		this.interruptUser = interruptUser;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInterruptUser(){ return interruptUser; }

	private Number minAnnounceInterval;
	/**
 Minimum interval between announcements in milliseconds. If new data arrives before this amount of time has passed, it is queued for announcement. If another new data event happens while an announcement is queued, the queued announcement is dropped, and the latest announcement is queued instead. Set to 0 to allow all announcements, but be warned that frequent announcements are disturbing to users. 
	*/
	public void setMinAnnounceInterval(Number minAnnounceInterval) {
		this.minAnnounceInterval = minAnnounceInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinAnnounceInterval(){ return minAnnounceInterval; }



	public HIAnnounceNewData() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.newDataAnnounce != null) {
			params.put("newDataAnnounce", this.newDataAnnounce);
		}
		if (this.newSeriesAnnounceMultiple != null) {
			params.put("newSeriesAnnounceMultiple", this.newSeriesAnnounceMultiple);
		}
		if (this.newSeriesAnnounceSingle != null) {
			params.put("newSeriesAnnounceSingle", this.newSeriesAnnounceSingle);
		}
		if (this.newPointAnnounceMultiple != null) {
			params.put("newPointAnnounceMultiple", this.newPointAnnounceMultiple);
		}
		if (this.newPointAnnounceSingle != null) {
			params.put("newPointAnnounceSingle", this.newPointAnnounceSingle);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.announcementFormatter != null) {
			params.put("announcementFormatter", this.announcementFormatter);
		}
		if (this.interruptUser != null) {
			params.put("interruptUser", this.interruptUser);
		}
		if (this.minAnnounceInterval != null) {
			params.put("minAnnounceInterval", this.minAnnounceInterval);
		}
		return params;
	}

}