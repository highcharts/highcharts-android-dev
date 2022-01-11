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



public class HISVGRenderer extends HIFoundation { 

	private HISVGElement Element;
	/**
 A pointer to the renderer's associated Element class. The VMLRenderer will have a pointer to VMLElement here. 
	*/
	public void setElement(HISVGElement Element) {
		this.Element = Element;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getElement(){ return Element; }

	private Object box;
	/**
 The root `svg` node of the renderer. 
	*/
	public void setBox(Object box) {
		this.box = box;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getBox(){ return box; }

	private HISVGElement boxWrapper;
	/**
 The wrapper for the root `svg` node of the renderer. 
	*/
	public void setBoxWrapper(HISVGElement boxWrapper) {
		this.boxWrapper = boxWrapper;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getBoxWrapper(){ return boxWrapper; }

	private HISVGElement defs;
	/**
 A pointer to the `defs` node of the root SVG. 
	*/
	public void setDefs(HISVGElement defs) {
		this.defs = defs;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGElement getDefs(){ return defs; }

	private HashMap /* <String, String> */ escapes;
	/**
 A collection of characters mapped to HTML entities. When `useHTML` on an element is true, these entities will be rendered correctly by HTML. In the SVG pseudo-HTML, they need to be unescaped back to simple characters, so for example `<` will render as `<`. 
	*/
	public void setEscapes(HashMap /* <String, String> */ escapes) {
		this.escapes = escapes;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap /* <String, String> */ getEscapes(){ return escapes; }

	private HISymbolDictionary symbols;
	/**
 An extendable collection of functions for defining symbol paths. 
	*/
	public void setSymbols(HISymbolDictionary symbols) {
		this.symbols = symbols;
		this.setChanged();
		this.notifyObservers();
	}

	public HISymbolDictionary getSymbols(){ return symbols; }



	public HISVGRenderer() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.Element != null) {
			params.put("Element", this.Element.getParams());
		}
		if (this.box != null) {
			params.put("box", this.box);
		}
		if (this.boxWrapper != null) {
			params.put("boxWrapper", this.boxWrapper.getParams());
		}
		if (this.defs != null) {
			params.put("defs", this.defs.getParams());
		}
		if (this.escapes != null) {
			params.put("escapes", this.escapes);
		}
		if (this.symbols != null) {
			params.put("symbols", this.symbols.getParams());
		}
		return params;
	}

}