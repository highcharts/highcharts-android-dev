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



public class HIKeyboardNavigationHandlerOptionsObject extends HIFoundation { 

	private HIFunction init;
	/**
 Function to run on initialization of module. 
	*/
	public void setInit(HIFunction init) {
		this.init = init;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getInit(){ return init; }

	private ArrayList<ArrayList<ArrayList<Number>>> keyCodeMap;
	/**
 An array containing pairs of an array of keycodes, mapped to a handler function. When the keycode is received, the handler is called with the keycode as parameter. 
	*/
	public void setKeyCodeMap(ArrayList<ArrayList<ArrayList<Number>>> keyCodeMap) {
		this.keyCodeMap = keyCodeMap;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<ArrayList<ArrayList<Number>>> getKeyCodeMap(){ return keyCodeMap; }

	private HIFunction terminate;
	/**
 Function to run before moving to next/prev module. Receives moving direction as parameter: +1 for next, -1 for previous. 
	*/
	public void setTerminate(HIFunction terminate) {
		this.terminate = terminate;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getTerminate(){ return terminate; }

	private HIFunction validate;
	/**
 Function to run to validate module. Should return false if module should not run, true otherwise. Receives chart as parameter. 
	*/
	public void setValidate(HIFunction validate) {
		this.validate = validate;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getValidate(){ return validate; }



	public HIKeyboardNavigationHandlerOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.init != null) {
			params.put("init", this.init);
		}
		if (this.keyCodeMap != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.keyCodeMap) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("keyCodeMap", array);
		}
		if (this.terminate != null) {
			params.put("terminate", this.terminate);
		}
		if (this.validate != null) {
			params.put("validate", this.validate);
		}
		return params;
	}

}