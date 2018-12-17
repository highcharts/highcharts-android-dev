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





public class HISVGAttributes extends Observable implements HIChartsJSONSerializable { 

	private ArrayList /* <Number, String> */ d;
	public void setD(ArrayList /* <Number, String> */ d) {
		this.d = d;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList /* <Number, String> */ getD(){ return d; }

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

	private String rotation;
	public void setRotation(String rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRotation(){ return rotation; }

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

	private String stroke;
	public void setStroke(String stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke(){ return stroke; }

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


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.d != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.d) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("d", array);
		}
		if (this.inverted != null) {
			params.put("inverted", this.inverted);
		}
		if (this.matrix != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.matrix) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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