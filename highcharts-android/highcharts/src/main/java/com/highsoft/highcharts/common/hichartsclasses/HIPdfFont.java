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



public class HIPdfFont extends HIFoundation { 

	private String normal;
	/**
 The TTF font file for normal `font-style`. If font variations like `bold` or `italic` are not defined, the `normal` font will be used for those too. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setNormal(String normal) {
		this.normal = normal;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNormal(){ return normal; }

	private String bold;
	/**
 The TTF font file for bold text. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setBold(String bold) {
		this.bold = bold;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBold(){ return bold; }

	private String italic;
	/**
 The TTF font file for italic text. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setItalic(String italic) {
		this.italic = italic;
		this.setChanged();
		this.notifyObservers();
	}

	public String getItalic(){ return italic; }

	private String bolditalic;
	/**
 The TTF font file for bold and italic text. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setBolditalic(String bolditalic) {
		this.bolditalic = bolditalic;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBolditalic(){ return bolditalic; }



	public HIPdfFont() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.normal != null) {
			params.put("normal", this.normal);
		}
		if (this.bold != null) {
			params.put("bold", this.bold);
		}
		if (this.italic != null) {
			params.put("italic", this.italic);
		}
		if (this.bolditalic != null) {
			params.put("bolditalic", this.bolditalic);
		}
		return params;
	}

}