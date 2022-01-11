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



public class HISymbolDictionary extends HIFoundation { 

	private HIFunction arc;
	public void setArc(HIFunction arc) {
		this.arc = arc;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getArc(){ return arc; }

	private HIFunction callout;
	public void setCallout(HIFunction callout) {
		this.callout = callout;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getCallout(){ return callout; }

	private HIFunction circle;
	public void setCircle(HIFunction circle) {
		this.circle = circle;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getCircle(){ return circle; }

	private HIFunction diamond;
	public void setDiamond(HIFunction diamond) {
		this.diamond = diamond;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getDiamond(){ return diamond; }

	private HIFunction square;
	public void setSquare(HIFunction square) {
		this.square = square;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSquare(){ return square; }

	private HIFunction triangle;
	public void setTriangle(HIFunction triangle) {
		this.triangle = triangle;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getTriangle(){ return triangle; }



	public HISymbolDictionary() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.arc != null) {
			params.put("arc", this.arc);
		}
		if (this.callout != null) {
			params.put("callout", this.callout);
		}
		if (this.circle != null) {
			params.put("circle", this.circle);
		}
		if (this.diamond != null) {
			params.put("diamond", this.diamond);
		}
		if (this.square != null) {
			params.put("square", this.square);
		}
		if (this.triangle != null) {
			params.put("triangle", this.triangle);
		}
		return params;
	}

}