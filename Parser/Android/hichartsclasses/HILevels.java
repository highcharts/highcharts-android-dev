/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;
import com.highsoft.highcharts.common.HIColor;





public class HILevels extends Observable implements HIChartsJSONSerializable { 

	private HIColor borderColor;
/**
/** Can set a borderColor on all points which lies on the same level. 
*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private HIColorVariation colorVariation;
/**
/** Can set a colorVariation on all points which lies on the same level. 
*/
	public void setColorVariation(HIColorVariation colorVariation) {
		this.colorVariation = colorVariation;
		this.colorVariation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIColorVariation getColorVariation(){ return colorVariation; }

	private Object levelSize;
/**
/** Can set a levelSize on all points which lies on the same level. 
*/
	public void setLevelSize(Object levelSize) {
		this.levelSize = levelSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getLevelSize(){ return levelSize; }

	private String borderDashStyle;
/**
/** Can set a borderDashStyle on all points which lies on the same level. 
*/
	public void setBorderDashStyle(String borderDashStyle) {
		this.borderDashStyle = borderDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderDashStyle(){ return borderDashStyle; }

	private HIColor color;
/**
/** Can set a color on all points which lies on the same level. 
*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Object dataLabels;
/**
/** Can set dataLabels on all points which lies on the same level. 
*/
	public void setDataLabels(Object dataLabels) {
		this.dataLabels = dataLabels;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getDataLabels(){ return dataLabels; }

	private String rotationMode;
/**
/** Can set a rotationMode on all points which lies on the same level. 
*/
	public void setRotationMode(String rotationMode) {
		this.rotationMode = rotationMode;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRotationMode(){ return rotationMode; }

	private Number borderWidth;
/**
/** Can set a borderWidth on all points which lies on the same level. 
*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Number rotation;
/**
/** Can set a rotation on all points which lies on the same level. 
*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Number level;
/**
/** Decides which level takes effect from the options set in the levels object. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/treemap-levels/">Styling of both levels</a>
*/
	public void setLevel(Number level) {
		this.level = level;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLevel(){ return level; }

	private String layoutAlgorithm;
/**
/** Can set the layoutAlgorithm option on a specific level. <br><br><b>accepted values:</b><br><br>&ensp;["sliceAndDice", "stripes", "squarified", "strip"]
*/
	public void setLayoutAlgorithm(String layoutAlgorithm) {
		this.layoutAlgorithm = layoutAlgorithm;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutAlgorithm(){ return layoutAlgorithm; }

	private String layoutStartingDirection;
/**
/** Can set the layoutStartingDirection option on a specific level. <br><br><b>accepted values:</b><br><br>&ensp;["vertical", "horizontal"]
*/
	public void setLayoutStartingDirection(String layoutStartingDirection) {
		this.layoutStartingDirection = layoutStartingDirection;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLayoutStartingDirection(){ return layoutStartingDirection; }



	public HILevels() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.colorVariation != null) {
			params.put("colorVariation", this.colorVariation.getParams());
		}
		if (this.levelSize != null) {
			params.put("levelSize", this.levelSize);
		}
		if (this.borderDashStyle != null) {
			params.put("borderDashStyle", this.borderDashStyle);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.dataLabels != null) {
			params.put("dataLabels", this.dataLabels);
		}
		if (this.rotationMode != null) {
			params.put("rotationMode", this.rotationMode);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.level != null) {
			params.put("level", this.level);
		}
		if (this.layoutAlgorithm != null) {
			params.put("layoutAlgorithm", this.layoutAlgorithm);
		}
		if (this.layoutStartingDirection != null) {
			params.put("layoutStartingDirection", this.layoutStartingDirection);
		}
		return params;
	}

}