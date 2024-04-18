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



public class HIMapping extends HIFoundation { 

	private String text;
	/**
 Text mapping for speech tracks. 
	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private HIRate rate;
	/**
 Rate mapping for speech tracks. 
	*/
	public void setRate(HIRate rate) {
		this.rate = rate;
		this.rate.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIRate getRate(){ return rate; }

	private HIPitch pitch;
	/**
/** * description: Speech pitch (how high/low the voice is) multiplier. * demo: * [Speak values](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/speak-values) 
* defaults: 1
*/
	public void setPitch(HIPitch pitch) {
		this.pitch = pitch;
		this.pitch.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPitch getPitch(){ return pitch; }

	private HIPlayDelay playDelay;
	/**
/** * description: Milliseconds to wait before playing, comes in addition to the time determined by the `time` mapping. Can also be negative to play before the mapped time. 
*/
	public void setPlayDelay(HIPlayDelay playDelay) {
		this.playDelay = playDelay;
		this.playDelay.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPlayDelay getPlayDelay(){ return playDelay; }

	private HIVolume volume;
	/**
/** * description: Volume of the speech announcement. 
* defaults: 0.4
*/
	public void setVolume(HIVolume volume) {
		this.volume = volume;
		this.volume.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIVolume getVolume(){ return volume; }

	private HITime time;
	/**
/** * description: Time mapping determines what time each point plays. It is defined as an offset in milliseconds, where 0 means it plays immediately when the chart is sonified. By defaults time is mapped to `x`, meaning points with the lowest `x` value plays first, and points with the highest `x` value plays last. Can be set to a fixed value, a prop to map to, a function, or a mapping object. * demo: * [Play points in order of Y value](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/sonification/point-play-time) 
* defaults: "x"
*/
	public void setTime(HITime time) {
		this.time = time;
		this.time.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITime getTime(){ return time; }

	private HINoteDuration noteDuration;
	/**
 Note duration determines for how long a note plays, in milliseconds. It only affects instruments that are able to play continuous sustained notes. Examples of these instruments from the presets include `flute`, `saxophone`, `trumpet`, `sawsynth`, `wobble`, `basic1`, `basic2`, `sine`, `sineGlide`, `triangle`, `square`, `sawtooth`, `noise`, `filteredNoise`, and `wind`. Can be set to a fixed value, a prop to map to, a function, or a mapping object. 
 <br><br><b>defaults:</b><br><br>&ensp;200	*/
	public void setNoteDuration(HINoteDuration noteDuration) {
		this.noteDuration = noteDuration;
		this.noteDuration.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HINoteDuration getNoteDuration(){ return noteDuration; }

	private HITremolo tremolo;
	/**
 Mapping options for tremolo effects. Tremolo is repeated changes of volume over time. 
	*/
	public void setTremolo(HITremolo tremolo) {
		this.tremolo = tremolo;
		this.tremolo.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITremolo getTremolo(){ return tremolo; }

	private HIHighpass highpass;
	/**
 Mapping options for the highpass filter. A highpass filter lets high frequencies through, but stops low frequencies, making the sound thinner. 
	*/
	public void setHighpass(HIHighpass highpass) {
		this.highpass = highpass;
		this.highpass.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHighpass getHighpass(){ return highpass; }

	private HIFrequency frequency;
	/**
 Frequency in Hertz of notes. Overrides pitch mapping if set. 
	*/
	public void setFrequency(HIFrequency frequency) {
		this.frequency = frequency;
		this.frequency.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFrequency getFrequency(){ return frequency; }

	private HIGapBetweenNotes gapBetweenNotes;
	/**
 Gap in milliseconds between notes if pitch is mapped to an array of notes. Can be set to a fixed value, a prop to map to, a function, or a mapping object. 
 <br><br><b>defaults:</b><br><br>&ensp;100	*/
	public void setGapBetweenNotes(HIGapBetweenNotes gapBetweenNotes) {
		this.gapBetweenNotes = gapBetweenNotes;
		this.gapBetweenNotes.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIGapBetweenNotes getGapBetweenNotes(){ return gapBetweenNotes; }

	private HILowpass lowpass;
	/**
 Mapping options for the lowpass filter. A lowpass filter lets low frequencies through, but stops high frequencies, making the sound more dull. 
	*/
	public void setLowpass(HILowpass lowpass) {
		this.lowpass = lowpass;
		this.lowpass.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILowpass getLowpass(){ return lowpass; }

	private HIPan pan;
	/**
 Pan refers to the stereo panning position of the sound. It is defined from -1 (left) to 1 (right). By defaults it is mapped to `x`, making the sound move from left to right as the chart plays. Can be set to a fixed value, a prop to map to, a function, or a mapping object. 
 <br><br><b>defaults:</b><br><br>&ensp;"x"	*/
	public void setPan(HIPan pan) {
		this.pan = pan;
		this.pan.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPan getPan(){ return pan; }



	public HIMapping() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.rate != null) {
			params.put("rate", this.rate.getParams());
		}
		if (this.pitch != null) {
			params.put("pitch", this.pitch.getParams());
		}
		if (this.playDelay != null) {
			params.put("playDelay", this.playDelay.getParams());
		}
		if (this.volume != null) {
			params.put("volume", this.volume.getParams());
		}
		if (this.time != null) {
			params.put("time", this.time.getParams());
		}
		if (this.noteDuration != null) {
			params.put("noteDuration", this.noteDuration.getParams());
		}
		if (this.tremolo != null) {
			params.put("tremolo", this.tremolo.getParams());
		}
		if (this.highpass != null) {
			params.put("highpass", this.highpass.getParams());
		}
		if (this.frequency != null) {
			params.put("frequency", this.frequency.getParams());
		}
		if (this.gapBetweenNotes != null) {
			params.put("gapBetweenNotes", this.gapBetweenNotes.getParams());
		}
		if (this.lowpass != null) {
			params.put("lowpass", this.lowpass.getParams());
		}
		if (this.pan != null) {
			params.put("pan", this.pan.getParams());
		}
		return params;
	}

}