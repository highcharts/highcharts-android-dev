/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HILabel extends HIFoundation { 

	private HICSSObject style;
	/**
 CSS styles for the text label. In styled mode, the labels are styled by the .highcharts-plot-line-label class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-style/">Blue and bold label</a>
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String verticalAlign;
	/**
 Vertical alignment of the label relative to the plot line. Can be one of "top", "middle" or "bottom". <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/">Vertically centered label</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]
 <br><br><b>defaults:</b><br><br>&ensp;top	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String text;
	/**
 The text itself. A subset of HTML is supported. 
	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
	/**
 Horizontal alignment of the label. Can be one of "left", "center" or "right". <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/">Aligned to the right</a>
 <br><br><b>defaults:</b><br><br>&ensp;left	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private String textAlign;
	/**
 The text alignment for the label. While align determines where the texts anchor point is placed within the plot band, textAlign determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the align option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-textalign/">Text label in bottom position</a>
	*/
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextAlign(){ return textAlign; }

	private Number y;
	/**
 Vertical position of the text baseline relative to the alignment. Default varies by orientation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-y/">Label below the plot line</a>
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 Horizontal position relative the alignment. Default varies by orientation. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/">Aligned 10px from the right edge</a>
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number rotation;
	/**
 Rotation of the text label in degrees. Defaults to 0 for horizontal plot lines and 90 for vertical lines. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/">Slanted text</a>
	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Boolean useHTML;
	/**
 Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the labels. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private Number minFontSize;
	/**
 For area-like series, allow the font size to vary so that small areas get a smaller font size. The defaults applies this effect to area-like series but not line-like series. 
	*/
	public void setMinFontSize(Number minFontSize) {
		this.minFontSize = minFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinFontSize(){ return minFontSize; }

	private Number maxFontSize;
	/**
 For area-like series, allow the font size to vary so that small areas get a smaller font size. The defaults applies this effect to area-like series but not line-like series. 
	*/
	public void setMaxFontSize(Number maxFontSize) {
		this.maxFontSize = maxFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxFontSize(){ return maxFontSize; }

	private Boolean enabled;
	/**
 Enable the series label per series. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number connectorNeighbourDistance;
	/**
 If the label is closer than this to a neighbour graph, draw a connector. 
	*/
	public void setConnectorNeighbourDistance(Number connectorNeighbourDistance) {
		this.connectorNeighbourDistance = connectorNeighbourDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorNeighbourDistance(){ return connectorNeighbourDistance; }

	private Boolean onArea;
	/**
 Draw the label on the area of an area series. By defaults it is drawn on the area. Set it to false to draw it next to the graph instead. 
	*/
	public void setOnArea(Boolean onArea) {
		this.onArea = onArea;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOnArea(){ return onArea; }

	private List<HILabelIntersectBoxObject> boxesToAvoid;
	/**
 An array of boxes to avoid when laying out the labels. Each item has a left, right, top and bottom property. 
	*/
	public void setBoxesToAvoid(List<HILabelIntersectBoxObject> boxesToAvoid) {
		this.boxesToAvoid = boxesToAvoid;
		this.setChanged();
		this.notifyObservers();
	}

	public List<HILabelIntersectBoxObject> getBoxesToAvoid(){ return boxesToAvoid; }

	private Boolean connectorAllowed;
	/**
 Allow labels to be placed distant to the graph if necessary, and draw a connector line to the graph. Setting this option to true may decrease the performance significantly, since the algorithm with systematically search for open spaces in the whole plot area. Visually, it may also result in a more cluttered chart, though more of the series will be labeled. 
	*/
	public void setConnectorAllowed(Boolean connectorAllowed) {
		this.connectorAllowed = connectorAllowed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getConnectorAllowed(){ return connectorAllowed; }



	public HILabel() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.minFontSize != null) {
			params.put("minFontSize", this.minFontSize);
		}
		if (this.maxFontSize != null) {
			params.put("maxFontSize", this.maxFontSize);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.connectorNeighbourDistance != null) {
			params.put("connectorNeighbourDistance", this.connectorNeighbourDistance);
		}
		if (this.onArea != null) {
			params.put("onArea", this.onArea);
		}
		if (this.boxesToAvoid != null) {
			List<Object> array = new List<>();
			for (Object obj : this.boxesToAvoid) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("boxesToAvoid", array);
		}
		if (this.connectorAllowed != null) {
			params.put("connectorAllowed", this.connectorAllowed);
		}
		return params;
	}

}