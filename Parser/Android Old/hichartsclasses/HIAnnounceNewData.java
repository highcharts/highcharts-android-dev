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
		return params;
	}

}