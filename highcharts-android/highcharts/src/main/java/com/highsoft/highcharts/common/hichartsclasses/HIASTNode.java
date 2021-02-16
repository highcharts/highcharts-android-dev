/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.ArrayList;
import java.util.HashMap;



public class HIASTNode extends HIFoundation { 

	private ArrayList children;
	public void setChildren(ArrayList children) {
		this.children = children;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getChildren(){ return children; }

	private String tagName;
	public void setTagName(String tagName) {
		this.tagName = tagName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTagName(){ return tagName; }

	private String textContent;
	public void setTextContent(String textContent) {
		this.textContent = textContent;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextContent(){ return textContent; }



	public HIASTNode() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.children != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.children) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("children", array);
		}
		if (this.tagName != null) {
			params.put("tagName", this.tagName);
		}
		if (this.textContent != null) {
			params.put("textContent", this.textContent);
		}
		return params;
	}

}