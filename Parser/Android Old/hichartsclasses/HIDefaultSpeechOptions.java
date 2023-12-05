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



public class HIDefaultSpeechOptions extends HIFoundation { 

	private HIPointGrouping pointGrouping;
	/**
/** * description: Options for point grouping, specifically for instrument tracks. 
*/
	public void setPointGrouping(HIPointGrouping pointGrouping) {
		this.pointGrouping = pointGrouping;
		this.pointGrouping.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointGrouping getPointGrouping(){ return pointGrouping; }

	private String type;
	/**
/** * description: Type of track. Always `"instrument"` for instrument tracks, and `"speech"` for speech tracks. 
* defaults: speech
*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private HIMapping mapping;
	/**
/** * description: Mapping configuration for the speech/audio parameters. All parameters except `text` can be either: - A string, referencing a point property to map to. - A number, setting the value of the speech parameter directly. - A callback function, returning the value programmatically. - An object defining detailed configuration of the mapping. If a function is used, it should return the desired value for the speech parameter. The function is called for each speech event to be played, and receives a context object parameter with `time`, and potentially `point` and `value` depending on the track. `point` is available if the audio event is related to a data point, and `value` is available if the track is used for a context track using `valueInterval`. * demo: * [Overview of common mapping parameters](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/mapping-overview) * [Various types of mapping used](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/pitch-mapping) * [Inverted mapping to property](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/polarity-invert) * [Logarithmic mapping to property](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/log-mapping) 
*/
	public void setMapping(HIMapping mapping) {
		this.mapping = mapping;
		this.mapping.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMapping getMapping(){ return mapping; }

	private String language;
	/**
 The language to speak in for speech tracks, as an IETF BCP 47 language tag. 
 <br><br><b>defaults:</b><br><br>&ensp;en-US	*/
	public void setLanguage(String language) {
		this.language = language;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLanguage(){ return language; }

	private String preferredVoice;
	/**
 Name of the voice synthesis to prefer for speech tracks. If not available, falls back to the defaults voice for the selected language. Different platforms provide different voices for web speech synthesis. 
	*/
	public void setPreferredVoice(String preferredVoice) {
		this.preferredVoice = preferredVoice;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPreferredVoice(){ return preferredVoice; }

	private Boolean showPlayMarker;
	/**
 Show play marker (tooltip and/or crosshair) for a track. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setShowPlayMarker(Boolean showPlayMarker) {
		this.showPlayMarker = showPlayMarker;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getShowPlayMarker(){ return showPlayMarker; }

	private HIActiveWhen activeWhen;
	/**
 Define a condition for when a track should be active and not. Can either be a function callback or a configuration object. If a function is used, it should return a `boolean` for whether or not the track should be active. The function is called for each audio event, and receives a parameter object with `time`, and potentially `point` and `value` properties depending on the track. `point` is available if the audio event is related to a data point. `value` is available if the track is used as a context track, and `valueInterval` is used. 
	*/
	public void setActiveWhen(HIActiveWhen activeWhen) {
		this.activeWhen = activeWhen;
		this.activeWhen.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIActiveWhen getActiveWhen(){ return activeWhen; }



	public HIDefaultSpeechOptions() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.pointGrouping != null) {
			params.put("pointGrouping", this.pointGrouping.getParams());
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.mapping != null) {
			params.put("mapping", this.mapping.getParams());
		}
		if (this.language != null) {
			params.put("language", this.language);
		}
		if (this.preferredVoice != null) {
			params.put("preferredVoice", this.preferredVoice);
		}
		if (this.showPlayMarker != null) {
			params.put("showPlayMarker", this.showPlayMarker);
		}
		if (this.activeWhen != null) {
			params.put("activeWhen", this.activeWhen.getParams());
		}
		return params;
	}

}