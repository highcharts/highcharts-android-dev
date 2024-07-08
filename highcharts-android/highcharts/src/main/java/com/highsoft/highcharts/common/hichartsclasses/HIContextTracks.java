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



public class HIContextTracks extends HIFoundation { 

	private Number timeInterval;
	/**
 Set a context track to play periodically every `timeInterval` milliseconds while the sonification is playing. 
	*/
	public void setTimeInterval(Number timeInterval) {
		this.timeInterval = timeInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTimeInterval(){ return timeInterval; }

	private Number valueInterval;
	/**
 Set a context track to play periodically every `valueInterval` units of a data property `valueProp` while the sonification is playing. For example, setting `valueProp` to `x` and `valueInterval` to 5 will play the context track for every 5th X value. The context audio events will be mapped to time according to the prop value relative to the min/max values for that prop. 
	*/
	public void setValueInterval(Number valueInterval) {
		this.valueInterval = valueInterval;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValueInterval(){ return valueInterval; }

	private String valueMapFunction;
	/**
 How to map context events to time when using the `valueInterval` option. 
 <br><br><b>defaults:</b><br><br>&ensp;"linear"	*/
	public void setValueMapFunction(String valueMapFunction) {
		this.valueMapFunction = valueMapFunction;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueMapFunction(){ return valueMapFunction; }

	private String valueProp;
	/**
 The point property to play context for when using `valueInterval`. 
 <br><br><b>defaults:</b><br><br>&ensp;"x"	*/
	public void setValueProp(String valueProp) {
		this.valueProp = valueProp;
		this.setChanged();
		this.notifyObservers();
	}

	public String getValueProp(){ return valueProp; }

	private HIMapping mapping;
	/**
/** * description: Mapping options for the audio parameters. All parameters can be either: - A string, referencing a point property to map to. - A number, setting the value of the audio parameter directly. - A callback function, returning the value programmatically. - An object defining detailed configuration of the mapping. If a function is used, it should return the desired value for the audio parameter. The function is called for each audio event to be played, and receives a context object parameter with `time`, and potentially `point` and `value` depending on the track. `point` is available if the audio event is related to a data point, and `value` is available if the track is used for a context track using `valueInterval`. * demo: * [Overview of common mapping parameters](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/mapping-overview) * [Various types of mapping used](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/pitch-mapping) * [Inverted mapping to property](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/polarity-invert) * [Logarithmic mapping to property](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/log-mapping) 
*/
	public void setMapping(HIMapping mapping) {
		this.mapping = mapping;
		this.mapping.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMapping getMapping(){ return mapping; }

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

	private String type;
	/**
 Type of track. Always `"instrument"` for instrument tracks, and `"speech"` for speech tracks. 
 <br><br><b>defaults:</b><br><br>&ensp;instrument	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private Boolean roundToMusicalNotes;
	/**
 Round pitch mapping to musical notes. If `false`, will play the exact mapped note, even if it is out of tune compared to the musical notes as defined by 440Hz standard tuning. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setRoundToMusicalNotes(Boolean roundToMusicalNotes) {
		this.roundToMusicalNotes = roundToMusicalNotes;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getRoundToMusicalNotes(){ return roundToMusicalNotes; }

	private HIPointGrouping pointGrouping;
	/**
 Options for point grouping, specifically for instrument tracks. 
	*/
	public void setPointGrouping(HIPointGrouping pointGrouping) {
		this.pointGrouping = pointGrouping;
		this.pointGrouping.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPointGrouping getPointGrouping(){ return pointGrouping; }

	private HISynthPatchOptionsObject instrument;
	/**
 Instrument to use for playing. Can either be a string referencing a synth preset, or it can be a synth configuration object. 
 <br><br><b>defaults:</b><br><br>&ensp;piano	*/
	public void setInstrument(HISynthPatchOptionsObject instrument) {
		this.instrument = instrument;
		this.setChanged();
		this.notifyObservers();
	}

	public HISynthPatchOptionsObject getInstrument(){ return instrument; }

	private HIFunction activeWhen;
	/**
 Define a condition for when a track should be active and not. Can either be a function callback or a configuration object. If a function is used, it should return a `boolean` for whether or not the track should be active. The function is called for each audio event, and receives a parameter object with `time`, and potentially `point` and `value` properties depending on the track. `point` is available if the audio event is related to a data point. `value` is available if the track is used as a context track, and `valueInterval` is used. 
	*/
	public void setActiveWhen(HIFunction activeWhen) {
		this.activeWhen = activeWhen;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getActiveWhen(){ return activeWhen; }

	private String midiName;
	/**
 Name to use for a track when exporting to MIDI. By defaults it uses the series name if the track is related to a series. 
	*/
	public void setMidiName(String midiName) {
		this.midiName = midiName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMidiName(){ return midiName; }



	public HIContextTracks() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.timeInterval != null) {
			params.put("timeInterval", this.timeInterval);
		}
		if (this.valueInterval != null) {
			params.put("valueInterval", this.valueInterval);
		}
		if (this.valueMapFunction != null) {
			params.put("valueMapFunction", this.valueMapFunction);
		}
		if (this.valueProp != null) {
			params.put("valueProp", this.valueProp);
		}
		if (this.mapping != null) {
			params.put("mapping", this.mapping.getParams());
		}
		if (this.showPlayMarker != null) {
			params.put("showPlayMarker", this.showPlayMarker);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.roundToMusicalNotes != null) {
			params.put("roundToMusicalNotes", this.roundToMusicalNotes);
		}
		if (this.pointGrouping != null) {
			params.put("pointGrouping", this.pointGrouping.getParams());
		}
		if (this.instrument != null) {
			params.put("instrument", this.instrument.getParams());
		}
		if (this.activeWhen != null) {
			params.put("activeWhen", this.activeWhen);
		}
		if (this.midiName != null) {
			params.put("midiName", this.midiName);
		}
		return params;
	}

}