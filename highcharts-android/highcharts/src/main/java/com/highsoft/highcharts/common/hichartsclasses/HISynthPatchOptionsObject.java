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



public class HISynthPatchOptionsObject extends HIFoundation { 

	private ArrayList eq;
	/**
 Master EQ filters for the synth, affecting the overall sound. 
	*/
	public void setEq(ArrayList eq) {
		this.eq = eq;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getEq(){ return eq; }

	private ArrayList<String> masterAttackEnvelope;
	/**
 Volume envelope for the overall attack of a note - what happens to the volume when a note first plays. If the volume goes to 0 in the attack envelope, the synth will not be able to play the note continuously/ sustained, and the notes will be staccato. 
	*/
	public void setMasterAttackEnvelope(ArrayList<String> masterAttackEnvelope) {
		this.masterAttackEnvelope = masterAttackEnvelope;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getMasterAttackEnvelope(){ return masterAttackEnvelope; }

	private ArrayList<String> masterReleaseEnvelope;
	/**
 Volume envelope for the overall release of a note - what happens to the volume when a note stops playing. If the release envelope starts at a higher volume than the attack envelope ends, the volume will first rise to that volume before falling when releasing a note. If the note is released while the attack envelope is still in effect, the attack envelope is interrupted, and the release envelope plays instead. 
	*/
	public void setMasterReleaseEnvelope(ArrayList<String> masterReleaseEnvelope) {
		this.masterReleaseEnvelope = masterReleaseEnvelope;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getMasterReleaseEnvelope(){ return masterReleaseEnvelope; }

	private Number masterVolume;
	/**
 Global volume modifier for the synth. Defaults to 1. Note that if the total volume of all oscillators is too high, the browser's audio engine can distort. 
	*/
	public void setMasterVolume(Number masterVolume) {
		this.masterVolume = masterVolume;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMasterVolume(){ return masterVolume; }

	private Number midiInstrument;
	/**
 MIDI instrument ID for the synth. Used with MIDI export of Timelines to have tracks open with a similar instrument loaded when imported into other applications. Defaults to 1, "Acoustic Grand Piano". 
	*/
	public void setMidiInstrument(Number midiInstrument) {
		this.midiInstrument = midiInstrument;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMidiInstrument(){ return midiInstrument; }

	private Number noteGlideDuration;
	/**
 Time in milliseconds to glide between notes. Causes a glissando effect. 
	*/
	public void setNoteGlideDuration(Number noteGlideDuration) {
		this.noteGlideDuration = noteGlideDuration;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getNoteGlideDuration(){ return noteGlideDuration; }

	private ArrayList oscillators;
	/**
 Array of oscillators to add to the synth. 
	*/
	public void setOscillators(ArrayList oscillators) {
		this.oscillators = oscillators;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getOscillators(){ return oscillators; }



	public HISynthPatchOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.eq != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.eq) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("eq", array);
		}
		if (this.masterAttackEnvelope != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.masterAttackEnvelope) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("masterAttackEnvelope", array);
		}
		if (this.masterReleaseEnvelope != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.masterReleaseEnvelope) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("masterReleaseEnvelope", array);
		}
		if (this.masterVolume != null) {
			params.put("masterVolume", this.masterVolume);
		}
		if (this.midiInstrument != null) {
			params.put("midiInstrument", this.midiInstrument);
		}
		if (this.noteGlideDuration != null) {
			params.put("noteGlideDuration", this.noteGlideDuration);
		}
		if (this.oscillators != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.oscillators) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("oscillators", array);
		}
		return params;
	}

}