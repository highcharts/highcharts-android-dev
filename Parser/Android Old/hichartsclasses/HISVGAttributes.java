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



public class HISVGAttributes extends HIFoundation { 

	private String d;
	public void setD(String d) {
		this.d = d;
		this.setChanged();
		this.notifyObservers();
	}

	public String getD(){ return d; }

	private Object fill;
	public void setFill(Object fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getFill(){ return fill; }

	private Boolean inverted;
	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getInverted(){ return inverted; }

	private ArrayList<Number> matrix;
	public void setMatrix(ArrayList<Number> matrix) {
		this.matrix = matrix;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Number> getMatrix(){ return matrix; }

	private Number rotation;
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Number rotationOriginX;
	public void setRotationOriginX(Number rotationOriginX) {
		this.rotationOriginX = rotationOriginX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotationOriginX(){ return rotationOriginX; }

	private Number rotationOriginY;
	public void setRotationOriginY(Number rotationOriginY) {
		this.rotationOriginY = rotationOriginY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotationOriginY(){ return rotationOriginY; }

	private Number scaleX;
	public void setScaleX(Number scaleX) {
		this.scaleX = scaleX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScaleX(){ return scaleX; }

	private Number scaleY;
	public void setScaleY(Number scaleY) {
		this.scaleY = scaleY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getScaleY(){ return scaleY; }

	private Object stroke;
	public void setStroke(Object stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getStroke(){ return stroke; }

	private HICSSObject style;
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Number translateX;
	public void setTranslateX(Number translateX) {
		this.translateX = translateX;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTranslateX(){ return translateX; }

	private Number translateY;
	public void setTranslateY(Number translateY) {
		this.translateY = translateY;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTranslateY(){ return translateY; }

	private Number zIndex;
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZIndex(){ return zIndex; }



	public HISVGAttributes() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.d != null) {
			params.put("d", this.d);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		if (this.inverted != null) {
			params.put("inverted", this.inverted);
		}
		if (this.matrix != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.matrix) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("matrix", array);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.rotationOriginX != null) {
			params.put("rotationOriginX", this.rotationOriginX);
		}
		if (this.rotationOriginY != null) {
			params.put("rotationOriginY", this.rotationOriginY);
		}
		if (this.scaleX != null) {
			params.put("scaleX", this.scaleX);
		}
		if (this.scaleY != null) {
			params.put("scaleY", this.scaleY);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.translateX != null) {
			params.put("translateX", this.translateX);
		}
		if (this.translateY != null) {
			params.put("translateY", this.translateY);
		}
		if (this.zIndex != null) {
			params.put("zIndex", this.zIndex);
		}
		return params;
	}

}