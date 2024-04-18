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

	private Boolean showCrosshair;
	/**
 Show X and Y axis crosshairs (if they exist) as the chart plays. Note that if multiple tracks that play at different times try to show the crosshairs, it can be glitchy, so it is recommended in those cases to turn this on/off for individual tracks using the `showPlayMarker` option. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setShowCrosshair(Boolean showCrosshair) {
		this.showCrosshair = showCrosshair;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowCrosshair(){ return showCrosshair; }

	private Number afterSeriesWait;
	/**
 The time to wait in milliseconds after each data series when playing the series one after the other. 
 <br><br><b>defaults:</b><br><br>&ensp;700	*/
	public void setAfterSeriesWait(Number afterSeriesWait) {
		this.afterSeriesWait = afterSeriesWait;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAfterSeriesWait(){ return afterSeriesWait; }

	private Number masterVolume;
	/**
 Overall/master volume for the sonification, from 0 to 1. 
 <br><br><b>defaults:</b><br><br>&ensp;0.7	*/
	public void setMasterVolume(Number masterVolume) {
		this.masterVolume = masterVolume;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMasterVolume(){ return masterVolume; }

	private Boolean showTooltip;
	/**
 Show tooltip as the chart plays. Note that if multiple tracks that play at different times try to show the tooltip, it can be glitchy, so it is recommended in those cases to turn this on/off for individual tracks using the `showPlayMarker` option. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setShowTooltip(Boolean showTooltip) {
		this.showTooltip = showTooltip;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowTooltip(){ return showTooltip; }

	private HIDefaultInstrumentOptions defaultsInstrumentOptions;
	/**
 Default sonification options for all instrument tracks. If specific options are also set on individual tracks or per series, those will override these options. 
	*/
	public void setDefaultInstrumentOptions(HIDefaultInstrumentOptions defaultsInstrumentOptions) {
		this.defaultsInstrumentOptions = defaultsInstrumentOptions;
		this.defaultsInstrumentOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDefaultInstrumentOptions getDefaultInstrumentOptions(){ return defaultsInstrumentOptions; }

	private Boolean enabled;
	/**
 Enable sonification functionality for the chart. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private ArrayList <HIGlobalContextTracks> globalContextTracks;
	/**
 Context tracks to add globally, an array of either instrument tracks, speech tracks, or a mix. Context tracks are not tied to data points, but play at a set interval - either based on time or on prop values. 
	*/
	public void setGlobalContextTracks(ArrayList globalContextTracks) {
		this.globalContextTracks = globalContextTracks;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getGlobalContextTracks(){ return globalContextTracks; }

	private HIEvents events;
	/**
 Set up event handlers for the sonification 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private HIPointGrouping pointGrouping;
	/**
 Options for grouping data points together when sonifying. This allows for the visual presentation to contain more points than what is being played. If not enabled, all visible / uncropped points are played. 
	*/
	public void setPointGrouping(HIPointGrouping pointGrouping) {
		this.pointGrouping = pointGrouping;
		this.pointGrouping.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointGrouping getPointGrouping(){ return pointGrouping; }

	private Number duration;
	/**
 The total duration of the sonification, in milliseconds. 
 <br><br><b>defaults:</b><br><br>&ensp;6000	*/
	public void setDuration(Number duration) {
		this.duration = duration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDuration(){ return duration; }

	private ArrayList <HIGlobalTracks> globalTracks;
	/**
 Global tracks to add to every series. Defined as an array of either instrument or speech tracks, or a combination. 
	*/
	public void setGlobalTracks(ArrayList globalTracks) {
		this.globalTracks = globalTracks;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getGlobalTracks(){ return globalTracks; }

	private Number updateInterval;
	/**
 How long to wait between each recomputation of the sonification, if the chart updates rapidly. This avoids slowing down processes like panning. Given in milliseconds. 
 <br><br><b>defaults:</b><br><br>&ensp;200	*/
	public void setUpdateInterval(Number updateInterval) {
		this.updateInterval = updateInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getUpdateInterval(){ return updateInterval; }

	private String order;
	/**
 What order to play the data series in, either `sequential` where the series play individually one after the other, or `simultaneous` where the series play all at once. 
 <br><br><b>defaults:</b><br><br>&ensp;sequential	*/
	public void setOrder(String order) {
		this.order = order;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOrder(){ return order; }

	private HIDefaultSpeechOptions defaultsSpeechOptions;
	/**
 Default sonification options for all speech tracks. If specific options are also set on individual tracks or per series, those will override these options. 
	*/
	public void setDefaultSpeechOptions(HIDefaultSpeechOptions defaultsSpeechOptions) {
		this.defaultsSpeechOptions = defaultsSpeechOptions;
		this.defaultsSpeechOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDefaultSpeechOptions getDefaultSpeechOptions(){ return defaultsSpeechOptions; }

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

	private ArrayList <HITracks> tracks;
	/**
 Tracks for this series. Given as an array of instrument tracks, speech tracks, or a mix of both. 
	*/
	public void setTracks(ArrayList tracks) {
		this.tracks = tracks;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getTracks(){ return tracks; }

	private ArrayList <HIContextTracks> contextTracks;
	/**
 Context tracks for this series. Context tracks are tracks that are not tied to data points. Given as an array of instrument tracks, speech tracks, or a mix of both. 
	*/
	public void setContextTracks(ArrayList contextTracks) {
		this.contextTracks = contextTracks;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getContextTracks(){ return contextTracks; }



	public HISonification() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.showCrosshair != null) {
			params.put("showCrosshair", this.showCrosshair);
		}
		if (this.afterSeriesWait != null) {
			params.put("afterSeriesWait", this.afterSeriesWait);
		}
		if (this.masterVolume != null) {
			params.put("masterVolume", this.masterVolume);
		}
		if (this.showTooltip != null) {
			params.put("showTooltip", this.showTooltip);
		}
		if (this.defaultsInstrumentOptions != null) {
			params.put("defaultsInstrumentOptions", this.defaultsInstrumentOptions.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.globalContextTracks != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.globalContextTracks) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("globalContextTracks", array);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.pointGrouping != null) {
			params.put("pointGrouping", this.pointGrouping.getParams());
		}
		if (this.duration != null) {
			params.put("duration", this.duration);
		}
		if (this.globalTracks != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.globalTracks) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("globalTracks", array);
		}
		if (this.updateInterval != null) {
			params.put("updateInterval", this.updateInterval);
		}
		if (this.order != null) {
			params.put("order", this.order);
		}
		if (this.defaultsSpeechOptions != null) {
			params.put("defaultsSpeechOptions", this.defaultsSpeechOptions.getParams());
		}
		if (this.playAsSoundClickAnnouncement != null) {
			params.put("playAsSoundClickAnnouncement", this.playAsSoundClickAnnouncement);
		}
		if (this.playAsSoundButtonText != null) {
			params.put("playAsSoundButtonText", this.playAsSoundButtonText);
		}
		if (this.tracks != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.tracks) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("tracks", array);
		}
		if (this.contextTracks != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.contextTracks) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("contextTracks", array);
		}
		return params;
	}

}